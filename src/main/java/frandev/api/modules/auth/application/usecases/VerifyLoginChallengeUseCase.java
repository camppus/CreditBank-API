package frandev.api.modules.auth.application.usecases;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.modules.auth.application.dto.in.AuthChallengeDto;
import frandev.api.modules.auth.application.dto.in.DeviceMetadataDto;
import frandev.api.modules.auth.application.dto.out.AuthedData;
import frandev.api.modules.auth.application.exceptions.UserInactiveError;
import frandev.api.modules.auth.entities.*;
import frandev.api.modules.auth.repositories.ChallangeRepository;
import frandev.api.modules.auth.repositories.DeviceRepository;
import frandev.api.modules.auth.services.CreateSessionService;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.ports.UseCase;
import org.springframework.stereotype.Service;


@Service
public class VerifyLoginChallengeUseCase implements UseCase<AuthChallengeDto, AuthedData> {

    private final ChallangeRepository challangeRepository;
    private final DeviceRepository deviceRepository;
    private  final HasherService hasherService;
    private final FindUserUseCase findUserUseCase;
    private  final  CreateSessionService  createSessionService;

    public VerifyLoginChallengeUseCase(
            CreateSessionService createSessionService, ChallangeRepository challangeRepository,
            DeviceRepository deviceRepository, HasherService hasherService,
            FindUserUseCase findUserUseCase)
    {

        this.challangeRepository = challangeRepository;
        this.deviceRepository = deviceRepository;
        this.hasherService = hasherService;
        this.findUserUseCase = findUserUseCase;
        this.createSessionService = createSessionService;
    }


    @Override
    public AppResponse<AuthedData> execute(AuthChallengeDto authChallengeDto) throws Exception {

        final DeviceMetadataDto deviceMetadataDto = authChallengeDto.device();
        final Challenge challenge = this.challangeRepository
                .findById(authChallengeDto.challengeId())
                .orElseThrow(()-> new IllegalArgumentException("Challenge not found"));

        challenge.ensureCanAttempt();
        challenge.increaseAttempts();
        this.challangeRepository.save(challenge);

        if(challenge.getContext() != ChallangeContext.LOGIN_NEW_DEVICE){
            throw  new IllegalArgumentException("Invalid challenge context");
        }

        UserDevice userDevice = this.deviceRepository.findUserDeviceById(challenge
                .getUserDeviceId())
                .orElseThrow(()-> new IllegalArgumentException("User Device not found"));

        AuthData userData = this.findUserUseCase.executeById(userDevice.getUserId());

        if(!userData.active()){
            throw  new UserInactiveError();
        }

        Device device = this.deviceRepository
                .findByDeviceId(userDevice.getDeviceId())
                .orElseThrow(()-> new IllegalArgumentException("Device not found"));

        boolean isSameCode = this.hasherService.matches(authChallengeDto.otp(), challenge.getHash());
        if(!isSameCode) {
            throw  new IllegalAccessException("OTP verification failed");
        }
        device.updateMetadata(
                deviceMetadataDto.name(),
                deviceMetadataDto.model(),
                deviceMetadataDto.operatingSystem(),
                deviceMetadataDto.osVersion(),
                deviceMetadataDto.appVersion(),
                deviceMetadataDto.platform(),
                deviceMetadataDto.locale(),
                deviceMetadataDto.timezone()
        );
        this.deviceRepository.saveDevice(device);
        userDevice.updateIpAddress(authChallengeDto.ip());
        userDevice.activate();
        challenge.use();
        this.challangeRepository.save(challenge);
        this.deviceRepository.saveUserDevice(userDevice);
        return createSessionService.execute(
                userData,
                userDevice.getId(),
                device.getId(),
                authChallengeDto.ip()
        );

    }
}
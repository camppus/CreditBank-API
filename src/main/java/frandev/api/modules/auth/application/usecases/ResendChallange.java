package frandev.api.modules.auth.application.usecases;

import frandev.api.modules.auth.application.dto.in.ResendChallangeDto;
import frandev.api.modules.auth.application.dto.out.AuthedData;
import frandev.api.modules.auth.application.exceptions.UserInactiveError;
import frandev.api.modules.auth.entities.*;
import frandev.api.modules.auth.repositories.ChallangeRepository;
import frandev.api.modules.auth.repositories.DeviceRepository;
import frandev.api.modules.auth.services.SendChallenge;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.ports.UseCase;
import org.springframework.stereotype.Service;
import java.util.UUID;


@Service
public class ResendChallange implements UseCase<ResendChallangeDto, AuthedData> {

    private final ChallangeRepository challangeRepository;
    private final DeviceRepository deviceRepository;
    private final FindUserUseCase findUserUseCase;
    private final SendChallenge sendLoginChallenge;

    public ResendChallange(
            ChallangeRepository challangeRepository, DeviceRepository deviceRepository,
            FindUserUseCase findUserUseCase, SendChallenge sendLoginChallenge
    )
    {
        this.challangeRepository = challangeRepository;
        this.deviceRepository = deviceRepository;
        this.findUserUseCase = findUserUseCase;
        this.sendLoginChallenge = sendLoginChallenge;
    }

    @Override
    public AppResponse<AuthedData> execute(ResendChallangeDto resendChallangeDto) throws Exception {

        final Challenge challenge = this.challangeRepository
                .findById(resendChallangeDto.challengeId())
                .orElseThrow(()-> new IllegalArgumentException("Challenge not found"));
        UserDevice userDevice = this.deviceRepository
                .findUserDeviceById(challenge.getUserDeviceId())
                .orElseThrow(()-> new IllegalArgumentException("User Device not found"));

        AuthData userData = this.findUserUseCase.executeById(userDevice.getUserId());

        UUID challengeId  = challenge.getId();
        if(!userData.active()){
            throw  new UserInactiveError();
        }

        String userUnique = challenge.getChannel() == ChallengeChannel.EMAIL ? userData.email().getValue() : userData.phone().getValue();

        if(challenge.isExpired()){
            challengeId = sendLoginChallenge.execute(
                    userData.id(),
                    userDevice.getId(),
                    challenge.getChannel(),
                    challenge.getContext(),
                    userUnique
            );
        }else if(challenge.isResendAllowed()){
            this.sendLoginChallenge.resend(challenge , userUnique);
        }else{
            throw new IllegalStateException(
                    "Agurade um pouco para poder reenviar"
            );
        }

        return new AppResponse<AuthedData>(
                new AuthedData(
                        userData.id(),
                        null,
                        null,
                        null,
                        challengeId
                ),
                true,
                "OTP resend sucessly",
                200

        );
    }
}
package frandev.api.modules.auth.application.usecases;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.modules.auth.application.dto.in.RecoveryPasswordDto;
import frandev.api.modules.auth.application.exceptions.UserInactiveError;
import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.ChallangeContext;
import frandev.api.modules.auth.entities.Challenge;
import frandev.api.modules.auth.repositories.ChallangeRepository;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.entities.Hash;
import frandev.api.shared.entities.Password;
import frandev.api.shared.ports.UseCase;
import org.springframework.stereotype.Service;

@Service
public class RecoveryPasswordUsecase implements UseCase<RecoveryPasswordDto, AppResponse> {

    private final ChallangeRepository challangeRepository;
    private  final HasherService hasherService;
    private final FindUserUseCase findUserUseCase;

    public RecoveryPasswordUsecase( ChallangeRepository challangeRepository,HasherService hasherService, FindUserUseCase findUserUseCase){

        this.challangeRepository = challangeRepository;
        this.hasherService = hasherService;
        this.findUserUseCase = findUserUseCase;
    }


    @Override
    public AppResponse execute(RecoveryPasswordDto recoveryPasswordDto) throws Exception {

        final Challenge challenge = this.challangeRepository
                .findById(recoveryPasswordDto.challangeId())
                .orElseThrow(()-> new IllegalArgumentException("Challenge not found"));

        challenge.ensureCanAttempt();
        challenge.increaseAttempts();
        this.challangeRepository.save(challenge);

        if(challenge.getContext() != ChallangeContext.PASSWORD_RESET){
            throw  new IllegalArgumentException("Invalid challenge context");
        }

        AuthData userData = this.findUserUseCase.executeById(challenge.getUserId());
        if(!userData.active()){
            throw  new UserInactiveError();
        }
        boolean isSameCode = this.hasherService.matches(recoveryPasswordDto.otp(), challenge.getHash());
        if(!isSameCode) {
            throw  new IllegalAccessException("OTP verification failed");
        }


        Password password = new Password(recoveryPasswordDto.password());
        Hash passwordHash = this.hasherService.hash(password.getValue());

        // atualizar password aqui
        // authRepository.updatePassword(userData.id(), passwordHash);

        challenge.use();
        this.challangeRepository.save(challenge);

        return new AppResponse<>(
                challenge.getId(),
                true,
                "Password reset  successfully",
                200
        );
    }
}
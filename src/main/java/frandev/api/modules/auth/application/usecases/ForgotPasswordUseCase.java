package frandev.api.modules.auth.application.usecases;

import frandev.api.modules.auth.application.dto.in.ForgotPasswordDto;
import frandev.api.modules.auth.application.exceptions.UserInactiveError;
import frandev.api.modules.auth.application.ports.LoginIdentity;
import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.ChallangeContext;
import frandev.api.modules.auth.services.SendChallenge;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.ports.UseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class ForgotPasswordUseCase implements UseCase<ForgotPasswordDto, AppResponse> {

    private final FindUserUseCase findUserUseCase;
    private final SendChallenge sendChallenge;

    public ForgotPasswordUseCase(
            FindUserUseCase findUserUseCase,
            SendChallenge sendChallenge
    ) {
        this.findUserUseCase = findUserUseCase;
        this.sendChallenge = sendChallenge;
    }

    @Override
    public AppResponse execute(ForgotPasswordDto dto) throws Exception {

        final LoginIdentity loginIdentity =
                findUserUseCase.execute(dto.unique());

        final AuthData userData =
                loginIdentity.authData();

        if (!userData.active()) {
            throw new UserInactiveError();
        }

        final UUID challengeId = sendChallenge.execute(
                userData.id(),
                null,
                loginIdentity.channel(),
                ChallangeContext.PASSWORD_RESET,
                dto.unique()
        );

        return new AppResponse<>(
                challengeId,
                true,
                "Password reset challenge sent successfully",
                200
        );
    }
}
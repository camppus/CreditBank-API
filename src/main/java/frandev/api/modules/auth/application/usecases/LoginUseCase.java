package frandev.api.modules.auth.application.usecases;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.modules.auth.application.dto.in.LoginDto;
import frandev.api.modules.auth.application.dto.out.AuthedData;
import frandev.api.modules.auth.application.exceptions.InvalidCredentials;
import frandev.api.modules.auth.application.exceptions.UserInactiveError;
import frandev.api.modules.auth.application.ports.LoginIdentity;
import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.ChallangeContext;
import frandev.api.modules.auth.services.CreateSessionService;
import frandev.api.modules.auth.services.DeviceResolveService;
import frandev.api.modules.auth.services.SendChallenge;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.entities.Hash;
import frandev.api.shared.ports.UseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginUseCase implements UseCase<LoginDto, AuthedData> {

    private final DeviceResolveService deviceResolveService;
    private final FindUserUseCase findUserUseCase;
    private final SendChallenge sendLoginChallenge;
    private final CreateSessionService createSessionService;
    private final HasherService hasherService;

    public LoginUseCase(
            HasherService hasherService,
            FindUserUseCase findUserUseCase,
            DeviceResolveService deviceResolveService,
            SendChallenge sendLoginChallenge,
            CreateSessionService createSessionService
    ) {
        this.hasherService = hasherService;
        this.findUserUseCase = findUserUseCase;
        this.deviceResolveService = deviceResolveService;
        this.sendLoginChallenge = sendLoginChallenge;
        this.createSessionService = createSessionService;
    }

    @Override
    public AppResponse<AuthedData> execute(LoginDto loginDto) throws Exception {

        final String userUnique = loginDto.unique();

        final LoginIdentity loginIdentity =
                findUserUseCase.execute(userUnique);

        final AuthData userData =
                loginIdentity.authData();

        if(!userData.active()){
            throw new UserInactiveError();
        }

        validatePassword(
                loginDto.password(),
                userData.passwordHash()
        );

        final DeviceResolveService.UserDeviceResult deviceResult =
                deviceResolveService.execute(
                        userData.id(),
                        loginDto.ip(),
                        loginDto.deviceId()
                );

        if (deviceResult.requiresChallenge()) {

            UUID challangeId = sendLoginChallenge.execute(
                    userData.id(),
                    deviceResult.userDeviceId(),
                    loginIdentity.channel(),
                    ChallangeContext.LOGIN_NEW_DEVICE,
                    userUnique
            );

            final AppResponse<AuthedData> response = new AppResponse<AuthedData>(
                    new AuthedData(
                            userData.id(),
                            null,
                            null,
                            null,
                            challangeId
                    ),
                    true,
                    "Challenge sent successfully",
                    200
            );

            return response;
        }

        return createSessionService.execute(
                userData,
                deviceResult.userDeviceId(),
                loginDto.deviceId(),
                loginDto.ip()
        );
    }

    private void validatePassword(
            String password,
            Hash passwordHash
    ) {

        final boolean matches =
                hasherService.matches(password, passwordHash);

        if (!matches) {
            throw new InvalidCredentials();
        }
    }

}
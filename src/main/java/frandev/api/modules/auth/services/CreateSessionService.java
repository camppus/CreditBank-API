package frandev.api.modules.auth.services;

import frandev.api.infra.security.jwt.JwtService;
import frandev.api.modules.auth.application.constants.AuthConsts;
import frandev.api.modules.auth.application.dto.in.LoginDto;
import frandev.api.modules.auth.application.dto.out.AuthedData;
import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.Session;
import frandev.api.modules.auth.entities.SessionStatus;
import frandev.api.modules.auth.repositories.SessionRepository;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.entities.IpAddress;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Component
public class CreateSessionService {

    private final JwtService jwtService;
    private final GenerateRefreshHash generateRefreshHash;
    private final SessionRepository sessionRepository;

    public CreateSessionService(JwtService jwtService, GenerateRefreshHash generateRefreshHash, SessionRepository sessionRepository) {
        this.jwtService = jwtService;
        this.generateRefreshHash = generateRefreshHash;
        this.sessionRepository = sessionRepository;
    }


    public AppResponse<AuthedData> execute(
            AuthData userData,
            UUID userDeviceId,
            UUID deviceId,
            IpAddress ip

    ) {

        GenerateRefreshHash.GeneratedRefreshToken refresh =
                generateRefreshHash.generate();

        Instant now = Instant.now();

        Instant sessionExpiresAt = now.plus(
                Duration.ofDays(
                        AuthConsts.REFRESH_TOKEN_EXPIRATION_DAYS
                )
        );

        Session session = new Session(
                UUID.randomUUID(),
                userData.id(),
                userDeviceId,
                refresh.hash(),
                SessionStatus.ACTIVE,
                sessionExpiresAt,
                null,
                ip,
                now,
                now
        );

        sessionRepository.save(session);

        Instant accessTokenExpiresAt = now.plus(
                Duration.ofMinutes(
                        AuthConsts.SESSION_EXPIRATION_MINUTES
                )
        );

        String token = jwtService.sign(
                session.getUserId(),
                userData.id(),
                deviceId,
                userDeviceId,
                accessTokenExpiresAt
        );

        AuthedData data = new AuthedData(
                userData.id(),
                refresh.token(),
                token,
                accessTokenExpiresAt,
                null
        );

        return AppResponse.sucess(
                "Login successfully",
                data
        );
    }
}
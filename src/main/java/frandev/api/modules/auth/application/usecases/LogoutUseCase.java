package frandev.api.modules.auth.application.usecases;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.infra.security.jwt.JwtService;
import frandev.api.modules.auth.application.dto.in.LogOutDto;
import frandev.api.modules.auth.entities.Session;
import frandev.api.modules.auth.repositories.SessionRepository;
import frandev.api.modules.auth.services.LogOutService;
import frandev.api.shared.entities.AppResponse;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class LogoutUseCase {
    private  final LogOutService logOutService;
    private final SessionRepository sessionRepository;
    private  final JwtService  jwtService;
    private final HasherService  hasherService;

    public LogoutUseCase(
            LogOutService logOutService,SessionRepository sessionRepository,
            JwtService jwtService, HasherService hasherService)
    {
        this.logOutService = logOutService;
        this.sessionRepository = sessionRepository;
        this.jwtService = jwtService;
        this.hasherService = hasherService;
    }


    public AppResponse single(LogOutDto logOutDto) throws Exception {
        final Session currentSession = getCurrentSession(logOutDto);
        this.logOutService.logout(currentSession.getId());
        return AppResponse.message("Logout successful");
    }

    public AppResponse logoutOtherDevices(LogOutDto logOutDto) throws Exception {
        final Session currentSession = getCurrentSession(logOutDto);
        final List<Session> userSessions = this.sessionRepository
                .findAllActiveUserSessionsExcept(currentSession.getUserId() , currentSession.getId());
        for(final Session session : userSessions){
            this.logOutService.logout(session.getId());
        }

        return AppResponse.message("Logout successful");
    }

    private Session getCurrentSession(LogOutDto dto) throws Exception {

        final var tokenData = jwtService.verify(dto.acessTOken());

        final UUID userId =
                tokenData.get("userId", UUID.class);

        final UUID sessionId =
                UUID.fromString(tokenData.getId());

        final Session session = sessionRepository
                .findById(sessionId)
                .orElseThrow(() -> new Exception("Session not found"));

        if (!session.belongsTo(userId)) {
            throw new Exception("Session does not belong to user");
        }

        if (!session.isActive()) {
            throw new Exception("Session is not active");
        }

        if (!hasherService.matches(
                dto.refreshToken(),
                session.getTokenHash()
        )) {
            throw new Exception("Invalid refresh token");
        }

        return session;
    }
}
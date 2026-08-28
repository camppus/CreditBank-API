package frandev.api.modules.auth.repositories;

import frandev.api.modules.auth.application.dto.out.CurrentSessionDto;
import frandev.api.modules.auth.entities.Session;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SessionRepository {
    public void save(Session session);
    public Optional<Session> findById(UUID id);
    public  List<Session> findAllActiveUserSessions(UUID userId);
    public  List<Session> findAllActiveUserSessionsExcept(UUID userId , UUID exceptId);
    public  Optional<Session> findByRefreshToken(String refreshToken);
    List<CurrentSessionDto> findAllActiveSessionsWithDevice(UUID userId);
}
package frandev.api.modules.auth.repositories;

import frandev.api.modules.auth.entities.Session;
import java.util.Optional;
import java.util.UUID;

public interface SessionRepository {
    public void save(Session session);
    public Optional<Session> findById(UUID id);
}
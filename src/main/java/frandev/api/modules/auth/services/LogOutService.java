package frandev.api.modules.auth.services;

import frandev.api.infra.cache.CacheProvider;
import frandev.api.modules.auth.application.constants.AuthConsts;
import frandev.api.modules.auth.application.ports.SessionCached;
import frandev.api.modules.auth.entities.Session;
import frandev.api.modules.auth.repositories.SessionRepository;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.UUID;

@Component
public class LogOutService {
    private  final SessionRepository sessionRepository;
    private final CacheProvider  cacheProvider;

    public LogOutService(SessionRepository sessionRepository, CacheProvider cacheProvider) {
        this.sessionRepository = sessionRepository;
        this.cacheProvider = cacheProvider;
    }


    public  void logout(UUID sessionId ) {
        Optional<Session> optionalSession = this.sessionRepository.findById(sessionId);
        if (optionalSession.isPresent()) {
            Session session = optionalSession.get();
            String sessionKey = AuthConsts.sessionKey(session.getId());
            Optional<SessionCached> cached = this.cacheProvider.get(sessionKey, SessionCached.class);
            session.revoke();
            this.sessionRepository.save(session);
            if (cached.isPresent()) {
                this.cacheProvider.delete(sessionKey);
            }

        }
    }
}
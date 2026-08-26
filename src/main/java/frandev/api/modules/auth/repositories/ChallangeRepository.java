package frandev.api.modules.auth.repositories;

import frandev.api.modules.auth.entities.Challenge;
import java.util.Optional;
import java.util.UUID;

public interface ChallangeRepository {
    public void save(Challenge challenge);
    public Optional<Challenge> findByHashCode(String hashCode);
}
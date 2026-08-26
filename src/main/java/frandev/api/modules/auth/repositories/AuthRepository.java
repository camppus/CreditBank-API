package frandev.api.modules.auth.repositories;

import frandev.api.modules.auth.entities.AuthData;
import frandev.api.shared.entities.Email;
import frandev.api.shared.entities.Phone;

import java.util.Optional;

public interface AuthRepository {
    public Optional<AuthData> findUserByEmail(Email email);
    public Optional<AuthData> findUserByPhone(Phone phone);
}
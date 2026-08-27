package frandev.api.modules.auth.application.usecases;

import frandev.api.modules.auth.application.exceptions.InvalidCredentials;
import frandev.api.modules.auth.application.ports.LoginIdentity;
import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.ChallengeChannel;
import frandev.api.modules.auth.repositories.AuthRepository;
import frandev.api.shared.entities.Email;
import frandev.api.shared.entities.Phone;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class FindUserUseCase {
    private final AuthRepository authRepository;

    public LoginIdentity execute(String unique) throws Exception {

        if (Phone.isPhone(unique)) {
            Phone phone = new Phone(unique);
            AuthData user = authRepository
                    .findUserByPhone(phone)
                    .orElseThrow(InvalidCredentials::new);

            return  new LoginIdentity(
                    user,
                    ChallengeChannel.SMS
            );
        }

        if (Email.isEmail(unique)) {
            Email email = new Email(unique);
            AuthData user = authRepository
                    .findUserByEmail(email)
                    .orElseThrow(InvalidCredentials::new);

            return new LoginIdentity(
                    user,
                    ChallengeChannel.EMAIL
            );
        }
        throw new IllegalArgumentException(
                "Precisas informar um email ou número de telefone válido"
        );
    }
    public AuthData executeById(UUID id) throws Exception {

        return this.authRepository
                .findUserById(id)
                .orElseThrow(()-> new IllegalArgumentException("User not found"));
    }
}
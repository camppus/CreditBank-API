package frandev.api.infra.security.encript;
import frandev.api.shared.entities.Hash;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BCryptHasherService implements HasherService {

    private final BCryptPasswordEncoder encoder;

    public BCryptHasherService() {
        this.encoder = new BCryptPasswordEncoder();
    }

    @Override
    public Hash hash(String value) {
        var encode = encoder.encode(value);
        return new Hash(encode);
    }

    @Override
    public boolean matches(String value, Hash hash) {
        return encoder.matches(value, hash.getValue());
    }
}
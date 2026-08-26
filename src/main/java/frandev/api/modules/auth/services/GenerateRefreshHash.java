package frandev.api.modules.auth.services;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.shared.entities.Hash;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Base64;

@Component
public class GenerateRefreshHash {

    private final HasherService hasherService;
    private final SecureRandom secureRandom = new SecureRandom();

    public GenerateRefreshHash(HasherService hasherService) {
        this.hasherService = hasherService;
    }

    public GeneratedRefreshToken generate() {
        byte[] bytes = new byte[32];
        secureRandom.nextBytes(bytes);

        String token = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(bytes);

        Hash hash = hasherService.hash(token);

        return new GeneratedRefreshToken(
                token,
                hash
        );
    }

    public record GeneratedRefreshToken(
            String token,
            Hash hash
    ) {}
}
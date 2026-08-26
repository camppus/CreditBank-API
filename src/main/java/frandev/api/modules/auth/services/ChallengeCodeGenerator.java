package frandev.api.modules.auth.services;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class ChallengeCodeGenerator {

    private final SecureRandom random = new SecureRandom();

    public String generate() {
        return String.format(
                "%06d",
                random.nextInt(1_000_000)
        );
    }
}
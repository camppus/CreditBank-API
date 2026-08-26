package frandev.api.modules.auth.application.adpters;

import frandev.api.infra.email.EmailPayload;
import frandev.api.infra.email.EmailProvider;
import frandev.api.modules.auth.application.ports.ChallengeSenderApter;
import frandev.api.modules.auth.application.ports.SendChallangePayload;
import frandev.api.modules.auth.entities.ChallengeChannel;
import frandev.api.shared.entities.Email;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
public class EmailChallengeProviderAdapter
        implements ChallengeSenderApter {

    private final EmailProvider emailProvider;

    public EmailChallengeProviderAdapter(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    @Override
    public ChallengeChannel channel() {
        return ChallengeChannel.EMAIL;
    }

    @Override
    public boolean send(SendChallangePayload payload) {
        Instant expiresAt = payload.expiresAt();

        long minutes = Duration.between(
                Instant.now(),
                expiresAt
        ).toMinutes();

        String subject = "Código de segurança";

        String message = "O seu código de segurança é: " + payload.code()
                + ". Este código expira em " + minutes + " minutos.";

        final EmailPayload emailPayload = new EmailPayload(
                subject,
                message,
                new Email(payload.to())
        );

        return emailProvider.send(emailPayload);
    }
}
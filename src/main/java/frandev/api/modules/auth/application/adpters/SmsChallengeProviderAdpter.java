package frandev.api.modules.auth.application.adpters;

import frandev.api.infra.sms.SmsPayload;
import frandev.api.infra.sms.SmsProvider;
import frandev.api.modules.auth.application.ports.ChallengeSenderApter;
import frandev.api.modules.auth.application.ports.SendChallangePayload;
import frandev.api.modules.auth.entities.ChallengeChannel;
import frandev.api.shared.entities.Phone;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
public class SmsChallengeProviderAdpter
        implements ChallengeSenderApter {

    private final SmsProvider smsProvider;

    public SmsChallengeProviderAdpter(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    @Override
    public ChallengeChannel channel() {
        return ChallengeChannel.SMS;
    }

    @Override
    public boolean send(SendChallangePayload payload) {Instant expiresAt = payload.expiresAt();

        long minutes = Duration.between(
                Instant.now(),
                expiresAt
        ).toMinutes();

        String subject = "Código de segurança";

        String message = "O seu código de segurança é: " + payload.code()
                + ". Este código expira em " + minutes + " minutos.";

        final SmsPayload smsPayload = new SmsPayload(
                subject,
                message,
                new Phone(payload.to())
        );
        return smsProvider.send(smsPayload);
    }
}
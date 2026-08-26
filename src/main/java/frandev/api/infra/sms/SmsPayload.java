package frandev.api.infra.sms;

import frandev.api.shared.entities.Phone;

public record SmsPayload(
        String subject,
        String message,
        Phone phone
) {
}
package frandev.api.infra.email;

import frandev.api.shared.entities.Email;

public record EmailPayload(
        String subject,
        String message,
        Email email
) {
}
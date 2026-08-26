package frandev.api.modules.auth.application.ports;

import java.time.Instant;

public record SendChallangePayload(
        String to,
        String code,
        Instant expiresAt
) {
}
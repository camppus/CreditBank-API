package frandev.api.modules.auth.application.dto.out;

import frandev.api.shared.entities.Hash;

import java.time.Instant;
import java.util.UUID;

public record AuthedData(
        UUID userId,
        String refresh,
        String acessToken,
        Instant expiresAt,
        UUID challangeId
) {
}
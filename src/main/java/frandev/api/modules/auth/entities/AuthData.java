package frandev.api.modules.auth.entities;

import frandev.api.shared.entities.Email;
import frandev.api.shared.entities.Hash;
import frandev.api.shared.entities.Phone;

import java.util.UUID;

public record AuthData(
        UUID id,
        Email email,
        Phone phone,
        Hash passwordHash,
        boolean active
) {
}
package frandev.api.modules.auth.application.dto.in;

import frandev.api.shared.entities.IpAddress;

import java.util.UUID;

public record LoginDto(
        String unique,
        UUID deviceId,
        String password,
        IpAddress ip
) {
}
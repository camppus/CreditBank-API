package frandev.api.modules.auth.application.dto.in;

import frandev.api.shared.entities.IpAddress;

import java.util.UUID;

public record RecoveryPasswordDto(
        String otp,
        UUID challangeId,
        String password
) {
}
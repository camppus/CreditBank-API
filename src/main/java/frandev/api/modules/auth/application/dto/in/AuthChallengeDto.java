package frandev.api.modules.auth.application.dto.in;

import frandev.api.shared.entities.IpAddress;

import java.util.UUID;

public record AuthChallengeDto(
        UUID challengeId,
        String otp,
        DeviceMetadataDto device,
        IpAddress ip
) {
}
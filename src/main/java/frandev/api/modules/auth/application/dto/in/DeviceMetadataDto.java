package frandev.api.modules.auth.application.dto.in;

public record DeviceMetadataDto(
        String name,
        String model,
        String operatingSystem,
        String osVersion,
        String appVersion,
        String platform,
        String locale,
        String timezone
) {
}
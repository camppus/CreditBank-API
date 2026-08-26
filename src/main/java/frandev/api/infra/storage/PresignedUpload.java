package frandev.api.infra.storage;

public record PresignedUpload(
        String key,
        String url
) {
}
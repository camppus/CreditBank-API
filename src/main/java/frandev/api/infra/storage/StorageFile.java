package frandev.api.infra.storage;

import java.io.InputStream;

public record StorageFile(
        String key,
        String contentType,
        long size,
        InputStream content
) {
}
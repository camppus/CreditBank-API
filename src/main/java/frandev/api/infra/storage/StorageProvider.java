package frandev.api.infra.storage;

import java.io.InputStream;
import java.time.Duration;

public interface StorageProvider {
    PresignedUpload generateUploadUrl(
            String fileName,
            String contentType,
            long size,
            Duration expiration
    );

    StorageFile upload(
            String key,
            InputStream inputStream,
            String contentType,
            long size
    );

    String generateDownloadUrl(
            String key,
            Duration expiration
    );

    StorageFile getFile(String key);
    void delete(String key);
    boolean exists(String key);
}
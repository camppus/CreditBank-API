package frandev.api.infra.cache;

import java.time.Duration;
import java.util.Optional;

public interface CacheProvider {

    <T> void set(String key, T value);

    <T> void set(String key, T value, Duration ttl);

    <T> Optional<T> get(String key, Class<T> type);

    boolean exists(String key);

    void delete(String key);

    void clear();
}
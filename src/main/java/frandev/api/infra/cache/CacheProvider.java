package frandev.api.infra.cache;

import java.time.Duration;
import java.util.Optional;

public interface CacheProvider {

    void set(String key, Object value);
    void set(String key, Object value, Duration ttl);
    <T> Optional<T> get(String key, Class<T> type);
    boolean exists(String key);
    void delete(String key);
    void clear();
}
package frandev.api.infra.cache;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Primary
public class RedisCacheProvider implements CacheProvider {

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void set(String key, Object value, Duration ttl) {
        redisTemplate.opsForValue().set(key, value, ttl);
    }

    @Override
    public <T> Optional<T> get(String key, Class<T> type) {

        Object value = redisTemplate.opsForValue().get(key);

        if (value == null) {
            return Optional.empty();
        }

        return Optional.of(type.cast(value));
    }

    @Override
    public boolean exists(String key) {
        return Boolean.TRUE.equals(redisTemplate.hasKey(key));
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public void clear() {
        var connection = redisTemplate.getConnectionFactory().getConnection();

        try {
            connection.serverCommands().flushDb();
        } finally {
            connection.close();
        }
    }
}
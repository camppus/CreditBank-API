package frandev.api.infra.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Service
@Primary
public class JwtService {

    private final SecretKey secretKey;

    public JwtService(
            @Value("${JWT_SECRET}") String secret
    ) {
        this.secretKey = Keys.hmacShaKeyFor(
                secret.getBytes()
        );
    }

    public String sign(
            UUID sessionId,
            UUID userId,
            UUID deviceId,
            UUID userDeviceId,
            Instant expiresAt
    ) {

        Instant now = Instant.now();

        return Jwts.builder()
                .id(sessionId.toString())
                .claim("userId", userId.toString())
                .claim("deviceId", deviceId.toString())
                .claim("userDeviceId", userDeviceId.toString())
                .issuedAt(Date.from(now))
                .expiration(Date.from(expiresAt))
                .signWith(
                        secretKey,
                        Jwts.SIG.HS256
                )
                .compact();
    }

    public Claims verify(String token) {
        try {
            return Jwts.parser()
                    .verifyWith(secretKey)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        }catch (Exception e) {
            throw new JwtException("Invalid token");
        }

    }
}
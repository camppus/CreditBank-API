package frandev.api.modules.auth.entities;

import frandev.api.shared.entities.Entity;
import frandev.api.shared.entities.Hash;
import frandev.api.shared.entities.IpAddress;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Session extends Entity {

    private final UUID userId;
    private final UUID userDeviceId;
    private final Hash tokenHash;
    private final Instant expiresAt;
    private final IpAddress ipAddress;

    private SessionStatus status;
    private Instant revokedAt;

    public Session(
            UUID id,
            UUID userId,
            UUID userDeviceId,
            Hash tokenHash,
            SessionStatus status,
            Instant expiresAt,
            Instant revokedAt,
            IpAddress ipAddress,
            Instant createdAt,
            Instant updatedAt
    ) {
        super(id, createdAt, updatedAt);

        this.userId = userId;
        this.userDeviceId = userDeviceId;
        this.tokenHash = tokenHash;
        this.status = status;
        this.expiresAt = expiresAt;
        this.revokedAt = revokedAt;
        this.ipAddress = ipAddress;
    }

    public boolean belongsTo(UUID userId) {
        return this.userId.equals(userId);
    }

    public boolean belongsToDevice(UUID userDeviceId) {
        return this.userDeviceId.equals(userDeviceId);
    }

    public boolean isActive() {
        return status == SessionStatus.ACTIVE;
    }

    public boolean isExpired() {
        return Instant.now().isAfter(expiresAt);
    }

    public boolean isRevoked() {
        return status == SessionStatus.REVOKED;
    }

    public boolean canRefresh() {
        return isActive() && !isExpired();
    }

    public boolean isValid() {
        return isActive() && !isExpired();
    }

    public void revoke() {
        if (isRevoked()) {
            return;
        }

        this.status = SessionStatus.REVOKED;
        this.revokedAt = Instant.now();

        touch();
    }

    public void expire() {
        if (isExpired()) {
            this.status = SessionStatus.EXPIRED;
            touch();
        }
    }

    public void ensureValid() {
        if (isRevoked()) {
            throw new IllegalStateException("Session has been revoked");
        }

        if (isExpired()) {
            this.status = SessionStatus.EXPIRED;
            touch();

            throw new IllegalStateException("Session has expired");
        }

        if (!isActive()) {
            throw new IllegalStateException("Session is not active");
        }
    }
}
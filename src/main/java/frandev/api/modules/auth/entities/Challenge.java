package frandev.api.modules.auth.entities;

import frandev.api.shared.entities.Entity;
import frandev.api.shared.entities.Hash;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Challenge extends Entity {

    private static final int MAX_ATTEMPTS = 5;
    private final UUID userId;
    private final Hash hash;
    private final Instant expiresAt;
    private  final UUID userDeviceId;
    private boolean used;
    private int attempts;
    private final ChallangeContext context;

    public Challenge(
            UUID id,
            UUID userId,
            UUID userDeviceId,
            Hash hash,
            Instant expiresAt,
            boolean used,
            int attempts,
            ChallangeContext context,
            Instant created,
            Instant updated
    ) {
        super(id, created, updated);

        this.userId = userId;
        this.hash = hash;
        this.expiresAt = expiresAt;
        this.used = used;
        this.attempts = attempts;
        this.context = context;
        this.userDeviceId = userDeviceId;
    }

    public boolean isExpired() {
        return Instant.now().isAfter(expiresAt);
    }

    public boolean isUsed() {
        return used;
    }

    public boolean canAttempt() {
        return !used
                && !isExpired()
                && attempts < MAX_ATTEMPTS;
    }

    public boolean isValid() {
        return canAttempt();
    }

    public int remainingAttempts() {
        return Math.max(0, MAX_ATTEMPTS - attempts);
    }

    public void attempt() {
        ensureCanAttempt();

        attempts++;

        if (attempts >= MAX_ATTEMPTS) {
            used = true;
        }
    }

    public void use() {
        ensureCanAttempt();
        used = true;
        this.touch();
    }

    public void ensureCanAttempt() {
        if (used) {
            throw new IllegalStateException("Challenge already used");
        }

        if (isExpired()) {
            throw new IllegalStateException("Challenge expired");
        }

        if (attempts >= MAX_ATTEMPTS) {
            throw new IllegalStateException("Maximum attempts exceeded");
        }
    }

}
package frandev.api.modules.auth.entities;

import frandev.api.modules.auth.application.constants.AuthConsts;
import frandev.api.shared.entities.Entity;
import frandev.api.shared.entities.Hash;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Challenge extends Entity {

    private final UUID userId;
    private final UUID userDeviceId;
    private final ChallangeContext context;
    private final ChallengeChannel channel;

    private Hash hash;
    private Instant expiresAt;

    private boolean used;
    private int attempts;
    private int resendCount;
    private Instant lastResendAt;

    public Challenge(
            UUID id,
            UUID userId,
            UUID userDeviceId,
            Hash hash,
            Instant expiresAt,
            boolean used,
            int attempts,
            int resendCount,
            Instant lastResendAt,
            ChallangeContext context,
            ChallengeChannel channel,
            Instant createdAt,
            Instant updatedAt
    ) {
        super(id, createdAt, updatedAt);

        this.userId = userId;
        this.userDeviceId = userDeviceId;
        this.hash = hash;
        this.expiresAt = expiresAt;
        this.used = used;
        this.attempts = attempts;
        this.resendCount = resendCount;
        this.lastResendAt = lastResendAt;
        this.context = context;
        this.channel = channel;


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
                && attempts < AuthConsts.CHALLENGE_MAX_ATTEMPTS;
    }

    public void ensureCanAttempt() {
        if (used) {
            throw new IllegalStateException("Challenge already used");
        }

        if (isExpired()) {
            throw new IllegalStateException("Challenge expired");
        }

        if (attempts >= AuthConsts.CHALLENGE_MAX_ATTEMPTS) {
            throw new IllegalStateException("Maximum attempts exceeded");
        }
    }


    public boolean isResendAllowed() {

        if (used) {
            return false;
        }

        if (resendCount >= AuthConsts.MAX_CHALLENGE_RESENDS) {
            return false;
        }

        if (lastResendAt == null) {
            return true;
        }

        return !lastResendAt
                .plusSeconds(AuthConsts.RESEND_COOLDOWN_SECONDS)
                .isAfter(Instant.now());
    }



    public void increaseAttempts() {
        ensureCanAttempt();
        this.attempts++;

        if (this.attempts >= AuthConsts.CHALLENGE_MAX_ATTEMPTS) {
            this.used = true;
        }

        touch();
    }


    public void increaseResend() {
        if (!isResendAllowed()) {
            throw new IllegalStateException(
                    "Challenge cannot be resent"
            );
        }

        this.resendCount++;
        this.lastResendAt = Instant.now();
        touch();
    }

    public void use() {
        ensureCanAttempt();

        used = true;
        touch();
    }

    public int remainingAttempts() {
        return Math.max(
                0,
                AuthConsts.CHALLENGE_MAX_ATTEMPTS - attempts
        );
    }

    public int remainingResends() {
        return Math.max(
                0,
                AuthConsts.MAX_CHALLENGE_RESENDS - resendCount
        );
    }

    public void resend(
            Hash hash,
            Instant expiresAt
    ) {
        if (!isResendAllowed()) {
            throw new IllegalStateException(
                    "Challenge cannot be resent"
            );
        }

        this.hash = hash;
        this.expiresAt = expiresAt;
        this.resendCount++;
        this.lastResendAt = Instant.now();

        touch();
    }
}
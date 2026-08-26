package frandev.api.modules.auth.entities;

import frandev.api.shared.entities.Entity;
import frandev.api.shared.entities.IpAddress;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class UserDevice extends Entity {

    private final UUID deviceId;
    private final UUID userId;

    private DeviceStatus status;
    private IpAddress ipAddress;

    public UserDevice(
            UUID id,
            UUID deviceId,
            UUID userId,
            DeviceStatus status,
            IpAddress ipAddress,
            Instant createdAt,
            Instant updatedAt
    ) {
        super(id, createdAt, updatedAt);

        this.deviceId = deviceId;
        this.userId = userId;
        this.status = status;
        this.ipAddress = ipAddress;
    }

    public static UserDevice createPending(
            UUID deviceId,
            UUID userId,
            IpAddress ipAddress
    ) {
        Instant now = Instant.now();
        return new UserDevice(
                UUID.randomUUID(),
                deviceId,
                userId,
                DeviceStatus.PENDING,
                ipAddress,
                now,
                now
        );
    }

    public boolean belongsTo(UUID userId) {
        return this.userId.equals(userId);
    }

    public boolean isDevice(UUID deviceId) {
        return this.deviceId.equals(deviceId);
    }

    public boolean isActive() {
        return status == DeviceStatus.TRUSTED;
    }

    public boolean isBlocked() {
        return status == DeviceStatus.BLOCKED;
    }

    public boolean isRevoked() {
        return status == DeviceStatus.BLOCKED;
    }



    public void activate() {
        if (isActive()) {
            return;
        }

        this.status = DeviceStatus.TRUSTED;
        touch();
    }

    public void block() {
        if (isBlocked()) {
            return;
        }

        this.status = DeviceStatus.BLOCKED;
        touch();
    }

    public void revoke() {
        if (isRevoked()) {
            return;
        }

        this.status = DeviceStatus.BLOCKED;
        touch();
    }

    public void updateIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
        touch();
    }
}
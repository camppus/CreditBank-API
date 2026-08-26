package frandev.api.modules.auth.entities;

import frandev.api.shared.entities.Entity;
import frandev.api.shared.entities.IpAddress;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Device extends Entity {
    private final UUID ownerId;
    private String name;
    private String model;
    private String operatingSystem;
    private String osVersion;
    private String appVersion;
    private String platform;
    private String locale;
    private String timezone;

    private IpAddress lastIpAddress;
    private String userAgent;

    private Instant lastSeenAt;

    public Device(
            UUID id,
            UUID ownerId,
            String name,
            String model,
            String operatingSystem,
            String osVersion,
            String appVersion,
            String platform,
            String locale,
            String timezone,
            IpAddress lastIpAddress,
            String userAgent,
            Instant createdAt,
            Instant updatedAt,
            Instant lastSeenAt
    ) {
        super(id, createdAt, updatedAt);
        this.ownerId = ownerId;
        this.name = name;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
        this.platform = platform;
        this.locale = locale;
        this.timezone = timezone;
        this.lastIpAddress = lastIpAddress;
        this.userAgent = userAgent;
        this.lastSeenAt = lastSeenAt;
    }

    public boolean belongsTo(UUID userId) {
        return ownerId.equals(userId);
    }

    public boolean isSameDevice(UUID deviceId) {
        return this.getId().equals(deviceId);
    }

    public void markAsSeen(
            IpAddress ipAddress,
            String userAgent
    ) {
        this.lastIpAddress = ipAddress;
        this.userAgent = userAgent;
        this.lastSeenAt = Instant.now();

        touch();
    }


    public static Device createEmpty(
            UUID deviceId,
            UUID ownerId
    ) {
        Instant now = Instant.now();

        return new Device(
                deviceId,
                ownerId,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                now,
                now,
                now
        );
    }

    public void updateMetadata(
            String name,
            String model,
            String operatingSystem,
            String osVersion,
            String appVersion,
            String platform,
            String locale,
            String timezone
    ) {
        this.name = name;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
        this.platform = platform;
        this.locale = locale;
        this.timezone = timezone;

        touch();
    }

}
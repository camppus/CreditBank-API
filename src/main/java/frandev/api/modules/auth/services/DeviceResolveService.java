package frandev.api.modules.auth.services;

import frandev.api.modules.auth.entities.Device;
import frandev.api.modules.auth.entities.UserDevice;
import frandev.api.modules.auth.repositories.DeviceRepository;
import frandev.api.shared.entities.IpAddress;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Component
public class DeviceResolveService {

    private final DeviceRepository deviceRepository;

    public DeviceResolveService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public UserDeviceResult execute(
            UUID userId,
            IpAddress ip,
            UUID deviceId
    ) {

        Optional<Device> deviceOptional =
                deviceRepository.findByDeviceId(deviceId);
        if (deviceOptional.isEmpty()) {

            Device device = Device.createEmpty(
                    deviceId,
                    userId
            );

            deviceRepository.saveDevice(device);

            UserDevice userDevice = UserDevice.createPending(
                    device.getId(),
                    userId,
                    ip
            );

            deviceRepository.saveUserDevice(userDevice);

            return new UserDeviceResult(
                    userDevice.getId(),
                    true
            );
        }

        Device device = deviceOptional.get();

        List<UserDevice> userDevices =
                deviceRepository.findAllUserDevicesByUserId(userId);

        Optional<UserDevice> trustedDevice =
                userDevices.stream()
                        .filter(userDevice ->
                                userDevice.belongsTo(userId)
                                        && userDevice.isDevice(device.getId())
                                        && userDevice.isActive()
                        )
                        .findFirst();

        if (trustedDevice.isEmpty()) {
            UserDevice userDevice = UserDevice.createPending(
                    device.getId(),
                    userId,
                   ip
            );

            deviceRepository.saveUserDevice(userDevice);
            return new UserDeviceResult(
                    userDevice.getId(),
                    true
            );
        }

        trustedDevice.ifPresent(userDevice -> {
            userDevice.updateIpAddress(ip);
            this.deviceRepository.saveUserDevice(userDevice);
        });

        return new UserDeviceResult(
                trustedDevice.get().getId(),
                false
        );
    }

    public record UserDeviceResult(
            UUID userDeviceId,
            boolean requiresChallenge
    ) {
    }
}
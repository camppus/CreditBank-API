package frandev.api.modules.auth.repositories;

import frandev.api.modules.auth.application.dto.out.CurrentSessionDto;
import frandev.api.modules.auth.entities.Device;
import frandev.api.modules.auth.entities.UserDevice;
import frandev.api.shared.entities.Pageable;
import frandev.api.shared.entities.Pagination;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeviceRepository {
    public Optional<Device> findById(UUID id);
    public Optional<Device> findByDeviceId(UUID id);
    public Pageable<Device> findAll(Pagination pagination);
    public Pageable<Device> findAllByUserId(UUID userId);
    public UUID saveDevice(Device device);

    public List<UserDevice> findAllUserDevicesByUserId(UUID userId);
    public Optional<UserDevice> findUserDeviceById(UUID userId);
    public void saveUserDevice(UserDevice device);
}
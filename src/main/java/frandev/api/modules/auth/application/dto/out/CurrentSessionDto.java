package frandev.api.modules.auth.application.dto.out;

import frandev.api.modules.auth.entities.Device;
import frandev.api.modules.auth.entities.Session;
import frandev.api.modules.auth.entities.UserDevice;

public record CurrentSessionDto(
        Session session,
        Device device,
        UserDevice userDevice
) {
}
package frandev.api.modules.auth.application.ports;

import frandev.api.modules.auth.entities.AuthData;
import frandev.api.modules.auth.entities.ChallengeChannel;

public record LoginIdentity(
        AuthData authData,
        ChallengeChannel channel
) {
}
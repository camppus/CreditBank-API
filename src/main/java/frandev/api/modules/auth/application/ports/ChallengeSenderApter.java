package frandev.api.modules.auth.application.ports;

import frandev.api.modules.auth.entities.ChallengeChannel;

public interface ChallengeSenderApter {
    ChallengeChannel channel();
    boolean send(SendChallangePayload payload);
}
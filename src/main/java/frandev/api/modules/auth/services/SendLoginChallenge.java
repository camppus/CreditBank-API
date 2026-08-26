package frandev.api.modules.auth.services;

import frandev.api.infra.security.encript.HasherService;
import frandev.api.modules.auth.application.constants.AuthConsts;
import frandev.api.modules.auth.application.ports.ChallengeSenderApter;
import frandev.api.modules.auth.application.ports.SendChallangePayload;
import frandev.api.modules.auth.entities.ChallangeContext;
import frandev.api.modules.auth.entities.Challenge;
import frandev.api.modules.auth.entities.ChallengeChannel;
import frandev.api.modules.auth.repositories.ChallangeRepository;
import frandev.api.shared.entities.Hash;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Component
public class SendLoginChallenge {


    private final ChallangeRepository challangeRepository;
    private  final ChallengeCodeGenerator  challengeCodeGenerator;
    private final HasherService hasherService;
    private final List<ChallengeSenderApter> challengeSenders;
    private  final GenerateRefreshHash generateRefreshHash;
    private final Map<ChallengeChannel, ChallengeSenderApter> senderMap = new EnumMap<>(ChallengeChannel.class);

    public SendLoginChallenge(ChallangeRepository challangeRepository,
          ChallengeCodeGenerator challengeCodeGenerator,
          HasherService hasherService,
          List<ChallengeSenderApter> challengeSenders,
          GenerateRefreshHash generateRefreshHash) {

        this.challangeRepository = challangeRepository;
        this.challengeCodeGenerator = challengeCodeGenerator;
        this.hasherService = hasherService;
        this.challengeSenders = challengeSenders;
        this.generateRefreshHash = generateRefreshHash;

        for(ChallengeSenderApter challengeSender : challengeSenders) {
            this.senderMap.put(
                    challengeSender.channel(),
                    challengeSender
            );
        }
    }

    public void execute(
            UUID userId,
            UUID userDeviceId,
            ChallengeChannel channel,
            String destination
    ) throws Exception {

        String code = challengeCodeGenerator.generate();

        Hash hash = hasherService.hash(code);

        Instant now = Instant.now();

        Instant expiresAt = now.plus(
                Duration.ofMinutes(
                        AuthConsts.CHALLENGE_EXPIRATION_MINUTES
                )
        );

        Challenge challenge = new Challenge(
                UUID.randomUUID(),
                userId,
                userDeviceId,
                hash,
                expiresAt,
                false,
                0,
                ChallangeContext.LOGIN_NEW_DEVICE,
                now,
                now
        );

        challangeRepository.save(challenge);

        ChallengeSenderApter sender = senderMap.get(channel);

        if (sender == null) {
            throw new IllegalAccessException(
                    "Sender challenge not found"
            );
        }

        SendChallangePayload payload =
                new SendChallangePayload(
                        destination,
                        code,
                        expiresAt
                );

        boolean sent = sender.send(payload);

        if (!sent) {
            throw new Exception(
                    "Challenge not sent successfully"
            );
        }
    }

}
package frandev.api.modules.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class DocumentRenewalRequested {
    private final UUID id;
    private final UUID documentId;
    private final UUID currentVersionId;
    private  enum status {
        PENDING,
        IN_PROGRESS,
        COMPLETED,
        EXPIRED,
        CANCELLED
    }
    private enum reason  {
        EXPIRED,
        DAMAGED,
        INVALID,
        OUTDATED,
        COMPLIANCE
    }
    private final Instant requestedAt;
    private final Instant expiresAt;
    private Instant completedAt;
    private Instant cancelledAt;

}
package frandev.api.modules.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class DocumentVerification {
    private  final UUID id;
    private  final UUID documentVersionId;
    private  final UUID documentId;
    private  final Optional<UUID> verifiedBy;
    private  final String provider;
    private  enum  String {
        MANUAL,
        AUTO
    };
    private  enum  status  {
        VERIFIED,
        REJECTED,
        EXPIRED,
        PENDING;
    }
    private  final String verificationMethod;
    private  final Float confidenceScore;
    private  final Instant startedAt;
    private  final Instant endedAt;
    private  final Instant verifiedAt;
    private  final  String reason;
}
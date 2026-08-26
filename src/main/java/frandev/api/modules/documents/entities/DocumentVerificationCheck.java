package frandev.api.modules.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class DocumentVerificationCheck {
    private UUID id;
    private UUID documentVersionFileId;
    private CheckType type;
    private CheckStatus status;
    private BigDecimal score;
    private BigDecimal threshold;
    private String provider;
    private String providerReference;
    private String ruleCode;
    private String ruleVersion;
    private String resultCode;
    private String reason;
    private String details;
    private Boolean passed;
    private Boolean requiresManualReview;
    private Integer attempt;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
    private LocalDateTime createdAt;
    public enum CheckType {
        DOCUMENT_QUALITY,
        DOCUMENT_CLASSIFICATION,
        DOCUMENT_FORMAT,
        DOCUMENT_READABILITY,
        OCR,
        DOCUMENT_STRUCTURE,
        DOCUMENT_EXPIRATION,
        DOCUMENT_AUTHENTICITY,
        DOCUMENT_TAMPERING,
        DOCUMENT_NUMBER_VALIDATION,
        DOCUMENT_DUPLICATION
    }
    public enum CheckStatus {
        PROCESSING,
        PASSED,
        FAILED,
        MANUAL_REVIEW
    }
}
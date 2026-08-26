package frandev.api.modules.documents.infra.persistence;

import frandev.api.modules.documents.entities.DocumentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "documents")
@Getter
@Setter
@NoArgsConstructor
public class DocumentEntityJpa {

    @Id
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(name = "owner_id", nullable = false)
    private UUID ownerId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private DocumentType type;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(name = "issued_at")
    private Instant issuedAt;

    @Column(name = "issuing_country", length = 2)
    private String issuingCountry;
}
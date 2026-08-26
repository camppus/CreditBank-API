package frandev.api.modules.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class DocumentVersion {
    private  final UUID id;
    private  final UUID documentId;
    private final  Boolean isCurrent ;
    private final  DocumentStatus documentStatus;
    private  final  int filesPerVersion;
    private  final Instant createdAt;
    private  final Instant updatedAt;
    private  final  Instant replacedAt;
}
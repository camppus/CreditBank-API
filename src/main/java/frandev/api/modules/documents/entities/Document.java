package frandev.api.modules.documents.entities;

import lombok.*;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Document {
    private  UUID id;
    private  UUID ownerId;
    private  DocumentType type;
    private  String name;
    private  Instant issuedAt;
    private  String issuingCountry;
}
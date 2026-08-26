package frandev.api.modules.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class DocumentFile {
    private  final UUID id;
    private  final UUID documentId;
    private  final  UUID versionId;
    private  final  String fileName;
    private  final  MimeType mimeType;
    private  final  Float size;
    private final Date uploadDate;
    private  final Date lastModified;
    private  final String storageProvider;
    private  final String storageKey;
    private  final  boolean uploaded;
    private  final  boolean isActive;
    private  final  boolean deleted;
}
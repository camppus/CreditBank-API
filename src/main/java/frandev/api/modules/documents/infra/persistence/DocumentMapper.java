package frandev.api.modules.documents.infra.persistence;

import frandev.api.modules.documents.entities.Document;

public class DocumentMapper {
    public static  DocumentEntityJpa toJpa(Document document) {
        DocumentEntityJpa doc = new DocumentEntityJpa();
        doc.setId(document.getId());
        doc.setName(document.getName());
        doc.setIssuedAt(document.getIssuedAt());
        doc.setIssuingCountry(document.getIssuingCountry());
        doc.setType(document.getType());
        doc.setOwnerId(document.getOwnerId());
        return  doc;
    }

    public static Document toEntity(DocumentEntityJpa jpaDocument) {
        final Document doc = new Document();
        doc.setId(jpaDocument.getId());
        doc.setName(jpaDocument.getName());
        doc.setIssuedAt(jpaDocument.getIssuedAt());
        doc.setIssuingCountry(jpaDocument.getIssuingCountry());
        doc.setType(jpaDocument.getType());
        doc.setOwnerId(jpaDocument.getOwnerId());
        return doc;
    }
}
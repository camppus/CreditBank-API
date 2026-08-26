package frandev.api.modules.documents.repositories;

import frandev.api.modules.documents.entities.Document;
import frandev.api.shared.entities.Pageable;
import frandev.api.shared.ports.CrudRepository;

import java.util.UUID;

public interface DocumentRepository extends CrudRepository<Document, UUID> {
    public Pageable<Document> getByUserId(UUID userid, int page, int limit);
    public boolean checkStatus(Document document);

}
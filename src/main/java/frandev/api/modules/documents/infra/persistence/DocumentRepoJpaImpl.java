package frandev.api.modules.documents.infra.persistence;

import frandev.api.modules.documents.entities.Document;
import frandev.api.modules.documents.repositories.DocumentRepository;
import frandev.api.shared.entities.Pageable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Primary
public class DocumentRepoJpaImpl implements DocumentRepository {

    private  final DocumentJpaRepository documentJpaRepository;

    public DocumentRepoJpaImpl(DocumentJpaRepository documentJpaRepository) {
        this.documentJpaRepository = documentJpaRepository;
    }

    @Override
    public Pageable<Document> getByUserId(UUID userid, int page, int limit) {
        return null;
    }

    @Override
    public boolean checkStatus(Document document) {
        return false;
    }

    @Override
    public Document create(Document entity) {
        final DocumentEntityJpa saved = this.documentJpaRepository.save(
                DocumentMapper.toJpa(entity)
        );
        return DocumentMapper.toEntity(saved);
    }

    @Override
    public Document update(UUID uuid, Document entity) {
        return null;
    }

    @Override
    public Document getById(UUID uuid) {
        return null;
    }

    @Override
    public Pageable<Document> getAll(int page, int limit) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }
}
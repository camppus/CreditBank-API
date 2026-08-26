package frandev.api.modules.documents.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface DocumentJpaRepository
        extends JpaRepository<DocumentEntityJpa, UUID> {
}
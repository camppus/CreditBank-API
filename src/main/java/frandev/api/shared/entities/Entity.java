package frandev.api.shared.entities;

import java.time.Instant;
import java.util.UUID;

public class Entity {

    private final UUID id;
    private  Instant created;
    private  Instant updated;

    public Entity(UUID id, Instant created, Instant updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
    }

    public UUID getId() {
        return id;
    }
    public Instant getCreated() {
        return created;
    }
    public Instant getUpdated() {
        return updated;
    }

    public void touch(){
        this.updated = Instant.now();
    }
}
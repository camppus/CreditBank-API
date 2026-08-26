package frandev.api.modules.indetity.entities;

import frandev.api.shared.entities.*;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {
    private UUID  id;
    private Email email;
    private Phone phone;
    private Password password;
    private BirthDate birthDate;
    private FullName fullName;
    private Instant createdAt;
    private Instant updatedAt;
    private  Instant deletedAt;

    private  enum status {
        ACTIVE,
        INACTIVE,
        VERIFIED,
        DELETED
    }
    private enum role {
        USER,
        ADMIN,
        AGENT,
        GESTOR,
        SECURITY
    }
}
package frandev.api.infra.security.encript;

import frandev.api.shared.entities.Hash;

public interface HasherService {
    Hash hash(String value);
    boolean matches(String value, Hash hash);
}
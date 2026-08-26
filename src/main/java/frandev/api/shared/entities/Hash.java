package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

public final class Hash implements ObjectValue<String> {

    private final String value;

    public Hash(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Hash is required");
        }

        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
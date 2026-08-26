package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

public final class Nif implements ObjectValue<String> {

    private final String value;

    public Nif(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("NIF is required");
        }

        String normalized = value.trim();

        if (!normalized.matches("^\\d{10}$")) {
            throw new IllegalArgumentException("Invalid NIF");
        }

        this.value = normalized;
    }

    @Override
    public String getValue() {
        return value;
    }
}
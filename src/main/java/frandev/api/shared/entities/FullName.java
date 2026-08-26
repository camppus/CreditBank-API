package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

public final class FullName implements ObjectValue<String> {

    private final String value;

    public FullName(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Full name is required");
        }

        String normalized = value.trim().replaceAll("\\s+", " ");

        if (normalized.length() < 3) {
            throw new IllegalArgumentException("Invalid full name");
        }

        this.value = normalized;
    }

    @Override
    public String getValue() {
        return value;
    }
}
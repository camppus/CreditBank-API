package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

public final class Iban implements ObjectValue<String> {

    private final String value;

    public Iban(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("IBAN is required");
        }

        String normalized = value
                .replaceAll("\\s+", "")
                .toUpperCase();

        if (!normalized.matches("^[A-Z]{2}\\d{2}[A-Z0-9]{11,30}$")) {
            throw new IllegalArgumentException("Invalid IBAN");
        }

        this.value = normalized;
    }

    @Override
    public String getValue() {
        return value;
    }
}
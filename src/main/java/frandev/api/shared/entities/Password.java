package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

public final class Password implements ObjectValue<String> {

    private final String value;

    public Password(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Password is required");
        }

        if (value.length() < 8) {
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters"
            );
        }

        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
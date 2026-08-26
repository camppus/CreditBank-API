package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

import java.util.regex.Pattern;

public final class BI implements ObjectValue<String> {
    private static final Pattern BI_PATTERN = Pattern.compile("^\\d{9}[A-Z]{2}\\d{3}$");
    private final String value;

    public BI(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("BI is required");
        }
        String normalized = value.trim().toUpperCase();
        if (!BI_PATTERN.matcher(normalized).matches()) {
            throw new IllegalArgumentException("Invalid BI");
        }
        this.value = normalized;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
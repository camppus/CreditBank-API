package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

import java.time.LocalDate;

public final class BirthDate implements ObjectValue<LocalDate> {

    private final LocalDate value;

    public BirthDate(LocalDate value) {
        if (value == null) {
            throw new IllegalArgumentException("Birth date is required");
        }

        if (value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Birth date cannot be in the future"
            );
        }

        this.value = value;
    }

    @Override
    public LocalDate getValue() {
        return value;
    }
}
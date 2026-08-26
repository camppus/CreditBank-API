package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Money implements ObjectValue<BigDecimal> {

    private final BigDecimal value;

    public Money(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Money value is required");
        }

        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.value = value.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}
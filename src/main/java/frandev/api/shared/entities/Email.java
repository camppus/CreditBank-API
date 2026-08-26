package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;
import java.util.regex.Pattern;

public final class Email implements ObjectValue<String> {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");

    private final String email;

    public Email(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is required");
        }

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email.trim().toLowerCase();
    }

    @Override
    public String getValue() {
        return email;
    }

    public static boolean isEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
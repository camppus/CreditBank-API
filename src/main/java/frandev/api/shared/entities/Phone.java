package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

import java.util.regex.Pattern;

public final class Phone implements ObjectValue<String> {

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\+244(91|92|93|94|95|97|99)\\d{7}$");

    private final String phone;

    public Phone(String phone) {
        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone number is required");
        }

        String normalized = normalize(phone);

        if (!PHONE_PATTERN.matcher(normalized).matches()) {
            throw new IllegalArgumentException("Invalid Angolan phone number");
        }

        this.phone = normalized;
    }

    private static String normalize(String phone) {
        String value = phone.trim()
                .replaceAll("[\\s()-]", "");

        if (value.startsWith("00244")) {
            return "+" + value.substring(2);
        }

        if (value.startsWith("244")) {
            return "+" + value;
        }

        if (value.startsWith("0")) {
            return "+244" + value.substring(1);
        }

        if (value.matches("^(91|92|93|94|95|97|99)\\d{7}$")) {
            return "+244" + value;
        }

        return value;
    }

    public  static  boolean isPhone(String phone) {
        String normalized = normalize(phone);
        return PHONE_PATTERN.matcher(normalized).matches();
    }
    @Override
    public String getValue() {
        return phone;
    }
}
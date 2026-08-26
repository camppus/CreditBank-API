package frandev.api.shared.entities;

import frandev.api.shared.ports.ObjectValue;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class IpAddress implements ObjectValue<String> {

    private final String value;

    public IpAddress(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("IP address is required");
        }

        String normalized = value.trim();

        if (!isValid(normalized)) {
            throw new IllegalArgumentException("Invalid IP address");
        }

        this.value = normalized;
    }

    private static boolean isValid(String value) {
        try {
            InetAddress address = InetAddress.getByName(value);

            // Evita aceitar hostname como "localhost"
            return address.getHostAddress().equals(value);
        } catch (UnknownHostException e) {
            return false;
        }
    }

    @Override
    public String getValue() {
        return value;
    }
}
package frandev.api.modules.auth.application.exceptions;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials() {
        super("credenciais invalidas");
    }
}
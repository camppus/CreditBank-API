package frandev.api.modules.auth.application.exceptions;

public class UserInactiveError extends RuntimeException {
    public UserInactiveError() {
        super("User inactive.");
    }
}
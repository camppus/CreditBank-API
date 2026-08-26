package frandev.api.modules.auth.application.constants;

public final class AuthConsts {

    private AuthConsts() {
    }

    public static final int CHALLENGE_EXPIRATION_MINUTES = 5;
    public static final int CHALLENGE_MAX_ATTEMPTS = 5;
    public static final int CHALLENGE_CODE_LENGTH = 6;

    public static final int SESSION_EXPIRATION_MINUTES = 30;
    public static final int REFRESH_TOKEN_EXPIRATION_DAYS = 30;

    public static final int MAX_LOGIN_ATTEMPTS = 5;
    public static final int PASSWORD_MIN_LENGTH = 8;

    public static final int DEVICE_TRUST_EXPIRATION_DAYS = 30;
}
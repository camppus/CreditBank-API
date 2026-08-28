package frandev.api.modules.auth.application.dto.in;

public record LogOutDto(
        String refreshToken,
        String acessTOken
) {
}
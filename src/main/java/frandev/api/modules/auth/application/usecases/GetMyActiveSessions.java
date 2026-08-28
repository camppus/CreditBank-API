package frandev.api.modules.auth.application.usecases;

import frandev.api.modules.auth.application.dto.out.CurrentSessionDto;
import frandev.api.modules.auth.repositories.SessionRepository;
import frandev.api.shared.entities.AppResponse;
import frandev.api.shared.ports.UseCase;
import java.util.List;
import java.util.UUID;

public class GetMyActiveSessions implements UseCase<UUID, List<CurrentSessionDto>> {

    private final FindUserUseCase findUserUseCase;
    private  final SessionRepository sessionRepository;

    public GetMyActiveSessions( FindUserUseCase findUserUseCase, SessionRepository sessionRepository){
        this.findUserUseCase = findUserUseCase;
        this.sessionRepository = sessionRepository;
    }

    @Override
    public AppResponse<List<CurrentSessionDto>> execute(UUID userId) throws Exception {
        final var userData = this.findUserUseCase.executeById(userId);
        if(!userData.active()){
            throw  new Exception("User not active");
        }
        final List<CurrentSessionDto> sessionDtos = this.sessionRepository.findAllActiveSessionsWithDevice(userId);
        return new AppResponse<>(
                sessionDtos,
                true,
                "Minhas sessões activas",
                200
        );
    }
}
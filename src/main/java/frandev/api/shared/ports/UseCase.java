package frandev.api.shared.ports;

import frandev.api.shared.entities.AppResponse;

public interface UseCase <Input , Output > {
    public AppResponse<Output> execute(Input input) throws Exception;
}
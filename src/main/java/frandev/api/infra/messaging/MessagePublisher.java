package frandev.api.infra.messaging;

public interface MessagePublisher {

    void publish(
            String exchange,
            String routingKey,
            Object message
    );
}
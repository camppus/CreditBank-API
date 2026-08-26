package frandev.api.infra.messaging;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RabbitMq implements MessagePublisher {

    private final AmqpTemplate amqpTemplate;

    public RabbitMq(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Override
    public void publish(
            String exchange,
            String routingKey,
            Object message
    ) {
        amqpTemplate.convertAndSend(
                exchange,
                routingKey,
                message
        );
    }
}
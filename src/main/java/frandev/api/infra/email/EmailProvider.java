package frandev.api.infra.email;

public interface EmailProvider {
    public boolean send(EmailPayload payload);
}
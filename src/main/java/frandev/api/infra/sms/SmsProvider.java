package frandev.api.infra.sms;

public interface SmsProvider {
    public boolean send(SmsPayload payload);
}
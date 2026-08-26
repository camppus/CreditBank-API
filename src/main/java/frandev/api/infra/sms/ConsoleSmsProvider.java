package frandev.api.infra.sms;

import org.springframework.stereotype.Component;

@Component
public class ConsoleSmsProvider implements SmsProvider {

    @Override
    public boolean send(SmsPayload payload) {

        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║              📱 SMS                  ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ Subject : " + payload.subject());
        System.out.println("║ To      : " + payload.phone().getValue());
        System.out.println("║ Message : " + payload.message());
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        return true;
    }
}
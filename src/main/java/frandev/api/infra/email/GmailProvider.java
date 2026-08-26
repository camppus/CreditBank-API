package frandev.api.infra.email;

import org.springframework.context.annotation.Primary;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GmailProvider implements EmailProvider {
    private  final JavaMailSender mailSender;
    public GmailProvider(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public boolean send(EmailPayload payload) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(payload.getEmail().getValue());
        message.setSubject(payload.getSubject());
        message.setText(payload.getMessage());
        try {
            mailSender.send(message);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
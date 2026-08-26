package frandev.api.infra.security.assignature;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;


@Component
@Primary
public class Ed25519SignerService implements SignerService {

    private static final String ALGORITHM = "Ed25519";

    @Override
    public byte[] sign(byte[] data) {
        throw new UnsupportedOperationException(
                "A chave privada deve permanecer no dispositivo."
        );
    }

    @Override
    public boolean verify(
            byte[] data,
            byte[] signature,
            byte[] publicKey
    ) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);

            PublicKey key = keyFactory.generatePublic(
                    new X509EncodedKeySpec(publicKey)
            );
            Signature verifier = Signature.getInstance(ALGORITHM);
            verifier.initVerify(key);
            verifier.update(data);
            return verifier.verify(signature);

        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
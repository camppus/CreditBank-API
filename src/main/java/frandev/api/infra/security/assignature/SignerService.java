package frandev.api.infra.security.assignature;


public interface SignerService {

    byte[] sign(byte[] data);

    boolean verify(
            byte[] data,
            byte[] signature,
            byte[] publicKey
    );
}
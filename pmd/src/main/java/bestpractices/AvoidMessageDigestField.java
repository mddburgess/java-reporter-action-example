package bestpractices;

import java.security.MessageDigest;

public class AvoidMessageDigestField {

    private final MessageDigest messageDigest;

    public AvoidMessageDigestField(final MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public MessageDigest getMessageDigest() {
        return messageDigest;
    }
}

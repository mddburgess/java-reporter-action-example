package bestpractices;

public class AvoidUsingHardCodedIP {

    protected static final String IPV4 = "127.0.0.1";
    protected static final String IPV6 = "::1";
    protected static final String IPV4_MAPPED_IPV6 = "::ffff:127.0.0.1";

    private final int integer;

    public AvoidUsingHardCodedIP(final int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }
}

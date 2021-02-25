package bestpractices;

public class AvoidStringBufferField {

    private final transient StringBuffer buffer = new StringBuffer();
    private final transient StringBuilder builder = new StringBuilder();

    public AvoidStringBufferField(final String string) {
        buffer.append(string);
        builder.append(string);
    }
}

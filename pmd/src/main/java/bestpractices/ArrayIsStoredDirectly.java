package bestpractices;

import java.util.Arrays;
import java.util.List;

public class ArrayIsStoredDirectly {

    private final transient String[] array;

    public ArrayIsStoredDirectly(final String... array) {
        this.array = array;
    }

    public List<String> getArray() {
        return Arrays.asList(array);
    }
}

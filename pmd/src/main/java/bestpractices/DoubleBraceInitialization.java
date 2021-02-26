package bestpractices;

import java.util.ArrayList;
import java.util.List;

public class DoubleBraceInitialization {

    public static final List<Integer> LIST = new ArrayList<>() {{
        add(1);
        add(2);
    }};
}

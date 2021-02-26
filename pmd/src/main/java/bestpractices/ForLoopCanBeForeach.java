package bestpractices;

import java.util.List;

public class ForLoopCanBeForeach {

    public int loop(final List<String> list) {
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length += list.get(i).length();
        }
        return length;
    }
}

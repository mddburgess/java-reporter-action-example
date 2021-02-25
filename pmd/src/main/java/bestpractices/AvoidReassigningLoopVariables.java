package bestpractices;

import java.util.ArrayList;

public class AvoidReassigningLoopVariables {

    private transient int length;

    public AvoidReassigningLoopVariables() {
        for (String s : new ArrayList<String>()) {
            s = s.trim();
            length += s.length();
        }
    }
}

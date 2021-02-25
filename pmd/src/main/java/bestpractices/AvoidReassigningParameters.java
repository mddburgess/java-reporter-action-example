package bestpractices;

public class AvoidReassigningParameters {

    public transient int value;

    public AvoidReassigningParameters(int param) {
        value = param;
        param = 1;
        value += param;
    }
}

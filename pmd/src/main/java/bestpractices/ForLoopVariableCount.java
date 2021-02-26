package bestpractices;

public class ForLoopVariableCount {

    public int loop() {
        int value = 0;
        for (int i = 0, j = 0; i + j < 10; i++, j++) {
            value += i + j;
        }
        return value;
    }
}

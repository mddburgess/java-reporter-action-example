package bestpractices;

public class DefaultLabelNotLastInSwitchStmt {

    public DefaultLabelNotLastInSwitchStmt(final int integer) {
        switch (integer) {
            case 1:
                break;
            default:
                break;
            case 2:
                break;
        }
    }
}

package bestpractices;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GuardLogStatement {

    public void log() {
        final Logger log = Logger.getGlobal();
        log.log(Level.FINEST, "finest " + System.currentTimeMillis() + " logging");
    }
}

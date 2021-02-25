package bestpractices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AvoidPrintStackTrace {

    public AvoidPrintStackTrace() {
        try {
            Files.newBufferedReader(Path.of("path"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

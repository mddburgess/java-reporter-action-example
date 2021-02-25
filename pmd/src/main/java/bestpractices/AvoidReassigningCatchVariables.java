package bestpractices;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AvoidReassigningCatchVariables {

    public AvoidReassigningCatchVariables() {
        try {
            Files.newBufferedReader(Path.of("path"));
        } catch (IOException ex) {
            ex = new FileNotFoundException(ex.getMessage());
            throw new IllegalStateException(ex);
        }
    }
}

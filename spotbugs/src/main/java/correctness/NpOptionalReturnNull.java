package correctness;

import java.util.Optional;

public class NpOptionalReturnNull {

    public Optional<Object> bug() {
        return null;
    }
}

package patterns.creational_patterns.singleton.serialization;

import java.io.Serializable;

public class SerializedWithoutResolve implements Serializable {
    private static final long serialUID = -7604766932017737115L;
    private final String info = "This is serialized without readResolve()";

    private SerializedWithoutResolve() {}

    private static class SerializedWithoutResolvedHelper {
        private static final SerializedWithoutResolve instance = new SerializedWithoutResolve();
    }

    public static SerializedWithoutResolve getInstance() {
        return SerializedWithoutResolvedHelper.instance;
    }

    public String getInfo() {
        return info;
    }
}

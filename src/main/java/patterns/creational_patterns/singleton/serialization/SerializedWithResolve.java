package patterns.creational_patterns.singleton.serialization;

import java.io.Serializable;

public class SerializedWithResolve implements Serializable {
    private static final long serialUID = -7604766932017737115L;
    private final String info = "This is serialized with readResolve()";

    private SerializedWithResolve() {}

    private static class SerializedWithResolveHelper {
        private static final SerializedWithResolve instance = new SerializedWithResolve();
    }

    public static SerializedWithResolve getInstance() {
        return SerializedWithResolve.SerializedWithResolveHelper.instance;
    }

    public String getInfo() {
        return info;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

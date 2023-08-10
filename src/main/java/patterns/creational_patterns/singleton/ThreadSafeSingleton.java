package patterns.creational_patterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private final String info = "This is thread safe instance";
    private ThreadSafeSingleton() {}

    //synchronized if-else block
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    //get instance with double-cheked
    public static ThreadSafeSingleton getInstanceWithCheking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public String getInfo() {
        return info;
    }
}

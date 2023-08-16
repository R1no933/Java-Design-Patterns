package patterns.creational_patterns.singleton;

public class BillPughSingleton {
    private final String info = "This is Bill Pugh instance";
    private BillPughSingleton() {}

    private static class Helper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}

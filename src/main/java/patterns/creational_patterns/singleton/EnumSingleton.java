package patterns.creational_patterns.singleton;

public enum EnumSingleton {
    INSTANCE;
    private final String info = "This is enum singleton instance";
    public String getInfo() {
        return info;
    }
}

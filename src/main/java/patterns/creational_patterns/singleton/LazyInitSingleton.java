package patterns.creational_patterns.singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;
    private final String info = "This is lazy init instance";

    private LazyInitSingleton(){}

    public static LazyInitSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitSingleton();
        }

        return instance;
    }

    public String getInfo() {
        return info;
    }
}

//Экземпляр создается в блоке if
//!!! Не потокобезопасно

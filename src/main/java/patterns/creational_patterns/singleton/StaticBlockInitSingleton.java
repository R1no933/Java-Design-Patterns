package patterns.creational_patterns.singleton;

public class StaticBlockInitSingleton {
    private static StaticBlockInitSingleton instance;
    private final String info = "This is statick block init instance";

    private StaticBlockInitSingleton() {}

    //static block
    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public static StaticBlockInitSingleton getInstance() {
        return instance;
    }

    public String getInfo() {
        return info;
    }
}

//Экземпляр создается в статичном блоке try-catch и дает возможность
//обработки исключений
//!!!Не потокобезопасно


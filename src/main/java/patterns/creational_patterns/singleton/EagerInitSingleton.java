package patterns.creational_patterns.singleton;

public class EagerInitSingleton {
    //create instance of current class
    private static final EagerInitSingleton instance = new EagerInitSingleton();
    private final String info = "This is Eager init instance";

    //private constructor for avoid using app's constructor
    private EagerInitSingleton(){}

    //method for return instance of class
    public static EagerInitSingleton getInstance() {
        return instance;
    }

    public String getInfo() {
        return info;
    }
}

//Экземпляр создается во время загрузки класса

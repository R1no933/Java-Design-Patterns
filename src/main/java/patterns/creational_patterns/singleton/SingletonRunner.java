package patterns.creational_patterns.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        //check eager init
        EagerInitSingleton firstEagerInstance = EagerInitSingleton.getInstance();
        EagerInitSingleton secondEagerInstance = EagerInitSingleton.getInstance();
        System.out.println(firstEagerInstance.getInfo() + ". First instance hash = " + firstEagerInstance.hashCode());
        System.out.println(secondEagerInstance.getInfo()+ ". Second instance hash = " + secondEagerInstance.hashCode() + "\n");

        //check lazy inint
        LazyInitSingleton firstLazyInstance = LazyInitSingleton.getInstance();
        LazyInitSingleton secondLazyInstance = LazyInitSingleton.getInstance();
        System.out.println(firstLazyInstance.getInfo() + ". First instance hash = " + firstLazyInstance.hashCode());
        System.out.println(secondLazyInstance.getInfo()+ ". Second instance hash = " + secondLazyInstance.hashCode() + "\n");

    }
}

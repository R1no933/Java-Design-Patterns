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

        //check static block init
        StaticBlockInitSingleton firstStaticBlockInstance = StaticBlockInitSingleton.getInstance();
        StaticBlockInitSingleton secondStatickBlockInstance = StaticBlockInitSingleton.getInstance();
        System.out.println(firstStaticBlockInstance.getInfo() + ". First instance hash = " + firstStaticBlockInstance.hashCode());
        System.out.println(secondStatickBlockInstance.getInfo()+ ". Second instance hash = " + secondStatickBlockInstance.hashCode() + "\n");

        //check Bill Pugh init
        BillPughSingleton firstBPInstance = BillPughSingleton.getInstance();
        BillPughSingleton secondBPInstance = BillPughSingleton.getInstance();
        System.out.println(firstBPInstance.getInfo() + ". First instance hash = " + firstBPInstance.hashCode());
        System.out.println(secondBPInstance.getInfo()+ ". Second instance hash = " + secondBPInstance.hashCode() + "\n");

    }
}

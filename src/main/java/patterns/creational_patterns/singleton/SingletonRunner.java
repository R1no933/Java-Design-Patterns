package patterns.creational_patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import patterns.creational_patterns.singleton.serialization.SerializedWithoutResolve;
import patterns.creational_patterns.singleton.serialization.SerializedWithResolve;

import java.io.*;

public class SingletonRunner {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
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

        //check thread safe
        ThreadSafeSingleton firstThreadSafeInstance = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton secondThreadSafeInstance = ThreadSafeSingleton.getInstanceWithCheking();
        System.out.println(firstThreadSafeInstance.getInfo() + ". First instance hash = " + firstThreadSafeInstance.hashCode());
        System.out.println(secondThreadSafeInstance.getInfo()+ ". Second instance hash = " + secondThreadSafeInstance.hashCode() + "\n");

        //check singleton enum
        EnumSingleton firstEnumInstance = EnumSingleton.INSTANCE;
        EnumSingleton secondEnumInstance = EnumSingleton.INSTANCE;
        System.out.println(firstEnumInstance.getInfo() + ". First instance hash = " + firstEnumInstance.hashCode());
        System.out.println(secondEnumInstance.getInfo()+ ". Second instance hash = " + secondEnumInstance.hashCode() + "\n");

        //serialization and singleton(without readResolve())
        SerializedWithoutResolve firstSerializedInstance = SerializedWithoutResolve.getInstance();
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream(
                "testWithoutResolve.ser"
        ));
        output.writeObject(firstSerializedInstance);
        output.close();

        ObjectInput input = new ObjectInputStream(new FileInputStream(
                "testWithoutResolve.ser"));
        SerializedWithoutResolve secondSerializedInstance = (SerializedWithoutResolve) input.readObject();
        input.close();

        System.out.println(firstSerializedInstance.getInfo() + ". First instance hash = " + firstSerializedInstance.hashCode());
        System.out.println(secondSerializedInstance.getInfo()+ ". Second instance hash = " + secondSerializedInstance.hashCode() + "\n");

        //serialization and singleton(with readResolve())
        SerializedWithResolve firstResolveInstance = SerializedWithResolve.getInstance();
        ObjectOutput outputResolve = new ObjectOutputStream(new FileOutputStream("testWithResolve.ser"));
        outputResolve.writeObject(firstResolveInstance);
        outputResolve.close();

        ObjectInput inputResolve = new ObjectInputStream(new FileInputStream("testWithResolve.ser"));
        SerializedWithResolve secondResolveInstance = (SerializedWithResolve) inputResolve.readObject();
        inputResolve.close();

        System.out.println(firstResolveInstance.getInfo() + ". First instance hash = " + firstResolveInstance.hashCode());
        System.out.println(secondResolveInstance.getInfo() + ". Second instance hash = " + secondResolveInstance.hashCode());
    }
}

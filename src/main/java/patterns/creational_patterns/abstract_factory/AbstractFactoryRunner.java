package patterns.creational_patterns.abstract_factory;

import patterns.creational_patterns.abstract_factory.factory.ComputerFactory;
import patterns.creational_patterns.abstract_factory.factory.PCFactory;
import patterns.creational_patterns.abstract_factory.factory.ServerFactory;
import patterns.creational_patterns.abstract_factory.models.Computer;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "1 TB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "4 TB", "4 x 2.4 GHz"));

        System.out.println("Abstract factory PC config: " + pc);
        System.out.println("Abstract factory server config: " + server);
    }
}

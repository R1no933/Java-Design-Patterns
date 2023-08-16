package patterns.creational_patterns.factory;

import patterns.creational_patterns.factory.models.Computer;


public class FactoryRunner {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "1 TB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "32 GB", "4 TB", "4 x 2.4 GHz");

        System.out.println("Factory PC config: " + pc);
        System.out.println("Factory server config: " + server);
    }
}

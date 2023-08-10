package patterns.creational_patterns.abstract_factory.factory;

import patterns.creational_patterns.abstract_factory.models.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createomputer();
    }
}

package patterns.creational_patterns.factory;

import patterns.creational_patterns.factory.models.Computer;
import patterns.creational_patterns.factory.models.PC;
import patterns.creational_patterns.factory.models.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}

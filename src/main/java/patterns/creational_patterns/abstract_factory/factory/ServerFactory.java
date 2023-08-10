package patterns.creational_patterns.abstract_factory.factory;

import patterns.creational_patterns.abstract_factory.models.Computer;
import patterns.creational_patterns.abstract_factory.models.PC;
import patterns.creational_patterns.abstract_factory.models.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createomputer() {
        return new Server(ram, hdd, cpu);
    }
}

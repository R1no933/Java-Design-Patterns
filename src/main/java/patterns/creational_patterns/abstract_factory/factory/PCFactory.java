package patterns.creational_patterns.abstract_factory.factory;

import patterns.creational_patterns.abstract_factory.models.Computer;
import patterns.creational_patterns.abstract_factory.models.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createomputer() {
        return new PC(ram, hdd, cpu);
    }
}

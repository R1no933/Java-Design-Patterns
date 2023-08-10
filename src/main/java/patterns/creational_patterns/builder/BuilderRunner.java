package patterns.creational_patterns.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(
                "32 GB", "2 TB")
                .setHasGraphicCard(true)
                .setHasBluetooth(false)
                .build();

        System.out.println(computer.isHasBluetooth());
        System.out.println(computer.getHdd());
        System.out.println(computer.isHasGraphicCard());
    }
}

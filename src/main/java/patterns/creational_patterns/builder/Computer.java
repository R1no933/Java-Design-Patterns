package patterns.creational_patterns.builder;

public class Computer {
    private String ram;
    private String hdd;

    private boolean hasGraphicCard;
    private boolean hasBluetooth;

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isHasGraphicCard() {
        return hasGraphicCard;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.hasGraphicCard = builder.hasGraphicCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public static class ComputerBuilder {
        private String ram;
        private String hdd;

        private boolean hasGraphicCard;
        private boolean hasBluetooth;

        public ComputerBuilder(String ram, String hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setHasGraphicCard(boolean hasGraphicCard) {
            this.hasGraphicCard = hasGraphicCard;
            return this;
        }

        public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

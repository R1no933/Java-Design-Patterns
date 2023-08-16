package patterns.structural_patterns.adapter;

public class Volt {
    private int volts;

    public Volt(int voltage) {
        this.volts = voltage;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}

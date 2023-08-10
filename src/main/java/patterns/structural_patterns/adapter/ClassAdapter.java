package patterns.structural_patterns.adapter;

public class ClassAdapter extends Socket implements SocketAdapter{

    @Override
    public Volt getVolt120() {
        return getVolt();
    }

    @Override
    public Volt getVolt12() {
        Volt volt = getVolt();
        return convert(volt, 10);
    }

    @Override
    public Volt getVolt3() {
        Volt volt = getVolt();
        return convert(volt, 40);
    }

    private Volt convert(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}

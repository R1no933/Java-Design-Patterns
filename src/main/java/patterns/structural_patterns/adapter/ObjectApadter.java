package patterns.structural_patterns.adapter;

public class ObjectApadter implements SocketAdapter{
    private Socket socket = new Socket();

    @Override
    public Volt getVolt120() {
        return socket.getVolt();
    }

    @Override
    public Volt getVolt12() {
        Volt volt = socket.getVolt();
        return convert(volt, 10);
    }

    @Override
    public Volt getVolt3() {
        Volt volt = socket.getVolt();
        return convert(volt, 40);
    }

    private Volt convert(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}

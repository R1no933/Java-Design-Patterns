package patterns.structural_patterns.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        objAdapter();
        classAdapter();
    }

    //Test obj adapter exaample
    private static void objAdapter() {
        SocketAdapter adapter = new ObjectApadter();
        Volt volt3 = getVolt(adapter, 3);
        Volt volt12 = getVolt(adapter, 12);
        Volt volt120 = getVolt(adapter, 120);

        System.out.println("Volt 3 using objectAdapter = " + volt3.getVolts());
        System.out.println("Volt 12 using objectAdapter = " + volt12.getVolts());
        System.out.println("Volt 120 using objectAdapter = " + volt120.getVolts());
    }

    //Test class adapter example
    private static void classAdapter() {
        SocketAdapter adapter = new ClassAdapter();
        Volt volt3 = getVolt(adapter, 3);
        Volt volt12 = getVolt(adapter, 12);
        Volt volt120 = getVolt(adapter, 120);

        System.out.println("Volt 3 using classAdapter = " + volt3.getVolts());
        System.out.println("Volt 12 using classAdapter = " + volt12.getVolts());
        System.out.println("Volt 120 using classAdapter = " + volt120.getVolts());
    }

    private static Volt getVolt(SocketAdapter adapter, int i) {
        switch (i) {
            case 3: return adapter.getVolt3();
            case 12: return adapter.getVolt12();
            case 120: return adapter.getVolt120();
            default: return adapter.getVolt120();
        }
    }
}

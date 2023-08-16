package patterns.structural_patterns.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n***************************************");

        Car sportAndLuxCar = new SportCar(new LuxCar(new BasicCar()));
        sportAndLuxCar.assemble();
    }
}

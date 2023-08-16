package patterns.structural_patterns.decorator;

public class LuxCar extends CarDecorator {
    public LuxCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Addind features of Lux Car.");
    }
}

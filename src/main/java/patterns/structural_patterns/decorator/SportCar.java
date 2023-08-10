package patterns.structural_patterns.decorator;

public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Adding features of Sport Car.");
    }
}

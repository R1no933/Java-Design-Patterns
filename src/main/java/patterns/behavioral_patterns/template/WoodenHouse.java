package patterns.behavioral_patterns.template;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Wooden walls is building");
    }

    @Override
    public void buildPillars() {
        System.out.println("Wooden coating pillars is building");
    }
}

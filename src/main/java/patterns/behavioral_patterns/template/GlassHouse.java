package patterns.behavioral_patterns.template;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Glass walls is building");
    }

    @Override
    public void buildPillars() {
        System.out.println("Pillars with glass coating is building");
    }
}

package patterns.behavioral_patterns.template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is building");
    }

    private void buildWindows() {
        System.out.println("Window is building");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Foundation is building");
    }
}

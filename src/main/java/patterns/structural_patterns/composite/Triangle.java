package patterns.structural_patterns.composite;

public class Triangle implements Shape{
    @Override
    public void drawShape(String fillColor) {
        System.out.println("Drawing triangle with fill color: " + fillColor);
    }
}

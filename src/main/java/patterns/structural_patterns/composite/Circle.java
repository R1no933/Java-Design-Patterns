package patterns.structural_patterns.composite;

public class Circle implements Shape{

    @Override
    public void drawShape(String fillColor) {
        System.out.println("Drawing circle with fill color: " + fillColor);
    }
}

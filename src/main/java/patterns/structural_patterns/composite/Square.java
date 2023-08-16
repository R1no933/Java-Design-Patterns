package patterns.structural_patterns.composite;

public class Square implements Shape{
    @Override
    public void drawShape(String fillColor) {
        System.out.println("Drawing square with fill color: " + fillColor);
    }
}

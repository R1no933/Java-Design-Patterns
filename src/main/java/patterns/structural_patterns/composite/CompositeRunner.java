package patterns.structural_patterns.composite;

public class CompositeRunner {
    public static void main(String[] args) {
        Shape firstShape = new Circle();
        Shape secondShape = new Triangle();
        Shape thirdShape = new Square();

        Drawing drawing = new Drawing();
        drawing.addShape(firstShape);
        drawing.addShape(secondShape);
        drawing.addShape(thirdShape);
        drawing.drawShape("Yellow");
        drawing.clearMyShapes();
        drawing.addShape(secondShape);
        drawing.addShape(thirdShape);
        drawing.drawShape("Black");
    }
}

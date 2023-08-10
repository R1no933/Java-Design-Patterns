package patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> myShapes = new ArrayList<Shape>();

    @Override
    public void drawShape(String fillColor) {
        for(Shape shape : myShapes) {
            shape.drawShape(fillColor);
        }
    }

    public void addShape(Shape shape) {
        this.myShapes.add(shape);
    }

    public void removeShape(Shape shape) {
        myShapes.remove(shape);
    }

    public void clearMyShapes() {
        System.out.println("Clearing your shapes list!");
        this.myShapes.clear();
        System.out.println("Now you shapes list is clear!");
    }
}

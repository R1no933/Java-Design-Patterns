package patterns.structural_patterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType shapeType) {
        Shape currentShape = shapes.get(shapeType);

        if (currentShape == null) {
            if (shapeType.equals(ShapeType.FILL_OVAL)) {
                currentShape = new Oval(true);
            } else if (shapeType.equals(ShapeType.NOTFILL_OVAL)) {
                currentShape = new Oval(false);
            } else if (shapeType.equals(ShapeType.LINE)) {
                currentShape = new Line();
            }
            shapes.put(shapeType, currentShape);
        }
        return currentShape;
    }

    public static enum ShapeType {
        FILL_OVAL,
        NOTFILL_OVAL,
        LINE
    }
}

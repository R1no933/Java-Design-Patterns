package patterns.structural_patterns.flyweight;

import java.awt.*;

public interface Shape {
    public void draw(Graphics graphics, int coordX, int coordY,
                     int width, int height, Color color);
}

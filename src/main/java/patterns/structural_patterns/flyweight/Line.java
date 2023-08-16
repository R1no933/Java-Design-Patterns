package patterns.structural_patterns.flyweight;

import java.awt.*;

public class Line implements Shape{

    public Line() {
        System.out.println("Creating LINE object!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int coordX_1, int coordY_1, int coordX_2, int coordY_2, Color color) {
        line.setColor(color);
        line.drawLine(coordX_1, coordY_1, coordX_2, coordY_2);
    }
}

package patterns.structural_patterns.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

    private boolean isFill;

    public Oval(boolean fill) {
        this.isFill = fill;
        System.out.println("Creating Oval object. Fill is = " + fill);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics oval, int coordX, int coordY, int width, int height, Color color) {
        oval.setColor(color);
        oval.drawOval(coordX, coordY, width, height);
        if(isFill) {
            oval.fillOval(coordX, coordY, width, height);
        }
    }
}

package patterns.structural_patterns.flyweight;

import patterns.structural_patterns.flyweight.ShapeFactory.ShapeType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlyweightRunner extends JFrame {

    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeType shapes[] = { ShapeType.LINE, ShapeType.FILL_OVAL, ShapeType.NOTFILL_OVAL };
    private static final Color colors[] = { Color.BLACK, Color.RED, Color.BLUE };

    public FlyweightRunner(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container container = getContentPane();

        JButton drawButton = new JButton("PUSH ME!");
        final JPanel panel = new JPanel();

        container.add(panel, BorderLayout.CENTER);
        container.add(drawButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Graphics graphics = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(graphics, getRandomX(), getRandomY(),
                            getRandomWidth(), getRandomHeight(), getRandomColor());
                }
            }
        });
    }


    private ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        FlyweightRunner runner = new FlyweightRunner(400, 500);
    }
}

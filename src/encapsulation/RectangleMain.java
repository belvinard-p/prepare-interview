package encapsulation;

import java.util.logging.Logger;
import java.util.logging.Level;

public class RectangleMain {
    private static final Logger LOGGER = Logger.getLogger(RectangleMain.class.getName());

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Uses no-arg constructor
        rectangle.setLength(5);
        rectangle.setWidth(2);

        double area = rectangle.getArea();
        LOGGER.log(Level.INFO, "Rectangle area: {0}", area);
    }
}

import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory {
    private static RectangularShapeFactory uniqueInstance;
    private RectangularShapeFactory() {}
    public static RectangularShapeFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new RectangularShapeFactory();
        }
        return uniqueInstance;
    }
    @Override
    public Shape create(String type, Point[] points) {
        switch (type) {
            case "Rectangle":
                return new Rectangle(type, points);
            case "Trapezoid":
                return new Trapezoid(type, points);
            case "Parallelogram":
                return new Parallelogram(type, points);
        }
        return null;
    }
}

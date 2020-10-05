import java.awt.*;

class RectangularShapeFactory implements ShapeFactory {

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

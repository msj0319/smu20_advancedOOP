import java.awt.*;

interface ShapeFactory {
    abstract Shape create(String type, Point[] points);
}

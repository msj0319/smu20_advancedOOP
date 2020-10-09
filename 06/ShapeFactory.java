import java.awt.*;

public interface ShapeFactory {
    abstract Shape create(String type, Point[] points);
}

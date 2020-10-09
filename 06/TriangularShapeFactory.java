import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory {
    private static TriangularShapeFactory uniqueInstance;
    private TriangularShapeFactory() {}
    public static TriangularShapeFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new TriangularShapeFactory();
        }
        return uniqueInstance;
    }
    @Override
    public Shape create(String type, Point[] points) {
        switch (type) {
            case "Triangle":
                return new Triangle(type,points);
            case "RightTriangle":
                return new RightTriangle(type,points);
        }
        return null;
    }
}

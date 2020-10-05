import java.awt.*;

class TriangularShapeFactory implements ShapeFactory {
    @Override
    public Shape create(String type, Point[] points) {
        switch (type) {
            case "Triangle":
                return new Triangle(type,points);
            case "RightTriangle":
                return new RightTriangle(type, points);
        }
        return null;
    }
}

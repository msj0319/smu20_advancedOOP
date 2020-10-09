import java.awt.*;
//사각형
public class Rectangle extends Shape {
    public Rectangle(String type, Point[] points) {
        super(type, points);
    }
    @Override
    public double calcArea() {
        double area;
        area = (points[1].x - points[0].x) * (points[0].y - points[1].y);
        return area;
    }
}

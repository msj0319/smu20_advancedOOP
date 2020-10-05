import java.awt.*;
//평행사변형
class Parallelogram extends Shape {
    public Parallelogram(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double area;
        area = (points[3].x - points[0].x) * (points[3].y - points[1].y);
        return area;
    }
}

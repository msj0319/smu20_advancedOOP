import java.awt.*;
//직각삼각형
public class RightTriangle extends Shape {
    public RightTriangle(String type, Point[] points){
        super(type, points);
    }

    @Override
    public double calcArea() {
        double area = (points[2].x - points[1].x) * (points[0].y - points[2].y) / 2.0d;
        return area;
    }
}
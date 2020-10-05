import java.awt.*;
//사다리꼴
class Trapezoid extends Shape {
    public Trapezoid(String type, Point[] points){
        super(type, points);
    }

    @Override
    public double calcArea() {
        double area;
        double upperSide = points[3].x-points[0].x;
        double lowerSide = points[1].x-points[2].x;
        double height = points[1].y - points[3].y;
        area = (upperSide + lowerSide) * height / 2;
        return area;
    }
}

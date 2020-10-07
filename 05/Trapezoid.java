import java.awt.*;
//사다리꼴
class Trapezoid extends Shape {
    public Trapezoid(String type, Point[] points){
        super(type, points);
    }

    @Override
    public double calcArea() {
        double upperSide,lowerSide, height, area;
        upperSide = points[3].x - points[0].x;
        lowerSide = points[1].x - points[2].x;
        height = points[3].y - points[1].y;
        area = (upperSide + lowerSide) * height / 2;
        return area;
    }
}

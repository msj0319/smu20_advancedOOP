import java.awt.*;

public abstract class Shape {
    protected Point[] points;
    String type;
    public Shape(String type, Point[] points){
        this.type = type;
        this.points = points;
    }
    public abstract double calcArea();

    public String toString() {
        if (type.equals("Rectangle")){
            return type + '\n' + "P0: "+ points[0].toString() + '\n'
                    + "P1: "+ points[1].toString() + '\n'
                    + "area: " + calcArea() + '\n';
        }
        else if (type.equals("Trapezoid")) {
            return type + '\n' + "P0: "+ points[0].toString() + '\n'
                    + "P1: "+ points[1].toString() + '\n'
                    + "P2: "+ points[2].toString() + '\n'
                    + "P3: "+ points[3].toString() + '\n'
                    + "area: " + calcArea() + '\n';
        }
        else if (type.equals("Parallelogram")) {
            return type + '\n' + "P0: "+ points[0].toString() + '\n'
                    + "P1: "+ points[1].toString() + '\n'
                    + "P2: "+ points[2].toString() + '\n'
                    + "P3: "+ points[3].toString() + '\n'
                    + "area: " + calcArea() + '\n';
        }
        else if (type.equals("Triangle")) {
            return type + '\n' + "P0: "+ points[0].toString() + '\n'
                    + "P1: "+ points[1].toString() + '\n'
                    + "P2: "+ points[2].toString() + '\n'
                    + "area: " + calcArea() + '\n';
        }
        else if (type.equals("RightTriangle")) {
            return type + '\n' + "P0: "+ points[0].toString() + '\n'
                    + "P1: "+ points[1].toString() + '\n'
                    + "P2: "+ points[2].toString() + '\n'
                    + "area: " + calcArea() + '\n';
        }
        return null;
    }
}

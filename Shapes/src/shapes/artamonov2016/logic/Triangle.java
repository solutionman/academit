package shapes.artamonov2016.logic;

// Triangle class
// x1,y1 - first point, x2,y2 - another point and so on

public class Triangle implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getWidth() {
        return Math.max(Math.max(x1, x2), Math.max(x2, x3)) - Math.min(Math.min(x1, x2), Math.min(x2, x3));
    }

    public double getHeight() {
        return Math.max(Math.max(y1, y2), Math.max(y2, y3)) - Math.min(Math.min(y1, y2), Math.min(y2, y3));
    }

    public double getArea() {
        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public double getPerimeter() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)) + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }
}

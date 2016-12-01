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

    private static double getMaxDistance(double x, double y, double z) {
        return Math.max(x, Math.max(y, z)) - Math.min(x, Math.min(y, z));
    }

    private static double getTriangleSide(double ax, double ay, double bx, double by){
        return Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
    }

    public double getWidth() {
        return getMaxDistance(x1, x2, x3);
    }

    public double getHeight() {
        return getMaxDistance(y1, y2, y3);
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double a = getTriangleSide(x1, y1, x2, y2);
        double b = getTriangleSide(x2, y2, x3, y3);
        double c = getTriangleSide(x3, y3, x1, y1);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return getTriangleSide(x1, y1, x2, y2) + getTriangleSide(x2, y2, x3, y3) + getTriangleSide(x1, y1, x3, y3);
    }
}

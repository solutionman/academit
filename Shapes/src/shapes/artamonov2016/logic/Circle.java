package shapes.artamonov2016.logic;

// Circle

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius;
    }

    public double getHeight() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

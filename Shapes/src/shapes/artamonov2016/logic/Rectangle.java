package shapes.artamonov2016.logic;

// Rectangle

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}

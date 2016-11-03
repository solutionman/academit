package shapes.artamonov2016.logic;

// Rectangle

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double sideLength1, double sideLength2) {
        if (sideLength1 > sideLength2) {
            this.width = sideLength1;
            this.height = sideLength2;
        } else {
            this.width = sideLength2;
            this.height = sideLength1;
        }

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

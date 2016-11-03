package shapes.artamonov2016.logic;

public interface Shape {

    public double getWidth();

    public double getHeight();

    public double getArea();

    public double getPerimeter();



    /*
    public double getWidth(double sideLength){
        return sideLength;
    }

    public double getTriangleWidth(double x1, double y1, double x2, double y2, double x3, double y3){
        return Math.max(Math.max(x1, x2), Math.max(x2, x3)) - Math.min(Math.min(x1, x2), Math.min(x2, x3));
    }
*/

    //private double width;
    //private double height;

    // Square and Circle

    /*
    public Shapes(double sideLength) {
        this.width = sideLength;
        this.height = sideLength;
    }

    // Triangle
    public Shapes(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.width = Math.max(Math.max(x1, x2), Math.max(x2, x3)) - Math.min(Math.min(x1, x2), Math.min(x2, x3));
        this.height = Math.max(Math.max(y1, y2), Math.max(y2, y3)) - Math.min(Math.min(y1, y2), Math.min(y2, y3));
    }

    // Rectangle
    public Shapes(double width, double height) {
        this.width = width;
        this.height = height;
    }


    // Circle
    public Shapes(double radius){
        this.width = radius;
        this.height = radius;
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

    public double getSquarePerimeter() {
        return width * 2 + height * 2;
    }
    */

}



package shapes.artamonov2016.main;

import shapes.artamonov2016.logic.Circle;
import shapes.artamonov2016.logic.Rectangle;
import shapes.artamonov2016.logic.Square;
import shapes.artamonov2016.logic.Triangle;

public class MainShapes {
    public static void main(String[] args) {

        Square square = new Square(12);

        double widthOfSquare = square.getWidth();
        System.out.println("The width of square is " + widthOfSquare);
        double heightOfSquare = square.getHeight();
        System.out.println("The height of square is " + heightOfSquare);
        double areaOfSquare = square.getArea();
        System.out.println("The area of square is " + areaOfSquare);

        Triangle triangle = new Triangle(1, 1, 2, 3, 5, 6);

        double widthOfTriangle = triangle.getWidth();
        System.out.println("The width of triangle is " + widthOfTriangle);
        double heightOfTriangle = triangle.getHeight();
        System.out.println("The height of triangle is " + heightOfTriangle);
        double areaOfTriangle = triangle.getArea();
        System.out.println("The area of triangle is " + areaOfTriangle);

        Rectangle rectangle = new Rectangle(12, 13);

        double widthOfRectangle = rectangle.getWidth();
        System.out.println("The width of rectangle is " + widthOfRectangle);
        double heightOfRectangle = rectangle.getHeight();
        System.out.println("The height of rectangle is " + heightOfRectangle);
        double areaOfRectangle = rectangle.getArea();
        System.out.println("The area of rectangle is " + areaOfRectangle);

        Circle circle = new Circle(15);

        double widthOfCircle = circle.getWidth();
        System.out.println("The width of circle is " + widthOfCircle);
        double heightOfCircle = circle.getHeight();
        System.out.println("The height of circle is " + heightOfCircle);
        double areaOfCircle = circle.getArea();
        System.out.println("The area of circle is " + areaOfCircle);

        //double widthOfTriangle = Shape.getTriangleWidth
        /*
        Shapes triangle = new Shapes(1,1,2,3,3,2);

        Shapes rectangle = new Shapes(10, 13);

        Shapes circle = new Shapes(12);

        double areaOfSquare = square.getArea();
        System.out.println("The area of square is " + areaOfSquare);

        double areaOfRectangle = rectangle.getArea();
        System.out.println("The area of rectangle is " + areaOfRectangle);

        double perimeterOfSquare = square.getSquarePerimeter();
        System.out.println("The perimeter of square is " + perimeterOfSquare);

        double perimeterOfRectangle = rectangle.getSquarePerimeter();
        System.out.println("The perimeter of rectangle is " + perimeterOfRectangle);
        */

    }
}

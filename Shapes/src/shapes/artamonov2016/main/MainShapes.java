

package shapes.artamonov2016.main;

import shapes.artamonov2016.logic.Shapes;

public class MainShapes {
    public static void main(String[] args){

        Shapes square = new Shapes(12);

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
    }
}

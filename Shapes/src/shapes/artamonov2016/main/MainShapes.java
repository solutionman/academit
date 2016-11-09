

package shapes.artamonov2016.main;

import shapes.artamonov2016.logic.*;

public class MainShapes {
    public static void main(String[] args) {

        Square square = new Square(12);

        double widthOfSquare = square.getWidth();
        System.out.println("The width of square is " + widthOfSquare);
        double heightOfSquare = square.getHeight();
        System.out.println("The height of square is " + heightOfSquare);
        double areaOfSquare = square.getArea();
        System.out.println("The area of square is " + areaOfSquare);
        double perimeterOfSquare = square.getPerimeter();
        System.out.println("The perimeter of square is " + perimeterOfSquare);

        Triangle triangle = new Triangle(1, 1, 2, 3, 5, 6);

        double widthOfTriangle = triangle.getWidth();
        System.out.println("The width of triangle is " + widthOfTriangle);
        double heightOfTriangle = triangle.getHeight();
        System.out.println("The height of triangle is " + heightOfTriangle);
        double areaOfTriangle = triangle.getArea();
        System.out.println("The area of triangle is " + areaOfTriangle);
        double perimeterOfTriangle = triangle.getPerimeter();
        System.out.println("The perimeter of triangle is " + perimeterOfTriangle);

        Rectangle rectangle = new Rectangle(12, 13);

        double widthOfRectangle = rectangle.getWidth();
        System.out.println("The width of rectangle is " + widthOfRectangle);
        double heightOfRectangle = rectangle.getHeight();
        System.out.println("The height of rectangle is " + heightOfRectangle);
        double areaOfRectangle = rectangle.getArea();
        System.out.println("The area of rectangle is " + areaOfRectangle);
        double perimeterOfRectangle = rectangle.getPerimeter();
        System.out.println("The perimeter of rectangle is " + perimeterOfRectangle);

        Circle circle = new Circle(15);

        double widthOfCircle = circle.getWidth();
        System.out.println("The width of circle is " + widthOfCircle);
        double heightOfCircle = circle.getHeight();
        System.out.println("The height of circle is " + heightOfCircle);
        double areaOfCircle = circle.getArea();
        System.out.println("The area of circle is " + areaOfCircle);
        double perimeterOfCircle = circle.getPerimeter();
        System.out.println("The perimeter of circle is " + perimeterOfCircle);


        Shape[] arrayOfFigures = {square, triangle, rectangle, circle};

        double biggerArea = 0;
        String figureWithBiggerArea = "";
        for(int i = 0; i < arrayOfFigures.length; ++i){
            if(biggerArea < arrayOfFigures[i].getArea()){
                biggerArea = arrayOfFigures[i].getArea();
                figureWithBiggerArea = arrayOfFigures[i].toString();
            }
        }

        System.out.printf("The figure with bigger area is %s and its area is %f%n", figureWithBiggerArea, biggerArea);

        double biggerPerimeter = 0;
        double secondBiggerPerimeter = 0;
        String figureWithBiggerPerimeter = "";
        String figureWithSecondBigerPerimeter = "";
        for(int i = 0 ; i < arrayOfFigures.length; ++i){
            if(biggerPerimeter < arrayOfFigures[i].getPerimeter()){
                secondBiggerPerimeter = biggerPerimeter;
                biggerPerimeter = arrayOfFigures[i].getPerimeter();
                figureWithSecondBigerPerimeter = figureWithBiggerPerimeter;
                figureWithBiggerPerimeter = arrayOfFigures[i].toString();
            }
        }

        System.out.printf("The figure with second bigger perimeter is %s and its perimeter is %f", figureWithSecondBigerPerimeter, secondBiggerPerimeter);

    }
}

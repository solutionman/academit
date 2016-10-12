package RangeOfNumbers;

// Main class for Range

import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number of first interval: ");
        double number1 = scanner.nextDouble();

        System.out.print("And second number of first interval: ");
        double number2 = scanner.nextDouble();

        System.out.print("And the number for checking in first interval: ");
        double numberForChecking = scanner.nextDouble();

        System.out.print("Now enter the first number for second interval: ");
        double secondInterval1 = scanner.nextDouble();

        System.out.print("And second number for second interval: ");
        double secondInterval2 = scanner.nextDouble();

        Range range = new Range(number1, number2, secondInterval1, secondInterval2);
        if (range.isInside(numberForChecking)) {
            System.out.printf("The number %f is in range of first interval.%n", numberForChecking);
        } else {
            System.out.printf("The number %f is outside the range of first interval.%n", numberForChecking);
        }

        System.out.println("The distance between numbers of first interval: " + range.calcLengthOfInterval());

        range.calcIntersectionOfIntervals();
        System.out.printf("The intersection of intervals is %f %f", range.intersectLesserNumber,range.intersectBiggerNumber);
    }
}

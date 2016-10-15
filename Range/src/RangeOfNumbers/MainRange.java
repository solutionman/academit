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

        System.out.printf("First interval %.2f - %.2f%n", number1, number2);

        System.out.print("And the number for checking in first interval: ");
        double numberForChecking = scanner.nextDouble();

        System.out.print("Now enter the first number for second interval: ");
        double secondInterval1 = scanner.nextDouble();

        System.out.print("And second number for second interval: ");
        double secondInterval2 = scanner.nextDouble();

        System.out.printf("Second interval %.2f - %.2f%n", secondInterval1, secondInterval2);

        Range range = new Range(number1, number2, secondInterval1, secondInterval2);
        if (range.isInside(numberForChecking)) {
            System.out.printf("The number %.2f is between %.2f - %.2f%n", numberForChecking, number1, number2);
        } else {
            System.out.printf("The number %.2f is outside of interval %.2f - %.2f%n", numberForChecking, number1, number2);
        }

        System.out.printf("The distance between %.2f - %.2f is %.2f%n", number1, number2, range.calcLengthOfInterval());

        range.calcIntersectionOfIntervals();
        System.out.printf("The intersection of %.2f - %.2f  and  %.2f - %.2f  is  %.2f - %.2f%n", number1, number2, secondInterval1, secondInterval2,  range.intersectLesserNumber,range.intersectBiggerNumber);

        range.calcUnionIntervals();
        if(range.unionSecondIntervalLesserNumber == range.unionSecondIntervalBiggerNumber) {
            System.out.printf("The union of intervals is %f - %f", range.unionFirstIntervalLesserNumber, range.unionFirstIntervalBiggerNumber);
        } else {
            System.out.printf("The union of intervals is %f - %f  and  %f - %f%n", range.unionFirstIntervalLesserNumber, range.unionFirstIntervalBiggerNumber, range.unionSecondIntervalLesserNumber, range.unionSecondIntervalBiggerNumber);
        }
    }
}

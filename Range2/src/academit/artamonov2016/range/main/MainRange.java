package academit.artamonov2016.range.main;

// Main class for Range

import academit.artamonov2016.range.logic.IntervalLength;
import academit.artamonov2016.range.logic.Range;
import academit.artamonov2016.range.logic.IsInside;

import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number of first interval: ");
        double firstInterval1 = scanner.nextDouble();

        System.out.print("And second number of first interval: ");
        double firstInterval2 = scanner.nextDouble();

        Range firstInterval = new Range(firstInterval1, firstInterval2);
        System.out.printf("First interval %.2f - %.2f%n", firstInterval.getFrom1(), firstInterval.getFrom2());

        System.out.print("And the number for checking in first interval: ");
        double numberForChecking = scanner.nextDouble();

        boolean checking = IsInside.checkIsInsideInterval(firstInterval.getFrom1(), firstInterval.getFrom2(), numberForChecking);

        if (checking) {
            System.out.printf("The %.2f is inside %.2f - %.2f%n", numberForChecking, firstInterval1, firstInterval2);
        } else {
            System.out.printf("The %.2f is outside of %.2f - %.2f%n", numberForChecking, firstInterval1, firstInterval2);
        }

        System.out.print("Now enter the first number for second interval: ");
        double secondInterval1 = scanner.nextDouble();

        System.out.print("And second number for second interval: ");
        double secondInterval2 = scanner.nextDouble();

        Range secondInterval = new Range(secondInterval1, secondInterval2);

        System.out.printf("Second interval %.2f - %.2f%n", secondInterval.getFrom1(), secondInterval.getFrom2());

        double lengthOfFirstInterval = IntervalLength.calcLengthOfInterval(firstInterval1, firstInterval2);
        System.out.printf("The distance between %.2f - %.2f is %.2f%n", firstInterval1, firstInterval2, lengthOfFirstInterval);

        //Range intersection = new Range();

    }
}

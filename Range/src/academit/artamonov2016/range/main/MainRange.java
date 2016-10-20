package academit.artamonov2016.range.main;

// Main class for Range

import academit.artamonov2016.range.logic.Range;

import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number of first interval: ");
        double number1 = scanner.nextDouble();

        System.out.print("And second number of first interval: ");
        double number2 = scanner.nextDouble();

        Range firstInterval = new Range(number1, number2);

        System.out.printf("First interval %.2f - %.2f%n", firstInterval.getFrom1(), firstInterval.getFrom2());

        System.out.print("And the number for checking in first interval: ");
        double numberForChecking = scanner.nextDouble();

        if (firstInterval.isInside(numberForChecking)) {
            System.out.printf("The number %.2f is between %.2f - %.2f%n", numberForChecking, number1, number2);
        } else {
            System.out.printf("The number %.2f is outside of interval %.2f - %.2f%n", numberForChecking, number1, number2);
        }

        System.out.printf("The distance between %.2f - %.2f is %.2f%n", number1, number2, firstInterval.getLength());

        System.out.print("Now enter the first number for second interval: ");
        double number3 = scanner.nextDouble();

        System.out.print("And second number for second interval: ");
        double number4 = scanner.nextDouble();

        Range secondInterval = new Range (number3, number4);

        System.out.printf("Second interval %.2f - %.2f%n", secondInterval.getFrom1(), secondInterval.getFrom2());

    }
}

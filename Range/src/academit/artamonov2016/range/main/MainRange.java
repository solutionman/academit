package academit.artamonov2016.range.main;

// Main class for Range

import academit.artamonov2016.range.logic.Range;

import java.util.List;
import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number of first interval: ");
        double number1 = scanner.nextDouble();

        System.out.print("And second number of first interval: ");
        double number2 = scanner.nextDouble();

        Range firstInterval = new Range(number1, number2);

        System.out.printf("First interval %.2f - %.2f%n", firstInterval.getFrom(), firstInterval.getTo());

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

        Range secondInterval = new Range(number3, number4);

        System.out.printf("Second interval %.2f - %.2f%n", secondInterval.getFrom(), secondInterval.getTo());


        Range intersection = firstInterval.getIntersection(secondInterval);

        if (firstInterval.getIntersection(secondInterval) != null) {
            System.out.printf("The intersection of first and second interval is %.2f - %.2f%n", intersection.getFrom(), intersection.getTo());
        } else {
            System.out.println("There is no intersection between first and second interval.");
        }

        Range[] union = firstInterval.getUnionArray(secondInterval);

        if (union.length == 1) {
            System.out.printf("The union of intervals %.2f - %.2f%n", union[0].getFrom(), union[0].getTo());
        } else {
            System.out.printf("The union of intervals %.2f - %.2f  and  %.2f - %.2f%n", union[0].getFrom(), union[0].getTo(), union[1].getFrom(), union[1].getTo());
        }

        Range[] firstMinusSecond = firstInterval.getFirstMinusSecond(secondInterval);

        if (firstMinusSecond.length == 1) {
            System.out.printf("First interval minus second %.2f - %.2f", firstMinusSecond[0].getFrom(), firstMinusSecond[0].getTo());
        } else if (firstMinusSecond.length == 2){
            System.out.printf("First interval minus second %.2f - %.2f  and  %.2f - %.2f", firstMinusSecond[0].getFrom(), firstMinusSecond[0].getTo(), firstMinusSecond[1].getFrom(), firstMinusSecond[1].getTo());
        } else {
            System.out.println("First interval minus second 0");
        }

    }
}


package academit.artamonov2016.range.main;

// Main class for Range

import academit.artamonov2016.range.logic.*;

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

        Intersection intersection = new Intersection(firstInterval.getFrom1(), firstInterval.getFrom2(), secondInterval.getFrom1(), secondInterval.getFrom2());
        System.out.printf("The intersection of first and second interval is %.2f - %.2f%n", intersection.getIntersectLesserNumber(), intersection.getIntersectBiggerNumber());

        Union union = new Union(firstInterval.getFrom1(), firstInterval.getFrom2(), secondInterval.getFrom1(), secondInterval.getFrom2());

        if(union.getUnionSecondIntervalBiggerNumber() == union.getUnionSecondIntervalLesserNumber()){
            System.out.printf("The union of first and second interval %.2f - %.2f%n", union.getUnionFirstIntervalLesserNumber(), union.getUnionFirstIntervalBiggerNumber());
        } else {
            System.out.printf("The union of first and second interval %.2f - %.2f  and  %.2f - %.2f%n", union.getUnionFirstIntervalLesserNumber(), union.getUnionFirstIntervalBiggerNumber(), union.getUnionSecondIntervalLesserNumber(), union.getUnionSecondIntervalBiggerNumber());
        }

        Difference firstMinusSecond = new Difference(firstInterval.getFrom1(), firstInterval.getFrom2(), secondInterval.getFrom1(), secondInterval.getFrom2());

        if(firstMinusSecond.getFirstMinusSecondLesserNumber2() == firstMinusSecond.getFirstMinusSecondBiggerNumber2()){
            System.out.printf("First interval minus second: %.2f - %.2f", firstMinusSecond.getFirstMinusSecondLesserNumber(), firstMinusSecond.getFirstMinusSecondBigerNumber());
        } else {
            System.out.printf("First interval minus second: %.2f - %.2f  and %.2f - %.2f", firstMinusSecond.getFirstMinusSecondLesserNumber(), firstMinusSecond.getFirstMinusSecondBigerNumber(), firstMinusSecond.getFirstMinusSecondLesserNumber2(), firstMinusSecond.getFirstMinusSecondBiggerNumber2());
        }
    }
}

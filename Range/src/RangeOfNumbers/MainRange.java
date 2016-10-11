package RangeOfNumbers;

// Main class for Range

import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        double number1 = scanner.nextDouble();

        System.out.print("And another number: ");
        double number2 = scanner.nextDouble();

        System.out.print("And the number for checking: ");
        double numberForChecking = scanner.nextDouble();

        Range range = new Range(number1, number2);
        if (range.isInside(numberForChecking)) {
            System.out.println("The number for checking is in range.");
        } else {
            System.out.println("The number for checking is outside the range.");
        }
    }
}

// Here is the main class for program

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file (with extension .txt). ");
        String nameOfFile = scanner.next();
        System.out.println("Enter the type of sorting:  a (ascending) d (descending)");
        String typeOfSorting = scanner.next();

        ArrayList<String> arrayFromFile = ReadSortWrite.readToArray(nameOfFile);

        if (typeOfSorting.equals("a")) {
            ReadSortWrite.sortArrayAscending(arrayFromFile);
            System.out.println("File sorted by ascending.");
        } else if (typeOfSorting.equals("d")) {
            ReadSortWrite.sortArrayDescending(arrayFromFile);
            System.out.println("File sorted by descending.");
        } else {
            System.out.println("You should type \"a\" or \"d\", file is not sorted.");
            return;
        }

        ReadSortWrite.writeToFile(arrayFromFile);

    }
}

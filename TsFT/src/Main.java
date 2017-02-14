// Here is the main class for program

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file (with extension .txt). ");
        String nameOfFile = scanner.next();
        System.out.println("Enter the type of sorting:  a (ascending) d (decreasing)");
        String typeOfSorting = scanner.next();

        ArrayList<String> arrayFromFile = ReadSortWrite.readToArray(nameOfFile);

        ReadSortWrite.sortArray(arrayFromFile);

        ReadSortWrite.writeToFile(arrayFromFile);

    }
}

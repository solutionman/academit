package academit.artamonov2017.tsft;// Here is the main class for program

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayFromFile = ReadSortWrite.readToArray(args[0]);
        String typeOfSorting = args[1];

        if (typeOfSorting.equals("a")) {
            ReadSortWrite.sortArrayAscending(arrayFromFile);
            System.out.println("Файл отсортирован по возрастанию.");
        } else if (typeOfSorting.equals("d")) {
            ReadSortWrite.sortArrayDescending(arrayFromFile);
            System.out.println("Файл отсортирован по убыванию.");
        } else {
            System.out.println("Вы должны выбрать \"a\" или \"d\", файл не отсортирован.");
            return;
        }

        ReadSortWrite.writeToFile(arrayFromFile);

    }
}



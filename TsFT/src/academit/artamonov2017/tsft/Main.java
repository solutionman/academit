package academit.artamonov2017.tsft;// Here is the main class for program

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        try {
            if (args.length == 0) {
                System.out.println("Вы должны передать аргументы для программы.");
                System.out.println("Напишите -h для вызова справки");
                return;
            }

            String typeOfSorting = args[0];

            if (typeOfSorting.equals("-h")) {
                System.out.println("Программа должна запускаться с параметрами:");
                System.out.println("-a - сотрировка по возрастанию");
                System.out.println("-b - сортировка по убыванию");
                System.out.println("file.txt - название файла с расширением.");
                System.out.println("Отсортированный файл будет находиться в файле sortedFile.txt");
                System.out.println("(будет перезаписан, если уже существует.)");
                return;
            }


            ArrayList<String> arrayFromFile = Reading.readToArray(args[1]);


            if (typeOfSorting.equals("-a")) {
                Sorting.sortArrayAscending(arrayFromFile);
                System.out.println("Файл отсортирован по возрастанию.");
            } else if (typeOfSorting.equals("-d")) {
                Sorting.sortArrayDescending(arrayFromFile);
                System.out.println("Файл отсортирован по убыванию.");
            } else {
                System.out.println("Вы должны выбрать \"-a\" или \"-d\", файл не отсортирован.");
                return;
            }

            Writing.writeToFile(arrayFromFile);


        } catch (IOException e) {
            System.out.printf("Что-то пошло не так. (Скорее всего не существует указанного файла %s)", args[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Файл содержит недопустимые символы.");
        } catch (Exception e) {
            System.out.println("У нас где-то проблема.");
        }
    }
}



package academit.artamonov2017.tsft;// Here is the main class for program

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        try {

            if (args.length == 0 || args.length < 4 || args.length > 4 || args[0].equals("-h")) {
                System.out.println("Вы должны передать аргументы для программы.");
                System.out.println("Программа должна запускаться с параметрами:");
                System.out.println("Первый аргумент - наименование сортируемого файла. (с расширением letters.txt)");
                System.out.println("Второй аргумент - наименование файла, в который будут помещены отсортированные данные. (output.txt). ");
                System.out.println("Файл будет перезаписан, если файла не существует, он будет создан.");
                System.out.println("Третий аргумент - тип сортируемого файла ( -s строки -i целые числа)");
                System.out.println("Четвертый аргумент - порядок сортировки ( -a сортировка в возрастанию -b сортировка по убыванию )");
                System.out.println("Пример: letters.txt output.txt -s -a");
                System.out.println("Напишите -h для вызова справки");
                return;
            }

            // get arguments to variables
            String nameOfInputFile = args[0];
            String typeOfFile = args[2];      // -i for integer, -s for strings
            String typeOfSorting = args[3];   // -a ascending  -d decreasing

            // reading input file
            ArrayList<Integer> arrayFromFileInt = new ArrayList<>();
            ArrayList<String> arrayFromFileSting = new ArrayList<>();
            if (typeOfFile.equals("-i")) {
                arrayFromFileInt = Reading.readToArrayInt(nameOfInputFile);
            } else if (typeOfFile.equals("-s")) {
                arrayFromFileSting = Reading.readToArrayString(nameOfInputFile);
            } else {
                System.out.println("Неверный аргумент для файла, вы должны выбрать -i или -s");
                return;
            }


            // sorting file
            if (typeOfFile.equals("-i")) {
                Sorting.sortIntArray(arrayFromFileInt, typeOfSorting);
            } else if (typeOfFile.equals("-s")) {
                Sorting.sortStringArray(arrayFromFileSting, typeOfSorting);
            } else {
                System.out.println("Вы должны выбрать \"-a\" или \"-d\", файл не отсортирован.");
                return;
            }

            String nameOfOutputFile = args[1];

            // writing file
            if (typeOfFile.equals("-i")) {
                Writing.writeIntToFile(arrayFromFileInt, nameOfOutputFile);
            } else if (typeOfFile.equals("-s")) {
                Writing.writeToFile(arrayFromFileSting, nameOfOutputFile);
            }


        } catch (IOException e) {
            System.out.printf("Не существует указанного файла %s", args[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Файл содержит недопустимые символы.");
        } catch (Exception e) {
            System.out.println("У нас где-то неопознанная проблема.");
        }
    }
}



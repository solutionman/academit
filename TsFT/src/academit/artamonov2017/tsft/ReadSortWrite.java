package academit.artamonov2017.tsft;// Here actually we will read, sort and write

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReadSortWrite {

    public static ArrayList<String> readToArray(String nameOfFile) {
        ArrayList<String> arrayForFile = new ArrayList();
        try (
                BufferedReader in = new BufferedReader(new FileReader(nameOfFile))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                arrayForFile.add(line);
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так. (Скорее всего не существует указанного файла)");
            System.exit(0);
        }

        return arrayForFile;
    }

    public static void sortArrayAscending(ArrayList<String> arrayForFile) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            for (int j = i; j < arrayForFile.size(); ++j) {
                char check = arrayForFile.get(i).charAt(0);
                if (Character.isDigit(check)) {
                    Integer firstNumber = Integer.parseInt(arrayForFile.get(i));
                    Integer secondNumber = Integer.parseInt(arrayForFile.get(j));
                    if (firstNumber > secondNumber) {
                        String temp = arrayForFile.get(i);
                        arrayForFile.set(i, arrayForFile.get(j));
                        arrayForFile.set(j, temp);
                    }
                } else if (Character.isLetter(check)) {
                    Character firstChar = arrayForFile.get(i).charAt(0);
                    Character secondChar = arrayForFile.get(j).charAt(0);
                    if (firstChar > secondChar) {
                        String temp = arrayForFile.get(i);
                        arrayForFile.set(i, arrayForFile.get(j));
                        arrayForFile.set(j, temp);
                    }
                } else {
                    System.out.println("Файл содержит недопустимые символы.");
                    return;
                }
            }
        }
    }

    public static void sortArrayDescending(ArrayList<String> arrayForFile) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            for (int j = i; j < arrayForFile.size(); ++j) {
                char check = arrayForFile.get(i).charAt(0);
                if (Character.isDigit(check)) {
                    Integer firstNumber = Integer.parseInt(arrayForFile.get(i));
                    Integer secondNumber = Integer.parseInt(arrayForFile.get(j));
                    if (firstNumber < secondNumber) {
                        String temp = arrayForFile.get(i);
                        arrayForFile.set(i, arrayForFile.get(j));
                        arrayForFile.set(j, temp);
                    }
                } else if (Character.isLetter(check)) {
                    Character firstChar = arrayForFile.get(i).charAt(0);
                    Character secondChar = arrayForFile.get(i).charAt(0);
                    if (firstChar < secondChar) {
                        String temp = arrayForFile.get(i);
                        arrayForFile.set(i, arrayForFile.get(j));
                        arrayForFile.set(j, temp);
                    }
                } else {
                    System.out.println("Файл содержит недопустимые символы.");
                }
            }
        }
    }

    public static void writeToFile(ArrayList<String> sortedFile) {
        try (PrintWriter out = new PrintWriter("sortedFile.txt")) {
            for (int i = 0; i < sortedFile.size(); ++i) {
                out.write(sortedFile.get(i) + "\n");
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }
    }
}

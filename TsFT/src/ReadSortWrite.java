// Here actually we will read, sort and write

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
            System.out.println("Something goes wrong. (Seems like there's no such file)");
        }

        return arrayForFile;
    }

    public static void sortArrayAscending(ArrayList<String> arrayForFile) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            for (int j = i; j < arrayForFile.size(); ++j) {
                Integer firstNumber = Integer.parseInt(arrayForFile.get(i));
                Integer secondNumber = Integer.parseInt(arrayForFile.get(j));
                if (firstNumber > secondNumber) {
                    String temp = arrayForFile.get(i);
                    arrayForFile.set(i, arrayForFile.get(j));
                    arrayForFile.set(j, temp);
                }
            }
        }
    }

    public static void sortArrayDescending(ArrayList<String> arrayForFile) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            for (int j = i; j < arrayForFile.size(); ++j) {
                Integer firstNumber = Integer.parseInt(arrayForFile.get(i));
                Integer secondNumber = Integer.parseInt(arrayForFile.get(j));
                if (firstNumber < secondNumber) {
                    String temp = arrayForFile.get(i);
                    arrayForFile.set(i, arrayForFile.get(j));
                    arrayForFile.set(j, temp);
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
            System.out.println("Something goes wrong.");
        }
    }
}

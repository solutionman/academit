package academit.artamonov2017.tsft;// Here actually we will read, sort and write

import java.io.*;
import java.util.ArrayList;

public class ReadSortWrite {

    public static ArrayList<String> readToArray(String nameOfFile) throws IOException {
        ArrayList<String> arrayForFile = new ArrayList<>();
        try (
                BufferedReader in = new BufferedReader(new FileReader(nameOfFile))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                arrayForFile.add(line);
            }
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
                    throw new IllegalArgumentException();
                    //System.out.println("Файл содержит недопустимые символы.");
                    //return;
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

    public static void writeToFile(ArrayList<String> sortedFile) throws Exception {
        try (PrintWriter out = new PrintWriter("sortedFile.txt")) {
            for (String line : sortedFile) {
                out.write(line + System.getProperty("line.separator"));
            }
        }
    }
}

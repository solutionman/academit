// Here we will sort our array

package academit.artamonov2017.tsft;

import java.util.ArrayList;

public class Sorting {

    public static void sortIntArray(ArrayList<Integer> arrayForFile, String typeOfSorting) {
        if (typeOfSorting.equals("-a")) {
            for (int i = 1; i < arrayForFile.size(); ++i) {
                int temp = arrayForFile.get(i);
                int j;
                for (j = i - 1; j >= 0 && temp < arrayForFile.get(j); --j) {
                    arrayForFile.set(j + 1, arrayForFile.get(j));
                }
                arrayForFile.set(j + 1, temp);
            }
        }

        if (typeOfSorting.equals("-d")) {
            for (int i = 1; i < arrayForFile.size(); ++i) {
                int temp = arrayForFile.get(i);
                int j;
                for (j = i - 1; j >= 0 && temp > arrayForFile.get(j); --j) {
                    arrayForFile.set(j + 1, arrayForFile.get(j));
                }
                arrayForFile.set(j + 1, temp);
            }
        }
    }

    public static void sortStringArray(ArrayList<String> arrayFromFile, String typeOfSorting) {
        if (typeOfSorting.equals("-a")) {
            for (int i = 1; i < arrayFromFile.size(); ++i) {
                String temp = arrayFromFile.get(i);
                int j;
                for (j = i - 1; j >= 0 && temp.compareTo(arrayFromFile.get(j)) < 0; --j) {
                    //debug
                    System.out.printf(" %s > %s", arrayFromFile.get(j), arrayFromFile.get(i));
                    System.out.println();
                    //String temp = arrayFromFile.get(i);
                    arrayFromFile.set(j + 1, arrayFromFile.get(j));
                    //arrayFromFile.set(j, temp);
                }
                arrayFromFile.set(j + 1, temp);
            }

            // debugging
            for (int i = 0; i < arrayFromFile.size(); ++i) {
                System.out.println(arrayFromFile.get(i));
            }
        }

        if (typeOfSorting.equals("-d")) {
            for (int i = 1; i < arrayFromFile.size(); ++i) {
                String temp = arrayFromFile.get(i);
                int j;
                for (j = i - 1; j >= 0 && temp.compareTo(arrayFromFile.get(j)) > 0; --j) {
                    arrayFromFile.set(j + 1, arrayFromFile.get(j));
                }
                arrayFromFile.set(j + 1, temp);
            }
        }
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
                    throw new IllegalArgumentException();
                    // System.out.println("Файл содержит недопустимые символы.");
                }
            }
        }
    }
}


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
                    arrayFromFile.set(j + 1, arrayFromFile.get(j));
                }
                arrayFromFile.set(j + 1, temp);
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

}


// Here we will sort our array

package academit.artamonov2017.tsft;

import java.util.ArrayList;

public class Sorting {

    public static void sortIntArray(ArrayList<Integer> arrayForFile, String typeOfSorting){
        for(int i= 0; i < arrayForFile.size(); ++i){

        }
    }

    public static void sortStringArray(ArrayList<String> arrayFromFile,String typeOfSorting ){
        if(typeOfSorting.equals("-a")) {
            for (int i = 0; i < arrayFromFile.size(); ++i) {
                for (int j = i; j < arrayFromFile.size(); ++j) {
                    if (arrayFromFile.get(i).compareTo(arrayFromFile.get(j)) == 1) {
                        String temp = arrayFromFile.get(i);
                        arrayFromFile.set(i, arrayFromFile.get(j));
                        arrayFromFile.set(j, temp);
                    }
                }
            }
            // debugging
            for(int i = 0; i < arrayFromFile.size(); ++i){
                System.out.println(arrayFromFile.get(i));
            }
        }

        if(typeOfSorting.equals("-d")){
            for (int i = 0; i < arrayFromFile.size(); ++i) {
                for (int j = 0; j < arrayFromFile.size(); ++j) {
                    if (arrayFromFile.get(i).compareTo(arrayFromFile.get(j)) == -1) {

                    }
                }
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


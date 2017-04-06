package academit.artamonov2017.tsft;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingGeneric {

    public static <T> void sortArray(ArrayList<T> arrayForFile, Comparator<T> comparator) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            int minIndex = i;
            for (int j = i + 1; j < arrayForFile.size(); ++j) {
                if (comparator.compare(arrayForFile.get(j), arrayForFile.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            T temp = arrayForFile.get(i);
            arrayForFile.set(i, arrayForFile.get(minIndex));
            arrayForFile.set(minIndex, temp);
        }
    }

    public static <T> void sortArray2(ArrayList<T> arrayForFile, Comparator<T> comparator) {
        for (int i = 0; i < arrayForFile.size(); ++i) {
            T temp = arrayForFile.get(i);
            int j;
            for (j = i - 1; j > 0 && comparator.compare(temp, arrayForFile.get(j)) < 0; --j) {
                arrayForFile.set(j + 1, arrayForFile.get(j));
            }
            arrayForFile.set(j + 1, temp);
        }
    }
}



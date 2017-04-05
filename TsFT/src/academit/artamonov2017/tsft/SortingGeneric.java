package academit.artamonov2017.tsft;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingGeneric{

    public static <T> void sortArray(ArrayList<T> arrayForFile, Comparator<T> comparator){
        for(int i = 0; i < arrayForFile.size(); ++i){
            T temp = arrayForFile.get(i);
            int j;
            for(j = i -1; j > 0 && comparator.compare(temp, arrayForFile.get(j)) > 0; --j){
                arrayForFile.set(j + 1, arrayForFile.get(j));
            }
            arrayForFile.set(j +1, temp);
        }
    }
}



package academit.artamonov2017.tsft;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.util.ArrayList;

public class Writing {

    public static void writeToFile(ArrayList<?> sortedFile, String nameOfOutputFile) throws FileNotFoundException{
        try (PrintWriter out = new PrintWriter(nameOfOutputFile)) {
            for (Object symbol : sortedFile) {
                out.println(symbol.toString());
            }
        }
    }
}


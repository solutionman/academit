package academit.artamonov2017.tsft;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {

    public static void writeToFile(ArrayList<?> sortedFile, String nameOfOutputFile) throws Exception {
        try (PrintWriter out = new PrintWriter(nameOfOutputFile)){
            for(Object symbol : sortedFile){
                out.println(symbol.toString());
            }
        }
    }
}


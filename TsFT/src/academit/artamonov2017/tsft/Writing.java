package academit.artamonov2017.tsft;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {

    public static void writeIntToFile(ArrayList<Integer> sortedFile, String nameOfOutputFile){

    }

    public static void writeStringToFile(ArrayList<String> sortedFile, String nameOfOutputFile) throws Exception {
        try (PrintWriter out = new PrintWriter("sortedFile.txt")) {
            for (String line : sortedFile) {
                out.write(line + System.getProperty("line.separator"));
            }
        }
    }
}

package academit.artamonov2017.tsft;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {
    public static void writeToFile(ArrayList<String> sortedFile) throws Exception {
        try (PrintWriter out = new PrintWriter("sortedFile.txt")) {
            for (String line : sortedFile) {
                out.write(line + System.getProperty("line.separator"));
            }
        }
    }
}

package academit.artamonov2017.tsft;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {

    public static void writeIntToFile(ArrayList<Integer> sortedFile, String nameOfOutputFile) throws Exception {
        try (PrintWriter out = new PrintWriter(nameOfOutputFile)) {
            for (Integer number : sortedFile) {
                out.write(new Integer(number).toString() + System.getProperty("line.separator"));
            }
        }
    }

    public static void writeStringToFile(ArrayList<String> sortedFile, String nameOfOutputFile) throws Exception {
        try (PrintWriter out = new PrintWriter(nameOfOutputFile)) {
            for (String line : sortedFile) {
                out.write(line + System.getProperty("line.separator"));
            }
        }
    }

    public static void writeToFile(ArrayList<?> sortedFile, String nameOfOutputFile) throws Exception {
        try (PrintWriter out = new PrintWriter(nameOfOutputFile)){
            for(Object symbol : sortedFile){
                out.println(symbol.toString());
            }
        }
    }
}

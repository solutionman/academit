package academit.artamonov2017.tsft;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {

    public static void writeIntToFile(ArrayList<Integer> sortedFile, String nameOfOutputFile) throws Exception{
        try(PrintWriter out = new PrintWriter(nameOfOutputFile) ){
            for(Integer number : sortedFile){
                //out.write(number);
                //out.write(" ");
                //out.write(number + System.getProperty("Line.separator"));
                out.write(new Integer(number).toString());
                //debug
                System.out.println(number);

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
}

import java.io.*;

public class CSVtoHTML {
    public static void convertCSVHTML (String filenameCSV, String filenameHTML){

        try(
                BufferedReader in = new BufferedReader(new FileReader(filenameCSV));
            PrintWriter out = new PrintWriter(filenameHTML)) {
            //BufferedReader in = new BufferedReader(new FileReader(filenameCSV));
            //PrintWriter out = new PrintWriter(filenameHTML);

            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"ru-RU\">");
            out.println("<head>");
            out.println("<title>");
            out.printf("Page converted from %s file", filenameCSV);
            out.println();
            out.println("</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<head>");
            out.println("<body>");


            out.println("</body>");
            out.println("</html>");
        } catch(FileNotFoundException e){
            System.out.println("No file");
        } catch(IOException e){

        }
    }
}

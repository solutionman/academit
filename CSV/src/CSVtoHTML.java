import java.io.*;

public class CSVtoHTML {
    public static void convertCSVHTML(String filenameCSV, String filenameHTML) {

        try (
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
            out.println("<table border=\"1\">");

            String line;

            boolean replace = true;

            while ((line = in.readLine()) != null) {

                if(replace) {
                    out.print("<tr>");
                    out.print("<td>");
                }

                String lineForHTML = line.replace("&", "&amp").replace("<", "&lt").replace(">", "&gt");

                String finalLineForHTML = "";

                for (int i = 0; i < lineForHTML.length(); ++i) {
                    if(i == 0 && lineForHTML.charAt(0) == '"'){
                        replace = false;
                    }

                    if(lineForHTML.charAt(i) == ',' && i > 0 && lineForHTML.charAt(i - 1) == '"'){
                        replace = true;
                    }

                    if(lineForHTML.charAt(i) == '"' && i > 0 && lineForHTML.charAt(i-1) == ','){
                        replace = false;
                    }


                    if (lineForHTML.charAt(i) == ',' && replace) {
                        lineForHTML = lineForHTML.substring(0, i) + "</td><td>" + lineForHTML.substring(i + 1);
                    }

                }

                out.println(lineForHTML);

                if(replace) {
                    out.print("</td>");
                    out.println("</tr>");
                }
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}


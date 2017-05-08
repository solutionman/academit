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
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=\"1\">");

            String line;

            boolean replace = true;
            boolean addBr = false;
            boolean keepOriginal = false;
            String forCropping = "";
            int startCropping;
            int stopCropping;
            String finalLineForHtml = "";

            while ((line = in.readLine()) != null) {

                if(!keepOriginal) {
                    out.print("<tr>");
                    out.print("<td>");
                }

                String lineForHTML = line.replace("&", "&amp").replace("<", "&lt").replace(">", "&gt");

                for (int i = 0; i < lineForHTML.length(); ++i) {

                    // if "  at the beginning, keep the original chars
                    if(i == 0 && lineForHTML.charAt(0) == '"'){
                        keepOriginal = true;
                        startCropping = i + 1;
                        continue;
                    }

                    // if ," somewhere in the middle of table, keep original
                    if(lineForHTML.charAt(i) < lineForHTML.length() && lineForHTML.charAt(i) == ',' && lineForHTML.charAt(i + 1) == '"'){
                        keepOriginal = true;
                    }

                    // if ", somewhere in the table, begin to replace , with </td><td>
                    if(i != 0 && lineForHTML.charAt(i) == ',' && lineForHTML.charAt(i - 1) == '"'){
                        keepOriginal = false;
                    }

                    // return to loop, and keep original chars
                    if(keepOriginal){
                        //forCropping = forCropping + lineForHTML.charAt(i);
                        continue;
                    }


                    if (lineForHTML.charAt(i) == ',') {
                        lineForHTML = lineForHTML.substring(0, i) + "</td><td>" + lineForHTML.substring(i + 1);
                    }

                    // add <br>
                    if(lineForHTML.charAt(i) == lineForHTML.length() && lineForHTML.charAt(i) != '"'){
                        lineForHTML = lineForHTML.substring(i) + "<br>";
                    }
                }

                out.println(lineForHTML);

                if(!keepOriginal) {
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


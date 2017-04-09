// Convert CSV to HTML

import java.io.*;

public class FromCSVtoHTML {

    public static void convertScvToHTML(String filenameCSV, String filenameHTML) {
        try (
                BufferedReader in = new BufferedReader(new FileReader(filenameCSV));

                PrintWriter out = new PrintWriter(filenameHTML)
        ) {

            String line;

            out.write("<!DOCTYPE html><html lang=\"ru-RU\"><head><title>Page converted from csv file </title><meta charset=\"UTF-8\"></head><body><table border=\"1\">");


            boolean shouldReplace = true;
            while ((line = in.readLine()) != null) {

                if (shouldReplace) {
                    out.write("<tr>");
                    out.write("<td>");
                }

                String lineForHTML = line.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");


                boolean addBr = false;

                for (int i = 0; i < lineForHTML.length(); ++i) {
                    if (lineForHTML.charAt(i) == '"' && shouldReplace) {
                        shouldReplace = false;
                    } else if (lineForHTML.charAt(i) == '"' && !shouldReplace) {
                        shouldReplace = true;
                    }

                    if (lineForHTML.charAt(i) == ',' && shouldReplace) {
                        lineForHTML = lineForHTML.substring(0, i) + "</td><td>" + lineForHTML.substring(i + 1);
                    }

                    if (lineForHTML.charAt(i) == lineForHTML.length() - 1 && !shouldReplace) {
                        addBr = true;
                    }

                    if (!shouldReplace && (i == lineForHTML.length() - 1)) {
                        addBr = true;
                    }

                }


                if (addBr) {
                    lineForHTML = lineForHTML + "<br />";
                }

                String finalLineForHTML = lineForHTML.replace("\"", "");


                out.write(finalLineForHTML);
                if (shouldReplace) {
                    out.write("</td>");
                    out.write("</tr>");
                }
            }

            out.write("</table></body></html>");

        } catch (FileNotFoundException e) {
            System.out.println("No file for reading.");
        } catch (IOException ex){
            System.out.println("IOException");
        } catch (Exception e){
            System.out.println("Exception");
        }
    }
}

// Convert CSV to HTML

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        String filenameCSV = "TableCSVForReading.csv";
        String filenameHTML = "TableForHTMLOutput.html";

        //FromCSVtoHTML.convertScvToHTML(filenameCSV, filenameHTML);
        CSVtoHTML.convertCSVHTML(filenameCSV, filenameHTML);

    }
}

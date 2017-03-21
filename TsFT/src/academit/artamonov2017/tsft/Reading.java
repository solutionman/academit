package academit.artamonov2017.tsft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reading {

    public static ArrayList<Integer> readToArrayInt(String nameOfFile) throws IOException{
        ArrayList<Integer> arrayFromFile = new ArrayList<>();
        try(
                BufferedReader in = new BufferedReader(new FileReader(nameOfFile))
                ){
            String number;
            while((number = in.readLine()) != null){
                arrayFromFile.add(Integer.parseInt(number));
            }
        }
        return  arrayFromFile;
    }

    public static ArrayList<String> readToArrayString(String nameOfFile) throws IOException {
        ArrayList<String> arrayForFile = new ArrayList<>();
        try (
                BufferedReader in = new BufferedReader(new FileReader(nameOfFile))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                arrayForFile.add(line);
            }
        }
        return arrayForFile;
    }

}

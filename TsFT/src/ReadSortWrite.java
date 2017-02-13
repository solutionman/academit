// Here actually we will read, sort and write

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadSortWrite {
    public static void readSortWrite (String nameOfFile, String typeOfSorting){
        try (
                BufferedReader in = new BufferedReader(new FileReader(nameOfFile))
        ) {
            String line, line2;
            while((line = in.readLine()) != null){
                while((line2 = in.readLine()) != null){

                    String temp;
                    if(line.length() < line2.length()){
                        
                    }

                }
            }
        } catch(Exception e){
            System.out.println("Something goes wrong. (Seems like there's no such file)");
        }
    }
}

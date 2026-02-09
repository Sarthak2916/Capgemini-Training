package feature_9_2_26;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class SearchRecord {

    public static void main(String[] args) {

        try(CSVReader reader= new CSVReader( new FileReader("src/feature_9_2_26/employees.csv"));){

            String name="Yennefer";

            String nextLine[];

            while((nextLine=reader.readNext())!=null){
                if(nextLine[1].equals(name)){
                    System.out.println(nextLine[2]+" "+nextLine[3]);
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}

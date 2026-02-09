package feature_9_2_26;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CountRecords {

    public static void main(String[] args) {

        try(CSVReader reader= new CSVReader(new FileReader("src/feature_9_2_26/employees.csv"));){

            int count=0;

            while(reader.readNext()!=null){
                count++;
            }

            System.out.println("No. of Records: "+--count);

        } catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}

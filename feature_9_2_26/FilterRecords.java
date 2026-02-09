package feature_9_2_26;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {

    public static void main(String[] args) {

        try(CSVReader reader= new CSVReader(new FileReader("src/feature_9_2_26/employees.csv"));){

            String[] nextLine;

            System.out.println("Qualifying Records: ");

            while((nextLine=reader.readNext())!=null){
                if(nextLine[0].equals("ID")) continue;
                int salary=Integer.parseInt(nextLine[3]);
                if(salary>8000){
                    String record= nextLine[0]+" "+nextLine[1]+" "+nextLine[2]+" "+nextLine[3];
                    System.out.println(record);
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}

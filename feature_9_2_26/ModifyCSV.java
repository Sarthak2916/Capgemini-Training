package feature_9_2_26;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSV {

    public static void main(String[] args) {

        try(
                CSVReader reader= new CSVReader(new FileReader("src/feature_9_2_26/employees.csv"));
                CSVWriter writer= new CSVWriter(new FileWriter("src/feature_9_2_26/updatedEmployees.csv"));
                ){

            String nextLine[];

            while((nextLine=reader.readNext())!=null){
                if(nextLine[0].equals("ID")){
                    writer.writeNext(nextLine);
                    continue;
                }
                if(nextLine[2].equals("Hunting")){
                    int salary=Integer.parseInt(nextLine[3]);
                    nextLine[3]=String.valueOf(salary+(salary/10));
                }
                writer.writeNext(nextLine);
            }


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

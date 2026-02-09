package feature_9_2_26;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        try(CSVWriter writer= new CSVWriter(new FileWriter("src/feature_9_2_26/employees.csv",true));){

            writer.writeNext(new String[]{"ID","Name","Department","Salary"});
            writer.writeNext(new String[]{"104","Geralt","Hunting","6000"});
            writer.writeNext(new String[]{"105","Yennefer","Sorcery","12000"});
            writer.writeNext(new String[]{"106","Triss","Sorcery","10000"});
            writer.writeNext(new String[]{"107","Djikstra","Merchant","15000"});
            writer.writeNext(new String[]{"108","Ciri","Hunting","5000"});


        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

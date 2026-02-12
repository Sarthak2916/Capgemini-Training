package feature_12_2_26;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJson {

    public static void main(String[] args) {

        try{

        ObjectMapper mapper= new ObjectMapper();

        User[] users= mapper.readValue(new File("src/feature_12_2_26/JsonData2.json"),User[].class);

        for(User user: users){
            if(user.age>25){
                System.out.println(user.name+" "+user.email);
            }
        }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

package feature_12_2_26;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonValidation {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            File f= new File("src/feature_12_2_26/JsonData.json");
            User user = mapper.readValue(f, User.class);
            mapper.readTree(f);
            System.out.println("JSON matches User structure");
        } catch (Exception e) {
            System.out.println("JSON structure is invalid");
        }
    }
}


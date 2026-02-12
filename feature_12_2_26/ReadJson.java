package feature_12_2_26;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJson {

    public static void main(String[] args) {


        try{

            ObjectMapper mapper= new ObjectMapper();
            User user= mapper.readValue(new File("src/feature_12_2_26/JsonData.json"),User.class);

            System.out.println(user.name+" "+user.age+" "+user.email);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

class User{

    public String name;
    public int age;
    public String email;

    User(){}

//    public String getName() { return name; }
//    public int getAge() { return age; }
//    public String getEmail() { return email; }
}

package feature_12_2_26;

import Assignment.Student;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ObjectToJson {

    public static void main(String[] args) {

        Car c= new Car("BMW","black",10000000);

        Gson gson= new Gson();
        String json= gson.toJson(c);
        System.out.println(json);
    }
}

class Car{

    String name;
    String color;
    long price;

    Car(String name, String color, long price){
        this.name= name;
        this.color= color;
        this.price= price;
    }
}

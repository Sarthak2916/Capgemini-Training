package feature_12_2_26;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObjectStudent {

    public static void main(String[] args) {

        JSONObject student= new JSONObject();

        student.put("name","Sarthak");
        student.put("age",22);

        JSONArray subjects= new JSONArray();
        subjects.put("Maths");
        subjects.put("Science");
        subjects.put("English");

        student.put("subjects",subjects);

        System.out.println(student);

    }
}

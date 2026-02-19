package feature_19_2_26;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    public static void main(String[] args) {

        Youtube t= new Tseries();
        A a= new A("Sarthak");
        t.register(a);
        t.sendNotification();
    }
}

interface Youtube{

    void register(Users u);
    void delete(Users u);
    void sendNotification();
}

class Tseries implements Youtube{

    List<Users> users= new ArrayList<>();
    public void register(Users u){
        users.add(u);
    }
    public void delete(Users u){
        users.remove(u);
    }
    public void sendNotification(){
        for(Users user: users){
            user.notify("new song released");
        }
    };
}

interface Users{

    void notify(String a);

}

class A implements Users{

    String name;
    public A(String name){
        this.name= name;
    }
    public void notify(String a){
        System.out.println(name+" "+a);
    }
}

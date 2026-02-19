package feature_19_2_26;

public class AbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractFactory factory= new AbstractFactory();

        factory.getFactory("toyota").getCar("fortuner").speed();
        factory.getFactory("tata").getCar("sierra").engine();

    }
}

class AbstractFactory{

    MegaFactory f;

    MegaFactory getFactory(String a){
        if(a.equals("toyota")) f=new Toyota();
        else if(a.equals("tata")) f= new Tata();
        else if(a.equals("hyundai")) f= new Hyundai();
        return f;
    }

}

interface MegaFactory{

    Car getCar(String a);
}

class Toyota implements MegaFactory{

    Car c;
    public Car getCar(String a){
        if(a.equals("fortuner")) c=new Fortuner();
        else if(a.equals("innova")) c=new Innova();
        return c;
    }
}

class Tata implements MegaFactory{

    Car c;
    public Car getCar(String a){
        if(a.equals("harrier")) c=new Harrier();
        else if(a.equals("sierra")) c=new Sierra();
        return c;
    }
}

class Hyundai implements MegaFactory{

    Car c;
    public Car getCar(String a){
        if(a.equals("creta")) c=new Creta();
        return c;
    }
}

interface Car{

    void speed();
    void engine();
}

class Fortuner implements Car{

    public void speed(){
        System.out.println("120 km/h");
    }
    public void engine(){
        System.out.println("1200CC");
    }
}

class Innova implements Car{

    public void speed(){
        System.out.println("100 km/h");
    }
    public void engine(){
        System.out.println("1000CC");
    }
}

class Harrier implements Car{

    public void speed(){
        System.out.println("140 km/h");
    }
    public void engine(){
        System.out.println("1100CC");
    }
}

class Sierra implements Car{

    public void speed(){
        System.out.println("160 km/h");
    }
    public void engine(){
        System.out.println("1500CC");
    }
}

class Creta implements Car{

    public void speed(){
        System.out.println("120 km/h");
    }
    public void engine(){
        System.out.println("1200CC");
    }

}


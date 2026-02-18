package feature_18_2_26;

public class FactoryPattern {

    public static void main(String[] args) {

        MilkFactory curd= MilkFactory.getItem("curd");
        curd.taste();

        MilkFactory cheese= MilkFactory.getItem("cheese");
        cheese.taste();
    }
}

abstract class MilkFactory{

    abstract void taste();
    static MilkFactory getItem(String s){
        if(s.equals("cheese")) return new Cheese();
        if(s.equals("curd")) return new Curd();
        return new Rabdi();
    }

}

class Cheese extends MilkFactory{

    void taste(){
        System.out.println("Cheese very tasty");
    }

}

class Curd extends MilkFactory{

    void taste(){
        System.out.println("Curd very tasty");
    }

}

class Rabdi extends MilkFactory{

    void taste(){
        System.out.println("Rabdi very tasty");
    }

}

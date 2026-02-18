package feature_18_2_26;

public class SingletonPattern {

    public static void main(String[] args) {

        Singleton x= Singleton.getInstance();
        Singleton y= Singleton.getInstance();

    }
}

class Singleton{

    private static Singleton p;

    private Singleton(){}

    static Singleton getInstance(){  // Lazy Loading
        if(p==null) p= new Singleton();
        return p;
    }
}

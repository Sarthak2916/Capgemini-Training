package feature_18_2_26;

public class ISP_followed {

    public static void main(String[] args) {

        HumanWorker_ w1= new HumanWorker_();
        RobotWorker_ w2= new RobotWorker_();
        w1.eat();
        w1.work();
        w2.work();
    }
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker_ implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker_ implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}


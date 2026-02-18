package feature_18_2_26;

public class ISP_violated {

    public static void main(String[] args) {

        Worker w1= new HumanWorker();
        Worker w2= new RobotWorker();
        w1.eat();
        w2.eat();
    }
}

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() { // robot is forced to implement eat() method even though robots don't eat.
    }
}


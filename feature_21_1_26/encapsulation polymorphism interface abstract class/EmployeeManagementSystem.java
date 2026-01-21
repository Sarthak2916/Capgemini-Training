package feature_21_1_26.encapsulation_polymorphism_interface_abstractclass;

public class EmployeeManagementSystem{

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101,"Bruce", 200000, 100000);
        Employee e2 = new PartTimeEmployee(102,"Clark", 200000, 200,500);
        e1.assignDepartMent("Technical");
        e2.assignDepartMent("Sales");
        e1.displayDetails();
        e2.displayDetails();
    }
}

interface Department{

    void assignDepartMent(String deptName);
    String getDepartmentDetails();
}
abstract class Employee implements Department{

    private int employeeId;
    private String name;
    private double baseSalary;

    private String deptName;

    Employee(int employeeId, String name, double baseSalary){
        this.employeeId= employeeId;
        this.name= name;
        this.baseSalary= baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public void assignDepartMent(String deptName) {
        this.deptName= deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: "+deptName;
    }

    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println(getDepartmentDetails());
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee{

    private int workHours;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate){
        super(employeeId, name, baseSalary);
        this.workHours= workHours;
        this.hourlyRate= hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + (workHours*hourlyRate);
    }
}

class FullTimeEmployee extends Employee{

    private double fixedSalary;

    FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary){
        super(employeeId, name, baseSalary);
        this.fixedSalary= fixedSalary;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
}

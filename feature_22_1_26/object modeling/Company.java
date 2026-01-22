package feature_22_1_26.object_modeling;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments;

    public Company(String companyName){
        this.companyName= companyName;
        departments= new ArrayList<>();
    }

    void addDepartment(Department department){
        if(!departments.contains(department)) departments.add(department);
    }
    void viewDepartments(){
        System.out.println("All Dept.s of Company "+companyName);
        for(Department d: departments){
            System.out.println(d.departmentName);
        }
    }
    

}
class Department{

    String departmentName;
    ArrayList<Employee> employees;

    public Department(String departmentName){
        this.departmentName= departmentName;
        employees= new ArrayList<>();
    }

    void addEmployee(Employee employee){
        if(!employees.contains(employee)) employees.add(employee);
    }
    void viewEmployees(){
        System.out.println("All Employees of Dept. "+departmentName);
        for(Employee e: employees){
            System.out.println("ID: "+e.employeeId+"| Name: "+e.employeeName);
        }
    }


}
class Employee{

    int employeeId;
    String employeeName;

    Employee(int employeeId, String employeeName){
        this.employeeId= employeeId;
        this.employeeName= employeeName;
    }
}

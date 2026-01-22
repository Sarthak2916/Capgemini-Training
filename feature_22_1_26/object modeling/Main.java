package feature_22_1_26.object_modeling;

public class Main {

    public static void main(String[] args) {

        Book b1= new Book("The Last Wish","Andzrej sokwoski");
        Book b2= new Book("Harry Potter", "J.K Rowling");
        b1.displayBook();
        b2.displayBook();

        Library l1 = new Library("National Library");
        l1.addBook(b1);
        l1.addBook(b2);
        l1.displayBooks();

        Bank bank= new Bank("ICICI");
        Customer c1= new Customer(101,"Sarthak");
        Account a1= new Account(256827389,2300);
        c1.addAccount(a1);
        bank.openAccount(c1,a1);
        c1.viewBalance();

        Company company= new Company("BigG");
        Department d1= new Department("Technical");
        Department d2= new Department("Sales");
        Employee e1= new Employee(101,"Geralt");
        Employee e2= new Employee(102, "Yennefer");
        Employee e3= new Employee(103, "Triss");

        company.addDepartment(d1);
        company.addDepartment(d2);
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d2.addEmployee(e3);

        company.viewDepartments();

        School school= new School("Wolf");
        Student s1= new Student(1,"Geralt");
        Student s2= new Student(2,"Yennefer");
        school.addStudent(s1);
        school.addStudent(s2);
        Course co1= new Course(101, "witcher");
        Course co2= new Course(102, "Sorcery");
        s1.addCourse(co1);
        s2.addCourse(co2);
        s1.viewCourses();
        co1.viewStudents();



    }
}

package feature_22_1_26.object_modeling;

import java.util.ArrayList;

public class School {

    String schoolName;
    ArrayList<Student> students;

    School(String schoolName){
        this.schoolName= schoolName;
        students= new ArrayList<>();
    }

    void addStudent(Student s1){
        students.add(s1);
    }
    void viewStudents(){
        System.out.println("Students in this School: ");
        for(Student s: students){
            System.out.println(s.name);
        }
    }
}

class Student{

    int id;
    String name;
    ArrayList<Course> courses;

    Student(int id, String name){
        this.id= id;
        this.name=name;
        courses= new ArrayList<>();
    }

    void addCourse(Course co1){
        if(!courses.contains(co1)){
            courses.add(co1);
            co1.addStudent(this);
        }
    }
    void viewCourses(){
        System.out.println("Courses opted by Student "+name);
        for(Course c: courses){
            System.out.println("Course Code: "+c.courseCode+" | Course Name: "+c.courseName);
        }
    }

}

class Course{

    int courseCode;
    String courseName;
    ArrayList<Student> students;

    Course(int courseCode, String courseName){
        this.courseCode= courseCode;
        this.courseName= courseName;
        students= new ArrayList<>();
    }

    void addStudent(Student s1){
        if(!students.contains(s1)){
            students.add(s1);
            s1.addCourse(this);
        }
    }
    void viewStudents(){
        System.out.println(courseName+" Course opted by students");
        for(Student s: students){
            System.out.println(s.name);
        }
    }

}

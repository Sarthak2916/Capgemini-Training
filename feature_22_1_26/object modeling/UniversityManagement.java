package feature_22_1_26.object_modeling;

import java.util.ArrayList;

class Course2 {
    private String courseId;
    private String courseName;
    private Professor professor;
    private ArrayList<Student2> students;

    public Course2(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Student2> getStudents() {
        return students;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        if (professor != null) {
            professor.addCourse(this);
        }
    }

    public void addStudent(Student2 student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Professor: " + (professor == null ? "Not Assigned" : professor.getProfessorName()));
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled");
        } else {
            for (Student2 s : students) {
                System.out.println("- " + s.getStudentName());
            }
        }
    }
}

class Student2 {
    private int studentId;
    private String studentName;
    private ArrayList<Course2> courses;

    public Student2(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Course2> getCourses() {
        return courses;
    }

    public void enrollCourse(Course2 course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Courses Enrolled:");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled");
        } else {
            for (Course2 c : courses) {
                System.out.println("- " + c.getCourseName());
            }
        }
    }
}

class Professor {
    private int professorId;
    private String professorName;
    private ArrayList<Course2> courses;

    public Professor(int professorId, String professorName) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public ArrayList<Course2> getCourses() {
        return courses;
    }

    public void addCourse(Course2 course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
        }
    }

    public void displayProfessorDetails() {
        System.out.println("Professor ID: " + professorId);
        System.out.println("Professor Name: " + professorName);
        System.out.println("Courses Teaching:");
        if (courses.isEmpty()) {
            System.out.println("No courses assigned");
        } else {
            for (Course2 c : courses) {
                System.out.println("- " + c.getCourseName());
            }
        }
    }
}

public class UniversityManagement {
}

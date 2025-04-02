package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;
    private List<Student> studentsEnrolled;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }
    public void enrollStudent(Student student) {
        studentsEnrolled.add(student);
    }
    public void displayEnrolledStudents() {
        System.out.println("\nCourse: " + courseName + " | Enrolled Students:");
        for (Student student : studentsEnrolled) {
            System.out.println(" - " + student.getStudentName());
        }
    }
    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String studentName;
    private List<Course> coursesEnrolled;

    public Student(String studentName) {
        this.studentName = studentName;
        this.coursesEnrolled = new ArrayList<>();
    }
    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
        course.enrollStudent(this);
    }
    public void displayEnrolledCourses() {
        System.out.println("\nStudent: " + studentName + " | Enrolled Courses:");
        for (Course course : coursesEnrolled) {
            System.out.println(" - " + course.getCourseName());
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
class School {
    private String schoolName;
    private List<Student> students;
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayStudents() {
        System.out.println("\nSchool: " + schoolName + " | Students List:");
        for (Student student : students) {
            System.out.println(" - " + student.getStudentName());
        }
    }
}
public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("Springfield High");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(science);
        student2.enrollInCourse(history);
        school.addStudent(student1);
        school.addStudent(student2);
        school.displayStudents();
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}

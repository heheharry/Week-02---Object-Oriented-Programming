package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled at " + universityName + ": " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("\nStudent Details:");
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + rollNumber + " to " + grade);
        }
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student.displayTotalStudents();
        Student student1 = new Student("Alice Johnson", 101, 'A');
        Student student2 = new Student("Bob Smith", 102, 'B');
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student2.updateGrade('A');
        student2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}

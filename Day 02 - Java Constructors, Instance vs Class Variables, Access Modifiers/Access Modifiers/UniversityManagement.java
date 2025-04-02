package Day2.AccessModifiers;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String specialization;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }
    public void displayPGDetails() {
        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.8);
        student1.displayDetails();
        student1.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        PostgraduateStudent pgStudent = new PostgraduateStudent(202, "Bob", 4.0, "Computer Science");
        pgStudent.displayPGDetails();
    }
}

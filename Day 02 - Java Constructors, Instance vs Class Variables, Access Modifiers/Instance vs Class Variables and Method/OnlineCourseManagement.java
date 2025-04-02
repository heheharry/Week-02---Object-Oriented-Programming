package Day2.InstanceVSClassVariablesAndMethod;
class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Global Academy";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 10, 500.00);
        Course course2 = new Course("Data Science", 12, 800.00);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("Tech Learning Hub");
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

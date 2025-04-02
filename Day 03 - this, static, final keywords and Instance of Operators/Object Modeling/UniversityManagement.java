package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;
class Division {
    private String divisionName;
    public Division(String divisionName) {
        this.divisionName = divisionName;
    }
    public String getDivisionName() {
        return divisionName;
    }
    public void displayDivision() {
        System.out.println("Division: " + divisionName);
    }
}
class Faculty {
    private String facultyName;
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }
    public void displayFaculty() {
        System.out.println("Faculty: " + facultyName);
    }
}
class University {
    private String universityName;
    private List<Division> divisions;
    private List<Faculty> faculties;
    public University(String universityName) {
        this.universityName = universityName;
        this.divisions = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    public void addDivision(String divisionName) {
        Division division = new Division(divisionName);
        divisions.add(division);
    }
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public void displayUniversityDetails() {
        System.out.println("🏫 University: " + universityName);
        System.out.println("\n📌 Divisions:");
        for (Division division : divisions) {
            division.displayDivision();
        }
        System.out.println("\n👨‍🏫 Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
    public void deleteUniversity() {
        divisions.clear();
        System.out.println("\n🚨 University and all its Divisions have been deleted.");
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        // Creating the University
        University university = new University("Tech University");

        // Adding Divisions (Composition)
        university.addDivision("Computer Science");
        university.addDivision("Mechanical Engineering");
        university.addDivision("Business Administration");

        Faculty faculty1 = new Faculty("Dr. John");
        Faculty faculty2 = new Faculty("Prof. Smith");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.displayUniversityDetails();

        university.deleteUniversity();

        System.out.println("\n👨‍🏫 Independent Faculty Members:");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
    }
}

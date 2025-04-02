package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted in " + hospitalName + ": " + totalPatients);
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\nPatient Details:");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient.getTotalPatients();
        Patient patient1 = new Patient("Alice Johnson", 30, "Flu", 101);
        Patient patient2 = new Patient("Bob Smith", 45, "Diabetes", 102);
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}

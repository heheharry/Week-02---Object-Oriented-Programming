package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class Vehicle {
    static double registrationFee = 5000.00;
    final String registrationNumber;
    String ownerName;
    String vehicleType;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\nVehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC1234");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ5678");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000.00);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

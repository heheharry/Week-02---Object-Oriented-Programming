package Day2.PracticeProblemsLevel_1;
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }
    public void displayRentalDetails() {
        System.out.println("\nCar Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();
        CarRental rental2 = new CarRental("John Doe", "Toyota Camry", 5);
        rental2.displayRentalDetails();
    }
}

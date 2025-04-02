package Day1.Extras_Assignment_3;
import java.util.Scanner;
class MobilePhone {
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mobile Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Mobile Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Mobile Price: ");
        double price = scanner.nextDouble();
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
        scanner.close();
    }
}

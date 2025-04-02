package Day1.Extras_Assignment_3;
import java.util.Scanner;
class Item {
    private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayItemDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();
        Item item = new Item(itemCode, itemName, price);
        item.displayItemDetails();
        System.out.print("\nEnter Quantity: ");
        int quantity = scanner.nextInt();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
        scanner.close();
    }
}

package Day1.Extras_Assignment_3;
import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }
}
class ShoppingCart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + "x " + itemName + " added to the cart.");
    }
    public void removeItem(String itemName) {
        boolean found = false;
        for (CartItem item : cartItems) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the cart.");
        }
    }
    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("\nShopping Cart Items:");
        for (CartItem item : cartItems) {
            System.out.println(item.quantity + "x " + item.itemName + " - $" + item.getTotalPrice());
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                cart.addItem(itemName, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String itemName = scanner.nextLine();
                cart.removeItem(itemName);
            } else if (choice == 3) {
                cart.displayTotalCost();
            } else if (choice == 4) {
                System.out.println("Exiting... Thank you for shopping!");
                break;
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }
}

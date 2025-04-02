package Day2.BestProgrammingPractices;
import java.util.ArrayList;
import java.util.List;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

// Interface Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.10; // 10% discount

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + applyDiscount();
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 1.5; // Additional charge per item
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + applyDiscount();
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegBurger = new VegItem("Veg Burger", 5.0, 2);
        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 6.0, 2);

        order.add(vegBurger);
        order.add(chickenBurger);

        double totalOrderPrice = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            totalOrderPrice += item.calculateTotalPrice() - ((item instanceof Discountable) ? ((Discountable) item).applyDiscount() : 0);
            System.out.println("----------------------");
        }

        System.out.println("Final Order Price after Discounts: " + totalOrderPrice);
    }
}

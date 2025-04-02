package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Purchase {
    private int purchaseId;
    private Buyer buyer;
    private List<Item> items;
    private static int purchaseCounter = 1;

    public Purchase(Buyer buyer) {
        this.purchaseId = purchaseCounter++;
        this.buyer = buyer;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayPurchaseDetails() {
        System.out.println("Purchase ID: " + purchaseId + " for " + buyer.getName());
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }
}

class Buyer {
    private String name;
    private List<Purchase> purchases;

    public Buyer(String name) {
        this.name = name;
        this.purchases = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placePurchase(Purchase purchase) {
        purchases.add(purchase);
    }
}
public class EcommercePlatform {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Alice");
        Purchase purchase1 = new Purchase(buyer1);

        Item item1 = new Item("Laptop", 1200.00);
        Item item2 = new Item("Smartphone", 800.00);

        purchase1.addItem(item1);
        purchase1.addItem(item2);
        buyer1.placePurchase(purchase1);

        purchase1.displayPurchaseDetails();
    }
}

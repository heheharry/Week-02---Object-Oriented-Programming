package Day2.BestProgrammingPractices;
import java.util.ArrayList;
import java.util.List;
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - discount;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("Final Price: " + getFinalPrice());
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.15;
    private double discount;

    public Electronics(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + calculateTax();
    }
}

// Clothing class
class Clothing extends Product {
    private double discount;

    public Clothing(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discount;
    }
}

// Groceries class
class Groceries extends Product implements Taxable {
    private static final double TAX_RATE = 0.05;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; // No discount on groceries
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax: " + calculateTax();
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics laptop = new Electronics(201, "Laptop", 1000, 0.1);
        Clothing shirt = new Clothing(202, "Shirt", 50, 0.2);
        Groceries apple = new Groceries(203, "Apple", 2);

        products.add(laptop);
        products.add(shirt);
        products.add(apple);

        for (Product product : products) {
            product.displayDetails();
            System.out.println("----------------------");
        }
    }
}

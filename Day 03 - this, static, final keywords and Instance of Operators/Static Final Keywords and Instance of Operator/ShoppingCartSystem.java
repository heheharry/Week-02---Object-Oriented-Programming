package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("\nProduct Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Price after " + discount + "% discount: $" + discountedPrice);
        }
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 1200.00, 2);
        Product product2 = new Product(102, "Smartphone", 800.00, 1);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.updateDiscount(15.0);
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}

package Day2.PracticeProblemsLevel_1;
class LibBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public LibBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibBook book1 = new LibBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
        book1.displayDetails();
    }
}

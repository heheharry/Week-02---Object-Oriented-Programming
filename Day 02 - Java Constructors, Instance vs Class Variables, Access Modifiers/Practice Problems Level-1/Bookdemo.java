package Day2.PracticeProblemsLevel_1;
class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class Bookdemo {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 15.99);
        customBook.displayDetails();
    }
}

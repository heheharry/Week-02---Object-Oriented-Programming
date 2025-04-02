package Day2.AccessModifiers;
class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }
    public void displayEBookDetails() {
        System.out.println("\nE-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}
public class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("123-456-789", "Java Programming", "John Doe");
        book1.displayDetails();
        book1.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book1.getAuthor());
        EBook ebook1 = new EBook("987-654-321", "Advanced Java", "Alice Brown", 5.5);
        ebook1.displayEBookDetails();
    }
}

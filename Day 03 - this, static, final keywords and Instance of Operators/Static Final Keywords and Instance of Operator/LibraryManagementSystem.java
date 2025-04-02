package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class LibraryBook {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof LibraryBook) {
            System.out.println("\nBook Details:");
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryBook.displayLibraryName();
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", "9780061122415");
        LibraryBook book2 = new LibraryBook("1984", "George Orwell", "9780451524935");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}

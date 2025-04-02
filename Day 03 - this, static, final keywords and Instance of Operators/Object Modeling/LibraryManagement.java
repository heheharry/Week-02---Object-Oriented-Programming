package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;
class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
class Library {
    String libraryName;
    List<Book> books;
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        universityLibrary.addBook(book2);
        universityLibrary.addBook(book3);
        cityLibrary.displayLibraryBooks();
        universityLibrary.displayLibraryBooks();
    }
}

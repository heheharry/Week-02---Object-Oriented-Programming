package Day1.Extras_Assignment_3;
import java.util.Scanner;
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Sorry, this seat is already booked.");
        }
    }
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("\nMovie Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("Status: Booked");
        } else {
            System.out.println("No ticket booked for this seat.");
        }
    }
}
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket();
        ticket.displayTicketDetails();
        scanner.close();
    }
}

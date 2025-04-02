package Day2.PracticeProblemsLevel_1;
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void displayBooking() {
        System.out.println("\nHotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayBooking();
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBooking();
    }
}

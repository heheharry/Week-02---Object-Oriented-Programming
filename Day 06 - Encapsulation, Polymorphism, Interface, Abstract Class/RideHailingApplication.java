package Day2.BestProgrammingPractices;
import java.util.ArrayList;
import java.util.List;
abstract class Transport {
    private String transportId;
    private String driverName;
    private double ratePerKm;

    public Transport(String transportId, String driverName, double ratePerKm) {
        this.transportId = transportId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getTransportId() {
        return transportId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getTransportDetails() {
        System.out.println("Transport ID: " + transportId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Sedan class
class Sedan extends Transport implements GPS {
    private String currentLocation;

    public Sedan(String transportId, String driverName, double ratePerKm) {
        super(transportId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Motorcycle class
class Motorcycle extends Transport implements GPS {
    private String currentLocation;

    public Motorcycle(String transportId, String driverName, double ratePerKm) {
        super(transportId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // 10% discount for motorcycle rides
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Auto class
class Auto extends Transport implements GPS {
    private String currentLocation;

    public Auto(String transportId, String driverName, double ratePerKm) {
        super(transportId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; // 10% additional charge for auto rides
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();

        Sedan sedan = new Sedan("C101", "John Doe", 10.0);
        Motorcycle motorcycle = new Motorcycle("B202", "Jane Smith", 5.0);
        Auto auto = new Auto("A303", "Mike Johnson", 7.0);

        transports.add(sedan);
        transports.add(motorcycle);
        transports.add(auto);

        double distance = 15.0;
        for (Transport transport : transports) {
            transport.getTransportDetails();
            System.out.println("Fare for " + distance + " km: " + transport.calculateFare(distance));
            if (transport instanceof GPS) {
                ((GPS) transport).updateLocation("Downtown");
                System.out.println("Updated Location: " + ((GPS) transport).getCurrentLocation());
            }
            System.out.println("----------------------");
        }
    }
}

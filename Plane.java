public class Plane extends AirTransportation{
    private double flightTime;
    private String departureTime;
    private String destination;
    private boolean firstClass;

    private double firstClassPrice;

    private boolean firstClassSold;


    public Plane(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                 boolean isRecreational, boolean isInternational,
                 double flightTime, String departureTime, String destination, boolean firstClass,
                 double firstClassPrice) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, isInternational);
        this.flightTime = flightTime;
        this.departureTime = departureTime;
        this.firstClassPrice = firstClassPrice;
        this.destination = destination;
        this.firstClass = firstClass;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getFirstClassPrice() {
        return firstClassPrice;
    }

    public void setFirstClassPrice(double firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

    public boolean getFirstClass() {
        return this.firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }


    public boolean getFirstClassSold(){
        return this.firstClassSold;
    }

    public void setFirstClassSold(boolean firstClassSold) {
        this.firstClassSold = firstClassSold;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    @Override
    public String toString(){
        String fcAvailable;
        if (firstClass) {
            fcAvailable = "Available";
        } else {
            fcAvailable = "Unavailable";
        }
        if (firstClass) {
            return String.format("%s\n%s\t%s\n%s\t%s\n%s\t%s\n%s\t%.2f\n%s\t%.2f",
                    super.multiPrice(),
                    "Destination", destination,
                    "Departure Time:", departureTime,
                    "First Class Tickets:", fcAvailable,
                    "Coach Price:", super.getPrice(),
                    "First Class Price:", firstClassPrice);
        } else {
            return String.format("%s\n%s\t%s\n%s\t%s\n%s\t%s\n%s\t%.2f",
                    super.multiPrice(),
                    "Destination", destination,
                    "Departure Time:", departureTime,
                    "First Class Tickets:", fcAvailable,
                    "Coach Price:", super.getPrice());
        }

    }
}

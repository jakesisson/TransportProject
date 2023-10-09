public class Transport {
    protected String name;
    protected String mode;
    protected double price;
    protected boolean isRental;
    protected boolean isTicket;
    protected String pickup;
    protected int maxPassengers;
    protected double avgSpeed;

    public Transport(String name, String mode, double price, boolean isRental, boolean isTicket, String pickup,
                     int maxPassengers, double avgSpeed) {
        this.name = name;
        this.mode = mode;
        this.price = price;
        this.isRental = isRental;
        this.isTicket = isTicket;
        this.pickup = pickup;
        this.maxPassengers = maxPassengers;
        this.avgSpeed = avgSpeed;
    }

    @Override
    public String toString() {
        if (this.isTicket) {
            return String.format("%s\n%s: %s\n%s: %f\n%s: %s\n%s: %d\n%s: %f","Ticket",
                    "Travel Mode", this.mode, "Ticket Price", this.price, "Pickup Location", this.pickup,
                    "Max Number of Passengers", this.maxPassengers, "Average Speed", this.avgSpeed);
        } else {
            return String.format("%s\n%s: %s\n%s: %f\n%s: %s\n%s: %d\n%s: %f","Rental",
                    "Travel Mode", this.mode, "Rental Price", this.price, "Pickup Location", this.pickup,
                    "Max Number of Passengers", this.maxPassengers, "Average Speed", this.avgSpeed);
        }

    }
}


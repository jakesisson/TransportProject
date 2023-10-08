public class Helicopter extends AirTransport{
    protected String name;
    public Helicopter(String name, String mode, double price, boolean isRental, boolean isTicket, String pickup, int maxPassengers, double avgSpeed) {
        super(mode, price, isRental, isTicket, pickup, maxPassengers, avgSpeed);
        this.name = name;
    }
}

public class Boat extends WaterTransport{
    protected String name;
    public Boat(String name, String mode, double price, boolean isRental, boolean isTicket, String pickup, int maxPassengers, double avgSpeed) {
        super(mode, price, isRental, isTicket, pickup, maxPassengers, avgSpeed);
        this.name = name;
    }
}

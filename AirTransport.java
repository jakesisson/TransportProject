public class AirTransport extends Transport{
    protected boolean isRecreational;
    protected boolean isLongDistance;
    public AirTransport(boolean isRecreational, boolean isLongDistance, String name, String mode, double price, boolean isRental, boolean isTicket, String pickup, int maxPassengers, double avgSpeed) {
        super(name, mode, price, isRental, isTicket, pickup, maxPassengers, avgSpeed);
        this.isRecreational = isRecreational;
        this.isLongDistance = isLongDistance;
    }
}

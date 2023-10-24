public class HotAirBalloon extends AirTransportation{
    private double flightTime;
    private String departureTime;
    private boolean hasDestination;
    private String destination;

    public HotAirBalloon(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                      boolean isRecreational, boolean isInternational,
                      double flightTime, String departureTime, boolean hasDestination, String destination) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, isInternational);
        this.flightTime = flightTime;
        this.departureTime = departureTime;
        this.hasDestination = hasDestination;
        this.destination = destination;
    }
    public HotAirBalloon(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                      boolean isRecreational, boolean isInternational,
                      double flightTime, String departureTime, boolean hasDestination) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, isInternational);
        this.flightTime = flightTime;
        this.departureTime = departureTime;
        this.hasDestination = hasDestination;
        if (!this.hasDestination) {
            this.destination = "Round Trip";
        }
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

    public boolean isHasDestination() {
        return hasDestination;
    }

    public void setHasDestination(boolean hasDestination) {
        this.hasDestination = hasDestination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.toString(),
                "Destination:", destination,
                "Departure Time:", departureTime,
                "Flight Time:", super.mod_number(false,flightTime,"Hours"));

    }
}

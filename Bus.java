public class Bus extends  LandTransportation{
    private String destination;
    private double tripLength;
    private String departureTime;

    public Bus(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
               boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, boolean isGasoline,
               String destination, double tripLength, String departureTime) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, is4wheel, isElectric, isDiesel, isGasoline);
        this.departureTime = departureTime;
        this.destination = destination;
        this.tripLength = tripLength;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripLength() {
        return tripLength;
    }

    public void setTripLength(double tripLength) {
        this.tripLength = tripLength;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString(){
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.toString(),
                "Destination:", this.destination,
                "Departure Time:", this.departureTime,
                "Trip Length:", super.mod_number(false,tripLength,"Hours"));
    }
}

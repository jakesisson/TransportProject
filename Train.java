public class Train extends LandTransportation {
    private double tripLength;
    private String destination;
    private int perCar;
    private String departureTime;

    private final int numCars;


    public Train(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                 boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, boolean isGasoline, double tripLength,
                 String destination, int perCar, String departureTime) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, is4wheel, isElectric, isDiesel, isGasoline);
        this.tripLength = tripLength;
        this.destination = destination;
        this.perCar = perCar;
        this.departureTime = departureTime;
        this.numCars = (maxPassengers + perCar - 1) / perCar;
    }

    public int getNumCars(){
        return this.numCars;
    }

    public double getTripLength() {
        return tripLength;
    }

    public void setTripLength(double tripLength) {
        this.tripLength = tripLength;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPerCar() {
        return perCar;
    }

    public void setPerCar(int perCar) {
        this.perCar = perCar;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int carsNeeded(int tickets) {
        return (tickets + perCar - 1)/ perCar;
    }

    @Override
    public String toString(){
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d\n%-50s%-50d",
                super.toString(),
                "Destination:", this.destination,
                "Departure Time:", this.departureTime,
                "Length of Trip:", super.mod_number(false,tripLength,"Hours"),
                "Available Cars:", this.numCars,
                "Passengers Per Car:", this.perCar);
    }
}

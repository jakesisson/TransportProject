public class Ship extends WaterTransportation{
    private String vehicleClass;
    private double tripLength;
    private boolean isDays;
    private String destination;
    private boolean allInclusive;
    private String stops;
    private int maxPerRoom;
    private boolean isCruise;

    private boolean buyDrinkTicket;
    private double drinkTicketPrice;

    private boolean isFerry;

    private String departureTime;


    public Ship(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                double avgSpeed, boolean isInternational, boolean isRecreational,
                String vehicleClass, double tripLength, boolean isDays, boolean isCruise, boolean isFerry,
                String departureTime) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isInternational, isRecreational);
        this.vehicleClass = vehicleClass;
        this.tripLength = tripLength;
        this.isDays = isDays;
        this.isCruise = isCruise;
        this.isFerry = isFerry;
        this.departureTime = departureTime;
    }

    public Ship(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                double avgSpeed, boolean isInternational, boolean isRecreational,
                String vehicleClass, double tripLength, boolean isDays, boolean isCruise, boolean isFerry,
                String destination, boolean allInclusive, String stops, int maxPerRoom,
                double drinkTicketPrice, String departureTime) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isInternational, isRecreational);
        this.vehicleClass = vehicleClass;
        this.tripLength = tripLength;
        this.isDays = isDays;
        this.isCruise = isCruise;
        this.isFerry = isFerry;
        this.destination = destination;
        this.allInclusive = allInclusive;
        this.stops = stops;
        this.maxPerRoom = maxPerRoom;
        this.drinkTicketPrice = drinkTicketPrice;
        this.departureTime = departureTime;

    }


    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public double getTripLength() {
        return tripLength;
    }

    public void setTripLength(double tripLength) {
        this.tripLength = tripLength;
    }

    public boolean isDays() {
        return isDays;
    }

    public void setDays(boolean days) {
        isDays = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isAllInclusive() {
        return allInclusive;
    }

    public void setAllInclusive(boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public int getMaxPerRoom() {
        return maxPerRoom;
    }

    public void setMaxPerRoom(int maxPerRoom) {
        this.maxPerRoom = maxPerRoom;
    }

    public boolean isCruise() {
        return isCruise;
    }

    public void setCruise(boolean cruise) {
        isCruise = cruise;
    }

    public double getDrinkTicketPrice() {
        return drinkTicketPrice;
    }

    public void setDrinkTicketPrice(double drinkTicketPrice) {
        this.drinkTicketPrice = drinkTicketPrice;
    }

    public boolean getIsFerry() {
        return this.isFerry;
    }

    public void setFerry(boolean isFerry) {
        this.isFerry = isFerry;
    }

    public boolean getBuyDrinkTicket(){
        return this.buyDrinkTicket;
    }
    public void setBuyDrinkTicket(boolean buyDrinkTicket) {
        this.buyDrinkTicket = buyDrinkTicket;
    }

    private String tripString(double tripLength) {
        String s = Double.toString(tripLength);
        if (isDays){
            s = s + " Days";
        } else {
            s = s + " Hours";
        }

        return s;
    }

    @Override
    public String toString() {
        String inclusive = null;
        if (allInclusive) {
            inclusive = "All Inclusive (Drink Ticket Separate)";
        } else {
            inclusive = "Separate Purchases Required";
        }
        if (isFerry) {
            return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%s",
                    super.toPartialString(),
                    "Departure Time:", departureTime,
                    "Vehicles per Ticket:", super.getMaxPassengers(),
                    "Destination:", destination,
                    "Trip Length:", tripString(tripLength),
                    "Note: Only standard vehicles allowed. Any vehicles over 2 axles require special reservation."
                    );
        } else if (isCruise) {
            if (buyDrinkTicket) {
                return String.format("%s\n%-50s%s-50\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d",
                        super.toString(),
                        "Departure Time:", departureTime,
                        "Ship Class:", vehicleClass,
                        "Additional Purchases:", inclusive,
                        "Final Destination:", destination,
                        "Destination Stops" , stops,
                        "Trip Length:", tripString(tripLength),
                        "Drink Ticket Price:", super.mod_number(true,drinkTicketPrice,"per guest"),
                        "Max Passengers Per Room:", maxPerRoom);
            } else {
                return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d",
                        super.toString(),
                        "Departure Time:", departureTime,
                        "Additional Purchases:", inclusive,
                        "Final Destination:", destination,
                        "Destination Stops" , stops,
                        "Trip Length:", tripString(tripLength),
                        "Max Passengers Per Room:", maxPerRoom);
            }

        } else {
            return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                    super.toString(),
                    "Departure Time:", departureTime,
                    "Ship Class:", vehicleClass,
                    "Destination:", destination,
                    "Trip Length:", tripString(tripLength));
        }
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}

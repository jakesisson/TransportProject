public class Transport {
    private String name;
    private boolean isRental;
    private int maxPassengers;
    private double price;
    private String pickup;
    private double avgSpeed;

    public Transport(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                     double avgSpeed) {
        this.name = name;
        this.isRental = isRental;
        this.maxPassengers = maxPassengers;
        this.price = price;
        this.pickup = pickup;
        this.avgSpeed = avgSpeed;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Boolean getRental() {
        return isRental;
    }

    public void setRental(Boolean rental) {
        isRental = rental;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toPartialString() {
        String purchaseMethod;
        String location_type;
        if (isRental){
            purchaseMethod = "Rental";
            location_type = "Pickup:";
        } else {
            purchaseMethod = "Ticket";
            location_type = "Departure:";
        }
        return String.format("%s\t%s\n%s\t%s\n%s\t%s\n%s\t%.2f\n%s\t%.2f",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Price:", price,
                "Average Speed:", avgSpeed);
    }

    public String multiPrice() {
        String purchaseMethod;
        String location_type;
        if (isRental){
            purchaseMethod = "Rental";
            location_type = "Pickup:";
        } else {
            purchaseMethod = "Ticket";
            location_type = "Departure:";
        }

        return String.format("%s\t%s\n%s\t%s\n%s\t%s\n%s\t%d\n%s\t%.2f",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Maximum Passengers:", maxPassengers,
                "Average Speed:", avgSpeed);
    }

    @Override
    public String toString() {
        String purchaseMethod;
        String location_type;
        if (isRental){
            purchaseMethod = "Rental";
            location_type = "Pickup:";
        } else {
            purchaseMethod = "Ticket";
            location_type = "Departure:";
        }

        return String.format("%s\t%s\n%s\t%s\n%s\t%s\n%s\t%.2f\n%s\t%d\n%s\t%.2f",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Price:", price,
                "Maximum Passengers:", maxPassengers,
                "Average Speed:", avgSpeed);
    }
}

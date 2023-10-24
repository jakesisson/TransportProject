public class Transport {
    private String name;
    private boolean isRental;
    private int maxPassengers;
    private double price;
    private String pickup;


    public Transport(String name, Boolean isRental, int maxPassengers, double price, String pickup) {
        this.name = name;
        this.isRental = isRental;
        this.maxPassengers = maxPassengers;
        this.price = price;
        this.pickup = pickup;
    }


    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
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

    public String mod_number(boolean dollar, double number, String units) {
        if (dollar) {
            return "$" + Double.toString(number) + " " + units;
        } else {
            return Double.toString(number) + " " + units;
        }
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
        return String.format("%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50.2f",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Price:", price);
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

        return String.format("%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Maximum Passengers:", maxPassengers);
    }



    @Override
    public String toString() {
        String purchaseMethod;
        String location_type;
        String pricing;
        if (isRental){
            purchaseMethod = "Rental";
            location_type = "Pickup:";
            pricing = mod_number(true,price,"per day");

        } else {
            purchaseMethod = "Ticket";
            location_type = "Departure:";
            pricing = mod_number(true,price,"per ticket");
        }

        return String.format("%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d",
                "Vehicle:", this.name,
                "Purchase Type:", purchaseMethod,
                location_type, pickup,
                "Price:", pricing,
                "Maximum Passengers:", maxPassengers);
    }
}

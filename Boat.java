public class Boat extends WaterTransportation{
    private int rentalDays;
    private String vehicleClass;


    public Boat(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                double avgSpeed, boolean isInternational, boolean isRecreational, String vehicleClass) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isInternational, isRecreational);
        this.vehicleClass = vehicleClass;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public double getTotal() {
        return super.getPrice() * this.rentalDays;
    }

    @Override
    public String toString(){
        if (rentalDays == 0) {
            return String.format("%s\n%s\t%s",
                    super.toString(),
                    "Vehicle Class:", vehicleClass);
        } else {
            return String.format("%s\n%s\t%s\n%s\t%d",
                    super.toString(),
                    "Boat Class:", vehicleClass,
                    "Rental Days:", rentalDays);
        }

    }
}

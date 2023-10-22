public class Automobile extends LandTransportation{
    private String vehicleClass;
    private int rentalDays = 0;
    private String color;


    public Automobile(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                      boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, String vehicleClass,
                      String color) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, is4wheel, isElectric, isDiesel);
        this.color = color;
        this.vehicleClass = vehicleClass;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getTotal(){
        return super.getPrice() * rentalDays;
    }

    @Override
    public String toString(){
        if (rentalDays == 0) {
            return String.format("%s\n%s\t%s\n%s\t%s",
                    super.toString(),
                    "Vehicle Class:", vehicleClass,
                    "Color:", color);
        } else {
            return String.format("%s\n%s\t%s\n%s\t%s\n%s\t%d",
                    super.toString(),
                    "Vehicle Class:", vehicleClass,
                    "Color:", color,
                    "Rental Days:", rentalDays);
        }

    }
}

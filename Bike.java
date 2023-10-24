public class Bike extends LandTransportation {
    private boolean isMotorcycle;
    private int rentalDays;
    private String color;


    public Bike(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, boolean isGasoline, boolean isMotorcycle,
                String color) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isRecreational, is4wheel, isElectric, isDiesel, isGasoline);
        this.isMotorcycle = isMotorcycle;
        this.color = color;
    }

    public int getRentalDays() {
        return this.rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public boolean isMotorcycle() {
        return isMotorcycle;
    }

    public void setMotorcycle(boolean motorcycle) {
        isMotorcycle = motorcycle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTotal(){
        return this.rentalDays * super.getPrice();
    }

    @Override
    public String toString(){
        String bikeType;
        if (isMotorcycle){
            bikeType = "Motorcycle";
        } else {
            bikeType = "Bicycle";
        }
        if (rentalDays == 0) {
            return String.format("%s\n%-50s%-50s\n%-50s%-50s",
                    super.toString(),
                    "Bike Type:", bikeType,
                    "Color:", this.color);
        } else {
            return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50d",
                    super.toString(),
                    "Bike Type:", bikeType,
                    "Color:", this.color,
                    "Length of Rental:", rentalDays);
        }
    }
}

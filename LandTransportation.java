public class LandTransportation extends Transport{
    private boolean isRecreational;
    private boolean isAllTerrain;
    private boolean isElectric;
    private boolean isDiesel;

    private boolean isGasoline;

    private String fuelOther;

    private double avgSpeed;


    public LandTransportation(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                              boolean isRecreational, boolean isAllTerrain, boolean isElectric, boolean isDiesel, boolean isGasoline) {
        super(name, isRental, maxPassengers, price, pickup);
        this.isRecreational = isRecreational;
        this.isAllTerrain = isAllTerrain;
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
        this.avgSpeed = avgSpeed;
        this.isGasoline = isGasoline;
    }

    public String getFuelOther(){return this.fuelOther;}

    public void setFuelOther(String fuelOther) {this.fuelOther = fuelOther;}

    public boolean isRecreational() {
        return isRecreational;
    }

    public boolean isAllTerrain() {
        return isAllTerrain;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isDiesel() { return isDiesel;}

    public void setDiesel(boolean isDiesel){this.isDiesel = isDiesel;}
    public void setRecreational(boolean isRecreational) {this.isRecreational = isRecreational;}
    public void setAllTerrain(boolean allTerrain) {this.isAllTerrain = allTerrain;}
    public void setElectric(boolean isElectric) {this.isElectric = isElectric;}



    public String toString() {
        String driveTrain;
        String purpose;
        String fuel;
        if (isRecreational){
            purpose = "Recreational";
        } else {
            purpose = "Travel";
        }
        if (isAllTerrain){
            driveTrain = "All Terrain";
        } else {
            driveTrain = "Road Use Only";
        }
        if (isElectric) {
            fuel = "Electric";
        } else if (isDiesel) {
            fuel = "Diesel";
        } else if (isGasoline){
            fuel = "Gasoline";
        } else {
            fuel = fuelOther;
        }
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.toString(),
                "Average Speed:", super.mod_number(false, avgSpeed, "MPH"),
                "Use:", purpose,
                "Drive Train:", driveTrain,
                "Fuel Type:", fuel);
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public boolean isGasoline() {
        return isGasoline;
    }

    public void setGasoline(boolean gasoline) {
        isGasoline = gasoline;
    }
}

public class LandTransportation extends Transport{
    private boolean isRecreational;
    private boolean is4wheel;
    private boolean isElectric;
    private boolean isDiesel;


    public LandTransportation(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
                              boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed);
        this.isRecreational = isRecreational;
        this.is4wheel = is4wheel;
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
    }

    public boolean isRecreational() {
        return isRecreational;
    }

    public boolean isIs4wheel() {
        return is4wheel;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isDiesel() { return isDiesel;}

    public void setDiesel(boolean isDiesel){this.isDiesel = isDiesel;}
    public void setRecreational(boolean isRecreational) {this.isRecreational = isRecreational;}
    public void setIs4wheel(boolean is4wheel) {this.is4wheel = is4wheel;}
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
        if (is4wheel){
            driveTrain = "All Terrain";
        } else {
            driveTrain = "Not 4 Wheel Drive";
        }
        if (isElectric) {
            fuel = "Electric";
        } else if (isDiesel) {
            fuel = "Diesel";
        } else {
            fuel = "Gasoline";
        }
        return String.format("%s\n%s\t%s\n%s\t%s\n%s\t%s",
                super.toString(),
                "Use:", purpose,
                "Drive Train:", driveTrain,
                "Fuel Type:", fuel);
    }
}

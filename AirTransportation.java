public class AirTransportation extends Transport{
    private boolean isRecreational;
    private boolean isInternational;

    private double avgSpeed;


    public AirTransportation(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                             double avgSpeed, boolean isRecreational, boolean isInternational) {
        super(name, isRental, maxPassengers, price, pickup);
        this.isInternational = isInternational;
        this.isRecreational = isRecreational;
        this.avgSpeed = avgSpeed;
    }

    public boolean isRecreational() {
        return isRecreational;
    }

    public void setRecreational(boolean recreational) {
        isRecreational = recreational;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public String multiPrice(){
        String passport;
        String purpose;

        if (isRecreational){
            purpose = "Recreational";
        } else {
            purpose = "Travel";
        }

        if (isInternational) {
            passport = "Required";
        } else {
            passport = "Not Required";
        }
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.multiPrice(),
                "Average Speed:", super.mod_number(false,avgSpeed,"Knots"),
                "Passport Required:", passport,
                "Purpose:", purpose);
    }

    @Override
    public String toString() {
        String passport;
        String purpose;

        if (isRecreational){
            purpose = "Recreational";
        } else {
            purpose = "Travel";
        }

        if (isInternational) {
            passport = "Required";
        } else {
            passport = "Not Required";
        }
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.toString(),
                "Average Speed:", super.mod_number(false,avgSpeed,"Knots"),
                "Passport Required:", passport,
                "Purpose:", purpose);
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }
}

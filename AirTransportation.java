public class AirTransportation extends Transport{
    private boolean isRecreational;
    private boolean isInternational;


    public AirTransportation(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                             double avgSpeed, boolean isRecreational, boolean isInternational) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed);
        this.isInternational = isInternational;
        this.isRecreational = isRecreational;
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
        return String.format("%s\n%s\t%s\n%s\t%s",
                super.multiPrice(),
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
        return String.format("%s\n%s\t%s\n%s\t%s",
                super.toString(),
                "Passport Required:", passport,
                "Purpose:", purpose);
    }
}

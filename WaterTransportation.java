public class WaterTransportation extends Transport {
    private boolean isRecreational;
    private boolean isInternational;


    public WaterTransportation(String name, Boolean isRental, int maxPassengers, double price,
                               String pickup, double avgSpeed, boolean isInternational, boolean isRecreational) {
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

    public String toPartialString() {
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
                super.toPartialString(),
                "Passport Required:", passport,
                "Purpose:", purpose);
    }
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

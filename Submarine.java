public class Submarine extends WaterTransportation{
    private double maxDepth;
    private double tripLength;
    private String scenery;
    private String warnings;

    private String departureTime;


    public Submarine(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                     double avgSpeed, boolean isInternational, boolean isRecreational, double maxDepth,
                     double tripLength, String scenery, String warnings, String departureTime) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isInternational, isRecreational);
        this.maxDepth = maxDepth;
        this.tripLength = tripLength;
        this.scenery = scenery;
        this.warnings = warnings;
        this.departureTime = departureTime;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public double getTripLength() {
        return tripLength;
    }

    public void setTripLength(double tripLength) {
        this.tripLength = tripLength;
    }

    public String getScenery() {
        return scenery;
    }

    public void setScenery(String scenery) {
        this.scenery = scenery;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    private String tripString(double tripLength) {

        String s = Double.toString(tripLength) + " Hours";
        return s;
    }

    @Override
    public String toString() {
        return String.format("%s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s\n%-50s%-50s",
                super.toString(),
                "Departure Time:", departureTime,
                "Max Depth:", super.mod_number(false,maxDepth,"Meters"),
                "Trip Length:", super.mod_number(false,tripLength, "Hours"),
                "Underwater Scenery:", scenery,
                "Warnings: ", warnings);
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}

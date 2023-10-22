public class Submarine extends WaterTransportation{
    private double maxDepth;
    private double tripLength;
    private String scenery;
    private String warnings;


    public Submarine(String name, Boolean isRental, int maxPassengers, double price, String pickup,
                     double avgSpeed, boolean isInternational, boolean isRecreational, double maxDepth,
                     double tripLength, String scenery, String warnings) {
        super(name, isRental, maxPassengers, price, pickup, avgSpeed, isInternational, isRecreational);
        this.maxDepth = maxDepth;
        this.tripLength = tripLength;
        this.scenery = scenery;
        this.warnings = warnings;
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

    @Override
    public String toString() {
        return String.format("%s\n%s\t%.2f\n%s\t%.2f%s\n%s\t%s\n%s\t%s",
                super.toString(),
                "Max Depth:", maxDepth,
                "Trip Length:", tripLength, " Hours",
                "Underwater Scenery:", scenery,
                "Warnings: ", warnings);
    }
}

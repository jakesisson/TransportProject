import java.util.ArrayList;

public class TransportTest {
    public static void main(String[] args) {

        ArrayList<Transport> transports = new ArrayList<>();

        //Automobile(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                      boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, String vehicleClass,
        //                      String color)
        Automobile tahoe = new Automobile("Tahoe", true, 5, 75.99, "Hertz-Wilmington",
                60, false, true,false,false,"SUV","Black");

        transports.add(tahoe);
        //Bike(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, boolean isMotorcycle,
        //                String color)

        Bike dirtBike = new Bike("Dirt bike", true,1, 49.99, "OffRoad Rentals",
                45, true, false, false,false,true,"Blue");

        transports.add(dirtBike);

        //Boat(String name, Boolean isRental, int maxPassengers, double price, String pickup,
        //                double avgSpeed, boolean isInternational, boolean isRecreational, String vehicleClass)
        Boat fishingBoat = new Boat("Lazy Lady", true, 6, 99.99, "Southport Dock",
                55, false,true,"Fishing Boat");

        transports.add(fishingBoat);
        //Bus(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //               boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel,
        //               String destination, double tripLength, String departureTime)
        Bus greyHound = new Bus("Greyhound A", false, 45, 28.99,"Grehound Wilmington",
                55, false,false,false,true,"Raleigh",
                2.5, "7:00 AM");

        transports.add(greyHound);
        //Dirigible(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                      boolean isRecreational, boolean isInternational,
        //                      double flightTime, String departureTime, boolean hasDestination, String destination
        Dirigible blimp = new Dirigible("Blimp", false, 50,57.99,"Blimpys",
                45, true, false, 2.5, "11:00 AM",
                false);

        transports.add(blimp);

        //Helicopter(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                      boolean isRecreational, boolean isInternational,
        //                      double flightTime, String departureTime, boolean hasDestination, String destination)
        Helicopter chopper1 = new Helicopter("Chopper 1", false,5,89.99,
                "Landing Zone", 45, true,false,1.5,
                "1:00 PM", false);

        transports.add(chopper1);
        //HotAirBalloon(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                      boolean isRecreational, boolean isInternational,
        //                      double flightTime, String departureTime, boolean hasDestination, String destination)
        HotAirBalloon ha1 = new HotAirBalloon("Smiley Balloon", false, 4, 65.99,
                "Hot Air Tours", 25,true,false,3.5,
                "10:30 AM",false);

        transports.add(ha1);

        //Plane(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                 boolean isRecreational, boolean isInternational,
        //                 double flightTime, String departureTime, String destination, boolean firstClass,
        //                 double firstClassPrice)

        Plane americanAirlines1 = new Plane("Flight 827", false, 150, 74.99,
                "ILM Airport", 575,false,false,2.5,
                "9:00 AM","Chicago", true, 119.99);


        transports.add(americanAirlines1);
        //Ship(String name, Boolean isRental, int maxPassengers, double price, String pickup,
        //                double avgSpeed, boolean isInternational, boolean isRecreational,
        //                String vehicleClass, double tripLength, boolean isDays, boolean isCruise, boolean isFerry,
        //                String destination, boolean allInclusive, String stops, int maxPerRoom,
        //                double drinkTicketPrice, String departureTime)

        Ship carnival1 = new Ship("Carnival Fantasy", false, 3000, 1500,
                "Miami FL", 12, true, true, "Cruise Ship",
                7, true, true,false, "Carribean", true, "Puerto Plata, Bimini", 2, 219.99,"November 22 7:00 AM");

        carnival1.setBuyDrinkTicket(true);

        transports.add(carnival1);

        //Submarine(String name, Boolean isRental, int maxPassengers, double price, String pickup,
        //                     double avgSpeed, boolean isInternational, boolean isRecreational, double maxDepth,
        //                     double tripLength, String scenery, String warnings, String departureTime)

        Submarine sub1 = new Submarine("Voyager Submarine", false, 3,229.99,"Voyager Voyages", 12, false,true,100, 1.5, "Coral Reef, Sunken Ship, Shark Sanctuary",
                "Submarines are tight quarters, please avoid if you suffer from claustrophobia", "7:30 AM");


        transports.add(sub1);
        //Train(String name, Boolean isRental, int maxPassengers, double price, String pickup, double avgSpeed,
        //                 boolean isRecreational, boolean is4wheel, boolean isElectric, boolean isDiesel, double tripLength,
        //                 String destination, int perCar, String departureTime)

        Train amtrak = new Train("Amtrak 57", false, 225, 57.99, "Amtrak Raleigh", 125, false,false,true,false,2.5, "Charlotte, NC", 20, "11:30 AM");

        transports.add(amtrak);

        System.out.println("All Transports");
        System.out.println("-".repeat(60));

        for (Transport item : transports) {
            System.out.println(item.toString());
            System.out.println("-".repeat(60));
        }
    }
}

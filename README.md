# TransportProject
CSC331-TransportLab-Group
Given the following classes, create an inheritance hierarchy chart showing their relationships.

Boat, Train, Transportation, Helicopter, LandTransportation, Automobile, Ship, AirTransportation, Submarine, Bus, Dirigible, WaterTransportation, Bike, Plane, Hot Air Balloon
Determine instance variables for each class. Create a UML for each class showing the instance variables, constructors, accessors and mutators.

Base Files Created: 

Top Level of Heirarchy - Transport
LandTransport extends Transport, AirTransport extends Transport, WaterTransport extends Transport
Automobile extends LandTransport, Train extends LandTransport, Bus extends LandTransport, Bike extends LandTransport
Helicopter extends AirTransport, Dirigible extends AirTransport, Plane extends AirTransport, HotAirBalloon extends AirTransport
Boat extends WaterTransport, Ship extends WaterTransport, Submarine extends WaterTransport

Level 2 subclasses have unique name identifiers inherit all variables from Transport or Level1 Super
Automobile - Rental only, (ie Tahoe, Camry, Limo, etc)
Train - Ticket only, name unique (ie Amtrak Train 1)
Bus - Rental or Ticket (unique to each instance of object either or) 
Bike - Rental Only
Helicopter - Rental or Ticket
Dirigible - Ticket 
Plane - Ticket
HotAirBalloon - Rental or Ticket
Boat - Rental or Ticket (Yacht, Sailboat, Speedboat, PartyBoat, etc)
Ship - Ticket
Submarine - Ticket 

Format of constructor:
public Automobile(String name, String mode, double price, boolean isRental, boolean isTicket, String pickup, int maxPassengers, double avgSpeed) {
        super(mode, price, isRental, isTicket, pickup, maxPassengers, avgSpeed);
        this.name = name;
    }

Level 1 Subclass LandTransport inherit all class variables from Transport and act as a division of mode of travel

format of constructor:
public LandTransport(String mode, double price, boolean isRental, boolean isTicket, String pickup, int maxPassengers, double avgSpeed) {
        super(mode, price, isRental, isTicket, pickup, maxPassengers, avgSpeed);
    }
No specific need for class specific variables

Superclass Transport variables:
    protected String mode;
    protected double price;
    protected boolean isRental;
    protected boolean isTicket;
    protected String pickup;
    protected int maxPassengers;
    protected double avgSpeed;

format of constructor:
public Transport(String mode, double price, boolean isRental, boolean isTicket, String pickup,
                     int maxPassengers, double avgSpeed) {
        this.mode = mode;
        this.price = price;
        this.isRental = isRental;
        this.isTicket = isTicket;
        this.pickup = pickup;
        this.maxPassengers = maxPassengers;
        this.avgSpeed = avgSpeed;
    }


Example of object creation: Automobile tahoe = new Automobile("Tahoe", "Land", 75.25, true, false, "Wilmington - Hertz", 5, 70);


getters and setters for each class, @override toString for each for polymorphism. Needs to be modified to display in a table format

Write the code for each class.

Create a driver file, WTCLastName1LastName2LastName3.java, with at least one instance of each class from the bottom level of your hierarchy and implement a solution to the following problem. Your solution must use polymorphism and you should identify where it is being used in the program.

 -Create each object and add to Array of Transport methods
 -Get user input (Try, Catch if not Land, Air, or Water)
 For each object in Array, If Transport.getmode == user input display to table
 Transport Options
 Mode of Transport (Land)
 ------------------------------------(repeat to length of max formatted string)
 Automobiles: (get type)
 ------------------------------------
 Vehicle  Passengers  Price    Rental or Ticket  Pickup Location
 ------------------------------------------------------------
 Tahoe    5           $75.25   Rental            Wilm-hertz

 Trains:
 ----------------------
 Buses:
 ----------------------
 Bikes:
 ----------------------
 Repeat for each landTransport option

 Get user input for name of transport.
Get user input of number of passengers 
Total Price (Rental price stays the same, ticket price x passengers for tickets. Method in class getTotal())
Edit toString method to display all travel instructions.
 

The Wilmington Travel Center needs a program to do the following:

Ask the user what type of transportation they want to use (Land, Air, Water).
In a table format, display the options for the type selected, the cost of transportation, whether the purchase is for a ticket or for a rental, the average speed, and the number of passengers allowed.
Ask the user to select which mode of transportation they want to use.
Display ALL information about the selected mode using an overridden toString method.
Ask the user to verify that this is the mode of transportation they want to use.
Ask the user how many passengers need to travel using that mode of transportation.
Display the total cost.
Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)

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



The Wilmington Travel Center needs a program to do the following:

Ask the user what type of transportation they want to use (Land, Air, Water).
In a table format, display the options for the type selected, the cost of transportation, whether the purchase is for a ticket or for a rental, the average speed, and the number of passengers allowed.
Ask the user to select which mode of transportation they want to use.
Display ALL information about the selected mode using an overridden toString method.
Ask the user to verify that this is the mode of transportation they want to use.
Ask the user how many passengers need to travel using that mode of transportation.
Display the total cost.
Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)

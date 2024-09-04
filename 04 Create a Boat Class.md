# Project 1.4 Create a Boat Class
## Objective:

Students implement loops and arrays as part of a class.

## Specifications:

You will implement a boat class which will describe a boat in a Battleship game. It will have the following methods:

* A constructor that takes 3 arguments:
  * A string that is one of “Aircraft Carrier,” “Battleship,” “Cruiser,” “Destroyer,” or “Submarine.” Note that the first letter of each word is upper case and the remaining letters are lower case.
  * An instance of the Position class where the boat will start.
  * A string that is one of “horizontal” or “vertical” indicating the orientation of the boat. Note that both strings are entirely lower case.
* A method called name that returns the name of the type of ship.
* A method called abbreviation that returns a character, a one letter abbreviation (A,B,C,D or S) for the name of the type of ship.
* A method called size that returns the number of squares the ship takes up (5 for Aircraft Carrier, 4 for Battleship, 3 for Cruiser and Submarine, 2 for Destroyer).
* A method called onBoat that takes an instance of Position as an argument and returns true if the Position is on the boat and false otherwise.
* A method called isHit that takes a Position as an argument and returns a boolean, true if the ship has been hit in that place and false otherwise.
* A method called hit that takes a Position as an argument. If that argument overlaps the ship, it records the fact that the ship has been hit in that position.
* A method called sunk that returns a Boolean, true if the ship has been hit on all its squares and false otherwise.
* A method called position that returns an instance of Position, where your boat will start.
* A method called direction that returns “horizontal” or “vertical,” the direction of the ship.

Your Boat class may have as many private methods as you feel necessary, but no public methods other than the above should be included.

## Testing:

1. Add multiple tests for the constructor and each method. 
2. For any method that can possibly receive faulty input, decide on how to state the input is faulty.
   1. Return null?
   2. Throw an exception?
3. All of your original tests should still pass with the new changes.

Demonstrate your project and tests to Mr. McKibben to receive credit.
# Objective
Students will create a class with constructors, observers, and private data fields.

# Background
Battleship is a game in which a player tries to find boats hidden on a 10x10 ocean. There are five types of boats. Each is one square wide and a number of squares long:

| Ship             | Length in Squares |
|------------------|-------------------|
| Aircraft Carrier | 5                 |
| Battleship       | 4                 |
| Cruiser          | 3                 |
| Destroyer        | 2                 |
| Submarine        | 3                 |

The player guesses one of the 100 squares on the ocean and finds out if that guess is a miss (there is no boat overlapping that position) or a hit (there is a boat overlapping that position). After all the positions a boat overlaps have been hit, that boat is said to be “sunk.” The game ends when all five boats are sunk. If there are multiple players, the winner is the one who sinks all five ships first.

Players keep track of where their guesses have been hits or misses by placing pegs on a grid. Traditionally red pegs indicate a hit and white pegs indicate a miss.

# Specifications
For this assignment, you will create a class called Position that represents a square on a battleship board. Positions on a battleship board are described by a letter from A-J representing the row and a number from 1-10 representing the column.

Your class should have the following items:

* A single constructor which takes two arguments: a character and a number.
* Two observer methods. One should be called row. It should take no arguments and should return a character (upper case letter) corresponding to the row represented in the position. The second should be called column. It should return an integer corresponding to the column represented in the position.
* A toString method that takes no arguments, and returns a string containing the character for the row, followed by a hyphen (“-“) followed by the number for the column. I.e. B-9.
* Private data fields for storing the row and column.
# Testing
* Test your class thoroughly. A testing class is created for you, create enough test cases that you are absolutely certain that there are no edge cases undiscovered, and that you have tested every possible way to interact with your class.
* Demonstrate your project and tests to Mr. McKibben to receive credit.
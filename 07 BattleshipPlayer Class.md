# Project 1.7 BattleshipPlayer Class
## Objective:

Students will create a text-based, fault tolerant interface.

## Specifications:

The BattleshipPlayer class will allow a human player to play Battleship with a computer. It will contain a BatteshipGrid that is updated each time the player makes a move. You will implement the following methods:
``` java
BattleshipPlayer()
```
This constructor method sets the name to be null.
```java
public void startGame()
```
This modifier method is called each time a new game is started. It creates the BattleshipGrid used to keep the user informed. If name is null, it asks the user to enter a name and welcomes the user to the game.
```java
public String playerName()
```
This method returns the name of the human player.
```java
public Position shoot()
```
This observer method gets a position to shoot at. It prompts the user to enter a position and then uses the zero-parameter constructor of the position class to read from the console. If the user enters an invalid position, it prints out an error message and prompts the user again.

```java
public void updateGrid(Position pos, boolean hit, char initial)
```
This modifier method updates the grid based on the results of a shot. Note that this can be done automatically by calling the shotAt method of the BattleshipGrid class.

```java
public BattleshipGrid getGrid()
```
This observer returns the grid stored in the class. It is mainly so the grid is available for use by subclasses of Battleship player.

```java
public void initializeGrid()
```
This modifiers resets the grid to a new grid where all spaces are empty.

```java
public String updatePlayer(Position pos, boolean hit, char initial, string boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turns)
```
This method informs the user of the result of his/her shot, including:

Whether it was a hit or miss.
Which ship was hit.
Whether the ship is sunk.
If the game is over.
If the game has gone on too long.
The number of turns the player has taken so far.
It also calls the updateGrid method and then _returns_ the grid as a graphical representation of the state of the game. This output should have the following characteristics:

The columns should be labeled with the numbers 1-10
The rows should be labeled with the letters A-J
Denote a square that has not been shot at with a period (.)
Denote a square that has been shot at and is a miss with an asterisk (*)
Denote a square that has been shot at and hit with the initial of the boat that has been hit.
Note that all that information can be found by calling methods in the BattleshipGrid class.

A sample printout might look like:
```
   1 2 3 4 5 6 7 8 9 10
A  . . * . . . * . . .
B  . . C . . . . . . .
C  . . C * . * . * . .
D  . . C . . . . . . .
E  . . . * B B B B . .
F  . . . . * . . . . .
G  . * . . . . S . . *
H  . . . . . . * . . .
I  . * . . . * . . . .
J  . . . . . . * . . .

Turn #21: Your shot at H-7 was a miss.
```

## Testing:
* Add multiple tests for the constructor and each method.
* For any method that can possibly receive faulty input, decide on how to state the input is faulty.
   * Return null?
   * Throw an exception?
* You will have to test the class by having it play the game and verifying the output. 
* All of your original tests should still pass with the new changes.

Demonstrate your project and tests to Mr. McKibben to receive credit.



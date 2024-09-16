# Project 1.6 BattleshipGrid Class

## Objective:

Students will implement multidimensional arrays as part of a class.

## Background:

In the game of Battleship, players keep track of hits and misses via a grid that they can update. In this assignment, you will create a class that will implement such a grid that a player can use to keep track of which shots were misses and which were hits on which ship.

##  Specifications:

You will implement a BattleshipGrid class which will keep track of hits and misses for a Battleship player. Each square will have three possible states:

* HIT \- The player has shot at this position and has hit a ship overlapping it. In this case the grid will record the initial of the ship that has been hit.  
* MISS \- The player has shot at this position and found that no ship overlaps it.  
* EMPTY \- The player has not yet shot at this position.

It will implement the following methods:

```java
public void shotAt(Position pos,boolean hit,char initial)
```

This method is called when a player has shot at a position. Hit is a Boolean that is true if the shot was a hit and false if it was a miss. Initial is the initial (A, B, C, D or S) of the ship that was hit. This value is ignored if hit is false.

```java
public boolean hit(Position pos)
```

This method returns true if the position has been shot at and is a hit and false otherwise.

```java
public boolean miss(Position pos)
```

This method returns true if the position has been shot at and is a miss and false otherwise.

```java
public boolean empty(Position pos)
```

This method returns true if the position has not been shot at.

```java
public char boatInitial(Position pos)
```

This method should only be called if the position has been shot at and is a hit. It returns the initial of the boat that has been hit.

Your BattleshipGrid class may have as many private methods as you feel necessary, but no public methods other than the above should be included. 

## Testing:

1. Add multiple tests for the constructor and each method.  
2. For any method that can possibly receive faulty input, decide on how to state the input is faulty.  
   1. Return null?  
   2. Throw an exception?  
3. All of your original tests should still pass with the new changes.

Demonstrate your project and tests to Mr. McKibben to receive credit.

# Project 1.3 Multiple Views into the Position Class 
## Objective:
Students will implement multiple views into the data.

## Background:

Although a battleship player is accustomed to referring to positions with a letter from A to J and a number from 1 to 10, arrays in Java are indexed by numbers starting from 0. For this reason, we’d like our Position class to offer an alternate view of the data where both the row and the column are viewed as numbers from 0-9.

## Specifications:

Add the following methods to your Position class:

1. Add observers called rowIndex and columnIndex which return integers between 0 and 9 for the row and column. For the row index, A should correspond to 0, B to 1, etc. For column index, the index should be one less than the number visible to the player. Note that the letter used/returned for the row is upper case.
2. Add a constructor that takes two integers as an argument, the row index and the column index.
3. Add a constructor that takes no parameters. It receives a line of input from the console. It calls checkPosition in the PositionChecker class. It uses the row and column of the position returned to determine the row and column of the position being constructed.

Note that:

* You are free to change the internal representation. It is up to you whether you want to represent the position as a character and a number or two indices. However, if you decide to change the representation, you must verify that the constructor and three methods already available still work.
* The user of the class should be free to use the row and column methods as well as the rowIndex and columnIndex methods regardless of which constructor was used to create the class.

## Testing:

1. Add testing for the new rowIndex and columnIndex methods as well as the two Integer constructor. 
2. Test your new constructor by creating a main method in position that asks the user to create a few positions.
3. All of your original tests should still pass with the new changes.

Demonstrate your project and tests to Mr. McKibben to receive credit.

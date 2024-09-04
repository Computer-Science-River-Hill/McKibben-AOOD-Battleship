# Project 1.2 Battleship Position Checker
## Objective:

Students will error check keyboard input

## Specifications:

Create a PositionChecker class with the following method:

```java
public static Position checkPosition(String inputPos) {
    return null;
}
```
This method checks that inputPos is of the form <row character>-<column> (e.g. A-1). If the column and row are both valid and within the A-J / 1-10 range, it creates an instance of position with the appropriate row and column. If either are invalid because of incorrect format or one or both are out of range, or if inputPos does not have the proper form, it gives -1 for the columnIndex. For a badly formed position, it may give any character for the row.

## Testing
Create a test class and check the following
* Input a valid position and verify the row and column of the position it returns.
* Input invalid positions and verify the row and column of the position it returns for each of the following test cases:
  * Row out of range
  * Column out of range
  * No hyphen
  * Blank line
  * Missing row
  * Missing column
  * Column that is not a number.
  * Any other edge case you can think of

Demonstrate your project and tests to Mr. McKibben to receive credit.
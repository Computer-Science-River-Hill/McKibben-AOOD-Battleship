# Project 1.5 Ocean Class
## Objective:
Students will introduce exceptions as a part of a Java program.

## Specifications:

For this assignment you will implement an ocean on which Battleship boats can be placed.

The main method you will implement will be called placeBoat. The placeBoat method will place one of the five Battleship boats in a 10x10 ocean.

When an attempt is made to place a boat, there are two problems that can occur:

* An attempt to place a boat overlapping a boat that has already been placed.
* An attempt to place a boat not entirely within the 10x10 grid.

When a Java program encounters a problem, it throws an Exception. Your placeBoat method will throw an exception if one of the above problems occurs.

To allow it to do this, you will put the words throws Exception after the method declaration:

```java 
public void placeBoat(string boatName, string direction, Position pos) throws Exception
```
Somewhere in your method, you will check for the two conditions above and throw an Exception:

```java
throw(new Exception());
```

Note that Exception is actually a Java built-in class. You can define your own exceptions, but for the purposes of this class we’ll use the one already there.

When you call placeBoat, you will do so inside a try structure:
```java
try {
   placeBoat(name,direction,pos);
}
catch(Exception ex) {
   // Put statements here to do if the exception is thrown
}

```
PlaceBoat will take three arguments, the name of the type of boat (“Aircraft Carrier”, “Battleship”, “Crusier”, “Destroyer”, “Submarine”), the direction it will be oriented in (“horizontal” or “vertical”) and a position for it to start at. Note that the Boat class has methods that will use these values and will keep track of what positions have and have not been hit. All the Ocean class needs to do is to create these boats and pass the appropriate arguments to them.

Also note that it will not be necessary to place more than 5 boats, so an array of 5 boats should be sufficient. However, if a boat in not placed successfully, placeBoat needs to be able to handle a later placement of the same boat.

In addition to the placeBoat method, you will create the following methods. Note that in most cases the Boat class will provide the information needed.

``` java 
public void shootAt(Position pos)
```
This modifier method shoots at a particular position in the ocean. If there is a boat overlapping that position, then Ocean records that the boat has been hit on that spot.

```java
public boolean hit(Position pos)
```
This observer method returns true if the position has been shot at and hit, false otherwise.

```java 
public char boatInitial(Position pos)
```
If the position has been shot at and hit, this observer method returns the initial of the boat being hit (‘A’,’B’,’C’,’D’,’S’). Assume this method will not be called on a position that has not already been hit.

```java
public String boatName(Position pos)
```
If the position has been shot at and hit, this observer method returns the name of the boat being hit. Assume this method will not be called on a position that has not already been hit.

```java 
public boolean sunk(Position pos)
```
This function returns true if a boat overlapping the position has been sunk, and false otherwise.

```java
public boolean allSunk()
```
This function returns true if all five boats have been sunk, and false otherwise. This method should probably loop through all the boats to determine whether or not they have been sunk.

It is important that your Ocean depends only on the capabilities of the Boat and Position classes that are found in the specifications, since your Ocean will be tested with standard versions of those classes. Do not rely on any capabilities of Boat and Position other than those given in the specifications.

## Testing:

1. Test multiple ships being placed, both correctly and incorrectly.
   1. To test an exception:

```java
@Test
void TestException() {
    try { 
        //code that throws an exception
        assertTrue(false); // We should not get here if we are testing an exception, something went wrong
    }
    catch (Exception e){
        assertTrue(true); //caught the exception, which we should have done. The test is successful
    }
}
```
2. Test all methods, with tests that show all working correctly and what happens when the programmer uses the class incorrectly
3. All of your original tests should still pass with the new changes.

Demonstrate your project and tests to Mr. McKibben to receive credit.
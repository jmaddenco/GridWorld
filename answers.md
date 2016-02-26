# **Part 1:**
#### Set 1 Answers:
1. The bug does not always move because if it encounters a rock, it will not move a space but will rotate. In addition to this, if the bug is fully encased in rocks, it will not move to a new location.
2. The bug rotates clockwise when it encounters an object, so it moves clockwise as well.
3. The bug rotates at 45 degree angles.
4. Bugs leave flowers behind them when they move.
5. When the bug reaches the end of the grid, it rotates clockwise to the nearest cardinal direction.
6. The bug will rotate clockwise 45 degrees to move past it.
7. The flowers do not move.
8. The flowers simply sit in the tracks behind a bug, and change color if a different colored bug travels over it.
9. A rock does not move and cannot be influenced.
10. No, both cannot exist in one square at any given time. However, when a bug encounters a flower, unlike the other objects, it removes the flower and substitutes the bug in.

### Exercises
1.
   | Degrees | Compass Direction |
   |---------|-------------------|
   | 0       | North             |
   | 45      | North-East        |
   | 90      | East              |
   | 135     | South-East        |
   | 180     | South             |
   | 225     | South-West        |
   | 270     | West              |
   | 315     | North-West        |
   | 360     | North             |
2. You can move the bug in any direction, to any square, as long as the square is on the grid. If you attempt to move the bug to a square that does not exist on the grid, an error occurs and the bug does not move. 
3. To change the color of all 3 I used the setColor() method.
4. If you move a rock on to a bug, and then move the rock again, the bug has been replaced by the rock so there is only 1 actor remaining. The rock replaced the bug at that specific location and in doing so, removed the actor.

# Part 2

#### Set 2 Answers:
1. The side length instance variable determines the amount of spaces the bug will move forward before turning. 
2. The steps variable keeps track of how many times the bug has moved, and compares that to the size of the square that the bug must create.
3. Because in the turn method, the bug only turns 45 degrees, and the angle of each square corner is 90 degrees.
4. Because the BoxBug class is an extension of bug, which has that method.
5. No, the box size will not always be the same. This is because BoxBug requires a length argument when it is called, which means that each instance of a BoxBug will potentially have a different size.
6. No, the path a BoxBug takes can never change. This is defined in a method in the BoxBug class which cannot change.
7. The steps will be zero when the length passed to that instance of BoxBug is 0, because steps starts as zero and will only increase for as long as length is greater than 0.


#### Exercises:
1. When the circlebug reaches the end of its established path, rather than turning 90 degrees it will rotate 45 degrees.
2. Check the file.
3. Check File
4. Check File
5. To add another actor you simply create the object BoxBug name = new BoxBug(length) and then you add it to the world with world.add(new Location (x, y), nameofbug)

# **Part 3:**
#### Set 3 Answers:
1. You would use the command public int firstRow = loc1.getRow() and it will return the row.
2. b will equal false because loc1 and loc2 have different values for their row and columns
3. loc3 will have (4,4);
4. 135
5. It knows based upon the parameter it is passed, since that parameter is a direction.

#### Set 4 Answers:
1. You can make a for loop which starts on the second row and uses the method Arraylist<E> getNeighbors(Location loc), then continuing that on every third line to use the fewest amount of checks. In order to ensure everything is checked, you must make it check the second to last line in every grid. In a bounded grid, you can use the method ArrayList<Location> getEmpty AdjeacentLocations(Location loc) and use the same pattern. 
2. use the method isValid(10,10), and the boolean returned will tell you
3. We cannot see the code for Grid because it is an interface, basically a list of methods for the classes to draw from. The implementations of these are found in the BoundedGrid and UnboundedGrid classes which use the interface.
4. I think it would be better to use an ArrayList rather than an Array because an Array is a set length list, and since we don't know how many objects we will find, an ArrayList with a variable length makes more sense. 

#### Set 5 Answers:
1. Each actor has a color, direction, and location
2. Its default direction is north, and its default color is red.
3. Actor is a class instead of an interface because we not only use methods from Actor, we make variations of Actor.
4. An actor cannot put itself into a grid twice without removing itself because each actor only has one location. Same with removing itself twice. And yes, the actor can remove itself and put itself back in. 
5. An actor can turn 90 degrees with two calls of the turn() method.

#### Set 6 Answers:
1. The comparison of if(gr == null) return false keeps the bug from moving outside of the grid. If the grid is null, the actor will not move.
2. The return statement return (neightbor == instanceOfRock) which checks whether the neighbor is a rock.
3. canMove must use the isValid method from Grid in order to determine whether adjacent squares are null or not.
4. The canMove method uses the method uses the getAdjacentLocation method to find the next location to check.
5. the accessor methods like getGrid and getLocation are inherited and utilized.
6. The move method will return false due to the canMove method. If that method returns true somehow, then the bug will move off the screen.
7. It could be avoided by using getLocation over and over again, but that would be way too redundant and sloppy.
8. Because the flower color is inherited from the actor.
9. It should, the bug places flowers in spaces where the bug was and is no longer.
10. The flower.putSelfInGrid(gr, loc) places the flower onto the grid.
11. It must call it four times

# **Part 4:**
#### Set 7 Answers:
1. Critter has the methods act, getActors, processActors, getMoveLocations, selectMoveLocation, and makeMove.
2.  In order to act, the critter must getActors(), processActors(), getMoveLocations(), selectMoveLocations(), makeMove().
3.  No, they should not override the method. The getActors method just returns the actors around the critter. There would be no reason to override that method, but I suppose it could if we wanted to.
4.  It can check whether there is a rock or a critter, and if there is it can remove the actor. 
5.  The getLocation method to find the actor, the getMoveLocation method to decide where to move, and finally the move method to carry out the move.
6.  Critter is not the Elder Parent class, it inherits its constructor from another class.

#### Set 8 Answers:
1. Because rather than overriding act, the Chameleon overrides the processActors method which is used in the Critters act method. This changes only the part required, and not the entire process as a whole.
2. In order to turn itself, it changes its direction and then moves in that direction. Therefore, when super is called it uses the makeMove method of the parent.
3. You could override the makeMove method again and in making the Chameleon move, place a flower in its previous place. 
4. Because the getActors method will serve the same purpose for both critters. The Chameleon will use it just the same. 
5. The Actor class must contain the getLocation method.
6. Through the getGrid() method which it inherits from the Actor class.

#### Set 9 Answers:
1. Because the CrabCritter does not need to use the processaActors method any differently than the other critters. The processActors method only removes actors from the grid if there is a conflict.
2. A CrabCritter will, after moving, test to see if there is an actor in the three spaces in front of it. If there is, it will check what type of actor it is, and if its not a rock or another critter, then it will remove that actor from the grid.
3. To get not only the direction in which it intends to move, but to find the locations in the directions 45 degrees to the left or right of the forward square such that it can test if those locations contain an edible item.
4. The possible locations would be (4,3), (4,4), and (4,5). 
5. Both the crab and the critter move one space at a time in a certain direction. The only real difference is that the crab will remove objects in a range in front of it, and the critter 
<<<<<<< HEAD
6. If the crab cannot move, it turns.
7. Because it inherits the method processActors from critter, which states that it will not remove an instance of itself from the grid.
=======
6. The makeMove() determines if the critter will turn instead of moving.
7. The CrabCritter objects don't eat each other due to
>>>>>>> part4

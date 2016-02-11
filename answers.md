# Part 1 : Observing and Experimenting with GridWorld

### Set 1
1. The bug continues to move one space in front of it until it detects a wall or obstical in front of it, then it will turn 45 degrees East of its front until nothing is in front of it.
2. The bug moves one space in front of it until it finds a obstical in front of it, then it will turn 45 degrees East of its front until nothing is in front of it.
3.  It will continuously turn East 45 degrees.
4. It will leave a flower behind.
5. The bug will turn 45 degrees East until nothing is in front of it, then it will move a space.
6. It will turn 45 degrees East until there is nothing in front of it, then it will move a space.
7. No the flowers don't move.
8. The flowers simply sit in the tracks behind a bug, and change color if a different colored bug travels over it.
9. The rock is an immovable obstical that nothing can go through.
10. No, both cannot exist in one square at any given time. However, when a bug encounters a flower, unlike the other objects, it removes the flower and substitutes the bug in.

### Exercises

1.  
| Degrees | Compass Direction |
|---------|-------------------|
| 0       | North             |
| 45      | North East        |
| 90      | East              |
| 135     | South East        |
| 180     | South             |
| 225     | South West        |
| 270     | West              |
| 315     | North West        |
| 360     | North             |
2. When you type a 2 in the first box and a 1 in the second box, the bug will be moved to the top right and then 2 down and 1 right. When you type something larger than the box, it will return an error and wont move anywhere.
3. I changed Alice's color to blue. I changed the alice.setColor(Color.ORANGE); method to alice.setColor(Color.BLUE);.
4. The bug went under the rock when it was moved on top of it. When the rock was moved off the bug is gone.

# Part 2: Bug Variations

###Methods of the Bug Class

1. The side length instance variable determines the amount of spaces the bug will move forward before turning. 
2. The steps variable keeps track of how many times the bug has moved, and compares that to the size of the square that the bug must create.
3. Because in the turn() method, the bug only turns 45 degrees, and the angle of each square corner is 90 degrees.
4. Because the BoxBug class is an extention of bug, which has that method.
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
4. An actor cannot put itself into a grid twice without removing itself because each actor only has one location. Same iwth removing itself twice. And yes, the actor can remove itself and put itself back in. 
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
10. 

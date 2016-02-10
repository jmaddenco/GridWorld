# Part 1 : Observing and Experimenting with GridWorld
### Set 1
1. Does the bug always move to a new location? Explain.
>A:  The bug continues to move one space in front of it until it detects a wall or obstical in front of it, then it will turn 45 degrees East of its front until nothing is in front of it.
2. In which direction does the bug move? 
>A:  The bug moves one space in front of it until it finds a obstical in front of it, then it will turn 45 degrees East of its front until nothing is in front of it.
3.  What does the bug do if it does not move?
>A:  It will continuously turn East 45 degrees.
4. What does the bug leave behind when it moves?
>A: It will leave a flower behind.
5. What happens when the bug is at an edge of the grid?
>A: The bug will turn 45 degrees East until nothing is in front of it, then it will move a space.
6. What happens when a bug has a rock in the location immediately in front of it?
>A: It will turn 45 degrees East until there is nothing in front of it, then it will move a space.
7. Does a flower move?
>A: No the flowers don't move.
8. What behavior does a flower have?
>A: The flowers simply sit in the tracks behind a bug, and change color if a different colored bug travels over it.
9. Does a rock move or have any other behavior?
>A: The rock is an immovable obstical that nothing can go through.
10. Can more than one actor (bug, flower, rock) be in the same location in the grid at the same time?
>A: No, both cannot exist in one square at any given time. However, when a bug encounters a flower, unlike the other objects, it removes the flower and substitutes the bug in.
### Exercises
1. Test the setDirection method with the following inputs and complete the table, giving the compass direction each input represents.
>A:
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
2. Move a bug to a different location using the moveTo method. In which directions can you move it? How far can you move it? What happens if you try to move the bug outside the grid?
>A: When you type a 2 in the first box and a 1 in the second box, the bug will be moved to the top right and then 2 down and 1 right. When you type something larger than the box, it will return an error and wont move anywhere.
3. Change the color of a bug, a flower and a rock. Which method did you use?
>A: I changed Alice's color to blue. I changed the alice.setColor(Color.ORANGE); method to alice.setColor(Color.BLUE);.
4. Move a rock on top of a bug and then move the rock again. What happened to the bug?
>A: The bug went under the rock when it was moved on top of it. When the rock was moved off the bug is gone.
# Part 2
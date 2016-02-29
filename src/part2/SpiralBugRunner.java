package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class SpiralBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		SpiralBug alice = new SpiralBug(6);
		world.add(new Location(7, 8), alice);
		world.show();
	}
}
package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class QuickCrabRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Location(8,5), new QuickCrab());
		world.add(new Location(4,4), new Rock());
		world.show();
	}
}
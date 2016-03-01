package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class KingCrabRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Location(8,5), new KingCrab());
		world.add(new Location(7,4), new Rock());
		world.add(new Location(7,5), new Rock());
		world.add(new Location(7,6), new Rock());
		world.show();
	}
}
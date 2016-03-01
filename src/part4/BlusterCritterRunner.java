package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;


public class BlusterCritterRunner {
	
	public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	world.add(new Location(8,5), new BlusterCritter(2));
	world.add(new Location(4,4), new Rock());
	world.show();
	}
}
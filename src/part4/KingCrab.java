package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	
	public void processActors(ArrayList<Actor> actors) {
		Location loc = getLocation();
		for (Actor a : actors) {
			int direction = loc.getDirectionToward(a.getLocation());
			Location moveLoc = a.getLocation().getAdjacentLocation(direction);
			if (moveLoc != null && getGrid().isValid(moveLoc)) {
				a.moveTo(moveLoc);
			} else {
				a.removeSelfFromGrid();
			}
		}
	}
}
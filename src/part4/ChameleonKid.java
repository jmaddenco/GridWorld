package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
//	 private static final double DARKENING_FACTOR = 0.05;
		/**
		 * Randomly selects a neighbor and changes this critter's color to be the
		 * same as that neighbor's. If there are no neighbors, no action is taken.
		 */
		public void processActors(ArrayList<Actor> actors) {
			Location loc = getLocation();
			
			Location front = loc.getAdjacentLocation(getDirection());
			Location behind = loc.getAdjacentLocation(getDirection() - 180);
			Grid<Actor> gr = getGrid(); 
			
			Actor frontActor = null;
			if (getGrid().isValid(front)) {
				frontActor = getGrid().get(front);
			}
			
			Actor backActor = getGrid().get(behind);
			
			if (frontActor != null) {
				setColor(frontActor.getColor());
				return;
			} else if (backActor != null) {
				setColor(backActor.getColor());
				return;
			}
			super.processActors(actors);
		}
}
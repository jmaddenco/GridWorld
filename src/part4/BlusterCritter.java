package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter {
	public int courage;
	
	public BlusterCritter(int courage) {
		setColor(Color.GRAY);
		this.courage = courage;
	}
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> extendedNeighbors = new ArrayList<Actor>();
		Location loc = getLocation();
		int row = loc.getRow();
		int col = loc.getCol();

		for (int j = -2; j < 3; j ++) {
			for (int k = -2; k < 3; k ++) {
				Location temp = new Location(row + k, col + j);
				if(getGrid().get(temp) != null && getGrid().isValid(temp) && temp != loc) {
					extendedNeighbors.add(getGrid().get(temp));
				}
			}
		}
		
		return extendedNeighbors;
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int size = actors.size();
		if (size < courage) {
			setColor(getColor().brighter());
			return;
		}
		setColor(getColor().darker());
		return;
	}
}
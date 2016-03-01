package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter {
	public QuickCrab() {
		setColor(Color.BLUE);
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			Location fartherNeighborLoc = neighborLoc.getAdjacentLocation(getDirection() + d);
				locs.add(fartherNeighborLoc);
			}
		return locs;
	}
}
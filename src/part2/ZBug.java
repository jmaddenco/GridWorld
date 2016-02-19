package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (canMove() && steps < sideLength * 3) {
			if (getDirection() == 90) {
				zMove();
				turn135();
				zMove();
				turn135();
				turn();
				turn();
				zMove();
			}
		}
	}
	
	private void turn135() {
		turn();
		turn();
		turn();
	}
	
	private void zMove() {
		for(int j = 0; j < sideLength; j++) {
			move();
			steps++;
		}
	}
}

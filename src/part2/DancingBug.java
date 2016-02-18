package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int steps;

	private int[] dance;
	
	public DancingBug(int[] array) {
		steps = 0;
		dance = array;
	}
	
	public void act() {
		for (int j = 0; j < dance.length; j ++) {
			while (canMove()) {
				move();
			} turns(dance[j]);
		}
	}
	
	private void turns(int amount) {
		for (int j = 1; j <= amount; j++) {
			turn();
		}
	}
}
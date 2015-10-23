package clueGame;

public class Solution {
	public String person;
	public String room;
	public String weapon;
	
	public Solution() {
		person = "";
		room = "";
		weapon = "";
	}
	
	public boolean equals(Solution otherSolution) {
		if (this.person.equals(otherSolution.person) &&
			this.room.equals(otherSolution.room) &&
			this.weapon.equals(otherSolution.weapon)) {
			return true;
		}
		return false;
	}
}

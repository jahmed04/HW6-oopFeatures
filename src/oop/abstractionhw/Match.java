package oop.abstractionhw;

public class Match {

	public static void main(String[] args) {
		
		Sports sports = new Soccer();
		
		sports.materials();
		sports.teams();
		sports.players();
		sports.time();
		sports.tieRules();
		
		Refree refree = new Soccer();
		refree.refree();
		
	}

}

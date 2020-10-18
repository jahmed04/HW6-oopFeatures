package oop.abstractionhw;

public class Soccer extends Refree implements Sports {

	
	public void materials() {
		System.out.println("We need a soccer ball to play this game \n");
	}
	
   public void teams() {
	   System.out.println("As usually two teams can compete \n");
	  		
	}

	public void players() {
		System.out.println("A team can have 11 players in their starting lineup \n");
	}
    
	public void time() {
		System.out.println("Game time is divided into two halves, 45 mins each and total 90 mins\n");
	}
	
	public void tieRules() {
		System.out.println("A result can be determined with a tie-breaker. \n ");	
	}
	
	public void refree() {
		System.out.println("4 match officials are needed to manage the game.");
		
	}	
}

package com.bridgelabz.wc;

public class uc2 {
	
	public static final int STAKE = 100;
	public static final int BET= 1;
	 
	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		
		 uc2 gambler = new uc2();
		 
		  System.out.println(" Welcome to Gambler Game ");
	        gambler.checkWinOrLose();
	        System.out.println("Gambler Game Finished ");
		  }

	    public void checkWinOrLose() {
	        boolean randomlyCheck = (Math.random() < 0.5);

	        if (randomlyCheck) {
	            System.out.println("  Player is Winning ");
	        } else {
	            System.out.println(" Player is Losing ");
	        }

}
}
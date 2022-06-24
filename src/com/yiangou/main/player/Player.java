package com.yiangou.main.player;

import java.util.Scanner;

public class Player implements Choice{

	// Within my game I would like a player - the player inputs choices and has
	// This player should their have a choice and their amount of lives

	private int choice;
	private int lives;
	
	// For Later -- could have a utils package that is responsible for constructing and breaking 
	// Scanner
	
	public Player() {
		this.lives = 5;
	}
	
	//A player would need to choice their number so we need a scanner
	@Override
	public int choice() {
		Scanner scan = new Scanner(System.in);
		boolean validNumber = false;
		
		System.out.println("Please enter a number between 1-100");
		while(!validNumber) {
			choice = scan.nextInt();
			if (choice >= 1 && choice <= 100) {
				System.out.println("The Number you have inputed is: " + choice);
				validNumber = true;
			} else {
				System.out.println("Your number " + choice + " is not valid");
				continue;
			}
		}
		
		//Best practise to close our scanner when we are done with it
		//It prevents data leaks
		scan.close();
		return choice;
		
	}
	
	
//	public int getChoice() {
//		return choice;
//	}
//	public void setChoice(int choice) {
//		this.choice = choice;
//	}
	public int getLives() {
		return lives;
	}
	
	public int wrongChoice() {
		return lives--;
	}

	@Override
	public String toString() {
		return "Player [choice=" + choice + ", lives=" + lives + "]";
	}

	
	
	// The player would need to choice a random number
	
	
	
	

}

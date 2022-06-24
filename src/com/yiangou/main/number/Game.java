package com.yiangou.main.number;

import java.util.ArrayList;
import java.util.List;

import com.yiangou.main.player.Player;

public class Game {

	private int winningNumber;
	private Player player;
	
	// alternate between -- Alternate between two players
	private List<Player> playerList;

	public Game() {
		this.player = new Player();
		this.playerList = new ArrayList<Player>();
		this.winningNumber = (int) ((Math.random() * 100) + 1);

		playerList.add(player);
		boolean continueLoop = true;
		while (continueLoop) {
		int playerChoice = player.choice();
		
		this.isNumberWinning(playerChoice);
		}

	}

	public void isNumberWinning(int playerChoice) {
		System.out.println(winningNumber);

		while (player.getLives() > 0) {
			if (playerChoice == winningNumber) {
				System.out.println("The player has won - yay");
				break;
			} else if (winningNumber - playerChoice <= 10) {
				System.out.println("You're warm");
				player.wrongChoice();

			} else {
				System.out.println("COLD");
				player.wrongChoice();
				break;
			}
		}

		if (player.getLives() == 0) {
			System.out.println("Game Over");
		}

	}

	public int getWinningNumber() {
		return winningNumber;
	}

	public void setWinningNumber(int winningNumber) {
		this.winningNumber = winningNumber;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

}

package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game() {
	super();
	}
	
	public Game(String player1) {
	super();
	this.player1 = player1;
	this.setComputerPlayer();
	this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public void setComputerPlayer() {
		Random num = new Random();
		int randSelection = num.nextInt(3) + 1;
		
		String compChoice;
		
		if(randSelection == 1) {
			compChoice = "Rock";
		}else if (randSelection == 2) {
			compChoice = "Paper";
		}else {
			compChoice = "Scissors";
		}
		this.setComputerPlayer(compChoice);
	}
	
	public void determineWinner() {
		String winner = "Computer";
		if(player1.equals("rock") && computerPlayer.equals("Scissors")) {
			winner = "Human";
		}else if(player1.equals("scissors") && computerPlayer.equals("Paper")) {
			winner = "Human";
		}else if(player1.equals("paper") && computerPlayer.equals("Rock")) {
			winner = "Human";
		}
		
		if(player1.equalsIgnoreCase(computerPlayer)) {
			winner = "Tie Game";
		}
		this.setWinner(winner);
		
	}
}

package com.stKilda.poker.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	
	private List<Card> hole = new ArrayList<>();
	
	private HandTypes hand;
	
	private Move move;
	
	private int bet;
	
	private int chips;
	
	private int winnings;

	public int getWinnings() {
		return winnings;
	}

	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}

	public HandTypes getHand() {
		return hand;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHole() {
		return hole;
	}

	public void setHole(List<Card> hole) {
		this.hole = hole;
	}

	public int getChips() {
		return chips;
	}

	public void setChips(int chips) {
		this.chips = chips;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public void setHand(HandTypes hand) {
		this.hand = hand;
	}

}

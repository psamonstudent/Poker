package com.stKilda.poker.model;

import java.util.ArrayList;
import java.util.List;

public class BettingRound {
	
	private List<Player> playerList = new ArrayList<>();
	
	private int largestBet;
	
	private int pot;

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public int getLargestBet() {
		return largestBet;
	}

	public void setLargestBet(int largestBet) {
		this.largestBet = largestBet;
	}



}

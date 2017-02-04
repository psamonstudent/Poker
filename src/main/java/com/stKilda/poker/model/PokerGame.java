package com.stKilda.poker.model;

import java.util.ArrayList;
import java.util.List;

public class PokerGame {
	
	private Bet minBet;
	
	private Bet maxBet;
	
	private List<Player> playerList = new ArrayList<>();
	
	private List<Round> roundList = new ArrayList<>();

	public Bet getMinBet() {
		return minBet;
	}

	public void setMinBet(Bet minBet) {
		this.minBet = minBet;
	}

	public Bet getMaxBet() {
		return maxBet;
	}

	public void setMaxBet(Bet maxBet) {
		this.maxBet = maxBet;
	}
	
	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public List<Round> getRoundList() {
		return roundList;
	}

	public void setRoundList(List<Round> roundList) {
		this.roundList = roundList;
	}

}

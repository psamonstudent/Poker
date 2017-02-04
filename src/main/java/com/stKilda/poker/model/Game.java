package com.stKilda.poker.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Game {
	
	private Date startDate;
	
	private List<Player> playerList = new ArrayList<>();
	
	private List<Round> roundList = new ArrayList<>();
	
	private Round currentRound;
	
	private int minBet;
	
	private int maxBet;
	
	private int startBalance;
	
	public Game() {
		
		Calendar cal = Calendar.getInstance();
		startDate = cal.getTime();
		
	}

	public int getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(int startBalance) {
		this.startBalance = startBalance;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Round getCurrentRound() {
		return currentRound;
	}

	public void setCurrentRound(Round currentRound) {
		this.currentRound = currentRound;
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

	public int getMinBet() {
		return minBet;
	}

	public void setMinBet(int minBet) {
		this.minBet = minBet;
	}

	public int getMaxBet() {
		return maxBet;
	}

	public void setMaxBet(int maxBet) {
		this.maxBet = maxBet;
	}

}

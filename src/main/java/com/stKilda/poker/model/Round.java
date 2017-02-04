package com.stKilda.poker.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Round {
	
	private Date startDate;
	
	private List<Card> deck = new ArrayList<>();
	
	private Player roundWinner = null;
	
	private int pot;
	
	private List<Player> playerList = new ArrayList<>();
	
	private List<Card> communityCards = new ArrayList<>();
	
	private List<BettingRound> bettingRoundList = new ArrayList<>();
	
	public Round() {
		
		Calendar cal = Calendar.getInstance();
		startDate = cal.getTime();
		
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Player getRoundWinner() {
		return roundWinner;
	}

	public void setRoundWinner(Player roundWinner) {
		this.roundWinner = roundWinner;
	}

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
	
	public List<Card> getCommunityCards() {
		return communityCards;
	}

	public void setCommunityCards(List<Card> communityCards) {
		this.communityCards = communityCards;
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

	public List<BettingRound> getBettingRoundList() {
		return bettingRoundList;
	}

	public void setBettingRoundList(List<BettingRound> bettingRoundList) {
		this.bettingRoundList = bettingRoundList;
	}

}

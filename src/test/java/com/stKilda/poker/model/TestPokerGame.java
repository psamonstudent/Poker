package com.stKilda.poker.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPokerGame {
	
	PokerGame pokerGame;
	
	@Before
	public void newPokerGameObjectShouldNotBeNull() {
		
		pokerGame = new PokerGame();
		assertNotNull(pokerGame);
		
	}
	
	@Test
	public void pokerGameFieldsShouldNotBeNull() {
		
		List<Player> playerList = new ArrayList<>();
		Player player = new Player();
		playerList.add(player);
		pokerGame.setPlayerList(playerList);
		assertEquals(player, pokerGame.getPlayerList().get(0));
		
		List<Round> roundList = new ArrayList<>();
		Round round = new Round();
		roundList.add(round);
		pokerGame.setRoundList(roundList);
		assertEquals(round, pokerGame.getRoundList().get(0));
		
		Bet minBet = new Bet();
		Bet maxBet = new Bet();
		pokerGame.setMinBet(minBet);
		pokerGame.setMaxBet(maxBet);
		assertEquals(minBet, pokerGame.getMinBet());
		assertEquals(maxBet, pokerGame.getMaxBet());
		
	}
	
}

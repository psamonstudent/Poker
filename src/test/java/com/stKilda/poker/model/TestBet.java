package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBet {
	
	Bet bet;
	
	@Before
	public void newBetObjectShouldNotBeNull() {
		
		bet = new Bet();
		assertNotNull(bet);
		
	}
	
	@Test
	public void betFieldsShouldNotBeNull() {
		
		int value = 10;
		bet.setValue(value);
		assertEquals(value, bet.getValue());
		
		Player player = new Player();
		bet.setPlayer(player);
		assertEquals(player, bet.getPlayer());
		
	}

}

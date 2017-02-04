package com.stKilda.poker.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestRound {
	
	Round round;
	
	@Before
	public void newRoundObjectShouldNotBeNull() {
		
		round = new Round();
		assertNotNull(round);
		
	}
	
	@Test
	public void roundFieldsShouldNotBeNull() {
		
		Pot pot = new Pot();
		round.setPot(pot);
		assertEquals(pot, round.getPot());
		
		List<Player> playerList = new ArrayList<>();
		Player player = new Player();
		playerList.add(player);
		round.setPlayerList(playerList);
		assertEquals(player, round.getPlayerList().get(0));
		
	}

}

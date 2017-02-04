package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {
	
	@Test
	public void newPlayerObjectShouldNotBeNull() {
		
		Player player = new Player();
		assertNotNull(player);
		
	}

}

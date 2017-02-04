package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMove {
	
	@Test
	public void newMoveObjectShouldNotBeNull() {
		
		Move move = new Move();
		assertNotNull(move);
		
	}

}

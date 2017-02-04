package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuit {
	
	@Test
	public void newSuitObjectShouldNotBeNull() {
		
		Suit suit = new Suit();
		assertNotNull(suit);
		
	}

}

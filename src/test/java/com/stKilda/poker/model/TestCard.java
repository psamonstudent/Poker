package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCard {
	
	@Test
	public void newCardObjectShouldNotBeNull() {
		
		Card card = new Card();
		assertNotNull(card);
		
	}

}

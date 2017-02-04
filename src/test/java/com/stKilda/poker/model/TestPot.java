package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPot {
	
	Pot pot;
	
	@Before
	public void newPotObjectShouldNotBeNull() {
		
		pot = new Pot();
		assertNotNull(pot);
		
	}
	
	@Test
	public void potFieldsShouldNotBeNull() {
		
		int value = 10;
		pot.setValue(value);
		assertEquals(value, pot.getValue());
		
	}

}

package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRaise {
	
	@Test
	public void newRaiseObjectShouldNotBeNull() {
		
		Raise raise = new Raise();
		assertNotNull(raise);
		
	}

}

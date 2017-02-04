package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHand {
	
	@Test
	public void newHandObjectShouldNotBeNull() {
		
		Hand hand = new Hand();
		assertNotNull(hand);
		
	}

}

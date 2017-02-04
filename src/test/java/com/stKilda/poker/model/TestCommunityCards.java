package com.stKilda.poker.model;

import org.junit.Before;

import static org.junit.Assert.*;

public class TestCommunityCards {
	
	Community community;
	
	@Before
	public void newCommunityCardsObjectShouldNotBeNull() {
		
		community = new Community();
		assertNotNull(community);
		
	}

}

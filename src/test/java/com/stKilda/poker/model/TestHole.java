package com.stKilda.poker.model;

import org.junit.Before;

import static org.junit.Assert.*;

public class TestHole {
	
	Hole hole;
	
	@Before
	public void newHoleObjectShouldNotBeNull() {
		
		hole = new Hole();
		assertNotNull(hole);
		
	}

}

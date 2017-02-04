package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFold {
	
	@Test
	public void newFoldObjectShouldNotBeNull() {
		
		Fold fold = new Fold();
		assertNotNull(fold);
		
	}

}

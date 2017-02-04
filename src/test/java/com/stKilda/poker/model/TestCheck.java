package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheck {
	
	@Test
	public void newCheckObjectShouldNotBeNull() {
		
		Check check = new Check();
		assertNotNull(check);
		
	}

}

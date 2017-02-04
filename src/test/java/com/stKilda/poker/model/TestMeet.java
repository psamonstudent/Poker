package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMeet {
	
	@Test
	public void newMeetObjectShouldNotBeNull() {
		
		Meet meet = new Meet();
		assertNotNull(meet);
		
	}

}

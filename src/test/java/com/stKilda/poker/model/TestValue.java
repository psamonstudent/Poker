package com.stKilda.poker.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValue {
	
	@Test
	public void newValueObjectShouldNotBeNull() {
		
		Value value = new Value();
		assertNotNull(value);
		
	}

}

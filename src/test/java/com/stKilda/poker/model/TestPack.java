package com.stKilda.poker.model;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPack {
	
	Pack pack;
	
	@Before
	public void newPackObjectShouldNotBeNull() {
		
		pack = new Pack();
		assertNotNull(pack);
		
	}
	
	@Test
	public void packFieldsShouldNotBeNull() {
		
		List<Card> cardList = new ArrayList<>();
		Card card = new Card();
		cardList.add(card);
		pack.setCardList(cardList);
		assertEquals(card, pack.getCardList().get(0));
		
	}

}

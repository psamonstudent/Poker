package com.stKilda.poker.util;

import java.util.List;


import com.stKilda.poker.model.BettingRound;
import com.stKilda.poker.model.Card;
import com.stKilda.poker.model.Game;
import com.stKilda.poker.model.Player;
import com.stKilda.poker.model.Round;
import com.stKilda.poker.model.Suit;
import com.stKilda.poker.model.Value;

public class PokerUtil {
	
	private static final int MIN_CARDS = 0;
	private static final int MAX_CARDS = 52;
	
	public static void setCardSymbol(Card card) {
		
		switch (card.getSuit()) {
		
		case HEARTS:
			
			switch(card.getValue()) {
			
			case ACE:	
				
				card.setSymbol("🂱 ");
				return; 
				
			case TWO:
				
				card.setSymbol("🂲");
				return;
				
			case THREE:
				
				card.setSymbol("🂳 ");
				return;
				
			case FOUR:
				
				card.setSymbol("🂴");
				return;
				
			case FIVE:
				
				card.setSymbol("🂵");
				return;
				
			case SIX:
				
				card.setSymbol("🂶");
				return;
				
			case SEVEN:
				
				card.setSymbol("🂷");
				return;
				
			case EIGHT:
				
				card.setSymbol("🂸");
				return;
				
			case NINE:
				
				card.setSymbol("🂹");
				return;
				
			case TEN:
				
				card.setSymbol("🂺");
				return;
				
			case JACK:
				
				card.setSymbol("🂻");
				return;
				
			case QUEEN:
				
				card.setSymbol("🂽");
				return;
				
			case KING: 
				
				card.setSymbol("🂾");
				return;
		
			}
			
		case DIAMONDS:
			
			switch(card.getValue()) {
			
			case ACE:	
				
				card.setSymbol("🃁");
				return; 
				
			case TWO:
				
				card.setSymbol("🃂");
				return;
				
			case THREE:
				
				card.setSymbol("🃃");
				return;
				
			case FOUR:
				
				card.setSymbol("🃄");
				return;
				
			case FIVE:
				
				card.setSymbol("🃅");
				return;
				
			case SIX:
				
				card.setSymbol("🃆");
				return;
				
			case SEVEN:
				
				card.setSymbol("🃇");
				return;
				
			case EIGHT:
				
				card.setSymbol("🃈");
				return;
				
			case NINE:
				
				card.setSymbol("🃉");
				return;
				
			case TEN:
				
				card.setSymbol("🃊");
				return;
				
			case JACK:
				
				card.setSymbol("🃋");
				return;
				
			case QUEEN:
				
				card.setSymbol("🃍");
				return;
				
			case KING: 
				
				card.setSymbol("🃎");
				return;
		
			}
			
		case CLUBS:
			
			switch(card.getValue()) {
			
			case ACE:	
				
				card.setSymbol("🃑");
				return; 
				
			case TWO:
				
				card.setSymbol("🃒");
				return;
				
			case THREE:
				
				card.setSymbol("🃓");
				return;
				
			case FOUR:
				
				card.setSymbol("🃔");
				return;
				
			case FIVE:
				
				card.setSymbol("🃕");
				return;
				
			case SIX:
				
				card.setSymbol("🃖");
				return;
				
			case SEVEN:
				
				card.setSymbol("🃗");
				return;
				
			case EIGHT:
				
				card.setSymbol("🃘");
				return;
				
			case NINE:
				
				card.setSymbol("🃙");
				return;
				
			case TEN:
				
				card.setSymbol("🃚");
				return;
				
			case JACK:
				
				card.setSymbol("🃛");
				return;
				
			case QUEEN:
				
				card.setSymbol("🃝");
				return;
				
			case KING: 
				
				card.setSymbol("🃞");
				return;
		
			}
			
		case SPADES:
			
			switch(card.getValue()) {
			
			case ACE:	
				
				card.setSymbol("🂡");
				return; 
				
			case TWO:
				
				card.setSymbol("🂢");
				return;
				
			case THREE:
				
				card.setSymbol("🂣");
				return;
				
			case FOUR:
				
				card.setSymbol("🂤");
				return;
				
			case FIVE:
				
				card.setSymbol("🂥");
				return;
				
			case SIX:
				
				card.setSymbol("🂦");
				return;
				
			case SEVEN:
				
				card.setSymbol("🂧");
				return;
				
			case EIGHT:
				
				card.setSymbol("🂨");
				return;
				
			case NINE:
				
				card.setSymbol("🂩");
				return;
				
			case TEN:
				
				card.setSymbol("🂪");
				return;
				
			case JACK:
				
				card.setSymbol("🂫");
				return;
				
			case QUEEN:
				
				card.setSymbol("🂭");
				return;
				
			case KING: 
				
				card.setSymbol("🂮");
				return;
		
			}
		
		}
		
	}
	
	public static void printState(Round round) {

		System.out.println("Pot: " + round.getPot());
		System.out.println("  " + round.getCommunityCards().toString());
		
		for(Player player: round.getPlayerList()) {
			
			if(player.getBet() > 0) {
				
				System.out.printf("%8d ", player.getBet());
				
			}
			
		}
		
		System.out.println();
		
		for(Player player: round.getPlayerList()) {
			
			System.out.printf("%1s", " ");
			System.out.print(player.getHole() + " ");
			
		}
		System.out.println();
		
		for(Player player: round.getPlayerList()) {
			
			System.out.printf("%8d ", player.getChips());
			
		}
		System.out.println();
		
		for(Player player: round.getPlayerList()) {
			
			System.out.printf("%8s ", player.getName());
			
		}
		System.out.println();
		
	}
	
	public static void resetDeck(List<Card> deck) {
		
		deck.clear();
		
		for(Suit suit: Suit.values()) {
			
			for(Value value: Value.values()) {
				
				Card card = new Card();
				card.setSuit(suit);
				card.setValue(value);
				PokerUtil.setCardSymbol(card);
				deck.add(card);
				
			}
			
		}
		
	}
	
	public static void shuffleDeck(List<Card> deck) {
		
		for(int i = 0; i < deck.size() - 1; i++) {
			
			int random = RandomUtil.randomInt(MIN_CARDS, MAX_CARDS - 1);
			
			Card temp = deck.get(i);
			deck.set(i, deck.get(random));
			deck.set(random, temp);
			
			
		}
		
	}
	
	public static Card dealCard(List<Card> deck) {

		
		Card dealt = deck.get(MIN_CARDS);
		deck.remove(MIN_CARDS);
		
		return dealt;
		
	}

	public static void removeBrokePlayers(Game game) {
	
		for(int i = 0; i < game.getPlayerList().size() - 1; i++) {
			
			if(game.getPlayerList().get(i).getChips() == 0) {
				
				game.getPlayerList().remove(i);
				
			}
			
		}
		
	}
	
	public static void deal(Round round) {
		
		for(Player player: round.getPlayerList()) {
			
			player.getHole().add(PokerUtil.dealCard(round.getDeck()));
			
		}
		
	}
	
	public static void rotateDealerByOne(List<Player> playerList) {
		
		Player temp = playerList.get(0);
		
		for(int i = 0; i < playerList.size() - 1; i++) {
			
			
			playerList.set(i, playerList.get(i + 1));
			
		}
		
		playerList.set(playerList.size() - 1, temp);
		
	}
	
	public static void bet(BettingRound bettingRound) {
		
		for(Player player: bettingRound.getPlayerList()) {
			
			
			
		}
		
	}
	
	public static void transferChips() {
		
		
		
	}
	
	public static Player getWinner(BettingRound bettingRound, List<Card> communityCards) {
		
		Player winner = bettingRound.getPlayerList().get(0);
		
		for(int i = 1; i < bettingRound.getPlayerList().size() - 1; i++) {
			
			// TODO winner = player with the better hand
			
		}
		
		bettingRound.getPlayerList().remove(bettingRound.getPlayerList().indexOf(winner));
		PokerUtil.transferBetsToPot(bettingRound.getPlayerList(), bettingRound);
	
		return winner;
		
	}
	
	public static Player compareHands(Player playerOne, Player playerTwo, List<Card> communityCards) {
		
		// TODO
		
		return null;
		
	}
	
	public static List<Card> bestHand(List<Card> handOne, List<Card> handTwo) {
		
		// TODO
		
		if(handOne.size() != handTwo.size()) {
			
			// TODO throw exception
			
		}
		
		
		
		return null;
		
	}
	
	public static void transferBetsToPot(List<Player> playerList, BettingRound bettingRound) {
		
		for(Player player: playerList) {
			
			bettingRound.setPot(bettingRound.getPot() + player.getBet());
			player.setBet(0);
			
		}
		
	}
	
	public static void transferPotToPot(Round round, BettingRound bettingRound) {
		
		round.setPot(round.getPot() + bettingRound.getPot());
		
	}
	
	public static void transferPotToPlayer(Player player, Round round) {
		
		player.setChips(player.getChips() + round.getPot());
		
	}

}

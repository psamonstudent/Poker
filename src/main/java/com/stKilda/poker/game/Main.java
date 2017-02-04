package com.stKilda.poker.game;

import java.util.Scanner;

import com.stKilda.poker.exception.GameLogicException;
import com.stKilda.poker.exception.InvalidInputException;
import com.stKilda.poker.model.BettingRound;
import com.stKilda.poker.model.Game;
import com.stKilda.poker.model.GameSystem;
import com.stKilda.poker.model.Player;
import com.stKilda.poker.model.Round;
import com.stKilda.poker.util.PokerUtil;

public class Main {
	
	private static final int INITIAL_BALANCE = 5000;
	private static Scanner scanner = new Scanner(System.in);
	private static GameSystem system = new GameSystem();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to PokerStats!");
		
		while(true) {
			
			System.out.println("What would you like to do?");
			System.out.println("Enter the number corresponding to the action you would like to take:");
			System.out.println("[1] create new player");
			System.out.println("[2] start new game");
			System.out.print("> ");
			
			int input = scanner.nextInt();
			
			System.out.println();
			
			if(input == 1) {
				
				System.out.println("You entered: \"1\" create new player");
				System.out.println("Enter the name of the new player");
				System.out.print("> ");
				String name = scanner.next();
				
				Player player = new Player();
				player.setName(name);
				player.setWinnings(INITIAL_BALANCE);
				system.getPlayerList().add(player);
				System.out.println("New player \"" + player.getName() + "\" created.");
				
			} else {
				
				System.out.println("You entered: \"2\" start new game");
				System.out.println("Select players by number:");
				
				for(int i = 0; i < system.getPlayerList().size(); i++) {
					
					System.out.println("[" + i + "] " + system.getPlayerList().get(i).getName());
					
				}
				
				System.out.print("> ");
				
				Game game = new Game();
				
				while(scanner.hasNextInt()) {
					
					int playerNumber = scanner.nextInt();
					
					game.getPlayerList().add(system.getPlayerList().get(playerNumber));
					
				}					
				scanner.nextLine();
				System.out.print("Enter minimum bet:\n> ");
				scanner.nextLine();
				game.setMinBet(scanner.nextInt());
				System.out.println();
				System.out.print("Enter maximum bet:\n> ");
				game.setMaxBet(scanner.nextInt());
				System.out.println();
				System.out.print("Enter initial chip balance:\n> ");
				game.setStartBalance(scanner.nextInt());
				System.out.println();
				
				
				
				system.getGameList().add(game);
				playGame(game);
				
			}
			
		}
		
	}
	
	private static void playGame(Game game) {
		
		System.out.println("Begin new game.");
		for(Player player: game.getPlayerList()) {
			
			player.setChips(game.getStartBalance());
			player.setWinnings(player.getWinnings() - game.getStartBalance());
			
		}
		
		Round round = new Round();
		game.getRoundList().add(round);
		round.setPlayerList(game.getPlayerList());
		playRound(round);
		
		
	}
	
	private static Player playRound(Round round) {
		
		System.out.println("Begin new round.");
		System.out.println("Shuffling deck...");
		PokerUtil.rotateDealerByOne(round.getPlayerList());
		PokerUtil.resetDeck(round.getDeck());
		PokerUtil.shuffleDeck(round.getDeck());
		PokerUtil.deal(round);
		PokerUtil.deal(round);
		PokerUtil.printState(round);
		
		try {
			
			Player winningPlayer = playBettingRound(round);
			if(winningPlayer != null) {
				//TODO
				return winningPlayer;	
			}
			System.out.println("The Flop...");
			round.getCommunityCards().add(PokerUtil.dealCard(round.getDeck()));
			round.getCommunityCards().add(PokerUtil.dealCard(round.getDeck()));
			round.getCommunityCards().add(PokerUtil.dealCard(round.getDeck()));
			winningPlayer = playBettingRound(round);
			if(winningPlayer != null) {
				//TODO
				return winningPlayer;	
			}
			System.out.println("The Turn...");
			round.getCommunityCards().add(PokerUtil.dealCard(round.getDeck()));
			winningPlayer = playBettingRound(round);
			if(winningPlayer != null) {
				//TODO
				return winningPlayer;	
			}
			System.out.println("The River...");
			round.getCommunityCards().add(PokerUtil.dealCard(round.getDeck()));
			winningPlayer = playBettingRound(round);
			
			if(winningPlayer == null) {
				
				winningPlayer = decideWinner(round);
				
			}
			
			return winningPlayer;
			
		} catch(InvalidInputException e) {	
			e.printStackTrace();
		} catch(GameLogicException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	private static Player playBettingRound(Round round) throws InvalidInputException, GameLogicException {
		
		BettingRound bettingRound = new BettingRound();
		bettingRound.setPlayerList(round.getPlayerList());
		int i = 0;
		
		PokerUtil.printState(round);
		
		Player currentPlayer = round.getPlayerList().get(i);
		System.out.println(currentPlayer.getName() + "'s move...");
		System.out.println("Enter move");
		//System.out.println("[1] Fold");
		System.out.println("[2] Check");
		//System.out.println("[3] Meet");
		System.out.println("[4] Raise");
		System.out.print("> ");
		int move = scanner.nextInt();
		
		if(move == 4) {
			
			raise(bettingRound, currentPlayer);
			
		}
		
		i++;
		
		while(true) {
			
			System.out.println("i=" + i);
			
			PokerUtil.printState(round);
			currentPlayer = bettingRound.getPlayerList().get(i);
			System.out.println(currentPlayer.getName() + "'s move...");
			
			if(currentPlayer.getBet() < bettingRound.getLargestBet()) {
				
				System.out.println("Enter move");
				System.out.println("[1] Fold");
				System.out.println("[3] Meet");
				System.out.println("[4] Raise");
				move = scanner.nextInt();
				System.out.println("move = " + move);
				
				if(move == 1) {
					
					System.out.println("player folds");
					bettingRound.getPlayerList().remove(i);
					bettingRound.setPot(bettingRound.getPot() + currentPlayer.getBet());
					
				} else if(move == 3) {
					
					System.out.println("player meets");
					currentPlayer.setBet(bettingRound.getLargestBet());
					currentPlayer.setChips(currentPlayer.getChips() - currentPlayer.getBet());
					
				} else if(move == 4) {
					
					raise(bettingRound, currentPlayer);
					System.out.println("player raises");
					
				} else {
					
					throw new InvalidInputException();
					
				}
				
			} else if(bettingRound.getLargestBet() == 0) {
				
				if(i == 0) {
					
					// everyone checked
					return null;
					
				} else {
					
					System.out.println("Enter move");
					System.out.println("[2] Check");
					System.out.println("[4] Raise");
					move = scanner.nextInt();
					
					if(move == 2) {
						
						System.out.println("player checks");
						
					} else if(move == 4) {
						
						raise(bettingRound, currentPlayer);
						System.out.println("player raises");
						
					} else {
						
						//TODO: invalid input
						throw new InvalidInputException();
						
					}
					
				}
				
			} else if(bettingRound.getPlayerList().size() == 1) {
				
				// everyone else folded
				return bettingRound.getPlayerList().get(0);
				
			} else {
				
				for(Player player: bettingRound.getPlayerList()) {
					
					round.setPot(round.getPot() + player.getBet());
					player.setBet(0);
					
				}
				return null;
				
			}

			i = (i + 1) % round.getPlayerList().size();
			
		}
		 
	}
	
	public static void raise(BettingRound bettingRound, Player player) {
		
		System.out.print("Enter amount to raise\n> ");
		int raise = scanner.nextInt();
		player.setBet(bettingRound.getLargestBet() + raise);
		player.setChips(player.getChips() - player.getBet());
		bettingRound.setLargestBet(player.getBet());
		
	}
	
	public static Player decideWinner(Round round) {
		
		//TODO
		return null;
		
	}

}

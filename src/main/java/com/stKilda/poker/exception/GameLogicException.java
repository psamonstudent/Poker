package com.stKilda.poker.exception;

public class GameLogicException extends Exception {

	public GameLogicException() {
		super("Error in game logic.");
	}

	public GameLogicException(String message) {
		super(message);
	}
}

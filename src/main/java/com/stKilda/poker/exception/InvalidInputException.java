package com.stKilda.poker.exception;

public class InvalidInputException extends Exception {

	public InvalidInputException() {
		super("Invalid Input.");
	}

	public InvalidInputException(String message) {
		super(message);
	}

}
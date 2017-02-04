package com.stKilda.poker.util;

public class RandomUtil {
	
	public static int randomInt(int min, int max) {
		
		int difference = max - min;
		
		return (int) Math.floor(Math.random() * (difference + 1)) + min;
		
	}

}

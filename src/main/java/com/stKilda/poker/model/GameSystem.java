package com.stKilda.poker.model;

import java.util.ArrayList;

import java.util.List;

public class GameSystem {
	
	private List<Player> playerList = new ArrayList<>();
	private List<Game> gameList = new ArrayList<>();
	
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	public List<Game> getGameList() {
		return gameList;
	}
	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}

}

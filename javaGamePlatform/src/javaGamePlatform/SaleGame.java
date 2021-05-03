package javaGamePlatform;

import javaGamePlatform.Game;
import javaGamePlatform.Gamer;

public class SaleGame {
	private int id;
	private Gamer gamer;
	private Game game;

	
	public SaleGame() {
		
	}

	public SaleGame(int id, Gamer gamer, Game game) {
		this.id = id;
		this.gamer = gamer;
		this.game = game;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}


	
	
	

	
}


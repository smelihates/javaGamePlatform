package javaGamePlatform;

import javaGamePlatform.GameCategory;

public class Game {
	private int id;
	private String name;
	private GameCategory category;
	private Double price;
	
	public Game() {
		
	}

	public Game(int id, String name, GameCategory category,Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameCategory getCategory() {
		return category;
	}

	public void setCategory(GameCategory category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
}


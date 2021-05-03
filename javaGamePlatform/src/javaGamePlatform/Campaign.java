package javaGamePlatform;

import javaGamePlatform.Game;

public class Campaign {
	private int id;
	private Game game;
	private String campaignName;
	private int discountPercent;
	
	public Campaign() {
		
	}

	public Campaign(int id, Game game, String campaignName, int discountPercent) {
		this.id = id;
		this.game = game;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
	
	
	
	
}


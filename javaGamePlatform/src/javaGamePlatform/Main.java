package javaGamePlatform;

import javaGamePlatform.Campaign;
import javaGamePlatform.CampaignManager;
import javaGamePlatform.Game;
import javaGamePlatform.GameCategory;
import javaGamePlatform.GameCategoryManager;
import javaGamePlatform.Gamer;
import javaGamePlatform.GamerManager;
import javaGamePlatform.SaleGame;
import javaGamePlatform.SaleGameManager;

public class Main {

	public static void main(String[] args) {
		GameCategory gameCategory1=new GameCategory(1,"Aksiyon");
		GameCategory gameCategory2=new GameCategory(2,"Bulmaca");
		
		
		GameCategoryManager gameCategoryManager=new GameCategoryManager();
		gameCategoryManager.add(gameCategory1);
		gameCategoryManager.add(gameCategory2);
		
		
		Game game1=new Game(1, "Hitman", gameCategory1,10.0);
		Game game2=new Game(2, "The Room", gameCategory2,12.0);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		Gamer gamer1=new Gamer(1970,"11111111111",1,"melih","ateþ","melih@melih.com");
		Gamer gamer2=new Gamer(1975,"22222222222",2,"salih","dadý","salih@salih.com");
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);		
		
		
		SaleGame saleGame1 = new SaleGame(1,gamer1,game1);
		SaleGame saleGame2 = new SaleGame(2,gamer1,game2);
		
		
		SaleGameManager saleGameManager=new SaleGameManager();
		saleGameManager.add(saleGame1);
		saleGameManager.add(saleGame2);
		
		Campaign campaign1= new Campaign(1, game1,"Efsane Cuma", 20);
		
		CampaignManager campaignManager1=new CampaignManager();
		campaignManager1.add(campaign1);
		
		SaleGame saleGame3 = new SaleGame(3,gamer2,game1);
		saleGameManager.add(saleGame3);

	}

}

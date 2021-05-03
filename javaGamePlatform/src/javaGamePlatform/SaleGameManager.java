package javaGamePlatform;

import javaGamePlatform.Crud;
import javaGamePlatform.SaleGame;

public class SaleGameManager implements Crud<SaleGame>{

	private SaleGame game;
	private SaleGame[] games;
	
	@Override
	public void add(SaleGame entity) {
		System.out.println("---------------------------------------------------");
		System.out.println("Oyuncu Adý      : " + entity.getGamer().getFirstName());
		System.out.println("Oyun Adý        : " + entity.getGame().getName() );
		System.out.println("Oyun Fiyatý     : " + entity.getGame().getPrice() +" TL ye satýldý.");
		//System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya satýldý.");
		
	}

	@Override
	public SaleGame get(int id) {
		System.out.println(game.getGame().getName() + " isimli oyun " + game.getGamer().getFirstName() +" isimli Oyuncuya ya yapýlan satýþ bilgileri.");
		return game;
	}

	@Override
	public void update(SaleGame entity) {
		System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya satýþ bilgileri güncellendi.");
		
	}

	@Override
	public void delete(SaleGame entity) {
		System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya yapýlan satýþ iptal edildi.");
		
	}

	@Override
	public SaleGame[] list() {
		System.out.println( "Oyun satýþ bilgileri listelendi.");
		return games;
	}

}


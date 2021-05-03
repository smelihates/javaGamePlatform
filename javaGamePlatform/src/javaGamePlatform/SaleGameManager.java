package javaGamePlatform;

import javaGamePlatform.Crud;
import javaGamePlatform.SaleGame;

public class SaleGameManager implements Crud<SaleGame>{

	private SaleGame game;
	private SaleGame[] games;
	
	@Override
	public void add(SaleGame entity) {
		System.out.println("---------------------------------------------------");
		System.out.println("Oyuncu Ad�      : " + entity.getGamer().getFirstName());
		System.out.println("Oyun Ad�        : " + entity.getGame().getName() );
		System.out.println("Oyun Fiyat�     : " + entity.getGame().getPrice() +" TL ye sat�ld�.");
		//System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya sat�ld�.");
		
	}

	@Override
	public SaleGame get(int id) {
		System.out.println(game.getGame().getName() + " isimli oyun " + game.getGamer().getFirstName() +" isimli Oyuncuya ya yap�lan sat�� bilgileri.");
		return game;
	}

	@Override
	public void update(SaleGame entity) {
		System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya sat�� bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(SaleGame entity) {
		System.out.println(entity.getGame().getName() + " isimli oyun " + entity.getGamer().getFirstName() +" isimli Oyuncuya yap�lan sat�� iptal edildi.");
		
	}

	@Override
	public SaleGame[] list() {
		System.out.println( "Oyun sat�� bilgileri listelendi.");
		return games;
	}

}


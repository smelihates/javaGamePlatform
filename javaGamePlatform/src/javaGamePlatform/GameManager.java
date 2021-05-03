package javaGamePlatform;

import javaGamePlatform.Crud;
import javaGamePlatform.Game;

public class GameManager implements Crud<Game>{

	private Game game;
	private Game[] games;
	
	@Override
	public void add(Game entity) {
		System.out.println("---------------------------------------------------");
		System.out.println("Oyun Kategorisi : " + entity.getCategory().getName());
		System.out.println("Oyun Adý        : " + entity.getName());
		System.out.println("Oyun Fiyatý     : " + entity.getPrice() + " TL olarak sisteme eklendi.");
		
		
		
	}

	@Override
	public Game get(int id) {
		System.out.println(id + " no'lu Oyun bilgileri getirildi.");
		return game;
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getName() + " isimli Oyun bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getName() + " isimli Oyun sistemden silindi.");
		
	}
		
	@Override
	public Game[] list() {
		System.out.println( "Oyunlar listelendi.");
		return games;
		
	}

}


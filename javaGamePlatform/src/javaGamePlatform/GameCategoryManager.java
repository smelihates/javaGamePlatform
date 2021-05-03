package javaGamePlatform;

import javaGamePlatform.Crud;
import javaGamePlatform.GameCategory;

public class GameCategoryManager implements Crud<GameCategory> {

	private GameCategory category;
	private GameCategory[] categories;
	
	@Override
	public void add(GameCategory entity) {
		System.out.println(entity.getName() + " isimli Oyun Kategorisi sisteme eklendi.");
		
	}

	@Override
	public GameCategory get(int id) {
		System.out.println(id + " no'lu Oyun Kategori bilgileri getirildi.");
		return category;
	}

	@Override
	public void update(GameCategory entity) {
		System.out.println(entity.getName() + " isimli Oyun Kategori bilgileri güncellendi.");
		
	}

	@Override
	public void delete(GameCategory entity) {
		System.out.println(entity.getName() + " isimli Oyun Kategorisi sistemden silindi.");
		
	}

	@Override
	public GameCategory[] list() {
		System.out.println( "Oyun Kategorileri listelendi.");
		return categories;
	}

}


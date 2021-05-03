package javaGamePlatform;

import javaGamePlatform.Campaign;
import javaGamePlatform.Crud;

public class CampaignManager implements Crud<Campaign> {

	private Campaign campaign;
	private Campaign[] campaigns ;
	
	@Override
	public void add(Campaign entity) {

		
		
		System.out.println("---------------------------------------------------");
		System.out.println("Kampanya Ad�    : " + entity.getCampaignName());
		System.out.println("Oyun   Ad�      : " + entity.getGame().getName());
		
		System.out.println("Oyun Fiyat�     : " + entity.getGame().getPrice() + " TL");
		System.out.println("�ndirim Oran�   : " + entity.getDiscountPercent() + " %");
		
		entity.getGame().setPrice(entity.getGame().getPrice()*(100-entity.getDiscountPercent())/100);
		
		System.out.println("�ndirimli Fiyat : " + entity.getGame().getPrice() + " TL ile sisteme eklendi.");
		
		//System.out.println(entity.getCampaignName() + " isimli Kampanya sisteme eklendi.");
		//System.out.println(entity.getCampaignName() + " isimli Kampanya ile " + entity.getGame().getName() +" isimli oyunun fiyat� " + entity.getGame().getPrice()+" TL olmu�tur.");
		
	}

	@Override
	public Campaign get(int id) {
		System.out.println(id + " no'lu Kampanya bilgileri getirildi.");
		return campaign;
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getCampaignName() + " isimli Kampanya bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getCampaignName() + " isimli Kampanya sistemden silindi.");
		
	}

	@Override
	public Campaign[] list() {
		System.out.println( "Kampanyalar listelendi.");
		return campaigns;
	}

	
}


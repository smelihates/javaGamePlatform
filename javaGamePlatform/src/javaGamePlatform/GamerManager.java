package javaGamePlatform;

import javaGamePlatform.Crud;


public class GamerManager implements Crud<Gamer>, VerifyNationalId  {

	private Gamer gamer;
	private Gamer[] gamers;
	
	@Override
	public void add(Gamer entity) {
		System.out.println("---------------------------------------------------");
		System.out.println(entity.getFirstName() + " isimli oyuncu sisteme eklendi.");
		
	}

	@Override
	public Gamer get(int id) {
		System.out.println(id + " no'lu oyuncu bilgileri getirildi.");
		return gamer;
	}

	@Override
	public void update(Gamer entity) {
		System.out.println(entity.getFirstName() + " isimli oyuncu bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Gamer entity) {
		System.out.println(entity.getFirstName() + " isimli oyuncu sistemden silindi.");
		
	}

	@Override
	public Gamer[] list() {
		System.out.println( "oyuncular listelendi.");
		return gamers;
		
	}

	@Override
	public boolean IsVerifiedNationalId(String nationalId, String firstName, String lastName, int birthYear) {
		
		return NationalId.IsVerify(nationalId, firstName, lastName, birthYear);
	}
	
	

}


package javaGamePlatform;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private int birthYear;
	private String nationalId;
	
	public Gamer() {
	
	}

	public Gamer(int birthYear, String nationalId,int id, String firstName, String lastName, String eMail) {
		this.birthYear = birthYear;
		this.nationalId = nationalId;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String geteMail() {
		return eMail;
	}



	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	

	
}


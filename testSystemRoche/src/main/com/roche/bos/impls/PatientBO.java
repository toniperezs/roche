package main.com.roche.bos.impls;

public class PatientBO {
	
	private String name;
	private String surname;
	private String id;
	
	
	public PatientBO(String name, String surname, String id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}

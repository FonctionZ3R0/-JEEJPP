package fr.epsi.dto;

public class ClientDTO {

	private String nom;
	private String adresse;
	
	public ClientDTO() {}
	
	public ClientDTO (String n, String a) 
	{
		this.nom = n;
		this.adresse = a;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) 
	{
		this.nom = n;
	}
	
	public String getAdresse() 
	{
		return adresse;
	}
	
	public void setAdresse(String a) 
	{
		this.adresse = a;
	}
	
}

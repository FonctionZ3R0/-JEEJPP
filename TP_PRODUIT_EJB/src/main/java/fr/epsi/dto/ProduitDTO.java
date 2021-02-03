package fr.epsi.dto;

public class ProduitDTO {

	private String nom;
	private String codeBarre;
	
	public ProduitDTO () {}
	
	public ProduitDTO (String n, String c) 
	{
		this.nom = n;
		this.codeBarre = c;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public String getCodeBarre() 
	{
		return codeBarre;
	}
	
	public void setCodeBarre(String codeBarre) 
	{
		this.codeBarre = codeBarre;
	}
	
}

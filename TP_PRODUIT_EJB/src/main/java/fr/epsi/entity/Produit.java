package fr.epsi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.epsi.dto.ProduitDTO;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String codeBarre;
	
	public Produit() {}
	
	public Produit (String n, String c) 
	{
		this.nom = n;
		this.codeBarre = c;
	}
	
	public Produit (ProduitDTO p) 
	{
		this.nom = p.getNom();
		this.codeBarre = p.getCodeBarre();
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

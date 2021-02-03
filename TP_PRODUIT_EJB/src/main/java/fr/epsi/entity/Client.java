package fr.epsi.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import fr.epsi.dto.ClientDTO;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String adresse;
	
	@ManyToOne
	private Collection<Facture> facture;
	
	public Client() {}
	
	public Client (String n, String a) 
	{
		this.nom = n;
		this.adresse = a;
	}
	
	public Client (ClientDTO c) 
	{
		this.nom = c.getNom();
		this.adresse = c.getAdresse();
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
		return adresse;
	}
	
	public void setCodeBarre(String codeBarre) 
	{
		this.adresse = codeBarre;
	}

	public Collection<Facture> getFacture() {
		return facture;
	}

	public void setFacture(Collection<Facture> facture) {
		this.facture = facture;
	}
	
}

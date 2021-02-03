package fr.epsi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LigneFacture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quantite;
	private double prix;
	
	public LigneFacture() {}
	
	public LigneFacture(Long id, int q, double p) {
		this.id = id;
		this.quantite = q;
		this.prix = p;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
}

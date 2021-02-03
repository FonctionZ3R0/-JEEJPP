package fr.epsi.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String numero;
	private double prix;
	
	@OneToMany(mappedBy = "client")
	private Collection<Client> client;
	
	@ManyToOne
	private Collection<LigneFacture> ligneFacture;
	
	public Facture() {}
	
	public Facture(Long id, Date d, String n, double p) {
		this.id = id;
		this.date = d;
		this.numero = n;
		this.prix = p;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
}

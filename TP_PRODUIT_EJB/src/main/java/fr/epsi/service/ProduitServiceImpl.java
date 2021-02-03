package fr.epsi.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ProduitDao;
import fr.epsi.dao.ProduitDaoImpl;
import fr.epsi.dto.ProduitDTO;
import fr.epsi.entity.Produit;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProduitServiceImpl implements ProduitService {

	@PersistenceContext(unitName = "produitPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
//	public void create(ProduitDTO pDTO) 
//	{
//		System.out.println(pDTO.getNom() + " " + pDTO.getCodeBarre());
//		Produit p = new Produit(pDTO);
//	}
	
	public void create(ProduitDTO pDTO)  
	{
		Produit produit=new Produit(pDTO);
//		ProduitDao dao=new ProduitDaoImpl(em, utx);
//		ProduitDaoImpl dao=new ProduitDaoImpl(em, utx);
		em.persist(produit);
//		dao.create(produit);
	}
	
	public List<Produit> getListeProduit()
	{
		List<Produit> listProd = new ArrayList<Produit>();
		Produit produit1 = new Produit("Produit1", "123456");
		Produit produit2 = new Produit("Produit2", "456123");
		listProd.add(produit1);
		listProd.add(produit2);
		return listProd;
	}
	
	public Produit findProductByName(String n)
	{
		List<Produit> list = getListeProduit();
		System.out.println(" !\nTaille de la liste : "+list.size());
		for (Produit produit : list) {
			System.out.println("Nom produit dans service : "+produit.getNom());
			if (produit.getNom().equals(n))
			{
				System.out.println("IF is ON !!");
				System.out.println("paramètre fonction dans service: "+n);
				System.out.println("Nom produit dans service : "+produit.getNom());
				return produit;
			}
		}
		return null;
	}
	
}

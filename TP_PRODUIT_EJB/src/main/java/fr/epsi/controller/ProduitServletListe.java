package fr.epsi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ProduitDTO;
import fr.epsi.entity.Produit;
import fr.epsi.service.ProduitService;

@WebServlet("/produitListe")
public class ProduitServletListe extends HttpServlet {

	@EJB 
	ProduitService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
			List<Produit> listProd = new ArrayList<Produit>();
			listProd = service.getListeProduit();
			req.setAttribute("listeProduit", listProd);
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/FormulaireProduit.jsp").forward(req, resp);
        }
	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		String nom = req.getParameter("nomProduit");
    		String codeBarre = req.getParameter("codeBarre");
    		
    		ProduitDTO p = new ProduitDTO(nom, codeBarre);
    		service.create(p);
        }
    
}

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

import fr.epsi.dto.ClientDTO;
import fr.epsi.entity.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImpl implements ClientService {

	@PersistenceContext(unitName = "produitPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(ClientDTO cDTO) 
	{
		System.out.println(cDTO.getNom() + " " + cDTO.getAdresse());
		Client c = new Client(cDTO);
	}
	
	public List<Client> getListeClient()
	{
		List<Client> listClient= new ArrayList<Client>();
		Client client1 = new Client("Lars Jenkins", "9 rue fuckface");
		Client client2 = new Client("John Cologne", "10 rue du nez");
		listClient.add(client1);
		listClient.add(client2);
		return listClient;
	}
	
	public List<ClientDTO> getListeClientDTO()
	{
		List<ClientDTO> listClientDTO= new ArrayList<ClientDTO>();
		ClientDTO client3 = new ClientDTO("Lars Jenkins", "9 rue fuckface");
		ClientDTO client4 = new ClientDTO("John Cologne", "10 rue du nez");
		listClientDTO.add(client3);
		listClientDTO.add(client4);
		return listClientDTO;
	}
}

package ma.project.api.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ma.project.api.entities.Client;
import ma.project.api.repositories.ClientRepository;

@Controller
@AllArgsConstructor
public class ClientGraphQLController {
	
	private ClientRepository clientRepository;
	
	@QueryMapping
	public List<Client> allClients(){
		return clientRepository.findAll();
	}
	
	
	@QueryMapping
	public Client clientById(@Argument("id") Long id) {
		Client client = clientRepository.findById(id).orElse(null);
		if(client == null) throw new RuntimeException(String.format("Client %s not found", id));
		else return client;
	}
	
	@MutationMapping
	public Client saveClient(@Argument("client") Client client) {
		return clientRepository.save(client);
	}
	
	 @MutationMapping
	 public String deleteClientById(@Argument("id") Long id) {
	    	Client client = clientRepository.findById(id).orElse(null);
	    	if(client == null) {
	        	return "client with id : " + id + " is not found";
	    	}
	    		clientRepository.deleteById(id);
	        	return "client with id : " + id + " is deleted successfuly";
	 }

}

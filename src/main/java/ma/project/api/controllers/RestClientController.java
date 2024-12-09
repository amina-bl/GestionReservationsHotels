package ma.project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import ma.project.api.entities.Client;
import ma.project.api.entities.Reservation;
import ma.project.api.repositories.ClientRepository;

@RestController
@RequestMapping("/client")
public class RestClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	
	@GetMapping("/clients")
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable Long id){
		return clientRepository.findById(id)
				.map(client ->ResponseEntity.ok().body(client))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/clients")
	public Client createClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	//Update :mettre à jour un client existant
	@PutMapping("/clients/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable Long id,@RequestBody Client clientDetails){
		return clientRepository.findById(id).map(client ->{
			client.setNom(clientDetails.getNom());
			client.setPrenom(clientDetails.getPrenom());
			client.setEmail(clientDetails.getEmail());
			client.setTelephone(clientDetails.getEmail());
			Client updateClient=clientRepository.save(client);
			return ResponseEntity.ok().body(updateClient);
		}).orElse(ResponseEntity.notFound().build());
	}
	
	//DELETE:supprimer un client
	@DeleteMapping("/clients/{id}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long id){
		return clientRepository.findById(id).map(client->{
			clientRepository.delete(client);
			return ResponseEntity.ok().<Void>build();
		}).orElse(ResponseEntity.notFound().build());
	}
}

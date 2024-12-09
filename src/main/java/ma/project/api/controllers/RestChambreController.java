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
import ma.project.api.entities.Chambre;
import ma.project.api.entities.Client;
import ma.project.api.repositories.ChambreRepository;
import ma.project.api.repositories.ClientRepository;

@RestController
@RequestMapping("/chambre")
public class RestChambreController {
	@Autowired
	private ChambreRepository chambreRepository;
	
	
	@GetMapping("/chambres")
	public List<Chambre> getAllChambres(){
		return chambreRepository.findAll();
	}
	
	@GetMapping("/chambres/{id}")
	public ResponseEntity<Chambre> getChambreById(@PathVariable Long id){
		return chambreRepository.findById(id)
				.map(chambre ->ResponseEntity.ok().body(chambre))
				.orElse(ResponseEntity.notFound().build());
	}
	
	//CREATE :ajouter un nouveau chabre
	@PostMapping("/chambres")
	public Chambre createChambre(@RequestBody Chambre chambre) {
		return chambreRepository.save(chambre);
	}
	
	//Update :mettre à jour un chambre existant
	@PutMapping("/chambres/{id}")
	public ResponseEntity<Chambre> updateChambre(@PathVariable Long id,@RequestBody Chambre chambreDetails){
		return chambreRepository.findById(id).map(chambre ->{
			chambre.setType(chambreDetails.getType());
			chambre.setPrix(chambreDetails.getPrix());
			chambre.setDisponible(false);
			Chambre updateChambre=chambreRepository.save(chambre);
			return ResponseEntity.ok().body(updateChambre);
		}).orElse(ResponseEntity.notFound().build());
	}
	
	//DELETE:supprimer un chambre
	@DeleteMapping("/chambres/{id}")
	public ResponseEntity<Void> deleteChambre(@PathVariable Long id){
		return chambreRepository.findById(id).map(chambre->{
			chambreRepository.delete(chambre);
			return ResponseEntity.ok().<Void>build();
		}).orElse(ResponseEntity.notFound().build());
	}
}

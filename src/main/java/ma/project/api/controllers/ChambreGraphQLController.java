package ma.project.api.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ma.project.api.entities.Chambre;
import ma.project.api.repositories.ChambreRepository;

@Controller
@AllArgsConstructor
public class ChambreGraphQLController {
private ChambreRepository chambreRepository;
	
	@QueryMapping
	public List<Chambre> allChambres(){
		return chambreRepository.findAll();
	}
	
	@QueryMapping
	public Chambre chambreById(@Argument("id") Long id) {
		Chambre chambre = chambreRepository.findById(id).orElse(null);
		if(chambre == null) throw new RuntimeException(String.format("Chambre %s not found", id));
		else return chambre;
	}
	
	@MutationMapping
	public Chambre saveChambre(@Argument("chambre") Chambre chambre) {
		return chambreRepository.save(chambre);
	}
	
	 @MutationMapping
	 public String deleteChambreById(@Argument("id") Long id) {
	    	Chambre chambre = chambreRepository.findById(id).orElse(null);
	    	if(chambre == null) {
	        	return "chambre with id : " + id + " is not found";
	    	}
	    		chambreRepository.deleteById(id);
	        	return "chambre with id : " + id + " is deleted successfuly";
	 }
}

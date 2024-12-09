package ma.project.api.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ma.project.api.entities.Utilisateur;
import ma.project.api.repositories.UtilisateurRepository;


@AllArgsConstructor
@Controller
public class UtilisateurGraphQLController {
private UtilisateurRepository utilisateurRepository;
	
	@QueryMapping
	public List<Utilisateur> allUtilisateurs(){
		return utilisateurRepository.findAll();
	}
	
	@QueryMapping
	public Utilisateur utilisateurById(@Argument Long id) {
		Utilisateur utilisateur = utilisateurRepository.findById(id).orElse(null);
		if(utilisateur == null) throw new RuntimeException(String.format("Utilisateur %s not found", id));
		else return utilisateur;
	}
	
	@MutationMapping
	public Utilisateur saveUtilisateur(@Argument Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	 @MutationMapping
	 public String deleteUtilisateurById(@Argument Long id) {
	    	Utilisateur utilisateur = utilisateurRepository.findById(id).orElse(null);
	    	if(utilisateur == null) {
	        	return "utilisateur with id : " + id + " is not found";
	    	}
	    		utilisateurRepository.deleteById(id);
	        	return "utilisateur with id : " + id + " is deleted successfuly";
	 }
}

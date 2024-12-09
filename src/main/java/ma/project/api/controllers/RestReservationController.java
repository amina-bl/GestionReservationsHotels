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
import ma.project.api.entities.Reservation;
import ma.project.api.repositories.ReservationRepository;

@RestController
@RequestMapping("/reservation")
public class RestReservationController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	@GetMapping("/reservations")
	public List<Reservation> getAllReservations(){
		return reservationRepository.findAll();
	}
	
	@GetMapping("/reservations/{id}")
	public ResponseEntity<Reservation> getReservationById(@PathVariable Long id){
		return reservationRepository.findById(id)
				.map(reservation ->ResponseEntity.ok().body(reservation))
				.orElse(ResponseEntity.notFound().build());
	}
	
	//CREATE :ajouter un nouveau reservation
		@PostMapping("/reservations")
		public Reservation createChambre(@RequestBody Reservation reservation) {
			return reservationRepository.save(reservation);
		}
		
		//Update :mettre à jour un reservation existant
		@PutMapping("/reservations/{id}")
		public ResponseEntity<Reservation> updateReservation(@PathVariable Long id,@RequestBody Reservation reservationDetails){
			return reservationRepository.findById(id).map(reservation ->{
				reservation.setClient(reservationDetails.getClient());
				reservation.setChambre(reservationDetails.getChambre());
				reservation.setDateDebut(reservationDetails.getDateDebut());
				reservation.setDateFin(reservationDetails.getDateFin());
				reservation.setPreferences(reservationDetails.getPreferences());
				Reservation updateReservation=reservationRepository.save(reservation);
				return ResponseEntity.ok().body(updateReservation);
			}).orElse(ResponseEntity.notFound().build());
		}
		
		//DELETE:supprimer un reservation
		@DeleteMapping("/reservations/{id}")
		public ResponseEntity<Void> deleteReservation(@PathVariable Long id){
			return reservationRepository.findById(id).map(reservation->{
				reservationRepository.delete(reservation);
				return ResponseEntity.ok().<Void>build();
			}).orElse(ResponseEntity.notFound().build());
		}
}

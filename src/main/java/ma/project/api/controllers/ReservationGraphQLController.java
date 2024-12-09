package ma.project.api.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ma.project.api.dto.ReservationRequest;
import ma.project.api.entities.Chambre;
import ma.project.api.entities.Client;
import ma.project.api.entities.Reservation;
import ma.project.api.repositories.ChambreRepository;
import ma.project.api.repositories.ClientRepository;
import ma.project.api.repositories.ReservationRepository;

@AllArgsConstructor
@Controller
public class ReservationGraphQLController {
	private ReservationRepository reservationRepository;
	private ClientRepository clientRepository;
	private ChambreRepository chambreRepository;
	
	@QueryMapping
	public List<Reservation> allReservations() {
		return reservationRepository.findAll();
	}
	
	@QueryMapping
	public Reservation reservationById(@Argument("id") Long id) {
		Reservation reservation = reservationRepository.findById(id).orElse(null);
		if(reservation == null) throw new RuntimeException(String.format("Reservation %s not found", id));
		else return reservation;
	}
	
	@MutationMapping
	public Reservation saveReservation(@Argument("reservation") ReservationRequest reservationRequest ) {
		Client client = clientRepository.findById(reservationRequest.getClientId()).orElse(null);
		Chambre chambre = chambreRepository.findById(reservationRequest.getChambreId()).orElse(null);
		if(client == null) throw new RuntimeException(String.format("Client %s not found", reservationRequest.getClientId()));
		else if(chambre == null) throw new RuntimeException(String.format("Chambre %s not found", reservationRequest.getChambreId()));
		else {
			Reservation reservation = new Reservation();
			reservation.setChambre(chambre);
			reservation.setClient(client);
			reservation.setDateDebut(reservationRequest.getDateDebut());
			reservation.setDateFin(reservationRequest.getDateFin());
			reservation.setPreferences(reservationRequest.getPreferences());
			return reservationRepository.save(reservation);
		}
	}
	@MutationMapping
	public Reservation updateReservation(@Argument("reservation") Reservation reservation) {
	    Reservation res = reservationRepository.findById(reservation.getId()).orElseThrow(() -> new RuntimeException("Reservation not found"));

	    if (reservation.getDateDebut() != null) {
	        res.setDateDebut(reservation.getDateDebut());
	    }
	    if (reservation.getDateFin() != null) {
	        res.setDateFin(reservation.getDateFin());
	    }
	    if (reservation.getPreferences() != null) {
	        res.setPreferences(reservation.getPreferences());
	    }

	    return reservationRepository.save(reservation);
	}

}


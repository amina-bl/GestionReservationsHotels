package ma.project.api.dto;

import java.util.Date;

import org.springframework.boot.context.properties.bind.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ReservationRequest {
	private Date dateDebut;
	private Date dateFin;
	private String preferences;
	private Long clientId;
	private Long chambreId;
	public ReservationRequest() {}

	@ConstructorBinding
	public ReservationRequest(Date dateDebut, Date dateFin, String preferences, Long clientId, Long chambreId) {
	    this.dateDebut = dateDebut;
	    this.dateFin = dateFin;
	    this.preferences = preferences;
	    this.clientId = clientId;
	    this.chambreId = chambreId;
	}

	
}

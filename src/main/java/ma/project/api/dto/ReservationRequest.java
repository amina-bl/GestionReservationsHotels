package ma.project.api.dto;

import java.util.Date;

<<<<<<< HEAD
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

	
=======
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import ma.project.api.entities.Chambre;
import ma.project.api.entities.Client;

@Setter
@Getter
public class ReservationRequest {
	
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
    private String preferences;
    private Long clientId;
    private Long chambreId;
    
>>>>>>> 501e55c10e546755b69244a9bee1ed954f3a8b59
}

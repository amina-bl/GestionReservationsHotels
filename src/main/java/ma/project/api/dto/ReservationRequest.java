package ma.project.api.dto;

import java.util.Date;

import lombok.Data;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
public class ReservationRequest {
	
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
    private String preferences;
    private Long clientId;
    private Long chambreId;
	@ConstructorBinding
	public ReservationRequest(Date dateDebut, Date dateFin, String preferences, Long clientId, Long chambreId) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.preferences = preferences;
		this.clientId = clientId;
		this.chambreId = chambreId;
	}
}

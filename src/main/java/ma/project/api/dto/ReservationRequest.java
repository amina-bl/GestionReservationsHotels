package ma.project.api.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationRequest {
	private Date dateDebut;
	private Date dateFin;
	private String preferences;
	private Long clientId;
	private Long chambreId;
	
}

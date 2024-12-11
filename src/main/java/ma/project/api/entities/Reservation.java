package ma.project.api.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import jakarta.xml.bind.annotation.*;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	@ManyToOne
    @XmlTransient
	private Client client;
	
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	@ManyToOne
    @XmlTransient
	private Chambre chambre;
	
	private String preferences;

    @XmlElement(name = "clientId")
    public Long getClientId() {
        return client != null ? client.getId() : null;
    }

    @XmlElement(name = "chambreId")
    public Long getChambreId() {
        return chambre != null ? chambre.getId() : null;
    }

    @Override
    public String toString() {
        return "Reservation{" +
               "id=" + id +
               ", dateDebut=" + dateDebut +
               ", dateFin=" + dateFin +
               ", preferences='" + preferences + '\'' +
               ", clientId=" + getClientId() +
               ", chambreId=" + getChambreId() +
               '}';
    }
}

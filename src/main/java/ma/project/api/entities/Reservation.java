package ma.project.api.entities;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    
    @ManyToOne
    @XmlTransient
    private Client client;
    
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
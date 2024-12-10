package ma.project.api.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TypeChambre type;
	private double prix;
	private boolean disponible;
	
	@OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
	private List<Reservation> reservations;

	public Chambre(TypeChambre type, double prix, boolean disponible) {
		super();
		this.type = type;
		this.prix = prix;
		this.disponible = disponible;
	}
	
	
}

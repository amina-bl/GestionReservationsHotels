package ma.project.api.entities;

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
	private TypeChambre type;
	private double prix;
	private boolean disponible;
	
	@OneToMany(mappedBy = "chambre")
	private List<Reservation> reservations;
}

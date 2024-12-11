package ma.project.api.dto;

import lombok.Getter;
import lombok.Setter;
import ma.project.api.entities.TypeChambre;

public class ChambreRequest {
	
	private TypeChambre type;
	private double prix;
	private boolean disponible;

	public TypeChambre getType() {
		return type;
	}

	public void setType(TypeChambre type) {
		this.type = type;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}

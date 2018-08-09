package model;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VilleAeroportPk implements Serializable{
	
	@ManyToOne
	@JoinColumn(name="ville_id")
	private Ville ville;
	@ManyToOne
	@JoinColumn(name="aeroport_id")
	private Aeroport aeroport;
	
	public VilleAeroportPk() {
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	
	

}

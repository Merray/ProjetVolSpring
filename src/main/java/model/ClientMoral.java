package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class ClientMoral extends Client {
	
	@Column(name="titre")
	private String titre;
	@Column(name="siret")
	private String siret;

	public ClientMoral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientMoral(String nom, String numeroTel, String numeroFax, String email, Adresse adresse, String titre,
			String siret) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.titre = titre;
		this.siret = siret;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

}

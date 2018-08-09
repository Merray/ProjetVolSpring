package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class ClientPhysique extends Client {
	@Column(name="titre")
	private String titre;
	@Column(name="prenom")
	private String prenom;

	public ClientPhysique() {
		super();

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ClientPhysique(String nom, String numeroTel, String numeroFax, String email, Adresse adresse, String titre,
			String prenom) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.titre = titre;
		this.prenom = prenom;
	}

	

}

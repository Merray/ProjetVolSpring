package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EI")
public class ClientEl extends Client {

	@Column(name="titre")
	private String titre;
	@Column(name = "prenom")
	private String prenom;
	
	
	public ClientEl() {
		super();

	}


	public ClientEl(String nom, String numeroTel, String numeroFax, String email, Adresse adresse, Login login) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		
	}


	public ClientEl(String nom, String numeroTel, String numeroFax, String email, Adresse adresse, Login login, String titre,
			String prenom) {
		super(nom, numeroTel, numeroFax, email, adresse, login);
		this.titre = titre;
		this.prenom = prenom;
	}


	public ClientEl(String nom, String numeroTel, String numeroFax, String email, Adresse adresse) {
		super(nom, numeroTel, numeroFax, email, adresse);
		// TODO Auto-generated constructor stub
	}


	public ClientEl(String nom, String numeroTel, String numeroFax, String email, Adresse adresse, String titre,
			String prenom) {
		super(nom, numeroTel, numeroFax, email, adresse);
		this.titre = titre;
		this.prenom = prenom;
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
	
	


}

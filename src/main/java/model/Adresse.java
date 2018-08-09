package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Version;

@Embeddable
public class Adresse {
	@Column(name="adresse")
	private String adresse;
	@Column(name="code_postal", length = 200)
	private String codePostal;
	@Column(name="ville")
	private String ville;
	@Column(name="pays")
	private String pays;

	public Adresse(String adresse, String codePostal, String ville, String pays) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Adresse() {
		super();
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}

package model;

public class ClientMoral extends Client {

	
	private String titre;
	private String siret;
	
	public ClientMoral(String typeClient, String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret, String titre) {

		super(typeClient, nom, numeroTel, numeroFax, email, adresse);
		this.siret = siret;
		this.titre = titre;
	}



	public ClientMoral(String typeClient, String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, String siret,
			Login login, String titre) {

		super(typeClient, nom, numeroTel, numeroFax, email, adresse, login);
		this.siret = siret;
		this.titre = titre;
	}

	public ClientMoral() {
		super();
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getTitre() {
		return titre;
	}

}

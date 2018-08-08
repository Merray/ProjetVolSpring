package model;

public class Passager {

	private Long id_passager;
	private String nom_passager;
	private String prenom_passager;
	private Adresse adresse_passager;

	public Passager(String nom_passager, String prenom_passager, Adresse adresse_passager) {
		super();
		this.nom_passager = nom_passager;
		this.prenom_passager = prenom_passager;
		this.adresse_passager = adresse_passager;
	}

	
	
	public Passager() {
		super();
	}

	public Long getId() {
		return id_passager;
	}

	public void setId(Long id_passager) {
		this.id_passager = id_passager;
	}

	public String getNom() {
		return nom_passager;
	}

	public void setNom(String nom_passager) {
		this.nom_passager = nom_passager;
	}

	public String getPrenom() {
		return prenom_passager;
	}

	public void setPrenom(String prenom_passager) {
		this.prenom_passager = prenom_passager;
	}

	public Adresse getAdresse() {
		return adresse_passager;
	}

	public void setAdresse(Adresse adresse_passager) {
		this.adresse_passager = adresse_passager;
	}

}

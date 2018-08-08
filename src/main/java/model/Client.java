package model;

public abstract class Client {


	private Long id_client;
	private String typeClient;
	private String nom;
	private Integer numeroTel;
	private Integer numeroFax;
	private String email;
	private Adresse adresse;
	private Login login;

	public Client(String typeClient,String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse) {
		super();
		this.typeClient = typeClient;
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFax = numeroFax;
		this.email = email;
		this.adresse = adresse;
	}

	public Client(String typeClient, String nom, Integer numeroTel, Integer numeroFax, String email, Adresse adresse, Login login) {
		super();
		this.typeClient = typeClient;
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFax = numeroFax;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
	}

	public Client() {
		super();
	}


	public void setId(Long id_client) {
		this.id_client = id_client;

	}

	public Long getId() {
		return id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(Integer numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Integer getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(Integer numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	
}

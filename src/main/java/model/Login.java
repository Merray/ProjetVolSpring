package model;

public class Login {

	private Long id_login;
	private String login;
	private String motDePasse;
	private Boolean admin;
	private Client client;

	public Login(String login, String motDePasse, Boolean admin) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}

	public Login(String login, String motDePasse, Boolean admin, Client client) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
		this.client = client;
	}

	public Login() {
		super();
	}

	public void setId(Long id_login) {
		this.id_login = id_login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Long getId() {
		return id_login;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}

package model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 2)
@SequenceGenerator(name = "seqClient", sequenceName = "seq_client", initialValue = 1, allocationSize = 1)
public abstract class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClient")
	@Column(name = "id_client")
	private Integer idClient;
	@Column(name = "nom",  length = 150)
	private String nom;
	@Column(name="numero_tel")
	private String numeroTel;
	@Column(name="numero_fax")
	private String numeroFax;
	@Column(name="email")
	private String email;
	@Embedded
	   @AttributeOverrides({ @AttributeOverride(name = "adresse", column = @Column(name = "adresse_client", length = 255)),
	           @AttributeOverride(name = "codePostal", column = @Column(name = "code_postal_client", length = 6)),
	           @AttributeOverride(name = "ville", column = @Column(name = "ville_client", length = 150)), 
	            @AttributeOverride(name = "pays", column = @Column(name = "pays_client"))})
	private Adresse adresse;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy="client")
	private Login login;
	
	@Version
	private int version;
	
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Client(String nom, String numeroTel, String numeroFax, String email, Adresse adresse) {
		super();
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFax = numeroFax;
		this.email = email;
		this.adresse = adresse;
	}

	public Client( String nom, String numeroTel, String numeroFax, String email, Adresse adresse, Login login) {
		super();
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

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public String getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		return true;
	}

	
	
}

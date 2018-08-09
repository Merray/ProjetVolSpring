package model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Passager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAdherent")
	@SequenceGenerator(name = "seqpassager", sequenceName = "seq_passager", initialValue = 100, allocationSize = 1)
	@Column(name = "id_passager")
	private Integer idPassager;
	@Column(name = "nom_passager", length = 100, nullable = false)
	private String nomPassager;
	@Column(name = "prenom_passager", length = 150)
	private String prenomPassager;
	@OneToMany
	@JoinColumn (name= "id_reservation")
	private List<Reservation> reservations;
	@Embedded
    @AttributeOverrides({ @AttributeOverride(name = "adresse", column = @Column(name = "adresse_passager", length = 255)),
            @AttributeOverride(name = "codePostal", column = @Column(name = "code_postal_passager", length = 6)),
            @AttributeOverride(name = "ville", column = @Column(name = "ville_passager", length = 150)), 
			@AttributeOverride(name = "pays", column = @Column(name = "pays_passager"))})
	private Adresse adressePassager;
	
	public Passager(Integer idPassager, String nomPassager, String prenomPassager, Adresse adressePassager) {
		super();
		this.idPassager = idPassager;
		this.nomPassager = nomPassager;
		this.prenomPassager = prenomPassager;
		this.adressePassager = adressePassager;
	}

	public Passager(String nomPassager, String prenomPassager, Adresse adressePassager) {
		super();
		this.nomPassager = nomPassager;
		this.prenomPassager = prenomPassager;
		this.adressePassager = adressePassager;
	}
	
	


	public Passager() {
		super();
	}

	public Integer getIdPassager() {
		return idPassager;
	}

	public void setIdPassager(Integer idPassager) {
		this.idPassager = idPassager;
	}

	public String getNomPassager() {
		return nomPassager;
	}

	public void setNomPassager(String nomPassager) {
		this.nomPassager = nomPassager;
	}

	public String getPrenomPassager() {
		return prenomPassager;
	}

	public void setPrenomPassager(String prenomPassager) {
		this.prenomPassager = prenomPassager;
	}

	public Adresse getAdressePassager() {
		return adressePassager;
	}

	public void setAdressePassager(Adresse adressePassager) {
		this.adressePassager = adressePassager;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPassager == null) ? 0 : idPassager.hashCode());
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
		Passager other = (Passager) obj;
		if (idPassager == null) {
			if (other.idPassager != null)
				return false;
		} else if (!idPassager.equals(other.idPassager))
			return false;
		return true;
	}

	
	
	
	
	
}

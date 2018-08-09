package model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "vol")
@SequenceGenerator(name = "seqVol", sequenceName = "seq_vol", initialValue = 1, allocationSize = 1)

public class Vol {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqVol")
	@Column(name = "id_vol")
	private Long id_vol;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_depart")
	private Date date_Depart;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_arrivee")
	private Date date_Arrivee;
	@Temporal(TemporalType.DATE)
	@Column(name = "heure_depart")
	private Date heure_Depart;
	@Temporal(TemporalType.DATE)
	@Column(name = "heure_arrivee")
	private Date heure_Arrivee;

	@OneToMany(mappedBy = "key.vol", fetch = FetchType.LAZY)
	private List<CompagnieAerienneVol> compagniesAeriennes;

	@ManyToOne
	@JoinColumn(name = "aeroportDepart_id")
	private Aeroport aeroportDepart;

	@ManyToOne
	@JoinColumn(name = "aeroportArrivee_id")
	private Aeroport aeroportArrivee;

	@OneToMany(mappedBy = "vol")
	private List<Reservation> reservations;

	@OneToMany(mappedBy = "key.vol")
	private List<Escale> aeroports;

	@Version
	private int version;

	public Vol() {
	}

	public Vol(Date date_Depart, Date date_Arrivee, Date heure_Depart, Date heure_Arrivee) {
		super();
		this.date_Depart = date_Depart;
		this.date_Arrivee = date_Arrivee;
		this.heure_Depart = heure_Depart;
		this.heure_Arrivee = heure_Arrivee;
	}

	public Date getDateDepart() {
		return date_Depart;
	}

	public void setDateDepart(Date date_Depart) {
		this.date_Depart = date_Depart;
	}

	public Date getDateArrivee() {
		return date_Arrivee;
	}

	public void setDateArrivee(Date date_Arrivee) {
		this.date_Arrivee = date_Arrivee;
	}

	public Date getHeureDepart() {
		return heure_Depart;
	}

	public void setHeureDepart(Date heure_Depart) {
		this.heure_Depart = heure_Depart;
	}

	public Date getHeureArrivee() {
		return heure_Arrivee;
	}

	public void setHeureArrivee(Date heure_Arrivee) {
		this.heure_Arrivee = heure_Arrivee;
	}

	public Long getId() {
		return id_vol;
	}

	public void setId(Long id_vol) {
		this.id_vol = id_vol;
	}

	public Long getId_vol() {
		return id_vol;
	}

	public void setId_vol(Long id_vol) {
		this.id_vol = id_vol;
	}

	public Date getDate_Depart() {
		return date_Depart;
	}

	public void setDate_Depart(Date date_Depart) {
		this.date_Depart = date_Depart;
	}

	public Date getDate_Arrivee() {
		return date_Arrivee;
	}

	public void setDate_Arrivee(Date date_Arrivee) {
		this.date_Arrivee = date_Arrivee;
	}

	public Date getHeure_Depart() {
		return heure_Depart;
	}

	public void setHeure_Depart(Date heure_Depart) {
		this.heure_Depart = heure_Depart;
	}

	public Date getHeure_Arrivee() {
		return heure_Arrivee;
	}

	public void setHeure_Arrivee(Date heure_Arrivee) {
		this.heure_Arrivee = heure_Arrivee;
	}

	public List<CompagnieAerienneVol> getCompagniesAeriennes() {
		return compagniesAeriennes;
	}

	public void setCompagniesAeriennes(List<CompagnieAerienneVol> compagniesAeriennes) {
		this.compagniesAeriennes = compagniesAeriennes;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Escale> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Escale> aeroports) {
		this.aeroports = aeroports;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aeroportArrivee == null) ? 0 : aeroportArrivee.hashCode());
		result = prime * result + ((aeroportDepart == null) ? 0 : aeroportDepart.hashCode());
		result = prime * result + ((aeroports == null) ? 0 : aeroports.hashCode());
		result = prime * result + ((compagniesAeriennes == null) ? 0 : compagniesAeriennes.hashCode());
		result = prime * result + ((date_Arrivee == null) ? 0 : date_Arrivee.hashCode());
		result = prime * result + ((date_Depart == null) ? 0 : date_Depart.hashCode());
		result = prime * result + ((heure_Arrivee == null) ? 0 : heure_Arrivee.hashCode());
		result = prime * result + ((heure_Depart == null) ? 0 : heure_Depart.hashCode());
		result = prime * result + ((id_vol == null) ? 0 : id_vol.hashCode());
		result = prime * result + ((reservations == null) ? 0 : reservations.hashCode());
		result = prime * result + version;
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
		Vol other = (Vol) obj;
		if (aeroportArrivee == null) {
			if (other.aeroportArrivee != null)
				return false;
		} else if (!aeroportArrivee.equals(other.aeroportArrivee))
			return false;
		if (aeroportDepart == null) {
			if (other.aeroportDepart != null)
				return false;
		} else if (!aeroportDepart.equals(other.aeroportDepart))
			return false;
		if (aeroports == null) {
			if (other.aeroports != null)
				return false;
		} else if (!aeroports.equals(other.aeroports))
			return false;
		if (compagniesAeriennes == null) {
			if (other.compagniesAeriennes != null)
				return false;
		} else if (!compagniesAeriennes.equals(other.compagniesAeriennes))
			return false;
		if (date_Arrivee == null) {
			if (other.date_Arrivee != null)
				return false;
		} else if (!date_Arrivee.equals(other.date_Arrivee))
			return false;
		if (date_Depart == null) {
			if (other.date_Depart != null)
				return false;
		} else if (!date_Depart.equals(other.date_Depart))
			return false;
		if (heure_Arrivee == null) {
			if (other.heure_Arrivee != null)
				return false;
		} else if (!heure_Arrivee.equals(other.heure_Arrivee))
			return false;
		if (heure_Depart == null) {
			if (other.heure_Depart != null)
				return false;
		} else if (!heure_Depart.equals(other.heure_Depart))
			return false;
		if (id_vol == null) {
			if (other.id_vol != null)
				return false;
		} else if (!id_vol.equals(other.id_vol))
			return false;
		if (reservations == null) {
			if (other.reservations != null)
				return false;
		} else if (!reservations.equals(other.reservations))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

}
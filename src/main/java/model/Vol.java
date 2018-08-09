package model;

import java.sql.Date;
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

	@OneToMany(mappedBy = "key.vols", fetch = FetchType.LAZY)
	private List<CompagnieAerienneVol> compagniesAeriennes;

	@ManyToOne
	@JoinColumn(name = "aeroportDepart_id")
	private Aeroport aeroportDepart;

	@ManyToOne
	@JoinColumn(name = "aeroportArrivee_id")
	private Aeroport aeroportArrivee;

	@OneToMany(mappedBy = "vol")
	private List<Reservation> reservations;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "heure_depart", column = @Column(name = "heure_depart_escale")),
			@AttributeOverride(name = "heure_arrivee", column = @Column(name = "heure_arrivee_escale")) })
	private List<Escale> escales;

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

}

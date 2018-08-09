package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReservation")
	@SequenceGenerator(name = "seqReservation", sequenceName = "seq_reservation", initialValue = 100, allocationSize = 1)
	@Column(name = "id_reservation")
	private Long idReservation;
	@Column(name = "date_reservation")
	private Date date;
	@Column(name = "no_reservation")
	private Long numero;
	@ManyToOne
	@JoinColumn(name = "id_passager")
	private Passager passager;
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "id_vol")
	private Vol vol;
	
	@Version
	private int version;

	public Reservation(Long id_reservation, Date date, Long numero, Passager passager, Client client, Vol vol) {
		super();
		this.idReservation = id_reservation;
		this.date = date;
		this.numero = numero;
		this.passager = passager;
		this.client = client;
		this.vol = vol;
	}

	public Reservation(Date date, Long numero, Passager passager, Client client, Vol vol) {
		super();
		this.date = date;
		this.numero = numero;
		this.passager = passager;
		this.client = client;
		this.vol = vol;
	}


	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
}

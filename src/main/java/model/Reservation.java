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

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReservation")
	@SequenceGenerator(name = "seqreservation", sequenceName = "seq_reservation", initialValue = 100, allocationSize = 1)
	@Column(name = "id_reservation")
	private Long id_reservation;
	@Column(name = "date_reservation")
	private Date date;
	@Column(name = "no_reservation")
	private Long numero;
	@ManyToOne
	@JoinColumn(name = "id_passager")
	private Passager passager;
	@OneToOne
	@JoinColumn(name = "id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "id_vol")
	private Vol vol;


	public Reservation(Long id_reservation, Date date, Long numero, Passager passager, Client client, Vol vol) {
		super();
		this.id_reservation = id_reservation;
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

	public Long getId_reservation() {
		return id_reservation;
	}

	public void setId_reservation(Long id_reservation) {
		this.id_reservation = id_reservation;
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

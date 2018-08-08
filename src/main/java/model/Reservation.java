package model;

import java.sql.Date;

public class Reservation {

	private Long id_reservation;
	private Date date;
	private Long numero;
	private Passager passager;
	private Client client;
	private Vol vol;

	public Reservation() {
		super();
	}

	public Reservation(Date date, Long numero, Passager passager, Client client, Vol vol) {
		super();
		this.date = date;
		this.numero = numero;
		this.passager = passager;
		this.client = client;
		this.vol = vol;
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

	public Long getId() {
		return id_reservation;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}

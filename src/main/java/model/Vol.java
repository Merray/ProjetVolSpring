package model;

import java.sql.Date;

public class Vol {

	private Long id_vol;
	private Date date_Depart;
	private Date date_Arrivee;
	private Date heure_Depart;
	private Date heure_Arrivee;

	public Vol() {
		super();
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
		this.id_vol=id_vol;
	}

}

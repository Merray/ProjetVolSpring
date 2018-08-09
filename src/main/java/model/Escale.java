package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Escale {

	@EmbeddedId
	private EscalePk key;
	@Temporal(TemporalType.DATE)
	@Column(name="heure_depart")
	private Date heureDepart;
	
	@Column(name="heure_arrivee")
	@Temporal(TemporalType.DATE)
	private Date heureArrivee;
	
	public Escale() {
		
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heureArrivee == null) ? 0 : heureArrivee.hashCode());
		result = prime * result + ((heureDepart == null) ? 0 : heureDepart.hashCode());
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
		Escale other = (Escale) obj;
		if (heureArrivee == null) {
			if (other.heureArrivee != null)
				return false;
		} else if (!heureArrivee.equals(other.heureArrivee))
			return false;
		if (heureDepart == null) {
			if (other.heureDepart != null)
				return false;
		} else if (!heureDepart.equals(other.heureDepart))
			return false;
		return true;
	}
	
	
}

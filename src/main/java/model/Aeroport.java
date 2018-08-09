package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "aeroport")
@SequenceGenerator(name = "seqAeroport", sequenceName = "seq_aeroport", initialValue = 1, allocationSize = 1)
public class Aeroport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAeroport")
	@Column(name = "aeroport_id")
	private Integer id_aeroport;

	@Column(name = "nom")
	private String nom;

	@OneToMany(mappedBy = "aeroportArrivee")
	private List<Vol> VolsArrivee;

	@OneToMany(mappedBy = "aeroportDepart")
	private List<Vol> VolsDepart;

	@OneToMany(mappedBy = "key.aeroport", fetch = FetchType.LAZY)
	private List<VilleAeroport> villes;

	@OneToMany(mappedBy = "key.aeroport", fetch = FetchType.LAZY)
	private List<Escale> vols;

	public Integer getId_aeroport() {
		return id_aeroport;
	}

	public void setId_aeroport(Integer id_aeroport) {
		this.id_aeroport = id_aeroport;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Vol> getVolsArrivee() {
		return VolsArrivee;
	}

	public void setVolsArrivee(List<Vol> volsArrivee) {
		VolsArrivee = volsArrivee;
	}

	public List<Vol> getVolsDepart() {
		return VolsDepart;
	}

	public void setVolsDepart(List<Vol> volsDepart) {
		VolsDepart = volsDepart;
	}

	public List<VilleAeroport> getVilles() {
		return villes;
	}

	public void setVilles(List<VilleAeroport> villes) {
		this.villes = villes;
	}

	public List<Escale> getVols() {
		return vols;
	}

	public void setVols(List<Escale> vols) {
		this.vols = vols;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((VolsArrivee == null) ? 0 : VolsArrivee.hashCode());
		result = prime * result + ((VolsDepart == null) ? 0 : VolsDepart.hashCode());
		result = prime * result + ((id_aeroport == null) ? 0 : id_aeroport.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((villes == null) ? 0 : villes.hashCode());
		result = prime * result + ((vols == null) ? 0 : vols.hashCode());
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
		Aeroport other = (Aeroport) obj;
		if (VolsArrivee == null) {
			if (other.VolsArrivee != null)
				return false;
		} else if (!VolsArrivee.equals(other.VolsArrivee))
			return false;
		if (VolsDepart == null) {
			if (other.VolsDepart != null)
				return false;
		} else if (!VolsDepart.equals(other.VolsDepart))
			return false;
		if (id_aeroport == null) {
			if (other.id_aeroport != null)
				return false;
		} else if (!id_aeroport.equals(other.id_aeroport))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (villes == null) {
			if (other.villes != null)
				return false;
		} else if (!villes.equals(other.villes))
			return false;
		if (vols == null) {
			if (other.vols != null)
				return false;
		} else if (!vols.equals(other.vols))
			return false;
		return true;
	}

	
	
}

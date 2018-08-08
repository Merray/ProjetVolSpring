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
import javax.persistence.Version;

@Entity
@Table(name = "compagnie_aerienne")
@SequenceGenerator(name = "seqCompagnieAerienne", sequenceName = "seq_compagnie_aerienne", initialValue = 1, allocationSize = 1)
public class CompagnieAerienne {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCompagnieAerienne")
	@Column(name = "id_compagnie_aerienne")
	private Integer id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "key.compagniesAeriennes", fetch = FetchType.LAZY)
	private List<CompagnieAerienneVol> vols;
	@Version
	private int version;

	
	public CompagnieAerienne() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + version;
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
		CompagnieAerienne other = (CompagnieAerienne) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (version != other.version)
			return false;
		if (vols == null) {
			if (other.vols != null)
				return false;
		} else if (!vols.equals(other.vols))
			return false;
		return true;
	}

}

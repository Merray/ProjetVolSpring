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
@Table(name="ville")
@SequenceGenerator(name="seqVille", sequenceName="seq_ville", initialValue=50, allocationSize=1)
public class Ville {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqVille")
	@Column(name="ville_id")
	private Integer id;
	@Column(name="nom")
	private String nom;
	@OneToMany(mappedBy = "key.ville", fetch = FetchType.LAZY)
	private List<VilleAeroport> aeroports;
	@Version
	private int version;
	
	public Ville() {
		
	}

	
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
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

	public List<VilleAeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<VilleAeroport> aeroports) {
		this.aeroports = aeroports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Ville other = (Ville) obj;
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
		return true;
	}
	
	
}

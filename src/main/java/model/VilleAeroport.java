package model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ville_aeroport")
public class VilleAeroport {

	@EmbeddedId
	private VilleAeroportPk key;
	@Version
	private int version;
	
	public VilleAeroport() {
		
	}

	public VilleAeroportPk getKey() {
		return key;
	}

	public void setKey(VilleAeroportPk key) {
		this.key = key;
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
		VilleAeroport other = (VilleAeroport) obj;
		if (version != other.version)
			return false;
		return true;
	}
	
	
}

package model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="compagnie_aerienne_vol")
public class CompagnieAerienneVol {

	@EmbeddedId
	private CompagnieAerienneVolPk key;
	@Version
	private int version;
	
	public CompagnieAerienneVol() {
		
	}

	public CompagnieAerienneVolPk getKey() {
		return key;
	}

	public void setKey(CompagnieAerienneVolPk key) {
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
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		CompagnieAerienneVol other = (CompagnieAerienneVol) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
}

package ar.edu.unlam.dominio;

import java.util.Objects;

public class Chofer {
	Integer id;

	public Chofer(Integer id) {
    this.id = id;
	}

	public Integer getID() {
		return this.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chofer other = (Chofer) obj;
		return Objects.equals(id, other.id);
	}
}
package data;
// Generated 31.05.2017 22:53:31 by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ShoppingCartLineId generated by hbm2java
 */
@Embeddable
public class ShoppingCartLineId implements java.io.Serializable {

	private int sclScId;
	private int sclIId;

	public ShoppingCartLineId() {
	}

	public ShoppingCartLineId(int sclScId, int sclIId) {
		this.sclScId = sclScId;
		this.sclIId = sclIId;
	}

	@Column(name = "SCL_SC_ID", nullable = false)
	public int getSclScId() {
		return this.sclScId;
	}

	public void setSclScId(int sclScId) {
		this.sclScId = sclScId;
	}

	@Column(name = "SCL_I_ID", nullable = false)
	public int getSclIId() {
		return this.sclIId;
	}

	public void setSclIId(int sclIId) {
		this.sclIId = sclIId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShoppingCartLineId))
			return false;
		ShoppingCartLineId castOther = (ShoppingCartLineId) other;

		return (this.getSclScId() == castOther.getSclScId()) && (this.getSclIId() == castOther.getSclIId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSclScId();
		result = 37 * result + this.getSclIId();
		return result;
	}

}

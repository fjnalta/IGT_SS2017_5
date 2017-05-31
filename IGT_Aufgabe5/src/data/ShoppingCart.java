package data;
// Generated 31.05.2017 22:53:31 by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ShoppingCart generated by hbm2java
 */
@Entity
@Table(name = "SHOPPING_CART", catalog = "tpcw")
public class ShoppingCart implements java.io.Serializable {

	private int scId;
	private Date scTime;

	public ShoppingCart() {
	}

	public ShoppingCart(int scId, Date scTime) {
		this.scId = scId;
		this.scTime = scTime;
	}

	@Id

	@Column(name = "SC_ID", unique = true, nullable = false)
	public int getScId() {
		return this.scId;
	}

	public void setScId(int scId) {
		this.scId = scId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SC_TIME", nullable = false, length = 19)
	public Date getScTime() {
		return this.scTime;
	}

	public void setScTime(Date scTime) {
		this.scTime = scTime;
	}

}

package data;
// Generated 31.05.2017 22:53:31 by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ShoppingCartLine generated by hbm2java
 */
@Entity
@Table(name = "SHOPPING_CART_LINE", catalog = "tpcw")
public class ShoppingCartLine implements java.io.Serializable {

	private ShoppingCartLineId id;
	private Integer sclQty;

	public ShoppingCartLine() {
	}

	public ShoppingCartLine(ShoppingCartLineId id) {
		this.id = id;
	}

	public ShoppingCartLine(ShoppingCartLineId id, Integer sclQty) {
		this.id = id;
		this.sclQty = sclQty;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "sclScId", column = @Column(name = "SCL_SC_ID", nullable = false)),
			@AttributeOverride(name = "sclIId", column = @Column(name = "SCL_I_ID", nullable = false)) })
	public ShoppingCartLineId getId() {
		return this.id;
	}

	public void setId(ShoppingCartLineId id) {
		this.id = id;
	}

	@Column(name = "SCL_QTY")
	public Integer getSclQty() {
		return this.sclQty;
	}

	public void setSclQty(Integer sclQty) {
		this.sclQty = sclQty;
	}

}

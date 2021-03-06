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
 * CcXacts generated by hbm2java
 */
@Entity
@Table(name = "CC_XACTS", catalog = "tpcw")
public class CcXacts implements java.io.Serializable {

	private int cxOId;
	private String cxType;
	private String cxNum;
	private String cxName;
	private Date cxExpire;
	private String cxAuthId;
	private Double cxXactAmt;
	private Date cxXactDate;
	private Integer cxCoId;

	public CcXacts() {
	}

	public CcXacts(int cxOId) {
		this.cxOId = cxOId;
	}

	public CcXacts(int cxOId, String cxType, String cxNum, String cxName, Date cxExpire, String cxAuthId,
			Double cxXactAmt, Date cxXactDate, Integer cxCoId) {
		this.cxOId = cxOId;
		this.cxType = cxType;
		this.cxNum = cxNum;
		this.cxName = cxName;
		this.cxExpire = cxExpire;
		this.cxAuthId = cxAuthId;
		this.cxXactAmt = cxXactAmt;
		this.cxXactDate = cxXactDate;
		this.cxCoId = cxCoId;
	}

	@Id

	@Column(name = "CX_O_ID", unique = true, nullable = false)
	public int getCxOId() {
		return this.cxOId;
	}

	public void setCxOId(int cxOId) {
		this.cxOId = cxOId;
	}

	@Column(name = "CX_TYPE", length = 10)
	public String getCxType() {
		return this.cxType;
	}

	public void setCxType(String cxType) {
		this.cxType = cxType;
	}

	@Column(name = "CX_NUM", length = 20)
	public String getCxNum() {
		return this.cxNum;
	}

	public void setCxNum(String cxNum) {
		this.cxNum = cxNum;
	}

	@Column(name = "CX_NAME", length = 30)
	public String getCxName() {
		return this.cxName;
	}

	public void setCxName(String cxName) {
		this.cxName = cxName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CX_EXPIRE", length = 10)
	public Date getCxExpire() {
		return this.cxExpire;
	}

	public void setCxExpire(Date cxExpire) {
		this.cxExpire = cxExpire;
	}

	@Column(name = "CX_AUTH_ID", length = 15)
	public String getCxAuthId() {
		return this.cxAuthId;
	}

	public void setCxAuthId(String cxAuthId) {
		this.cxAuthId = cxAuthId;
	}

	@Column(name = "CX_XACT_AMT", precision = 22, scale = 0)
	public Double getCxXactAmt() {
		return this.cxXactAmt;
	}

	public void setCxXactAmt(Double cxXactAmt) {
		this.cxXactAmt = cxXactAmt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CX_XACT_DATE", length = 10)
	public Date getCxXactDate() {
		return this.cxXactDate;
	}

	public void setCxXactDate(Date cxXactDate) {
		this.cxXactDate = cxXactDate;
	}

	@Column(name = "CX_CO_ID")
	public Integer getCxCoId() {
		return this.cxCoId;
	}

	public void setCxCoId(Integer cxCoId) {
		this.cxCoId = cxCoId;
	}

}

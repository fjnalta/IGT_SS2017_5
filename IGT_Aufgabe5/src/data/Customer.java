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
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "CUSTOMER", catalog = "tpcw")
public class Customer implements java.io.Serializable {

	private int CId;
	private String CUname;
	private String CPasswd;
	private String CFname;
	private String CLname;
	private Integer CAddrId;
	private String CPhone;
	private String CEmail;
	private Date CSince;
	private Date CLastLogin;
	private Date CLogin;
	private Date CExpiration;
	private Double CDiscount;
	private Double CBalance;
	private Double CYtdPmt;
	private Date CBirthdate;
	private String CData;

	public Customer() {
	}

	public Customer(int CId, Date CLogin, Date CExpiration) {
		this.CId = CId;
		this.CLogin = CLogin;
		this.CExpiration = CExpiration;
	}

	public Customer(int CId, String CUname, String CPasswd, String CFname, String CLname, Integer CAddrId,
			String CPhone, String CEmail, Date CSince, Date CLastLogin, Date CLogin, Date CExpiration, Double CDiscount,
			Double CBalance, Double CYtdPmt, Date CBirthdate, String CData) {
		this.CId = CId;
		this.CUname = CUname;
		this.CPasswd = CPasswd;
		this.CFname = CFname;
		this.CLname = CLname;
		this.CAddrId = CAddrId;
		this.CPhone = CPhone;
		this.CEmail = CEmail;
		this.CSince = CSince;
		this.CLastLogin = CLastLogin;
		this.CLogin = CLogin;
		this.CExpiration = CExpiration;
		this.CDiscount = CDiscount;
		this.CBalance = CBalance;
		this.CYtdPmt = CYtdPmt;
		this.CBirthdate = CBirthdate;
		this.CData = CData;
	}

	@Id

	@Column(name = "C_ID", unique = true, nullable = false)
	public int getCId() {
		return this.CId;
	}

	public void setCId(int CId) {
		this.CId = CId;
	}

	@Column(name = "C_UNAME", length = 20)
	public String getCUname() {
		return this.CUname;
	}

	public void setCUname(String CUname) {
		this.CUname = CUname;
	}

	@Column(name = "C_PASSWD", length = 20)
	public String getCPasswd() {
		return this.CPasswd;
	}

	public void setCPasswd(String CPasswd) {
		this.CPasswd = CPasswd;
	}

	@Column(name = "C_FNAME", length = 17)
	public String getCFname() {
		return this.CFname;
	}

	public void setCFname(String CFname) {
		this.CFname = CFname;
	}

	@Column(name = "C_LNAME", length = 17)
	public String getCLname() {
		return this.CLname;
	}

	public void setCLname(String CLname) {
		this.CLname = CLname;
	}

	@Column(name = "C_ADDR_ID")
	public Integer getCAddrId() {
		return this.CAddrId;
	}

	public void setCAddrId(Integer CAddrId) {
		this.CAddrId = CAddrId;
	}

	@Column(name = "C_PHONE", length = 18)
	public String getCPhone() {
		return this.CPhone;
	}

	public void setCPhone(String CPhone) {
		this.CPhone = CPhone;
	}

	@Column(name = "C_EMAIL", length = 50)
	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "C_SINCE", length = 10)
	public Date getCSince() {
		return this.CSince;
	}

	public void setCSince(Date CSince) {
		this.CSince = CSince;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "C_LAST_LOGIN", length = 10)
	public Date getCLastLogin() {
		return this.CLastLogin;
	}

	public void setCLastLogin(Date CLastLogin) {
		this.CLastLogin = CLastLogin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_LOGIN", nullable = false, length = 19)
	public Date getCLogin() {
		return this.CLogin;
	}

	public void setCLogin(Date CLogin) {
		this.CLogin = CLogin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C_EXPIRATION", nullable = false, length = 19)
	public Date getCExpiration() {
		return this.CExpiration;
	}

	public void setCExpiration(Date CExpiration) {
		this.CExpiration = CExpiration;
	}

	@Column(name = "C_DISCOUNT", precision = 22, scale = 0)
	public Double getCDiscount() {
		return this.CDiscount;
	}

	public void setCDiscount(Double CDiscount) {
		this.CDiscount = CDiscount;
	}

	@Column(name = "C_BALANCE", precision = 22, scale = 0)
	public Double getCBalance() {
		return this.CBalance;
	}

	public void setCBalance(Double CBalance) {
		this.CBalance = CBalance;
	}

	@Column(name = "C_YTD_PMT", precision = 22, scale = 0)
	public Double getCYtdPmt() {
		return this.CYtdPmt;
	}

	public void setCYtdPmt(Double CYtdPmt) {
		this.CYtdPmt = CYtdPmt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "C_BIRTHDATE", length = 10)
	public Date getCBirthdate() {
		return this.CBirthdate;
	}

	public void setCBirthdate(Date CBirthdate) {
		this.CBirthdate = CBirthdate;
	}

	@Column(name = "C_DATA", length = 510)
	public String getCData() {
		return this.CData;
	}

	public void setCData(String CData) {
		this.CData = CData;
	}

}

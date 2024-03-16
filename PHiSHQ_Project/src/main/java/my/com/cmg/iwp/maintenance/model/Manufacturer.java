package my.com.cmg.iwp.maintenance.model;

// Generated Mar 13, 2012 2:07:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Manufacturer generated by hbm2java
 */
@Entity
@Table(name = "t_manufacturers", uniqueConstraints = @UniqueConstraint(columnNames = "manu_code"))
public class Manufacturer implements java.io.Serializable,
		Comparable<Manufacturer> {
	private static final long serialVersionUID = 610793864518455364L;
	private long manuSeqno = Long.MIN_VALUE;
	private String manufacturerCode;
	private String manufacturerLongName;
	private String manufacturerDesc;
	private long createdBy;
	private Date createdDate;
	private long updatedBy;
	private Date updatedDate;
	private String manufacturerShortname;
	private Character activeFlag = 'A';

	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String postcode;
	private String country;
	private String home_phone;
	private String mobile_phone;
	private String office_phone;
	private String fax;
	private String email;
	private String contact_person;

	public Manufacturer() {
	}

	public Manufacturer(long manuSeqno, String manufacturerCode,
			long createdBy, Date createdDate, long updatedBy, Date updatedDate) {
		this.manuSeqno = manuSeqno;
		this.manufacturerCode = manufacturerCode;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public Manufacturer(long manuSeqno, String manufacturerCode,
			String manuLongname, String manuDesc, long createdBy,
			Date createdDate, long updatedBy, Date updatedDate,
			String manufacturerShortname, String address1, String address2,
			String address3, String city, String state, String postcode,
			String country, String home_phone, String mobile_phone,
			String office_phone, String fax, String email, String contact_person) {
		this.manuSeqno = manuSeqno;
		this.manufacturerCode = manufacturerCode;
		this.manufacturerLongName = manuLongname;
		this.manufacturerDesc = manuDesc;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.manufacturerShortname = manufacturerShortname;

		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
		this.country = country;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
		this.office_phone = office_phone;
		this.fax = fax;
		this.email = email;
		this.contact_person = contact_person;
	}

	@Id
	@Column(name = "manu_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "manuSEQ", sequenceName = "t_manufacturers_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manuSEQ")
	public long getManuSeqno() {
		return this.manuSeqno;
	}

	public void setManuSeqno(long manuSeqno) {
		this.manuSeqno = manuSeqno;
	}

	@Column(name = "manu_code", unique = true, nullable = false, length = 10)
	public String getManufacturerCode() {
		return this.manufacturerCode;
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	@Column(name = "manu_longname", length = 30)
	public String getManufacturerLongName() {
		return this.manufacturerLongName;
	}

	public void setManufacturerLongName(String manuLongname) {
		this.manufacturerLongName = manuLongname;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return activeFlag;
	}

	@Column(name = "manu_desc", length = 30)
	public String getManufacturerDesc() {
		return this.manufacturerDesc;
	}

	public void setManufacturerDesc(String manuDesc) {
		this.manufacturerDesc = manuDesc;
	}

	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by", nullable = false)
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public int compareTo(Manufacturer arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Column(name = "manu_shortname", length = 15)
	public String getManufacturerShortname() {
		return this.manufacturerShortname;
	}

	public void setManufacturerShortname(String manufacturerShortname) {
		this.manufacturerShortname = manufacturerShortname;
	}

	@Column(name = "address1", length = 100)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "address2", length = 100)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "address3", length = 100)
	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "city", length = 30)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", length = 20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "postcode", length = 5)
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "country", length = 48)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "home_phone", length = 20)
	public String getHomePhone() {
		return home_phone;
	}

	public void setHomePhone(String home_phone) {
		this.home_phone = home_phone;
	}

	@Column(name = "mobile_phone", length = 20)
	public String getMobilePhone() {
		return mobile_phone;
	}

	public void setMobilePhone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	@Column(name = "office_phone", length = 20)
	public String getOfficePhone() {
		return office_phone;
	}

	public void setOfficePhone(String office_phone) {
		this.office_phone = office_phone;
	}

	@Column(name = "fax", length = 10)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contact_person", length = 30)
	public String getContactPerson() {
		return contact_person;
	}

	public void setContactPerson(String contact_person) {
		this.contact_person = contact_person;
	}

}

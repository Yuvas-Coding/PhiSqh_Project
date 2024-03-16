package my.com.cmg.iwp.maintenance.model;

// Generated Apr 6, 2012 10:02:52 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * GenericName generated by hbm2java
 */
@Entity
@Table(name = "t_generic_names", uniqueConstraints = @UniqueConstraint(columnNames = "generic_code"))
public class GenericName implements java.io.Serializable {
	private static final long serialVersionUID = -8925867114409500488L;
	private long genericSeqno = Long.MIN_VALUE;
	private String genericCode;
	private String genericDesc;
	private Character genericStatus;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Character activeFlag = 'A';
	private long createBy;
	private Date createDate;
	private long updateBy;
	private Date updateDate;

	private Set<GenericNameAtc> genericNameAtcs = new HashSet<GenericNameAtc>(0);

	public GenericName() {
	}

	public GenericName(long genericSeqno, String genericCode,
			Character genericStatus, long createBy, Date createDate,
			long updateBy, Date updateDate) {
		this.genericSeqno = genericSeqno;
		this.genericCode = genericCode;
		this.genericStatus = genericStatus;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public GenericName(long genericSeqno, String genericCode,
			String genericDesc, Character genericStatus, long createBy,
			Date createDate, long updateBy, Date updateDate) {
		this.genericSeqno = genericSeqno;
		this.genericCode = genericCode;
		this.genericDesc = genericDesc;
		this.genericStatus = genericStatus;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;

	}

	@Id
	@Column(name = "generic_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "genericNameSEQ", sequenceName = "t_generic_names_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genericNameSEQ")
	public long getGenericSeqno() {
		return this.genericSeqno;
	}

	public void setGenericSeqno(long genericSeqno) {

		this.genericSeqno = genericSeqno;
	}

	@Column(name = "generic_code", unique = true, nullable = false, length = 20)
	public String getGenericCode() {

		return this.genericCode;
	}

	public void setGenericCode(String genericCode) {

		this.genericCode = genericCode;
	}

	@Column(name = "generic_desc", length = 350)
	public String getGenericDesc() {
		return this.genericDesc;
	}

	public void setGenericDesc(String genericDesc) {
		this.genericDesc = genericDesc;
	}

	@Column(name = "generic_status", length = 1)
	public Character getGenericStatus() {
		return this.genericStatus;
	}

	public void setGenericStatus(Character genericStatus) {
		this.genericStatus = genericStatus;
	}

	@Column(name = "parameter1", length = 100)
	public String getParameter1() {
		return this.parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	@Column(name = "parameter2", length = 100)
	public String getParameter2() {
		return this.parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	@Column(name = "parameter3", precision = 8, scale = 4)
	public BigDecimal getParameter3() {
		return this.parameter3;
	}

	public void setParameter3(BigDecimal parameter3) {
		this.parameter3 = parameter3;
	}

	@Column(name = "parameter4", precision = 8, scale = 4)
	public BigDecimal getParameter4() {
		return this.parameter4;
	}

	public void setParameter4(BigDecimal parameter4) {
		this.parameter4 = parameter4;
	}

	@Column(name = "parameter5", length = 13)
	public Date getParameter5() {
		return this.parameter5;
	}

	public void setParameter5(Date parameter5) {
		this.parameter5 = parameter5;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "created_by", nullable = false)
	public long getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(long createBy) {
		this.createBy = createBy;
	}

	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "updated_by", nullable = false)
	public long getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(long updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setGenericNameAtcs(Set<GenericNameAtc> genericNameAtcs) {
		this.genericNameAtcs = genericNameAtcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "genericName", cascade=CascadeType.ALL)
	public Set<GenericNameAtc> getGenericNameAtcs() {
		return genericNameAtcs;
	}
}
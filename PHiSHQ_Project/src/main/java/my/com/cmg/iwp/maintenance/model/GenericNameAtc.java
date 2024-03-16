package my.com.cmg.iwp.maintenance.model;

// Generated Apr 6, 2012 10:02:52 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * GenericName generated by hbm2java
 */
@Entity
@Table(name = "t_generic_name_atc", uniqueConstraints = @UniqueConstraint(columnNames = {
		"generic_seqno", "atc_seqno" }))
public class GenericNameAtc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 206507710092913839L;
	private long genatcSeqno = Long.MIN_VALUE;
	private GenericName genericName;
	private AtcDetail atcDetail;
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

	public GenericNameAtc() {
	}

	public GenericNameAtc(long genatcSeqno, GenericName genericName,
			AtcDetail atcDetail, long createBy, Date createDate, long updateBy,
			Date updateDate) {
		this.genatcSeqno = genatcSeqno;
		this.genericName = genericName;
		this.atcDetail = atcDetail;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public void setGenatcSeqno(long genatcSeqno) {
		this.genatcSeqno = genatcSeqno;
	}

	@Id
	@Column(name = "genatc_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "genericNameAtcSEQ", sequenceName = "t_generic_name_atc_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genericNameAtcSEQ")
	public long getGenatcSeqno() {
		return genatcSeqno;
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

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setGenericName(GenericName genericName) {
		this.genericName = genericName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "generic_seqno")
	public GenericName getGenericName() {
		return genericName;
	}

	public void setAtcDetail(AtcDetail atcDetail) {
		this.atcDetail = atcDetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "atc_seqno")
	public AtcDetail getAtcDetail() {
		return atcDetail;
	}

}

// default package
// Generated Jul 13, 2012 5:35:49 PM by Hibernate Tools 3.4.0.CR1
package my.com.cmg.iwp.maintenance.model;

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

/**
 * PhLinkRphamaScan generated by hbm2java
 */
@Entity
@Table(name = "t_link_rpharma_scan")
public class LinkRpharmaScan implements java.io.Serializable {

	private long linkSeqno = Long.MIN_VALUE;
	private Drug drug;
	//private Character defaultYn = 'N';
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Character activeFlag = 'A';
	private long createdBy;
	private Date createdDate;
	private long updatedBy;
	private Date updatedDate;
	private long drugSeqno;
	private long linkHdrsSeqno;
	private BigDecimal minDosageStr;
	private BigDecimal minDosageQty;
	private BigDecimal maxDosageStr;
	private BigDecimal maxDosageQty;

	private LinkRpharmaScanHdrs linkRpharmaScanHdrs;

	public LinkRpharmaScan() {
	}

	public LinkRpharmaScan(long linkSeqno, Drug phDrugs, long createdBy,
			Date createdDate, long updatedBy, Date updatedDate) {
		this.linkSeqno = linkSeqno;
		this.drug = phDrugs;

		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public LinkRpharmaScan(long linkSeqno, Drug phDrugs,// Character defaultYn,
			String parameter1, String parameter2, BigDecimal parameter3,
			BigDecimal parameter4, Date parameter5, Character activeFlag,
			long createdBy, Date createdDate, long updatedBy, Date updatedDate,
			LinkRpharmaScanHdrs linkRpharmaScanHdrs) {
		this.linkSeqno = linkSeqno;
		this.drug = phDrugs;

		//this.defaultYn = defaultYn;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.activeFlag = activeFlag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.linkRpharmaScanHdrs = linkRpharmaScanHdrs;

	}

	@Id
	@Column(name = "link_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "link_seqno_seq", sequenceName = "t_link_rpharma_scan_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "link_seqno_seq")
	public long getLinkSeqno() {
		return this.linkSeqno;
	}

	public void setLinkSeqno(long linkSeqno) {
		this.linkSeqno = linkSeqno;
	}

	@Column(name = "drug_seqno", insertable = false, updatable = false)
	public Long getDrugSeqno() {
		return this.drugSeqno;
	}

	public void setDrugSeqno(Long drugSeqno) {
		this.drugSeqno = drugSeqno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "drug_seqno", nullable = false)
	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
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
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, length = 13)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_date", nullable = false, length = 13)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "link_hdrs_seqno", nullable = false, insertable = true, updatable = true)
	public LinkRpharmaScanHdrs getLinkRpharmaScanHdrs() {
		return linkRpharmaScanHdrs;
	}

	public void setLinkRpharmaScanHdrs(LinkRpharmaScanHdrs linkRpharmaScanHdrs) {
		this.linkRpharmaScanHdrs = linkRpharmaScanHdrs;
	}

	@Column(name = "link_hdrs_seqno", nullable = false, insertable = false, updatable = false)
	public long getLinkHdrsSeqno() {
		return linkHdrsSeqno;
	}

	public void setLinkHdrsSeqno(long linkHdrsSeqno) {
		this.linkHdrsSeqno = linkHdrsSeqno;
	}

	/*@Column(name = "default_yn")
	public Character getDefaultYn() {
		return defaultYn;
	}

	public void setDefaultYn(Character defaultYn) {
		this.defaultYn = defaultYn;
	}*/

	@Column(name = "min_dosage_str", precision = 8, scale = 4)
	public BigDecimal getMinDosageStr() { return minDosageStr; }
	public void setMinDosageStr(BigDecimal minDosageStr) { this.minDosageStr = minDosageStr; }

	@Column(name = "min_dosage_qty", precision = 8, scale = 4)
	public BigDecimal getMinDosageQty() { return minDosageQty; }
	public void setMinDosageQty(BigDecimal minDosageQty) { this.minDosageQty = minDosageQty; }

	@Column(name = "max_dosage_str", precision = 8, scale = 4)
	public BigDecimal getMaxDosageStr() { return maxDosageStr; }
	public void setMaxDosageStr(BigDecimal maxDosageStr) { this.maxDosageStr = maxDosageStr; }

	@Column(name = "max_dosage_qty", precision = 8, scale = 4)
	public BigDecimal getMaxDosageQty() { return maxDosageQty; }
	public void setMaxDosageQty(BigDecimal maxDosageQty) { this.maxDosageQty = maxDosageQty; }
}
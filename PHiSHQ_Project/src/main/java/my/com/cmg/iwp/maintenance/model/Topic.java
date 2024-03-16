package my.com.cmg.iwp.maintenance.model;

// Generated Apr 2, 2012 2:56:58 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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

/**
 * Topic generated by hbm2java
 */
@Entity
@Table(name = "t_topic")
public class Topic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2937078404537744552L;
	private long topicSeqno = Long.MIN_VALUE;
	private String topicCode;
	private String topicName;
	private String remarks;
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

	public Topic() {
	}

	public Topic(long topicSeqno , String topicCode,
			String topicName, String parameter1,
			String parameter2, BigDecimal parameter3, BigDecimal parameter4,
			Date parameter5, Character activeFlag, long createBy,
			Date createDate, long updateBy, Date updateDate) {
		super();
		this.topicSeqno = topicSeqno ;
		this.topicCode = topicCode;
		this.topicName = topicName;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.createdBy = createBy;
		this.createdDate = createDate;
		this.updatedBy = updateBy;
		this.updatedDate = updateDate;
	}

	@Id
	@Column(name = "topic_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "topicSeqnoSEQ", sequenceName = "t_topic_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topicSeqnoSEQ")
	public long getTopicSeqno() {
		return this.topicSeqno;
	}

	public void setTopicSeqno(long topicSeqno) {
		this.topicSeqno = topicSeqno;
	}

	@Column(name = "topic_code", length = 10)
	public String getTopicCode() {
		return topicCode;
	}

	public void setTopicCode(String topicCode) {
		this.topicCode = topicCode;
	}
	
	@Column(name = "topic_name", length = 100)
	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Column(name = "remarks", length = 250)
	public String getRemarks() {
		return remarks;
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

	@Column(name = "created_by")
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createBy) {
		this.createdBy = createBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createDate) {
		this.createdDate = createDate;
	}

	@Column(name = "updated_by")
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updateBy) {
		this.updatedBy = updateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updateDate) {
		this.updatedDate = updateDate;
	}
}
package my.com.cmg.iwp.maintenance.model;

// Generated May 29, 2012 4:37:05 PM by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;

/**
 * PhVoteObjects generated by hbm2java
 */
@Entity
@Table(name = "t_vote_objects", uniqueConstraints = @UniqueConstraint(columnNames = "object_code"))
public class VoteObject implements java.io.Serializable {
	private static final long serialVersionUID = -7440923811798392661L;
	private long objectSeqno = Long.MIN_VALUE;
	private String objectCode;
	private String objectDesc;
	private String objectStatus = "Active";
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
	private String itemGroup;
	private Character useByOthers;
	private NePGLAccount nePGLAccount;
	//private VoteObjAccounts voteObjAccounts;
	private Set<VoteObjAccounts> voteObjAccounts = new HashSet<VoteObjAccounts>(0);
	
	public VoteObject() {
	}

	public VoteObject(long objectSeqno, String objectCode, String objectDesc,
			String objectStatus, long createdBy, Date createdDate,
			long updatedBy, Date updatedDate) {
		this.objectSeqno = objectSeqno;
		this.objectCode = objectCode;
		this.objectDesc = objectDesc;
		this.objectStatus = objectStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public VoteObject(long objectSeqno, String objectCode, String objectDesc,
			String objectStatus, String parameter1, String parameter2,
			BigDecimal parameter3, BigDecimal parameter4, Date parameter5,
			Character activeFlag, long createdBy, Date createdDate,
			long updatedBy, Date updatedDate, String itemGroup) {
		this.objectSeqno = objectSeqno;
		this.objectCode = objectCode;
		this.objectDesc = objectDesc;
		this.objectStatus = objectStatus;
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
		this.itemGroup = itemGroup;
	}

	@Id
	@Column(name = "object_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "object_seqno", sequenceName = "t_vote_objects_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "object_seqno")
	public long getObjectSeqno() {
		return this.objectSeqno;
	}

	public void setObjectSeqno(long objectSeqno) {
		this.objectSeqno = objectSeqno;
	}

	@Column(name = "object_code", unique = true, nullable = false, length = 10)
	public String getObjectCode() {
		return this.objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}

	@Column(name = "object_desc", nullable = false, length = 100)
	public String getObjectDesc() {
		return this.objectDesc;
	}

	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}

	@Column(name = "object_status", length = 10)
	public String getObjectStatus() {
		return this.objectStatus;
	}

	public void setObjectStatus(String objectStatus) {
		this.objectStatus = objectStatus;
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

	@Column(name = "item_group", nullable = false, length = 10)
	public String getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(String itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Column(name = "use_by_others")
	public Character getUseByOthers() {
		return useByOthers;
	}

	public void setUseByOthers(Character useByOthers) {
		this.useByOthers = useByOthers;
	}

/*	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "t_voteobj_accounts", joinColumns = {
			@JoinColumn(name = "object_seqno", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "akaun_seqno", nullable = false, updatable = false) })
	public Set<NePGLAccount> getNePGLAccount() {
		return nePGLAccount;
	}

	public void setNePGLAccount(Set<NePGLAccount> nePGLAccount) {
		this.nePGLAccount = nePGLAccount;
	}*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "akaun_seqno", nullable = true)
	public NePGLAccount getNePGLAccount() {
		return nePGLAccount;
	}

	public void setNePGLAccount(NePGLAccount nePGLAccount) {
		this.nePGLAccount = nePGLAccount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "voteObject",cascade=CascadeType.ALL)
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE,
		org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
	public Set<VoteObjAccounts> getVoteObjAccounts() {
		return voteObjAccounts;
	}

	public void setVoteObjAccounts(Set<VoteObjAccounts> voteObjAccounts) {
		this.voteObjAccounts = voteObjAccounts;
	}

	

}
package my.com.cmg.iwp.maintenance.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import my.com.cmg.iwp.webui.constant.RefCodeConstant;

/**
 * HQDetails generated by hbm2java
 */
@Entity
@Table(name = "T_HQ_CONFIG", uniqueConstraints = @UniqueConstraint(columnNames = "fc_i_code"))
public class HqConfig implements java.io.Serializable {
	private static final long serialVersionUID = -4528823248368967596L;
	private long fcISeqno = Long.MIN_VALUE;
	private String fcICode;
	private String fcICategory;
	private String fcIName;
	private String fcIGrpcode;
	private String fcIPtjcode;
	private String fcIPrefix;
	private String fcIRemarks;
	private long createdBy;
	private long updatedBy;
	private Department pharDept;
	private Date createdDate;
	private Date updatedDate;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private String activeFlag;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String postcode;
	private String country;
	private String officePhone;
	private String email;
	private String publicPortalIP;
	private String communityPortalIP;
	private String publicPortalPort;
	private String communityPortalPort;
	private Integer fcICurCycle;
	private BigDecimal intervalExtcdr;
	private BigDecimal intervalExtdi;
	private BigDecimal intervalExtindent;
	private BigDecimal intervalExtissue;
	private BigDecimal intervalExtiv;
	private BigDecimal intervalExtpn;
	private BigDecimal intervalExtrp;
	private BigDecimal intervalExttdm;
	private BigDecimal intervalKpk;
	private BigDecimal intervalNotification;
	private BigDecimal intervalSpub;
	private BigDecimal intervalExtHqContract;
	private BigDecimal intervalOrderDashboard;
	private BigDecimal intervalPenalty;
	private Character auditFlag = RefCodeConstant.BOOLEAN_FALSE;
	private String isePOnline;
	private String isePNextGenActive;
	
	private BigDecimal intervalSpubCor;
	
	private Date yepLastUpdateDate;
	private BigDecimal intervalExtreturn;
	
	private String emailSmtpHost;
	private String emailSmtpPort;
	private String emailSenderAccount;
	private String emailSenderPassword;
	private Integer maxPasswordAttempt;
//	private String phishqUrl;
	
	public HqConfig() {
	}

	public HqConfig(long fcISeqno, String fcICode, String fcICategory,
			String fcIName, String fcIPtjcode, Date createDate,
			Date updateDate, long createBy, long updateBy) {
		this.fcISeqno = fcISeqno;
		this.fcICode = fcICode;
		this.fcICategory = fcICategory;
		this.fcIName = fcIName;
		this.fcIPtjcode = fcIPtjcode;
		this.createdDate = createDate;
		this.updatedDate = updateDate;
		this.createdBy = createBy;
		this.updatedBy = updateBy;
	}

	public HqConfig(long fcISeqno, String fcICode, String fcICategory,
			String fcIName, String fcIGrpcode, String fcIPtjcode,
			String fcIPrefix, Date createDate, Date updateDate, 
			String parameter1, String parameter2, BigDecimal parameter3, 
			BigDecimal parameter4, Date parameter5, String fcIRemarks,
			boolean activeFlag, long createBy, long updateBy,
			String address1, String address2, String address3, String city, 
			String state, String postcode, String country, String officePhone, 
			String fax, String email, String fcDcPort, Integer fcICurCycle) {
		this.fcISeqno = fcISeqno;
		this.fcICode = fcICode;
		this.fcICategory = fcICategory;
		this.fcIName = fcIName;
		this.fcIGrpcode = fcIGrpcode;
		this.fcIPtjcode = fcIPtjcode;
		this.fcIPrefix = fcIPrefix;
		this.fcIRemarks = fcIRemarks;
		this.createdDate = createDate;
		this.updatedDate = updateDate;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.createdBy = createBy;
		this.updatedBy = updateBy;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
		this.country = country;
		this.officePhone = officePhone;
		this.email = email;
		this.fcICurCycle = fcICurCycle;
	}

	@Id
	@Column(name = "fc_i_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "fc_i_seqno", sequenceName = "T_HQ_CONFIG_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fc_i_seqno")
	public long getFcISeqno() {
		return this.fcISeqno;
	}

	public void setFcISeqno(long fcISeqno) {
		this.fcISeqno = fcISeqno;
	}

	@Column(name = "fc_i_code", unique = true, nullable = false, length = 15)
	public String getFcICode() {
		return this.fcICode;
	}

	public void setFcICode(String fcICode) {
		this.fcICode = fcICode;
	}

	@Column(name = "fc_i_category", nullable = false, length = 20)
	public String getFcICategory() {
		return this.fcICategory;
	}

	public void setFcICategory(String fcICategory) {
		this.fcICategory = fcICategory;
	}

	@Column(name = "fc_i_name", nullable = false, length = 50)
	public String getFcIName() {
		return this.fcIName;
	}

	public void setFcIName(String fcIName) {
		this.fcIName = fcIName;
	}

	@Column(name = "fc_i_grpcode", length = 15)
	public String getFcIGrpcode() {
		return this.fcIGrpcode;
	}

	public void setFcIGrpcode(String fcIGrpcode) {
		this.fcIGrpcode = fcIGrpcode;
	}

	@Column(name = "fc_i_ptjcode", nullable = false, length = 15)
	public String getFcIPtjcode() {
		return this.fcIPtjcode;
	}

	public void setFcIPtjcode(String fcIPtjcode) {
		this.fcIPtjcode = fcIPtjcode;
	}

	@Column(name = "fc_i_prefix", length = 10)
	public String getFcIPrefix() {
		return this.fcIPrefix;
	}

	public void setFcIPrefix(String fcIPrefix) {
		this.fcIPrefix = fcIPrefix;
	}

	@Column(name = "fc_i_remarks", length = 50)
	public String getFcIRemarks() {
		return this.fcIRemarks;
	}

	public void setFcIRemarks(String fcIRemarks) {
		this.fcIRemarks = fcIRemarks;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createDate) {
		this.createdDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updateDate) {
		this.updatedDate = updateDate;
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
	public String isActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createBy) {
		this.createdBy = createBy;
	}

	@Column(name = "updated_by", nullable = false)
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updateBy) {
		this.updatedBy = updateBy;
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

	@Column(name = "office_phone", length = 20)
	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "INTERVAL_EXTCDR")
	public BigDecimal getIntervalExtcdr() {
		return this.intervalExtcdr;
	}

	public void setIntervalExtcdr(BigDecimal intervalExtcdr) {
		this.intervalExtcdr = intervalExtcdr;
	}

	@Column(name = "INTERVAL_EXTDI")
	public BigDecimal getIntervalExtdi() {
		return this.intervalExtdi;
	}

	public void setIntervalExtdi(BigDecimal intervalExtdi) {
		this.intervalExtdi = intervalExtdi;
	}

	@Column(name = "INTERVAL_EXTINDENT")
	public BigDecimal getIntervalExtindent() {
		return this.intervalExtindent;
	}

	public void setIntervalExtindent(BigDecimal intervalExtindent) {
		this.intervalExtindent = intervalExtindent;
	}

	@Column(name = "INTERVAL_EXTISSUE")
	public BigDecimal getIntervalExtissue() {
		return this.intervalExtissue;
	}

	public void setIntervalExtissue(BigDecimal intervalExtissue) {
		this.intervalExtissue = intervalExtissue;
	}

	@Column(name = "INTERVAL_EXTIV")
	public BigDecimal getIntervalExtiv() {
		return this.intervalExtiv;
	}

	public void setIntervalExtiv(BigDecimal intervalExtiv) {
		this.intervalExtiv = intervalExtiv;
	}

	@Column(name = "INTERVAL_EXTPN")
	public BigDecimal getIntervalExtpn() {
		return this.intervalExtpn;
	}

	public void setIntervalExtpn(BigDecimal intervalExtpn) {
		this.intervalExtpn = intervalExtpn;
	}

	@Column(name = "INTERVAL_EXTRP")
	public BigDecimal getIntervalExtrp() {
		return this.intervalExtrp;
	}

	public void setIntervalExtrp(BigDecimal intervalExtrp) {
		this.intervalExtrp = intervalExtrp;
	}

	@Column(name = "INTERVAL_EXTTDM")
	public BigDecimal getIntervalExttdm() {
		return this.intervalExttdm;
	}

	public void setIntervalExttdm(BigDecimal intervalExttdm) {
		this.intervalExttdm = intervalExttdm;
	}

	@Column(name = "INTERVAL_KPK")
	public BigDecimal getIntervalKpk() {
		return this.intervalKpk;
	}

	public void setIntervalKpk(BigDecimal intervalKpk) {
		this.intervalKpk = intervalKpk;
	}

	@Column(name = "INTERVAL_NOTIFICATION")
	public BigDecimal getIntervalNotification() {
		return this.intervalNotification;
	}

	public void setIntervalNotification(BigDecimal intervalNotification) {
		this.intervalNotification = intervalNotification;
	}

	@Column(name = "INTERVAL_SPUB")
	public BigDecimal getIntervalSpub() {
		return this.intervalSpub;
	}

	public void setIntervalSpub(BigDecimal intervalSpub) {
		this.intervalSpub = intervalSpub;
	}

	@Column(name = "INTERVAL_EXTHQCONTRACT")
	public BigDecimal getIntervalExtHqContract() {
		return intervalExtHqContract;
	}

	public void setIntervalExtHqContract(BigDecimal intervalExtHqContract) {
		this.intervalExtHqContract = intervalExtHqContract;
	}

	public void setFcICurCycle(Integer fcICurCycle) {
		this.fcICurCycle = fcICurCycle;
	}

	@Column(name = "fc_i_cur_cycle")
	public Integer getFcICurCycle() {
		return fcICurCycle;
	}
	
	@Column(name = "yep_last_updatedate")
	public Date getYepLastUpdateDate() {
		return yepLastUpdateDate;
	}

	public void setYepLastUpdateDate(Date yepLastUpdateDate) {
		this.yepLastUpdateDate = yepLastUpdateDate;
	}

	@Column(name = "INTERVAL_ORDER_DASHBOARD")
	public BigDecimal getIntervalOrderDashboard() {
		return intervalOrderDashboard;
	}

	public void setIntervalOrderDashboard(BigDecimal intervalOrderDashboard) {
		this.intervalOrderDashboard = intervalOrderDashboard;
	}

	@Column(name = "PUBLIC_PORTAL_IP")
	public String getPublicPortalIP() {
		return publicPortalIP;
	}

	public void setPublicPortalIP(String publicPortalIP) {
		this.publicPortalIP = publicPortalIP;
	}

	@Column(name = "COM_PORTAL_IP")
	public String getCommunityPortalIP() {
		return communityPortalIP;
	}

	public void setCommunityPortalIP(String communityPortalIP) {
		this.communityPortalIP = communityPortalIP;
	}

	@Column(name = "PUBLIC_PORTAL_PORT")
	public String getPublicPortalPort() {
		return publicPortalPort;
	}

	public void setPublicPortalPort(String publicPortalPort) {
		this.publicPortalPort = publicPortalPort;
	}

	@Column(name = "COM_PORTAL_PORT")
	public String getCommunityPortalPort() {
		return communityPortalPort;
	}

	public void setCommunityPortalPort(String communityPortalPort) {
		this.communityPortalPort = communityPortalPort;
	}

	@Column(name = "INTERVAL_PENALTY")
	public BigDecimal getIntervalPenalty() {
		return intervalPenalty;
	}

	public void setIntervalPenalty(BigDecimal intervalPenalty) {
		this.intervalPenalty = intervalPenalty;
	}
	
	@Column(name = "INTERVAL_SPUB_COR")
	public BigDecimal getIntervalSpubCor() {
		return intervalSpubCor;
	}

	public void setIntervalSpubCor(BigDecimal intervalSpubCor) {
		this.intervalSpubCor = intervalSpubCor;
	}

	@Column(name = "audit_flag")
	public Character getAuditFlag() {
		return auditFlag;
	}

	public void setAuditFlag(Character auditFlag) {
		this.auditFlag = auditFlag;
	}

	@Column(name = "fc_i_is_ep_online")
	public String getIsePOnline() {
		return isePOnline;
	}

	public void setIsePOnline(String isePOnline) {
		this.isePOnline = isePOnline;
	}

	@Column(name = "is_epnextgen_active")	
	public String getIsePNextGenActive() {
		return isePNextGenActive;
	}

	public void setIsePNextGenActive(String isePNextGenActive) {
		this.isePNextGenActive = isePNextGenActive;
	}

	@Column(name = "INTERVAL_EXTRETURN")
	public BigDecimal getIntervalExtreturn() {
		return intervalExtreturn;
	}

	public void setIntervalExtreturn(BigDecimal intervalExtreturn) {
		this.intervalExtreturn = intervalExtreturn;
	}

	@Column(name = "EMAIL_SMTP_HOST")
	public String getEmailSmtpHost() {
		return emailSmtpHost;
	}

	public void setEmailSmtpHost(String emailSmtpHost) {
		this.emailSmtpHost = emailSmtpHost;
	}

	@Column(name = "EMAIL_SMTP_PORT")
	public String getEmailSmtpPort() {
		return emailSmtpPort;
	}

	public void setEmailSmtpPort(String emailSmtpPort) {
		this.emailSmtpPort = emailSmtpPort;
	}

	@Column(name = "EMAIL_SENDER_ACC")
	public String getEmailSenderAccount() {
		return emailSenderAccount;
	}

	public void setEmailSenderAccount(String emailSenderAccount) {
		this.emailSenderAccount = emailSenderAccount;
	}

	@Column(name = "EMAIL_SENDER_PASS")
	public String getEmailSenderPassword() {
		return emailSenderPassword;
	}

	public void setEmailSenderPassword(String emailSenderPassword) {
		this.emailSenderPassword = emailSenderPassword;
	}

	@Column(name = "MAX_PASSWORD_ATTEMPT")
	public Integer getMaxPasswordAttempt() {
		return maxPasswordAttempt;
	}

	public void setMaxPasswordAttempt(Integer maxPasswordAttempt) {
		this.maxPasswordAttempt = maxPasswordAttempt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


//	@Column(name = "PHISHQ_URL")
//	public String getPhishqUrl() {
//		return phishqUrl;
//	}
//
//	public void setPhishqUrl(String phishqUrl) {
//		this.phishqUrl = phishqUrl;
//	}	
	
	@OneToOne
	@JoinColumn(name = "DEPT_SEQNO")
	public Department getPharDept() {
		return pharDept;
	}

	public void setPharDept(Department pharDept) {
		this.pharDept = pharDept;
	}

	
}
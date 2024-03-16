package my.com.cmg.iwp.maintenance.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name="NotificationDtl")
@JsonIgnoreProperties(ignoreUnknown=true)
public class NotificationDtlV1823 implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long dtlSeqNo;
	private Character activeFlag;
	private Date batchExpdate;
	private String batchno;
	private Long createdBy;
	private Date createdDate;
	private String itemCode;
	private String itemDesc;
	private String itemType;
	private byte[] dtlAttachment;
	private Long offerQty;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private String rpdBrandName;
	private String rpdManufacturerName;
	private String rpdRegHolder;
	private String rpdRegNo;
	private Long smiItemSeqno;
	private String smiSku;
	private Long updatedBy;
	private Date updatedDate;
	private Long availableQty;
	private Character batchType;
	private NotificationHdrV1823 notificationHdr;

	public NotificationDtlV1823() {
	}
	
	public NotificationDtlV1823(long dtlSeqNo) {
    	this.dtlSeqNo = dtlSeqNo;
    }

	@Id
	@SequenceGenerator(name = "NOTIFICATION_DTL_SEQ", sequenceName = "T_NOTIFICATION_DTLS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NOTIFICATION_DTL_SEQ")
	@Column(name = "N_DTL_SEQ_NO", unique = true, nullable = false, precision = 38, scale = 0)
	public long getDtlSeqNo() {
		return this.dtlSeqNo;
	}

	public void setDtlSeqNo(long dtlSeqNo) {
		this.dtlSeqNo = dtlSeqNo;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "batch_expdate")
	public Date getBatchExpdate() {
		return this.batchExpdate;
	}

	public void setBatchExpdate(Date batchExpdate) {
		this.batchExpdate = batchExpdate;
	}

	@Column(name="BATCHNO")
	public String getBatchno() {
		return this.batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	@Column(name = "created_by")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "item_code")
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "item_type")
	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Column(name = "ndtl_attachment")
	public byte[] getDtlAttachment() {
		return this.dtlAttachment;
	}

	public void setDtlAttachment(byte[] dtlAttachment) {
		this.dtlAttachment = dtlAttachment;
	}

	@Column(name = "offer_qty")
	public Long getOfferQty() {
		return this.offerQty;
	}

	public void setOfferQty(Long offerQty) {
		this.offerQty = offerQty;
	}

	public String getParameter1() {
		return this.parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public String getParameter2() {
		return this.parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	public BigDecimal getParameter3() {
		return this.parameter3;
	}

	public void setParameter3(BigDecimal parameter3) {
		this.parameter3 = parameter3;
	}

	public BigDecimal getParameter4() {
		return this.parameter4;
	}

	public void setParameter4(BigDecimal parameter4) {
		this.parameter4 = parameter4;
	}

	@Temporal(TemporalType.DATE)
	public Date getParameter5() {
		return this.parameter5;
	}

	public void setParameter5(Date parameter5) {
		this.parameter5 = parameter5;
	}

	@Column(name = "rpd_brand_name")
	public String getRpdBrandName() {
		return this.rpdBrandName;
	}

	public void setRpdBrandName(String rpdBrandName) {
		this.rpdBrandName = rpdBrandName;
	}

	@Column(name = "rpd_manufacturer_name")
	public String getRpdManufacturerName() {
		return this.rpdManufacturerName;
	}

	public void setRpdManufacturerName(String rpdManufacturerName) {
		this.rpdManufacturerName = rpdManufacturerName;
	}

	@Column(name = "rpd_reg_holder")
	public String getRpdRegHolder() {
		return this.rpdRegHolder;
	}

	public void setRpdRegHolder(String rpdRegHolder) {
		this.rpdRegHolder = rpdRegHolder;
	}

	@Column(name = "rpd_reg_no")
	public String getRpdRegNo() {
		return this.rpdRegNo;
	}

	public void setRpdRegNo(String rpdRegNo) {
		this.rpdRegNo = rpdRegNo;
	}

	@Column(name = "smi_item_seqno")
	public Long getSmiItemSeqno() {
		return this.smiItemSeqno;
	}

	public void setSmiItemSeqno(Long smiItemSeqno) {
		this.smiItemSeqno = smiItemSeqno;
	}

	@Column(name = "smi_sku")
	public String getSmiSku() {
		return this.smiSku;
	}

	public void setSmiSku(String smiSku) {
		this.smiSku = smiSku;
	}

	@Column(name = "updated_by")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date")
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	// bi-directional many-to-one association to NotificationHdr
	@ManyToOne
	@JoinColumn(name = "n_hdr_seqno")
	@JsonBackReference
	public NotificationHdrV1823 getNotificationHdr() {
		return this.notificationHdr;
	}

	public void setNotificationHdr(NotificationHdrV1823 notificationHdr) {
		this.notificationHdr = notificationHdr;
	}

	@Column(name = "item_description", length = 100)
	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	@Column(name = "available_qty")
	public Long getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(Long availableQty) {
		this.availableQty = availableQty;
	}

	@Column(name = "n_batch_type")
	public Character getBatchType() {
		return batchType;
	}

	public void setBatchType(Character batchType) {
		this.batchType = batchType;
	}
}

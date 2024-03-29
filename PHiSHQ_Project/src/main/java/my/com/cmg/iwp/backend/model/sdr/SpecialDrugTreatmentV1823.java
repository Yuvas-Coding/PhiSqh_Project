package my.com.cmg.iwp.backend.model.sdr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name = "SpecialDrugTreatment")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SpecialDrugTreatmentV1823 implements java.io.Serializable {

	private long sdTreatmentSeqno;
	private Integer version;
	private SpecialDrugPatientV1823 specialDrugPatient;
	private String alternativeTreament;
	private String duration;
	private String reason;
	private long createdBy;
	private Date createdDate;
	private long updatedBy;
	private Date updatedDate;

	public SpecialDrugTreatmentV1823() {
	}

	public SpecialDrugTreatmentV1823(long sdTreatmentSeqno,
			SpecialDrugRequestOrder specialDrugRequestOrder, Date createdDate,
			Date updatedDate) {
		this.sdTreatmentSeqno = sdTreatmentSeqno;
//		this.specialDrugRequestOrder = specialDrugRequestOrder;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public SpecialDrugTreatmentV1823(long sdTreatmentSeqno,
			SpecialDrugRequestOrder specialDrugRequestOrder,
			String alternativeTreament, String duration, String reason,
			long createdBy, Date createdDate, long updatedBy, Date updatedDate) {
		this.sdTreatmentSeqno = sdTreatmentSeqno;
//		this.specialDrugRequestOrder = specialDrugRequestOrder;
		this.alternativeTreament = alternativeTreament;
		this.duration = duration;
		this.reason = reason;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Id
	@Column(name = "SD_TREATMENT_SEQNO", unique = true, nullable = false, precision = 38, scale = 0)
	@SequenceGenerator(name = "sdTreatmentSeqno", sequenceName = "T_SPL_DRUG_TREATMENT_INT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sdTreatmentSeqno")
	public long getSdTreatmentSeqno() {
		return this.sdTreatmentSeqno;
	}

	public void setSdTreatmentSeqno(long sdTreatmentSeqno) {
		this.sdTreatmentSeqno = sdTreatmentSeqno;
	}

	@Version
	@Column(name = "VERSION")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "ALTERNATIVE_TREAMENT", length = 50)
	public String getAlternativeTreament() {
		return this.alternativeTreament;
	}

	public void setAlternativeTreament(String alternativeTreament) {
		this.alternativeTreament = alternativeTreament;
	}

	@Column(name = "DURATION", length = 50)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "REASON", length = 50)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "CREATED_BY", precision = 38, scale = 0)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", nullable = false)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "UPDATED_BY", precision = 38, scale = 0)
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", nullable = false)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SD_PATIENT_SEQNO")
	@JsonBackReference
	public SpecialDrugPatientV1823 getSpecialDrugPatient() {
		return specialDrugPatient;
	}

	public void setSpecialDrugPatient(SpecialDrugPatientV1823 specialDrugPatient) {
		this.specialDrugPatient = specialDrugPatient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alternativeTreament == null) ? 0 : alternativeTreament.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecialDrugTreatmentV1823 other = (SpecialDrugTreatmentV1823) obj;
		if (alternativeTreament == null) {
			if (other.alternativeTreament != null)
				return false;
		} else if (!alternativeTreament.equals(other.alternativeTreament))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}

}

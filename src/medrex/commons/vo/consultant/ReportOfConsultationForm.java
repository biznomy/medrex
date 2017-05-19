package medrex.commons.vo.consultant;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReportOfConsultationForm")
public class ReportOfConsultationForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1752164422913552688L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "reportRequestedRegarding")
	private String reportRequestedRegarding;
	@Column(name = "signaturePhysician")
	private String signaturePhysician;
	@Column(name = "findings")
	private String findings;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "recommendations")
	private String recommendations;
	@Column(name = "dateOfConsultation")
	private Date dateOfConsultation;
	@Column(name = "doctor")
	private String doctor;
	@Column(name = "signatureConsultant")
	private String signatureConsultant;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getReportRequestedRegarding() {
		return reportRequestedRegarding;
	}

	public void setReportRequestedRegarding(String reportRequestedRegarding) {
		this.reportRequestedRegarding = reportRequestedRegarding;
	}

	public String getSignaturePhysician() {
		return signaturePhysician;
	}

	public void setSignaturePhysician(String signaturePhysician) {
		this.signaturePhysician = signaturePhysician;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

	public Date getDateOfConsultation() {
		return dateOfConsultation;
	}

	public void setDateOfConsultation(Date dateOfConsultation) {
		this.dateOfConsultation = dateOfConsultation;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getSignatureConsultant() {
		return signatureConsultant;
	}

	public void setSignatureConsultant(String signatureConsultant) {
		this.signatureConsultant = signatureConsultant;
	}

}

package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm3")
public class PhysicianOrderForm3 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7467491146003978895L;
	@Id
	@GeneratedValue
	@Column(name = "")
	private int serial;
	@Column(name = "")
	private int residentId;
	@Column(name = "")
	private String diagnosis;
	@Column(name = "")
	private String allergies;
	@Column(name = "")
	private String hctOrCbcOr;
	@Column(name = "")
	private Date baselineSchedule;
	@Column(name = "")
	private int baselineCbc;
	@Column(name = "")
	private int hemoAgent;
	@Column(name = "")
	private int duration;
	@Column(name = "")
	private String durationOtherField;
	@Column(name = "")
	private int frequency;
	@Column(name = "")
	private String frequencyOtherField;
	@Column(name = "wrapLooselyKling")
	private boolean wrapLooselyKling;
	@Column(name = "cleanseWoundThen")
	private int cleanseWoundThen;
	@Column(name = "cleanse")
	private int cleanse;
	@Column(name = "coverWithOtherField")
	private String coverWithOtherField;
	@Column(name = "cleanseWithOther")
	private String cleanseWithOther;
	@Column(name = "site")
	private String site;
	@Column(name = "pharmacyConsultantSign")
	private String pharmacyConsultantSign;
	@Column(name = "doctorSignature")
	private String doctorSignature;
	@Column(name = "mdSignDate")
	private Date mdSignDate;
	@Column(name = "mdSignature")
	private String mdSignature;
	@Column(name = "reviewedTime01")
	private String reviewedTime01;
	@Column(name = "reviewedDate01")
	private Date reviewedDate01;
	@Column(name = "reviewedBy01")
	private String reviewedBy01;
	@Column(name = "reviewedTime02")
	private String reviewedTime02;
	@Column(name = "reviewedDate02")
	private Date reviewedDate02;
	@Column(name = "reviewedBy02")
	private String reviewedBy02;
	@Column(name = "reviewedTime03")
	private String reviewedTime03;
	@Column(name = "reviewedDate03")
	private Date reviewedDate03;
	@Column(name = "reviewedBy03")
	private String reviewedBy03;

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public int getBaselineCbc() {
		return baselineCbc;
	}

	public void setBaselineCbc(int baselineCbc) {
		this.baselineCbc = baselineCbc;
	}

	public Date getBaselineSchedule() {
		return baselineSchedule;
	}

	public void setBaselineSchedule(Date baselineSchedule) {
		this.baselineSchedule = baselineSchedule;
	}

	public int getCleanse() {
		return cleanse;
	}

	public void setCleanse(int cleanse) {
		this.cleanse = cleanse;
	}

	public String getCleanseWithOther() {
		return cleanseWithOther;
	}

	public void setCleanseWithOther(String cleanseWithOther) {
		this.cleanseWithOther = cleanseWithOther;
	}

	public int getCleanseWoundThen() {
		return cleanseWoundThen;
	}

	public void setCleanseWoundThen(int cleanseWoundThen) {
		this.cleanseWoundThen = cleanseWoundThen;
	}

	public String getCoverWithOtherField() {
		return coverWithOtherField;
	}

	public void setCoverWithOtherField(String coverWithOtherField) {
		this.coverWithOtherField = coverWithOtherField;
	}

	public String getDoctorSignature() {
		return doctorSignature;
	}

	public void setDoctorSignature(String doctorSignature) {
		this.doctorSignature = doctorSignature;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDurationOtherField() {
		return durationOtherField;
	}

	public void setDurationOtherField(String durationOtherField) {
		this.durationOtherField = durationOtherField;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getFrequencyOtherField() {
		return frequencyOtherField;
	}

	public void setFrequencyOtherField(String frequencyOtherField) {
		this.frequencyOtherField = frequencyOtherField;
	}

	public String getHctOrCbcOr() {
		return hctOrCbcOr;
	}

	public void setHctOrCbcOr(String hctOrCbcOr) {
		this.hctOrCbcOr = hctOrCbcOr;
	}

	public int getHemoAgent() {
		return hemoAgent;
	}

	public void setHemoAgent(int hemoAgent) {
		this.hemoAgent = hemoAgent;
	}

	public String getMdSignature() {
		return mdSignature;
	}

	public void setMdSignature(String mdSignature) {
		this.mdSignature = mdSignature;
	}

	public Date getMdSignDate() {
		return mdSignDate;
	}

	public void setMdSignDate(Date mdSignDate) {
		this.mdSignDate = mdSignDate;
	}

	public String getPharmacyConsultantSign() {
		return pharmacyConsultantSign;
	}

	public void setPharmacyConsultantSign(String pharmacyConsultantSign) {
		this.pharmacyConsultantSign = pharmacyConsultantSign;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getReviewedBy01() {
		return reviewedBy01;
	}

	public void setReviewedBy01(String reviewedBy01) {
		this.reviewedBy01 = reviewedBy01;
	}

	public String getReviewedBy02() {
		return reviewedBy02;
	}

	public void setReviewedBy02(String reviewedBy02) {
		this.reviewedBy02 = reviewedBy02;
	}

	public String getReviewedBy03() {
		return reviewedBy03;
	}

	public void setReviewedBy03(String reviewedBy03) {
		this.reviewedBy03 = reviewedBy03;
	}

	public Date getReviewedDate01() {
		return reviewedDate01;
	}

	public void setReviewedDate01(Date reviewedDate01) {
		this.reviewedDate01 = reviewedDate01;
	}

	public Date getReviewedDate02() {
		return reviewedDate02;
	}

	public void setReviewedDate02(Date reviewedDate02) {
		this.reviewedDate02 = reviewedDate02;
	}

	public Date getReviewedDate03() {
		return reviewedDate03;
	}

	public void setReviewedDate03(Date reviewedDate03) {
		this.reviewedDate03 = reviewedDate03;
	}

	public String getReviewedTime01() {
		return reviewedTime01;
	}

	public void setReviewedTime01(String reviewedTime01) {
		this.reviewedTime01 = reviewedTime01;
	}

	public String getReviewedTime02() {
		return reviewedTime02;
	}

	public void setReviewedTime02(String reviewedTime02) {
		this.reviewedTime02 = reviewedTime02;
	}

	public String getReviewedTime03() {
		return reviewedTime03;
	}

	public void setReviewedTime03(String reviewedTime03) {
		this.reviewedTime03 = reviewedTime03;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public boolean isWrapLooselyKling() {
		return wrapLooselyKling;
	}

	public void setWrapLooselyKling(boolean wrapLooselyKling) {
		this.wrapLooselyKling = wrapLooselyKling;
	}

}

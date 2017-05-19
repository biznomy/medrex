package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm1")
public class PhysicianOrderForm1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1621439806420377493L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "flush")
	private int flush;
	@Column(name = "flushAdditionalAt")
	private String flushAdditionalAt;
	@Column(name = "flushAdditionalMl")
	private String flushAdditionalMl;
	@Column(name = "flushH20Ml")
	private String flushH20Ml;
	@Column(name = "stomaCare")
	private String stomaCare;
	@Column(name = "totalVolFluidsMl")
	private String totalVolFluidsMl;
	@Column(name = "totalProteinGrams")
	private String totalProteinGrams;
	@Column(name = "totalCaloriesCal")
	private String totalCaloriesCal;
	@Column(name = "additionalSupp")
	private String additionalSupp;
	@Column(name = "bolusVolFeedingFrequency")
	private String bolusVolFeedingFrequency;
	@Column(name = "bolusVolFeeding")
	private String bolusVolFeeding;
	@Column(name = "feedingAt")
	private String feedingAt;
	@Column(name = "feedingFrom02")
	private String feedingFrom02;
	@Column(name = "feedingFrom01")
	private String feedingFrom01;
	@Column(name = "methodAdmin")
	private int methodAdmin;
	@Column(name = "volOfFeedingsHrs")
	private String volOfFeedingsHrs;
	@Column(name = "volOfFeedingsMl")
	private String volOfFeedingsMl;
	@Column(name = "numberOfFeedings")
	private String numberOfFeedings;
	@Column(name = "methodRationale")
	private String methodRationale;
	@Column(name = "routeRationale")
	private String routeRationale;
	@Column(name = "adminSize")
	private String adminSize;
	@Column(name = "routeAdmin")
	private int routeAdmin;
	@Column(name = "formulaStrength")
	private String formulaStrength;
	@Column(name = "poSnacks")
	private int poSnacks;
	@Column(name = "npo")
	private int npo;
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

	public int getFlush() {
		return this.flush;
	}

	public void setFlush(int flush) {
		this.flush = flush;
	}

	public String getFlushAdditionalAt() {
		return this.flushAdditionalAt;
	}

	public void setFlushAdditionalAt(String flushAdditionalAt) {
		this.flushAdditionalAt = flushAdditionalAt;
	}

	public String getFlushAdditionalMl() {
		return this.flushAdditionalMl;
	}

	public void setFlushAdditionalMl(String flushAdditionalMl) {
		this.flushAdditionalMl = flushAdditionalMl;
	}

	public String getFlushH20Ml() {
		return this.flushH20Ml;
	}

	public void setFlushH20Ml(String flushH20Ml) {
		this.flushH20Ml = flushH20Ml;
	}

	public String getStomaCare() {
		return this.stomaCare;
	}

	public void setStomaCare(String stomaCare) {
		this.stomaCare = stomaCare;
	}

	public String getTotalVolFluidsMl() {
		return this.totalVolFluidsMl;
	}

	public void setTotalVolFluidsMl(String totalVolFluidsMl) {
		this.totalVolFluidsMl = totalVolFluidsMl;
	}

	public String getTotalProteinGrams() {
		return this.totalProteinGrams;
	}

	public void setTotalProteinGrams(String totalProteinGrams) {
		this.totalProteinGrams = totalProteinGrams;
	}

	public String getTotalCaloriesCal() {
		return this.totalCaloriesCal;
	}

	public void setTotalCaloriesCal(String totalCaloriesCal) {
		this.totalCaloriesCal = totalCaloriesCal;
	}

	public String getAdditionalSupp() {
		return this.additionalSupp;
	}

	public void setAdditionalSupp(String additionalSupp) {
		this.additionalSupp = additionalSupp;
	}

	public String getBolusVolFeedingFrequency() {
		return this.bolusVolFeedingFrequency;
	}

	public void setBolusVolFeedingFrequency(String bolusVolFeedingFrequency) {
		this.bolusVolFeedingFrequency = bolusVolFeedingFrequency;
	}

	public String getBolusVolFeeding() {
		return this.bolusVolFeeding;
	}

	public void setBolusVolFeeding(String bolusVolFeeding) {
		this.bolusVolFeeding = bolusVolFeeding;
	}

	public String getFeedingAt() {
		return this.feedingAt;
	}

	public void setFeedingAt(String feedingAt) {
		this.feedingAt = feedingAt;
	}

	public String getFeedingFrom02() {
		return this.feedingFrom02;
	}

	public void setFeedingFrom02(String feedingFrom02) {
		this.feedingFrom02 = feedingFrom02;
	}

	public String getFeedingFrom01() {
		return this.feedingFrom01;
	}

	public void setFeedingFrom01(String feedingFrom01) {
		this.feedingFrom01 = feedingFrom01;
	}

	public int getMethodAdmin() {
		return this.methodAdmin;
	}

	public void setMethodAdmin(int methodAdmin) {
		this.methodAdmin = methodAdmin;
	}

	public String getVolOfFeedingsHrs() {
		return this.volOfFeedingsHrs;
	}

	public void setVolOfFeedingsHrs(String volOfFeedingsHrs) {
		this.volOfFeedingsHrs = volOfFeedingsHrs;
	}

	public String getVolOfFeedingsMl() {
		return this.volOfFeedingsMl;
	}

	public void setVolOfFeedingsMl(String volOfFeedingsMl) {
		this.volOfFeedingsMl = volOfFeedingsMl;
	}

	public String getNumberOfFeedings() {
		return this.numberOfFeedings;
	}

	public void setNumberOfFeedings(String numberOfFeedings) {
		this.numberOfFeedings = numberOfFeedings;
	}

	public String getMethodRationale() {
		return this.methodRationale;
	}

	public void setMethodRationale(String methodRationale) {
		this.methodRationale = methodRationale;
	}

	public String getRouteRationale() {
		return this.routeRationale;
	}

	public void setRouteRationale(String routeRationale) {
		this.routeRationale = routeRationale;
	}

	public String getAdminSize() {
		return this.adminSize;
	}

	public void setAdminSize(String adminSize) {
		this.adminSize = adminSize;
	}

	public int getRouteAdmin() {
		return this.routeAdmin;
	}

	public void setRouteAdmin(int routeAdmin) {
		this.routeAdmin = routeAdmin;
	}

	public String getFormulaStrength() {
		return this.formulaStrength;
	}

	public void setFormulaStrength(String formulaStrength) {
		this.formulaStrength = formulaStrength;
	}

	public int getPoSnacks() {
		return this.poSnacks;
	}

	public void setPoSnacks(int poSnacks) {
		this.poSnacks = poSnacks;
	}

	public int getNpo() {
		return this.npo;
	}

	public void setNpo(int npo) {
		this.npo = npo;
	}

	public String getPharmacyConsultantSign() {
		return this.pharmacyConsultantSign;
	}

	public void setPharmacyConsultantSign(String pharmacyConsultantSign) {
		this.pharmacyConsultantSign = pharmacyConsultantSign;
	}

	public String getDoctorSignature() {
		return this.doctorSignature;
	}

	public void setDoctorSignature(String doctorSignature) {
		this.doctorSignature = doctorSignature;
	}

	public Date getMdSignDate() {
		return this.mdSignDate;
	}

	public void setMdSignDate(Date mdSignDate) {
		this.mdSignDate = mdSignDate;
	}

	public String getMdSignature() {
		return this.mdSignature;
	}

	public void setMdSignature(String mdSignature) {
		this.mdSignature = mdSignature;
	}

	public String getReviewedTime01() {
		return this.reviewedTime01;
	}

	public void setReviewedTime01(String reviewedTime01) {
		this.reviewedTime01 = reviewedTime01;
	}

	public Date getReviewedDate01() {
		return this.reviewedDate01;
	}

	public void setReviewedDate01(Date reviewedDate01) {
		this.reviewedDate01 = reviewedDate01;
	}

	public String getReviewedBy01() {
		return this.reviewedBy01;
	}

	public void setReviewedBy01(String reviewedBy01) {
		this.reviewedBy01 = reviewedBy01;
	}

	public String getReviewedTime02() {
		return this.reviewedTime02;
	}

	public void setReviewedTime02(String reviewedTime02) {
		this.reviewedTime02 = reviewedTime02;
	}

	public Date getReviewedDate02() {
		return this.reviewedDate02;
	}

	public void setReviewedDate02(Date reviewedDate02) {
		this.reviewedDate02 = reviewedDate02;
	}

	public String getReviewedBy02() {
		return this.reviewedBy02;
	}

	public void setReviewedBy02(String reviewedBy02) {
		this.reviewedBy02 = reviewedBy02;
	}

	public String getReviewedTime03() {
		return this.reviewedTime03;
	}

	public void setReviewedTime03(String reviewedTime03) {
		this.reviewedTime03 = reviewedTime03;
	}

	public Date getReviewedDate03() {
		return this.reviewedDate03;
	}

	public void setReviewedDate03(Date reviewedDate03) {
		this.reviewedDate03 = reviewedDate03;
	}

	public String getReviewedBy03() {
		return this.reviewedBy03;
	}

	public void setReviewedBy03(String reviewedBy03) {
		this.reviewedBy03 = reviewedBy03;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}

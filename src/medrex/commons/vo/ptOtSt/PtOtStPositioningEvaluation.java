package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PtOtStPositioningEvaluation")
public class PtOtStPositioningEvaluation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 575901256604875108L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "followCom")
	private int followCom;
	@Column(name = "recommendationImp")
	private String recommendationImp;
	@Column(name = "cognitionAphasia")
	private boolean cognitionAphasia;
	@Column(name = "cognitionDecreasedVision")
	private boolean cognitionDecreasedVision;
	@Column(name = "cognitionOtherField")
	private String cognitionOtherField;
	@Column(name = "cognitionOther")
	private boolean cognitionOther;
	@Column(name = "cognitionOrientedX123")
	private boolean cognitionOrientedX123;
	@Column(name = "cognitionAlert")
	private boolean cognitionAlert;
	@Column(name = "howPositioning")
	private String howPositioning;
	@Column(name = "otherAdaptive")
	private String otherAdaptive;
	@Column(name = "wcMobilityAdaptive")
	private String wcMobilityAdaptive;
	@Column(name = "transferAdaptive")
	private String transferAdaptive;
	@Column(name = "feedingAdaptive")
	private String feedingAdaptive;
	@Column(name = "otherDep")
	private String otherDep;
	@Column(name = "wcMobilityDep")
	private String wcMobilityDep;
	@Column(name = "transferDep")
	private String transferDep;
	@Column(name = "feedingDep")
	private String feedingDep;
	@Column(name = "otherMaxA")
	private String otherMaxA;
	@Column(name = "wcMobilityMaxA")
	private String wcMobilityMaxA;
	@Column(name = "transferMaxA")
	private String transferMaxA;
	@Column(name = "feedingMaxA")
	private String feedingMaxA;
	@Column(name = "otherModA")
	private String otherModA;
	@Column(name = "wcMobilityModA")
	private String wcMobilityModA;
	@Column(name = "transferModA")
	private String transferModA;
	@Column(name = "feedingModA")
	private String feedingModA;
	@Column(name = "otherMinA")
	private String otherMinA;
	@Column(name = "wcMobilityMinA")
	private String wcMobilityMinA;
	@Column(name = "transferMinA")
	private String transferMinA;
	@Column(name = "feedingMinA")
	private String feedingMinA;
	@Column(name = "otherCg")
	private String otherCg;
	@Column(name = "wcMobilityCg")
	private String wcMobilityCg;
	@Column(name = "transferCg")
	private String transferCg;
	@Column(name = "feedingCg")
	private String feedingCg;
	@Column(name = "otherVq")
	private String otherVq;
	@Column(name = "wcMobilityVq")
	private String wcMobilityVq;
	@Column(name = "transferVq")
	private String transferVq;
	@Column(name = "feedingVq")
	private String feedingVq;
	@Column(name = "otherI")
	private String otherI;
	@Column(name = "wcMobilityI")
	private String wcMobilityI;
	@Column(name = "transferI")
	private String transferI;
	@Column(name = "feedingI")
	private String feedingI;
	@Column(name = "otherField")
	private String otherField;
	@Column(name = "positionLes")
	private String positionLes;
	@Column(name = "positionUes")
	private String positionUes;
	@Column(name = "positionTrunk")
	private String positionTrunk;
	@Column(name = "positionHead")
	private String positionHead;
	@Column(name = "sittingBalanceDynamic")
	private String sittingBalanceDynamic;
	@Column(name = "sittingBalanceStatic")
	private String sittingBalanceStatic;
	@Column(name = "signatureTherapy")
	private String signatureTherapy;
	@Column(name = "safetyCircleRecentDates")
	private Date safetyCircleRecentDates;
	@Column(name = "safetyCircleHxOfFalls")
	private boolean safetyCircleHxOfFalls;
	@Column(name = "safetyCircleRiskForFalls")
	private boolean safetyCircleRiskForFalls;
	@Column(name = "safetyCirclePoor")
	private boolean safetyCirclePoor;
	@Column(name = "skinCondition")
	private int skinCondition;
	@Column(name = "safetyCircleGood")
	private boolean safetyCircleGood;
	@Column(name = "curPositiongPositDevices")
	private String curPositiongPositDevices;
	@Column(name = "curPositiongOther")
	private String curPositiongOther;
	@Column(name = "curPositiongRestraintSpecify")
	private String curPositiongRestraintSpecify;
	@Column(name = "curPositiongRestraint")
	private boolean curPositiongRestraint;
	@Column(name = "curPositiongBed")
	private boolean curPositiongBed;
	@Column(name = "curPositiongGerichair")
	private boolean curPositiongGerichair;
	@Column(name = "curPositiongWheelchair")
	private boolean curPositiongWheelchair;
	@Column(name = "initialAssessmentRecTherapyNaField")
	private String initialAssessmentRecTherapyNaField;
	@Column(name = "initialAssessmentRecTherapyNa")
	private boolean initialAssessmentRecTherapyNa;
	@Column(name = "initialAssessmentPrecautions")
	private String initialAssessmentPrecautions;
	@Column(name = "initialAssessmentDcPlan")
	private String initialAssessmentDcPlan;
	@Column(name = "initialAssessmentPmh")
	private String initialAssessmentPmh;
	@Column(name = "initialAssessmentPlof")
	private String initialAssessmentPlof;
	@Column(name = "reasonForReferral")
	private String reasonForReferral;
	@Column(name = "rehabPot")
	private int rehabPot;
	@Column(name = "initialAssessmentRefBy")
	private String initialAssessmentRefBy;
	@Column(name = "initialAssessmentAge")
	private String initialAssessmentAge;
	@Column(name = "certificationNa")
	private boolean certificationNa;
	@Column(name = "certificationThroughDate")
	private Date certificationThroughDate;
	@Column(name = "certificationFromDate")
	private Date certificationFromDate;
	@Column(name = "physicianNaOnFile")
	private boolean physicianNaOnFile;
	@Column(name = "physicianSign")
	private String physicianSign;
	@Column(name = "physicianDate")
	private Date physicianDate;
	@Column(name = "physicianName")
	private String physicianName;
	@Column(name = "planOfCare")
	private String planOfCare;
	@Column(name = "planOfTreatmentOutcome")
	private String planOfTreatmentOutcome;
	@Column(name = "longTermGoalWks")
	private String longTermGoalWks;
	@Column(name = "planOfTreatmentShort")
	private String planOfTreatmentShort;
	@Column(name = "shortTermGoalWks")
	private String shortTermGoalWks;
	@Column(name = "socDate")
	private Date socDate;
	@Column(name = "onsetDate")
	private Date onsetDate;
	@Column(name = "primaryDiagnosis")
	private String primaryDiagnosis;
	@Column(name = "treatmentDiagnosis")
	private String treatmentDiagnosis;
	@Column(name = "frequencyDuration")
	private String frequencyDuration;
	@Column(name = "hospitalizationNa")
	private boolean hospitalizationNa;
	@Column(name = "hospitalizationToDate")
	private Date hospitalizationToDate;
	@Column(name = "hospitalizationFromDate")
	private Date hospitalizationFromDate;
	@Column(name = "providerName")
	private String providerName;
	@Column(name = "hicn")
	private String hicn;
	@Column(name = "providerNo")
	private String providerNo;
	@Column(name = "positiongOtherField")
	private String positiongOtherField;
	@Column(name = "positiongOther")
	private boolean positiongOther;
	@Column(name = "positiongPartA")
	private boolean positiongPartA;
	@Column(name = "positiongPartB")
	private boolean positiongPartB;

	public int getFollowCom() {
		return this.followCom;
	}

	public void setFollowCom(int followCom) {
		this.followCom = followCom;
	}

	public String getRecommendationImp() {
		return this.recommendationImp;
	}

	public void setRecommendationImp(String recommendationImp) {
		this.recommendationImp = recommendationImp;
	}

	public boolean isCognitionAphasia() {
		return this.cognitionAphasia;
	}

	public void setCognitionAphasia(boolean cognitionAphasia) {
		this.cognitionAphasia = cognitionAphasia;
	}

	public boolean isCognitionDecreasedVision() {
		return this.cognitionDecreasedVision;
	}

	public void setCognitionDecreasedVision(boolean cognitionDecreasedVision) {
		this.cognitionDecreasedVision = cognitionDecreasedVision;
	}

	public String getCognitionOtherField() {
		return this.cognitionOtherField;
	}

	public void setCognitionOtherField(String cognitionOtherField) {
		this.cognitionOtherField = cognitionOtherField;
	}

	public boolean isCognitionOther() {
		return this.cognitionOther;
	}

	public void setCognitionOther(boolean cognitionOther) {
		this.cognitionOther = cognitionOther;
	}

	public boolean isCognitionOrientedX123() {
		return this.cognitionOrientedX123;
	}

	public void setCognitionOrientedX123(boolean cognitionOrientedX123) {
		this.cognitionOrientedX123 = cognitionOrientedX123;
	}

	public boolean isCognitionAlert() {
		return this.cognitionAlert;
	}

	public void setCognitionAlert(boolean cognitionAlert) {
		this.cognitionAlert = cognitionAlert;
	}

	public String getHowPositioning() {
		return this.howPositioning;
	}

	public void setHowPositioning(String howPositioning) {
		this.howPositioning = howPositioning;
	}

	public String getOtherAdaptive() {
		return this.otherAdaptive;
	}

	public void setOtherAdaptive(String otherAdaptive) {
		this.otherAdaptive = otherAdaptive;
	}

	public String getWcMobilityAdaptive() {
		return this.wcMobilityAdaptive;
	}

	public void setWcMobilityAdaptive(String wcMobilityAdaptive) {
		this.wcMobilityAdaptive = wcMobilityAdaptive;
	}

	public String getTransferAdaptive() {
		return this.transferAdaptive;
	}

	public void setTransferAdaptive(String transferAdaptive) {
		this.transferAdaptive = transferAdaptive;
	}

	public String getFeedingAdaptive() {
		return this.feedingAdaptive;
	}

	public void setFeedingAdaptive(String feedingAdaptive) {
		this.feedingAdaptive = feedingAdaptive;
	}

	public String getOtherDep() {
		return this.otherDep;
	}

	public void setOtherDep(String otherDep) {
		this.otherDep = otherDep;
	}

	public String getWcMobilityDep() {
		return this.wcMobilityDep;
	}

	public void setWcMobilityDep(String wcMobilityDep) {
		this.wcMobilityDep = wcMobilityDep;
	}

	public String getTransferDep() {
		return this.transferDep;
	}

	public void setTransferDep(String transferDep) {
		this.transferDep = transferDep;
	}

	public String getFeedingDep() {
		return this.feedingDep;
	}

	public void setFeedingDep(String feedingDep) {
		this.feedingDep = feedingDep;
	}

	public String getOtherMaxA() {
		return this.otherMaxA;
	}

	public void setOtherMaxA(String otherMaxA) {
		this.otherMaxA = otherMaxA;
	}

	public String getWcMobilityMaxA() {
		return this.wcMobilityMaxA;
	}

	public void setWcMobilityMaxA(String wcMobilityMaxA) {
		this.wcMobilityMaxA = wcMobilityMaxA;
	}

	public String getTransferMaxA() {
		return this.transferMaxA;
	}

	public void setTransferMaxA(String transferMaxA) {
		this.transferMaxA = transferMaxA;
	}

	public String getFeedingMaxA() {
		return this.feedingMaxA;
	}

	public void setFeedingMaxA(String feedingMaxA) {
		this.feedingMaxA = feedingMaxA;
	}

	public String getOtherModA() {
		return this.otherModA;
	}

	public void setOtherModA(String otherModA) {
		this.otherModA = otherModA;
	}

	public String getWcMobilityModA() {
		return this.wcMobilityModA;
	}

	public void setWcMobilityModA(String wcMobilityModA) {
		this.wcMobilityModA = wcMobilityModA;
	}

	public String getTransferModA() {
		return this.transferModA;
	}

	public void setTransferModA(String transferModA) {
		this.transferModA = transferModA;
	}

	public String getFeedingModA() {
		return this.feedingModA;
	}

	public void setFeedingModA(String feedingModA) {
		this.feedingModA = feedingModA;
	}

	public String getOtherMinA() {
		return this.otherMinA;
	}

	public void setOtherMinA(String otherMinA) {
		this.otherMinA = otherMinA;
	}

	public String getWcMobilityMinA() {
		return this.wcMobilityMinA;
	}

	public void setWcMobilityMinA(String wcMobilityMinA) {
		this.wcMobilityMinA = wcMobilityMinA;
	}

	public String getTransferMinA() {
		return this.transferMinA;
	}

	public void setTransferMinA(String transferMinA) {
		this.transferMinA = transferMinA;
	}

	public String getFeedingMinA() {
		return this.feedingMinA;
	}

	public void setFeedingMinA(String feedingMinA) {
		this.feedingMinA = feedingMinA;
	}

	public String getOtherCg() {
		return this.otherCg;
	}

	public void setOtherCg(String otherCg) {
		this.otherCg = otherCg;
	}

	public String getWcMobilityCg() {
		return this.wcMobilityCg;
	}

	public void setWcMobilityCg(String wcMobilityCg) {
		this.wcMobilityCg = wcMobilityCg;
	}

	public String getTransferCg() {
		return this.transferCg;
	}

	public void setTransferCg(String transferCg) {
		this.transferCg = transferCg;
	}

	public String getFeedingCg() {
		return this.feedingCg;
	}

	public void setFeedingCg(String feedingCg) {
		this.feedingCg = feedingCg;
	}

	public String getOtherVq() {
		return this.otherVq;
	}

	public void setOtherVq(String otherVq) {
		this.otherVq = otherVq;
	}

	public String getWcMobilityVq() {
		return this.wcMobilityVq;
	}

	public void setWcMobilityVq(String wcMobilityVq) {
		this.wcMobilityVq = wcMobilityVq;
	}

	public String getTransferVq() {
		return this.transferVq;
	}

	public void setTransferVq(String transferVq) {
		this.transferVq = transferVq;
	}

	public String getFeedingVq() {
		return this.feedingVq;
	}

	public void setFeedingVq(String feedingVq) {
		this.feedingVq = feedingVq;
	}

	public String getOtherI() {
		return this.otherI;
	}

	public void setOtherI(String otherI) {
		this.otherI = otherI;
	}

	public String getWcMobilityI() {
		return this.wcMobilityI;
	}

	public void setWcMobilityI(String wcMobilityI) {
		this.wcMobilityI = wcMobilityI;
	}

	public String getTransferI() {
		return this.transferI;
	}

	public void setTransferI(String transferI) {
		this.transferI = transferI;
	}

	public String getFeedingI() {
		return this.feedingI;
	}

	public void setFeedingI(String feedingI) {
		this.feedingI = feedingI;
	}

	public String getOtherField() {
		return this.otherField;
	}

	public void setOtherField(String otherField) {
		this.otherField = otherField;
	}

	public String getPositionLes() {
		return this.positionLes;
	}

	public void setPositionLes(String positionLes) {
		this.positionLes = positionLes;
	}

	public String getPositionUes() {
		return this.positionUes;
	}

	public void setPositionUes(String positionUes) {
		this.positionUes = positionUes;
	}

	public String getPositionTrunk() {
		return this.positionTrunk;
	}

	public void setPositionTrunk(String positionTrunk) {
		this.positionTrunk = positionTrunk;
	}

	public String getPositionHead() {
		return this.positionHead;
	}

	public void setPositionHead(String positionHead) {
		this.positionHead = positionHead;
	}

	public String getSittingBalanceDynamic() {
		return this.sittingBalanceDynamic;
	}

	public void setSittingBalanceDynamic(String sittingBalanceDynamic) {
		this.sittingBalanceDynamic = sittingBalanceDynamic;
	}

	public String getSittingBalanceStatic() {
		return this.sittingBalanceStatic;
	}

	public void setSittingBalanceStatic(String sittingBalanceStatic) {
		this.sittingBalanceStatic = sittingBalanceStatic;
	}

	public String getSignatureTherapy() {
		return this.signatureTherapy;
	}

	public void setSignatureTherapy(String signatureTherapy) {
		this.signatureTherapy = signatureTherapy;
	}

	public Date getSafetyCircleRecentDates() {
		return this.safetyCircleRecentDates;
	}

	public void setSafetyCircleRecentDates(Date safetyCircleRecentDates) {
		this.safetyCircleRecentDates = safetyCircleRecentDates;
	}

	public boolean isSafetyCircleHxOfFalls() {
		return this.safetyCircleHxOfFalls;
	}

	public void setSafetyCircleHxOfFalls(boolean safetyCircleHxOfFalls) {
		this.safetyCircleHxOfFalls = safetyCircleHxOfFalls;
	}

	public boolean isSafetyCircleRiskForFalls() {
		return this.safetyCircleRiskForFalls;
	}

	public void setSafetyCircleRiskForFalls(boolean safetyCircleRiskForFalls) {
		this.safetyCircleRiskForFalls = safetyCircleRiskForFalls;
	}

	public boolean isSafetyCirclePoor() {
		return this.safetyCirclePoor;
	}

	public void setSafetyCirclePoor(boolean safetyCirclePoor) {
		this.safetyCirclePoor = safetyCirclePoor;
	}

	public int getSkinCondition() {
		return this.skinCondition;
	}

	public void setSkinCondition(int skinCondition) {
		this.skinCondition = skinCondition;
	}

	public boolean isSafetyCircleGood() {
		return this.safetyCircleGood;
	}

	public void setSafetyCircleGood(boolean safetyCircleGood) {
		this.safetyCircleGood = safetyCircleGood;
	}

	public String getCurPositiongPositDevices() {
		return this.curPositiongPositDevices;
	}

	public void setCurPositiongPositDevices(String curPositiongPositDevices) {
		this.curPositiongPositDevices = curPositiongPositDevices;
	}

	public String getCurPositiongOther() {
		return this.curPositiongOther;
	}

	public void setCurPositiongOther(String curPositiongOther) {
		this.curPositiongOther = curPositiongOther;
	}

	public String getCurPositiongRestraintSpecify() {
		return this.curPositiongRestraintSpecify;
	}

	public void setCurPositiongRestraintSpecify(
			String curPositiongRestraintSpecify) {
		this.curPositiongRestraintSpecify = curPositiongRestraintSpecify;
	}

	public boolean isCurPositiongRestraint() {
		return this.curPositiongRestraint;
	}

	public void setCurPositiongRestraint(boolean curPositiongRestraint) {
		this.curPositiongRestraint = curPositiongRestraint;
	}

	public boolean isCurPositiongBed() {
		return this.curPositiongBed;
	}

	public void setCurPositiongBed(boolean curPositiongBed) {
		this.curPositiongBed = curPositiongBed;
	}

	public boolean isCurPositiongGerichair() {
		return this.curPositiongGerichair;
	}

	public void setCurPositiongGerichair(boolean curPositiongGerichair) {
		this.curPositiongGerichair = curPositiongGerichair;
	}

	public boolean isCurPositiongWheelchair() {
		return this.curPositiongWheelchair;
	}

	public void setCurPositiongWheelchair(boolean curPositiongWheelchair) {
		this.curPositiongWheelchair = curPositiongWheelchair;
	}

	public String getInitialAssessmentRecTherapyNaField() {
		return this.initialAssessmentRecTherapyNaField;
	}

	public void setInitialAssessmentRecTherapyNaField(
			String initialAssessmentRecTherapyNaField) {
		this.initialAssessmentRecTherapyNaField = initialAssessmentRecTherapyNaField;
	}

	public boolean isInitialAssessmentRecTherapyNa() {
		return this.initialAssessmentRecTherapyNa;
	}

	public void setInitialAssessmentRecTherapyNa(
			boolean initialAssessmentRecTherapyNa) {
		this.initialAssessmentRecTherapyNa = initialAssessmentRecTherapyNa;
	}

	public String getInitialAssessmentPrecautions() {
		return this.initialAssessmentPrecautions;
	}

	public void setInitialAssessmentPrecautions(
			String initialAssessmentPrecautions) {
		this.initialAssessmentPrecautions = initialAssessmentPrecautions;
	}

	public String getInitialAssessmentDcPlan() {
		return this.initialAssessmentDcPlan;
	}

	public void setInitialAssessmentDcPlan(String initialAssessmentDcPlan) {
		this.initialAssessmentDcPlan = initialAssessmentDcPlan;
	}

	public String getInitialAssessmentPmh() {
		return this.initialAssessmentPmh;
	}

	public void setInitialAssessmentPmh(String initialAssessmentPmh) {
		this.initialAssessmentPmh = initialAssessmentPmh;
	}

	public String getInitialAssessmentPlof() {
		return this.initialAssessmentPlof;
	}

	public void setInitialAssessmentPlof(String initialAssessmentPlof) {
		this.initialAssessmentPlof = initialAssessmentPlof;
	}

	public String getReasonForReferral() {
		return this.reasonForReferral;
	}

	public void setReasonForReferral(String reasonForReferral) {
		this.reasonForReferral = reasonForReferral;
	}

	public int getRehabPot() {
		return this.rehabPot;
	}

	public void setRehabPot(int rehabPot) {
		this.rehabPot = rehabPot;
	}

	public String getInitialAssessmentRefBy() {
		return this.initialAssessmentRefBy;
	}

	public void setInitialAssessmentRefBy(String initialAssessmentRefBy) {
		this.initialAssessmentRefBy = initialAssessmentRefBy;
	}

	public String getInitialAssessmentAge() {
		return this.initialAssessmentAge;
	}

	public void setInitialAssessmentAge(String initialAssessmentAge) {
		this.initialAssessmentAge = initialAssessmentAge;
	}

	public boolean isCertificationNa() {
		return this.certificationNa;
	}

	public void setCertificationNa(boolean certificationNa) {
		this.certificationNa = certificationNa;
	}

	public Date getCertificationThroughDate() {
		return this.certificationThroughDate;
	}

	public void setCertificationThroughDate(Date certificationThroughDate) {
		this.certificationThroughDate = certificationThroughDate;
	}

	public Date getCertificationFromDate() {
		return this.certificationFromDate;
	}

	public void setCertificationFromDate(Date certificationFromDate) {
		this.certificationFromDate = certificationFromDate;
	}

	public boolean isPhysicianNaOnFile() {
		return this.physicianNaOnFile;
	}

	public void setPhysicianNaOnFile(boolean physicianNaOnFile) {
		this.physicianNaOnFile = physicianNaOnFile;
	}

	public String getPhysicianSign() {
		return this.physicianSign;
	}

	public void setPhysicianSign(String physicianSign) {
		this.physicianSign = physicianSign;
	}

	public Date getPhysicianDate() {
		return this.physicianDate;
	}

	public void setPhysicianDate(Date physicianDate) {
		this.physicianDate = physicianDate;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getPlanOfCare() {
		return this.planOfCare;
	}

	public void setPlanOfCare(String planOfCare) {
		this.planOfCare = planOfCare;
	}

	public String getPlanOfTreatmentOutcome() {
		return this.planOfTreatmentOutcome;
	}

	public void setPlanOfTreatmentOutcome(String planOfTreatmentOutcome) {
		this.planOfTreatmentOutcome = planOfTreatmentOutcome;
	}

	public String getLongTermGoalWks() {
		return this.longTermGoalWks;
	}

	public void setLongTermGoalWks(String longTermGoalWks) {
		this.longTermGoalWks = longTermGoalWks;
	}

	public String getPlanOfTreatmentShort() {
		return this.planOfTreatmentShort;
	}

	public void setPlanOfTreatmentShort(String planOfTreatmentShort) {
		this.planOfTreatmentShort = planOfTreatmentShort;
	}

	public String getShortTermGoalWks() {
		return this.shortTermGoalWks;
	}

	public void setShortTermGoalWks(String shortTermGoalWks) {
		this.shortTermGoalWks = shortTermGoalWks;
	}

	public Date getSocDate() {
		return this.socDate;
	}

	public void setSocDate(Date socDate) {
		this.socDate = socDate;
	}

	public Date getOnsetDate() {
		return this.onsetDate;
	}

	public void setOnsetDate(Date onsetDate) {
		this.onsetDate = onsetDate;
	}

	public String getPrimaryDiagnosis() {
		return this.primaryDiagnosis;
	}

	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		this.primaryDiagnosis = primaryDiagnosis;
	}

	public String getTreatmentDiagnosis() {
		return this.treatmentDiagnosis;
	}

	public void setTreatmentDiagnosis(String treatmentDiagnosis) {
		this.treatmentDiagnosis = treatmentDiagnosis;
	}

	public String getFrequencyDuration() {
		return this.frequencyDuration;
	}

	public void setFrequencyDuration(String frequencyDuration) {
		this.frequencyDuration = frequencyDuration;
	}

	public boolean isHospitalizationNa() {
		return this.hospitalizationNa;
	}

	public void setHospitalizationNa(boolean hospitalizationNa) {
		this.hospitalizationNa = hospitalizationNa;
	}

	public Date getHospitalizationToDate() {
		return this.hospitalizationToDate;
	}

	public void setHospitalizationToDate(Date hospitalizationToDate) {
		this.hospitalizationToDate = hospitalizationToDate;
	}

	public Date getHospitalizationFromDate() {
		return this.hospitalizationFromDate;
	}

	public void setHospitalizationFromDate(Date hospitalizationFromDate) {
		this.hospitalizationFromDate = hospitalizationFromDate;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getHicn() {
		return this.hicn;
	}

	public void setHicn(String hicn) {
		this.hicn = hicn;
	}

	public String getProviderNo() {
		return this.providerNo;
	}

	public void setProviderNo(String providerNo) {
		this.providerNo = providerNo;
	}

	public String getPositiongOtherField() {
		return this.positiongOtherField;
	}

	public void setPositiongOtherField(String positiongOtherField) {
		this.positiongOtherField = positiongOtherField;
	}

	public boolean isPositiongOther() {
		return this.positiongOther;
	}

	public void setPositiongOther(boolean positiongOther) {
		this.positiongOther = positiongOther;
	}

	public boolean isPositiongPartA() {
		return this.positiongPartA;
	}

	public void setPositiongPartA(boolean positiongPartA) {
		this.positiongPartA = positiongPartA;
	}

	public boolean isPositiongPartB() {
		return this.positiongPartB;
	}

	public void setPositiongPartB(boolean positiongPartB) {
		this.positiongPartB = positiongPartB;
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

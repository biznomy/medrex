package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.richTextField.RichTextField;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "PtOtStOccupationalTherapy")
public class PtOtStOccupationalTherapy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5552708901155076128L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "followsCom")
	private int followsCom;
	@Column(name = "patientParticipatedNaField")
	private String patientParticipatedNaField;
	@Column(name = "patientParticipatedNa")
	private boolean patientParticipatedNa;
	@Column(name = "patientParticipatedIn")
	private boolean patientParticipatedIn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "recommendationImp")
	private Notes recommendationImp;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "vitalsPulseOx")
	private RichTextField vitalsPulseOx;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "vitalsBp")
	private RichTextField vitalsBp;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "vitalsHr")
	private RichTextField vitalsHr;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "safetyAwareness")
	private RichTextField safetyAwareness;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "balanceStandDyn")
	private RichTextField balanceStandDyn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "balanceStandStat")
	private RichTextField balanceStandStat;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "balanceSitDyn")
	private RichTextField balanceSitDyn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "balanceSitStat")
	private RichTextField balanceSitStat;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "transferCurEquip")
	private Notes transferCurEquip;
	@Column(name = "transferDep")
	private boolean transferDep;
	@Column(name = "transferMaxA")
	private boolean transferMaxA;
	@Column(name = "transferModA")
	private boolean transferModA;
	@Column(name = "transferMinA")
	private boolean transferMinA;
	@Column(name = "transferCg")
	private boolean transferCg;
	@Column(name = "transferVq")
	private boolean transferVq;
	@Column(name = "transferI")
	private boolean transferI;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "bedMobCurEquip")
	private Notes bedMobCurEquip;

	@Column(name = "bedMobDep")
	private boolean bedMobDep;
	@Column(name = "bedMobMaxA")
	private boolean bedMobMaxA;
	@Column(name = "bedMobModA")
	private boolean bedMobModA;
	@Column(name = "bedMobMinA")
	private boolean bedMobMinA;
	@Column(name = "bedMobCg")
	private boolean bedMobCg;
	@Column(name = "bedMobVq")
	private boolean bedMobVq;
	@Column(name = "bedMobI")
	private boolean bedMobI;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "wcMobilityCurEquip")
	private Notes wcMobilityCurEquip;

	@Column(name = "wcMobilityDep")
	private boolean wcMobilityDep;
	@Column(name = "wcMobilityMaxA")
	private boolean wcMobilityMaxA;
	@Column(name = "wcMobilityModA")
	private boolean wcMobilityModA;
	@Column(name = "wcMobilityMinA")
	private boolean wcMobilityMinA;
	@Column(name = "wcMobilityCg")
	private boolean wcMobilityCg;
	@Column(name = "wcMobilityVq")
	private boolean wcMobilityVq;
	@Column(name = "wcMobilityI")
	private boolean wcMobilityI;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "toiletingCurEquip")
	private Notes toiletingCurEquip;

	@Column(name = "toiletingDep")
	private boolean toiletingDep;
	@Column(name = "toiletingMaxA")
	private boolean toiletingMaxA;
	@Column(name = "toiletingModA")
	private boolean toiletingModA;
	@Column(name = "toiletingMinA")
	private boolean toiletingMinA;
	@Column(name = "toiletingCg")
	private boolean toiletingCg;
	@Column(name = "toiletingVq")
	private boolean toiletingVq;
	@Column(name = "toiletingI")
	private boolean toiletingI;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "hygGroomCurEquip")
	private Notes hygGroomCurEquip;

	@Column(name = "hygGroomDep")
	private boolean hygGroomDep;
	@Column(name = "hygGroomMaxA")
	private boolean hygGroomMaxA;
	@Column(name = "hygGroomModA")
	private boolean hygGroomModA;
	@Column(name = "hygGroomMinA")
	private boolean hygGroomMinA;
	@Column(name = "hygGroomCg")
	private boolean hygGroomCg;
	@Column(name = "hygGroomVq")
	private boolean hygGroomVq;
	@Column(name = "hygGroomI")
	private boolean hygGroomI;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "leDressCurEquip")
	private Notes leDressCurEquip;

	@Column(name = "leDressDep")
	private boolean leDressDep;
	@Column(name = "leDressMaxA")
	private boolean leDressMaxA;
	@Column(name = "leDressModA")
	private boolean leDressModA;
	@Column(name = "leDressMinA")
	private boolean leDressMinA;
	@Column(name = "leDressCg")
	private boolean leDressCg;
	@Column(name = "leDressVq")
	private boolean leDressVq;
	@Column(name = "leDressI")
	private boolean leDressI;
	@Column(name = "initialAssessmentEvalLe")
	private String initialAssessmentEvalLe;
	@Column(name = "initialAssessmentEvalHandFxnL")
	private String initialAssessmentEvalHandFxnL;
	@Column(name = "initialAssessmentEvalHandFxnR")
	private String initialAssessmentEvalHandFxnR;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentEvalRomL")
	private RichTextField initialAssessmentEvalRomL;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentEvalRomR")
	private RichTextField initialAssessmentEvalRomR;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentEvalStrengthL")
	private RichTextField initialAssessmentEvalStrengthL;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentEvalStrengthR")
	private RichTextField initialAssessmentEvalStrengthR;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentLivesWith")
	private RichTextField initialAssessmentLivesWith;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentHomeMgmt")
	private RichTextField initialAssessmentHomeMgmt;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPrecausions")
	private RichTextField initialAssessmentPrecausions;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentDcPlanGoal")
	private RichTextField initialAssessmentDcPlanGoal;

	@Column(name = "planOfCareEquipOtherField")
	private String planOfCareEquipOtherField;
	@Column(name = "planOfCarePainMod")
	private String planOfCarePainMod;
	@Column(name = "occHmo")
	private boolean occHmo;
	@Column(name = "cognitionAphasia")
	private boolean cognitionAphasia;
	@Column(name = "cognitionDecreasedVision")
	private boolean cognitionDecreasedVision;
	@Column(name = "cognitionOrientedX123")
	private String cognitionOrientedX123;
	@Column(name = "cognitionAlert")
	private boolean cognitionAlert;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "curPositioning")
	private RichTextField curPositioning;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "ueDressCurEquip")
	private Notes ueDressCurEquip;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "eatingCurEquip")
	private Notes eatingCurEquip;

	@Column(name = "ueDressDep")
	private boolean ueDressDep;
	@Column(name = "eatingDep")
	private boolean eatingDep;
	@Column(name = "ueDressMaxA")
	private boolean ueDressMaxA;
	@Column(name = "eatingMaxA")
	private boolean eatingMaxA;
	@Column(name = "ueDressModA")
	private boolean ueDressModA;
	@Column(name = "eatingModA")
	private boolean eatingModA;
	@Column(name = "ueDressMinA")
	private boolean ueDressMinA;
	@Column(name = "eatingMinA")
	private boolean eatingMinA;
	@Column(name = "ueDressCg")
	private boolean ueDressCg;
	@Column(name = "eatingCg")
	private boolean eatingCg;
	@Column(name = "ueDressVq")
	private boolean ueDressVq;
	@Column(name = "eatingVq")
	private boolean eatingVq;
	@Column(name = "ueDressI")
	private boolean ueDressI;
	@Column(name = "eatingI")
	private boolean eatingI;
	@Column(name = "signatureTherapy")
	private String signatureTherapy;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentRecentTherapyField")
	private RichTextField initialAssessmentRecentTherapyField;

	@Column(name = "initialAssessmentRecentTherapyNa")
	private boolean initialAssessmentRecentTherapyNa;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentAssistance")
	private RichTextField initialAssessmentAssistance;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentLivingType")
	private RichTextField initialAssessmentLivingType;

	@Column(name = "initialAssessmentPmh")
	private String initialAssessmentPmh;
	@Column(name = "initialAssessmentPlof")
	private String initialAssessmentPlof;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "reasonForReferral")
	private Notes reasonForReferral;

	@Column(name = "rehabPot")
	private int rehabPot;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentRefBy")
	private RichTextField initialAssessmentRefBy;

	@Column(name = "initialAssessmentAge")
	private String initialAssessmentAge;
	@Column(name = "certificationNa")
	private boolean certificationNa;
	@Column(name = "certificationThroughDate")
	private Date certificationThroughDate;
	@Column(name = "certificationFromDate")
	private Date certificationFromDate;
	@Column(name = "physicianSignature")
	private String physicianSignature;
	@Column(name = "certifyDate")
	private Date certifyDate;
	@Column(name = "physicianName")
	private String physicianName;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentOutcome")
	private Notes planOfTreatmentOutcome;

	@Column(name = "longTermGoalsWks")
	private String longTermGoalsWks;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentGoals")
	private Notes planOfTreatmentGoals;

	@Column(name = "shortTermGoalsWks")
	private String shortTermGoalsWks;
	@Column(name = "socDate")
	private Date socDate;
	@Column(name = "onsetDate")
	private Date onsetDate;
	@Column(name = "primaryDiagnosis")
	private String primaryDiagnosis;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "treatmentDiagnosis")
	private RichTextField treatmentDiagnosis;

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
	@Column(name = "npiNo")
	private String npiNo;
	@Column(name = "occOtherField")
	private String occOtherField;
	@Column(name = "occOther")
	private boolean occOther;
	@Column(name = "occPartA")
	private boolean occPartA;
	@Column(name = "occPartB")
	private boolean occPartB;
	@Column(name = "therapyexc")
	private boolean therapyexc;
	@Column(name = "neuroMuscular")
	private boolean neuroMuscular;
	@Column(name = "bedMobility")
	private boolean bedMobility;
	@Column(name = "therapyActivities")
	private boolean therapyActivities;
	@Column(name = "transferTrain")
	private boolean transferTrain;
	@Column(name = "cognitiveSkills")
	private boolean cognitiveSkills;
	@Column(name = "adlEating")
	private boolean adlEating;
	@Column(name = "ubLbDressing")
	private boolean ubLbDressing;
	@Column(name = "hygieneGroom")
	private boolean hygieneGroom;
	@Column(name = "toileting")
	private boolean toileting;
	@Column(name = "message")
	private boolean message;

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

	public int getFollowsCom() {
		return followsCom;
	}

	public void setFollowsCom(int followsCom) {
		this.followsCom = followsCom;
	}

	public String getPatientParticipatedNaField() {
		return patientParticipatedNaField;
	}

	public void setPatientParticipatedNaField(String patientParticipatedNaField) {
		this.patientParticipatedNaField = patientParticipatedNaField;
	}

	public boolean isPatientParticipatedNa() {
		return patientParticipatedNa;
	}

	public void setPatientParticipatedNa(boolean patientParticipatedNa) {
		this.patientParticipatedNa = patientParticipatedNa;
	}

	public boolean isPatientParticipatedIn() {
		return patientParticipatedIn;
	}

	public void setPatientParticipatedIn(boolean patientParticipatedIn) {
		this.patientParticipatedIn = patientParticipatedIn;
	}

	public Notes getRecommendationImp() {
		return recommendationImp;
	}

	public void setRecommendationImp(Notes recommendationImp) {
		this.recommendationImp = recommendationImp;
	}

	public RichTextField getVitalsPulseOx() {
		return vitalsPulseOx;
	}

	public void setVitalsPulseOx(RichTextField vitalsPulseOx) {
		this.vitalsPulseOx = vitalsPulseOx;
	}

	public RichTextField getVitalsBp() {
		return vitalsBp;
	}

	public void setVitalsBp(RichTextField vitalsBp) {
		this.vitalsBp = vitalsBp;
	}

	public RichTextField getVitalsHr() {
		return vitalsHr;
	}

	public void setVitalsHr(RichTextField vitalsHr) {
		this.vitalsHr = vitalsHr;
	}

	public RichTextField getSafetyAwareness() {
		return safetyAwareness;
	}

	public void setSafetyAwareness(RichTextField safetyAwareness) {
		this.safetyAwareness = safetyAwareness;
	}

	public RichTextField getBalanceStandDyn() {
		return balanceStandDyn;
	}

	public void setBalanceStandDyn(RichTextField balanceStandDyn) {
		this.balanceStandDyn = balanceStandDyn;
	}

	public RichTextField getBalanceStandStat() {
		return balanceStandStat;
	}

	public void setBalanceStandStat(RichTextField balanceStandStat) {
		this.balanceStandStat = balanceStandStat;
	}

	public RichTextField getBalanceSitDyn() {
		return balanceSitDyn;
	}

	public void setBalanceSitDyn(RichTextField balanceSitDyn) {
		this.balanceSitDyn = balanceSitDyn;
	}

	public RichTextField getBalanceSitStat() {
		return balanceSitStat;
	}

	public void setBalanceSitStat(RichTextField balanceSitStat) {
		this.balanceSitStat = balanceSitStat;
	}

	public Notes getTransferCurEquip() {
		return transferCurEquip;
	}

	public void setTransferCurEquip(Notes transferCurEquip) {
		this.transferCurEquip = transferCurEquip;
	}

	public boolean isTransferDep() {
		return transferDep;
	}

	public void setTransferDep(boolean transferDep) {
		this.transferDep = transferDep;
	}

	public boolean isTransferMaxA() {
		return transferMaxA;
	}

	public void setTransferMaxA(boolean transferMaxA) {
		this.transferMaxA = transferMaxA;
	}

	public boolean isTransferModA() {
		return transferModA;
	}

	public void setTransferModA(boolean transferModA) {
		this.transferModA = transferModA;
	}

	public boolean isTransferMinA() {
		return transferMinA;
	}

	public void setTransferMinA(boolean transferMinA) {
		this.transferMinA = transferMinA;
	}

	public boolean isTransferCg() {
		return transferCg;
	}

	public void setTransferCg(boolean transferCg) {
		this.transferCg = transferCg;
	}

	public boolean isTransferVq() {
		return transferVq;
	}

	public void setTransferVq(boolean transferVq) {
		this.transferVq = transferVq;
	}

	public boolean isTransferI() {
		return transferI;
	}

	public void setTransferI(boolean transferI) {
		this.transferI = transferI;
	}

	public Notes getBedMobCurEquip() {
		return bedMobCurEquip;
	}

	public void setBedMobCurEquip(Notes bedMobCurEquip) {
		this.bedMobCurEquip = bedMobCurEquip;
	}

	public boolean isBedMobDep() {
		return bedMobDep;
	}

	public void setBedMobDep(boolean bedMobDep) {
		this.bedMobDep = bedMobDep;
	}

	public boolean isBedMobMaxA() {
		return bedMobMaxA;
	}

	public void setBedMobMaxA(boolean bedMobMaxA) {
		this.bedMobMaxA = bedMobMaxA;
	}

	public boolean isBedMobModA() {
		return bedMobModA;
	}

	public void setBedMobModA(boolean bedMobModA) {
		this.bedMobModA = bedMobModA;
	}

	public boolean isBedMobMinA() {
		return bedMobMinA;
	}

	public void setBedMobMinA(boolean bedMobMinA) {
		this.bedMobMinA = bedMobMinA;
	}

	public boolean isBedMobCg() {
		return bedMobCg;
	}

	public void setBedMobCg(boolean bedMobCg) {
		this.bedMobCg = bedMobCg;
	}

	public boolean isBedMobVq() {
		return bedMobVq;
	}

	public void setBedMobVq(boolean bedMobVq) {
		this.bedMobVq = bedMobVq;
	}

	public boolean isBedMobI() {
		return bedMobI;
	}

	public void setBedMobI(boolean bedMobI) {
		this.bedMobI = bedMobI;
	}

	public Notes getWcMobilityCurEquip() {
		return wcMobilityCurEquip;
	}

	public void setWcMobilityCurEquip(Notes wcMobilityCurEquip) {
		this.wcMobilityCurEquip = wcMobilityCurEquip;
	}

	public boolean isWcMobilityDep() {
		return wcMobilityDep;
	}

	public void setWcMobilityDep(boolean wcMobilityDep) {
		this.wcMobilityDep = wcMobilityDep;
	}

	public boolean isWcMobilityMaxA() {
		return wcMobilityMaxA;
	}

	public void setWcMobilityMaxA(boolean wcMobilityMaxA) {
		this.wcMobilityMaxA = wcMobilityMaxA;
	}

	public boolean isWcMobilityModA() {
		return wcMobilityModA;
	}

	public void setWcMobilityModA(boolean wcMobilityModA) {
		this.wcMobilityModA = wcMobilityModA;
	}

	public boolean isWcMobilityMinA() {
		return wcMobilityMinA;
	}

	public void setWcMobilityMinA(boolean wcMobilityMinA) {
		this.wcMobilityMinA = wcMobilityMinA;
	}

	public boolean isWcMobilityCg() {
		return wcMobilityCg;
	}

	public void setWcMobilityCg(boolean wcMobilityCg) {
		this.wcMobilityCg = wcMobilityCg;
	}

	public boolean isWcMobilityVq() {
		return wcMobilityVq;
	}

	public void setWcMobilityVq(boolean wcMobilityVq) {
		this.wcMobilityVq = wcMobilityVq;
	}

	public boolean isWcMobilityI() {
		return wcMobilityI;
	}

	public void setWcMobilityI(boolean wcMobilityI) {
		this.wcMobilityI = wcMobilityI;
	}

	public Notes getToiletingCurEquip() {
		return toiletingCurEquip;
	}

	public void setToiletingCurEquip(Notes toiletingCurEquip) {
		this.toiletingCurEquip = toiletingCurEquip;
	}

	public boolean isToiletingDep() {
		return toiletingDep;
	}

	public void setToiletingDep(boolean toiletingDep) {
		this.toiletingDep = toiletingDep;
	}

	public boolean isToiletingMaxA() {
		return toiletingMaxA;
	}

	public void setToiletingMaxA(boolean toiletingMaxA) {
		this.toiletingMaxA = toiletingMaxA;
	}

	public boolean isToiletingModA() {
		return toiletingModA;
	}

	public void setToiletingModA(boolean toiletingModA) {
		this.toiletingModA = toiletingModA;
	}

	public boolean isToiletingMinA() {
		return toiletingMinA;
	}

	public void setToiletingMinA(boolean toiletingMinA) {
		this.toiletingMinA = toiletingMinA;
	}

	public boolean isToiletingCg() {
		return toiletingCg;
	}

	public void setToiletingCg(boolean toiletingCg) {
		this.toiletingCg = toiletingCg;
	}

	public boolean isToiletingVq() {
		return toiletingVq;
	}

	public void setToiletingVq(boolean toiletingVq) {
		this.toiletingVq = toiletingVq;
	}

	public boolean isToiletingI() {
		return toiletingI;
	}

	public void setToiletingI(boolean toiletingI) {
		this.toiletingI = toiletingI;
	}

	public Notes getHygGroomCurEquip() {
		return hygGroomCurEquip;
	}

	public void setHygGroomCurEquip(Notes hygGroomCurEquip) {
		this.hygGroomCurEquip = hygGroomCurEquip;
	}

	public boolean isHygGroomDep() {
		return hygGroomDep;
	}

	public void setHygGroomDep(boolean hygGroomDep) {
		this.hygGroomDep = hygGroomDep;
	}

	public boolean isHygGroomMaxA() {
		return hygGroomMaxA;
	}

	public void setHygGroomMaxA(boolean hygGroomMaxA) {
		this.hygGroomMaxA = hygGroomMaxA;
	}

	public boolean isHygGroomModA() {
		return hygGroomModA;
	}

	public void setHygGroomModA(boolean hygGroomModA) {
		this.hygGroomModA = hygGroomModA;
	}

	public boolean isHygGroomMinA() {
		return hygGroomMinA;
	}

	public void setHygGroomMinA(boolean hygGroomMinA) {
		this.hygGroomMinA = hygGroomMinA;
	}

	public boolean isHygGroomCg() {
		return hygGroomCg;
	}

	public void setHygGroomCg(boolean hygGroomCg) {
		this.hygGroomCg = hygGroomCg;
	}

	public boolean isHygGroomVq() {
		return hygGroomVq;
	}

	public void setHygGroomVq(boolean hygGroomVq) {
		this.hygGroomVq = hygGroomVq;
	}

	public boolean isHygGroomI() {
		return hygGroomI;
	}

	public void setHygGroomI(boolean hygGroomI) {
		this.hygGroomI = hygGroomI;
	}

	public Notes getLeDressCurEquip() {
		return leDressCurEquip;
	}

	public void setLeDressCurEquip(Notes leDressCurEquip) {
		this.leDressCurEquip = leDressCurEquip;
	}

	public boolean isLeDressDep() {
		return leDressDep;
	}

	public void setLeDressDep(boolean leDressDep) {
		this.leDressDep = leDressDep;
	}

	public boolean isLeDressMaxA() {
		return leDressMaxA;
	}

	public void setLeDressMaxA(boolean leDressMaxA) {
		this.leDressMaxA = leDressMaxA;
	}

	public boolean isLeDressModA() {
		return leDressModA;
	}

	public void setLeDressModA(boolean leDressModA) {
		this.leDressModA = leDressModA;
	}

	public boolean isLeDressMinA() {
		return leDressMinA;
	}

	public void setLeDressMinA(boolean leDressMinA) {
		this.leDressMinA = leDressMinA;
	}

	public boolean isLeDressCg() {
		return leDressCg;
	}

	public void setLeDressCg(boolean leDressCg) {
		this.leDressCg = leDressCg;
	}

	public boolean isLeDressVq() {
		return leDressVq;
	}

	public void setLeDressVq(boolean leDressVq) {
		this.leDressVq = leDressVq;
	}

	public boolean isLeDressI() {
		return leDressI;
	}

	public void setLeDressI(boolean leDressI) {
		this.leDressI = leDressI;
	}

	public String getInitialAssessmentEvalLe() {
		return initialAssessmentEvalLe;
	}

	public void setInitialAssessmentEvalLe(String initialAssessmentEvalLe) {
		this.initialAssessmentEvalLe = initialAssessmentEvalLe;
	}

	public String getInitialAssessmentEvalHandFxnL() {
		return initialAssessmentEvalHandFxnL;
	}

	public void setInitialAssessmentEvalHandFxnL(
			String initialAssessmentEvalHandFxnL) {
		this.initialAssessmentEvalHandFxnL = initialAssessmentEvalHandFxnL;
	}

	public String getInitialAssessmentEvalHandFxnR() {
		return initialAssessmentEvalHandFxnR;
	}

	public void setInitialAssessmentEvalHandFxnR(
			String initialAssessmentEvalHandFxnR) {
		this.initialAssessmentEvalHandFxnR = initialAssessmentEvalHandFxnR;
	}

	public RichTextField getInitialAssessmentEvalRomL() {
		return initialAssessmentEvalRomL;
	}

	public void setInitialAssessmentEvalRomL(
			RichTextField initialAssessmentEvalRomL) {
		this.initialAssessmentEvalRomL = initialAssessmentEvalRomL;
	}

	public RichTextField getInitialAssessmentEvalRomR() {
		return initialAssessmentEvalRomR;
	}

	public void setInitialAssessmentEvalRomR(
			RichTextField initialAssessmentEvalRomR) {
		this.initialAssessmentEvalRomR = initialAssessmentEvalRomR;
	}

	public RichTextField getInitialAssessmentEvalStrengthL() {
		return initialAssessmentEvalStrengthL;
	}

	public void setInitialAssessmentEvalStrengthL(
			RichTextField initialAssessmentEvalStrengthL) {
		this.initialAssessmentEvalStrengthL = initialAssessmentEvalStrengthL;
	}

	public RichTextField getInitialAssessmentEvalStrengthR() {
		return initialAssessmentEvalStrengthR;
	}

	public void setInitialAssessmentEvalStrengthR(
			RichTextField initialAssessmentEvalStrengthR) {
		this.initialAssessmentEvalStrengthR = initialAssessmentEvalStrengthR;
	}

	public RichTextField getInitialAssessmentLivesWith() {
		return initialAssessmentLivesWith;
	}

	public void setInitialAssessmentLivesWith(
			RichTextField initialAssessmentLivesWith) {
		this.initialAssessmentLivesWith = initialAssessmentLivesWith;
	}

	public RichTextField getInitialAssessmentHomeMgmt() {
		return initialAssessmentHomeMgmt;
	}

	public void setInitialAssessmentHomeMgmt(
			RichTextField initialAssessmentHomeMgmt) {
		this.initialAssessmentHomeMgmt = initialAssessmentHomeMgmt;
	}

	public RichTextField getInitialAssessmentPrecausions() {
		return initialAssessmentPrecausions;
	}

	public void setInitialAssessmentPrecausions(
			RichTextField initialAssessmentPrecausions) {
		this.initialAssessmentPrecausions = initialAssessmentPrecausions;
	}

	public RichTextField getInitialAssessmentDcPlanGoal() {
		return initialAssessmentDcPlanGoal;
	}

	public void setInitialAssessmentDcPlanGoal(
			RichTextField initialAssessmentDcPlanGoal) {
		this.initialAssessmentDcPlanGoal = initialAssessmentDcPlanGoal;
	}

	public String getPlanOfCareEquipOtherField() {
		return planOfCareEquipOtherField;
	}

	public void setPlanOfCareEquipOtherField(String planOfCareEquipOtherField) {
		this.planOfCareEquipOtherField = planOfCareEquipOtherField;
	}

	public String getPlanOfCarePainMod() {
		return planOfCarePainMod;
	}

	public void setPlanOfCarePainMod(String planOfCarePainMod) {
		this.planOfCarePainMod = planOfCarePainMod;
	}

	public boolean isOccHmo() {
		return occHmo;
	}

	public void setOccHmo(boolean occHmo) {
		this.occHmo = occHmo;
	}

	public boolean isCognitionAphasia() {
		return cognitionAphasia;
	}

	public void setCognitionAphasia(boolean cognitionAphasia) {
		this.cognitionAphasia = cognitionAphasia;
	}

	public boolean isCognitionDecreasedVision() {
		return cognitionDecreasedVision;
	}

	public void setCognitionDecreasedVision(boolean cognitionDecreasedVision) {
		this.cognitionDecreasedVision = cognitionDecreasedVision;
	}

	public String getCognitionOrientedX123() {
		return cognitionOrientedX123;
	}

	public void setCognitionOrientedX123(String cognitionOrientedX123) {
		this.cognitionOrientedX123 = cognitionOrientedX123;
	}

	public boolean isCognitionAlert() {
		return cognitionAlert;
	}

	public void setCognitionAlert(boolean cognitionAlert) {
		this.cognitionAlert = cognitionAlert;
	}

	public RichTextField getCurPositioning() {
		return curPositioning;
	}

	public void setCurPositioning(RichTextField curPositioning) {
		this.curPositioning = curPositioning;
	}

	public Notes getUeDressCurEquip() {
		return ueDressCurEquip;
	}

	public void setUeDressCurEquip(Notes ueDressCurEquip) {
		this.ueDressCurEquip = ueDressCurEquip;
	}

	public Notes getEatingCurEquip() {
		return eatingCurEquip;
	}

	public void setEatingCurEquip(Notes eatingCurEquip) {
		this.eatingCurEquip = eatingCurEquip;
	}

	public boolean isUeDressDep() {
		return ueDressDep;
	}

	public void setUeDressDep(boolean ueDressDep) {
		this.ueDressDep = ueDressDep;
	}

	public boolean isEatingDep() {
		return eatingDep;
	}

	public void setEatingDep(boolean eatingDep) {
		this.eatingDep = eatingDep;
	}

	public boolean isUeDressMaxA() {
		return ueDressMaxA;
	}

	public void setUeDressMaxA(boolean ueDressMaxA) {
		this.ueDressMaxA = ueDressMaxA;
	}

	public boolean isEatingMaxA() {
		return eatingMaxA;
	}

	public void setEatingMaxA(boolean eatingMaxA) {
		this.eatingMaxA = eatingMaxA;
	}

	public boolean isUeDressModA() {
		return ueDressModA;
	}

	public void setUeDressModA(boolean ueDressModA) {
		this.ueDressModA = ueDressModA;
	}

	public boolean isEatingModA() {
		return eatingModA;
	}

	public void setEatingModA(boolean eatingModA) {
		this.eatingModA = eatingModA;
	}

	public boolean isUeDressMinA() {
		return ueDressMinA;
	}

	public void setUeDressMinA(boolean ueDressMinA) {
		this.ueDressMinA = ueDressMinA;
	}

	public boolean isEatingMinA() {
		return eatingMinA;
	}

	public void setEatingMinA(boolean eatingMinA) {
		this.eatingMinA = eatingMinA;
	}

	public boolean isUeDressCg() {
		return ueDressCg;
	}

	public void setUeDressCg(boolean ueDressCg) {
		this.ueDressCg = ueDressCg;
	}

	public boolean isEatingCg() {
		return eatingCg;
	}

	public void setEatingCg(boolean eatingCg) {
		this.eatingCg = eatingCg;
	}

	public boolean isUeDressVq() {
		return ueDressVq;
	}

	public void setUeDressVq(boolean ueDressVq) {
		this.ueDressVq = ueDressVq;
	}

	public boolean isEatingVq() {
		return eatingVq;
	}

	public void setEatingVq(boolean eatingVq) {
		this.eatingVq = eatingVq;
	}

	public boolean isUeDressI() {
		return ueDressI;
	}

	public void setUeDressI(boolean ueDressI) {
		this.ueDressI = ueDressI;
	}

	public boolean isEatingI() {
		return eatingI;
	}

	public void setEatingI(boolean eatingI) {
		this.eatingI = eatingI;
	}

	public String getSignatureTherapy() {
		return signatureTherapy;
	}

	public void setSignatureTherapy(String signatureTherapy) {
		this.signatureTherapy = signatureTherapy;
	}

	public RichTextField getInitialAssessmentRecentTherapyField() {
		return initialAssessmentRecentTherapyField;
	}

	public void setInitialAssessmentRecentTherapyField(
			RichTextField initialAssessmentRecentTherapyField) {
		this.initialAssessmentRecentTherapyField = initialAssessmentRecentTherapyField;
	}

	public boolean isInitialAssessmentRecentTherapyNa() {
		return initialAssessmentRecentTherapyNa;
	}

	public void setInitialAssessmentRecentTherapyNa(
			boolean initialAssessmentRecentTherapyNa) {
		this.initialAssessmentRecentTherapyNa = initialAssessmentRecentTherapyNa;
	}

	public RichTextField getInitialAssessmentAssistance() {
		return initialAssessmentAssistance;
	}

	public void setInitialAssessmentAssistance(
			RichTextField initialAssessmentAssistance) {
		this.initialAssessmentAssistance = initialAssessmentAssistance;
	}

	public RichTextField getInitialAssessmentLivingType() {
		return initialAssessmentLivingType;
	}

	public void setInitialAssessmentLivingType(
			RichTextField initialAssessmentLivingType) {
		this.initialAssessmentLivingType = initialAssessmentLivingType;
	}

	public String getInitialAssessmentPmh() {
		return initialAssessmentPmh;
	}

	public void setInitialAssessmentPmh(String initialAssessmentPmh) {
		this.initialAssessmentPmh = initialAssessmentPmh;
	}

	public String getInitialAssessmentPlof() {
		return initialAssessmentPlof;
	}

	public void setInitialAssessmentPlof(String initialAssessmentPlof) {
		this.initialAssessmentPlof = initialAssessmentPlof;
	}

	public Notes getReasonForReferral() {
		return reasonForReferral;
	}

	public void setReasonForReferral(Notes reasonForReferral) {
		this.reasonForReferral = reasonForReferral;
	}

	public int getRehabPot() {
		return rehabPot;
	}

	public void setRehabPot(int rehabPot) {
		this.rehabPot = rehabPot;
	}

	public RichTextField getInitialAssessmentRefBy() {
		return initialAssessmentRefBy;
	}

	public void setInitialAssessmentRefBy(RichTextField initialAssessmentRefBy) {
		this.initialAssessmentRefBy = initialAssessmentRefBy;
	}

	public String getInitialAssessmentAge() {
		return initialAssessmentAge;
	}

	public void setInitialAssessmentAge(String initialAssessmentAge) {
		this.initialAssessmentAge = initialAssessmentAge;
	}

	public boolean isCertificationNa() {
		return certificationNa;
	}

	public void setCertificationNa(boolean certificationNa) {
		this.certificationNa = certificationNa;
	}

	public Date getCertificationThroughDate() {
		return certificationThroughDate;
	}

	public void setCertificationThroughDate(Date certificationThroughDate) {
		this.certificationThroughDate = certificationThroughDate;
	}

	public Date getCertificationFromDate() {
		return certificationFromDate;
	}

	public void setCertificationFromDate(Date certificationFromDate) {
		this.certificationFromDate = certificationFromDate;
	}

	public String getPhysicianSignature() {
		return physicianSignature;
	}

	public void setPhysicianSignature(String physicianSignature) {
		this.physicianSignature = physicianSignature;
	}

	public Date getCertifyDate() {
		return certifyDate;
	}

	public void setCertifyDate(Date certifyDate) {
		this.certifyDate = certifyDate;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public Notes getPlanOfTreatmentOutcome() {
		return planOfTreatmentOutcome;
	}

	public void setPlanOfTreatmentOutcome(Notes planOfTreatmentOutcome) {
		this.planOfTreatmentOutcome = planOfTreatmentOutcome;
	}

	public String getLongTermGoalsWks() {
		return longTermGoalsWks;
	}

	public void setLongTermGoalsWks(String longTermGoalsWks) {
		this.longTermGoalsWks = longTermGoalsWks;
	}

	public Notes getPlanOfTreatmentGoals() {
		return planOfTreatmentGoals;
	}

	public void setPlanOfTreatmentGoals(Notes planOfTreatmentGoals) {
		this.planOfTreatmentGoals = planOfTreatmentGoals;
	}

	public String getShortTermGoalsWks() {
		return shortTermGoalsWks;
	}

	public void setShortTermGoalsWks(String shortTermGoalsWks) {
		this.shortTermGoalsWks = shortTermGoalsWks;
	}

	public Date getSocDate() {
		return socDate;
	}

	public void setSocDate(Date socDate) {
		this.socDate = socDate;
	}

	public Date getOnsetDate() {
		return onsetDate;
	}

	public void setOnsetDate(Date onsetDate) {
		this.onsetDate = onsetDate;
	}

	public String getPrimaryDiagnosis() {
		return primaryDiagnosis;
	}

	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		this.primaryDiagnosis = primaryDiagnosis;
	}

	public RichTextField getTreatmentDiagnosis() {
		return treatmentDiagnosis;
	}

	public void setTreatmentDiagnosis(RichTextField treatmentDiagnosis) {
		this.treatmentDiagnosis = treatmentDiagnosis;
	}

	public String getFrequencyDuration() {
		return frequencyDuration;
	}

	public void setFrequencyDuration(String frequencyDuration) {
		this.frequencyDuration = frequencyDuration;
	}

	public boolean isHospitalizationNa() {
		return hospitalizationNa;
	}

	public void setHospitalizationNa(boolean hospitalizationNa) {
		this.hospitalizationNa = hospitalizationNa;
	}

	public Date getHospitalizationToDate() {
		return hospitalizationToDate;
	}

	public void setHospitalizationToDate(Date hospitalizationToDate) {
		this.hospitalizationToDate = hospitalizationToDate;
	}

	public Date getHospitalizationFromDate() {
		return hospitalizationFromDate;
	}

	public void setHospitalizationFromDate(Date hospitalizationFromDate) {
		this.hospitalizationFromDate = hospitalizationFromDate;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getHicn() {
		return hicn;
	}

	public void setHicn(String hicn) {
		this.hicn = hicn;
	}

	public String getNpiNo() {
		return npiNo;
	}

	public void setNpiNo(String npiNo) {
		this.npiNo = npiNo;
	}

	public String getOccOtherField() {
		return occOtherField;
	}

	public void setOccOtherField(String occOtherField) {
		this.occOtherField = occOtherField;
	}

	public boolean isOccOther() {
		return occOther;
	}

	public void setOccOther(boolean occOther) {
		this.occOther = occOther;
	}

	public boolean isOccPartA() {
		return occPartA;
	}

	public void setOccPartA(boolean occPartA) {
		this.occPartA = occPartA;
	}

	public boolean isOccPartB() {
		return occPartB;
	}

	public void setOccPartB(boolean occPartB) {
		this.occPartB = occPartB;
	}

	public boolean isTherapyexc() {
		return therapyexc;
	}

	public void setTherapyexc(boolean therapyexc) {
		this.therapyexc = therapyexc;
	}

	public boolean isNeuroMuscular() {
		return neuroMuscular;
	}

	public void setNeuroMuscular(boolean neuroMuscular) {
		this.neuroMuscular = neuroMuscular;
	}

	public boolean isBedMobility() {
		return bedMobility;
	}

	public void setBedMobility(boolean bedMobility) {
		this.bedMobility = bedMobility;
	}

	public boolean isTherapyActivities() {
		return therapyActivities;
	}

	public void setTherapyActivities(boolean therapyActivities) {
		this.therapyActivities = therapyActivities;
	}

	public boolean isTransferTrain() {
		return transferTrain;
	}

	public void setTransferTrain(boolean transferTrain) {
		this.transferTrain = transferTrain;
	}

	public boolean isCognitiveSkills() {
		return cognitiveSkills;
	}

	public void setCognitiveSkills(boolean cognitiveSkills) {
		this.cognitiveSkills = cognitiveSkills;
	}

	public boolean isAdlEating() {
		return adlEating;
	}

	public void setAdlEating(boolean adlEating) {
		this.adlEating = adlEating;
	}

	public boolean isUbLbDressing() {
		return ubLbDressing;
	}

	public void setUbLbDressing(boolean ubLbDressing) {
		this.ubLbDressing = ubLbDressing;
	}

	public boolean isHygieneGroom() {
		return hygieneGroom;
	}

	public void setHygieneGroom(boolean hygieneGroom) {
		this.hygieneGroom = hygieneGroom;
	}

	public boolean isToileting() {
		return toileting;
	}

	public void setToileting(boolean toileting) {
		this.toileting = toileting;
	}

	public boolean isMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

}
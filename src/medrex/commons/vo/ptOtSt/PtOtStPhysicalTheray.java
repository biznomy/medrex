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
@Table(name = "PtOtStPhysicalTheray")
public class PtOtStPhysicalTheray implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8793176709828088992L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;

	@Column(name = "followsCommands")
	private int followsCommands;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalImpaired")
	private RichTextField evalImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalIntact")
	private RichTextField evalIntact;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalSafetyAwareness")
	private RichTextField evalSafetyAwareness;

	@Column(name = "evalPainEdema")
	private String evalPainEdema;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalGaintPatternPosture")
	private Notes evalGaintPatternPosture;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalAmbAmtAsst")
	private RichTextField evalAmbAmtAsst;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalAmbAsstDev")
	private RichTextField evalAmbAsstDev;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalAmbDistance")
	private RichTextField evalAmbDistance;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBalanceTestScore")
	private RichTextField evalBalanceTestScore;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBalanceStandDyn")
	private RichTextField evalBalanceStandDyn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBalanceStandStatic")
	private RichTextField evalBalanceStandStatic;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBalanceSitDyn")
	private RichTextField evalBalanceSitDyn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBalanceSitStatic")
	private RichTextField evalBalanceSitStatic;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalTransferSupStand")
	private RichTextField evalTransferSupStand;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBedMobRoll")
	private RichTextField evalBedMobRoll;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalStrengthLeR")
	private RichTextField evalStrengthLeR;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalStrengthUeL")
	private RichTextField evalStrengthUeL;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalStrengthUeR")
	private RichTextField evalStrengthUeR;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalRomUe")
	private RichTextField evalRomUe;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentAssistance")
	private RichTextField initialAssessmentAssistance;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentLiveWith")
	private RichTextField initialAssessmentLiveWith;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentStairs")
	private RichTextField initialAssessmentStairs;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentSituationType")
	private RichTextField initialAssessmentSituationType;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentWbs")
	private RichTextField initialAssessmentWbs;

	@Column(name = "planOfCareOther")
	private String planOfCareOther;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "recommendationImp")
	private Notes recommendationImp;

	@Column(name = "evalOther")
	private String evalOther;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalTransferStandPivot")
	private RichTextField evalTransferStandPivot;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalBedMobSupSit")
	private RichTextField evalBedMobSupSit;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalStrengthLeL")
	private RichTextField evalStrengthLeL;
	@Column(name = "signatureTherapy")
	private String signatureTherapy;

	@Column(name = "alert")
	private boolean alert;
	@Column(name = "oriented")
	private boolean oriented;
	@Column(name = "orientedScale")
	private String orientedScale;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalRomLe")
	private RichTextField evalRomLe;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentRecTherapy")
	private RichTextField initialAssessmentRecTherapy;
	@Column(name = "initialAssessmentRecTherapyNa")
	private boolean initialAssessmentRecTherapyNa;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPrecausions")
	private RichTextField initialAssessmentPrecausions;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentDcPlan")
	private RichTextField initialAssessmentDcPlan;

	@Column(name = "initialAssessmentPmh")
	private String initialAssessmentPmh;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPlof")
	private Notes initialAssessmentPlof;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "reasonForReferral")
	private Notes reasonForReferral;

	@Column(name = "rehabPot")
	private int rehabPot;
	@Column(name = "initialAssessmentRefBy")
	private String initialAssessmentRefBy;
	@Column(name = "initialAssessmentAge")
	private String initialAssessmentAge;
	@Column(name = "certificationNa")
	private boolean certificationNa;
	@Column(name = "certificationToDate")
	private Date certificationToDate;
	@Column(name = "certificationFromDate")
	private Date certificationFromDate;
	@Column(name = "physicianCertifyNaOnFileCheckBox")
	private boolean physicianCertifyNaOnFileCheckBox;
	@Column(name = "physicianCertifySign")
	private String physicianCertifySign;
	@Column(name = "physicianCertifyDate")
	private Date physicianCertifyDate;
	@Column(name = "physicianCertifyName")
	private String physicianCertifyName;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentLong")
	private Notes planOfTreatmentLong;

	@Column(name = "planOfTreatmentLongWks")
	private String planOfTreatmentLongWks;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentShort")
	private Notes planOfTreatmentShort;

	@Column(name = "planOfTreatmentShortWks")
	private String planOfTreatmentShortWks;
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
	@Column(name = "physicalOtherField")
	private String physicalOtherField;
	@Column(name = "physicalOther")
	private boolean physicalOther;
	@Column(name = "physicalPartA")
	private boolean physicalPartA;
	@Column(name = "physicalPartB")
	private boolean physicalPartB;

	@Column(name = "evalTx")
	private boolean evalTx;
	@Column(name = "therapyEx")
	private boolean therapyEx;
	@Column(name = "neuromusc")
	private boolean neuromusc;
	@Column(name = "reEd")
	private boolean reEd;
	@Column(name = "gaintTrain")
	private boolean gaintTrain;
	@Column(name = "therapyAct")
	private boolean therapyAct;
	@Column(name = "cogSkills")
	private boolean cogSkills;
	@Column(name = "adls")
	private boolean adls;
	@Column(name = "wcManagePropulsion")
	private boolean wcManagePropulsion;
	@Column(name = "orthotics")
	private boolean orthotics;
	@Column(name = "prosthetics")
	private boolean prosthetics;
	@Column(name = "checkoutArthoticProsthetic")
	private boolean checkoutArthoticProsthetic;
	@Column(name = "message")
	private boolean message;
	@Column(name = "sensoryTech")
	private boolean sensoryTech;
	@Column(name = "painMod")
	private boolean painMod;
	@Column(name = "usHeatStim")
	private boolean usHeatStim;

	public Notes getEvalGaintPatternPosture() {
		return evalGaintPatternPosture;
	}

	public void setEvalGaintPatternPosture(Notes evalGaintPatternPosture) {
		this.evalGaintPatternPosture = evalGaintPatternPosture;
	}

	public Notes getRecommendationImp() {
		return recommendationImp;
	}

	public void setRecommendationImp(Notes recommendationImp) {
		this.recommendationImp = recommendationImp;
	}

	public Notes getInitialAssessmentPlof() {
		return initialAssessmentPlof;
	}

	public void setInitialAssessmentPlof(Notes initialAssessmentPlof) {
		this.initialAssessmentPlof = initialAssessmentPlof;
	}

	public Notes getReasonForReferral() {
		return reasonForReferral;
	}

	public void setReasonForReferral(Notes reasonForReferral) {
		this.reasonForReferral = reasonForReferral;
	}

	public Notes getPlanOfTreatmentLong() {
		return planOfTreatmentLong;
	}

	public void setPlanOfTreatmentLong(Notes planOfTreatmentLong) {
		this.planOfTreatmentLong = planOfTreatmentLong;
	}

	public Notes getPlanOfTreatmentShort() {
		return planOfTreatmentShort;
	}

	public void setPlanOfTreatmentShort(Notes planOfTreatmentShort) {
		this.planOfTreatmentShort = planOfTreatmentShort;
	}

	public boolean isEvalTx() {
		return evalTx;
	}

	public void setEvalTx(boolean evalTx) {
		this.evalTx = evalTx;
	}

	public boolean isTherapyEx() {
		return therapyEx;
	}

	public void setTherapyEx(boolean therapyEx) {
		this.therapyEx = therapyEx;
	}

	public boolean isNeuromusc() {
		return neuromusc;
	}

	public void setNeuromusc(boolean neuromusc) {
		this.neuromusc = neuromusc;
	}

	public boolean isReEd() {
		return reEd;
	}

	public void setReEd(boolean reEd) {
		this.reEd = reEd;
	}

	public boolean isGaintTrain() {
		return gaintTrain;
	}

	public void setGaintTrain(boolean gaintTrain) {
		this.gaintTrain = gaintTrain;
	}

	public boolean isTherapyAct() {
		return therapyAct;
	}

	public void setTherapyAct(boolean therapyAct) {
		this.therapyAct = therapyAct;
	}

	public boolean isCogSkills() {
		return cogSkills;
	}

	public void setCogSkills(boolean cogSkills) {
		this.cogSkills = cogSkills;
	}

	public boolean isAdls() {
		return adls;
	}

	public void setAdls(boolean adls) {
		this.adls = adls;
	}

	public boolean isWcManagePropulsion() {
		return wcManagePropulsion;
	}

	public void setWcManagePropulsion(boolean wcManagePropulsion) {
		this.wcManagePropulsion = wcManagePropulsion;
	}

	public boolean isOrthotics() {
		return orthotics;
	}

	public void setOrthotics(boolean orthotics) {
		this.orthotics = orthotics;
	}

	public boolean isProsthetics() {
		return prosthetics;
	}

	public void setProsthetics(boolean prosthetics) {
		this.prosthetics = prosthetics;
	}

	public boolean isCheckoutArthoticProsthetic() {
		return checkoutArthoticProsthetic;
	}

	public void setCheckoutArthoticProsthetic(boolean checkoutArthoticProsthetic) {
		this.checkoutArthoticProsthetic = checkoutArthoticProsthetic;
	}

	public boolean isMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

	public boolean isSensoryTech() {
		return sensoryTech;
	}

	public void setSensoryTech(boolean sensoryTech) {
		this.sensoryTech = sensoryTech;
	}

	public boolean isPainMod() {
		return painMod;
	}

	public void setPainMod(boolean painMod) {
		this.painMod = painMod;
	}

	public boolean isUsHeatStim() {
		return usHeatStim;
	}

	public void setUsHeatStim(boolean usHeatStim) {
		this.usHeatStim = usHeatStim;
	}

	public boolean isOriented() {
		return oriented;
	}

	public void setOriented(boolean oriented) {
		this.oriented = oriented;
	}

	public int getFollowsCommands() {
		return followsCommands;
	}

	public void setFollowsCommands(int followsCommands) {
		this.followsCommands = followsCommands;
	}

	public boolean isAlert() {
		return alert;
	}

	public void setAlert(boolean alert) {
		this.alert = alert;
	}

	public String getOrientedScale() {
		return orientedScale;
	}

	public void setOrientedScale(String orientedScale) {
		this.orientedScale = orientedScale;
	}

	public String getEvalPainEdema() {
		return this.evalPainEdema;
	}

	public void setEvalPainEdema(String evalPainEdema) {
		this.evalPainEdema = evalPainEdema;
	}

	public String getPlanOfCareOther() {
		return this.planOfCareOther;
	}

	public void setPlanOfCareOther(String planOfCareOther) {
		this.planOfCareOther = planOfCareOther;
	}

	public String getEvalOther() {
		return this.evalOther;
	}

	public void setEvalOther(String evalOther) {
		this.evalOther = evalOther;
	}

	public String getSignatureTherapy() {
		return this.signatureTherapy;
	}

	public void setSignatureTherapy(String signatureTherapy) {
		this.signatureTherapy = signatureTherapy;
	}

	public boolean isInitialAssessmentRecTherapyNa() {
		return this.initialAssessmentRecTherapyNa;
	}

	public void setInitialAssessmentRecTherapyNa(
			boolean initialAssessmentRecTherapyNa) {
		this.initialAssessmentRecTherapyNa = initialAssessmentRecTherapyNa;
	}

	public String getInitialAssessmentPmh() {
		return this.initialAssessmentPmh;
	}

	public void setInitialAssessmentPmh(String initialAssessmentPmh) {
		this.initialAssessmentPmh = initialAssessmentPmh;
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

	public Date getCertificationToDate() {
		return this.certificationToDate;
	}

	public void setCertificationToDate(Date certificationToDate) {
		this.certificationToDate = certificationToDate;
	}

	public Date getCertificationFromDate() {
		return this.certificationFromDate;
	}

	public void setCertificationFromDate(Date certificationFromDate) {
		this.certificationFromDate = certificationFromDate;
	}

	public boolean isPhysicianCertifyNaOnFileCheckBox() {
		return this.physicianCertifyNaOnFileCheckBox;
	}

	public void setPhysicianCertifyNaOnFileCheckBox(
			boolean physicianCertifyNaOnFileCheckBox) {
		this.physicianCertifyNaOnFileCheckBox = physicianCertifyNaOnFileCheckBox;
	}

	public String getPhysicianCertifySign() {
		return this.physicianCertifySign;
	}

	public void setPhysicianCertifySign(String physicianCertifySign) {
		this.physicianCertifySign = physicianCertifySign;
	}

	public Date getPhysicianCertifyDate() {
		return this.physicianCertifyDate;
	}

	public void setPhysicianCertifyDate(Date physicianCertifyDate) {
		this.physicianCertifyDate = physicianCertifyDate;
	}

	public String getPhysicianCertifyName() {
		return this.physicianCertifyName;
	}

	public void setPhysicianCertifyName(String physicianCertifyName) {
		this.physicianCertifyName = physicianCertifyName;
	}

	public String getPlanOfTreatmentLongWks() {
		return this.planOfTreatmentLongWks;
	}

	public void setPlanOfTreatmentLongWks(String planOfTreatmentLongWks) {
		this.planOfTreatmentLongWks = planOfTreatmentLongWks;
	}

	public String getPlanOfTreatmentShortWks() {
		return this.planOfTreatmentShortWks;
	}

	public void setPlanOfTreatmentShortWks(String planOfTreatmentShortWks) {
		this.planOfTreatmentShortWks = planOfTreatmentShortWks;
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

	public String getPhysicalOtherField() {
		return this.physicalOtherField;
	}

	public void setPhysicalOtherField(String physicalOtherField) {
		this.physicalOtherField = physicalOtherField;
	}

	public boolean isPhysicalOther() {
		return this.physicalOther;
	}

	public void setPhysicalOther(boolean physicalOther) {
		this.physicalOther = physicalOther;
	}

	public boolean isPhysicalPartA() {
		return this.physicalPartA;
	}

	public void setPhysicalPartA(boolean physicalPartA) {
		this.physicalPartA = physicalPartA;
	}

	public boolean isPhysicalPartB() {
		return this.physicalPartB;
	}

	public void setPhysicalPartB(boolean physicalPartB) {
		this.physicalPartB = physicalPartB;
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

	public RichTextField getEvalImpaired() {
		return evalImpaired;
	}

	public void setEvalImpaired(RichTextField evalImpaired) {
		this.evalImpaired = evalImpaired;
	}

	public RichTextField getEvalIntact() {
		return evalIntact;
	}

	public void setEvalIntact(RichTextField evalIntact) {
		this.evalIntact = evalIntact;
	}

	public RichTextField getEvalSafetyAwareness() {
		return evalSafetyAwareness;
	}

	public void setEvalSafetyAwareness(RichTextField evalSafetyAwareness) {
		this.evalSafetyAwareness = evalSafetyAwareness;
	}

	public RichTextField getEvalAmbAmtAsst() {
		return evalAmbAmtAsst;
	}

	public void setEvalAmbAmtAsst(RichTextField evalAmbAmtAsst) {
		this.evalAmbAmtAsst = evalAmbAmtAsst;
	}

	public RichTextField getEvalAmbAsstDev() {
		return evalAmbAsstDev;
	}

	public void setEvalAmbAsstDev(RichTextField evalAmbAsstDev) {
		this.evalAmbAsstDev = evalAmbAsstDev;
	}

	public RichTextField getEvalAmbDistance() {
		return evalAmbDistance;
	}

	public void setEvalAmbDistance(RichTextField evalAmbDistance) {
		this.evalAmbDistance = evalAmbDistance;
	}

	public RichTextField getEvalBalanceTestScore() {
		return evalBalanceTestScore;
	}

	public void setEvalBalanceTestScore(RichTextField evalBalanceTestScore) {
		this.evalBalanceTestScore = evalBalanceTestScore;
	}

	public RichTextField getEvalBalanceStandDyn() {
		return evalBalanceStandDyn;
	}

	public void setEvalBalanceStandDyn(RichTextField evalBalanceStandDyn) {
		this.evalBalanceStandDyn = evalBalanceStandDyn;
	}

	public RichTextField getEvalBalanceStandStatic() {
		return evalBalanceStandStatic;
	}

	public void setEvalBalanceStandStatic(RichTextField evalBalanceStandStatic) {
		this.evalBalanceStandStatic = evalBalanceStandStatic;
	}

	public RichTextField getEvalBalanceSitDyn() {
		return evalBalanceSitDyn;
	}

	public void setEvalBalanceSitDyn(RichTextField evalBalanceSitDyn) {
		this.evalBalanceSitDyn = evalBalanceSitDyn;
	}

	public RichTextField getEvalBalanceSitStatic() {
		return evalBalanceSitStatic;
	}

	public void setEvalBalanceSitStatic(RichTextField evalBalanceSitStatic) {
		this.evalBalanceSitStatic = evalBalanceSitStatic;
	}

	public RichTextField getEvalTransferSupStand() {
		return evalTransferSupStand;
	}

	public void setEvalTransferSupStand(RichTextField evalTransferSupStand) {
		this.evalTransferSupStand = evalTransferSupStand;
	}

	public RichTextField getEvalBedMobRoll() {
		return evalBedMobRoll;
	}

	public void setEvalBedMobRoll(RichTextField evalBedMobRoll) {
		this.evalBedMobRoll = evalBedMobRoll;
	}

	public RichTextField getEvalStrengthLeR() {
		return evalStrengthLeR;
	}

	public void setEvalStrengthLeR(RichTextField evalStrengthLeR) {
		this.evalStrengthLeR = evalStrengthLeR;
	}

	public RichTextField getEvalStrengthUeL() {
		return evalStrengthUeL;
	}

	public void setEvalStrengthUeL(RichTextField evalStrengthUeL) {
		this.evalStrengthUeL = evalStrengthUeL;
	}

	public RichTextField getEvalStrengthUeR() {
		return evalStrengthUeR;
	}

	public void setEvalStrengthUeR(RichTextField evalStrengthUeR) {
		this.evalStrengthUeR = evalStrengthUeR;
	}

	public RichTextField getEvalRomUe() {
		return evalRomUe;
	}

	public void setEvalRomUe(RichTextField evalRomUe) {
		this.evalRomUe = evalRomUe;
	}

	public RichTextField getInitialAssessmentAssistance() {
		return initialAssessmentAssistance;
	}

	public void setInitialAssessmentAssistance(
			RichTextField initialAssessmentAssistance) {
		this.initialAssessmentAssistance = initialAssessmentAssistance;
	}

	public RichTextField getInitialAssessmentLiveWith() {
		return initialAssessmentLiveWith;
	}

	public void setInitialAssessmentLiveWith(
			RichTextField initialAssessmentLiveWith) {
		this.initialAssessmentLiveWith = initialAssessmentLiveWith;
	}

	public RichTextField getInitialAssessmentStairs() {
		return initialAssessmentStairs;
	}

	public void setInitialAssessmentStairs(RichTextField initialAssessmentStairs) {
		this.initialAssessmentStairs = initialAssessmentStairs;
	}

	public RichTextField getInitialAssessmentSituationType() {
		return initialAssessmentSituationType;
	}

	public void setInitialAssessmentSituationType(
			RichTextField initialAssessmentSituationType) {
		this.initialAssessmentSituationType = initialAssessmentSituationType;
	}

	public RichTextField getInitialAssessmentWbs() {
		return initialAssessmentWbs;
	}

	public void setInitialAssessmentWbs(RichTextField initialAssessmentWbs) {
		this.initialAssessmentWbs = initialAssessmentWbs;
	}

	public RichTextField getEvalTransferStandPivot() {
		return evalTransferStandPivot;
	}

	public void setEvalTransferStandPivot(RichTextField evalTransferStandPivot) {
		this.evalTransferStandPivot = evalTransferStandPivot;
	}

	public RichTextField getEvalBedMobSupSit() {
		return evalBedMobSupSit;
	}

	public void setEvalBedMobSupSit(RichTextField evalBedMobSupSit) {
		this.evalBedMobSupSit = evalBedMobSupSit;
	}

	public RichTextField getEvalStrengthLeL() {
		return evalStrengthLeL;
	}

	public void setEvalStrengthLeL(RichTextField evalStrengthLeL) {
		this.evalStrengthLeL = evalStrengthLeL;
	}

	public RichTextField getEvalRomLe() {
		return evalRomLe;
	}

	public void setEvalRomLe(RichTextField evalRomLe) {
		this.evalRomLe = evalRomLe;
	}

	public RichTextField getInitialAssessmentRecTherapy() {
		return initialAssessmentRecTherapy;
	}

	public void setInitialAssessmentRecTherapy(
			RichTextField initialAssessmentRecTherapy) {
		this.initialAssessmentRecTherapy = initialAssessmentRecTherapy;
	}

	public RichTextField getInitialAssessmentPrecausions() {
		return initialAssessmentPrecausions;
	}

	public void setInitialAssessmentPrecausions(
			RichTextField initialAssessmentPrecausions) {
		this.initialAssessmentPrecausions = initialAssessmentPrecausions;
	}

	public RichTextField getInitialAssessmentDcPlan() {
		return initialAssessmentDcPlan;
	}

	public void setInitialAssessmentDcPlan(RichTextField initialAssessmentDcPlan) {
		this.initialAssessmentDcPlan = initialAssessmentDcPlan;
	}

}

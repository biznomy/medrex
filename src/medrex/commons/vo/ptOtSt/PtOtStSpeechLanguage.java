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
@Table(name = "PtOtStSpeechLanguage")
public class PtOtStSpeechLanguage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9030174511887164957L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "followCom")
	private int followCom;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalOtherField")
	private RichTextField evalOtherField;

	@Column(name = "hearingAidedLeft")
	private boolean hearingAidedLeft;
	@Column(name = "hearingAidedRight")
	private boolean hearingAidedRight;
	@Column(name = "speechExpressiveAbility")
	private boolean speechExpressiveAbility;
	@Column(name = "speechIntelligibility")
	private boolean speechIntelligibility;
	@Column(name = "speechFluency")
	private boolean speechFluency;
	@Column(name = "recNaField")
	private String recNaField;
	@Column(name = "recNa")
	private boolean recNa;
	@Column(name = "recPatientParticipatedIn")
	private boolean recPatientParticipatedIn;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalOtherComments")
	private Notes evalOtherComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalOtherImpaired")
	private RichTextField evalOtherImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "evalOtherWfl")
	private RichTextField evalOtherWfl;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "voiceComments")
	private Notes voiceComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "voiceImpaired")
	private RichTextField voiceImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "voiceWfl")
	private RichTextField voiceWfl;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "oralMotorComments")
	private Notes oralMotorComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "oralMotorImpaired")
	private RichTextField oralMotorImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "oralMotorWfl")
	private RichTextField oralMotorWfl;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "speechComments")
	private Notes speechComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "speechImpaired")
	private RichTextField speechImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "speechWfl")
	private RichTextField speechWfl;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "comprehensionComments")
	private Notes comprehensionComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "comprehensionImpaired")
	private RichTextField comprehensionImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "comprehensionWfl")
	private RichTextField comprehensionWfl;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "hearingAidedComments")
	private Notes hearingAidedComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "hearingAidedImpaired")
	private RichTextField hearingAidedImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "hearingAidedWfl")
	private RichTextField hearingAidedWfl;

	@Column(name = "planOfCareOther")
	private String planOfCareOther;
	@Column(name = "speechEvalHmo")
	private boolean speechEvalHmo;
	@Column(name = "cognitionAphasia")
	private boolean cognitionAphasia;
	@Column(name = "cognitionDecreasedVision")
	private boolean cognitionDecreasedVision;
	@Column(name = "cognitionOrientedX123")
	private boolean cognitionOrientedX123;
	@Column(name = "cognitionAlert")
	private boolean cognitionAlert;
	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "cognitionComments")
	private Notes cognitionComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "recommendationImp")
	private Notes recommendationImp;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "verbalComments")
	private Notes verbalComments;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "cognitionImpaired")
	private RichTextField cognitionImpaired;

	@Column(name = "verbalImpaired")
	private boolean verbalImpaired;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "cognitionWfl")
	private RichTextField cognitionWfl;

	@Column(name = "verbalWfl")
	private boolean verbalWfl;
	@Column(name = "signatureTherapy")
	private String signatureTherapy;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentRecentTherapyNaField")
	private RichTextField initialAssessmentRecentTherapyNaField;

	@Column(name = "initialAssessmentRecentTherapyNa")
	private boolean initialAssessmentRecentTherapyNa;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPrecautions")
	private RichTextField initialAssessmentPrecautions;

	@Column(name = "initialAssessmentPtGoal")
	private String initialAssessmentPtGoal;
	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPmh")
	private RichTextField initialAssessmentPmh;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentPlof")
	private Notes initialAssessmentPlof;

	@Column(name = "rehabPot")
	private int rehabPot;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "initialAssessmentRefBy")
	private RichTextField initialAssessmentRefBy;
	@Column(name = "initialAssessmentAge")
	private String initialAssessmentAge;
	@Column(name = "certificationThroughDate")
	private Date certificationThroughDate;
	@Column(name = "certificationFromDate")
	private Date certificationFromDate;
	@Column(name = "certifyPhysicianSign")
	private String certifyPhysicianSign;
	@Column(name = "certifyPhysicianDate")
	private Date certifyPhysicianDate;
	@Column(name = "certifyPhysicianName")
	private String certifyPhysicianName;
	@Column(name = "planOfTreatmentLongTermWks")
	private String planOfTreatmentLongTermWks;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "reasonForReferral")
	private Notes reasonForReferral;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentLongTerm")
	private Notes planOfTreatmentLongTerm;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "planOfTreatmentShortTerm")
	private Notes planOfTreatmentShortTerm;

	@Column(name = "planOfTreatmentShortTermWks")
	private String planOfTreatmentShortTermWks;
	@Column(name = "socDate")
	private Date socDate;
	@Column(name = "onsetDate")
	private Date onsetDate;
	@Column(name = "primaryDuration")
	private String primaryDuration;

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

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "speechEvalOtherField")
	private RichTextField speechEvalOtherField;

	@Column(name = "speechEvalOther")
	private boolean speechEvalOther;
	@Column(name = "speechEvalPartA")
	private boolean speechEvalPartA;
	@Column(name = "speechEvalPartB")
	private boolean speechEvalPartB;

	public int getFollowCom() {
		return this.followCom;
	}

	public void setFollowCom(int followCom) {
		this.followCom = followCom;
	}

	public RichTextField getEvalOtherField() {
		return evalOtherField;
	}

	public void setEvalOtherField(RichTextField evalOtherField) {
		this.evalOtherField = evalOtherField;
	}

	public boolean isHearingAidedLeft() {
		return this.hearingAidedLeft;
	}

	public void setHearingAidedLeft(boolean hearingAidedLeft) {
		this.hearingAidedLeft = hearingAidedLeft;
	}

	public boolean isHearingAidedRight() {
		return this.hearingAidedRight;
	}

	public void setHearingAidedRight(boolean hearingAidedRight) {
		this.hearingAidedRight = hearingAidedRight;
	}

	public Notes getRecommendationImp() {
		return recommendationImp;
	}

	public void setRecommendationImp(Notes recommendationImp) {
		this.recommendationImp = recommendationImp;
	}

	public boolean isSpeechExpressiveAbility() {
		return this.speechExpressiveAbility;
	}

	public void setSpeechExpressiveAbility(boolean speechExpressiveAbility) {
		this.speechExpressiveAbility = speechExpressiveAbility;
	}

	public boolean isSpeechIntelligibility() {
		return this.speechIntelligibility;
	}

	public void setSpeechIntelligibility(boolean speechIntelligibility) {
		this.speechIntelligibility = speechIntelligibility;
	}

	public boolean isSpeechFluency() {
		return this.speechFluency;
	}

	public void setSpeechFluency(boolean speechFluency) {
		this.speechFluency = speechFluency;
	}

	public String getRecNaField() {
		return this.recNaField;
	}

	public void setRecNaField(String recNaField) {
		this.recNaField = recNaField;
	}

	public boolean isRecNa() {
		return this.recNa;
	}

	public void setRecNa(boolean recNa) {
		this.recNa = recNa;
	}

	public boolean isRecPatientParticipatedIn() {
		return this.recPatientParticipatedIn;
	}

	public void setRecPatientParticipatedIn(boolean recPatientParticipatedIn) {
		this.recPatientParticipatedIn = recPatientParticipatedIn;
	}

	public Notes getEvalOtherComments() {
		return evalOtherComments;
	}

	public void setEvalOtherComments(Notes evalOtherComments) {
		this.evalOtherComments = evalOtherComments;
	}

	public RichTextField getEvalOtherImpaired() {
		return evalOtherImpaired;
	}

	public void setEvalOtherImpaired(RichTextField evalOtherImpaired) {
		this.evalOtherImpaired = evalOtherImpaired;
	}

	public RichTextField getEvalOtherWfl() {
		return evalOtherWfl;
	}

	public void setEvalOtherWfl(RichTextField evalOtherWfl) {
		this.evalOtherWfl = evalOtherWfl;
	}

	public Notes getVoiceComments() {
		return voiceComments;
	}

	public void setVoiceComments(Notes voiceComments) {
		this.voiceComments = voiceComments;
	}

	public RichTextField getVoiceImpaired() {
		return voiceImpaired;
	}

	public void setVoiceImpaired(RichTextField voiceImpaired) {
		this.voiceImpaired = voiceImpaired;
	}

	public RichTextField getVoiceWfl() {
		return voiceWfl;
	}

	public void setVoiceWfl(RichTextField voiceWfl) {
		this.voiceWfl = voiceWfl;
	}

	public Notes getOralMotorComments() {
		return oralMotorComments;
	}

	public void setOralMotorComments(Notes oralMotorComments) {
		this.oralMotorComments = oralMotorComments;
	}

	public RichTextField getOralMotorImpaired() {
		return oralMotorImpaired;
	}

	public void setOralMotorImpaired(RichTextField oralMotorImpaired) {
		this.oralMotorImpaired = oralMotorImpaired;
	}

	public RichTextField getOralMotorWfl() {
		return oralMotorWfl;
	}

	public void setOralMotorWfl(RichTextField oralMotorWfl) {
		this.oralMotorWfl = oralMotorWfl;
	}

	public Notes getSpeechComments() {
		return speechComments;
	}

	public void setSpeechComments(Notes speechComments) {
		this.speechComments = speechComments;
	}

	public RichTextField getSpeechImpaired() {
		return speechImpaired;
	}

	public void setSpeechImpaired(RichTextField speechImpaired) {
		this.speechImpaired = speechImpaired;
	}

	public RichTextField getSpeechWfl() {
		return speechWfl;
	}

	public void setSpeechWfl(RichTextField speechWfl) {
		this.speechWfl = speechWfl;
	}

	public Notes getComprehensionComments() {
		return comprehensionComments;
	}

	public void setComprehensionComments(Notes comprehensionComments) {
		this.comprehensionComments = comprehensionComments;
	}

	public RichTextField getComprehensionImpaired() {
		return comprehensionImpaired;
	}

	public void setComprehensionImpaired(RichTextField comprehensionImpaired) {
		this.comprehensionImpaired = comprehensionImpaired;
	}

	public RichTextField getComprehensionWfl() {
		return comprehensionWfl;
	}

	public void setComprehensionWfl(RichTextField comprehensionWfl) {
		this.comprehensionWfl = comprehensionWfl;
	}

	public Notes getHearingAidedComments() {
		return hearingAidedComments;
	}

	public void setHearingAidedComments(Notes hearingAidedComments) {
		this.hearingAidedComments = hearingAidedComments;
	}

	public RichTextField getHearingAidedImpaired() {
		return hearingAidedImpaired;
	}

	public void setHearingAidedImpaired(RichTextField hearingAidedImpaired) {
		this.hearingAidedImpaired = hearingAidedImpaired;
	}

	public RichTextField getHearingAidedWfl() {
		return hearingAidedWfl;
	}

	public void setHearingAidedWfl(RichTextField hearingAidedWfl) {
		this.hearingAidedWfl = hearingAidedWfl;
	}

	public String getPlanOfCareOther() {
		return this.planOfCareOther;
	}

	public void setPlanOfCareOther(String planOfCareOther) {
		this.planOfCareOther = planOfCareOther;
	}

	public boolean isSpeechEvalHmo() {
		return this.speechEvalHmo;
	}

	public void setSpeechEvalHmo(boolean speechEvalHmo) {
		this.speechEvalHmo = speechEvalHmo;
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

	public Notes getCognitionComments() {
		return cognitionComments;
	}

	public void setCognitionComments(Notes cognitionComments) {
		this.cognitionComments = cognitionComments;
	}

	public Notes getVerbalComments() {
		return verbalComments;
	}

	public void setVerbalComments(Notes verbalComments) {
		this.verbalComments = verbalComments;
	}

	public RichTextField getCognitionImpaired() {
		return cognitionImpaired;
	}

	public void setCognitionImpaired(RichTextField cognitionImpaired) {
		this.cognitionImpaired = cognitionImpaired;
	}

	public RichTextField getCognitionWfl() {
		return cognitionWfl;
	}

	public void setCognitionWfl(RichTextField cognitionWfl) {
		this.cognitionWfl = cognitionWfl;
	}

	public boolean isVerbalImpaired() {
		return verbalImpaired;
	}

	public void setVerbalImpaired(boolean verbalImpaired) {
		this.verbalImpaired = verbalImpaired;
	}

	public boolean isVerbalWfl() {
		return verbalWfl;
	}

	public void setVerbalWfl(boolean verbalWfl) {
		this.verbalWfl = verbalWfl;
	}

	public String getSignatureTherapy() {
		return this.signatureTherapy;
	}

	public void setSignatureTherapy(String signatureTherapy) {
		this.signatureTherapy = signatureTherapy;
	}

	public RichTextField getInitialAssessmentRecentTherapyNaField() {
		return initialAssessmentRecentTherapyNaField;
	}

	public void setInitialAssessmentRecentTherapyNaField(
			RichTextField initialAssessmentRecentTherapyNaField) {
		this.initialAssessmentRecentTherapyNaField = initialAssessmentRecentTherapyNaField;
	}

	public boolean isInitialAssessmentRecentTherapyNa() {
		return this.initialAssessmentRecentTherapyNa;
	}

	public void setInitialAssessmentRecentTherapyNa(
			boolean initialAssessmentRecentTherapyNa) {
		this.initialAssessmentRecentTherapyNa = initialAssessmentRecentTherapyNa;
	}

	public RichTextField getInitialAssessmentPrecautions() {
		return initialAssessmentPrecautions;
	}

	public void setInitialAssessmentPrecautions(
			RichTextField initialAssessmentPrecautions) {
		this.initialAssessmentPrecautions = initialAssessmentPrecautions;
	}

	public String getInitialAssessmentPtGoal() {
		return this.initialAssessmentPtGoal;
	}

	public void setInitialAssessmentPtGoal(String initialAssessmentPtGoal) {
		this.initialAssessmentPtGoal = initialAssessmentPtGoal;
	}

	public RichTextField getInitialAssessmentPmh() {
		return initialAssessmentPmh;
	}

	public void setInitialAssessmentPmh(RichTextField initialAssessmentPmh) {
		this.initialAssessmentPmh = initialAssessmentPmh;
	}

	public Notes getInitialAssessmentPlof() {
		return initialAssessmentPlof;
	}

	public void setInitialAssessmentPlof(Notes initialAssessmentPlof) {
		this.initialAssessmentPlof = initialAssessmentPlof;
	}

	public Notes getReasonForReferral() {
		return this.reasonForReferral;
	}

	public void setReasonForReferral(Notes notes) {
		this.reasonForReferral = notes;
	}

	public int getRehabPot() {
		return this.rehabPot;
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
		return this.initialAssessmentAge;
	}

	public void setInitialAssessmentAge(String initialAssessmentAge) {
		this.initialAssessmentAge = initialAssessmentAge;
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

	public String getCertifyPhysicianSign() {
		return this.certifyPhysicianSign;
	}

	public void setCertifyPhysicianSign(String certifyPhysicianSign) {
		this.certifyPhysicianSign = certifyPhysicianSign;
	}

	public Date getCertifyPhysicianDate() {
		return this.certifyPhysicianDate;
	}

	public void setCertifyPhysicianDate(Date certifyPhysicianDate) {
		this.certifyPhysicianDate = certifyPhysicianDate;
	}

	public String getCertifyPhysicianName() {
		return this.certifyPhysicianName;
	}

	public void setCertifyPhysicianName(String certifyPhysicianName) {
		this.certifyPhysicianName = certifyPhysicianName;
	}

	public Notes getPlanOfTreatmentLongTerm() {
		return this.planOfTreatmentLongTerm;
	}

	public void setPlanOfTreatmentLongTerm(Notes notes) {
		this.planOfTreatmentLongTerm = notes;
	}

	public String getPlanOfTreatmentLongTermWks() {
		return this.planOfTreatmentLongTermWks;
	}

	public void setPlanOfTreatmentLongTermWks(String planOfTreatmentLongTermWks) {
		this.planOfTreatmentLongTermWks = planOfTreatmentLongTermWks;
	}

	public Notes getPlanOfTreatmentShortTerm() {
		return this.planOfTreatmentShortTerm;
	}

	public void setPlanOfTreatmentShortTerm(Notes notes) {
		this.planOfTreatmentShortTerm = notes;
	}

	public String getPlanOfTreatmentShortTermWks() {
		return this.planOfTreatmentShortTermWks;
	}

	public void setPlanOfTreatmentShortTermWks(
			String planOfTreatmentShortTermWks) {
		this.planOfTreatmentShortTermWks = planOfTreatmentShortTermWks;
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

	public String getPrimaryDuration() {
		return this.primaryDuration;
	}

	public void setPrimaryDuration(String primaryDuration) {
		this.primaryDuration = primaryDuration;
	}

	public RichTextField getTreatmentDiagnosis() {
		return treatmentDiagnosis;
	}

	public void setTreatmentDiagnosis(RichTextField treatmentDiagnosis) {
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

	public String getNpiNo() {
		return this.npiNo;
	}

	public void setNpiNo(String npiNo) {
		this.npiNo = npiNo;
	}

	public RichTextField getSpeechEvalOtherField() {
		return speechEvalOtherField;
	}

	public void setSpeechEvalOtherField(RichTextField speechEvalOtherField) {
		this.speechEvalOtherField = speechEvalOtherField;
	}

	public boolean isSpeechEvalOther() {
		return this.speechEvalOther;
	}

	public void setSpeechEvalOther(boolean speechEvalOther) {
		this.speechEvalOther = speechEvalOther;
	}

	public boolean isSpeechEvalPartA() {
		return this.speechEvalPartA;
	}

	public void setSpeechEvalPartA(boolean speechEvalPartA) {
		this.speechEvalPartA = speechEvalPartA;
	}

	public boolean isSpeechEvalPartB() {
		return this.speechEvalPartB;
	}

	public void setSpeechEvalPartB(boolean speechEvalPartB) {
		this.speechEvalPartB = speechEvalPartB;
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

package medrex.commons.vo.consultant;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReferralForm")
public class ReferralForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2749670100171461827L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "cognitiveMrDevelopment")
	private boolean cognitiveMrDevelopment;

	@Column(name = "cognitiveOrganicCondition")
	private boolean cognitiveOrganicCondition;

	@Column(name = "cognitiveRestlessness")
	private boolean cognitiveRestlessness;

	@Column(name = "cognitiveDisorganizedSpeech")
	private boolean cognitiveDisorganizedSpeech;

	@Column(name = "cognitiveConfusion")
	private boolean cognitiveConfusion;

	@Column(name = "cognitiveDelusions")
	private boolean cognitiveDelusions;

	@Column(name = "cognitiveLethargy")
	private boolean cognitiveLethargy;

	@Column(name = "cognitiveShortLongTerm")
	private boolean cognitiveShortLongTerm;

	@Column(name = "emotionalSadness")
	private boolean emotionalSadness;

	@Column(name = "emotionalNegative")
	private boolean emotionalNegative;

	@Column(name = "emotionalAnger")
	private boolean emotionalAnger;

	@Column(name = "emotionalPacing")
	private boolean emotionalPacing;

	@Column(name = "emotionalHandWringing")
	private boolean emotionalHandWringing;

	@Column(name = "emotionalUnrealisticFears")
	private boolean emotionalUnrealisticFears;

	@Column(name = "emotionalWorried")
	private boolean emotionalWorried;

	@Column(name = "emotionalSuicideAttempts")
	private boolean emotionalSuicideAttempts;

	@Column(name = "emotionalSuicideThreats")
	private boolean emotionalSuicideThreats;

	@Column(name = "emotionalPlansForSuicide")
	private boolean emotionalPlansForSuicide;

	@Column(name = "emotionalThreats")
	private boolean emotionalThreats;

	@Column(name = "emotionalSelfDeprecation")
	private boolean emotionalSelfDeprecation;

	@Column(name = "emotionalHealthComplaints")
	private boolean emotionalHealthComplaints;

	@Column(name = "emotionalCrying")
	private boolean emotionalCrying;

	@Column(name = "emotionalInsomnia")
	private boolean emotionalInsomnia;

	@Column(name = "emotionalSleep")
	private boolean emotionalSleep;

	@Column(name = "emotionalMood")
	private boolean emotionalMood;

	@Column(name = "emotionalFear")
	private boolean emotionalFear;

	@Column(name = "emotionalInBedclothes")
	private boolean emotionalInBedclothes;

	@Column(name = "emotionalReducedSocial")
	private boolean emotionalReducedSocial;

	@Column(name = "emotionalRepetitiveVerbalizations")
	private boolean emotionalRepetitiveVerbalizations;

	@Column(name = "emotionalSeeksAttention")
	private boolean emotionalSeeksAttention;

	@Column(name = "emotionalSeeksReassurances")
	private boolean emotionalSeeksReassurances;

	@Column(name = "emotionalExcessive")
	private boolean emotionalExcessive;

	@Column(name = "emotionalRepetitiveQuestions")
	private boolean emotionalRepetitiveQuestions;

	@Column(name = "emotionalWithdrawal")
	private boolean emotionalWithdrawal;

	@Column(name = "behavioralWandering")
	private boolean behavioralWandering;

	@Column(name = "behavioralResistance")
	private boolean behavioralResistance;

	@Column(name = "behavioralVerbal")
	private boolean behavioralVerbal;

	@Column(name = "behavioralPhysical")
	private boolean behavioralPhysical;

	@Column(name = "behavioralInappropriate")
	private boolean behavioralInappropriate;

	@Column(name = "behavioralDisruptive")
	private boolean behavioralDisruptive;

	@Column(name = "interactiveHighlyHearing")
	private boolean interactiveHighlyHearing;

	@Column(name = "interactiveRarelyUnderstood")
	private boolean interactiveRarelyUnderstood;

	@Column(name = "interactiveHighlyImpaired")
	private boolean interactiveHighlyImpaired;

	@Column(name = "interactiveUnclearSpeech")
	private boolean interactiveUnclearSpeech;

	@Column(name = "interactiveRarelyUnderstands")
	private boolean interactiveRarelyUnderstands;

	@Column(name = "interactiveDeteriorated")
	private boolean interactiveDeteriorated;

	@Column(name = "interactiveNoSpeech")
	private boolean interactiveNoSpeech;

	@Column(name = "interactiveBlind")
	private boolean interactiveBlind;

	@Column(name = "socialUnhappyRoommate")
	private boolean socialUnhappyRoommate;

	@Column(name = "socialConflict")
	private boolean socialConflict;

	@Column(name = "socialSadness")
	private boolean socialSadness;

	@Column(name = "socialUnhappyResidents")
	private boolean socialUnhappyResidents;

	@Column(name = "socialLoss")
	private boolean socialLoss;

	@Column(name = "socialAdjustment")
	private boolean socialAdjustment;

	@Column(name = "socialConstantly")
	private boolean socialConstantly;

	@Column(name = "narrativeComments")
	private String narrativeComments;

	@Column(name = "dateRecord")
	private Date dateRecord;

	@Column(name = "referralAuthorizedBy")
	private String referralAuthorizedBy;

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

	public boolean isCognitiveMrDevelopment() {
		return cognitiveMrDevelopment;
	}

	public void setCognitiveMrDevelopment(boolean cognitiveMrDevelopment) {
		this.cognitiveMrDevelopment = cognitiveMrDevelopment;
	}

	public boolean isCognitiveOrganicCondition() {
		return cognitiveOrganicCondition;
	}

	public void setCognitiveOrganicCondition(boolean cognitiveOrganicCondition) {
		this.cognitiveOrganicCondition = cognitiveOrganicCondition;
	}

	public boolean isCognitiveRestlessness() {
		return cognitiveRestlessness;
	}

	public void setCognitiveRestlessness(boolean cognitiveRestlessness) {
		this.cognitiveRestlessness = cognitiveRestlessness;
	}

	public boolean isCognitiveDisorganizedSpeech() {
		return cognitiveDisorganizedSpeech;
	}

	public void setCognitiveDisorganizedSpeech(
			boolean cognitiveDisorganizedSpeech) {
		this.cognitiveDisorganizedSpeech = cognitiveDisorganizedSpeech;
	}

	public boolean isCognitiveConfusion() {
		return cognitiveConfusion;
	}

	public void setCognitiveConfusion(boolean cognitiveConfusion) {
		this.cognitiveConfusion = cognitiveConfusion;
	}

	public boolean isCognitiveDelusions() {
		return cognitiveDelusions;
	}

	public void setCognitiveDelusions(boolean cognitiveDelusions) {
		this.cognitiveDelusions = cognitiveDelusions;
	}

	public boolean isCognitiveLethargy() {
		return cognitiveLethargy;
	}

	public void setCognitiveLethargy(boolean cognitiveLethargy) {
		this.cognitiveLethargy = cognitiveLethargy;
	}

	public boolean isCognitiveShortLongTerm() {
		return cognitiveShortLongTerm;
	}

	public void setCognitiveShortLongTerm(boolean cognitiveShortLongTerm) {
		this.cognitiveShortLongTerm = cognitiveShortLongTerm;
	}

	public boolean isEmotionalSadness() {
		return emotionalSadness;
	}

	public void setEmotionalSadness(boolean emotionalSadness) {
		this.emotionalSadness = emotionalSadness;
	}

	public boolean isEmotionalNegative() {
		return emotionalNegative;
	}

	public void setEmotionalNegative(boolean emotionalNegative) {
		this.emotionalNegative = emotionalNegative;
	}

	public boolean isEmotionalAnger() {
		return emotionalAnger;
	}

	public void setEmotionalAnger(boolean emotionalAnger) {
		this.emotionalAnger = emotionalAnger;
	}

	public boolean isEmotionalPacing() {
		return emotionalPacing;
	}

	public void setEmotionalPacing(boolean emotionalPacing) {
		this.emotionalPacing = emotionalPacing;
	}

	public boolean isEmotionalHandWringing() {
		return emotionalHandWringing;
	}

	public void setEmotionalHandWringing(boolean emotionalHandWringing) {
		this.emotionalHandWringing = emotionalHandWringing;
	}

	public boolean isEmotionalUnrealisticFears() {
		return emotionalUnrealisticFears;
	}

	public void setEmotionalUnrealisticFears(boolean emotionalUnrealisticFears) {
		this.emotionalUnrealisticFears = emotionalUnrealisticFears;
	}

	public boolean isEmotionalWorried() {
		return emotionalWorried;
	}

	public void setEmotionalWorried(boolean emotionalWorried) {
		this.emotionalWorried = emotionalWorried;
	}

	public boolean isEmotionalSuicideAttempts() {
		return emotionalSuicideAttempts;
	}

	public void setEmotionalSuicideAttempts(boolean emotionalSuicideAttempts) {
		this.emotionalSuicideAttempts = emotionalSuicideAttempts;
	}

	public boolean isEmotionalSuicideThreats() {
		return emotionalSuicideThreats;
	}

	public void setEmotionalSuicideThreats(boolean emotionalSuicideThreats) {
		this.emotionalSuicideThreats = emotionalSuicideThreats;
	}

	public boolean isEmotionalPlansForSuicide() {
		return emotionalPlansForSuicide;
	}

	public void setEmotionalPlansForSuicide(boolean emotionalPlansForSuicide) {
		this.emotionalPlansForSuicide = emotionalPlansForSuicide;
	}

	public boolean isEmotionalThreats() {
		return emotionalThreats;
	}

	public void setEmotionalThreats(boolean emotionalThreats) {
		this.emotionalThreats = emotionalThreats;
	}

	public boolean isEmotionalSelfDeprecation() {
		return emotionalSelfDeprecation;
	}

	public void setEmotionalSelfDeprecation(boolean emotionalSelfDeprecation) {
		this.emotionalSelfDeprecation = emotionalSelfDeprecation;
	}

	public boolean isEmotionalHealthComplaints() {
		return emotionalHealthComplaints;
	}

	public void setEmotionalHealthComplaints(boolean emotionalHealthComplaints) {
		this.emotionalHealthComplaints = emotionalHealthComplaints;
	}

	public boolean isEmotionalCrying() {
		return emotionalCrying;
	}

	public void setEmotionalCrying(boolean emotionalCrying) {
		this.emotionalCrying = emotionalCrying;
	}

	public boolean isEmotionalInsomnia() {
		return emotionalInsomnia;
	}

	public void setEmotionalInsomnia(boolean emotionalInsomnia) {
		this.emotionalInsomnia = emotionalInsomnia;
	}

	public boolean isEmotionalSleep() {
		return emotionalSleep;
	}

	public void setEmotionalSleep(boolean emotionalSleep) {
		this.emotionalSleep = emotionalSleep;
	}

	public boolean isEmotionalMood() {
		return emotionalMood;
	}

	public void setEmotionalMood(boolean emotionalMood) {
		this.emotionalMood = emotionalMood;
	}

	public boolean isEmotionalFear() {
		return emotionalFear;
	}

	public void setEmotionalFear(boolean emotionalFear) {
		this.emotionalFear = emotionalFear;
	}

	public boolean isEmotionalInBedclothes() {
		return emotionalInBedclothes;
	}

	public void setEmotionalInBedclothes(boolean emotionalInBedclothes) {
		this.emotionalInBedclothes = emotionalInBedclothes;
	}

	public boolean isEmotionalReducedSocial() {
		return emotionalReducedSocial;
	}

	public void setEmotionalReducedSocial(boolean emotionalReducedSocial) {
		this.emotionalReducedSocial = emotionalReducedSocial;
	}

	public boolean isEmotionalRepetitiveVerbalizations() {
		return emotionalRepetitiveVerbalizations;
	}

	public void setEmotionalRepetitiveVerbalizations(
			boolean emotionalRepetitiveVerbalizations) {
		this.emotionalRepetitiveVerbalizations = emotionalRepetitiveVerbalizations;
	}

	public boolean isEmotionalSeeksAttention() {
		return emotionalSeeksAttention;
	}

	public void setEmotionalSeeksAttention(boolean emotionalSeeksAttention) {
		this.emotionalSeeksAttention = emotionalSeeksAttention;
	}

	public boolean isEmotionalSeeksReassurances() {
		return emotionalSeeksReassurances;
	}

	public void setEmotionalSeeksReassurances(boolean emotionalSeeksReassurances) {
		this.emotionalSeeksReassurances = emotionalSeeksReassurances;
	}

	public boolean isEmotionalExcessive() {
		return emotionalExcessive;
	}

	public void setEmotionalExcessive(boolean emotionalExcessive) {
		this.emotionalExcessive = emotionalExcessive;
	}

	public boolean isEmotionalRepetitiveQuestions() {
		return emotionalRepetitiveQuestions;
	}

	public void setEmotionalRepetitiveQuestions(
			boolean emotionalRepetitiveQuestions) {
		this.emotionalRepetitiveQuestions = emotionalRepetitiveQuestions;
	}

	public boolean isEmotionalWithdrawal() {
		return emotionalWithdrawal;
	}

	public void setEmotionalWithdrawal(boolean emotionalWithdrawal) {
		this.emotionalWithdrawal = emotionalWithdrawal;
	}

	public boolean isBehavioralWandering() {
		return behavioralWandering;
	}

	public void setBehavioralWandering(boolean behavioralWandering) {
		this.behavioralWandering = behavioralWandering;
	}

	public boolean isBehavioralResistance() {
		return behavioralResistance;
	}

	public void setBehavioralResistance(boolean behavioralResistance) {
		this.behavioralResistance = behavioralResistance;
	}

	public boolean isBehavioralVerbal() {
		return behavioralVerbal;
	}

	public void setBehavioralVerbal(boolean behavioralVerbal) {
		this.behavioralVerbal = behavioralVerbal;
	}

	public boolean isBehavioralPhysical() {
		return behavioralPhysical;
	}

	public void setBehavioralPhysical(boolean behavioralPhysical) {
		this.behavioralPhysical = behavioralPhysical;
	}

	public boolean isBehavioralInappropriate() {
		return behavioralInappropriate;
	}

	public void setBehavioralInappropriate(boolean behavioralInappropriate) {
		this.behavioralInappropriate = behavioralInappropriate;
	}

	public boolean isBehavioralDisruptive() {
		return behavioralDisruptive;
	}

	public void setBehavioralDisruptive(boolean behavioralDisruptive) {
		this.behavioralDisruptive = behavioralDisruptive;
	}

	public boolean isInteractiveHighlyHearing() {
		return interactiveHighlyHearing;
	}

	public void setInteractiveHighlyHearing(boolean interactiveHighlyHearing) {
		this.interactiveHighlyHearing = interactiveHighlyHearing;
	}

	public boolean isInteractiveRarelyUnderstood() {
		return interactiveRarelyUnderstood;
	}

	public void setInteractiveRarelyUnderstood(
			boolean interactiveRarelyUnderstood) {
		this.interactiveRarelyUnderstood = interactiveRarelyUnderstood;
	}

	public boolean isInteractiveHighlyImpaired() {
		return interactiveHighlyImpaired;
	}

	public void setInteractiveHighlyImpaired(boolean interactiveHighlyImpaired) {
		this.interactiveHighlyImpaired = interactiveHighlyImpaired;
	}

	public boolean isInteractiveUnclearSpeech() {
		return interactiveUnclearSpeech;
	}

	public void setInteractiveUnclearSpeech(boolean interactiveUnclearSpeech) {
		this.interactiveUnclearSpeech = interactiveUnclearSpeech;
	}

	public boolean isInteractiveRarelyUnderstands() {
		return interactiveRarelyUnderstands;
	}

	public void setInteractiveRarelyUnderstands(
			boolean interactiveRarelyUnderstands) {
		this.interactiveRarelyUnderstands = interactiveRarelyUnderstands;
	}

	public boolean isInteractiveDeteriorated() {
		return interactiveDeteriorated;
	}

	public void setInteractiveDeteriorated(boolean interactiveDeteriorated) {
		this.interactiveDeteriorated = interactiveDeteriorated;
	}

	public boolean isInteractiveNoSpeech() {
		return interactiveNoSpeech;
	}

	public void setInteractiveNoSpeech(boolean interactiveNoSpeech) {
		this.interactiveNoSpeech = interactiveNoSpeech;
	}

	public boolean isInteractiveBlind() {
		return interactiveBlind;
	}

	public void setInteractiveBlind(boolean interactiveBlind) {
		this.interactiveBlind = interactiveBlind;
	}

	public boolean isSocialUnhappyRoommate() {
		return socialUnhappyRoommate;
	}

	public void setSocialUnhappyRoommate(boolean socialUnhappyRoommate) {
		this.socialUnhappyRoommate = socialUnhappyRoommate;
	}

	public boolean isSocialConflict() {
		return socialConflict;
	}

	public void setSocialConflict(boolean socialConflict) {
		this.socialConflict = socialConflict;
	}

	public boolean isSocialSadness() {
		return socialSadness;
	}

	public void setSocialSadness(boolean socialSadness) {
		this.socialSadness = socialSadness;
	}

	public boolean isSocialUnhappyResidents() {
		return socialUnhappyResidents;
	}

	public void setSocialUnhappyResidents(boolean socialUnhappyResidents) {
		this.socialUnhappyResidents = socialUnhappyResidents;
	}

	public boolean isSocialLoss() {
		return socialLoss;
	}

	public void setSocialLoss(boolean socialLoss) {
		this.socialLoss = socialLoss;
	}

	public boolean isSocialAdjustment() {
		return socialAdjustment;
	}

	public void setSocialAdjustment(boolean socialAdjustment) {
		this.socialAdjustment = socialAdjustment;
	}

	public boolean isSocialConstantly() {
		return socialConstantly;
	}

	public void setSocialConstantly(boolean socialConstantly) {
		this.socialConstantly = socialConstantly;
	}

	public String getNarrativeComments() {
		return narrativeComments;
	}

	public void setNarrativeComments(String narrativeComments) {
		this.narrativeComments = narrativeComments;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getReferralAuthorizedBy() {
		return referralAuthorizedBy;
	}

	public void setReferralAuthorizedBy(String referralAuthorizedBy) {
		this.referralAuthorizedBy = referralAuthorizedBy;
	}

}

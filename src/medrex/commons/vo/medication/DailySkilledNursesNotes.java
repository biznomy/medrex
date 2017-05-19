package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DailySkilledNursesNotes")
public class DailySkilledNursesNotes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2093147251260990090L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "intramuscularInjectionsE")
	private boolean intramuscularInjectionsE;

	@Column(name = "intramuscularInjectionsD")
	private boolean intramuscularInjectionsD;

	@Column(name = "statisUlcersE")
	private boolean statisUlcersE;

	@Column(name = "statisUlcersD")
	private boolean statisUlcersD;

	@Column(name = "woundCareDressingE")
	private boolean woundCareDressingE;

	@Column(name = "woundCareDressingD")
	private boolean woundCareDressingD;

	@Column(name = "observeSsxInfectionE")
	private boolean observeSsxInfectionE;

	@Column(name = "observeSsxInfectionD")
	private boolean observeSsxInfectionD;

	@Column(name = "mDOrdersE")
	private boolean mDOrdersE;

	@Column(name = "mDOrdersD")
	private boolean mDOrdersD;

	@Column(name = "alertN")
	private boolean alertN;

	@Column(name = "appetiteGoodE")
	private boolean appetiteGoodE;

	@Column(name = "appetiteGoodD")
	private boolean appetiteGoodD;

	@Column(name = "appetiteGoodN")
	private boolean appetiteGoodN;

	@Column(name = "appetiteFairE")
	private boolean appetiteFairE;

	@Column(name = "appetiteFairD")
	private boolean appetiteFairD;

	@Column(name = "appetiteFairN")
	private boolean appetiteFairN;

	@Column(name = "appetitePoorN")
	private boolean appetitePoorN;

	@Column(name = "appetiteE")
	private boolean appetiteE;

	@Column(name = "appetiteD")
	private boolean appetiteD;

	@Column(name = "appetiteN")
	private boolean appetiteN;

	@Column(name = "orthoticsE")
	private boolean orthoticsE;

	@Column(name = "orthoticsD")
	private boolean orthoticsD;

	@Column(name = "orthoticsN")
	private boolean orthoticsN;

	@Column(name = "bracesE")
	private boolean bracesE;

	@Column(name = "bracesD")
	private boolean bracesD;

	@Column(name = "bracesN")
	private boolean bracesN;

	@Column(name = "respiratoryN")
	private boolean respiratoryN;

	@Column(name = "nursingRehabilitationE")
	private boolean nursingRehabilitationE;

	@Column(name = "nursingRehabilitationD")
	private boolean nursingRehabilitationD;

	@Column(name = "nursingRehabilitationN")
	private boolean nursingRehabilitationN;

	@Column(name = "therapyN")
	private boolean therapyN;

	@Column(name = "respiratoryE")
	private boolean respiratoryE;

	@Column(name = "respiratoryD")
	private boolean respiratoryD;

	@Column(name = "therapyE")
	private boolean therapyE;

	@Column(name = "therapyD")
	private boolean therapyD;

	@Column(name = "appetitePoorE")
	private boolean appetitePoorE;

	@Column(name = "appetitePoorD")
	private boolean appetitePoorD;

	@Column(name = "chillsE")
	private boolean chillsE;

	@Column(name = "chillsD")
	private boolean chillsD;

	@Column(name = "chillsN")
	private boolean chillsN;

	@Column(name = "cyanosisN")
	private boolean cyanosisN;

	@Column(name = "cyanosisE")
	private boolean cyanosisE;

	@Column(name = "cyanosisD")
	private boolean cyanosisD;

	@Column(name = "skinWnlE")
	private boolean skinWnlE;

	@Column(name = "skinWnlD")
	private boolean skinWnlD;

	@Column(name = "skinWnlN")
	private boolean skinWnlN;

	@Column(name = "abnormalTurgorE")
	private boolean abnormalTurgorE;

	@Column(name = "abnormalTurgorD")
	private boolean abnormalTurgorD;

	@Column(name = "abnormalTurgorN")
	private boolean abnormalTurgorN;

	@Column(name = "rashItchingN")
	private boolean rashItchingN;

	@Column(name = "rashItchingE")
	private boolean rashItchingE;

	@Column(name = "rashItchingD")
	private boolean rashItchingD;

	@Column(name = "flushingSkinE")
	private boolean flushingSkinE;

	@Column(name = "flushingSkinD")
	private boolean flushingSkinD;

	@Column(name = "flushingSkinN")
	private boolean flushingSkinN;

	@Column(name = "clammyE")
	private boolean clammyE;

	@Column(name = "clammyD")
	private boolean clammyD;

	@Column(name = "clammyN")
	private boolean clammyN;

	@Column(name = "pallorE")
	private boolean pallorE;

	@Column(name = "pallorD")
	private boolean pallorD;

	@Column(name = "pallorN")
	private boolean pallorN;

	@Column(name = "jaundicedN")
	private boolean jaundicedN;

	@Column(name = "jaundicedE")
	private boolean jaundicedE;

	@Column(name = "jaundicedD")
	private boolean jaundicedD;

	@Column(name = "guWnlE")
	private boolean guWnlE;

	@Column(name = "guWnlD")
	private boolean guWnlD;

	@Column(name = "guWnlN")
	private boolean guWnlN;

	@Column(name = "dischargeE")
	private boolean dischargeE;

	@Column(name = "dischargeN")
	private boolean dischargeN;

	@Column(name = "odorE")
	private boolean odorE;

	@Column(name = "odorD")
	private boolean odorD;

	@Column(name = "odorN")
	private boolean odorN;

	@Column(name = "sedimentE")
	private boolean sedimentE;

	@Column(name = "sedimentN")
	private boolean sedimentN;

	@Column(name = "discolouredE")
	private boolean discolouredE;

	@Column(name = "discolouredD")
	private boolean discolouredD;

	@Column(name = "discolouredN")
	private boolean discolouredN;

	@Column(name = "cathelerE")
	private boolean cathelerE;

	@Column(name = "cathelerD")
	private boolean cathelerD;

	@Column(name = "cathelerN")
	private boolean cathelerN;

	@Column(name = "hematuriaE")
	private boolean hematuriaE;

	@Column(name = "hematuriaD")
	private boolean hematuriaD;

	@Column(name = "hematuriaN")
	private boolean hematuriaN;

	@Column(name = "frequencyUrgencyD")
	private boolean frequencyUrgencyD;

	@Column(name = "frequencyUrgencyE")
	private boolean frequencyUrgencyE;

	@Column(name = "frequencyUrgencyN")
	private boolean frequencyUrgencyN;

	@Column(name = "distentionRetentionE")
	private boolean distentionRetentionE;

	@Column(name = "distentionRetentionD")
	private boolean distentionRetentionD;

	@Column(name = "distentionRetentionN")
	private boolean distentionRetentionN;

	@Column(name = "burningE")
	private boolean burningE;

	@Column(name = "burningD")
	private boolean burningD;

	@Column(name = "burningN")
	private boolean burningN;

	@Column(name = "eSignature")
	private String eSignature;

	@Column(name = "dSignature")
	private String dSignature;

	@Column(name = "nSignature")
	private String nsignature;

	@Column(name = "signatureTitle5")
	private String signatureTitle5;

	@Column(name = "signatureTitle4")
	private String signatureTitle4;

	@Column(name = "signatureTitle3")
	private String signatureTitle3;

	@Column(name = "signatureTitle2")
	private String signatureTitle2;

	@Column(name = "signatureTitle1")
	private String signatureTitle1;

	@Column(name = "comment5")
	private String comment5;

	@Column(name = "comment4")
	private String comment4;

	@Column(name = "comment3")
	private String comment3;

	@Column(name = "comment2")
	private String comment2;

	@Column(name = "comment1")
	private String comment1;

	@Column(name = "dateTime5")
	private String dateTime5;

	@Column(name = "dateTime4")
	private String dateTime4;

	@Column(name = "dateTime3")
	private String dateTime3;

	@Column(name = "dateTime2")
	private String dateTime2;

	@Column(name = "dateTime1")
	private String dateTime1;

	@Column(name = "dateOfNote")
	private String date;

	@Column(name = "temprature")
	private String temprature;

	@Column(name = "pulse")
	private String pulse;

	@Column(name = "respiration")
	private String respiration;

	@Column(name = "bloodPressure")
	private String bloodPressure;

	@Column(name = "alertD")
	private boolean alertD;

	@Column(name = "alertE")
	private boolean alertE;

	@Column(name = "orientedToN")
	private boolean orientedToN;

	@Column(name = "orientedToD")
	private boolean orientedToD;

	@Column(name = "orientedToE")
	private boolean orientedToE;

	@Column(name = "personN")
	private boolean personN;

	@Column(name = "personD")
	private boolean personD;

	@Column(name = "personE")
	private boolean personE;

	@Column(name = "placeN")
	private boolean placeN;

	@Column(name = "placeD")
	private boolean placeD;

	@Column(name = "placeE")
	private boolean placeE;

	@Column(name = "timeN")
	private boolean timeN;

	@Column(name = "timeD")
	private boolean timeD;

	@Column(name = "timeE")
	private boolean timeE;

	@Column(name = "anxiousAgitatedN")
	private boolean anxiousAgitatedN;

	@Column(name = "anxiousAgitatedD")
	private boolean anxiousAgitatedD;

	@Column(name = "anxiousAgitatedE")
	private boolean anxiousAgitatedE;

	@Column(name = "restlessLethargicN")
	private boolean restlessLethargicN;

	@Column(name = "restlessLethargicD")
	private boolean restlessLethargicD;

	@Column(name = "restlessLethargicE")
	private boolean restlessLethargicE;

	@Column(name = "abnormalSleepN")
	private boolean abnormalSleepN;

	@Column(name = "abnormalSleepD")
	private boolean abnormalSleepD;

	@Column(name = "abnormalSleepE")
	private boolean abnormalSleepE;

	@Column(name = "forgetfulConfusedN")
	private boolean forgetfulConfusedN;

	@Column(name = "forgetfulConfusedD")
	private boolean forgetfulConfusedD;

	@Column(name = "forgetfulConfusedE")
	private boolean forgetfulConfusedE;

	@Column(name = "hallucinationDelusionN")
	private boolean hallucinationDelusionN;

	@Column(name = "hallucinationDelusionD")
	private boolean hallucinationDelusionD;

	@Column(name = "hallucinationDelusionE")
	private boolean hallucinationDelusionE;

	@Column(name = "regularRhythmN")
	private boolean regularRhythmN;

	@Column(name = "regularRhythmD")
	private boolean regularRhythmD;

	@Column(name = "regularRhythmE")
	private boolean regularRhythmE;

	@Column(name = "radialApicalIrregularN")
	private boolean radialApicalIrregularN;

	@Column(name = "radialApicalIrregularD")
	private boolean radialApicalIrregularD;

	@Column(name = "radialApicalIrregularE")
	private boolean radialApicalIrregularE;

	@Column(name = "chestPainN")
	private boolean chestPainN;

	@Column(name = "chestPainD")
	private boolean chestPainD;

	@Column(name = "chestPainE")
	private boolean chestPainE;

	@Column(name = "pedalLtRtN")
	private boolean pedalLtRtN;

	@Column(name = "pedalLtRtD")
	private boolean pedalLtRtD;

	@Column(name = "pedalLtRtE")
	private boolean pedalLtRtE;

	@Column(name = "pitting1N")
	private boolean pitting1N;

	@Column(name = "pitting1D")
	private boolean pitting1D;

	@Column(name = "pitting1E")
	private boolean pitting1E;

	@Column(name = "pitting2N")
	private boolean pitting2N;

	@Column(name = "pitting2D")
	private boolean pitting2D;

	@Column(name = "pitting2E")
	private boolean pitting2E;

	@Column(name = "pitting3N")
	private boolean pitting3N;

	@Column(name = "pitting3D")
	private boolean pitting3D;

	@Column(name = "pitting3E")
	private boolean pitting3E;

	@Column(name = "pitting4N")
	private boolean pitting4N;

	@Column(name = "pitting4D")
	private boolean pitting4D;

	@Column(name = "pitting4E")
	private boolean pitting4E;

	@Column(name = "abnormalPeriheralPulsesN")
	private boolean abnormalPeriheralPulsesN;

	@Column(name = "abnormalPeriheralPulsesD")
	private boolean abnormalPeriheralPulsesD;

	@Column(name = "abnormalPeriheralPulsesE")
	private boolean abnormalPeriheralPulsesE;

	@Column(name = "cardiovascularWnlN")
	private boolean cardiovascularWnlN;

	@Column(name = "cardiovascularWnlD")
	private boolean cardiovascularWnlD;

	@Column(name = "cardiovascularWnlE")
	private boolean cardiovascularWnlE;

	@Column(name = "nauseaVomittingN")
	private boolean nauseaVomittingN;

	@Column(name = "nauseaVomittingD")
	private boolean nauseaVomittingD;

	@Column(name = "nauseaVomittingE")
	private boolean nauseaVomittingE;

	@Column(name = "epigasticDistressN")
	private boolean epigasticDistressN;

	@Column(name = "epigasticDistressD")
	private boolean epigasticDistressD;

	@Column(name = "epigasticDistressE")
	private boolean epigasticDistressE;

	@Column(name = "difficaultySwallowingN")
	private boolean difficaultySwallowingN;

	@Column(name = "difficaultySwallowingD")
	private boolean difficaultySwallowingD;

	@Column(name = "difficaultySwallowingE")
	private boolean difficaultySwallowingE;

	@Column(name = "abdominalDistentonN")
	private boolean abdominalDistentonN;

	@Column(name = "abdominalDistentonD")
	private boolean abdominalDistentonD;

	@Column(name = "abdominalDistentonE")
	private boolean abdominalDistentonE;

	@Column(name = "diarrheaN")
	private boolean diarrheaN;

	@Column(name = "diarrheaD")
	private boolean diarrheaD;

	@Column(name = "diarrheaE")
	private boolean diarrheaE;

	@Column(name = "constipationN")
	private boolean constipationN;

	@Column(name = "constipationD")
	private boolean constipationD;

	@Column(name = "constipationE")
	private boolean constipationE;

	@Column(name = "bowelSoundsN")
	private boolean bowelSoundsN;

	@Column(name = "bowelSoundsD")
	private boolean bowelSoundsD;

	@Column(name = "bowelSoundsE")
	private boolean bowelSoundsE;

	@Column(name = "presentN")
	private boolean presentN;

	@Column(name = "presentD")
	private boolean presentD;

	@Column(name = "presentE")
	private boolean presentE;

	@Column(name = "absentN")
	private boolean absentN;

	@Column(name = "absentD")
	private boolean absentD;

	@Column(name = "absentE")
	private boolean absentE;

	@Column(name = "hyperActiveN")
	private boolean hyperActiveN;

	@Column(name = "hyperActiveD")
	private boolean hyperActiveD;

	@Column(name = "hyperActiveE")
	private boolean hyperActiveE;

	@Column(name = "hypoActiveN")
	private boolean hypoActiveN;

	@Column(name = "hypoActiveD")
	private boolean hypoActiveD;

	@Column(name = "hypoActiveE")
	private boolean hypoActiveE;

	@Column(name = "balanceGaitUnsteadyN")
	private boolean balanceGaitUnsteadyN;

	@Column(name = "balanceGaitUnsteadyD")
	private boolean balanceGaitUnsteadyD;

	@Column(name = "balanceGaitUnsteadyE")
	private boolean balanceGaitUnsteadyE;

	@Column(name = "paralysisN")
	private boolean paralysisN;

	@Column(name = "paralysisD")
	private boolean paralysisD;

	@Column(name = "paralysisE")
	private boolean paralysisE;

	@Column(name = "musculoSkeketalWnlN")
	private boolean musculoSkeketalWnlN;

	@Column(name = "musculoSkeketalWnlD")
	private boolean musculoSkeketalWnlD;

	@Column(name = "musculoSkeketalWnlE")
	private boolean musculoSkeketalWnlE;

	@Column(name = "synCopeN")
	private boolean synCopeN;

	@Column(name = "synCopeD")
	private boolean synCopeD;

	@Column(name = "synCopeE")
	private boolean synCopeE;

	@Column(name = "headAcheN")
	private boolean headAcheN;

	@Column(name = "headAcheD")
	private boolean headAcheD;

	@Column(name = "headAcheE")
	private boolean headAcheE;

	@Column(name = "decreasedGraspE")
	private boolean decreasedGraspE;

	@Column(name = "nervousSystemRtN")
	private boolean nervousSystemRtN;

	@Column(name = "nervousSystemRtD")
	private boolean nervousSystemRtD;

	@Column(name = "nervousSystemRtE")
	private boolean nervousSystemRtE;

	@Column(name = "nervousSystemLtN")
	private boolean nervousSystemLtN;

	@Column(name = "nervousSystemLtD")
	private boolean nervousSystemLtD;

	@Column(name = "nervousSystemLtE")
	private boolean nervousSystemLtE;

	@Column(name = "decresedMovementE")
	private boolean decresedMovementE;

	@Column(name = "rueLueN")
	private boolean rueLueN;

	@Column(name = "rueLueD")
	private boolean rueLueD;

	@Column(name = "rueLueE")
	private boolean rueLueE;

	@Column(name = "rleLLeN")
	private boolean rleLLeN;

	@Column(name = "rleLLeD")
	private boolean rleLLeD;

	@Column(name = "rleLLeE")
	private boolean rleLLeE;

	@Column(name = "abnormalPupilReactionE")
	private boolean abnormalPupilReactionE;

	@Column(name = "abnormalPupilReactionN")
	private boolean abnormalReactionRightN;

	@Column(name = "abnormalPupilReactionD")
	private boolean abnormalReactionRightD;

	@Column(name = "abnormalReactionRightE")
	private boolean abnormalReactionRightE;

	@Column(name = "abnormalReactionLeftN")
	private boolean abnormalReactionLeftN;

	@Column(name = "abnormalReactionLeftD")
	private boolean abnormalReactionLeftD;

	@Column(name = "abnormalReactionLeftE")
	private boolean abnormalReactionLeftE;

	@Column(name = "tremorsN")
	private boolean tremorsN;

	@Column(name = "tremorsD")
	private boolean tremorsD;

	@Column(name = "tremorsE")
	private boolean tremorsE;

	@Column(name = "vertigoN")
	private boolean vertigoN;

	@Column(name = "vertigoD")
	private boolean vertigoD;

	@Column(name = "vertigoE")
	private boolean vertigoE;

	@Column(name = "nervousSystemWnlN")
	private boolean nervousSystemWnlN;

	@Column(name = "nervousSystemWnlD")
	private boolean nervousSystemWnlD;

	@Column(name = "nervousSystemWnlE")
	private boolean nervousSystemWnlE;

	@Column(name = "leboredBreathingD")
	private boolean leboredBreathingD;

	@Column(name = "leboredBreathingE")
	private boolean leboredBreathingE;

	@Column(name = "leboredBreathingN")
	private boolean leboredBreathingN;

	@Column(name = "shallowRespirationN")
	private boolean shallowRespirationN;

	@Column(name = "shallowRespirationD")
	private boolean shallowRespirationD;

	@Column(name = "shallowRespirationE")
	private boolean shallowRespirationE;

	@Column(name = "ratesRhonchiN")
	private boolean ratesRhonchiN;

	@Column(name = "ratesRhonchiD")
	private boolean ratesRhonchiD;

	@Column(name = "ratesRhonchiE")
	private boolean ratesRhonchiE;

	@Column(name = "wheezingN")
	private boolean wheezingN;

	@Column(name = "wheezingD")
	private boolean wheezingD;

	@Column(name = "wheezingE")
	private boolean wheezingE;

	@Column(name = "coughN")
	private boolean coughN;

	@Column(name = "coughD")
	private boolean coughD;

	@Column(name = "coughE")
	private boolean coughE;

	@Column(name = "dyspneaSobN")
	private boolean dyspneaSobN;

	@Column(name = "dyspneaSobD")
	private boolean dyspneaSobD;

	@Column(name = "dyspneaSobE")
	private boolean dyspneaSobE;

	@Column(name = "q2LpmN")
	private boolean q2LpmN;

	@Column(name = "q2LpmD")
	private boolean q2LpmD;

	@Column(name = "q2LpmE")
	private boolean q2LpmE;

	@Column(name = "prnN")
	private boolean prnN;

	@Column(name = "prnD")
	private boolean prnD;

	@Column(name = "prnE")
	private boolean prnE;

	@Column(name = "continuousN")
	private boolean continuousN;

	@Column(name = "continuousD")
	private boolean continuousD;

	@Column(name = "continuousE")
	private boolean continuousE;

	@Column(name = "s2O2N")
	private boolean s2O2N;

	@Column(name = "s2O2D")
	private boolean s2O2D;

	@Column(name = "s2O2E")
	private boolean s2O2E;

	@Column(name = "suctioningN")
	private boolean suctioningN;

	@Column(name = "suctioningD")
	private boolean suctioningD;

	@Column(name = "suctioningE")
	private boolean suctioningE;

	@Column(name = "trachCareN")
	private boolean trachCareN;

	@Column(name = "trachCareD")
	private boolean trachCareD;

	@Column(name = "trachCareE")
	private boolean trachCareE;

	@Column(name = "ventCareN")
	private boolean ventCareN;

	@Column(name = "ventCareD")
	private boolean ventCareD;

	@Column(name = "ventCareE")
	private boolean ventCareE;

	@Column(name = "lungsClearN")
	private boolean lungsClearN;

	@Column(name = "respiratoryWnlN")
	private boolean respiratoryWnlN;

	@Column(name = "lungsClearD")
	private boolean lungsClearD;

	@Column(name = "lungsClearE")
	private boolean lungsClearE;

	@Column(name = "respiratoryWnlE")
	private boolean respiratoryWnlE;

	@Column(name = "respiratoryWnlD")
	private boolean respiratoryWnlD;

	@Column(name = "originN")
	private boolean originN;

	@Column(name = "originD")
	private boolean originD;

	@Column(name = "originE")
	private boolean originE;

	@Column(name = "locationN")
	private boolean locationN;

	@Column(name = "locationD")
	private boolean locationD;

	@Column(name = "locationE")
	private boolean locationE;

	@Column(name = "intensityN")
	private boolean intensityN;

	@Column(name = "intensityD")
	private boolean intensityD;

	@Column(name = "intensityE")
	private boolean intensityE;

	@Column(name = "noneN")
	private boolean noneN;

	@Column(name = "noneD")
	private boolean noneD;

	@Column(name = "noneE")
	private boolean noneE;

	@Column(name = "mDNotifiedE")
	private boolean mDNotifiedE;

	@Column(name = "mDNotifiedN")
	private boolean mDNotifiedN;

	@Column(name = "skilledObservationAssessmentN")
	private boolean skilledObservationAssessmentN;

	@Column(name = "skilledObservationAssessmentD")
	private boolean skilledObservationAssessmentD;

	@Column(name = "skilledObservationAssessmentE")
	private boolean skilledObservationAssessmentE;

	@Column(name = "diabeticManagementN")
	private boolean diabeticManagementN;

	@Column(name = "diabeticManagementD")
	private boolean diabeticManagementD;

	@Column(name = "diabeticManagementE")
	private boolean diabeticManagementE;

	@Column(name = "glucometerReadingN")
	private boolean glucometerReadingN;

	@Column(name = "glucometerReadingD")
	private boolean glucometerReadingD;

	@Column(name = "glucometerReadingE")
	private boolean glucometerReadingE;

	@Column(name = "dehaydrationN")
	private boolean dehaydrationN;

	@Column(name = "dehaydrationD")
	private boolean dehaydrationD;

	@Column(name = "dehaydrationE")
	private boolean dehaydrationE;

	@Column(name = "managementTeachingN")
	private boolean managementTeachingN;

	@Column(name = "managementTeachingD")
	private boolean managementTeachingD;

	@Column(name = "managementTeachingE")
	private boolean managementTeachingE;

	@Column(name = "dialysisManagementN")
	private boolean dialysisManagementN;

	@Column(name = "dialysisManagementD")
	private boolean dialysisManagementD;

	@Column(name = "dialysisManagementE")
	private boolean dialysisManagementE;

	@Column(name = "sideEffectN")
	private boolean sideEffectN;

	@Column(name = "sideEffectD")
	private boolean sideEffectD;

	@Column(name = "sideEffectE")
	private boolean sideEffectE;

	@Column(name = "mDOrdersN")
	private boolean mDOrdersN;

	@Column(name = "translusionD")
	private boolean translusionD;

	@Column(name = "translusionE")
	private boolean translusionE;

	@Column(name = "translusionN")
	private boolean translusionN;

	@Column(name = "careN")
	private boolean careN;

	@Column(name = "careD")
	private boolean careD;

	@Column(name = "careE")
	private boolean careE;

	@Column(name = "injectableMedsN")
	private boolean injectableMedsN;

	@Column(name = "injectableMedsD")
	private boolean injectableMedsD;

	@Column(name = "injectableMedsE")
	private boolean injectableMedsE;

	@Column(name = "careTeachN")
	private boolean careTeachN;

	@Column(name = "careTeachD")
	private boolean careTeachD;

	@Column(name = "careTeachE")
	private boolean careTeachE;

	@Column(name = "dietTeachingN")
	private boolean dietTeachingN;

	@Column(name = "dietTeachingD")
	private boolean dietTeachingD;

	@Column(name = "dietTeachingE")
	private boolean dietTeachingE;

	@Column(name = "bowelBladderTrainingN")
	private boolean bowelBladderTrainingN;

	@Column(name = "bowelBladderTrainingD")
	private boolean bowelBladderTrainingD;

	@Column(name = "bowelBladderTrainingE")
	private boolean bowelBladderTrainingE;

	@Column(name = "sitesN")
	private boolean sitesN;

	@Column(name = "sitesD")
	private boolean sitesD;

	@Column(name = "sitesE")
	private boolean sitesE;

	@Column(name = "observeSsxInfectionN")
	private boolean observeSsxInfectionN;

	@Column(name = "pressureUlcerCareD")
	private boolean pressureUlcerCareD;

	@Column(name = "pressureUlcerCareE")
	private boolean pressureUlcerCareE;

	@Column(name = "pressureUlcerCareN")
	private boolean pressureUlcerCareN;

	@Column(name = "tracheostomyCareN")
	private boolean tracheostomyCareN;

	@Column(name = "tracheostomyCareD")
	private boolean tracheostomyCareD;

	@Column(name = "tracheostomyCareE")
	private boolean tracheostomyCareE;

	@Column(name = "painSuctiongN")
	private boolean painSuctiongN;

	@Column(name = "painSuctiongD")
	private boolean painSuctiongD;

	@Column(name = "painSuctiongE")
	private boolean painSuctiongE;

	@Column(name = "medicationN")
	private boolean medicationN;

	@Column(name = "medicationD")
	private boolean medicationD;

	@Column(name = "medicationE")
	private boolean medicationE;

	@Column(name = "feedingHydrationN")
	private boolean feedingHydrationN;

	@Column(name = "feedingHydrationD")
	private boolean feedingHydrationD;

	@Column(name = "feedingHydrationE")
	private boolean feedingHydrationE;

	@Column(name = "intramuscularInjectionsN")
	private boolean intramuscularInjectionsN;

	@Column(name = "tubeFeedingN")
	private boolean tubeFeedingN;

	@Column(name = "tubeFeedingD")
	private boolean tubeFeedingD;

	@Column(name = "tubeFeedingE")
	private boolean tubeFeedingE;

	@Column(name = "painManagementN")
	private boolean painManagementN;

	@Column(name = "painManagementD")
	private boolean painManagementD;

	@Column(name = "painManagementE")
	private boolean painManagementE;

	@Column(name = "woundCareDressingN")
	private boolean woundCareDressingN;

	@Column(name = "statisUlcersN")
	private boolean statisUlcersN;

	@Column(name = "sedimentD")
	private boolean sedimentD;

	@Column(name = "dischargeD")
	private boolean dischargeD;

	public boolean isIntramuscularInjectionsE() {
		return this.intramuscularInjectionsE;
	}

	public void setIntramuscularInjectionsE(boolean intramuscularInjectionsE) {
		this.intramuscularInjectionsE = intramuscularInjectionsE;
	}

	public boolean isIntramuscularInjectionsD() {
		return this.intramuscularInjectionsD;
	}

	public void setIntramuscularInjectionsD(boolean intramuscularInjectionsD) {
		this.intramuscularInjectionsD = intramuscularInjectionsD;
	}

	public boolean isStatisUlcersE() {
		return this.statisUlcersE;
	}

	public void setStatisUlcersE(boolean statisUlcersE) {
		this.statisUlcersE = statisUlcersE;
	}

	public boolean isStatisUlcersD() {
		return this.statisUlcersD;
	}

	public void setStatisUlcersD(boolean statisUlcersD) {
		this.statisUlcersD = statisUlcersD;
	}

	public boolean isWoundCareDressingE() {
		return this.woundCareDressingE;
	}

	public void setWoundCareDressingE(boolean woundCareDressingE) {
		this.woundCareDressingE = woundCareDressingE;
	}

	public boolean isWoundCareDressingD() {
		return this.woundCareDressingD;
	}

	public void setWoundCareDressingD(boolean woundCareDressingD) {
		this.woundCareDressingD = woundCareDressingD;
	}

	public boolean isObserveSsxInfectionE() {
		return this.observeSsxInfectionE;
	}

	public void setObserveSsxInfectionE(boolean observeSsxInfectionE) {
		this.observeSsxInfectionE = observeSsxInfectionE;
	}

	public boolean isObserveSsxInfectionD() {
		return this.observeSsxInfectionD;
	}

	public void setObserveSsxInfectionD(boolean observeSsxInfectionD) {
		this.observeSsxInfectionD = observeSsxInfectionD;
	}

	public boolean isMDOrdersE() {
		return this.mDOrdersE;
	}

	public void setMDOrdersE(boolean mDOrdersE) {
		this.mDOrdersE = mDOrdersE;
	}

	public boolean isMDOrdersD() {
		return this.mDOrdersD;
	}

	public void setMDOrdersD(boolean mDOrdersD) {
		this.mDOrdersD = mDOrdersD;
	}

	public boolean isAlertN() {
		return this.alertN;
	}

	public void setAlertN(boolean alertN) {
		this.alertN = alertN;
	}

	public boolean isAppetiteGoodE() {
		return this.appetiteGoodE;
	}

	public void setAppetiteGoodE(boolean appetiteGoodE) {
		this.appetiteGoodE = appetiteGoodE;
	}

	public boolean isAppetiteGoodD() {
		return this.appetiteGoodD;
	}

	public void setAppetiteGoodD(boolean appetiteGoodD) {
		this.appetiteGoodD = appetiteGoodD;
	}

	public boolean isAppetiteGoodN() {
		return this.appetiteGoodN;
	}

	public void setAppetiteGoodN(boolean appetiteGoodN) {
		this.appetiteGoodN = appetiteGoodN;
	}

	public boolean isAppetiteFairE() {
		return this.appetiteFairE;
	}

	public void setAppetiteFairE(boolean appetiteFairE) {
		this.appetiteFairE = appetiteFairE;
	}

	public boolean isAppetiteFairD() {
		return this.appetiteFairD;
	}

	public void setAppetiteFairD(boolean appetiteFairD) {
		this.appetiteFairD = appetiteFairD;
	}

	public boolean isAppetiteFairN() {
		return this.appetiteFairN;
	}

	public void setAppetiteFairN(boolean appetiteFairN) {
		this.appetiteFairN = appetiteFairN;
	}

	public boolean isAppetitePoorN() {
		return this.appetitePoorN;
	}

	public void setAppetitePoorN(boolean appetitePoorN) {
		this.appetitePoorN = appetitePoorN;
	}

	public boolean isAppetiteE() {
		return this.appetiteE;
	}

	public void setAppetiteE(boolean appetiteE) {
		this.appetiteE = appetiteE;
	}

	public boolean isAppetiteD() {
		return this.appetiteD;
	}

	public void setAppetiteD(boolean appetiteD) {
		this.appetiteD = appetiteD;
	}

	public boolean isAppetiteN() {
		return this.appetiteN;
	}

	public void setAppetiteN(boolean appetiteN) {
		this.appetiteN = appetiteN;
	}

	public boolean isOrthoticsE() {
		return this.orthoticsE;
	}

	public void setOrthoticsE(boolean orthoticsE) {
		this.orthoticsE = orthoticsE;
	}

	public boolean isOrthoticsD() {
		return this.orthoticsD;
	}

	public void setOrthoticsD(boolean orthoticsD) {
		this.orthoticsD = orthoticsD;
	}

	public boolean isOrthoticsN() {
		return this.orthoticsN;
	}

	public void setOrthoticsN(boolean orthoticsN) {
		this.orthoticsN = orthoticsN;
	}

	public boolean isBracesE() {
		return this.bracesE;
	}

	public void setBracesE(boolean bracesE) {
		this.bracesE = bracesE;
	}

	public boolean isBracesD() {
		return this.bracesD;
	}

	public void setBracesD(boolean bracesD) {
		this.bracesD = bracesD;
	}

	public boolean isBracesN() {
		return this.bracesN;
	}

	public void setBracesN(boolean bracesN) {
		this.bracesN = bracesN;
	}

	public boolean isRespiratoryN() {
		return this.respiratoryN;
	}

	public void setRespiratoryN(boolean respiratoryN) {
		this.respiratoryN = respiratoryN;
	}

	public boolean isNursingRehabilitationE() {
		return this.nursingRehabilitationE;
	}

	public void setNursingRehabilitationE(boolean nursingRehabilitationE) {
		this.nursingRehabilitationE = nursingRehabilitationE;
	}

	public boolean isNursingRehabilitationD() {
		return this.nursingRehabilitationD;
	}

	public void setNursingRehabilitationD(boolean nursingRehabilitationD) {
		this.nursingRehabilitationD = nursingRehabilitationD;
	}

	public boolean isNursingRehabilitationN() {
		return this.nursingRehabilitationN;
	}

	public void setNursingRehabilitationN(boolean nursingRehabilitationN) {
		this.nursingRehabilitationN = nursingRehabilitationN;
	}

	public boolean isTherapyN() {
		return this.therapyN;
	}

	public void setTherapyN(boolean therapyN) {
		this.therapyN = therapyN;
	}

	public boolean isRespiratoryE() {
		return this.respiratoryE;
	}

	public void setRespiratoryE(boolean respiratoryE) {
		this.respiratoryE = respiratoryE;
	}

	public boolean isRespiratoryD() {
		return this.respiratoryD;
	}

	public void setRespiratoryD(boolean respiratoryD) {
		this.respiratoryD = respiratoryD;
	}

	public boolean isTherapyE() {
		return this.therapyE;
	}

	public void setTherapyE(boolean therapyE) {
		this.therapyE = therapyE;
	}

	public boolean isTherapyD() {
		return this.therapyD;
	}

	public void setTherapyD(boolean therapyD) {
		this.therapyD = therapyD;
	}

	public boolean isAppetitePoorE() {
		return this.appetitePoorE;
	}

	public void setAppetitePoorE(boolean appetitePoorE) {
		this.appetitePoorE = appetitePoorE;
	}

	public boolean isAppetitePoorD() {
		return this.appetitePoorD;
	}

	public void setAppetitePoorD(boolean appetitePoorD) {
		this.appetitePoorD = appetitePoorD;
	}

	public boolean isChillsE() {
		return this.chillsE;
	}

	public void setChillsE(boolean chillsE) {
		this.chillsE = chillsE;
	}

	public boolean isChillsD() {
		return this.chillsD;
	}

	public void setChillsD(boolean chillsD) {
		this.chillsD = chillsD;
	}

	public boolean isChillsN() {
		return this.chillsN;
	}

	public void setChillsN(boolean chillsN) {
		this.chillsN = chillsN;
	}

	public boolean isCyanosisN() {
		return this.cyanosisN;
	}

	public void setCyanosisN(boolean cyanosisN) {
		this.cyanosisN = cyanosisN;
	}

	public boolean isCyanosisE() {
		return this.cyanosisE;
	}

	public void setCyanosisE(boolean cyanosisE) {
		this.cyanosisE = cyanosisE;
	}

	public boolean isCyanosisD() {
		return this.cyanosisD;
	}

	public void setCyanosisD(boolean cyanosisD) {
		this.cyanosisD = cyanosisD;
	}

	public boolean isSkinWnlE() {
		return this.skinWnlE;
	}

	public void setSkinWnlE(boolean skinWnlE) {
		this.skinWnlE = skinWnlE;
	}

	public boolean isSkinWnlD() {
		return this.skinWnlD;
	}

	public void setSkinWnlD(boolean skinWnlD) {
		this.skinWnlD = skinWnlD;
	}

	public boolean isSkinWnlN() {
		return this.skinWnlN;
	}

	public void setSkinWnlN(boolean skinWnlN) {
		this.skinWnlN = skinWnlN;
	}

	public boolean isAbnormalTurgorE() {
		return this.abnormalTurgorE;
	}

	public void setAbnormalTurgorE(boolean abnormalTurgorE) {
		this.abnormalTurgorE = abnormalTurgorE;
	}

	public boolean isAbnormalTurgorD() {
		return this.abnormalTurgorD;
	}

	public void setAbnormalTurgorD(boolean abnormalTurgorD) {
		this.abnormalTurgorD = abnormalTurgorD;
	}

	public boolean isAbnormalTurgorN() {
		return this.abnormalTurgorN;
	}

	public void setAbnormalTurgorN(boolean abnormalTurgorN) {
		this.abnormalTurgorN = abnormalTurgorN;
	}

	public boolean isRashItchingN() {
		return this.rashItchingN;
	}

	public void setRashItchingN(boolean rashItchingN) {
		this.rashItchingN = rashItchingN;
	}

	public boolean isRashItchingE() {
		return this.rashItchingE;
	}

	public void setRashItchingE(boolean rashItchingE) {
		this.rashItchingE = rashItchingE;
	}

	public boolean isRashItchingD() {
		return this.rashItchingD;
	}

	public void setRashItchingD(boolean rashItchingD) {
		this.rashItchingD = rashItchingD;
	}

	public boolean isFlushingSkinE() {
		return this.flushingSkinE;
	}

	public void setFlushingSkinE(boolean flushingSkinE) {
		this.flushingSkinE = flushingSkinE;
	}

	public boolean isFlushingSkinD() {
		return this.flushingSkinD;
	}

	public void setFlushingSkinD(boolean flushingSkinD) {
		this.flushingSkinD = flushingSkinD;
	}

	public boolean isFlushingSkinN() {
		return this.flushingSkinN;
	}

	public void setFlushingSkinN(boolean flushingSkinN) {
		this.flushingSkinN = flushingSkinN;
	}

	public boolean isClammyE() {
		return this.clammyE;
	}

	public void setClammyE(boolean clammyE) {
		this.clammyE = clammyE;
	}

	public boolean isClammyD() {
		return this.clammyD;
	}

	public void setClammyD(boolean clammyD) {
		this.clammyD = clammyD;
	}

	public boolean isClammyN() {
		return this.clammyN;
	}

	public void setClammyN(boolean clammyN) {
		this.clammyN = clammyN;
	}

	public boolean isPallorE() {
		return this.pallorE;
	}

	public void setPallorE(boolean pallorE) {
		this.pallorE = pallorE;
	}

	public boolean isPallorD() {
		return this.pallorD;
	}

	public void setPallorD(boolean pallorD) {
		this.pallorD = pallorD;
	}

	public boolean isPallorN() {
		return this.pallorN;
	}

	public void setPallorN(boolean pallorN) {
		this.pallorN = pallorN;
	}

	public boolean isJaundicedN() {
		return this.jaundicedN;
	}

	public void setJaundicedN(boolean jaundicedN) {
		this.jaundicedN = jaundicedN;
	}

	public boolean isJaundicedE() {
		return this.jaundicedE;
	}

	public void setJaundicedE(boolean jaundicedE) {
		this.jaundicedE = jaundicedE;
	}

	public boolean isJaundicedD() {
		return this.jaundicedD;
	}

	public void setJaundicedD(boolean jaundicedD) {
		this.jaundicedD = jaundicedD;
	}

	public boolean isGuWnlE() {
		return this.guWnlE;
	}

	public void setGuWnlE(boolean guWnlE) {
		this.guWnlE = guWnlE;
	}

	public boolean isGuWnlD() {
		return this.guWnlD;
	}

	public void setGuWnlD(boolean guWnlD) {
		this.guWnlD = guWnlD;
	}

	public boolean isGuWnlN() {
		return this.guWnlN;
	}

	public void setGuWnlN(boolean guWnlN) {
		this.guWnlN = guWnlN;
	}

	public boolean isDischargeE() {
		return this.dischargeE;
	}

	public void setDischargeE(boolean dischargeE) {
		this.dischargeE = dischargeE;
	}

	public boolean isDischargeN() {
		return this.dischargeN;
	}

	public void setDischargeN(boolean dischargeN) {
		this.dischargeN = dischargeN;
	}

	public boolean isOdorE() {
		return this.odorE;
	}

	public void setOdorE(boolean odorE) {
		this.odorE = odorE;
	}

	public boolean isOdorD() {
		return this.odorD;
	}

	public void setOdorD(boolean odorD) {
		this.odorD = odorD;
	}

	public boolean isOdorN() {
		return this.odorN;
	}

	public void setOdorN(boolean odorN) {
		this.odorN = odorN;
	}

	public boolean isSedimentE() {
		return this.sedimentE;
	}

	public void setSedimentE(boolean sedimentE) {
		this.sedimentE = sedimentE;
	}

	public boolean isSedimentN() {
		return this.sedimentN;
	}

	public void setSedimentN(boolean sedimentN) {
		this.sedimentN = sedimentN;
	}

	public boolean isDiscolouredE() {
		return this.discolouredE;
	}

	public void setDiscolouredE(boolean discolouredE) {
		this.discolouredE = discolouredE;
	}

	public boolean isDiscolouredD() {
		return this.discolouredD;
	}

	public void setDiscolouredD(boolean discolouredD) {
		this.discolouredD = discolouredD;
	}

	public boolean isDiscolouredN() {
		return this.discolouredN;
	}

	public void setDiscolouredN(boolean discolouredN) {
		this.discolouredN = discolouredN;
	}

	public boolean isCathelerE() {
		return this.cathelerE;
	}

	public void setCathelerE(boolean cathelerE) {
		this.cathelerE = cathelerE;
	}

	public boolean isCathelerD() {
		return this.cathelerD;
	}

	public void setCathelerD(boolean cathelerD) {
		this.cathelerD = cathelerD;
	}

	public boolean isCathelerN() {
		return this.cathelerN;
	}

	public void setCathelerN(boolean cathelerN) {
		this.cathelerN = cathelerN;
	}

	public boolean isHematuriaE() {
		return this.hematuriaE;
	}

	public void setHematuriaE(boolean hematuriaE) {
		this.hematuriaE = hematuriaE;
	}

	public boolean isHematuriaD() {
		return this.hematuriaD;
	}

	public void setHematuriaD(boolean hematuriaD) {
		this.hematuriaD = hematuriaD;
	}

	public boolean isHematuriaN() {
		return this.hematuriaN;
	}

	public void setHematuriaN(boolean hematuriaN) {
		this.hematuriaN = hematuriaN;
	}

	public boolean isFrequencyUrgencyD() {
		return this.frequencyUrgencyD;
	}

	public void setFrequencyUrgencyD(boolean frequencyUrgencyD) {
		this.frequencyUrgencyD = frequencyUrgencyD;
	}

	public boolean isFrequencyUrgencyE() {
		return this.frequencyUrgencyE;
	}

	public void setFrequencyUrgencyE(boolean frequencyUrgencyE) {
		this.frequencyUrgencyE = frequencyUrgencyE;
	}

	public boolean isFrequencyUrgencyN() {
		return this.frequencyUrgencyN;
	}

	public void setFrequencyUrgencyN(boolean frequencyUrgencyN) {
		this.frequencyUrgencyN = frequencyUrgencyN;
	}

	public boolean isDistentionRetentionE() {
		return this.distentionRetentionE;
	}

	public void setDistentionRetentionE(boolean distentionRetentionE) {
		this.distentionRetentionE = distentionRetentionE;
	}

	public boolean isDistentionRetentionD() {
		return this.distentionRetentionD;
	}

	public void setDistentionRetentionD(boolean distentionRetentionD) {
		this.distentionRetentionD = distentionRetentionD;
	}

	public boolean isDistentionRetentionN() {
		return this.distentionRetentionN;
	}

	public void setDistentionRetentionN(boolean distentionRetentionN) {
		this.distentionRetentionN = distentionRetentionN;
	}

	public boolean isBurningE() {
		return this.burningE;
	}

	public void setBurningE(boolean burningE) {
		this.burningE = burningE;
	}

	public boolean isBurningD() {
		return this.burningD;
	}

	public void setBurningD(boolean burningD) {
		this.burningD = burningD;
	}

	public boolean isBurningN() {
		return this.burningN;
	}

	public void setBurningN(boolean burningN) {
		this.burningN = burningN;
	}

	public String getESignature() {
		return this.eSignature;
	}

	public void setESignature(String eSignature) {
		this.eSignature = eSignature;
	}

	public String getDSignature() {
		return this.dSignature;
	}

	public void setDSignature(String dSignature) {
		this.dSignature = dSignature;
	}

	public String getNsignature() {
		return this.nsignature;
	}

	public void setNsignature(String nsignature) {
		this.nsignature = nsignature;
	}

	public String getSignatureTitle5() {
		return this.signatureTitle5;
	}

	public void setSignatureTitle5(String signatureTitle5) {
		this.signatureTitle5 = signatureTitle5;
	}

	public String getSignatureTitle4() {
		return this.signatureTitle4;
	}

	public void setSignatureTitle4(String signatureTitle4) {
		this.signatureTitle4 = signatureTitle4;
	}

	public String getSignatureTitle3() {
		return this.signatureTitle3;
	}

	public void setSignatureTitle3(String signatureTitle3) {
		this.signatureTitle3 = signatureTitle3;
	}

	public String getSignatureTitle2() {
		return this.signatureTitle2;
	}

	public void setSignatureTitle2(String signatureTitle2) {
		this.signatureTitle2 = signatureTitle2;
	}

	public String getSignatureTitle1() {
		return this.signatureTitle1;
	}

	public void setSignatureTitle1(String signatureTitle1) {
		this.signatureTitle1 = signatureTitle1;
	}

	public String getComment5() {
		return this.comment5;
	}

	public void setComment5(String comment5) {
		this.comment5 = comment5;
	}

	public String getComment4() {
		return this.comment4;
	}

	public void setComment4(String comment4) {
		this.comment4 = comment4;
	}

	public String getComment3() {
		return this.comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getComment2() {
		return this.comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment1() {
		return this.comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getDateTime5() {
		return this.dateTime5;
	}

	public void setDateTime5(String dateTime5) {
		this.dateTime5 = dateTime5;
	}

	public String getDateTime4() {
		return this.dateTime4;
	}

	public void setDateTime4(String dateTime4) {
		this.dateTime4 = dateTime4;
	}

	public String getDateTime3() {
		return this.dateTime3;
	}

	public void setDateTime3(String dateTime3) {
		this.dateTime3 = dateTime3;
	}

	public String getDateTime2() {
		return this.dateTime2;
	}

	public void setDateTime2(String dateTime2) {
		this.dateTime2 = dateTime2;
	}

	public String getDateTime1() {
		return this.dateTime1;
	}

	public void setDateTime1(String dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTemprature() {
		return this.temprature;
	}

	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}

	public String getPulse() {
		return this.pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getRespiration() {
		return this.respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
	}

	public String getBloodPressure() {
		return this.bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public boolean isAlertD() {
		return this.alertD;
	}

	public void setAlertD(boolean alertD) {
		this.alertD = alertD;
	}

	public boolean isAlertE() {
		return this.alertE;
	}

	public void setAlertE(boolean alertE) {
		this.alertE = alertE;
	}

	public boolean isOrientedToN() {
		return this.orientedToN;
	}

	public void setOrientedToN(boolean orientedToN) {
		this.orientedToN = orientedToN;
	}

	public boolean isOrientedToD() {
		return this.orientedToD;
	}

	public void setOrientedToD(boolean orientedToD) {
		this.orientedToD = orientedToD;
	}

	public boolean isOrientedToE() {
		return this.orientedToE;
	}

	public void setOrientedToE(boolean orientedToE) {
		this.orientedToE = orientedToE;
	}

	public boolean isPersonN() {
		return this.personN;
	}

	public void setPersonN(boolean personN) {
		this.personN = personN;
	}

	public boolean isPersonD() {
		return this.personD;
	}

	public void setPersonD(boolean personD) {
		this.personD = personD;
	}

	public boolean isPersonE() {
		return this.personE;
	}

	public void setPersonE(boolean personE) {
		this.personE = personE;
	}

	public boolean isPlaceN() {
		return this.placeN;
	}

	public void setPlaceN(boolean placeN) {
		this.placeN = placeN;
	}

	public boolean isPlaceD() {
		return this.placeD;
	}

	public void setPlaceD(boolean placeD) {
		this.placeD = placeD;
	}

	public boolean isPlaceE() {
		return this.placeE;
	}

	public void setPlaceE(boolean placeE) {
		this.placeE = placeE;
	}

	public boolean isTimeN() {
		return this.timeN;
	}

	public void setTimeN(boolean timeN) {
		this.timeN = timeN;
	}

	public boolean isTimeD() {
		return this.timeD;
	}

	public void setTimeD(boolean timeD) {
		this.timeD = timeD;
	}

	public boolean isTimeE() {
		return this.timeE;
	}

	public void setTimeE(boolean timeE) {
		this.timeE = timeE;
	}

	public boolean isAnxiousAgitatedN() {
		return this.anxiousAgitatedN;
	}

	public void setAnxiousAgitatedN(boolean anxiousAgitatedN) {
		this.anxiousAgitatedN = anxiousAgitatedN;
	}

	public boolean isAnxiousAgitatedD() {
		return this.anxiousAgitatedD;
	}

	public void setAnxiousAgitatedD(boolean anxiousAgitatedD) {
		this.anxiousAgitatedD = anxiousAgitatedD;
	}

	public boolean isAnxiousAgitatedE() {
		return this.anxiousAgitatedE;
	}

	public void setAnxiousAgitatedE(boolean anxiousAgitatedE) {
		this.anxiousAgitatedE = anxiousAgitatedE;
	}

	public boolean isRestlessLethargicN() {
		return this.restlessLethargicN;
	}

	public void setRestlessLethargicN(boolean restlessLethargicN) {
		this.restlessLethargicN = restlessLethargicN;
	}

	public boolean isRestlessLethargicD() {
		return this.restlessLethargicD;
	}

	public void setRestlessLethargicD(boolean restlessLethargicD) {
		this.restlessLethargicD = restlessLethargicD;
	}

	public boolean isRestlessLethargicE() {
		return this.restlessLethargicE;
	}

	public void setRestlessLethargicE(boolean restlessLethargicE) {
		this.restlessLethargicE = restlessLethargicE;
	}

	public boolean isAbnormalSleepN() {
		return this.abnormalSleepN;
	}

	public void setAbnormalSleepN(boolean abnormalSleepN) {
		this.abnormalSleepN = abnormalSleepN;
	}

	public boolean isAbnormalSleepD() {
		return this.abnormalSleepD;
	}

	public void setAbnormalSleepD(boolean abnormalSleepD) {
		this.abnormalSleepD = abnormalSleepD;
	}

	public boolean isAbnormalSleepE() {
		return this.abnormalSleepE;
	}

	public void setAbnormalSleepE(boolean abnormalSleepE) {
		this.abnormalSleepE = abnormalSleepE;
	}

	public boolean isForgetfulConfusedN() {
		return this.forgetfulConfusedN;
	}

	public void setForgetfulConfusedN(boolean forgetfulConfusedN) {
		this.forgetfulConfusedN = forgetfulConfusedN;
	}

	public boolean isForgetfulConfusedD() {
		return this.forgetfulConfusedD;
	}

	public void setForgetfulConfusedD(boolean forgetfulConfusedD) {
		this.forgetfulConfusedD = forgetfulConfusedD;
	}

	public boolean isForgetfulConfusedE() {
		return this.forgetfulConfusedE;
	}

	public void setForgetfulConfusedE(boolean forgetfulConfusedE) {
		this.forgetfulConfusedE = forgetfulConfusedE;
	}

	public boolean isHallucinationDelusionN() {
		return this.hallucinationDelusionN;
	}

	public void setHallucinationDelusionN(boolean hallucinationDelusionN) {
		this.hallucinationDelusionN = hallucinationDelusionN;
	}

	public boolean isHallucinationDelusionD() {
		return this.hallucinationDelusionD;
	}

	public void setHallucinationDelusionD(boolean hallucinationDelusionD) {
		this.hallucinationDelusionD = hallucinationDelusionD;
	}

	public boolean isHallucinationDelusionE() {
		return this.hallucinationDelusionE;
	}

	public void setHallucinationDelusionE(boolean hallucinationDelusionE) {
		this.hallucinationDelusionE = hallucinationDelusionE;
	}

	public boolean isRegularRhythmN() {
		return this.regularRhythmN;
	}

	public void setRegularRhythmN(boolean regularRhythmN) {
		this.regularRhythmN = regularRhythmN;
	}

	public boolean isRegularRhythmD() {
		return this.regularRhythmD;
	}

	public void setRegularRhythmD(boolean regularRhythmD) {
		this.regularRhythmD = regularRhythmD;
	}

	public boolean isRegularRhythmE() {
		return this.regularRhythmE;
	}

	public void setRegularRhythmE(boolean regularRhythmE) {
		this.regularRhythmE = regularRhythmE;
	}

	public boolean isRadialApicalIrregularN() {
		return this.radialApicalIrregularN;
	}

	public void setRadialApicalIrregularN(boolean radialApicalIrregularN) {
		this.radialApicalIrregularN = radialApicalIrregularN;
	}

	public boolean isRadialApicalIrregularD() {
		return this.radialApicalIrregularD;
	}

	public void setRadialApicalIrregularD(boolean radialApicalIrregularD) {
		this.radialApicalIrregularD = radialApicalIrregularD;
	}

	public boolean isRadialApicalIrregularE() {
		return this.radialApicalIrregularE;
	}

	public void setRadialApicalIrregularE(boolean radialApicalIrregularE) {
		this.radialApicalIrregularE = radialApicalIrregularE;
	}

	public boolean isChestPainN() {
		return this.chestPainN;
	}

	public void setChestPainN(boolean chestPainN) {
		this.chestPainN = chestPainN;
	}

	public boolean isChestPainD() {
		return this.chestPainD;
	}

	public void setChestPainD(boolean chestPainD) {
		this.chestPainD = chestPainD;
	}

	public boolean isChestPainE() {
		return this.chestPainE;
	}

	public void setChestPainE(boolean chestPainE) {
		this.chestPainE = chestPainE;
	}

	public boolean isPedalLtRtN() {
		return this.pedalLtRtN;
	}

	public void setPedalLtRtN(boolean pedalLtRtN) {
		this.pedalLtRtN = pedalLtRtN;
	}

	public boolean isPedalLtRtD() {
		return this.pedalLtRtD;
	}

	public void setPedalLtRtD(boolean pedalLtRtD) {
		this.pedalLtRtD = pedalLtRtD;
	}

	public boolean isPedalLtRtE() {
		return this.pedalLtRtE;
	}

	public void setPedalLtRtE(boolean pedalLtRtE) {
		this.pedalLtRtE = pedalLtRtE;
	}

	public boolean isPitting1N() {
		return this.pitting1N;
	}

	public void setPitting1N(boolean pitting1N) {
		this.pitting1N = pitting1N;
	}

	public boolean isPitting1D() {
		return this.pitting1D;
	}

	public void setPitting1D(boolean pitting1D) {
		this.pitting1D = pitting1D;
	}

	public boolean isPitting1E() {
		return this.pitting1E;
	}

	public void setPitting1E(boolean pitting1E) {
		this.pitting1E = pitting1E;
	}

	public boolean isPitting2N() {
		return this.pitting2N;
	}

	public void setPitting2N(boolean pitting2N) {
		this.pitting2N = pitting2N;
	}

	public boolean isPitting2D() {
		return this.pitting2D;
	}

	public void setPitting2D(boolean pitting2D) {
		this.pitting2D = pitting2D;
	}

	public boolean isPitting2E() {
		return this.pitting2E;
	}

	public void setPitting2E(boolean pitting2E) {
		this.pitting2E = pitting2E;
	}

	public boolean isPitting3N() {
		return this.pitting3N;
	}

	public void setPitting3N(boolean pitting3N) {
		this.pitting3N = pitting3N;
	}

	public boolean isPitting3D() {
		return this.pitting3D;
	}

	public void setPitting3D(boolean pitting3D) {
		this.pitting3D = pitting3D;
	}

	public boolean isPitting3E() {
		return this.pitting3E;
	}

	public void setPitting3E(boolean pitting3E) {
		this.pitting3E = pitting3E;
	}

	public boolean isPitting4N() {
		return this.pitting4N;
	}

	public void setPitting4N(boolean pitting4N) {
		this.pitting4N = pitting4N;
	}

	public boolean isPitting4D() {
		return this.pitting4D;
	}

	public void setPitting4D(boolean pitting4D) {
		this.pitting4D = pitting4D;
	}

	public boolean isPitting4E() {
		return this.pitting4E;
	}

	public void setPitting4E(boolean pitting4E) {
		this.pitting4E = pitting4E;
	}

	public boolean isAbnormalPeriheralPulsesN() {
		return this.abnormalPeriheralPulsesN;
	}

	public void setAbnormalPeriheralPulsesN(boolean abnormalPeriheralPulsesN) {
		this.abnormalPeriheralPulsesN = abnormalPeriheralPulsesN;
	}

	public boolean isAbnormalPeriheralPulsesD() {
		return this.abnormalPeriheralPulsesD;
	}

	public void setAbnormalPeriheralPulsesD(boolean abnormalPeriheralPulsesD) {
		this.abnormalPeriheralPulsesD = abnormalPeriheralPulsesD;
	}

	public boolean isAbnormalPeriheralPulsesE() {
		return this.abnormalPeriheralPulsesE;
	}

	public void setAbnormalPeriheralPulsesE(boolean abnormalPeriheralPulsesE) {
		this.abnormalPeriheralPulsesE = abnormalPeriheralPulsesE;
	}

	public boolean isCardiovascularWnlN() {
		return this.cardiovascularWnlN;
	}

	public void setCardiovascularWnlN(boolean cardiovascularWnlN) {
		this.cardiovascularWnlN = cardiovascularWnlN;
	}

	public boolean isCardiovascularWnlD() {
		return this.cardiovascularWnlD;
	}

	public void setCardiovascularWnlD(boolean cardiovascularWnlD) {
		this.cardiovascularWnlD = cardiovascularWnlD;
	}

	public boolean isCardiovascularWnlE() {
		return this.cardiovascularWnlE;
	}

	public void setCardiovascularWnlE(boolean cardiovascularWnlE) {
		this.cardiovascularWnlE = cardiovascularWnlE;
	}

	public boolean isNauseaVomittingN() {
		return this.nauseaVomittingN;
	}

	public void setNauseaVomittingN(boolean nauseaVomittingN) {
		this.nauseaVomittingN = nauseaVomittingN;
	}

	public boolean isNauseaVomittingD() {
		return this.nauseaVomittingD;
	}

	public void setNauseaVomittingD(boolean nauseaVomittingD) {
		this.nauseaVomittingD = nauseaVomittingD;
	}

	public boolean isNauseaVomittingE() {
		return this.nauseaVomittingE;
	}

	public void setNauseaVomittingE(boolean nauseaVomittingE) {
		this.nauseaVomittingE = nauseaVomittingE;
	}

	public boolean isEpigasticDistressN() {
		return this.epigasticDistressN;
	}

	public void setEpigasticDistressN(boolean epigasticDistressN) {
		this.epigasticDistressN = epigasticDistressN;
	}

	public boolean isEpigasticDistressD() {
		return this.epigasticDistressD;
	}

	public void setEpigasticDistressD(boolean epigasticDistressD) {
		this.epigasticDistressD = epigasticDistressD;
	}

	public boolean isEpigasticDistressE() {
		return this.epigasticDistressE;
	}

	public void setEpigasticDistressE(boolean epigasticDistressE) {
		this.epigasticDistressE = epigasticDistressE;
	}

	public boolean isDifficaultySwallowingN() {
		return this.difficaultySwallowingN;
	}

	public void setDifficaultySwallowingN(boolean difficaultySwallowingN) {
		this.difficaultySwallowingN = difficaultySwallowingN;
	}

	public boolean isDifficaultySwallowingD() {
		return this.difficaultySwallowingD;
	}

	public void setDifficaultySwallowingD(boolean difficaultySwallowingD) {
		this.difficaultySwallowingD = difficaultySwallowingD;
	}

	public boolean isDifficaultySwallowingE() {
		return this.difficaultySwallowingE;
	}

	public void setDifficaultySwallowingE(boolean difficaultySwallowingE) {
		this.difficaultySwallowingE = difficaultySwallowingE;
	}

	public boolean isAbdominalDistentonN() {
		return this.abdominalDistentonN;
	}

	public void setAbdominalDistentonN(boolean abdominalDistentonN) {
		this.abdominalDistentonN = abdominalDistentonN;
	}

	public boolean isAbdominalDistentonD() {
		return this.abdominalDistentonD;
	}

	public void setAbdominalDistentonD(boolean abdominalDistentonD) {
		this.abdominalDistentonD = abdominalDistentonD;
	}

	public boolean isAbdominalDistentonE() {
		return this.abdominalDistentonE;
	}

	public void setAbdominalDistentonE(boolean abdominalDistentonE) {
		this.abdominalDistentonE = abdominalDistentonE;
	}

	public boolean isDiarrheaN() {
		return this.diarrheaN;
	}

	public void setDiarrheaN(boolean diarrheaN) {
		this.diarrheaN = diarrheaN;
	}

	public boolean isDiarrheaD() {
		return this.diarrheaD;
	}

	public void setDiarrheaD(boolean diarrheaD) {
		this.diarrheaD = diarrheaD;
	}

	public boolean isDiarrheaE() {
		return this.diarrheaE;
	}

	public void setDiarrheaE(boolean diarrheaE) {
		this.diarrheaE = diarrheaE;
	}

	public boolean isConstipationN() {
		return this.constipationN;
	}

	public void setConstipationN(boolean constipationN) {
		this.constipationN = constipationN;
	}

	public boolean isConstipationD() {
		return this.constipationD;
	}

	public void setConstipationD(boolean constipationD) {
		this.constipationD = constipationD;
	}

	public boolean isConstipationE() {
		return this.constipationE;
	}

	public void setConstipationE(boolean constipationE) {
		this.constipationE = constipationE;
	}

	public boolean isBowelSoundsN() {
		return this.bowelSoundsN;
	}

	public void setBowelSoundsN(boolean bowelSoundsN) {
		this.bowelSoundsN = bowelSoundsN;
	}

	public boolean isBowelSoundsD() {
		return this.bowelSoundsD;
	}

	public void setBowelSoundsD(boolean bowelSoundsD) {
		this.bowelSoundsD = bowelSoundsD;
	}

	public boolean isBowelSoundsE() {
		return this.bowelSoundsE;
	}

	public void setBowelSoundsE(boolean bowelSoundsE) {
		this.bowelSoundsE = bowelSoundsE;
	}

	public boolean isPresentN() {
		return this.presentN;
	}

	public void setPresentN(boolean presentN) {
		this.presentN = presentN;
	}

	public boolean isPresentD() {
		return this.presentD;
	}

	public void setPresentD(boolean presentD) {
		this.presentD = presentD;
	}

	public boolean isPresentE() {
		return this.presentE;
	}

	public void setPresentE(boolean presentE) {
		this.presentE = presentE;
	}

	public boolean isAbsentN() {
		return this.absentN;
	}

	public void setAbsentN(boolean absentN) {
		this.absentN = absentN;
	}

	public boolean isAbsentD() {
		return this.absentD;
	}

	public void setAbsentD(boolean absentD) {
		this.absentD = absentD;
	}

	public boolean isAbsentE() {
		return this.absentE;
	}

	public void setAbsentE(boolean absentE) {
		this.absentE = absentE;
	}

	public boolean isHyperActiveN() {
		return this.hyperActiveN;
	}

	public void setHyperActiveN(boolean hyperActiveN) {
		this.hyperActiveN = hyperActiveN;
	}

	public boolean isHyperActiveD() {
		return this.hyperActiveD;
	}

	public void setHyperActiveD(boolean hyperActiveD) {
		this.hyperActiveD = hyperActiveD;
	}

	public boolean isHyperActiveE() {
		return this.hyperActiveE;
	}

	public void setHyperActiveE(boolean hyperActiveE) {
		this.hyperActiveE = hyperActiveE;
	}

	public boolean isHypoActiveN() {
		return this.hypoActiveN;
	}

	public void setHypoActiveN(boolean hypoActiveN) {
		this.hypoActiveN = hypoActiveN;
	}

	public boolean isHypoActiveD() {
		return this.hypoActiveD;
	}

	public void setHypoActiveD(boolean hypoActiveD) {
		this.hypoActiveD = hypoActiveD;
	}

	public boolean isHypoActiveE() {
		return this.hypoActiveE;
	}

	public void setHypoActiveE(boolean hypoActiveE) {
		this.hypoActiveE = hypoActiveE;
	}

	public boolean isBalanceGaitUnsteadyN() {
		return this.balanceGaitUnsteadyN;
	}

	public void setBalanceGaitUnsteadyN(boolean balanceGaitUnsteadyN) {
		this.balanceGaitUnsteadyN = balanceGaitUnsteadyN;
	}

	public boolean isBalanceGaitUnsteadyD() {
		return this.balanceGaitUnsteadyD;
	}

	public void setBalanceGaitUnsteadyD(boolean balanceGaitUnsteadyD) {
		this.balanceGaitUnsteadyD = balanceGaitUnsteadyD;
	}

	public boolean isBalanceGaitUnsteadyE() {
		return this.balanceGaitUnsteadyE;
	}

	public void setBalanceGaitUnsteadyE(boolean balanceGaitUnsteadyE) {
		this.balanceGaitUnsteadyE = balanceGaitUnsteadyE;
	}

	public boolean isParalysisN() {
		return this.paralysisN;
	}

	public void setParalysisN(boolean paralysisN) {
		this.paralysisN = paralysisN;
	}

	public boolean isParalysisD() {
		return this.paralysisD;
	}

	public void setParalysisD(boolean paralysisD) {
		this.paralysisD = paralysisD;
	}

	public boolean isParalysisE() {
		return this.paralysisE;
	}

	public void setParalysisE(boolean paralysisE) {
		this.paralysisE = paralysisE;
	}

	public boolean isMusculoSkeketalWnlN() {
		return this.musculoSkeketalWnlN;
	}

	public void setMusculoSkeketalWnlN(boolean musculoSkeketalWnlN) {
		this.musculoSkeketalWnlN = musculoSkeketalWnlN;
	}

	public boolean isMusculoSkeketalWnlD() {
		return this.musculoSkeketalWnlD;
	}

	public void setMusculoSkeketalWnlD(boolean musculoSkeketalWnlD) {
		this.musculoSkeketalWnlD = musculoSkeketalWnlD;
	}

	public boolean isMusculoSkeketalWnlE() {
		return this.musculoSkeketalWnlE;
	}

	public void setMusculoSkeketalWnlE(boolean musculoSkeketalWnlE) {
		this.musculoSkeketalWnlE = musculoSkeketalWnlE;
	}

	public boolean isSynCopeN() {
		return this.synCopeN;
	}

	public void setSynCopeN(boolean synCopeN) {
		this.synCopeN = synCopeN;
	}

	public boolean isSynCopeD() {
		return this.synCopeD;
	}

	public void setSynCopeD(boolean synCopeD) {
		this.synCopeD = synCopeD;
	}

	public boolean isSynCopeE() {
		return this.synCopeE;
	}

	public void setSynCopeE(boolean synCopeE) {
		this.synCopeE = synCopeE;
	}

	public boolean isHeadAcheN() {
		return this.headAcheN;
	}

	public void setHeadAcheN(boolean headAcheN) {
		this.headAcheN = headAcheN;
	}

	public boolean isHeadAcheD() {
		return this.headAcheD;
	}

	public void setHeadAcheD(boolean headAcheD) {
		this.headAcheD = headAcheD;
	}

	public boolean isHeadAcheE() {
		return this.headAcheE;
	}

	public void setHeadAcheE(boolean headAcheE) {
		this.headAcheE = headAcheE;
	}

	public boolean isDecreasedGraspE() {
		return this.decreasedGraspE;
	}

	public void setDecreasedGraspE(boolean decreasedGraspE) {
		this.decreasedGraspE = decreasedGraspE;
	}

	public boolean isNervousSystemRtN() {
		return this.nervousSystemRtN;
	}

	public void setNervousSystemRtN(boolean nervousSystemRtN) {
		this.nervousSystemRtN = nervousSystemRtN;
	}

	public boolean isNervousSystemRtD() {
		return this.nervousSystemRtD;
	}

	public void setNervousSystemRtD(boolean nervousSystemRtD) {
		this.nervousSystemRtD = nervousSystemRtD;
	}

	public boolean isNervousSystemRtE() {
		return this.nervousSystemRtE;
	}

	public void setNervousSystemRtE(boolean nervousSystemRtE) {
		this.nervousSystemRtE = nervousSystemRtE;
	}

	public boolean isNervousSystemLtN() {
		return this.nervousSystemLtN;
	}

	public void setNervousSystemLtN(boolean nervousSystemLtN) {
		this.nervousSystemLtN = nervousSystemLtN;
	}

	public boolean isNervousSystemLtD() {
		return this.nervousSystemLtD;
	}

	public void setNervousSystemLtD(boolean nervousSystemLtD) {
		this.nervousSystemLtD = nervousSystemLtD;
	}

	public boolean isNervousSystemLtE() {
		return this.nervousSystemLtE;
	}

	public void setNervousSystemLtE(boolean nervousSystemLtE) {
		this.nervousSystemLtE = nervousSystemLtE;
	}

	public boolean isDecresedMovementE() {
		return this.decresedMovementE;
	}

	public void setDecresedMovementE(boolean decresedMovementE) {
		this.decresedMovementE = decresedMovementE;
	}

	public boolean isRueLueN() {
		return this.rueLueN;
	}

	public void setRueLueN(boolean rueLueN) {
		this.rueLueN = rueLueN;
	}

	public boolean isRueLueD() {
		return this.rueLueD;
	}

	public void setRueLueD(boolean rueLueD) {
		this.rueLueD = rueLueD;
	}

	public boolean isRueLueE() {
		return this.rueLueE;
	}

	public void setRueLueE(boolean rueLueE) {
		this.rueLueE = rueLueE;
	}

	public boolean isRleLLeN() {
		return this.rleLLeN;
	}

	public void setRleLLeN(boolean rleLLeN) {
		this.rleLLeN = rleLLeN;
	}

	public boolean isRleLLeD() {
		return this.rleLLeD;
	}

	public void setRleLLeD(boolean rleLLeD) {
		this.rleLLeD = rleLLeD;
	}

	public boolean isRleLLeE() {
		return this.rleLLeE;
	}

	public void setRleLLeE(boolean rleLLeE) {
		this.rleLLeE = rleLLeE;
	}

	public boolean isAbnormalPupilReactionE() {
		return this.abnormalPupilReactionE;
	}

	public void setAbnormalPupilReactionE(boolean abnormalPupilReactionE) {
		this.abnormalPupilReactionE = abnormalPupilReactionE;
	}

	public boolean isAbnormalReactionRightN() {
		return this.abnormalReactionRightN;
	}

	public void setAbnormalReactionRightN(boolean abnormalReactionRightN) {
		this.abnormalReactionRightN = abnormalReactionRightN;
	}

	public boolean isAbnormalReactionRightD() {
		return this.abnormalReactionRightD;
	}

	public void setAbnormalReactionRightD(boolean abnormalReactionRightD) {
		this.abnormalReactionRightD = abnormalReactionRightD;
	}

	public boolean isAbnormalReactionRightE() {
		return this.abnormalReactionRightE;
	}

	public void setAbnormalReactionRightE(boolean abnormalReactionRightE) {
		this.abnormalReactionRightE = abnormalReactionRightE;
	}

	public boolean isAbnormalReactionLeftN() {
		return this.abnormalReactionLeftN;
	}

	public void setAbnormalReactionLeftN(boolean abnormalReactionLeftN) {
		this.abnormalReactionLeftN = abnormalReactionLeftN;
	}

	public boolean isAbnormalReactionLeftD() {
		return this.abnormalReactionLeftD;
	}

	public void setAbnormalReactionLeftD(boolean abnormalReactionLeftD) {
		this.abnormalReactionLeftD = abnormalReactionLeftD;
	}

	public boolean isAbnormalReactionLeftE() {
		return this.abnormalReactionLeftE;
	}

	public void setAbnormalReactionLeftE(boolean abnormalReactionLeftE) {
		this.abnormalReactionLeftE = abnormalReactionLeftE;
	}

	public boolean isTremorsN() {
		return this.tremorsN;
	}

	public void setTremorsN(boolean tremorsN) {
		this.tremorsN = tremorsN;
	}

	public boolean isTremorsD() {
		return this.tremorsD;
	}

	public void setTremorsD(boolean tremorsD) {
		this.tremorsD = tremorsD;
	}

	public boolean isTremorsE() {
		return this.tremorsE;
	}

	public void setTremorsE(boolean tremorsE) {
		this.tremorsE = tremorsE;
	}

	public boolean isVertigoN() {
		return this.vertigoN;
	}

	public void setVertigoN(boolean vertigoN) {
		this.vertigoN = vertigoN;
	}

	public boolean isVertigoD() {
		return this.vertigoD;
	}

	public void setVertigoD(boolean vertigoD) {
		this.vertigoD = vertigoD;
	}

	public boolean isVertigoE() {
		return this.vertigoE;
	}

	public void setVertigoE(boolean vertigoE) {
		this.vertigoE = vertigoE;
	}

	public boolean isNervousSystemWnlN() {
		return this.nervousSystemWnlN;
	}

	public void setNervousSystemWnlN(boolean nervousSystemWnlN) {
		this.nervousSystemWnlN = nervousSystemWnlN;
	}

	public boolean isNervousSystemWnlD() {
		return this.nervousSystemWnlD;
	}

	public void setNervousSystemWnlD(boolean nervousSystemWnlD) {
		this.nervousSystemWnlD = nervousSystemWnlD;
	}

	public boolean isNervousSystemWnlE() {
		return this.nervousSystemWnlE;
	}

	public void setNervousSystemWnlE(boolean nervousSystemWnlE) {
		this.nervousSystemWnlE = nervousSystemWnlE;
	}

	public boolean isLeboredBreathingD() {
		return this.leboredBreathingD;
	}

	public void setLeboredBreathingD(boolean leboredBreathingD) {
		this.leboredBreathingD = leboredBreathingD;
	}

	public boolean isLeboredBreathingE() {
		return this.leboredBreathingE;
	}

	public void setLeboredBreathingE(boolean leboredBreathingE) {
		this.leboredBreathingE = leboredBreathingE;
	}

	public boolean isLeboredBreathingN() {
		return this.leboredBreathingN;
	}

	public void setLeboredBreathingN(boolean leboredBreathingN) {
		this.leboredBreathingN = leboredBreathingN;
	}

	public boolean isShallowRespirationN() {
		return this.shallowRespirationN;
	}

	public void setShallowRespirationN(boolean shallowRespirationN) {
		this.shallowRespirationN = shallowRespirationN;
	}

	public boolean isShallowRespirationD() {
		return this.shallowRespirationD;
	}

	public void setShallowRespirationD(boolean shallowRespirationD) {
		this.shallowRespirationD = shallowRespirationD;
	}

	public boolean isShallowRespirationE() {
		return this.shallowRespirationE;
	}

	public void setShallowRespirationE(boolean shallowRespirationE) {
		this.shallowRespirationE = shallowRespirationE;
	}

	public boolean isRatesRhonchiN() {
		return this.ratesRhonchiN;
	}

	public void setRatesRhonchiN(boolean ratesRhonchiN) {
		this.ratesRhonchiN = ratesRhonchiN;
	}

	public boolean isRatesRhonchiD() {
		return this.ratesRhonchiD;
	}

	public void setRatesRhonchiD(boolean ratesRhonchiD) {
		this.ratesRhonchiD = ratesRhonchiD;
	}

	public boolean isRatesRhonchiE() {
		return this.ratesRhonchiE;
	}

	public void setRatesRhonchiE(boolean ratesRhonchiE) {
		this.ratesRhonchiE = ratesRhonchiE;
	}

	public boolean isWheezingN() {
		return this.wheezingN;
	}

	public void setWheezingN(boolean wheezingN) {
		this.wheezingN = wheezingN;
	}

	public boolean isWheezingD() {
		return this.wheezingD;
	}

	public void setWheezingD(boolean wheezingD) {
		this.wheezingD = wheezingD;
	}

	public boolean isWheezingE() {
		return this.wheezingE;
	}

	public void setWheezingE(boolean wheezingE) {
		this.wheezingE = wheezingE;
	}

	public boolean isCoughN() {
		return this.coughN;
	}

	public void setCoughN(boolean coughN) {
		this.coughN = coughN;
	}

	public boolean isCoughD() {
		return this.coughD;
	}

	public void setCoughD(boolean coughD) {
		this.coughD = coughD;
	}

	public boolean isCoughE() {
		return this.coughE;
	}

	public void setCoughE(boolean coughE) {
		this.coughE = coughE;
	}

	public boolean isDyspneaSobN() {
		return this.dyspneaSobN;
	}

	public void setDyspneaSobN(boolean dyspneaSobN) {
		this.dyspneaSobN = dyspneaSobN;
	}

	public boolean isDyspneaSobD() {
		return this.dyspneaSobD;
	}

	public void setDyspneaSobD(boolean dyspneaSobD) {
		this.dyspneaSobD = dyspneaSobD;
	}

	public boolean isDyspneaSobE() {
		return this.dyspneaSobE;
	}

	public void setDyspneaSobE(boolean dyspneaSobE) {
		this.dyspneaSobE = dyspneaSobE;
	}

	public boolean isQ2LpmN() {
		return this.q2LpmN;
	}

	public void setQ2LpmN(boolean q2LpmN) {
		this.q2LpmN = q2LpmN;
	}

	public boolean isQ2LpmD() {
		return this.q2LpmD;
	}

	public void setQ2LpmD(boolean q2LpmD) {
		this.q2LpmD = q2LpmD;
	}

	public boolean isQ2LpmE() {
		return this.q2LpmE;
	}

	public void setQ2LpmE(boolean q2LpmE) {
		this.q2LpmE = q2LpmE;
	}

	public boolean isPrnN() {
		return this.prnN;
	}

	public void setPrnN(boolean prnN) {
		this.prnN = prnN;
	}

	public boolean isPrnD() {
		return this.prnD;
	}

	public void setPrnD(boolean prnD) {
		this.prnD = prnD;
	}

	public boolean isPrnE() {
		return this.prnE;
	}

	public void setPrnE(boolean prnE) {
		this.prnE = prnE;
	}

	public boolean isContinousN() {
		return this.continuousN;
	}

	public void setContinousN(boolean continousN) {
		this.continuousN = continousN;
	}

	public boolean isContinousD() {
		return this.continuousD;
	}

	public void setContinousD(boolean continousD) {
		this.continuousD = continousD;
	}

	public boolean isContinousE() {
		return this.continuousE;
	}

	public void setContinousE(boolean continousE) {
		this.continuousE = continousE;
	}

	public boolean isS2O2N() {
		return this.s2O2N;
	}

	public void setS2O2N(boolean s2O2N) {
		this.s2O2N = s2O2N;
	}

	public boolean isS2O2D() {
		return this.s2O2D;
	}

	public void setS2O2D(boolean s2O2D) {
		this.s2O2D = s2O2D;
	}

	public boolean isS2O2E() {
		return this.s2O2E;
	}

	public void setS2O2E(boolean s2O2E) {
		this.s2O2E = s2O2E;
	}

	public boolean isSuctioningN() {
		return this.suctioningN;
	}

	public void setSuctioningN(boolean suctioningN) {
		this.suctioningN = suctioningN;
	}

	public boolean isSuctioningD() {
		return this.suctioningD;
	}

	public void setSuctioningD(boolean suctioningD) {
		this.suctioningD = suctioningD;
	}

	public boolean isSuctioningE() {
		return this.suctioningE;
	}

	public void setSuctioningE(boolean suctioningE) {
		this.suctioningE = suctioningE;
	}

	public boolean isTrachCareN() {
		return this.trachCareN;
	}

	public void setTrachCareN(boolean trachCareN) {
		this.trachCareN = trachCareN;
	}

	public boolean isTrachCareD() {
		return this.trachCareD;
	}

	public void setTrachCareD(boolean trachCareD) {
		this.trachCareD = trachCareD;
	}

	public boolean isTrachCareE() {
		return this.trachCareE;
	}

	public void setTrachCareE(boolean trachCareE) {
		this.trachCareE = trachCareE;
	}

	public boolean isVentCareN() {
		return this.ventCareN;
	}

	public void setVentCareN(boolean ventCareN) {
		this.ventCareN = ventCareN;
	}

	public boolean isVentCareD() {
		return this.ventCareD;
	}

	public void setVentCareD(boolean ventCareD) {
		this.ventCareD = ventCareD;
	}

	public boolean isVentCareE() {
		return this.ventCareE;
	}

	public void setVentCareE(boolean ventCareE) {
		this.ventCareE = ventCareE;
	}

	public boolean isLungsClearN() {
		return this.lungsClearN;
	}

	public void setLungsClearN(boolean lungsClearN) {
		this.lungsClearN = lungsClearN;
	}

	public boolean isRespiratoryWnlN() {
		return this.respiratoryWnlN;
	}

	public void setRespiratoryWnlN(boolean respiratoryWnlN) {
		this.respiratoryWnlN = respiratoryWnlN;
	}

	public boolean isLungsClearD() {
		return this.lungsClearD;
	}

	public void setLungsClearD(boolean lungsClearD) {
		this.lungsClearD = lungsClearD;
	}

	public boolean isLungsClearE() {
		return this.lungsClearE;
	}

	public void setLungsClearE(boolean lungsClearE) {
		this.lungsClearE = lungsClearE;
	}

	public boolean isRespiratoryWnlE() {
		return this.respiratoryWnlE;
	}

	public void setRespiratoryWnlE(boolean respiratoryWnlE) {
		this.respiratoryWnlE = respiratoryWnlE;
	}

	public boolean isRespiratoryWnlD() {
		return this.respiratoryWnlD;
	}

	public void setRespiratoryWnlD(boolean respiratoryWnlD) {
		this.respiratoryWnlD = respiratoryWnlD;
	}

	public boolean isOriginN() {
		return this.originN;
	}

	public void setOriginN(boolean originN) {
		this.originN = originN;
	}

	public boolean isOriginD() {
		return this.originD;
	}

	public void setOriginD(boolean originD) {
		this.originD = originD;
	}

	public boolean isOriginE() {
		return this.originE;
	}

	public void setOriginE(boolean originE) {
		this.originE = originE;
	}

	public boolean isLocationN() {
		return this.locationN;
	}

	public void setLocationN(boolean locationN) {
		this.locationN = locationN;
	}

	public boolean isLocationD() {
		return this.locationD;
	}

	public void setLocationD(boolean locationD) {
		this.locationD = locationD;
	}

	public boolean isLocationE() {
		return this.locationE;
	}

	public void setLocationE(boolean locationE) {
		this.locationE = locationE;
	}

	public boolean isIntensityN() {
		return this.intensityN;
	}

	public void setIntensityN(boolean intensityN) {
		this.intensityN = intensityN;
	}

	public boolean isIntensityD() {
		return this.intensityD;
	}

	public void setIntensityD(boolean intensityD) {
		this.intensityD = intensityD;
	}

	public boolean isIntensityE() {
		return this.intensityE;
	}

	public void setIntensityE(boolean intensityE) {
		this.intensityE = intensityE;
	}

	public boolean isNoneN() {
		return this.noneN;
	}

	public void setNoneN(boolean noneN) {
		this.noneN = noneN;
	}

	public boolean isNoneD() {
		return this.noneD;
	}

	public void setNoneD(boolean noneD) {
		this.noneD = noneD;
	}

	public boolean isNoneE() {
		return this.noneE;
	}

	public void setNoneE(boolean noneE) {
		this.noneE = noneE;
	}

	public boolean isMDNotifiedE() {
		return this.mDNotifiedE;
	}

	public void setMDNotifiedE(boolean mDNotifiedE) {
		this.mDNotifiedE = mDNotifiedE;
	}

	public boolean isMDNotifiedN() {
		return this.mDNotifiedN;
	}

	public void setMDNotifiedN(boolean mDNotifiedN) {
		this.mDNotifiedN = mDNotifiedN;
	}

	public boolean isSkilledObservationAssessmentN() {
		return this.skilledObservationAssessmentN;
	}

	public void setSkilledObservationAssessmentN(
			boolean skilledObservationAssessmentN) {
		this.skilledObservationAssessmentN = skilledObservationAssessmentN;
	}

	public boolean isSkilledObservationAssessmentD() {
		return this.skilledObservationAssessmentD;
	}

	public void setSkilledObservationAssessmentD(
			boolean skilledObservationAssessmentD) {
		this.skilledObservationAssessmentD = skilledObservationAssessmentD;
	}

	public boolean isSkilledObservationAssessmentE() {
		return this.skilledObservationAssessmentE;
	}

	public void setSkilledObservationAssessmentE(
			boolean skilledObservationAssessmentE) {
		this.skilledObservationAssessmentE = skilledObservationAssessmentE;
	}

	public boolean isDiabeticManagementN() {
		return this.diabeticManagementN;
	}

	public void setDiabeticManagementN(boolean diabeticManagementN) {
		this.diabeticManagementN = diabeticManagementN;
	}

	public boolean isDiabeticManagementD() {
		return this.diabeticManagementD;
	}

	public void setDiabeticManagementD(boolean diabeticManagementD) {
		this.diabeticManagementD = diabeticManagementD;
	}

	public boolean isDiabeticManagementE() {
		return this.diabeticManagementE;
	}

	public void setDiabeticManagementE(boolean diabeticManagementE) {
		this.diabeticManagementE = diabeticManagementE;
	}

	public boolean isGlucometerReadingN() {
		return this.glucometerReadingN;
	}

	public void setGlucometerReadingN(boolean glucometerReadingN) {
		this.glucometerReadingN = glucometerReadingN;
	}

	public boolean isGlucometerReadingD() {
		return this.glucometerReadingD;
	}

	public void setGlucometerReadingD(boolean glucometerReadingD) {
		this.glucometerReadingD = glucometerReadingD;
	}

	public boolean isGlucometerReadingE() {
		return this.glucometerReadingE;
	}

	public void setGlucometerReadingE(boolean glucometerReadingE) {
		this.glucometerReadingE = glucometerReadingE;
	}

	public boolean isDehaydrationN() {
		return this.dehaydrationN;
	}

	public void setDehaydrationN(boolean dehaydrationN) {
		this.dehaydrationN = dehaydrationN;
	}

	public boolean isDehaydrationD() {
		return this.dehaydrationD;
	}

	public void setDehaydrationD(boolean dehaydrationD) {
		this.dehaydrationD = dehaydrationD;
	}

	public boolean isDehaydrationE() {
		return this.dehaydrationE;
	}

	public void setDehaydrationE(boolean dehaydrationE) {
		this.dehaydrationE = dehaydrationE;
	}

	public boolean isManagementTeachingN() {
		return this.managementTeachingN;
	}

	public void setManagementTeachingN(boolean managementTeachingN) {
		this.managementTeachingN = managementTeachingN;
	}

	public boolean isManagementTeachingD() {
		return this.managementTeachingD;
	}

	public void setManagementTeachingD(boolean managementTeachingD) {
		this.managementTeachingD = managementTeachingD;
	}

	public boolean isManagementTeachingE() {
		return this.managementTeachingE;
	}

	public void setManagementTeachingE(boolean managementTeachingE) {
		this.managementTeachingE = managementTeachingE;
	}

	public boolean isDialysisManagementN() {
		return this.dialysisManagementN;
	}

	public void setDialysisManagementN(boolean dialysisManagementN) {
		this.dialysisManagementN = dialysisManagementN;
	}

	public boolean isDialysisManagementD() {
		return this.dialysisManagementD;
	}

	public void setDialysisManagementD(boolean dialysisManagementD) {
		this.dialysisManagementD = dialysisManagementD;
	}

	public boolean isDialysisManagementE() {
		return this.dialysisManagementE;
	}

	public void setDialysisManagementE(boolean dialysisManagementE) {
		this.dialysisManagementE = dialysisManagementE;
	}

	public boolean isSideEffectN() {
		return this.sideEffectN;
	}

	public void setSideEffectN(boolean sideEffectN) {
		this.sideEffectN = sideEffectN;
	}

	public boolean isSideEffectD() {
		return this.sideEffectD;
	}

	public void setSideEffectD(boolean sideEffectD) {
		this.sideEffectD = sideEffectD;
	}

	public boolean isSideEffectE() {
		return this.sideEffectE;
	}

	public void setSideEffectE(boolean sideEffectE) {
		this.sideEffectE = sideEffectE;
	}

	public boolean isMDOrdersN() {
		return this.mDOrdersN;
	}

	public void setMDOrdersN(boolean mDOrdersN) {
		this.mDOrdersN = mDOrdersN;
	}

	public boolean isTranslusionD() {
		return this.translusionD;
	}

	public void setTranslusionD(boolean translusionD) {
		this.translusionD = translusionD;
	}

	public boolean isTranslusionE() {
		return this.translusionE;
	}

	public void setTranslusionE(boolean translusionE) {
		this.translusionE = translusionE;
	}

	public boolean isTranslusionN() {
		return this.translusionN;
	}

	public void setTranslusionN(boolean translusionN) {
		this.translusionN = translusionN;
	}

	public boolean isCareN() {
		return this.careN;
	}

	public void setCareN(boolean careN) {
		this.careN = careN;
	}

	public boolean isCareD() {
		return this.careD;
	}

	public void setCareD(boolean careD) {
		this.careD = careD;
	}

	public boolean isCareE() {
		return this.careE;
	}

	public void setCareE(boolean careE) {
		this.careE = careE;
	}

	public boolean isInjectableMedsN() {
		return this.injectableMedsN;
	}

	public void setInjectableMedsN(boolean injectableMedsN) {
		this.injectableMedsN = injectableMedsN;
	}

	public boolean isInjectableMedsD() {
		return this.injectableMedsD;
	}

	public void setInjectableMedsD(boolean injectableMedsD) {
		this.injectableMedsD = injectableMedsD;
	}

	public boolean isInjectableMedsE() {
		return this.injectableMedsE;
	}

	public void setInjectableMedsE(boolean injectableMedsE) {
		this.injectableMedsE = injectableMedsE;
	}

	public boolean isCareTeachN() {
		return this.careTeachN;
	}

	public void setCareTeachN(boolean careTeachN) {
		this.careTeachN = careTeachN;
	}

	public boolean isCareTeachD() {
		return this.careTeachD;
	}

	public void setCareTeachD(boolean careTeachD) {
		this.careTeachD = careTeachD;
	}

	public boolean isCareTeachE() {
		return this.careTeachE;
	}

	public void setCareTeachE(boolean careTeachE) {
		this.careTeachE = careTeachE;
	}

	public boolean isDietTeachingN() {
		return this.dietTeachingN;
	}

	public void setDietTeachingN(boolean dietTeachingN) {
		this.dietTeachingN = dietTeachingN;
	}

	public boolean isDietTeachingD() {
		return this.dietTeachingD;
	}

	public void setDietTeachingD(boolean dietTeachingD) {
		this.dietTeachingD = dietTeachingD;
	}

	public boolean isDietTeachingE() {
		return this.dietTeachingE;
	}

	public void setDietTeachingE(boolean dietTeachingE) {
		this.dietTeachingE = dietTeachingE;
	}

	public boolean isBowelBladderTrainingN() {
		return this.bowelBladderTrainingN;
	}

	public void setBowelBladderTrainingN(boolean bowelBladderTrainingN) {
		this.bowelBladderTrainingN = bowelBladderTrainingN;
	}

	public boolean isBowelBladderTrainingD() {
		return this.bowelBladderTrainingD;
	}

	public void setBowelBladderTrainingD(boolean bowelBladderTrainingD) {
		this.bowelBladderTrainingD = bowelBladderTrainingD;
	}

	public boolean isBowelBladderTrainingE() {
		return this.bowelBladderTrainingE;
	}

	public void setBowelBladderTrainingE(boolean bowelBladderTrainingE) {
		this.bowelBladderTrainingE = bowelBladderTrainingE;
	}

	public boolean isSitesN() {
		return this.sitesN;
	}

	public void setSitesN(boolean sitesN) {
		this.sitesN = sitesN;
	}

	public boolean isSitesD() {
		return this.sitesD;
	}

	public void setSitesD(boolean sitesD) {
		this.sitesD = sitesD;
	}

	public boolean isSitesE() {
		return this.sitesE;
	}

	public void setSitesE(boolean sitesE) {
		this.sitesE = sitesE;
	}

	public boolean isObserveSsxInfectionN() {
		return this.observeSsxInfectionN;
	}

	public void setObserveSsxInfectionN(boolean observeSsxInfectionN) {
		this.observeSsxInfectionN = observeSsxInfectionN;
	}

	public boolean isPressureUlcerCareD() {
		return this.pressureUlcerCareD;
	}

	public void setPressureUlcerCareD(boolean pressureUlcerCareD) {
		this.pressureUlcerCareD = pressureUlcerCareD;
	}

	public boolean isPressureUlcerCareE() {
		return this.pressureUlcerCareE;
	}

	public void setPressureUlcerCareE(boolean pressureUlcerCareE) {
		this.pressureUlcerCareE = pressureUlcerCareE;
	}

	public boolean isPressureUlcerCareN() {
		return this.pressureUlcerCareN;
	}

	public void setPressureUlcerCareN(boolean pressureUlcerCareN) {
		this.pressureUlcerCareN = pressureUlcerCareN;
	}

	public boolean isTracheostomyCareN() {
		return this.tracheostomyCareN;
	}

	public void setTracheostomyCareN(boolean tracheostomyCareN) {
		this.tracheostomyCareN = tracheostomyCareN;
	}

	public boolean isTracheostomyCareD() {
		return this.tracheostomyCareD;
	}

	public void setTracheostomyCareD(boolean tracheostomyCareD) {
		this.tracheostomyCareD = tracheostomyCareD;
	}

	public boolean isTracheostomyCareE() {
		return this.tracheostomyCareE;
	}

	public void setTracheostomyCareE(boolean tracheostomyCareE) {
		this.tracheostomyCareE = tracheostomyCareE;
	}

	public boolean isPainSuctiongN() {
		return this.painSuctiongN;
	}

	public void setPainSuctiongN(boolean painSuctiongN) {
		this.painSuctiongN = painSuctiongN;
	}

	public boolean isPainSuctiongD() {
		return this.painSuctiongD;
	}

	public void setPainSuctiongD(boolean painSuctiongD) {
		this.painSuctiongD = painSuctiongD;
	}

	public boolean isPainSuctiongE() {
		return this.painSuctiongE;
	}

	public void setPainSuctiongE(boolean painSuctiongE) {
		this.painSuctiongE = painSuctiongE;
	}

	public boolean isMedicationN() {
		return this.medicationN;
	}

	public void setMedicationN(boolean medicationN) {
		this.medicationN = medicationN;
	}

	public boolean isMedicationD() {
		return this.medicationD;
	}

	public void setMedicationD(boolean medicationD) {
		this.medicationD = medicationD;
	}

	public boolean isMedicationE() {
		return this.medicationE;
	}

	public void setMedicationE(boolean medicationE) {
		this.medicationE = medicationE;
	}

	public boolean isFeedingHydrationN() {
		return this.feedingHydrationN;
	}

	public void setFeedingHydrationN(boolean feedingHydrationN) {
		this.feedingHydrationN = feedingHydrationN;
	}

	public boolean isFeedingHydrationD() {
		return this.feedingHydrationD;
	}

	public void setFeedingHydrationD(boolean feedingHydrationD) {
		this.feedingHydrationD = feedingHydrationD;
	}

	public boolean isFeedingHydrationE() {
		return this.feedingHydrationE;
	}

	public void setFeedingHydrationE(boolean feedingHydrationE) {
		this.feedingHydrationE = feedingHydrationE;
	}

	public boolean isIntramuscularInjectionsN() {
		return this.intramuscularInjectionsN;
	}

	public void setIntramuscularInjectionsN(boolean intramuscularInjectionsN) {
		this.intramuscularInjectionsN = intramuscularInjectionsN;
	}

	public boolean isTubeFeedingN() {
		return this.tubeFeedingN;
	}

	public void setTubeFeedingN(boolean tubeFeedingN) {
		this.tubeFeedingN = tubeFeedingN;
	}

	public boolean isTubeFeedingD() {
		return this.tubeFeedingD;
	}

	public void setTubeFeedingD(boolean tubeFeedingD) {
		this.tubeFeedingD = tubeFeedingD;
	}

	public boolean isTubeFeedingE() {
		return this.tubeFeedingE;
	}

	public void setTubeFeedingE(boolean tubeFeedingE) {
		this.tubeFeedingE = tubeFeedingE;
	}

	public boolean isPainManagementN() {
		return this.painManagementN;
	}

	public void setPainManagementN(boolean painManagementN) {
		this.painManagementN = painManagementN;
	}

	public boolean isPainManagementD() {
		return this.painManagementD;
	}

	public void setPainManagementD(boolean painManagementD) {
		this.painManagementD = painManagementD;
	}

	public boolean isPainManagementE() {
		return this.painManagementE;
	}

	public void setPainManagementE(boolean painManagementE) {
		this.painManagementE = painManagementE;
	}

	public boolean isWoundCareDressingN() {
		return this.woundCareDressingN;
	}

	public void setWoundCareDressingN(boolean woundCareDressingN) {
		this.woundCareDressingN = woundCareDressingN;
	}

	public boolean isStatisUlcersN() {
		return this.statisUlcersN;
	}

	public void setStatisUlcersN(boolean statisUlcersN) {
		this.statisUlcersN = statisUlcersN;
	}

	public boolean isSedimentD() {
		return this.sedimentD;
	}

	public void setSedimentD(boolean sedimentD) {
		this.sedimentD = sedimentD;
	}

	public boolean isDischargeD() {
		return this.dischargeD;
	}

	public void setDischargeD(boolean dischargeD) {
		this.dischargeD = dischargeD;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}

private package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentStatusSheet")
public class ResidentStatusSheet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9002772321397012541L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "formId")
	private int formId;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	@Column(name = "diet")
	private String diet;

	@Column(name = "levelCare")
	private String levelCare;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "chartNumber")
	private String chartNumber;

	@Column(name = "physician")
	private String physician;

	@Column(name = "prefferedName")
	private String prefferedName;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "room")
	private String room;

	@Column(name = "age")
	private String age;

	@Column(name = "restorativeOthersValue")
	private String restorativeOthersValue;

	@Column(name = "restorativeOthers")
	private boolean restorativeOthers;

	@Column(name = "restorativeCommunication")
	private boolean restorativeCommunication;

	@Column(name = "restorativeAmputation")
	private boolean restorativeAmputation;

	@Column(name = "restorativeEatingSwallowing")
	private boolean restorativeEatingSwallowing;

	@Column(name = "restorativeDressingGrooming")
	private boolean restorativeDressingGrooming;

	@Column(name = "restorativeWalking")
	private boolean restorativeWalking;

	@Column(name = "restorativeTransfer")
	private boolean restorativeTransfer;

	@Column(name = "restorativeBedMobility")
	private boolean restorativeBedMobility;

	@Column(name = "restorativeSplintBraceAssist")
	private boolean restorativeSplintBraceAssist;

	@Column(name = "restorativeAarom")
	private boolean restorativeAarom;

	@Column(name = "restorativeProm")
	private boolean restorativeProm;

	@Column(name = "restorativeRoom")
	private boolean restorativeRoom;

	@Column(name = "groomingPodatrist")
	private boolean groomingPodatrist;

	@Column(name = "groomingTotalCare")
	private boolean groomingTotalCare;

	@Column(name = "groomingSupervise")
	private boolean groomingSupervise;

	@Column(name = "groomingAssist")
	private boolean groomingAssist;

	@Column(name = "groomingSelfCare")
	private boolean groomingSelfCare;

	@Column(name = "groomingHairDresser")
	private boolean groomingHairDresser;

	@Column(name = "groomingFeet")
	private boolean groomingFeet;

	@Column(name = "groomingNails")
	private boolean groomingNails;

	@Column(name = "groomingShave")
	private boolean groomingShave;

	@Column(name = "groomingComb")
	private boolean groomingComb;

	@Column(name = "dressTotalCare")
	private boolean dressTotalCare;

	@Column(name = "dressSupervise")
	private boolean dressSupervise;

	@Column(name = "dressAssist")
	private boolean dressAssist;

	@Column(name = "dressSelfCare")
	private boolean dressSelfCare;

	@Column(name = "dressClothes")
	private boolean dressClothes;

	@Column(name = "dressShocking")
	private boolean dressShocking;

	@Column(name = "dressShoes")
	private boolean dressShoes;

	@Column(name = "skinContracturesSite")
	private String skinContracturesSite;

	@Column(name = "skinDecubitusSite")
	private String skinDecubitusSite;

	@Column(name = "skinContractures")
	private boolean skinContractures;

	@Column(name = "skinDecubitus")
	private boolean skinDecubitus;

	@Column(name = "skinSpecial")
	private boolean skinSpecial;

	@Column(name = "skinRoutine")
	private boolean skinRoutine;

	@Column(name = "mouthCareTotalCare")
	private boolean mouthCareTotalCare;

	@Column(name = "mouthCareSupervise")
	private boolean mouthCareSupervise;

	@Column(name = "mouthCareAssist")
	private boolean mouthCareAssist;

	@Column(name = "mouthCareSelfCare")
	private boolean mouthCareSelfCare;

	@Column(name = "mouthCareAtBedSise")
	private boolean mouthCareAtBedSise;

	@Column(name = "mouthCareNoTeeth")
	private boolean mouthCareNoTeeth;

	@Column(name = "mouthCareNoDentures")
	private boolean mouthCareNoDentures;

	@Column(name = "mouthCareLower")
	private boolean mouthCareLower;

	@Column(name = "mouthCareUpper")
	private boolean mouthCareUpper;

	@Column(name = "mouthCareDentures")
	private boolean mouthCareDentures;

	@Column(name = "bathBed")
	private boolean bathBed;

	@Column(name = "bathTotalCare")
	private boolean bathTotalCare;

	@Column(name = "bathAssist")
	private boolean bathAssist;

	@Column(name = "bathHairCare")
	private boolean bathHairCare;

	@Column(name = "bathSelfCare")
	private boolean bathSelfCare;

	@Column(name = "bathShower")
	private boolean bathShower;

	@Column(name = "bathTub")
	private boolean bathTub;

	@Column(name = "specificTask")
	private String specificTask;

	@Column(name = "riskFactors")
	private String riskFactors;

	@Column(name = "residentStrengths")
	private String residentStrengths;

	@Column(name = "mentalAttitudeForgetFul")
	private boolean mentalAttitudeForgetFul;

	@Column(name = "mentalAttitudeAgitated")
	private boolean mentalAttitudeAgitated;

	@Column(name = "mentalAttitudeAlert")
	private boolean mentalAttitudeAlert;

	@Column(name = "mentalAttitudeConfused")
	private boolean mentalAttitudeConfused;

	@Column(name = "mentalAttitudeDepressed")
	private boolean mentalAttitudeDepressed;

	@Column(name = "mentalAttitudeCheerful")
	private boolean mentalAttitudeCheerful;

	@Column(name = "mentalAttitudeMoody")
	private boolean mentalAttitudeMoody;

	@Column(name = "mentalAttitudeWellAdjusted")
	private boolean mentalAttitudeWellAdjusted;

	@Column(name = "mentalAttitudeOriented")
	private boolean mentalAttitudeOriented;

	@Column(name = "bracesType")
	private String bracesType;

	@Column(name = "bracesTotalCare")
	private boolean bracesTotalCare;

	@Column(name = "bracesAssist")
	private boolean bracesAssist;

	@Column(name = "bracesSelf")
	private boolean bracesSelf;

	@Column(name = "specialEquipmentTotalCareType")
	private String specialEquipmentTotalCareType;

	@Column(name = "specialEquipmentTotalCare")
	private boolean specialEquipmentTotalCare;

	@Column(name = "specialEquipmentAssist")
	private boolean specialEquipmentAssist;

	@Column(name = "specialEquipmentSelf")
	private boolean specialEquipmentSelf;

	@Column(name = "specialEquipmentProsthesis")
	private boolean specialEquipmentProsthesis;

	@Column(name = "supportiveAfterPressurePad")
	private boolean supportiveAfterPressurePad;

	@Column(name = "supportiveWaterBed")
	private boolean supportiveWaterBed;

	@Column(name = "supportiveWaterMattress")
	private boolean supportiveWaterMattress;

	@Column(name = "supportiveSpecialMattress")
	private boolean supportiveSpecialMattress;

	@Column(name = "supportiveFoamRubber")
	private boolean supportiveFoamRubber;

	@Column(name = "supportiveBrace")
	private boolean supportiveBrace;

	@Column(name = "supportiveBedBoard")
	private boolean supportiveBedBoard;

	@Column(name = "supportivePillows")
	private boolean supportivePillows;

	@Column(name = "supportiveTrapeze")
	private boolean supportiveTrapeze;

	@Column(name = "supportiveFootBoard")
	private boolean supportiveFootBoard;

	@Column(name = "supportiveBedCradle")
	private boolean supportiveBedCradle;

	@Column(name = "sideRailsOmit")
	private boolean sideRailsOmit;

	@Column(name = "sideRailsAtNight")
	private boolean sideRailsAtNight;

	@Column(name = "sideRailsConstantly")
	private boolean sideRailsConstantly;

	@Column(name = "restraintJacket")
	private boolean restraintJacket;

	@Column(name = "restraintWaist")
	private boolean restraintWaist;

	@Column(name = "restraintChair")
	private boolean restraintChair;

	@Column(name = "restraintBed")
	private boolean restraintBed;

	@Column(name = "positionChangeAfterTwoHour")
	private boolean positionChangeAfterTwoHour;

	@Column(name = "positionChangeAfterOneHour")
	private boolean positionChangeAfterOneHour;

	@Column(name = "positionChangeAfterHalfHour")
	private boolean positionChangeAfterHalfHour;

	@Column(name = "positionWith2Assist")
	private boolean positionWith2Assist;

	@Column(name = "positionWith1Assist")
	private boolean positionWith1Assist;

	@Column(name = "positionChangeBySelf")
	private boolean positionChangeBySelf;

	@Column(name = "paralysisParaplegla")
	private boolean paralysisParaplegla;

	@Column(name = "paralysisQuadriplegia")
	private boolean paralysisQuadriplegia;

	@Column(name = "paralysisLtSideOfFace")
	private boolean paralysisLtSideOfFace;

	@Column(name = "paralysisLeftLeg")
	private boolean paralysisLeftLeg;

	@Column(name = "paralysisRtsideOfFace")
	private boolean paralysisRtsideOfFace;

	@Column(name = "paralysisRtLeg")
	private boolean paralysisRtLeg;

	@Column(name = "paralysisLeftArm")
	private boolean paralysisLeftArm;

	@Column(name = "paralysisRtArm")
	private boolean paralysisRtArm;

	@Column(name = "dexterityLeftHand")
	private boolean dexterityLeftHand;

	@Column(name = "dexterityRightHand")
	private boolean dexterityRightHand;

	@Column(name = "fullAmbulatory")
	private boolean fullAmbulatory;

	@Column(name = "with2Assist")
	private boolean with2Assist;

	@Column(name = "withOneAssist")
	private boolean withOneAssist;

	@Column(name = "strecher")
	private boolean strecher;

	@Column(name = "wheelChair")
	private boolean wheelChair;

	@Column(name = "lifttoChair")
	private boolean lifttoChair;

	@Column(name = "bedtoChair")
	private boolean bedtoChair;

	@Column(name = "walker")
	private boolean walker;

	@Column(name = "cane")
	private boolean cane;

	@Column(name = "crutches")
	private boolean crutches;

	@Column(name = "walks")
	private boolean walks;

	@Column(name = "languageSpoken")
	private boolean languageSpoken;

	@Column(name = "aphasic")
	private boolean aphasic;

	@Column(name = "deficit")
	private boolean deficit;

	@Column(name = "speaksWell")
	private boolean speaksWell;

	@Column(name = "usesHearingAid")
	private boolean usesHearingAid;

	@Column(name = "hearingLeft")
	private boolean hearingLeft;

	@Column(name = "hearingRight")
	private boolean hearingRight;

	@Column(name = "partiallyDeaf")
	private boolean partiallyDeaf;

	@Column(name = "totallyDeaf")
	private boolean totallyDeaf;

	@Column(name = "blindLegally")
	private boolean blindLegally;

	@Column(name = "blindLeft")
	private boolean blindLeft;

	@Column(name = "blindBoth")
	private boolean blindBoth;

	@Column(name = "blindRight")
	private boolean blindRight;

	@Column(name = "blind")
	private boolean blind;

	@Column(name = "wearsGlasses")
	private boolean wearsGlasses;

	@Column(name = "cataracts")
	private boolean cataracts;

	@Column(name = "bothEye")
	private boolean both;

	@Column(name = "leftEye")
	private boolean left;

	@Column(name = "rightEye")
	private boolean right;

	@Column(name = "dRs")
	private String dRs;

	@Column(name = "dRd")
	private String dRd;

	@Column(name = "dRb")
	private String dRb;

	@Column(name = "sugarSubstitute")
	private boolean sugarSubstitute;

	@Column(name = "supplementFeeding")
	private boolean supplementFeeding;

	@Column(name = "dR")
	private boolean dR;

	@Column(name = "needBib")
	private boolean needBib;

	@Column(name = "eatingAssist")
	private boolean eatingAssist;

	@Column(name = "dateChange")
	private Date dateChange;

	@Column(name = "tubeFeedingSize")
	private String tubeFeedingSize;

	@Column(name = "tubeFeeding")
	private boolean tubeFeeding;

	@Column(name = "feeder")
	private boolean feeder;

	@Column(name = "oOBinChair")
	private boolean oOBinChair;

	@Column(name = "prepareFood")
	private boolean prepareFood;

	@Column(name = "feedsSelf")
	private boolean feedsSelf;

	@Column(name = "offerQuantity")
	private String offerQuantity;

	@Column(name = "outPut")
	private boolean outPut;

	@Column(name = "intake")
	private boolean intake;

	@Column(name = "offer")
	private boolean offer;

	@Column(name = "restrictOp")
	private boolean restrict;

	@Column(name = "restrictQuantity")
	private String restrictQuantity;

	@Column(name = "bowelTotalCare")
	private boolean bowelTotalCare;

	@Column(name = "bowelAssist")
	private boolean bowelAssist;

	@Column(name = "bowelSelfControl")
	private boolean bowelSelfControl;

	@Column(name = "bowelIncontinent")
	private boolean bowelIncontinent;

	@Column(name = "bowelCommode")
	private boolean bowelCommode;

	@Column(name = "bowelBedPan")
	private boolean bowelBedPan;

	@Column(name = "bowelBR")
	private boolean bowelBR;

	@Column(name = "bowelTraining")
	private boolean bowelTraining;

	@Column(name = "adultBriefs")
	private boolean adultBriefs;

	@Column(name = "schedule")
	private String schedule;

	@Column(name = "toiletProgram")
	private boolean toiletProgram;

	@Column(name = "bladderRetraining")
	private boolean bladderRetraining;

	@Column(name = "assist")
	private boolean assist;

	@Column(name = "totalCare")
	private boolean totalCare;

	@Column(name = "selfControl")
	private boolean selfControl;

	@Column(name = "incontinent")
	private boolean incontinent;

	@Column(name = "irrigationA")
	private String irrigationA;

	@Column(name = "irrigationC")
	private String irrigationC;

	@Column(name = "irrigation")
	private boolean irrigation;

	@Column(name = "catheterDateChange")
	private Date catheterDateChange;

	@Column(name = "catheterSize")
	private String catheterSize;

	@Column(name = "catheter")
	private boolean catheter;

	@Column(name = "commode")
	private boolean commode;

	@Column(name = "urinal")
	private boolean urinal;

	@Column(name = "bedPan")
	private boolean bedPan;

	@Column(name = "br")
	private boolean br;

	@Column(name = "maritalStatus")
	private int maritalStatus;

	@Column(name = "birthDate")
	private Date birthDate;

	public String getRestorativeOthersValue() {
		return restorativeOthersValue;
	}

	public void setRestorativeOthersValue(String restorativeOthersValue) {
		this.restorativeOthersValue = restorativeOthersValue;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getLevelCare() {
		return this.levelCare;
	}

	public void setLevelCare(String levelCare) {
		this.levelCare = levelCare;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getChartNumber() {
		return this.chartNumber;
	}

	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}

	public String getPhysician() {
		return this.physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getPrefferedName() {
		return this.prefferedName;
	}

	public void setPrefferedName(String prefferedName) {
		this.prefferedName = prefferedName;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public boolean isRestorativeOthers() {
		return this.restorativeOthers;
	}

	public void setRestorativeOthers(boolean restorativeOthers) {
		this.restorativeOthers = restorativeOthers;
	}

	public boolean isRestorativeCommunication() {
		return this.restorativeCommunication;
	}

	public void setRestorativeCommunication(boolean restorativeCommunication) {
		this.restorativeCommunication = restorativeCommunication;
	}

	public boolean isRestorativeAmputation() {
		return this.restorativeAmputation;
	}

	public void setRestorativeAmputation(boolean restorativeAmputation) {
		this.restorativeAmputation = restorativeAmputation;
	}

	public boolean isRestorativeEatingSwallowing() {
		return this.restorativeEatingSwallowing;
	}

	public void setRestorativeEatingSwallowing(
			boolean restorativeEatingSwallowing) {
		this.restorativeEatingSwallowing = restorativeEatingSwallowing;
	}

	public boolean isRestorativeDressingGrooming() {
		return this.restorativeDressingGrooming;
	}

	public void setRestorativeDressingGrooming(
			boolean restorativeDressingGrooming) {
		this.restorativeDressingGrooming = restorativeDressingGrooming;
	}

	public boolean isRestorativeWalking() {
		return this.restorativeWalking;
	}

	public void setRestorativeWalking(boolean restorativeWalking) {
		this.restorativeWalking = restorativeWalking;
	}

	public boolean isRestorativeTransfer() {
		return this.restorativeTransfer;
	}

	public void setRestorativeTransfer(boolean restorativeTransfer) {
		this.restorativeTransfer = restorativeTransfer;
	}

	public boolean isRestorativeBedMobility() {
		return this.restorativeBedMobility;
	}

	public void setRestorativeBedMobility(boolean restorativeBedMobility) {
		this.restorativeBedMobility = restorativeBedMobility;
	}

	public boolean isRestorativeSplintBraceAssist() {
		return this.restorativeSplintBraceAssist;
	}

	public void setRestorativeSplintBraceAssist(
			boolean restorativeSplintBraceAssist) {
		this.restorativeSplintBraceAssist = restorativeSplintBraceAssist;
	}

	public boolean isRestorativeAarom() {
		return this.restorativeAarom;
	}

	public void setRestorativeAarom(boolean restorativeAarom) {
		this.restorativeAarom = restorativeAarom;
	}

	public boolean isRestorativeProm() {
		return this.restorativeProm;
	}

	public void setRestorativeProm(boolean restorativeProm) {
		this.restorativeProm = restorativeProm;
	}

	public boolean isRestorativeRoom() {
		return this.restorativeRoom;
	}

	public void setRestorativeRoom(boolean restorativeRoom) {
		this.restorativeRoom = restorativeRoom;
	}

	public boolean isGroomingPodatrist() {
		return this.groomingPodatrist;
	}

	public void setGroomingPodatrist(boolean groomingPodatrist) {
		this.groomingPodatrist = groomingPodatrist;
	}

	public boolean isGroomingTotalCare() {
		return this.groomingTotalCare;
	}

	public void setGroomingTotalCare(boolean groomingTotalCare) {
		this.groomingTotalCare = groomingTotalCare;
	}

	public boolean isGroomingSupervise() {
		return this.groomingSupervise;
	}

	public void setGroomingSupervise(boolean groomingSupervise) {
		this.groomingSupervise = groomingSupervise;
	}

	public boolean isGroomingAssist() {
		return this.groomingAssist;
	}

	public void setGroomingAssist(boolean groomingAssist) {
		this.groomingAssist = groomingAssist;
	}

	public boolean isGroomingSelfCare() {
		return this.groomingSelfCare;
	}

	public void setGroomingSelfCare(boolean groomingSelfCare) {
		this.groomingSelfCare = groomingSelfCare;
	}

	public boolean isGroomingHairDresser() {
		return this.groomingHairDresser;
	}

	public void setGroomingHairDresser(boolean groomingHairDresser) {
		this.groomingHairDresser = groomingHairDresser;
	}

	public boolean isGroomingFeet() {
		return this.groomingFeet;
	}

	public void setGroomingFeet(boolean groomingFeet) {
		this.groomingFeet = groomingFeet;
	}

	public boolean isGroomingNails() {
		return this.groomingNails;
	}

	public void setGroomingNails(boolean groomingNails) {
		this.groomingNails = groomingNails;
	}

	public boolean isGroomingShave() {
		return this.groomingShave;
	}

	public void setGroomingShave(boolean groomingShave) {
		this.groomingShave = groomingShave;
	}

	public boolean isGroomingComb() {
		return this.groomingComb;
	}

	public void setGroomingComb(boolean groomingComb) {
		this.groomingComb = groomingComb;
	}

	public boolean isDressTotalCare() {
		return this.dressTotalCare;
	}

	public void setDressTotalCare(boolean dressTotalCare) {
		this.dressTotalCare = dressTotalCare;
	}

	public boolean isDressSupervise() {
		return this.dressSupervise;
	}

	public void setDressSupervise(boolean dressSupervise) {
		this.dressSupervise = dressSupervise;
	}

	public boolean isDressAssist() {
		return this.dressAssist;
	}

	public void setDressAssist(boolean dressAssist) {
		this.dressAssist = dressAssist;
	}

	public boolean isDressSelfCare() {
		return this.dressSelfCare;
	}

	public void setDressSelfCare(boolean dressSelfCare) {
		this.dressSelfCare = dressSelfCare;
	}

	public boolean isDressClothes() {
		return this.dressClothes;
	}

	public void setDressClothes(boolean dressClothes) {
		this.dressClothes = dressClothes;
	}

	public boolean isDressShocking() {
		return this.dressShocking;
	}

	public void setDressShocking(boolean dressShocking) {
		this.dressShocking = dressShocking;
	}

	public boolean isDressShoes() {
		return this.dressShoes;
	}

	public void setDressShoes(boolean dressShoes) {
		this.dressShoes = dressShoes;
	}

	public String getSkinContracturesSite() {
		return this.skinContracturesSite;
	}

	public void setSkinContracturesSite(String skinContracturesSite) {
		this.skinContracturesSite = skinContracturesSite;
	}

	public String getSkinDecubitusSite() {
		return this.skinDecubitusSite;
	}

	public void setSkinDecubitusSite(String skinDecubitusSite) {
		this.skinDecubitusSite = skinDecubitusSite;
	}

	public boolean isSkinContractures() {
		return this.skinContractures;
	}

	public void setSkinContractures(boolean skinContractures) {
		this.skinContractures = skinContractures;
	}

	public boolean isSkinDecubitus() {
		return this.skinDecubitus;
	}

	public void setSkinDecubitus(boolean skinDecubitus) {
		this.skinDecubitus = skinDecubitus;
	}

	public boolean isSkinSpecial() {
		return this.skinSpecial;
	}

	public void setSkinSpecial(boolean skinSpecial) {
		this.skinSpecial = skinSpecial;
	}

	public boolean isSkinRoutine() {
		return this.skinRoutine;
	}

	public void setSkinRoutine(boolean skinRoutine) {
		this.skinRoutine = skinRoutine;
	}

	public boolean isMouthCareTotalCare() {
		return this.mouthCareTotalCare;
	}

	public void setMouthCareTotalCare(boolean mouthCareTotalCare) {
		this.mouthCareTotalCare = mouthCareTotalCare;
	}

	public boolean isMouthCareSupervise() {
		return this.mouthCareSupervise;
	}

	public void setMouthCareSupervise(boolean mouthCareSupervise) {
		this.mouthCareSupervise = mouthCareSupervise;
	}

	public boolean isMouthCareAssist() {
		return this.mouthCareAssist;
	}

	public void setMouthCareAssist(boolean mouthCareAssist) {
		this.mouthCareAssist = mouthCareAssist;
	}

	public boolean isMouthCareSelfCare() {
		return this.mouthCareSelfCare;
	}

	public void setMouthCareSelfCare(boolean mouthCareSelfCare) {
		this.mouthCareSelfCare = mouthCareSelfCare;
	}

	public boolean isMouthCareAtBedSise() {
		return this.mouthCareAtBedSise;
	}

	public void setMouthCareAtBedSise(boolean mouthCareAtBedSise) {
		this.mouthCareAtBedSise = mouthCareAtBedSise;
	}

	public boolean isMouthCareNoTeeth() {
		return this.mouthCareNoTeeth;
	}

	public void setMouthCareNoTeeth(boolean mouthCareNoTeeth) {
		this.mouthCareNoTeeth = mouthCareNoTeeth;
	}

	public boolean isMouthCareNoDentures() {
		return this.mouthCareNoDentures;
	}

	public void setMouthCareNoDentures(boolean mouthCareNoDentures) {
		this.mouthCareNoDentures = mouthCareNoDentures;
	}

	public boolean isMouthCareLower() {
		return this.mouthCareLower;
	}

	public void setMouthCareLower(boolean mouthCareLower) {
		this.mouthCareLower = mouthCareLower;
	}

	public boolean isMouthCareUpper() {
		return this.mouthCareUpper;
	}

	public void setMouthCareUpper(boolean mouthCareUpper) {
		this.mouthCareUpper = mouthCareUpper;
	}

	public boolean isMouthCareDentures() {
		return this.mouthCareDentures;
	}

	public void setMouthCareDentures(boolean mouthCareDentures) {
		this.mouthCareDentures = mouthCareDentures;
	}

	public boolean isBathBed() {
		return this.bathBed;
	}

	public void setBathBed(boolean bathBed) {
		this.bathBed = bathBed;
	}

	public boolean isBathTotalCare() {
		return this.bathTotalCare;
	}

	public void setBathTotalCare(boolean bathTotalCare) {
		this.bathTotalCare = bathTotalCare;
	}

	public boolean isBathAssist() {
		return this.bathAssist;
	}

	public void setBathAssist(boolean bathAssist) {
		this.bathAssist = bathAssist;
	}

	public boolean isBathHairCare() {
		return this.bathHairCare;
	}

	public void setBathHairCare(boolean bathHairCare) {
		this.bathHairCare = bathHairCare;
	}

	public boolean isBathSelfCare() {
		return this.bathSelfCare;
	}

	public void setBathSelfCare(boolean bathSelfCare) {
		this.bathSelfCare = bathSelfCare;
	}

	public boolean isBathShower() {
		return this.bathShower;
	}

	public void setBathShower(boolean bathShower) {
		this.bathShower = bathShower;
	}

	public boolean isBathTub() {
		return this.bathTub;
	}

	public void setBathTub(boolean bathTub) {
		this.bathTub = bathTub;
	}

	public String getSpecificTask() {
		return this.specificTask;
	}

	public void setSpecificTask(String specificTask) {
		this.specificTask = specificTask;
	}

	public String getRiskFactors() {
		return this.riskFactors;
	}

	public void setRiskFactors(String riskFactors) {
		this.riskFactors = riskFactors;
	}

	public String getResidentStrengths() {
		return this.residentStrengths;
	}

	public void setResidentStrengths(String residentStrengths) {
		this.residentStrengths = residentStrengths;
	}

	public boolean isMentalAttitudeForgetFul() {
		return this.mentalAttitudeForgetFul;
	}

	public void setMentalAttitudeForgetFul(boolean mentalAttitudeForgetFul) {
		this.mentalAttitudeForgetFul = mentalAttitudeForgetFul;
	}

	public boolean isMentalAttitudeAgitated() {
		return this.mentalAttitudeAgitated;
	}

	public void setMentalAttitudeAgitated(boolean mentalAttitudeAgitated) {
		this.mentalAttitudeAgitated = mentalAttitudeAgitated;
	}

	public boolean isMentalAttitudeAlert() {
		return this.mentalAttitudeAlert;
	}

	public void setMentalAttitudeAlert(boolean mentalAttitudeAlert) {
		this.mentalAttitudeAlert = mentalAttitudeAlert;
	}

	public boolean isMentalAttitudeConfused() {
		return this.mentalAttitudeConfused;
	}

	public void setMentalAttitudeConfused(boolean mentalAttitudeConfused) {
		this.mentalAttitudeConfused = mentalAttitudeConfused;
	}

	public boolean isMentalAttitudeDepressed() {
		return this.mentalAttitudeDepressed;
	}

	public void setMentalAttitudeDepressed(boolean mentalAttitudeDepressed) {
		this.mentalAttitudeDepressed = mentalAttitudeDepressed;
	}

	public boolean isMentalAttitudeCheerful() {
		return this.mentalAttitudeCheerful;
	}

	public void setMentalAttitudeCheerful(boolean mentalAttitudeCheerful) {
		this.mentalAttitudeCheerful = mentalAttitudeCheerful;
	}

	public boolean isMentalAttitudeMoody() {
		return this.mentalAttitudeMoody;
	}

	public void setMentalAttitudeMoody(boolean mentalAttitudeMoody) {
		this.mentalAttitudeMoody = mentalAttitudeMoody;
	}

	public boolean isMentalAttitudeWellAdjusted() {
		return this.mentalAttitudeWellAdjusted;
	}

	public void setMentalAttitudeWellAdjusted(boolean mentalAttitudeWellAdjusted) {
		this.mentalAttitudeWellAdjusted = mentalAttitudeWellAdjusted;
	}

	public boolean isMentalAttitudeOriented() {
		return this.mentalAttitudeOriented;
	}

	public void setMentalAttitudeOriented(boolean mentalAttitudeOriented) {
		this.mentalAttitudeOriented = mentalAttitudeOriented;
	}

	public String getBracesType() {
		return this.bracesType;
	}

	public void setBracesType(String bracesType) {
		this.bracesType = bracesType;
	}

	public boolean isBracesTotalCare() {
		return this.bracesTotalCare;
	}

	public void setBracesTotalCare(boolean bracesTotalCare) {
		this.bracesTotalCare = bracesTotalCare;
	}

	public boolean isBracesAssist() {
		return this.bracesAssist;
	}

	public void setBracesAssist(boolean bracesAssist) {
		this.bracesAssist = bracesAssist;
	}

	public boolean isBracesSelf() {
		return this.bracesSelf;
	}

	public void setBracesSelf(boolean bracesSelf) {
		this.bracesSelf = bracesSelf;
	}

	public String getSpecialEquipmentTotalCareType() {
		return this.specialEquipmentTotalCareType;
	}

	public void setSpecialEquipmentTotalCareType(
			String specialEquipmentTotalCareType) {
		this.specialEquipmentTotalCareType = specialEquipmentTotalCareType;
	}

	public boolean isSpecialEquipmentTotalCare() {
		return this.specialEquipmentTotalCare;
	}

	public void setSpecialEquipmentTotalCare(boolean specialEquipmentTotalCare) {
		this.specialEquipmentTotalCare = specialEquipmentTotalCare;
	}

	public boolean isSpecialEquipmentAssist() {
		return this.specialEquipmentAssist;
	}

	public void setSpecialEquipmentAssist(boolean specialEquipmentAssist) {
		this.specialEquipmentAssist = specialEquipmentAssist;
	}

	public boolean isSpecialEquipmentSelf() {
		return this.specialEquipmentSelf;
	}

	public void setSpecialEquipmentSelf(boolean specialEquipmentSelf) {
		this.specialEquipmentSelf = specialEquipmentSelf;
	}

	public boolean isSpecialEquipmentProsthesis() {
		return this.specialEquipmentProsthesis;
	}

	public void setSpecialEquipmentProsthesis(boolean specialEquipmentProsthesis) {
		this.specialEquipmentProsthesis = specialEquipmentProsthesis;
	}

	public boolean isSupportiveAfterPressurePad() {
		return this.supportiveAfterPressurePad;
	}

	public void setSupportiveAfterPressurePad(boolean supportiveAfterPressurePad) {
		this.supportiveAfterPressurePad = supportiveAfterPressurePad;
	}

	public boolean isSupportiveWaterBed() {
		return this.supportiveWaterBed;
	}

	public void setSupportiveWaterBed(boolean supportiveWaterBed) {
		this.supportiveWaterBed = supportiveWaterBed;
	}

	public boolean isSupportiveWaterMattress() {
		return this.supportiveWaterMattress;
	}

	public void setSupportiveWaterMattress(boolean supportiveWaterMattress) {
		this.supportiveWaterMattress = supportiveWaterMattress;
	}

	public boolean isSupportiveSpecialMattress() {
		return this.supportiveSpecialMattress;
	}

	public void setSupportiveSpecialMattress(boolean supportiveSpecialMattress) {
		this.supportiveSpecialMattress = supportiveSpecialMattress;
	}

	public boolean isSupportiveFoamRubber() {
		return this.supportiveFoamRubber;
	}

	public void setSupportiveFoamRubber(boolean supportiveFoamRubber) {
		this.supportiveFoamRubber = supportiveFoamRubber;
	}

	public boolean isSupportiveBrace() {
		return this.supportiveBrace;
	}

	public void setSupportiveBrace(boolean supportiveBrace) {
		this.supportiveBrace = supportiveBrace;
	}

	public boolean isSupportiveBedBoard() {
		return this.supportiveBedBoard;
	}

	public void setSupportiveBedBoard(boolean supportiveBedBoard) {
		this.supportiveBedBoard = supportiveBedBoard;
	}

	public boolean isSupportivePillows() {
		return this.supportivePillows;
	}

	public void setSupportivePillows(boolean supportivePillows) {
		this.supportivePillows = supportivePillows;
	}

	public boolean isSupportiveTrapeze() {
		return this.supportiveTrapeze;
	}

	public void setSupportiveTrapeze(boolean supportiveTrapeze) {
		this.supportiveTrapeze = supportiveTrapeze;
	}

	public boolean isSupportiveFootBoard() {
		return this.supportiveFootBoard;
	}

	public void setSupportiveFootBoard(boolean supportiveFootBoard) {
		this.supportiveFootBoard = supportiveFootBoard;
	}

	public boolean isSupportiveBedCradle() {
		return this.supportiveBedCradle;
	}

	public void setSupportiveBedCradle(boolean supportiveBedCradle) {
		this.supportiveBedCradle = supportiveBedCradle;
	}

	public boolean isSideRailsOmit() {
		return this.sideRailsOmit;
	}

	public void setSideRailsOmit(boolean sideRailsOmit) {
		this.sideRailsOmit = sideRailsOmit;
	}

	public boolean isSideRailsAtNight() {
		return this.sideRailsAtNight;
	}

	public void setSideRailsAtNight(boolean sideRailsAtNight) {
		this.sideRailsAtNight = sideRailsAtNight;
	}

	public boolean isSideRailsConstantly() {
		return this.sideRailsConstantly;
	}

	public void setSideRailsConstantly(boolean sideRailsConstantly) {
		this.sideRailsConstantly = sideRailsConstantly;
	}

	public boolean isRestraintJacket() {
		return this.restraintJacket;
	}

	public void setRestraintJacket(boolean restraintJacket) {
		this.restraintJacket = restraintJacket;
	}

	public boolean isRestraintWaist() {
		return this.restraintWaist;
	}

	public void setRestraintWaist(boolean restraintWaist) {
		this.restraintWaist = restraintWaist;
	}

	public boolean isRestraintChair() {
		return this.restraintChair;
	}

	public void setRestraintChair(boolean restraintChair) {
		this.restraintChair = restraintChair;
	}

	public boolean isRestraintBed() {
		return this.restraintBed;
	}

	public void setRestraintBed(boolean restraintBed) {
		this.restraintBed = restraintBed;
	}

	public boolean isPositionChangeAfterTwoHour() {
		return this.positionChangeAfterTwoHour;
	}

	public void setPositionChangeAfterTwoHour(boolean positionChangeAfterTwoHour) {
		this.positionChangeAfterTwoHour = positionChangeAfterTwoHour;
	}

	public boolean isPositionChangeAfterOneHour() {
		return this.positionChangeAfterOneHour;
	}

	public void setPositionChangeAfterOneHour(boolean positionChangeAfterOneHour) {
		this.positionChangeAfterOneHour = positionChangeAfterOneHour;
	}

	public boolean isPositionChangeAfterHalfHour() {
		return this.positionChangeAfterHalfHour;
	}

	public void setPositionChangeAfterHalfHour(
			boolean positionChangeAfterHalfHour) {
		this.positionChangeAfterHalfHour = positionChangeAfterHalfHour;
	}

	public boolean isPositionWith2Assist() {
		return this.positionWith2Assist;
	}

	public void setPositionWith2Assist(boolean positionWith2Assist) {
		this.positionWith2Assist = positionWith2Assist;
	}

	public boolean isPositionWith1Assist() {
		return this.positionWith1Assist;
	}

	public void setPositionWith1Assist(boolean positionWith1Assist) {
		this.positionWith1Assist = positionWith1Assist;
	}

	public boolean isPositionChangeBySelf() {
		return this.positionChangeBySelf;
	}

	public void setPositionChangeBySelf(boolean positionChangeBySelf) {
		this.positionChangeBySelf = positionChangeBySelf;
	}

	public boolean isParalysisParaplegla() {
		return this.paralysisParaplegla;
	}

	public void setParalysisParaplegla(boolean paralysisParaplegla) {
		this.paralysisParaplegla = paralysisParaplegla;
	}

	public boolean isParalysisQuadriplegia() {
		return this.paralysisQuadriplegia;
	}

	public void setParalysisQuadriplegia(boolean paralysisQuadriplegia) {
		this.paralysisQuadriplegia = paralysisQuadriplegia;
	}

	public boolean isParalysisLtSideOfFace() {
		return this.paralysisLtSideOfFace;
	}

	public void setParalysisLtSideOfFace(boolean paralysisLtSideOfFace) {
		this.paralysisLtSideOfFace = paralysisLtSideOfFace;
	}

	public boolean isParalysisLeftLeg() {
		return this.paralysisLeftLeg;
	}

	public void setParalysisLeftLeg(boolean paralysisLeftLeg) {
		this.paralysisLeftLeg = paralysisLeftLeg;
	}

	public boolean isParalysisRtsideOfFace() {
		return this.paralysisRtsideOfFace;
	}

	public void setParalysisRtsideOfFace(boolean paralysisRtsideOfFace) {
		this.paralysisRtsideOfFace = paralysisRtsideOfFace;
	}

	public boolean isParalysisRtLeg() {
		return this.paralysisRtLeg;
	}

	public void setParalysisRtLeg(boolean paralysisRtLeg) {
		this.paralysisRtLeg = paralysisRtLeg;
	}

	public boolean isParalysisLeftArm() {
		return this.paralysisLeftArm;
	}

	public void setParalysisLeftArm(boolean paralysisLeftArm) {
		this.paralysisLeftArm = paralysisLeftArm;
	}

	public boolean isParalysisRtArm() {
		return this.paralysisRtArm;
	}

	public void setParalysisRtArm(boolean paralysisRtArm) {
		this.paralysisRtArm = paralysisRtArm;
	}

	public boolean isDexterityLeftHand() {
		return this.dexterityLeftHand;
	}

	public void setDexterityLeftHand(boolean dexterityLeftHand) {
		this.dexterityLeftHand = dexterityLeftHand;
	}

	public boolean isDexterityRightHand() {
		return this.dexterityRightHand;
	}

	public void setDexterityRightHand(boolean dexterityRightHand) {
		this.dexterityRightHand = dexterityRightHand;
	}

	public boolean isFullAmbulatory() {
		return this.fullAmbulatory;
	}

	public void setFullAmbulatory(boolean fullAmbulatory) {
		this.fullAmbulatory = fullAmbulatory;
	}

	public boolean isWith2Assist() {
		return this.with2Assist;
	}

	public void setWith2Assist(boolean with2Assist) {
		this.with2Assist = with2Assist;
	}

	public boolean isWithOneAssist() {
		return this.withOneAssist;
	}

	public void setWithOneAssist(boolean withOneAssist) {
		this.withOneAssist = withOneAssist;
	}

	public boolean isStrecher() {
		return this.strecher;
	}

	public void setStrecher(boolean strecher) {
		this.strecher = strecher;
	}

	public boolean isWheelChair() {
		return this.wheelChair;
	}

	public void setWheelChair(boolean wheelChair) {
		this.wheelChair = wheelChair;
	}

	public boolean isLifttoChair() {
		return this.lifttoChair;
	}

	public void setLifttoChair(boolean lifttoChair) {
		this.lifttoChair = lifttoChair;
	}

	public boolean isBedtoChair() {
		return this.bedtoChair;
	}

	public void setBedtoChair(boolean bedtoChair) {
		this.bedtoChair = bedtoChair;
	}

	public boolean isWalker() {
		return this.walker;
	}

	public void setWalker(boolean walker) {
		this.walker = walker;
	}

	public boolean isCane() {
		return this.cane;
	}

	public void setCane(boolean cane) {
		this.cane = cane;
	}

	public boolean isCrutches() {
		return this.crutches;
	}

	public void setCrutches(boolean crutches) {
		this.crutches = crutches;
	}

	public boolean isWalks() {
		return this.walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}

	public boolean isLanguageSpoken() {
		return this.languageSpoken;
	}

	public void setLanguageSpoken(boolean languageSpoken) {
		this.languageSpoken = languageSpoken;
	}

	public boolean isAphasic() {
		return this.aphasic;
	}

	public void setAphasic(boolean aphasic) {
		this.aphasic = aphasic;
	}

	public boolean isDeficit() {
		return this.deficit;
	}

	public void setDeficit(boolean deficit) {
		this.deficit = deficit;
	}

	public boolean isSpeaksWell() {
		return this.speaksWell;
	}

	public void setSpeaksWell(boolean speaksWell) {
		this.speaksWell = speaksWell;
	}

	public boolean isUsesHearingAid() {
		return this.usesHearingAid;
	}

	public void setUsesHearingAid(boolean usesHearingAid) {
		this.usesHearingAid = usesHearingAid;
	}

	public boolean isHearingLeft() {
		return this.hearingLeft;
	}

	public void setHearingLeft(boolean hearingLeft) {
		this.hearingLeft = hearingLeft;
	}

	public boolean isHearingRight() {
		return this.hearingRight;
	}

	public void setHearingRight(boolean hearingRight) {
		this.hearingRight = hearingRight;
	}

	public boolean isPartiallyDeaf() {
		return this.partiallyDeaf;
	}

	public void setPartiallyDeaf(boolean partiallyDeaf) {
		this.partiallyDeaf = partiallyDeaf;
	}

	public boolean isTotallyDeaf() {
		return this.totallyDeaf;
	}

	public void setTotallyDeaf(boolean totallyDeaf) {
		this.totallyDeaf = totallyDeaf;
	}

	public boolean isBlindLegally() {
		return this.blindLegally;
	}

	public void setBlindLegally(boolean blindLegally) {
		this.blindLegally = blindLegally;
	}

	public boolean isBlindLeft() {
		return this.blindLeft;
	}

	public void setBlindLeft(boolean blindLeft) {
		this.blindLeft = blindLeft;
	}

	public boolean isBlindBoth() {
		return this.blindBoth;
	}

	public void setBlindBoth(boolean blindBoth) {
		this.blindBoth = blindBoth;
	}

	public boolean isBlindRight() {
		return this.blindRight;
	}

	public void setBlindRight(boolean blindRight) {
		this.blindRight = blindRight;
	}

	public boolean isBlind() {
		return this.blind;
	}

	public void setBlind(boolean blind) {
		this.blind = blind;
	}

	public boolean isWearsGlasses() {
		return this.wearsGlasses;
	}

	public void setWearsGlasses(boolean wearsGlasses) {
		this.wearsGlasses = wearsGlasses;
	}

	public boolean isCataracts() {
		return this.cataracts;
	}

	public void setCataracts(boolean cataracts) {
		this.cataracts = cataracts;
	}

	public boolean isBoth() {
		return this.both;
	}

	public void setBoth(boolean both) {
		this.both = both;
	}

	public boolean isLeft() {
		return this.left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return this.right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public String getDRs() {
		return this.dRs;
	}

	public void setDRs(String dRs) {
		this.dRs = dRs;
	}

	public String getDRd() {
		return this.dRd;
	}

	public void setDRd(String dRd) {
		this.dRd = dRd;
	}

	public String getDRb() {
		return this.dRb;
	}

	public void setDRb(String dRb) {
		this.dRb = dRb;
	}

	public boolean isSugarSubstitute() {
		return this.sugarSubstitute;
	}

	public void setSugarSubstitute(boolean sugarSubstitute) {
		this.sugarSubstitute = sugarSubstitute;
	}

	public boolean isSupplementFeeding() {
		return this.supplementFeeding;
	}

	public void setSupplementFeeding(boolean supplementFeeding) {
		this.supplementFeeding = supplementFeeding;
	}

	public boolean isDR() {
		return this.dR;
	}

	public void setDR(boolean dR) {
		this.dR = dR;
	}

	public boolean isNeedBib() {
		return this.needBib;
	}

	public void setNeedBib(boolean needBib) {
		this.needBib = needBib;
	}

	public boolean isEatingAssist() {
		return this.eatingAssist;
	}

	public void setEatingAssist(boolean eatingAssist) {
		this.eatingAssist = eatingAssist;
	}

	public Date getDateChange() {
		return this.dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	public String getTubeFeedingSize() {
		return this.tubeFeedingSize;
	}

	public void setTubeFeedingSize(String tubeFeedingSize) {
		this.tubeFeedingSize = tubeFeedingSize;
	}

	public boolean isTubeFeeding() {
		return this.tubeFeeding;
	}

	public void setTubeFeeding(boolean tubeFeeding) {
		this.tubeFeeding = tubeFeeding;
	}

	public boolean isFeeder() {
		return this.feeder;
	}

	public void setFeeder(boolean feeder) {
		this.feeder = feeder;
	}

	public boolean isOOBinChair() {
		return this.oOBinChair;
	}

	public void setOOBinChair(boolean oOBinChair) {
		this.oOBinChair = oOBinChair;
	}

	public boolean isPrepareFood() {
		return this.prepareFood;
	}

	public void setPrepareFood(boolean prepareFood) {
		this.prepareFood = prepareFood;
	}

	public boolean isFeedsSelf() {
		return this.feedsSelf;
	}

	public void setFeedsSelf(boolean feedsSelf) {
		this.feedsSelf = feedsSelf;
	}

	public String getOfferQuantity() {
		return this.offerQuantity;
	}

	public void setOfferQuantity(String offerQuantity) {
		this.offerQuantity = offerQuantity;
	}

	public boolean isOutPut() {
		return this.outPut;
	}

	public void setOutPut(boolean outPut) {
		this.outPut = outPut;
	}

	public boolean isIntake() {
		return this.intake;
	}

	public void setIntake(boolean intake) {
		this.intake = intake;
	}

	public boolean isOffer() {
		return this.offer;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public boolean isRestrict() {
		return this.restrict;
	}

	public void setRestrict(boolean restrict) {
		this.restrict = restrict;
	}

	public String getRestrictQuantity() {
		return this.restrictQuantity;
	}

	public void setRestrictQuantity(String restrictQuantity) {
		this.restrictQuantity = restrictQuantity;
	}

	public boolean isBowelTotalCare() {
		return this.bowelTotalCare;
	}

	public void setBowelTotalCare(boolean bowelTotalCare) {
		this.bowelTotalCare = bowelTotalCare;
	}

	public boolean isBowelAssist() {
		return this.bowelAssist;
	}

	public void setBowelAssist(boolean bowelAssist) {
		this.bowelAssist = bowelAssist;
	}

	public boolean isBowelSelfControl() {
		return this.bowelSelfControl;
	}

	public void setBowelSelfControl(boolean bowelSelfControl) {
		this.bowelSelfControl = bowelSelfControl;
	}

	public boolean isBowelIncontinent() {
		return this.bowelIncontinent;
	}

	public void setBowelIncontinent(boolean bowelIncontinent) {
		this.bowelIncontinent = bowelIncontinent;
	}

	public boolean isBowelCommode() {
		return this.bowelCommode;
	}

	public void setBowelCommode(boolean bowelCommode) {
		this.bowelCommode = bowelCommode;
	}

	public boolean isBowelBedPan() {
		return this.bowelBedPan;
	}

	public void setBowelBedPan(boolean bowelBedPan) {
		this.bowelBedPan = bowelBedPan;
	}

	public boolean isBowelBR() {
		return this.bowelBR;
	}

	public void setBowelBR(boolean bowelBR) {
		this.bowelBR = bowelBR;
	}

	public boolean isBowelTraining() {
		return this.bowelTraining;
	}

	public void setBowelTraining(boolean bowelTraining) {
		this.bowelTraining = bowelTraining;
	}

	public boolean isAdultBriefs() {
		return this.adultBriefs;
	}

	public void setAdultBriefs(boolean adultBriefs) {
		this.adultBriefs = adultBriefs;
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public boolean isToiletProgram() {
		return this.toiletProgram;
	}

	public void setToiletProgram(boolean toiletProgram) {
		this.toiletProgram = toiletProgram;
	}

	public boolean isBladderRetraining() {
		return this.bladderRetraining;
	}

	public void setBladderRetraining(boolean bladderRetraining) {
		this.bladderRetraining = bladderRetraining;
	}

	public boolean isAssist() {
		return this.assist;
	}

	public void setAssist(boolean assist) {
		this.assist = assist;
	}

	public boolean isTotalCare() {
		return this.totalCare;
	}

	public void setTotalCare(boolean totalCare) {
		this.totalCare = totalCare;
	}

	public boolean isSelfControl() {
		return this.selfControl;
	}

	public void setSelfControl(boolean selfControl) {
		this.selfControl = selfControl;
	}

	public boolean isIncontinent() {
		return this.incontinent;
	}

	public void setIncontinent(boolean incontinent) {
		this.incontinent = incontinent;
	}

	public String getIrrigationA() {
		return this.irrigationA;
	}

	public void setIrrigationA(String irrigationA) {
		this.irrigationA = irrigationA;
	}

	public String getIrrigationC() {
		return this.irrigationC;
	}

	public void setIrrigationC(String irrigationC) {
		this.irrigationC = irrigationC;
	}

	public boolean isIrrigation() {
		return this.irrigation;
	}

	public void setIrrigation(boolean irrigation) {
		this.irrigation = irrigation;
	}

	public Date getCatheterDateChange() {
		return this.catheterDateChange;
	}

	public void setCatheterDateChange(Date catheterDateChange) {
		this.catheterDateChange = catheterDateChange;
	}

	public String getCatheterSize() {
		return this.catheterSize;
	}

	public void setCatheterSize(String catheterSize) {
		this.catheterSize = catheterSize;
	}

	public boolean isCatheter() {
		return this.catheter;
	}

	public void setCatheter(boolean catheter) {
		this.catheter = catheter;
	}

	public boolean isCommode() {
		return this.commode;
	}

	public void setCommode(boolean commode) {
		this.commode = commode;
	}

	public boolean isUrinal() {
		return this.urinal;
	}

	public void setUrinal(boolean urinal) {
		this.urinal = urinal;
	}

	public boolean isBedPan() {
		return this.bedPan;
	}

	public void setBedPan(boolean bedPan) {
		this.bedPan = bedPan;
	}

	public boolean isBr() {
		return this.br;
	}

	public void setBr(boolean br) {
		this.br = br;
	}

	public int getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

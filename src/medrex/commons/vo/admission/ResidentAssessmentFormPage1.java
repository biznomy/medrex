package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage1")
public class ResidentAssessmentFormPage1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5134841089292778246L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "lastName")
	private String lastName;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "isolationType")
	private int isolationType;

	@Column(name = "roomNo")
	private String roomNo;

	@Column(name = "transferringFacility")
	private String transferringFacility;

	@Column(name = "transportedBy")
	private String transportedBy;

	@Column(name = "timeAddmitted")
	private String timeAddmitted;

	@Column(name = "dOB")
	private String dOB;

	@Column(name = "age")
	private String age;

	@Column(name = "sex")
	private String sex;

	@Column(name = "attendingPhysician")
	private String attendingPhysician;

	@Column(name = "vitalSigns")
	private String vitalSigns;

	@Column(name = "pulse")
	private String pulse;

	@Column(name = "temprature")
	private String temprature;

	@Column(name = "respiration")
	private String respiration;

	@Column(name = "o2Sat")
	private String o2Sat;

	@Column(name = "weight")
	private String weight;

	@Column(name = "height")
	private String height;

	@Column(name = "nurseSignature")
	private String nurseSignature;

	@Column(name = "primaryDiagnosis")
	private String primaryDiagnosis;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "admissionDate")
	private Date admissionDate;
	@Column(name = "communicationType")
	private int communicationType;
	@Column(name = "communicationLanguage")
	private String communicationLanguage;
	@Column(name = "communicationAnswers")
	private int communicationAnswers;
	@Column(name = "communicationOriented")
	private int communicationOriented;
	@Column(name = "communicationDisorientedTime")
	private boolean communicationDisorientedTime;
	@Column(name = "communicationDisorientedPlace")
	private boolean communicationDisorientedPlace;
	@Column(name = "communicationDisorientedPerson")
	private boolean communicationDisorientedPerson;
	@Column(name = "hearingAdequateRight")
	private boolean hearingAdequateRight;
	@Column(name = "hearingAdequateLeft")
	private boolean hearingAdequateLeft;
	@Column(name = "hearingAdequateAidRight")
	private boolean hearingAdequateAidRight;
	@Column(name = "hearingAdequateAidLeft")
	private boolean hearingAdequateAidLeft;
	@Column(name = "hearingPoorRight")
	private boolean hearingPoorRight;
	@Column(name = "hearingPoorLeft")
	private boolean hearingPoorLeft;
	@Column(name = "hearingDeafRight")
	private boolean hearingDeafRight;
	@Column(name = "hearingDeafLeft")
	private boolean hearingDeafLeft;
	@Column(name = "visionAdequateRight")
	private boolean visionAdequateRight;
	@Column(name = "visionAdequateLeft")
	private boolean visionAdequateLeft;
	@Column(name = "visionAdequateGlassesRight")
	private boolean visionAdequateGlassesRight;
	@Column(name = "visionAdequateGlassesLeft")
	private boolean visionAdequateGlassesLeft;
	@Column(name = "visionPoorRight")
	private boolean visionPoorRight;
	@Column(name = "visionPoorLeft")
	private boolean visionPoorLeft;
	@Column(name = "visionBlindRight")
	private boolean visionBlindRight;
	@Column(name = "visionBlindLeft")
	private boolean visionBlindLeft;
	@Column(name = "eatingType")
	private int eatingType;
	@Column(name = "eatingReason")
	private String eatingReason;
	@Column(name = "eatingAdaptive")
	private String eatingAdaptive;
	@Column(name = "oralOwnTeeth")
	private int oralOwnTeeth;
	@Column(name = "oralCondition")
	private int oralCondition;
	@Column(name = "oralDentures")
	private int oralDentures;
	@Column(name = "oralUpper")
	private int oralUpper;
	@Column(name = "oralLower")
	private int oralLower;
	@Column(name = "oralDentureFit")
	private int oralDentureFit;
	@Column(name = "oralResident")
	private String oralResident;
	@Column(name = "bowelTypeToilet")
	private boolean bowelTypeToilet;
	@Column(name = "bowelTypeUrinal")
	private boolean bowelTypeUrinal;
	@Column(name = "bowelTypeBedpan")
	private boolean bowelTypeBedpan;
	@Column(name = "bowelTypeBedside")
	private boolean bowelTypeBedside;
	@Column(name = "bowelContinent")
	private int bowelContinent;
	@Column(name = "bowelConstipated")
	private int bowelConstipated;
	@Column(name = "bowelLaxative")
	private int bowelLaxative;
	@Column(name = "bowelEnemas")
	private int bowelEnemas;
	@Column(name = "bowelMovement")
	private String bowelMovement;
	@Column(name = "bladderContinent")
	private int bladderContinent;
	@Column(name = "bladderUrineColor")
	private String bladderUrineColor;
	@Column(name = "bladderUrineConsistency")
	private String bladderUrineConsistency;
	@Column(name = "bladderDribble")
	private boolean bladderDribble;
	@Column(name = "bladderCatheter")
	private boolean bladderCatheter;

	@Column(name = "bladderFoley")
	private boolean bladderFoley;
	@Column(name = "bladderSuprapubic")
	private boolean bladderSuprapubic;
	@Column(name = "bladderSize")
	private String bladderSize;
	@Column(name = "bladderTime")
	private String bladderTime;
	@Column(name = "radmission")
	private int radmission;
	@Column(name = "rreadmission")
	private int rreadmission;
	@Column(name = "significantChange")
	private int significantChange;
	@Column(name = "eatingNA")
	private boolean eatingNA;
	@Column(name = "catherType")
	private String catherType;
	@Column(name = "foleySize")
	private int foleySize;
	@Column(name = "dnrOrder")
	private int dnrOrder;
	@Column(name = "livingWill")
	private int livingWill;
	@Column(name = "healthCareProxy")
	private int healthCareProxy;
	@Column(name = "nameBracelet")
	private String nameBracelet;
	@Column(name = "namePlaceOnDoor")
	private String namePlaceOnDoor;
	@Column(name = "doesUnderstandEnglish")
	private boolean doesUnderstandEnglish;

	@Column(name = "makesSelfUnderstand")
	private int makesSelfUnderstand;
	@Column(name = "understand")
	private int understand;
	@Column(name = "usuallyUnderstand")
	private int usuallyUnderstand;

	@Column(name = "abilityunderstand")
	private int abilityunderstand;

	public int getDnrOrder() {
		return dnrOrder;
	}

	public void setDnrOrder(int dnrOrder) {
		this.dnrOrder = dnrOrder;
	}

	public int getLivingWill() {
		return livingWill;
	}

	public void setLivingWill(int livingWill) {
		this.livingWill = livingWill;
	}

	public int getHealthCareProxy() {
		return healthCareProxy;
	}

	public void setHealthCareProxy(int healthCareProxy) {
		this.healthCareProxy = healthCareProxy;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getTransferringFacility() {
		return transferringFacility;
	}

	public void setTransferringFacility(String transferringFacility) {
		this.transferringFacility = transferringFacility;
	}

	public String getTransportedBy() {
		return transportedBy;
	}

	public void setTransportedBy(String transportedBy) {
		this.transportedBy = transportedBy;
	}

	public String getTimeAddmitted() {
		return timeAddmitted;
	}

	public void setTimeAddmitted(String timeAddmitted) {
		this.timeAddmitted = timeAddmitted;
	}

	public String getDOB() {
		return dOB;
	}

	public void setDOB(String dob) {
		dOB = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAttendingPhysician() {
		return attendingPhysician;
	}

	public void setAttendingPhysician(String attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}

	public String getVitalSigns() {
		return vitalSigns;
	}

	public void setVitalSigns(String vitalSigns) {
		this.vitalSigns = vitalSigns;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getTemprature() {
		return temprature;
	}

	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}

	public String getRespiration() {
		return respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
	}

	public String getO2Sat() {
		return o2Sat;
	}

	public void setO2Sat(String sat) {
		o2Sat = sat;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getNurseSignature() {
		return nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getPrimaryDiagnosis() {
		return primaryDiagnosis;
	}

	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		this.primaryDiagnosis = primaryDiagnosis;
	}

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

	public Date getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(int communicationType) {
		this.communicationType = communicationType;
	}

	public String getCommunicationLanguage() {
		return communicationLanguage;
	}

	public void setCommunicationLanguage(String communicationLanguage) {
		this.communicationLanguage = communicationLanguage;
	}

	public int getCommunicationAnswers() {
		return communicationAnswers;
	}

	public void setCommunicationAnswers(int communicationAnswers) {
		this.communicationAnswers = communicationAnswers;
	}

	public int getCommunicationOriented() {
		return communicationOriented;
	}

	public void setCommunicationOriented(int communicationOriented) {
		this.communicationOriented = communicationOriented;
	}

	public boolean isCommunicationDisorientedTime() {
		return communicationDisorientedTime;
	}

	public void setCommunicationDisorientedTime(
			boolean communicationDisorientedTime) {
		this.communicationDisorientedTime = communicationDisorientedTime;
	}

	public boolean isCommunicationDisorientedPlace() {
		return communicationDisorientedPlace;
	}

	public void setCommunicationDisorientedPlace(
			boolean communicationDisorientedPlace) {
		this.communicationDisorientedPlace = communicationDisorientedPlace;
	}

	public boolean isCommunicationDisorientedPerson() {
		return communicationDisorientedPerson;
	}

	public void setCommunicationDisorientedPerson(
			boolean communicationDisorientedPerson) {
		this.communicationDisorientedPerson = communicationDisorientedPerson;
	}

	public boolean isHearingAdequateRight() {
		return hearingAdequateRight;
	}

	public void setHearingAdequateRight(boolean hearingAdequateRight) {
		this.hearingAdequateRight = hearingAdequateRight;
	}

	public boolean isHearingAdequateLeft() {
		return hearingAdequateLeft;
	}

	public void setHearingAdequateLeft(boolean hearingAdequateLeft) {
		this.hearingAdequateLeft = hearingAdequateLeft;
	}

	public boolean isHearingAdequateAidRight() {
		return hearingAdequateAidRight;
	}

	public void setHearingAdequateAidRight(boolean hearingAdequateAidRight) {
		this.hearingAdequateAidRight = hearingAdequateAidRight;
	}

	public boolean isHearingAdequateAidLeft() {
		return hearingAdequateAidLeft;
	}

	public void setHearingAdequateAidLeft(boolean hearingAdequateAidLeft) {
		this.hearingAdequateAidLeft = hearingAdequateAidLeft;
	}

	public boolean isHearingPoorRight() {
		return hearingPoorRight;
	}

	public void setHearingPoorRight(boolean hearingPoorRight) {
		this.hearingPoorRight = hearingPoorRight;
	}

	public boolean isHearingPoorLeft() {
		return hearingPoorLeft;
	}

	public void setHearingPoorLeft(boolean hearingPoorLeft) {
		this.hearingPoorLeft = hearingPoorLeft;
	}

	public boolean isHearingDeafRight() {
		return hearingDeafRight;
	}

	public void setHearingDeafRight(boolean hearingDeafRight) {
		this.hearingDeafRight = hearingDeafRight;
	}

	public boolean isHearingDeafLeft() {
		return hearingDeafLeft;
	}

	public void setHearingDeafLeft(boolean hearingDeafLeft) {
		this.hearingDeafLeft = hearingDeafLeft;
	}

	public boolean isVisionAdequateRight() {
		return visionAdequateRight;
	}

	public void setVisionAdequateRight(boolean visionAdequateRight) {
		this.visionAdequateRight = visionAdequateRight;
	}

	public boolean isVisionAdequateLeft() {
		return visionAdequateLeft;
	}

	public void setVisionAdequateLeft(boolean visionAdequateLeft) {
		this.visionAdequateLeft = visionAdequateLeft;
	}

	public boolean isVisionAdequateGlassesRight() {
		return visionAdequateGlassesRight;
	}

	public void setVisionAdequateGlassesRight(boolean visionAdequateGlassesRight) {
		this.visionAdequateGlassesRight = visionAdequateGlassesRight;
	}

	public boolean isVisionAdequateGlassesLeft() {
		return visionAdequateGlassesLeft;
	}

	public void setVisionAdequateGlassesLeft(boolean visionAdequateGlassesLeft) {
		this.visionAdequateGlassesLeft = visionAdequateGlassesLeft;
	}

	public boolean isVisionPoorRight() {
		return visionPoorRight;
	}

	public void setVisionPoorRight(boolean visionPoorRight) {
		this.visionPoorRight = visionPoorRight;
	}

	public boolean isVisionPoorLeft() {
		return visionPoorLeft;
	}

	public void setVisionPoorLeft(boolean visionPoorLeft) {
		this.visionPoorLeft = visionPoorLeft;
	}

	public boolean isVisionBlindRight() {
		return visionBlindRight;
	}

	public void setVisionBlindRight(boolean visionBlindRight) {
		this.visionBlindRight = visionBlindRight;
	}

	public boolean isVisionBlindLeft() {
		return visionBlindLeft;
	}

	public void setVisionBlindLeft(boolean visionBlindLeft) {
		this.visionBlindLeft = visionBlindLeft;
	}

	public int getEatingType() {
		return eatingType;
	}

	public void setEatingType(int eatingType) {
		this.eatingType = eatingType;
	}

	public String getEatingReason() {
		return eatingReason;
	}

	public void setEatingReason(String eatingReason) {
		this.eatingReason = eatingReason;
	}

	public String getEatingAdaptive() {
		return eatingAdaptive;
	}

	public void setEatingAdaptive(String eatingAdaptive) {
		this.eatingAdaptive = eatingAdaptive;
	}

	public int getOralOwnTeeth() {
		return oralOwnTeeth;
	}

	public void setOralOwnTeeth(int oralOwnTeeth) {
		this.oralOwnTeeth = oralOwnTeeth;
	}

	public int getOralCondition() {
		return oralCondition;
	}

	public void setOralCondition(int oralCondition) {
		this.oralCondition = oralCondition;
	}

	public int getOralDentures() {
		return oralDentures;
	}

	public void setOralDentures(int oralDentures) {
		this.oralDentures = oralDentures;
	}

	public int getOralUpper() {
		return oralUpper;
	}

	public void setOralUpper(int oralUpper) {
		this.oralUpper = oralUpper;
	}

	public int getOralLower() {
		return oralLower;
	}

	public void setOralLower(int oralLower) {
		this.oralLower = oralLower;
	}

	public int getOralDentureFit() {
		return oralDentureFit;
	}

	public void setOralDentureFit(int oralDentureFit) {
		this.oralDentureFit = oralDentureFit;
	}

	public String getOralResident() {
		return oralResident;
	}

	public void setOralResident(String oralResident) {
		this.oralResident = oralResident;
	}

	public boolean isBowelTypeToilet() {
		return bowelTypeToilet;
	}

	public void setBowelTypeToilet(boolean bowelTypeToilet) {
		this.bowelTypeToilet = bowelTypeToilet;
	}

	public boolean isBowelTypeUrinal() {
		return bowelTypeUrinal;
	}

	public void setBowelTypeUrinal(boolean bowelTypeUrinal) {
		this.bowelTypeUrinal = bowelTypeUrinal;
	}

	public boolean isBowelTypeBedpan() {
		return bowelTypeBedpan;
	}

	public void setBowelTypeBedpan(boolean bowelTypeBedpan) {
		this.bowelTypeBedpan = bowelTypeBedpan;
	}

	public boolean isBowelTypeBedside() {
		return bowelTypeBedside;
	}

	public void setBowelTypeBedside(boolean bowelTypeBedside) {
		this.bowelTypeBedside = bowelTypeBedside;
	}

	public String getBowelMovement() {
		return bowelMovement;
	}

	public void setBowelMovement(String bowelMovement) {
		this.bowelMovement = bowelMovement;
	}

	public String getBladderUrineColor() {
		return bladderUrineColor;
	}

	public void setBladderUrineColor(String bladderUrineColor) {
		this.bladderUrineColor = bladderUrineColor;
	}

	public String getBladderUrineConsistency() {
		return bladderUrineConsistency;
	}

	public void setBladderUrineConsistency(String bladderUrineConsistency) {
		this.bladderUrineConsistency = bladderUrineConsistency;
	}

	public boolean isBladderDribble() {
		return bladderDribble;
	}

	public void setBladderDribble(boolean bladderDribble) {
		this.bladderDribble = bladderDribble;
	}

	public boolean isBladderCatheter() {
		return bladderCatheter;
	}

	public void setBladderCatheter(boolean bladderCatheter) {
		this.bladderCatheter = bladderCatheter;
	}

	public boolean isBladderFoley() {
		return bladderFoley;
	}

	public void setBladderFoley(boolean bladderFoley) {
		this.bladderFoley = bladderFoley;
	}

	public boolean isBladderSuprapubic() {
		return bladderSuprapubic;
	}

	public void setBladderSuprapubic(boolean bladderSuprapubic) {
		this.bladderSuprapubic = bladderSuprapubic;
	}

	public String getBladderSize() {
		return bladderSize;
	}

	public void setBladderSize(String bladderSize) {
		this.bladderSize = bladderSize;
	}

	public String getBladderTime() {
		return bladderTime;
	}

	public void setBladderTime(String bladderTime) {
		this.bladderTime = bladderTime;
	}

	public int getBowelContinent() {
		return bowelContinent;
	}

	public void setBowelContinent(int bowelContinent) {
		this.bowelContinent = bowelContinent;
	}

	public int getBowelConstipated() {
		return bowelConstipated;
	}

	public void setBowelConstipated(int bowelConstipated) {
		this.bowelConstipated = bowelConstipated;
	}

	public int getBowelLaxative() {
		return bowelLaxative;
	}

	public void setBowelLaxative(int bowelLaxative) {
		this.bowelLaxative = bowelLaxative;
	}

	public int getBowelEnemas() {
		return bowelEnemas;
	}

	public void setBowelEnemas(int bowelEnemas) {
		this.bowelEnemas = bowelEnemas;
	}

	public int getBladderContinent() {
		return bladderContinent;
	}

	public void setBladderContinent(int bladderContinent) {
		this.bladderContinent = bladderContinent;
	}

	public int getRadmission() {
		return radmission;
	}

	public void setRadmission(int radmission) {
		this.radmission = radmission;
	}

	public int getRreadmission() {
		return rreadmission;
	}

	public void setRreadmission(int rreadmission) {
		this.rreadmission = rreadmission;
	}

	public int getSignificantChange() {
		return significantChange;
	}

	public void setSignificantChange(int significantChange) {
		this.significantChange = significantChange;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Date getNurseVisit() {
		return nurseVisit;
	}

	public void setNurseVisit(Date nurseVisit) {
		this.nurseVisit = nurseVisit;
	}

	public boolean isEatingNA() {
		return eatingNA;
	}

	public void setEatingNA(boolean eatingNA) {
		this.eatingNA = eatingNA;
	}

	public int getIsolationType() {
		return isolationType;
	}

	public void setIsolationType(int isolationType) {
		this.isolationType = isolationType;
	}

	public String getCatherType() {
		return catherType;
	}

	public void setCatherType(String catherType) {
		this.catherType = catherType;
	}

	public int getFoleySize() {
		return foleySize;
	}

	public void setFoleySize(int foleySize) {
		this.foleySize = foleySize;
	}

	public String getNameBracelet() {
		return nameBracelet;
	}

	public void setNameBracelet(String nameBracelet) {
		this.nameBracelet = nameBracelet;
	}

	public String getNamePlaceOnDoor() {
		return namePlaceOnDoor;
	}

	public void setNamePlaceOnDoor(String namePlaceOnDoor) {
		this.namePlaceOnDoor = namePlaceOnDoor;
	}

	public boolean isDoesUnderstandEnglish() {
		return doesUnderstandEnglish;
	}

	public void setDoesUnderstandEnglish(boolean doesUnderstandEnglish) {
		this.doesUnderstandEnglish = doesUnderstandEnglish;
	}

	public int getMakesSelfUnderstand() {
		return makesSelfUnderstand;
	}

	public void setMakesSelfUnderstand(int makesSelfUnderstand) {
		this.makesSelfUnderstand = makesSelfUnderstand;
	}

	public int getUnderstand() {
		return understand;
	}

	public void setUnderstand(int understand) {
		this.understand = understand;
	}

	public int getUsuallyUnderstand() {
		return usuallyUnderstand;
	}

	public void setUsuallyUnderstand(int usuallyUnderstand) {
		this.usuallyUnderstand = usuallyUnderstand;
	}

	public int getAbilityunderstand() {
		return abilityunderstand;
	}

	public void setAbilityunderstand(int abilityunderstand) {
		this.abilityunderstand = abilityunderstand;
	}

}

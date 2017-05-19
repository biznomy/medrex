package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentTransferForm")
public class ResidentTransferForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 667105735427112240L;

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

	@Column(name = "transport")
	private int transport;
	@Column(name = "advancedDirective")
	private int advancedDirective;
	@Column(name = "residentKnew")
	private int residentKnew;

	@Column(name = "familyAware")
	private int familyAware;

	@Column(name = "nurseSignature")
	private String nurseSignature;

	@Column(name = "placeOfExercise")
	private String placeOfExercise;

	@Column(name = "rangeOfMotion")
	private String rangeOfMotion;

	@Column(name = "sittingTimesAday")
	private String sittingTimesAday;

	@Column(name = "sittingHours")
	private String sittingHours;

	@Column(name = "outside")
	private String outside;

	@Column(name = "within")
	private String within;

	@Column(name = "individual")
	private String individual;

	@Column(name = "encourageGroup")
	private String encourageGroup;

	@Column(name = "walkingTimesAday")
	private String walkingTimesAday;

	@Column(name = "pronePosition")
	private String pronePosition;

	@Column(name = "avoidingPosition")
	private String avoidingPosition;

	@Column(name = "minTimesDay")
	private String minTimesDay;

	@Column(name = "stand")
	private String stand;

	@Column(name = "otherOutLined")
	private String otherOutLined;

	@Column(name = "onLeg")
	private String onLeg;

	@Column(name = "byResident")
	private String byResident;

	@Column(name = "weightBearingPartial")
	private String weightBearingPartial;

	@Column(name = "weightBearingFull")
	private String weightBearingFull;

	@Column(name = "hours")
	private String hours;

	@Column(name = "urinalysisResult")
	private String urinalysisResult;

	@Column(name = "serologyResult")
	private String serologyResult;

	@Column(name = "cBCResult")
	private String cBCResult;

	@Column(name = "chestXrayResult")
	private String chestXrayResult;

	@Column(name = "copyAttached")
	private boolean copyAttached;

	@Column(name = "poor")
	private boolean poor;

	@Column(name = "fair")
	private boolean fair;

	@Column(name = "good")
	private boolean good;

	@Column(name = "sensation")
	private boolean sensation;

	@Column(name = "vision")
	private boolean vision;

	@Column(name = "hearing")
	private boolean hearing;

	@Column(name = "speech")
	private boolean speech;

	@Column(name = "severe")
	private boolean severe;

	@Column(name = "moderate")
	private boolean moderate;

	@Column(name = "none")
	private boolean none;

	@Column(name = "mental")
	private boolean mental;

	@Column(name = "saliva")
	private boolean saliva;

	@Column(name = "bowel")
	private boolean bowel;

	@Column(name = "bladder")
	private boolean bladder;

	@Column(name = "decubUlcer")
	private boolean decubUlcer;

	@Column(name = "contracture")
	private boolean contracture;

	@Column(name = "paralysis")
	private boolean paralysis;

	@Column(name = "amputation")
	private boolean amputation;

	@Column(name = "dietOrder")
	private String dietOrder;

	@Column(name = "vitalBP")
	private String vitalBP;

	@Column(name = "vitalR")
	private String vitalR;

	@Column(name = "vitalPulse")
	private String vitalPulse;

	@Column(name = "vitalTemp")
	private String vitalTemp;

	@Column(name = "diagnosesTimeOfTransferSecondary")
	private String diagnosesTimeOfTransferSecondary;

	@Column(name = "diagnosesTimeOfTransferPrimary")
	private String diagnosesTimeOfTransferPrimary;

	@Column(name = "guardianPhoneNo")
	private String guardianPhoneNo;

	@Column(name = "guardianAddress")
	private String guardianAddress;

	@Column(name = "relativeGuardianName")
	private String relativeGuardianName;

	@Column(name = "timeOfTransfer")
	private String time;

	@Column(name = "clinicAppointment")
	private String clinicAppointment;

	@Column(name = "nameAndAddressHospital")
	private String nameAndAddressHospital;

	@Column(name = "nameAndAddress")
	private String nameAndAddress;

	@Column(name = "otherExplain")
	private boolean otherExplain;

	@Column(name = "employer")
	private boolean employer;

	@Column(name = "privateInsurance")
	private boolean privateInsurance;

	@Column(name = "publicAgency")
	private boolean publicAgency;

	@Column(name = "blueCross")
	private boolean blueCross;

	@Column(name = "selfOrFamily")
	private boolean selfOrFamily;

	@Column(name = "facilityName")
	private String facilityName;

	@Column(name = "religion")
	private String religion;

	@Column(name = "residentAddress")
	private String residentAddress;

	@Column(name = "healthInsuranceClaimNumber")
	private String healthInsuranceClaimNumber;

	@Column(name = "mI")
	private String mI;

	@Column(name = "residentFirstName")
	private String residentFirstName;

	@Column(name = "residentLastName")
	private String residentLastName;

	@Column(name = "employmentRelated")
	private int employmentRelated;

	@Column(name = "physicianCare")
	private int physicianCare;

	@Column(name = "dateTransfer")
	private Date dateTransfer;

	@Column(name = "urinalysis")
	private Date urinalysis;

	@Column(name = "serologyDate")
	private Date serologyDate;

	@Column(name = "cBCDate")
	private Date cBCDate;

	@Column(name = "chestXRay")
	private Date chestXRay;

	@Column(name = "tBTest")
	private Date tBTest;

	@Column(name = "dateOfLastPhysicalExam")
	private Date dateOfLastPhysicalExam;

	@Column(name = "dateOfClinicAppointment")
	private Date dateOfClinicAppointment;

	@Column(name = "dateOfDischarge")
	private Date dateOfDischarge;

	@Column(name = "dateOfAdmission")
	private Date dateOfAdmission;

	@Column(name = "dateOfTransfer")
	private Date dateOfTransfer;

	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "residentSex")
	private int residentSex;

	@Column(name = "genericCheckBox")
	private boolean genericSubstitute;

	public boolean isGenericSubstitute() {
		return genericSubstitute;
	}

	public void setGenericSubstitute(boolean genericSubstitute) {
		this.genericSubstitute = genericSubstitute;
	}

	public int getTransport() {
		return this.transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getAdvancedDirective() {
		return this.advancedDirective;
	}

	public void setAdvancedDirective(int advancedDirective) {
		this.advancedDirective = advancedDirective;
	}

	public int getResidentKnew() {
		return this.residentKnew;
	}

	public void setResidentKnew(int residentKnew) {
		this.residentKnew = residentKnew;
	}

	public int getFamilyAware() {
		return this.familyAware;
	}

	public void setFamilyAware(int familyAware) {
		this.familyAware = familyAware;
	}

	public String getNurseSignature() {
		return this.nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public String getPlaceOfExercise() {
		return this.placeOfExercise;
	}

	public void setPlaceOfExercise(String placeOfExercise) {
		this.placeOfExercise = placeOfExercise;
	}

	public String getRangeOfMotion() {
		return this.rangeOfMotion;
	}

	public void setRangeOfMotion(String rangeOfMotion) {
		this.rangeOfMotion = rangeOfMotion;
	}

	public String getSittingTimesAday() {
		return this.sittingTimesAday;
	}

	public void setSittingTimesAday(String sittingTimesAday) {
		this.sittingTimesAday = sittingTimesAday;
	}

	public String getSittingHours() {
		return this.sittingHours;
	}

	public void setSittingHours(String sittingHours) {
		this.sittingHours = sittingHours;
	}

	public String getOutside() {
		return this.outside;
	}

	public void setOutside(String outside) {
		this.outside = outside;
	}

	public String getWithin() {
		return this.within;
	}

	public void setWithin(String within) {
		this.within = within;
	}

	public String getIndividual() {
		return this.individual;
	}

	public void setIndividual(String individual) {
		this.individual = individual;
	}

	public String getEncourageGroup() {
		return this.encourageGroup;
	}

	public void setEncourageGroup(String encourageGroup) {
		this.encourageGroup = encourageGroup;
	}

	public String getWalkingTimesAday() {
		return this.walkingTimesAday;
	}

	public void setWalkingTimesAday(String walkingTimesAday) {
		this.walkingTimesAday = walkingTimesAday;
	}

	public String getPronePosition() {
		return this.pronePosition;
	}

	public void setPronePosition(String pronePosition) {
		this.pronePosition = pronePosition;
	}

	public String getAvoidingPosition() {
		return this.avoidingPosition;
	}

	public void setAvoidingPosition(String avoidingPosition) {
		this.avoidingPosition = avoidingPosition;
	}

	public String getMinTimesDay() {
		return this.minTimesDay;
	}

	public void setMinTimesDay(String minTimesDay) {
		this.minTimesDay = minTimesDay;
	}

	public String getStand() {
		return this.stand;
	}

	public void setStand(String stand) {
		this.stand = stand;
	}

	public String getOtherOutLined() {
		return this.otherOutLined;
	}

	public void setOtherOutLined(String otherOutLined) {
		this.otherOutLined = otherOutLined;
	}

	public String getOnLeg() {
		return this.onLeg;
	}

	public void setOnLeg(String onLeg) {
		this.onLeg = onLeg;
	}

	public String getByResident() {
		return this.byResident;
	}

	public void setByResident(String byResident) {
		this.byResident = byResident;
	}

	public String getWeightBearingPartial() {
		return this.weightBearingPartial;
	}

	public void setWeightBearingPartial(String weightBearingPartial) {
		this.weightBearingPartial = weightBearingPartial;
	}

	public String getWeightBearingFull() {
		return this.weightBearingFull;
	}

	public void setWeightBearingFull(String weightBearingFull) {
		this.weightBearingFull = weightBearingFull;
	}

	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getUrinalysisResult() {
		return this.urinalysisResult;
	}

	public void setUrinalysisResult(String urinalysisResult) {
		this.urinalysisResult = urinalysisResult;
	}

	public String getSerologyResult() {
		return this.serologyResult;
	}

	public void setSerologyResult(String serologyResult) {
		this.serologyResult = serologyResult;
	}

	public String getCBCResult() {
		return this.cBCResult;
	}

	public void setCBCResult(String cBCResult) {
		this.cBCResult = cBCResult;
	}

	public String getChestXrayResult() {
		return this.chestXrayResult;
	}

	public void setChestXrayResult(String chestXrayResult) {
		this.chestXrayResult = chestXrayResult;
	}

	public boolean isCopyAttached() {
		return this.copyAttached;
	}

	public void setCopyAttached(boolean copyAttached) {
		this.copyAttached = copyAttached;
	}

	public boolean isPoor() {
		return this.poor;
	}

	public void setPoor(boolean poor) {
		this.poor = poor;
	}

	public boolean isFair() {
		return this.fair;
	}

	public void setFair(boolean fair) {
		this.fair = fair;
	}

	public boolean isGood() {
		return this.good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public boolean isSensation() {
		return this.sensation;
	}

	public void setSensation(boolean sensation) {
		this.sensation = sensation;
	}

	public boolean isVision() {
		return this.vision;
	}

	public void setVision(boolean vision) {
		this.vision = vision;
	}

	public boolean isHearing() {
		return this.hearing;
	}

	public void setHearing(boolean hearing) {
		this.hearing = hearing;
	}

	public boolean isSpeech() {
		return this.speech;
	}

	public void setSpeech(boolean speech) {
		this.speech = speech;
	}

	public boolean isSevere() {
		return this.severe;
	}

	public void setSevere(boolean severe) {
		this.severe = severe;
	}

	public boolean isModerate() {
		return this.moderate;
	}

	public void setModerate(boolean moderate) {
		this.moderate = moderate;
	}

	public boolean isNone() {
		return this.none;
	}

	public void setNone(boolean none) {
		this.none = none;
	}

	public boolean isMental() {
		return this.mental;
	}

	public void setMental(boolean mental) {
		this.mental = mental;
	}

	public boolean isSaliva() {
		return this.saliva;
	}

	public void setSaliva(boolean saliva) {
		this.saliva = saliva;
	}

	public boolean isBowel() {
		return this.bowel;
	}

	public void setBowel(boolean bowel) {
		this.bowel = bowel;
	}

	public boolean isBladder() {
		return this.bladder;
	}

	public void setBladder(boolean bladder) {
		this.bladder = bladder;
	}

	public boolean isDecubUlcer() {
		return this.decubUlcer;
	}

	public void setDecubUlcer(boolean decubUlcer) {
		this.decubUlcer = decubUlcer;
	}

	public boolean isContracture() {
		return this.contracture;
	}

	public void setContracture(boolean contracture) {
		this.contracture = contracture;
	}

	public boolean isParalysis() {
		return this.paralysis;
	}

	public void setParalysis(boolean paralysis) {
		this.paralysis = paralysis;
	}

	public boolean isAmputation() {
		return this.amputation;
	}

	public void setAmputation(boolean amputation) {
		this.amputation = amputation;
	}

	public String getDietOrder() {
		return this.dietOrder;
	}

	public void setDietOrder(String dietOrder) {
		this.dietOrder = dietOrder;
	}

	public String getVitalBP() {
		return this.vitalBP;
	}

	public void setVitalBP(String vitalBP) {
		this.vitalBP = vitalBP;
	}

	public String getVitalR() {
		return this.vitalR;
	}

	public void setVitalR(String vitalR) {
		this.vitalR = vitalR;
	}

	public String getVitalPulse() {
		return this.vitalPulse;
	}

	public void setVitalPulse(String vitalPulse) {
		this.vitalPulse = vitalPulse;
	}

	public String getVitalTemp() {
		return this.vitalTemp;
	}

	public void setVitalTemp(String vitalTemp) {
		this.vitalTemp = vitalTemp;
	}

	public String getDiagnosesTimeOfTransferSecondary() {
		return this.diagnosesTimeOfTransferSecondary;
	}

	public void setDiagnosesTimeOfTransferSecondary(
			String diagnosesTimeOfTransferSecondary) {
		this.diagnosesTimeOfTransferSecondary = diagnosesTimeOfTransferSecondary;
	}

	public String getDiagnosesTimeOfTransferPrimary() {
		return this.diagnosesTimeOfTransferPrimary;
	}

	public void setDiagnosesTimeOfTransferPrimary(
			String diagnosesTimeOfTransferPrimary) {
		this.diagnosesTimeOfTransferPrimary = diagnosesTimeOfTransferPrimary;
	}

	public String getGuardianPhoneNo() {
		return this.guardianPhoneNo;
	}

	public void setGuardianPhoneNo(String guardianPhoneNo) {
		this.guardianPhoneNo = guardianPhoneNo;
	}

	public String getGuardianAddress() {
		return this.guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public String getRelativeGuardianName() {
		return this.relativeGuardianName;
	}

	public void setRelativeGuardianName(String relativeGuardianName) {
		this.relativeGuardianName = relativeGuardianName;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getClinicAppointment() {
		return this.clinicAppointment;
	}

	public void setClinicAppointment(String clinicAppointment) {
		this.clinicAppointment = clinicAppointment;
	}

	public String getNameAndAddressHospital() {
		return this.nameAndAddressHospital;
	}

	public void setNameAndAddressHospital(String nameAndAddressHospital) {
		this.nameAndAddressHospital = nameAndAddressHospital;
	}

	public String getNameAndAddress() {
		return this.nameAndAddress;
	}

	public void setNameAndAddress(String nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}

	public boolean isOtherExplain() {
		return this.otherExplain;
	}

	public void setOtherExplain(boolean otherExplain) {
		this.otherExplain = otherExplain;
	}

	public boolean isEmployer() {
		return this.employer;
	}

	public void setEmployer(boolean employer) {
		this.employer = employer;
	}

	public boolean isPrivateInsurance() {
		return this.privateInsurance;
	}

	public void setPrivateInsurance(boolean privateInsurance) {
		this.privateInsurance = privateInsurance;
	}

	public boolean isPublicAgency() {
		return this.publicAgency;
	}

	public void setPublicAgency(boolean publicAgency) {
		this.publicAgency = publicAgency;
	}

	public boolean isBlueCross() {
		return this.blueCross;
	}

	public void setBlueCross(boolean blueCross) {
		this.blueCross = blueCross;
	}

	public boolean isSelfOrFamily() {
		return this.selfOrFamily;
	}

	public void setSelfOrFamily(boolean selfOrFamily) {
		this.selfOrFamily = selfOrFamily;
	}

	public String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getResidentAddress() {
		return this.residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}

	public String getHealthInsuranceClaimNumber() {
		return this.healthInsuranceClaimNumber;
	}

	public void setHealthInsuranceClaimNumber(String healthInsuranceClaimNumber) {
		this.healthInsuranceClaimNumber = healthInsuranceClaimNumber;
	}

	public String getMI() {
		return this.mI;
	}

	public void setMI(String mI) {
		this.mI = mI;
	}

	public String getResidentFirstName() {
		return this.residentFirstName;
	}

	public void setResidentFirstName(String residentFirstName) {
		this.residentFirstName = residentFirstName;
	}

	public String getResidentLastName() {
		return this.residentLastName;
	}

	public void setResidentLastName(String residentLastName) {
		this.residentLastName = residentLastName;
	}

	public int getEmploymentRelated() {
		return this.employmentRelated;
	}

	public void setEmploymentRelated(int employmentRelated) {
		this.employmentRelated = employmentRelated;
	}

	public int getPhysicianCare() {
		return this.physicianCare;
	}

	public void setPhysicianCare(int physicianCare) {
		this.physicianCare = physicianCare;
	}

	public Date getDateTransfer() {
		return this.dateTransfer;
	}

	public void setDateTransfer(Date dateTransfer) {
		this.dateTransfer = dateTransfer;
	}

	public Date getUrinalysis() {
		return this.urinalysis;
	}

	public void setUrinalysis(Date urinalysis) {
		this.urinalysis = urinalysis;
	}

	public Date getSerologyDate() {
		return serologyDate;
	}

	public void setSerologyDate(Date serologyDate) {
		this.serologyDate = serologyDate;
	}

	public Date getCBCDate() {
		return cBCDate;
	}

	public void setCBCDate(Date date) {
		cBCDate = date;
	}

	public Date getChestXRay() {
		return this.chestXRay;
	}

	public void setChestXRay(Date chestXRay) {
		this.chestXRay = chestXRay;
	}

	public Date getTBTest() {
		return this.tBTest;
	}

	public void setTBTest(Date tBTest) {
		this.tBTest = tBTest;
	}

	public Date getDateOfLastPhysicalExam() {
		return this.dateOfLastPhysicalExam;
	}

	public void setDateOfLastPhysicalExam(Date dateOfLastPhysicalExam) {
		this.dateOfLastPhysicalExam = dateOfLastPhysicalExam;
	}

	public Date getDateOfClinicAppointment() {
		return this.dateOfClinicAppointment;
	}

	public void setDateOfClinicAppointment(Date dateOfClinicAppointment) {
		this.dateOfClinicAppointment = dateOfClinicAppointment;
	}

	public Date getDateOfDischarge() {
		return this.dateOfDischarge;
	}

	public void setDateOfDischarge(Date dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}

	public Date getDateOfAdmission() {
		return this.dateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public Date getDateOfTransfer() {
		return this.dateOfTransfer;
	}

	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getResidentSex() {
		return this.residentSex;
	}

	public void setResidentSex(int residentSex) {
		this.residentSex = residentSex;
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

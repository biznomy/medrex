package medrex.commons.vo.labSpecial;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MadexForm2")
public class MadexForm2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -710957142461260978L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "medicareA")
	private boolean medicareA;
	@Column(name = "medicareB")
	private boolean medicareB;
	@Column(name = "facility")
	private String facility;
	@Column(name = "patient")
	private String patient;
	@Column(name = "male")
	private boolean male;
	@Column(name = "female")
	private boolean female;
	@Column(name = "medicareNo")
	private String medicareNo;
	@Column(name = "birth")
	private Date birth;
	@Column(name = "rmNo")
	private String rmNo;
	@Column(name = "medicaidNo")
	private String medicaidNo;
	@Column(name = "insurance")
	private String insurance;
	@Column(name = "preApproval")
	private String preApproval;
	@Column(name = "caseField")
	private String caseField;
	@Column(name = "cardiological12")
	private boolean cardiological12;
	@Column(name = "cardiologicalLong")
	private boolean cardiologicalLong;
	@Column(name = "cardiologicalPacemaker")
	private boolean cardiologicalPacemaker;
	@Column(name = "cardiologicalDual")
	private boolean cardiologicalDual;
	@Column(name = "cardiologicalHolter")
	private boolean cardiologicalHolter;
	@Column(name = "cardiologicalPulse")
	private boolean cardiologicalPulse;
	@Column(name = "cardiologicalOxygen")
	private String cardiologicalOxygen;
	@Column(name = "pulseRate")
	private String pulseRate;
	@Column(name = "cardioOxygenYes")
	private boolean cardioOxygenYes;
	@Column(name = "cardioOxygenNo")
	private boolean cardioOxygenNo;
	@Column(name = "cardiologicalOther")
	private String cardiologicalOther;
	@Column(name = "Time")
	private String Time;
	@Column(name = "dateDone")
	private Date dateDone;
	@Column(name = "tech")
	private String tech;
	@Column(name = "ultrasoundsEcho")
	private boolean ultrasoundsEcho;
	@Column(name = "ultrasoundsThyroid")
	private boolean ultrasoundsThyroid;
	@Column(name = "ultrasoundsTesticular")
	private boolean ultrasoundsTesticular;
	@Column(name = "ultrasoundsCarotid")
	private boolean ultrasoundsCarotid;
	@Column(name = "ultrasoundsAbdominalMulti")
	private boolean ultrasoundsAbdominalMulti;
	@Column(name = "ultrasoundsAbdominalRetro")
	private boolean ultrasoundsAbdominalRetro;
	@Column(name = "ultrasoundsPelvis")
	private boolean ultrasoundsPelvis;
	@Column(name = "ultrasoundsProstate")
	private boolean ultrasoundsProstate;
	@Column(name = "ultrasoundsRenal")
	private boolean ultrasoundsRenal;
	@Column(name = "noPTSeen")
	private String noPTSeen;
	@Column(name = "noOfViews")
	private String noOfViews;
	@Column(name = "radiologistCode")
	private String radiologistCode;
	@Column(name = "ultrasoundsBreast")
	private boolean ultrasoundsBreast;
	@Column(name = "ultrasoundsChest")
	private boolean ultrasoundsChest;
	@Column(name = "ultrasoundsVenous")
	private boolean ultrasoundsVenous;
	@Column(name = "ultrasoundsVenousRT")
	private boolean ultrasoundsVenousRT;
	@Column(name = "ultrasoundsVenousLT")
	private boolean ultrasoundsVenousLT;
	@Column(name = "ultrasoundsVenousBoth")
	private boolean ultrasoundsVenousBoth;
	@Column(name = "ultrasoundsArterial")
	private boolean ultrasoundsArterial;
	@Column(name = "ultrasoundsArterialRT")
	private boolean ultrasoundsArterialRT;
	@Column(name = "ultrasoundsArterialLT")
	private boolean ultrasoundsArterialLT;
	@Column(name = "ultrasoundsArterialBoth")
	private boolean ultrasoundsArterialBoth;
	@Column(name = "ultrasoundsArterialUpper")
	private boolean ultrasoundsArterialUpper;
	@Column(name = "ultrasoundsArterialRT2")
	private boolean ultrasoundsArterialRT2;
	@Column(name = "ultrasoundsArterialLT2")
	private boolean ultrasoundsArterialLT2;
	@Column(name = "ultrasoundsArterialBoth2")
	private boolean ultrasoundsArterialBoth2;
	@Column(name = "ultrasoundsArterialLower2")
	private boolean ultrasoundsArterialLower2;
	@Column(name = "technicalComments")
	private String technicalComments;
	@Column(name = "xrayYes")
	private boolean xrayYes;
	@Column(name = "xrayNo")
	private boolean xrayNo;
	@Column(name = "authorizedSign")
	private String authorizedSign;
	@Column(name = "ot")
	private boolean ot;
	@Column(name = "st")
	private boolean st;
	@Column(name = "chargeNurse")
	private String chargeNurse;
	@Column(name = "cardioAbdominalPain")
	private boolean cardioAbdominalPain;
	@Column(name = "cardioAbdominalHeart")
	private boolean cardioAbdominalHeart;
	@Column(name = "cardioAbdominalLabs")
	private boolean cardioAbdominalLabs;
	@Column(name = "cardioAcuteEdema")
	private boolean cardioAcuteEdema;
	@Column(name = "cardioAcuteMyocarditis")
	private boolean cardioAcuteMyocarditis;
	@Column(name = "cardioAcuteParicarditis")
	private boolean cardioAcuteParicarditis;
	@Column(name = "cardioAcutePulmonary")
	private boolean cardioAcutePulmonary;
	@Column(name = "cardioAngina")
	private boolean cardioAngina;
	@Column(name = "cardioAortic")
	private boolean cardioAortic;
	@Column(name = "cardioChestPain")
	private boolean cardioChestPain;
	@Column(name = "cardioUndiagnosed")
	private boolean cardioUndiagnosed;
	@Column(name = "cardioChronic")
	private boolean cardioChronic;
	@Column(name = "cardioCardiac")
	private boolean cardioCardiac;
	@Column(name = "cardioCardiomyopathy")
	private boolean cardioCardiomyopathy;
	@Column(name = "cardioConvulsions")
	private boolean cardioConvulsions;
	@Column(name = "cardioDizziness")
	private boolean cardioDizziness;
	@Column(name = "cardioDiseasesMitral")
	private boolean cardioDiseasesMitral;
	@Column(name = "cardioDiseasesAortic")
	private boolean cardioDiseasesAortic;
	@Column(name = "cardioBenign")
	private boolean cardioBenign;
	@Column(name = "cardioUnspecifiedEssential")
	private boolean cardioUnspecifiedEssential;
	@Column(name = "ultrasoundsHypertensiveHeart")
	private boolean ultrasoundsHypertensiveHeart;
	@Column(name = "ultrasoundsMalignant")
	private boolean ultrasoundsMalignant;
	@Column(name = "ultrasoundsHeartDisease")
	private boolean ultrasoundsHeartDisease;
	@Column(name = "ultrasoundsHypertension")
	private boolean ultrasoundsHypertension;
	@Column(name = "ultrasoundsHypertensionHrt")
	private boolean ultrasoundsHypertensionHrt;
	@Column(name = "ultrasoundsHeartFailure")
	private boolean ultrasoundsHeartFailure;
	@Column(name = "ultrasoundsMyocardial")
	private boolean ultrasoundsMyocardial;
	@Column(name = "ultrasoundsOld")
	private boolean ultrasoundsOld;
	@Column(name = "ultrasoundsMyalgia")
	private boolean ultrasoundsMyalgia;
	@Column(name = "ultrasoundsMalignantNeoplasm")
	private boolean ultrasoundsMalignantNeoplasm;
	@Column(name = "ultrasoundsPalpitations")
	private boolean ultrasoundsPalpitations;
	@Column(name = "ultrasoundsPain")
	private boolean ultrasoundsPain;
	@Column(name = "ultrasoundsResptryFail")
	private boolean ultrasoundsResptryFail;
	@Column(name = "ultrasoundsChronic")
	private boolean ultrasoundsChronic;
	@Column(name = "ultrasoundsRheumatic")
	private boolean ultrasoundsRheumatic;
	@Column(name = "ultrasoundsResptryDistress")
	private boolean ultrasoundsResptryDistress;
	@Column(name = "ultrasoundsResptryArrest")
	private boolean ultrasoundsResptryArrest;
	@Column(name = "ultrasoundsSyncope")
	private boolean ultrasoundsSyncope;
	@Column(name = "ultrasoundsTechycardia")
	private boolean ultrasoundsTechycardia;
	@Column(name = "ultrasoundsThroat")
	private boolean ultrasoundsThroat;
	@Column(name = "ultraABDAcute")
	private boolean ultraABDAcute;
	@Column(name = "ultraABDAortic")
	private boolean ultraABDAortic;
	@Column(name = "ultraABDChronic")
	private boolean ultraABDChronic;
	@Column(name = "ultraABDAbd")
	private boolean ultraABDAbd;
	@Column(name = "ultraABDRupture")
	private boolean ultraABDRupture;
	@Column(name = "ultraABDAscites")
	private boolean ultraABDAscites;
	@Column(name = "ultraABDSwelling")
	private boolean ultraABDSwelling;
	@Column(name = "ultraABDLiver")
	private boolean ultraABDLiver;
	@Column(name = "ultraABDBenign")
	private boolean ultraABDBenign;
	@Column(name = "ultraABDCholelith")
	private boolean ultraABDCholelith;
	@Column(name = "ultraABDCyst")
	private boolean ultraABDCyst;
	@Column(name = "ultraABDHydonephrosis")
	private boolean ultraABDHydonephrosis;
	@Column(name = "ultraABDJaundice")
	private boolean ultraABDJaundice;
	@Column(name = "ultraABDKidneyCal")
	private boolean ultraABDKidneyCal;
	@Column(name = "ultraABDKidneyInfac")
	private boolean ultraABDKidneyInfac;
	@Column(name = "ultraABDLiverDisease")
	private boolean ultraABDLiverDisease;
	@Column(name = "ultraABDMalPancreas")
	private boolean ultraABDMalPancreas;
	@Column(name = "ultraABDMalIntestinal")
	private boolean ultraABDMalIntestinal;
	@Column(name = "clinicalHistory")
	private String clinicalHistory;
	@Column(name = "requestPhysician")
	private String requestPhysician;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "dateOrdered")
	private Date dateOrdered;
	@Column(name = "dateReportReceived")
	private Date dateReportReceived;

	public String getAuthorizedSign() {
		return authorizedSign;
	}

	public void setAuthorizedSign(String authorizedSign) {
		this.authorizedSign = authorizedSign;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public boolean isCardioAbdominalHeart() {
		return cardioAbdominalHeart;
	}

	public void setCardioAbdominalHeart(boolean cardioAbdominalHeart) {
		this.cardioAbdominalHeart = cardioAbdominalHeart;
	}

	public boolean isCardioAbdominalLabs() {
		return cardioAbdominalLabs;
	}

	public void setCardioAbdominalLabs(boolean cardioAbdominalLabs) {
		this.cardioAbdominalLabs = cardioAbdominalLabs;
	}

	public boolean isCardioAbdominalPain() {
		return cardioAbdominalPain;
	}

	public void setCardioAbdominalPain(boolean cardioAbdominalPain) {
		this.cardioAbdominalPain = cardioAbdominalPain;
	}

	public boolean isCardioAcuteEdema() {
		return cardioAcuteEdema;
	}

	public void setCardioAcuteEdema(boolean cardioAcuteEdema) {
		this.cardioAcuteEdema = cardioAcuteEdema;
	}

	public boolean isCardioAcuteMyocarditis() {
		return cardioAcuteMyocarditis;
	}

	public void setCardioAcuteMyocarditis(boolean cardioAcuteMyocarditis) {
		this.cardioAcuteMyocarditis = cardioAcuteMyocarditis;
	}

	public boolean isCardioAcuteParicarditis() {
		return cardioAcuteParicarditis;
	}

	public void setCardioAcuteParicarditis(boolean cardioAcuteParicarditis) {
		this.cardioAcuteParicarditis = cardioAcuteParicarditis;
	}

	public boolean isCardioAcutePulmonary() {
		return cardioAcutePulmonary;
	}

	public void setCardioAcutePulmonary(boolean cardioAcutePulmonary) {
		this.cardioAcutePulmonary = cardioAcutePulmonary;
	}

	public boolean isCardioAngina() {
		return cardioAngina;
	}

	public void setCardioAngina(boolean cardioAngina) {
		this.cardioAngina = cardioAngina;
	}

	public boolean isCardioAortic() {
		return cardioAortic;
	}

	public void setCardioAortic(boolean cardioAortic) {
		this.cardioAortic = cardioAortic;
	}

	public boolean isCardioBenign() {
		return cardioBenign;
	}

	public void setCardioBenign(boolean cardioBenign) {
		this.cardioBenign = cardioBenign;
	}

	public boolean isCardioCardiac() {
		return cardioCardiac;
	}

	public void setCardioCardiac(boolean cardioCardiac) {
		this.cardioCardiac = cardioCardiac;
	}

	public boolean isCardioCardiomyopathy() {
		return cardioCardiomyopathy;
	}

	public void setCardioCardiomyopathy(boolean cardioCardiomyopathy) {
		this.cardioCardiomyopathy = cardioCardiomyopathy;
	}

	public boolean isCardioChestPain() {
		return cardioChestPain;
	}

	public void setCardioChestPain(boolean cardioChestPain) {
		this.cardioChestPain = cardioChestPain;
	}

	public boolean isCardioChronic() {
		return cardioChronic;
	}

	public void setCardioChronic(boolean cardioChronic) {
		this.cardioChronic = cardioChronic;
	}

	public boolean isCardioConvulsions() {
		return cardioConvulsions;
	}

	public void setCardioConvulsions(boolean cardioConvulsions) {
		this.cardioConvulsions = cardioConvulsions;
	}

	public boolean isCardioDiseasesAortic() {
		return cardioDiseasesAortic;
	}

	public void setCardioDiseasesAortic(boolean cardioDiseasesAortic) {
		this.cardioDiseasesAortic = cardioDiseasesAortic;
	}

	public boolean isCardioDiseasesMitral() {
		return cardioDiseasesMitral;
	}

	public void setCardioDiseasesMitral(boolean cardioDiseasesMitral) {
		this.cardioDiseasesMitral = cardioDiseasesMitral;
	}

	public boolean isCardioDizziness() {
		return cardioDizziness;
	}

	public void setCardioDizziness(boolean cardioDizziness) {
		this.cardioDizziness = cardioDizziness;
	}

	public boolean isCardiological12() {
		return cardiological12;
	}

	public void setCardiological12(boolean cardiological12) {
		this.cardiological12 = cardiological12;
	}

	public boolean isCardiologicalDual() {
		return cardiologicalDual;
	}

	public void setCardiologicalDual(boolean cardiologicalDual) {
		this.cardiologicalDual = cardiologicalDual;
	}

	public boolean isCardiologicalHolter() {
		return cardiologicalHolter;
	}

	public void setCardiologicalHolter(boolean cardiologicalHolter) {
		this.cardiologicalHolter = cardiologicalHolter;
	}

	public boolean isCardiologicalLong() {
		return cardiologicalLong;
	}

	public void setCardiologicalLong(boolean cardiologicalLong) {
		this.cardiologicalLong = cardiologicalLong;
	}

	public String getCardiologicalOther() {
		return cardiologicalOther;
	}

	public void setCardiologicalOther(String cardiologicalOther) {
		this.cardiologicalOther = cardiologicalOther;
	}

	public String getCardiologicalOxygen() {
		return cardiologicalOxygen;
	}

	public void setCardiologicalOxygen(String cardiologicalOxygen) {
		this.cardiologicalOxygen = cardiologicalOxygen;
	}

	public boolean isCardiologicalPacemaker() {
		return cardiologicalPacemaker;
	}

	public void setCardiologicalPacemaker(boolean cardiologicalPacemaker) {
		this.cardiologicalPacemaker = cardiologicalPacemaker;
	}

	public boolean isCardiologicalPulse() {
		return cardiologicalPulse;
	}

	public void setCardiologicalPulse(boolean cardiologicalPulse) {
		this.cardiologicalPulse = cardiologicalPulse;
	}

	public boolean isCardioOxygenNo() {
		return cardioOxygenNo;
	}

	public void setCardioOxygenNo(boolean cardioOxygenNo) {
		this.cardioOxygenNo = cardioOxygenNo;
	}

	public boolean isCardioOxygenYes() {
		return cardioOxygenYes;
	}

	public void setCardioOxygenYes(boolean cardioOxygenYes) {
		this.cardioOxygenYes = cardioOxygenYes;
	}

	public boolean isCardioUndiagnosed() {
		return cardioUndiagnosed;
	}

	public void setCardioUndiagnosed(boolean cardioUndiagnosed) {
		this.cardioUndiagnosed = cardioUndiagnosed;
	}

	public boolean isCardioUnspecifiedEssential() {
		return cardioUnspecifiedEssential;
	}

	public void setCardioUnspecifiedEssential(boolean cardioUnspecifiedEssential) {
		this.cardioUnspecifiedEssential = cardioUnspecifiedEssential;
	}

	public String getCaseField() {
		return caseField;
	}

	public void setCaseField(String caseField) {
		this.caseField = caseField;
	}

	public String getChargeNurse() {
		return chargeNurse;
	}

	public void setChargeNurse(String chargeNurse) {
		this.chargeNurse = chargeNurse;
	}

	public String getClinicalHistory() {
		return clinicalHistory;
	}

	public void setClinicalHistory(String clinicalHistory) {
		this.clinicalHistory = clinicalHistory;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public Date getDateReportReceived() {
		return dateReportReceived;
	}

	public void setDateReportReceived(Date dateReportReceived) {
		this.dateReportReceived = dateReportReceived;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMedicaidNo() {
		return medicaidNo;
	}

	public void setMedicaidNo(String medicaidNo) {
		this.medicaidNo = medicaidNo;
	}

	public boolean isMedicareA() {
		return medicareA;
	}

	public void setMedicareA(boolean medicareA) {
		this.medicareA = medicareA;
	}

	public boolean isMedicareB() {
		return medicareB;
	}

	public void setMedicareB(boolean medicareB) {
		this.medicareB = medicareB;
	}

	public String getMedicareNo() {
		return medicareNo;
	}

	public void setMedicareNo(String medicareNo) {
		this.medicareNo = medicareNo;
	}

	public String getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(String noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getNoPTSeen() {
		return noPTSeen;
	}

	public void setNoPTSeen(String noPTSeen) {
		this.noPTSeen = noPTSeen;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public boolean isOt() {
		return ot;
	}

	public void setOt(boolean ot) {
		this.ot = ot;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getPreApproval() {
		return preApproval;
	}

	public void setPreApproval(String preApproval) {
		this.preApproval = preApproval;
	}

	public String getPulseRate() {
		return pulseRate;
	}

	public void setPulseRate(String pulseRate) {
		this.pulseRate = pulseRate;
	}

	public String getRadiologistCode() {
		return radiologistCode;
	}

	public void setRadiologistCode(String radiologistCode) {
		this.radiologistCode = radiologistCode;
	}

	public String getRequestPhysician() {
		return requestPhysician;
	}

	public void setRequestPhysician(String requestPhysician) {
		this.requestPhysician = requestPhysician;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getRmNo() {
		return rmNo;
	}

	public void setRmNo(String rmNo) {
		this.rmNo = rmNo;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isSt() {
		return st;
	}

	public void setSt(boolean st) {
		this.st = st;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public String getTechnicalComments() {
		return technicalComments;
	}

	public void setTechnicalComments(String technicalComments) {
		this.technicalComments = technicalComments;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public boolean isUltraABDAbd() {
		return ultraABDAbd;
	}

	public void setUltraABDAbd(boolean ultraABDAbd) {
		this.ultraABDAbd = ultraABDAbd;
	}

	public boolean isUltraABDAcute() {
		return ultraABDAcute;
	}

	public void setUltraABDAcute(boolean ultraABDAcute) {
		this.ultraABDAcute = ultraABDAcute;
	}

	public boolean isUltraABDAortic() {
		return ultraABDAortic;
	}

	public void setUltraABDAortic(boolean ultraABDAortic) {
		this.ultraABDAortic = ultraABDAortic;
	}

	public boolean isUltraABDAscites() {
		return ultraABDAscites;
	}

	public void setUltraABDAscites(boolean ultraABDAscites) {
		this.ultraABDAscites = ultraABDAscites;
	}

	public boolean isUltraABDBenign() {
		return ultraABDBenign;
	}

	public void setUltraABDBenign(boolean ultraABDBenign) {
		this.ultraABDBenign = ultraABDBenign;
	}

	public boolean isUltraABDCholelith() {
		return ultraABDCholelith;
	}

	public void setUltraABDCholelith(boolean ultraABDCholelith) {
		this.ultraABDCholelith = ultraABDCholelith;
	}

	public boolean isUltraABDChronic() {
		return ultraABDChronic;
	}

	public void setUltraABDChronic(boolean ultraABDChronic) {
		this.ultraABDChronic = ultraABDChronic;
	}

	public boolean isUltraABDCyst() {
		return ultraABDCyst;
	}

	public void setUltraABDCyst(boolean ultraABDCyst) {
		this.ultraABDCyst = ultraABDCyst;
	}

	public boolean isUltraABDHydonephrosis() {
		return ultraABDHydonephrosis;
	}

	public void setUltraABDHydonephrosis(boolean ultraABDHydonephrosis) {
		this.ultraABDHydonephrosis = ultraABDHydonephrosis;
	}

	public boolean isUltraABDJaundice() {
		return ultraABDJaundice;
	}

	public void setUltraABDJaundice(boolean ultraABDJaundice) {
		this.ultraABDJaundice = ultraABDJaundice;
	}

	public boolean isUltraABDKidneyCal() {
		return ultraABDKidneyCal;
	}

	public void setUltraABDKidneyCal(boolean ultraABDKidneyCal) {
		this.ultraABDKidneyCal = ultraABDKidneyCal;
	}

	public boolean isUltraABDKidneyInfac() {
		return ultraABDKidneyInfac;
	}

	public void setUltraABDKidneyInfac(boolean ultraABDKidneyInfac) {
		this.ultraABDKidneyInfac = ultraABDKidneyInfac;
	}

	public boolean isUltraABDLiver() {
		return ultraABDLiver;
	}

	public void setUltraABDLiver(boolean ultraABDLiver) {
		this.ultraABDLiver = ultraABDLiver;
	}

	public boolean isUltraABDLiverDisease() {
		return ultraABDLiverDisease;
	}

	public void setUltraABDLiverDisease(boolean ultraABDLiverDisease) {
		this.ultraABDLiverDisease = ultraABDLiverDisease;
	}

	public boolean isUltraABDMalIntestinal() {
		return ultraABDMalIntestinal;
	}

	public void setUltraABDMalIntestinal(boolean ultraABDMalIntestinal) {
		this.ultraABDMalIntestinal = ultraABDMalIntestinal;
	}

	public boolean isUltraABDMalPancreas() {
		return ultraABDMalPancreas;
	}

	public void setUltraABDMalPancreas(boolean ultraABDMalPancreas) {
		this.ultraABDMalPancreas = ultraABDMalPancreas;
	}

	public boolean isUltraABDRupture() {
		return ultraABDRupture;
	}

	public void setUltraABDRupture(boolean ultraABDRupture) {
		this.ultraABDRupture = ultraABDRupture;
	}

	public boolean isUltraABDSwelling() {
		return ultraABDSwelling;
	}

	public void setUltraABDSwelling(boolean ultraABDSwelling) {
		this.ultraABDSwelling = ultraABDSwelling;
	}

	public boolean isUltrasoundsAbdominalMulti() {
		return ultrasoundsAbdominalMulti;
	}

	public void setUltrasoundsAbdominalMulti(boolean ultrasoundsAbdominalMulti) {
		this.ultrasoundsAbdominalMulti = ultrasoundsAbdominalMulti;
	}

	public boolean isUltrasoundsAbdominalRetro() {
		return ultrasoundsAbdominalRetro;
	}

	public void setUltrasoundsAbdominalRetro(boolean ultrasoundsAbdominalRetro) {
		this.ultrasoundsAbdominalRetro = ultrasoundsAbdominalRetro;
	}

	public boolean isUltrasoundsArterial() {
		return ultrasoundsArterial;
	}

	public void setUltrasoundsArterial(boolean ultrasoundsArterial) {
		this.ultrasoundsArterial = ultrasoundsArterial;
	}

	public boolean isUltrasoundsArterialBoth() {
		return ultrasoundsArterialBoth;
	}

	public void setUltrasoundsArterialBoth(boolean ultrasoundsArterialBoth) {
		this.ultrasoundsArterialBoth = ultrasoundsArterialBoth;
	}

	public boolean isUltrasoundsArterialBoth2() {
		return ultrasoundsArterialBoth2;
	}

	public void setUltrasoundsArterialBoth2(boolean ultrasoundsArterialBoth2) {
		this.ultrasoundsArterialBoth2 = ultrasoundsArterialBoth2;
	}

	public boolean isUltrasoundsArterialLower2() {
		return ultrasoundsArterialLower2;
	}

	public void setUltrasoundsArterialLower2(boolean ultrasoundsArterialLower2) {
		this.ultrasoundsArterialLower2 = ultrasoundsArterialLower2;
	}

	public boolean isUltrasoundsArterialLT() {
		return ultrasoundsArterialLT;
	}

	public void setUltrasoundsArterialLT(boolean ultrasoundsArterialLT) {
		this.ultrasoundsArterialLT = ultrasoundsArterialLT;
	}

	public boolean isUltrasoundsArterialLT2() {
		return ultrasoundsArterialLT2;
	}

	public void setUltrasoundsArterialLT2(boolean ultrasoundsArterialLT2) {
		this.ultrasoundsArterialLT2 = ultrasoundsArterialLT2;
	}

	public boolean isUltrasoundsArterialRT() {
		return ultrasoundsArterialRT;
	}

	public void setUltrasoundsArterialRT(boolean ultrasoundsArterialRT) {
		this.ultrasoundsArterialRT = ultrasoundsArterialRT;
	}

	public boolean isUltrasoundsArterialRT2() {
		return ultrasoundsArterialRT2;
	}

	public void setUltrasoundsArterialRT2(boolean ultrasoundsArterialRT2) {
		this.ultrasoundsArterialRT2 = ultrasoundsArterialRT2;
	}

	public boolean isUltrasoundsArterialUpper() {
		return ultrasoundsArterialUpper;
	}

	public void setUltrasoundsArterialUpper(boolean ultrasoundsArterialUpper) {
		this.ultrasoundsArterialUpper = ultrasoundsArterialUpper;
	}

	public boolean isUltrasoundsBreast() {
		return ultrasoundsBreast;
	}

	public void setUltrasoundsBreast(boolean ultrasoundsBreast) {
		this.ultrasoundsBreast = ultrasoundsBreast;
	}

	public boolean isUltrasoundsCarotid() {
		return ultrasoundsCarotid;
	}

	public void setUltrasoundsCarotid(boolean ultrasoundsCarotid) {
		this.ultrasoundsCarotid = ultrasoundsCarotid;
	}

	public boolean isUltrasoundsChest() {
		return ultrasoundsChest;
	}

	public void setUltrasoundsChest(boolean ultrasoundsChest) {
		this.ultrasoundsChest = ultrasoundsChest;
	}

	public boolean isUltrasoundsChronic() {
		return ultrasoundsChronic;
	}

	public void setUltrasoundsChronic(boolean ultrasoundsChronic) {
		this.ultrasoundsChronic = ultrasoundsChronic;
	}

	public boolean isUltrasoundsEcho() {
		return ultrasoundsEcho;
	}

	public void setUltrasoundsEcho(boolean ultrasoundsEcho) {
		this.ultrasoundsEcho = ultrasoundsEcho;
	}

	public boolean isUltrasoundsHeartDisease() {
		return ultrasoundsHeartDisease;
	}

	public void setUltrasoundsHeartDisease(boolean ultrasoundsHeartDisease) {
		this.ultrasoundsHeartDisease = ultrasoundsHeartDisease;
	}

	public boolean isUltrasoundsHeartFailure() {
		return ultrasoundsHeartFailure;
	}

	public void setUltrasoundsHeartFailure(boolean ultrasoundsHeartFailure) {
		this.ultrasoundsHeartFailure = ultrasoundsHeartFailure;
	}

	public boolean isUltrasoundsHypertension() {
		return ultrasoundsHypertension;
	}

	public void setUltrasoundsHypertension(boolean ultrasoundsHypertension) {
		this.ultrasoundsHypertension = ultrasoundsHypertension;
	}

	public boolean isUltrasoundsHypertensionHrt() {
		return ultrasoundsHypertensionHrt;
	}

	public void setUltrasoundsHypertensionHrt(boolean ultrasoundsHypertensionHrt) {
		this.ultrasoundsHypertensionHrt = ultrasoundsHypertensionHrt;
	}

	public boolean isUltrasoundsHypertensiveHeart() {
		return ultrasoundsHypertensiveHeart;
	}

	public void setUltrasoundsHypertensiveHeart(
			boolean ultrasoundsHypertensiveHeart) {
		this.ultrasoundsHypertensiveHeart = ultrasoundsHypertensiveHeart;
	}

	public boolean isUltrasoundsMalignant() {
		return ultrasoundsMalignant;
	}

	public void setUltrasoundsMalignant(boolean ultrasoundsMalignant) {
		this.ultrasoundsMalignant = ultrasoundsMalignant;
	}

	public boolean isUltrasoundsMalignantNeoplasm() {
		return ultrasoundsMalignantNeoplasm;
	}

	public void setUltrasoundsMalignantNeoplasm(
			boolean ultrasoundsMalignantNeoplasm) {
		this.ultrasoundsMalignantNeoplasm = ultrasoundsMalignantNeoplasm;
	}

	public boolean isUltrasoundsMyalgia() {
		return ultrasoundsMyalgia;
	}

	public void setUltrasoundsMyalgia(boolean ultrasoundsMyalgia) {
		this.ultrasoundsMyalgia = ultrasoundsMyalgia;
	}

	public boolean isUltrasoundsMyocardial() {
		return ultrasoundsMyocardial;
	}

	public void setUltrasoundsMyocardial(boolean ultrasoundsMyocardial) {
		this.ultrasoundsMyocardial = ultrasoundsMyocardial;
	}

	public boolean isUltrasoundsOld() {
		return ultrasoundsOld;
	}

	public void setUltrasoundsOld(boolean ultrasoundsOld) {
		this.ultrasoundsOld = ultrasoundsOld;
	}

	public boolean isUltrasoundsPain() {
		return ultrasoundsPain;
	}

	public void setUltrasoundsPain(boolean ultrasoundsPain) {
		this.ultrasoundsPain = ultrasoundsPain;
	}

	public boolean isUltrasoundsPalpitations() {
		return ultrasoundsPalpitations;
	}

	public void setUltrasoundsPalpitations(boolean ultrasoundsPalpitations) {
		this.ultrasoundsPalpitations = ultrasoundsPalpitations;
	}

	public boolean isUltrasoundsPelvis() {
		return ultrasoundsPelvis;
	}

	public void setUltrasoundsPelvis(boolean ultrasoundsPelvis) {
		this.ultrasoundsPelvis = ultrasoundsPelvis;
	}

	public boolean isUltrasoundsProstate() {
		return ultrasoundsProstate;
	}

	public void setUltrasoundsProstate(boolean ultrasoundsProstate) {
		this.ultrasoundsProstate = ultrasoundsProstate;
	}

	public boolean isUltrasoundsRenal() {
		return ultrasoundsRenal;
	}

	public void setUltrasoundsRenal(boolean ultrasoundsRenal) {
		this.ultrasoundsRenal = ultrasoundsRenal;
	}

	public boolean isUltrasoundsResptryArrest() {
		return ultrasoundsResptryArrest;
	}

	public void setUltrasoundsResptryArrest(boolean ultrasoundsResptryArrest) {
		this.ultrasoundsResptryArrest = ultrasoundsResptryArrest;
	}

	public boolean isUltrasoundsResptryDistress() {
		return ultrasoundsResptryDistress;
	}

	public void setUltrasoundsResptryDistress(boolean ultrasoundsResptryDistress) {
		this.ultrasoundsResptryDistress = ultrasoundsResptryDistress;
	}

	public boolean isUltrasoundsResptryFail() {
		return ultrasoundsResptryFail;
	}

	public void setUltrasoundsResptryFail(boolean ultrasoundsResptryFail) {
		this.ultrasoundsResptryFail = ultrasoundsResptryFail;
	}

	public boolean isUltrasoundsRheumatic() {
		return ultrasoundsRheumatic;
	}

	public void setUltrasoundsRheumatic(boolean ultrasoundsRheumatic) {
		this.ultrasoundsRheumatic = ultrasoundsRheumatic;
	}

	public boolean isUltrasoundsSyncope() {
		return ultrasoundsSyncope;
	}

	public void setUltrasoundsSyncope(boolean ultrasoundsSyncope) {
		this.ultrasoundsSyncope = ultrasoundsSyncope;
	}

	public boolean isUltrasoundsTechycardia() {
		return ultrasoundsTechycardia;
	}

	public void setUltrasoundsTechycardia(boolean ultrasoundsTechycardia) {
		this.ultrasoundsTechycardia = ultrasoundsTechycardia;
	}

	public boolean isUltrasoundsTesticular() {
		return ultrasoundsTesticular;
	}

	public void setUltrasoundsTesticular(boolean ultrasoundsTesticular) {
		this.ultrasoundsTesticular = ultrasoundsTesticular;
	}

	public boolean isUltrasoundsThroat() {
		return ultrasoundsThroat;
	}

	public void setUltrasoundsThroat(boolean ultrasoundsThroat) {
		this.ultrasoundsThroat = ultrasoundsThroat;
	}

	public boolean isUltrasoundsThyroid() {
		return ultrasoundsThyroid;
	}

	public void setUltrasoundsThyroid(boolean ultrasoundsThyroid) {
		this.ultrasoundsThyroid = ultrasoundsThyroid;
	}

	public boolean isUltrasoundsVenous() {
		return ultrasoundsVenous;
	}

	public void setUltrasoundsVenous(boolean ultrasoundsVenous) {
		this.ultrasoundsVenous = ultrasoundsVenous;
	}

	public boolean isUltrasoundsVenousBoth() {
		return ultrasoundsVenousBoth;
	}

	public void setUltrasoundsVenousBoth(boolean ultrasoundsVenousBoth) {
		this.ultrasoundsVenousBoth = ultrasoundsVenousBoth;
	}

	public boolean isUltrasoundsVenousLT() {
		return ultrasoundsVenousLT;
	}

	public void setUltrasoundsVenousLT(boolean ultrasoundsVenousLT) {
		this.ultrasoundsVenousLT = ultrasoundsVenousLT;
	}

	public boolean isUltrasoundsVenousRT() {
		return ultrasoundsVenousRT;
	}

	public void setUltrasoundsVenousRT(boolean ultrasoundsVenousRT) {
		this.ultrasoundsVenousRT = ultrasoundsVenousRT;
	}

	public boolean isXrayNo() {
		return xrayNo;
	}

	public void setXrayNo(boolean xrayNo) {
		this.xrayNo = xrayNo;
	}

	public boolean isXrayYes() {
		return xrayYes;
	}

	public void setXrayYes(boolean xrayYes) {
		this.xrayYes = xrayYes;
	}

}

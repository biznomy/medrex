package medrex.commons.vo.monthlySummary;

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

@Entity
@Table(name = "AdmissionAndDischargeSummary")
public class AdmissionAndDischargeSummary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3601144753728819831L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	private MonthlySummaryRecord formId;
	@Column(name = "residentId")
	int residentId;

	@Column(name = "maritalStatus")
	int maritalStatus;

	@Column(name = "sex")
	int sex;
	@Column(name = "admittedForm")
	private String admittedForm;
	@Column(name = "howTransferred")
	private String howTransferred;
	@Column(name = "phone10")
	private String phone10;
	@Column(name = "phone9")
	private String phone9;
	@Column(name = "funeralHome")
	private String funeralHome;
	@Column(name = "discharge2")
	private String discharge2;
	@Column(name = "admissionNo")
	private String admissionNo;
	@Column(name = "stationRoom")
	private String stationRoom;
	@Column(name = "residentName2")
	private String residentName2;
	@Column(name = "title")
	private String title;
	@Column(name = "bReviewedBy")
	private String bReviewedBy;
	@Column(name = "noOfStayed")
	private String noOfStayed;
	@Column(name = "dateAndTime")
	private String dateAndTime;
	@Column(name = "onSet2")
	private String onSet2;
	@Column(name = "onSet1")
	private String onSet1;
	@Column(name = "comments")
	private String comments;
	@Column(name = "cityStateZip")
	private String cityStateZip;
	@Column(name = "previousAddress")
	private String previousAddress;
	@Column(name = "nursingAlert")
	private String nursingAlert;
	@Column(name = "industry")
	private String industry;
	@Column(name = "previousOccupation")
	private String previousOccupation;
	@Column(name = "primaryLanguage")
	private String primaryLanguage;
	@Column(name = "educationLevel")
	private String educationLevel;
	@Column(name = "phone14")
	private String phone14;
	@Column(name = "powerOfAttorney")
	private String powerOfAttorney;
	@Column(name = "phone16")
	private String phone16;
	@Column(name = "clergy")
	private String clergy;
	@Column(name = "phone13")
	private String phone13;
	@Column(name = "nameOfChurch")
	private String nameOfChurch;
	@Column(name = "phone15")
	private String phone15;
	@Column(name = "ambulancePreference")
	private String ambulancePreference;
	@Column(name = "phone12")
	private String phone12;
	@Column(name = "hospitalPreference")
	private String hospitalPreference;
	@Column(name = "reasons")
	private String reasons;
	@Column(name = "residentsAwareOfPrimary")
	private String residentsAwareOfPrimary;
	@Column(name = "codeStatus")
	private String codeStatus;
	@Column(name = "admitingDiagnosis")
	private String admitingDiagnosis;
	@Column(name = "prognosis")
	private String prognosis;
	@Column(name = "rehabPotential")
	private String rehabPotential;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "phone8")
	private String phone8;
	@Column(name = "pharmacy")
	private String pharmacy;
	@Column(name = "phone7")
	private String phone7;
	@Column(name = "zip7")
	private String zip7;
	@Column(name = "state7")
	private String state7;
	@Column(name = "city7")
	private String city7;
	@Column(name = "address7")
	private String address7;
	@Column(name = "dentist")
	private String dentist;
	@Column(name = "phone6")
	private String phone6;
	@Column(name = "zip6")
	private String zip6;
	@Column(name = "state6")
	private String state6;
	@Column(name = "city6")
	private String city6;
	@Column(name = "address6")
	private String address6;
	@Column(name = "alternatePhysician")
	private String alternatePhysician;
	@Column(name = "phone5")
	private String phone5;
	@Column(name = "zip5")
	private String zip5;
	@Column(name = "state5")
	private String state5;
	@Column(name = "city5")
	private String city5;
	@Column(name = "address5")
	private String address5;
	@Column(name = "physician")
	private String physician;
	@Column(name = "phoneH4")
	private String phoneH4;
	@Column(name = "phoneW4")
	private String phoneW4;
	@Column(name = "zip4")
	private String zip4;
	@Column(name = "state4")
	private String state4;
	@Column(name = "city4")
	private String city4;
	@Column(name = "address4")
	private String address4;
	@Column(name = "emergencyContact2")
	private String emergencyContact2;
	@Column(name = "phoneH3")
	private String phoneH3;
	@Column(name = "phoneW3")
	private String phoneW3;
	@Column(name = "zip3")
	private String zip3;
	@Column(name = "state3")
	private String state3;
	@Column(name = "city3")
	private String city3;
	@Column(name = "address3")
	private String address3;
	@Column(name = "emergencyContact1")
	private String emergencyContact1;
	@Column(name = "phoneH2")
	private String phoneH2;
	@Column(name = "phoneW2")
	private String phoneW2;
	@Column(name = "zip2")
	private String zip2;
	@Column(name = "state2")
	private String state2;
	@Column(name = "city2")
	private String city2;
	@Column(name = "address2")
	private String address2;
	@Column(name = "responsibleParty")
	private String responsibleParty;
	@Column(name = "phoneH1")
	private String phoneH1;
	@Column(name = "phoneW1")
	private String phoneW1;
	@Column(name = "zip1")
	private String zip1;
	@Column(name = "state1")
	private String state1;
	@Column(name = "placeOfBirth")
	private String placeOfBirth;
	@Column(name = "discharge")
	private String discharge;
	@Column(name = "raceNationality")
	private String raceNationality;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "stationRoombed")
	private String stationRoombed;
	@Column(name = "medRecNo")
	private String medRecNo;
	@Column(name = "originalAdmitDate")
	private Date originalAdmitDate;
	@Column(name = "currentAdmitDate")
	private Date currentAdmitDate;
	@Column(name = "nickName")
	private String nickName;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "age")
	private String age;
	@Column(name = "ssn")
	private String ssn;
	@Column(name = "payType")
	private String payType;
	@Column(name = "levelOfCare")
	private String levelOfCare;
	@Column(name = "citizen")
	private String citizen;
	@Column(name = "religion")
	private String religion;
	@Column(name = "medicaidNo")
	private String medicaidNo;
	@Column(name = "country")
	private String country;
	@Column(name = "medicareNo")
	private String medicareNo;
	@Column(name = "bcBs")
	private String bcBs;
	@Column(name = "vs")
	private String vs;
	@Column(name = "ins1")
	private String ins1;
	@Column(name = "spouse")
	private String spouse;
	@Column(name = "address1")
	private String address1;
	@Column(name = "city1")
	private String city1;
	@Column(name = "ins2")
	private String ins2;
	@Column(name = "withApproval")
	boolean withApproval;
	@Column(name = "ownHome")
	boolean ownHome;
	@Column(name = "againstApproval")
	boolean againstApproval;
	@Column(name = "friendRelatives")
	boolean friendRelatives;
	@Column(name = "transffered")
	boolean transffered;
	@Column(name = "hospitalFacility")
	boolean hospitalFacility;
	@Column(name = "died")
	boolean died;
	@Column(name = "date")
	Date date;
	@Column(name = "tOriginalAdmitDate2")
	Date tOriginalAdmitDate2;
	@Column(name = "currentAdmitDate2")
	Date currentAdmitDate2;
	@Column(name = "dateOfStay")
	Date dateOfStay;

	public String getAdmittedForm() {
		return this.admittedForm;
	}

	public void setAdmittedForm(String admittedForm) {
		this.admittedForm = admittedForm;
	}

	public String getHowTransferred() {
		return this.howTransferred;
	}

	public void setHowTransferred(String howTransferred) {
		this.howTransferred = howTransferred;
	}

	public String getPhone10() {
		return this.phone10;
	}

	public void setPhone10(String phone10) {
		this.phone10 = phone10;
	}

	public String getPhone9() {
		return this.phone9;
	}

	public void setPhone9(String phone9) {
		this.phone9 = phone9;
	}

	public String getFuneralHome() {
		return this.funeralHome;
	}

	public void setFuneralHome(String funeralHome) {
		this.funeralHome = funeralHome;
	}

	public String getDischarge2() {
		return this.discharge2;
	}

	public void setDischarge2(String discharge2) {
		this.discharge2 = discharge2;
	}

	public String getAdmissionNo() {
		return this.admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getStationRoom() {
		return this.stationRoom;
	}

	public void setStationRoom(String stationRoom) {
		this.stationRoom = stationRoom;
	}

	public String getResidentName2() {
		return this.residentName2;
	}

	public void setResidentName2(String residentName2) {
		this.residentName2 = residentName2;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getbReviewedBy() {
		return this.bReviewedBy;
	}

	public void setbReviewedBy(String bReviewedBy) {
		this.bReviewedBy = bReviewedBy;
	}

	public String getNoOfStayed() {
		return this.noOfStayed;
	}

	public void setNoOfStayed(String noOfStayed) {
		this.noOfStayed = noOfStayed;
	}

	public String getDateAndTime() {
		return this.dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getOnSet2() {
		return this.onSet2;
	}

	public void setOnSet2(String onSet2) {
		this.onSet2 = onSet2;
	}

	public String getOnSet1() {
		return this.onSet1;
	}

	public void setOnSet1(String onSet1) {
		this.onSet1 = onSet1;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCityStateZip() {
		return this.cityStateZip;
	}

	public void setCityStateZip(String cityStateZip) {
		this.cityStateZip = cityStateZip;
	}

	public String getPreviousAddress() {
		return this.previousAddress;
	}

	public void setPreviousAddress(String previousAddress) {
		this.previousAddress = previousAddress;
	}

	public String getNursingAlert() {
		return this.nursingAlert;
	}

	public void setNursingAlert(String nursingAlert) {
		this.nursingAlert = nursingAlert;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPreviousOccupation() {
		return this.previousOccupation;
	}

	public void setPreviousOccupation(String previousOccupation) {
		this.previousOccupation = previousOccupation;
	}

	public String getPrimaryLanguage() {
		return this.primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getEducationLevel() {
		return this.educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getPhone14() {
		return this.phone14;
	}

	public void setPhone14(String phone14) {
		this.phone14 = phone14;
	}

	public String getPowerOfAttorney() {
		return this.powerOfAttorney;
	}

	public void setPowerOfAttorney(String powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public String getPhone16() {
		return this.phone16;
	}

	public void setPhone16(String phone16) {
		this.phone16 = phone16;
	}

	public String getClergy() {
		return this.clergy;
	}

	public void setClergy(String clergy) {
		this.clergy = clergy;
	}

	public String getPhone13() {
		return this.phone13;
	}

	public void setPhone13(String phone13) {
		this.phone13 = phone13;
	}

	public String getNameOfChurch() {
		return this.nameOfChurch;
	}

	public void setNameOfChurch(String nameOfChurch) {
		this.nameOfChurch = nameOfChurch;
	}

	public String getPhone15() {
		return this.phone15;
	}

	public void setPhone15(String phone15) {
		this.phone15 = phone15;
	}

	public String getAmbulancePreference() {
		return this.ambulancePreference;
	}

	public void setAmbulancePreference(String ambulancePreference) {
		this.ambulancePreference = ambulancePreference;
	}

	public String getPhone12() {
		return this.phone12;
	}

	public void setPhone12(String phone12) {
		this.phone12 = phone12;
	}

	public String getHospitalPreference() {
		return this.hospitalPreference;
	}

	public void setHospitalPreference(String hospitalPreference) {
		this.hospitalPreference = hospitalPreference;
	}

	public String getReasons() {
		return this.reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public String getResidentsAwareOfPrimary() {
		return this.residentsAwareOfPrimary;
	}

	public void setResidentsAwareOfPrimary(String residentsAwareOfPrimary) {
		this.residentsAwareOfPrimary = residentsAwareOfPrimary;
	}

	public String getCodeStatus() {
		return this.codeStatus;
	}

	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getAdmitingDiagnosis() {
		return this.admitingDiagnosis;
	}

	public void setAdmitingDiagnosis(String admitingDiagnosis) {
		this.admitingDiagnosis = admitingDiagnosis;
	}

	public String getPrognosis() {
		return this.prognosis;
	}

	public void setPrognosis(String prognosis) {
		this.prognosis = prognosis;
	}

	public String getRehabPotential() {
		return this.rehabPotential;
	}

	public void setRehabPotential(String rehabPotential) {
		this.rehabPotential = rehabPotential;
	}

	public String getAllergies() {
		return this.allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getPhone8() {
		return this.phone8;
	}

	public void setPhone8(String phone8) {
		this.phone8 = phone8;
	}

	public String getPharmacy() {
		return this.pharmacy;
	}

	public void setPharmacy(String pharmacy) {
		this.pharmacy = pharmacy;
	}

	public String getPhone7() {
		return this.phone7;
	}

	public void setPhone7(String phone7) {
		this.phone7 = phone7;
	}

	public String getZip7() {
		return this.zip7;
	}

	public void setZip7(String zip7) {
		this.zip7 = zip7;
	}

	public String getState7() {
		return this.state7;
	}

	public void setState7(String state7) {
		this.state7 = state7;
	}

	public String getCity7() {
		return this.city7;
	}

	public void setCity7(String city7) {
		this.city7 = city7;
	}

	public String getAddress7() {
		return this.address7;
	}

	public void setAddress7(String address7) {
		this.address7 = address7;
	}

	public String getDentist() {
		return this.dentist;
	}

	public void setDentist(String dentist) {
		this.dentist = dentist;
	}

	public String getPhone6() {
		return this.phone6;
	}

	public void setPhone6(String phone6) {
		this.phone6 = phone6;
	}

	public String getZip6() {
		return this.zip6;
	}

	public void setZip6(String zip6) {
		this.zip6 = zip6;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getState6() {
		return this.state6;
	}

	public void setState6(String state6) {
		this.state6 = state6;
	}

	public String getCity6() {
		return this.city6;
	}

	public void setCity6(String city6) {
		this.city6 = city6;
	}

	public String getAddress6() {
		return this.address6;
	}

	public void setAddress6(String address6) {
		this.address6 = address6;
	}

	public String getAlternatePhysician() {
		return this.alternatePhysician;
	}

	public void setAlternatePhysician(String alternatePhysician) {
		this.alternatePhysician = alternatePhysician;
	}

	public String getPhone5() {
		return this.phone5;
	}

	public void setPhone5(String phone5) {
		this.phone5 = phone5;
	}

	public String getZip5() {
		return this.zip5;
	}

	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}

	public String getState5() {
		return this.state5;
	}

	public void setState5(String state5) {
		this.state5 = state5;
	}

	public String getCity5() {
		return this.city5;
	}

	public void setCity5(String city5) {
		this.city5 = city5;
	}

	public String getAddress5() {
		return this.address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public String getPhysician() {
		return this.physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getPhoneH4() {
		return this.phoneH4;
	}

	public void setPhoneH4(String phoneH4) {
		this.phoneH4 = phoneH4;
	}

	public String getPhoneW4() {
		return this.phoneW4;
	}

	public void setPhoneW4(String phoneW4) {
		this.phoneW4 = phoneW4;
	}

	public String getZip4() {
		return this.zip4;
	}

	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}

	public String getState4() {
		return this.state4;
	}

	public void setState4(String state4) {
		this.state4 = state4;
	}

	public String getCity4() {
		return this.city4;
	}

	public void setCity4(String city4) {
		this.city4 = city4;
	}

	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getEmergencyContact2() {
		return this.emergencyContact2;
	}

	public void setEmergencyContact2(String emergencyContact2) {
		this.emergencyContact2 = emergencyContact2;
	}

	public String getPhoneH3() {
		return this.phoneH3;
	}

	public void setPhoneH3(String phoneH3) {
		this.phoneH3 = phoneH3;
	}

	public String getPhoneW3() {
		return this.phoneW3;
	}

	public void setPhoneW3(String phoneW3) {
		this.phoneW3 = phoneW3;
	}

	public String getZip3() {
		return this.zip3;
	}

	public void setZip3(String zip3) {
		this.zip3 = zip3;
	}

	public String getState3() {
		return this.state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	public String getCity3() {
		return this.city3;
	}

	public void setCity3(String city3) {
		this.city3 = city3;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getEmergencyContact1() {
		return this.emergencyContact1;
	}

	public void setEmergencyContact1(String emergencyContact1) {
		this.emergencyContact1 = emergencyContact1;
	}

	public String getPhoneH2() {
		return this.phoneH2;
	}

	public void setPhoneH2(String phoneH2) {
		this.phoneH2 = phoneH2;
	}

	public String getPhoneW2() {
		return this.phoneW2;
	}

	public void setPhoneW2(String phoneW2) {
		this.phoneW2 = phoneW2;
	}

	public String getZip2() {
		return this.zip2;
	}

	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}

	public String getState2() {
		return this.state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getCity2() {
		return this.city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getResponsibleParty() {
		return this.responsibleParty;
	}

	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	public String getPhoneH1() {
		return this.phoneH1;
	}

	public void setPhoneH1(String phoneH1) {
		this.phoneH1 = phoneH1;
	}

	public String getPhoneW1() {
		return this.phoneW1;
	}

	public void setPhoneW1(String phoneW1) {
		this.phoneW1 = phoneW1;
	}

	public String getZip1() {
		return this.zip1;
	}

	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}

	public String getState1() {
		return this.state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getPlaceOfBirth() {
		return this.placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getDischarge() {
		return this.discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}

	public String getRaceNationality() {
		return this.raceNationality;
	}

	public void setRaceNationality(String raceNationality) {
		this.raceNationality = raceNationality;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getStationRoombed() {
		return this.stationRoombed;
	}

	public void setStationRoombed(String stationRoombed) {
		this.stationRoombed = stationRoombed;
	}

	public String getMedRecNo() {
		return this.medRecNo;
	}

	public void setMedRecNo(String medRecNo) {
		this.medRecNo = medRecNo;
	}

	public Date getOriginalAdmitDate() {
		return this.originalAdmitDate;
	}

	public void setOriginalAdmitDate(Date originalAdmitDate) {
		this.originalAdmitDate = originalAdmitDate;
	}

	public Date getCurrentAdmitDate() {
		return this.currentAdmitDate;
	}

	public void setCurrentAdmitDate(Date currentAdmitDate) {
		this.currentAdmitDate = currentAdmitDate;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getLevelOfCare() {
		return this.levelOfCare;
	}

	public void setLevelOfCare(String levelOfCare) {
		this.levelOfCare = levelOfCare;
	}

	public String getCitizen() {
		return this.citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMedicaidNo() {
		return this.medicaidNo;
	}

	public void setMedicaidNo(String medicaidNo) {
		this.medicaidNo = medicaidNo;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMedicareNo() {
		return this.medicareNo;
	}

	public void setMedicareNo(String medicareNo) {
		this.medicareNo = medicareNo;
	}

	public String getBcBs() {
		return this.bcBs;
	}

	public void setBcBs(String bcBs) {
		this.bcBs = bcBs;
	}

	public String getVs() {
		return this.vs;
	}

	public void setVs(String vs) {
		this.vs = vs;
	}

	public String getIns1() {
		return this.ins1;
	}

	public void setIns1(String ins1) {
		this.ins1 = ins1;
	}

	public String getSpouse() {
		return this.spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity1() {
		return this.city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getIns2() {
		return this.ins2;
	}

	public void setIns2(String ins2) {
		this.ins2 = ins2;
	}

	public boolean isWithApproval() {
		return this.withApproval;
	}

	public void setWithApproval(boolean withApproval) {
		this.withApproval = withApproval;
	}

	public boolean isOwnHome() {
		return this.ownHome;
	}

	public void setOwnHome(boolean ownHome) {
		this.ownHome = ownHome;
	}

	public boolean isAgainstApproval() {
		return this.againstApproval;
	}

	public void setAgainstApproval(boolean againstApproval) {
		this.againstApproval = againstApproval;
	}

	public boolean isFriendRelatives() {
		return this.friendRelatives;
	}

	public void setFriendRelatives(boolean friendRelatives) {
		this.friendRelatives = friendRelatives;
	}

	public boolean isTransffered() {
		return this.transffered;
	}

	public void setTransffered(boolean transffered) {
		this.transffered = transffered;
	}

	public boolean isHospitalFacility() {
		return this.hospitalFacility;
	}

	public void setHospitalFacility(boolean hospitalFacility) {
		this.hospitalFacility = hospitalFacility;
	}

	public boolean isDied() {
		return this.died;
	}

	public void setDied(boolean died) {
		this.died = died;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date gettOriginalAdmitDate2() {
		return this.tOriginalAdmitDate2;
	}

	public void settOriginalAdmitDate2(Date tOriginalAdmitDate2) {
		this.tOriginalAdmitDate2 = tOriginalAdmitDate2;
	}

	public Date getCurrentAdmitDate2() {
		return this.currentAdmitDate2;
	}

	public void setCurrentAdmitDate2(Date currentAdmitDate2) {
		this.currentAdmitDate2 = currentAdmitDate2;
	}

	public Date getDateOfStay() {
		return this.dateOfStay;
	}

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public String getBReviewedBy() {
		return bReviewedBy;
	}

	public void setBReviewedBy(String reviewedBy) {
		bReviewedBy = reviewedBy;
	}

	public Date getTOriginalAdmitDate2() {
		return tOriginalAdmitDate2;
	}

	public void setTOriginalAdmitDate2(Date originalAdmitDate2) {
		tOriginalAdmitDate2 = originalAdmitDate2;
	}

	public void setDateOfStay(Date dateOfStay) {
		this.dateOfStay = dateOfStay;
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

	public int getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}

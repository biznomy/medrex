package medrex.commons.vo.admission;

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

@Entity
@Table(name = "SocialServiceInitialAssessmentFormPage1")
public class SocialServiceInitialAssessmentFormPage1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4644386008804960568L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesId")
	private Notes notes;

	@Column(name = "maritalStatus")
	private int buttonGroup;

	@Column(name = "socialHistory")
	private String socialHistory;

	@Column(name = "facility")
	private String facility;

	@Column(name = "resident")
	private String resident;

	@Column(name = "pNAManagement")
	private String pNAManagement;

	@Column(name = "occupation")
	private String occupation;

	@Column(name = "education")
	private String education;

	@Column(name = "briefFamilyHistory")
	private String briefFamilyHistory;

	@Column(name = "siblings")
	private String siblings;

	@Column(name = "placeofBirth")
	private String placeofBirth;

	@Column(name = "sex")
	private String sex;

	@Column(name = "dOB")
	private Date dOB;

	@Column(name = "religion")
	private String religion;
	// ------change
	@Column(name = "hospice")
	private Boolean hospice;

	@Column(name = "permanentPlacement")
	private Boolean permanentPlacement;

	@Column(name = "shortTermStay")
	private Boolean shortTermStay;

	@Column(name = "dischargeOthers")
	private Boolean dischargeOthers;

	// ---change

	// @Column(name = "dischargePlan")
	// String dischargePlan;

	@Column(name = "admittedFrom")
	private String admittedFrom;

	@Column(name = "primaryDiagnosis")
	private String primaryDiagnosis;

	@Column(name = "physician")
	private String physician;

	@Column(name = "patientIdentificationNumber")
	private String patientIdentificationNumber;

	@Column(name = "dateofAdmission")
	private Date dateofAdmission;

	@Column(name = "residentName")
	private String residentName;

	// ----changed
	@Column(name = "spouse")
	private Boolean spouse;

	@Column(name = "children")
	private Boolean children;

	@Column(name = "friends")
	private Boolean friends;

	@Column(name = "familyOthers")
	private Boolean familyOthers;

	// @Column(name = "family")
	// String family;

	// ----changed

	@Column(name = "advancedDirectives")
	private String advancedDirectives;

	@Column(name = "religionNotes")
	private String religionNotes;

	public String getReligionNotes() {
		return religionNotes;
	}

	public void setReligionNotes(String religionNotes) {
		this.religionNotes = religionNotes;
	}

	public Boolean isHospice() {
		return hospice;
	}

	public void setHospice(Boolean hospice) {
		this.hospice = hospice;
	}

	public Boolean isPermanentPlacement() {
		return permanentPlacement;
	}

	public void setPermanentPlacement(Boolean permanentPlacement) {
		this.permanentPlacement = permanentPlacement;
	}

	public Boolean isShortTermStay() {
		return shortTermStay;
	}

	public void setShortTermStay(Boolean shortTermStay) {
		this.shortTermStay = shortTermStay;
	}

	public Boolean isDischargeOthers() {
		return dischargeOthers;
	}

	public void setDischargeOthers(Boolean dischargeOthers) {
		this.dischargeOthers = dischargeOthers;
	}

	public Boolean isSpouse() {
		return spouse;
	}

	public void setSpouse(Boolean spouse) {
		this.spouse = spouse;
	}

	public Boolean isChildren() {
		return children;
	}

	public void setChildren(Boolean children) {
		this.children = children;
	}

	public Boolean isFriends() {
		return friends;
	}

	public void setFriends(Boolean friends) {
		this.friends = friends;
	}

	public Boolean isFamilyOthers() {
		return familyOthers;
	}

	public void setFamilyOthers(Boolean familyOthers) {
		this.familyOthers = familyOthers;
	}

	public int getButtonGroup() {
		return buttonGroup;
	}

	public void setButtonGroup(int buttonGroup) {
		this.buttonGroup = buttonGroup;
	}

	public String getSocialHistory() {
		return this.socialHistory;
	}

	public void setSocialHistory(String socialHistory) {
		this.socialHistory = socialHistory;
	}

	public String getFacility() {
		return this.facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getResident() {
		return this.resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getPNAManagement() {
		return this.pNAManagement;
	}

	public void setPNAManagement(String pNAManagement) {
		this.pNAManagement = pNAManagement;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getBriefFamilyHistory() {
		return this.briefFamilyHistory;
	}

	public void setBriefFamilyHistory(String briefFamilyHistory) {
		this.briefFamilyHistory = briefFamilyHistory;
	}

	public String getSiblings() {
		return this.siblings;
	}

	public void setSiblings(String siblings) {
		this.siblings = siblings;
	}

	public String getPlaceofBirth() {
		return this.placeofBirth;
	}

	public void setPlaceofBirth(String placeofBirth) {
		this.placeofBirth = placeofBirth;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDOB() {
		return dOB;
	}

	public void setDOB(Date dob) {
		dOB = dob;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAdmittedFrom() {
		return admittedFrom;
	}

	public void setAdmittedFrom(String admittedFrom) {
		this.admittedFrom = admittedFrom;
	}

	public String getPrimaryDiagnosis() {
		return this.primaryDiagnosis;
	}

	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		this.primaryDiagnosis = primaryDiagnosis;
	}

	public String getPhysician() {
		return this.physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getPatientIdentificationNumber() {
		return this.patientIdentificationNumber;
	}

	public void setPatientIdentificationNumber(
			String patientIdentificationNumber) {
		this.patientIdentificationNumber = patientIdentificationNumber;
	}

	public Date getDateofAdmission() {
		return dateofAdmission;
	}

	public void setDateofAdmission(Date dateofAdmission) {
		this.dateofAdmission = dateofAdmission;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getAdvancedDirectives() {
		return this.advancedDirectives;
	}

	public void setAdvancedDirectives(String advancedDirectives) {
		this.advancedDirectives = advancedDirectives;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}
}

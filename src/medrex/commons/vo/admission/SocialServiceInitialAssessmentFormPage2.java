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
@Table(name = "SocialServiceInitialAssessmentFormPage2")
public class SocialServiceInitialAssessmentFormPage2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 456156564675918843L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesInterest")
	private Notes notesInterest;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesPsycoSocialNeeds")
	private Notes notesPsycoSocialNeeds;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesFamilyCounseling")
	private Notes notesFamilyCounseling;

	@Column(name = "FormId")
	private int formId;

	@Column(name = "dateOfAssessment")
	private Date dateOfAssessment;

	@Column(name = "socialWorker")
	private String socialWorker;

	@Column(name = "familyCounseling")
	private String familyCounseling;

	@Column(name = "psycoSocialNeeds")
	private String psycoSocialNeeds;

	@Column(name = "interest")
	private String interest;

	@Column(name = "listOfAssistiveDevices")
	private String listOfAssistiveDevices;

	@Column(name = "physicalLimitations")
	private String physicalLimitations;

	@Column(name = "languagesSpoken")
	private String languagesSpoken;

	@Column(name = "others")
	private String others;

	@Column(name = "person")
	private String person;

	@Column(name = "place")
	private String place;

	@Column(name = "timeOfAssessment")
	private String timeOfAssessment;

	@Column(name = "mentalStatus")
	private String mentalStatus;

	@Column(name = "hearingCapacity")
	private String hearingCapacity;

	@Column(name = "visualCapacity")
	private String visualCapacity;

	@Column(name = "nonVerbal")
	private String nonVerbal;

	@Column(name = "verbal")
	private String verbal;

	@Column(name = "Mobility")
	private int buttonGroupMobility;

	@Column(name = "MentalState")
	private int buttonGroupMentalStatus;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Date getDateOfAssessment() {
		return dateOfAssessment;
	}

	public void setDateOfAssessment(Date dateOfAssessment) {
		this.dateOfAssessment = dateOfAssessment;
	}

	public String getSocialWorker() {
		return this.socialWorker;
	}

	public void setSocialWorker(String socialWorker) {
		this.socialWorker = socialWorker;
	}

	public String getFamilyCounseling() {
		return this.familyCounseling;
	}

	public void setFamilyCounseling(String familyCounseling) {
		this.familyCounseling = familyCounseling;
	}

	public String getPsycoSocialNeeds() {
		return this.psycoSocialNeeds;
	}

	public void setPsycoSocialNeeds(String psycoSocialNeeds) {
		this.psycoSocialNeeds = psycoSocialNeeds;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getListOfAssistiveDevices() {
		return this.listOfAssistiveDevices;
	}

	public void setListOfAssistiveDevices(String listOfAssistiveDevices) {
		this.listOfAssistiveDevices = listOfAssistiveDevices;
	}

	public String getPhysicalLimitations() {
		return this.physicalLimitations;
	}

	public void setPhysicalLimitations(String physicalLimitations) {
		this.physicalLimitations = physicalLimitations;
	}

	public String getLanguagesSpoken() {
		return this.languagesSpoken;
	}

	public void setLanguagesSpoken(String languagesSpoken) {
		this.languagesSpoken = languagesSpoken;
	}

	public String getOthers() {
		return this.others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTimeOfAssessment() {
		return timeOfAssessment;
	}

	public void setTimeOfAssessment(String timeOfAssessment) {
		this.timeOfAssessment = timeOfAssessment;
	}

	public String getMentalStatus() {
		return this.mentalStatus;
	}

	public void setMentalStatus(String mentalStatus) {
		this.mentalStatus = mentalStatus;
	}

	public String getHearingCapacity() {
		return this.hearingCapacity;
	}

	public void setHearingCapacity(String hearingCapacity) {
		this.hearingCapacity = hearingCapacity;
	}

	public String getVisualCapacity() {
		return this.visualCapacity;
	}

	public void setVisualCapacity(String visualCapacity) {
		this.visualCapacity = visualCapacity;
	}

	public String getNonVerbal() {
		return this.nonVerbal;
	}

	public void setNonVerbal(String nonVerbal) {
		this.nonVerbal = nonVerbal;
	}

	public String getVerbal() {
		return this.verbal;
	}

	public void setVerbal(String verbal) {
		this.verbal = verbal;
	}

	public int getButtonGroupMobility() {
		return buttonGroupMobility;
	}

	public void setButtonGroupMobility(int buttonGroupMobility) {
		this.buttonGroupMobility = buttonGroupMobility;
	}

	public int getButtonGroupMentalStatus() {
		return buttonGroupMentalStatus;
	}

	public void setButtonGroupMentalStatus(int buttonGroupMentalStatus) {
		this.buttonGroupMentalStatus = buttonGroupMentalStatus;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Notes getNotesInterest() {
		return notesInterest;
	}

	public void setNotesInterest(Notes notesInterest) {
		this.notesInterest = notesInterest;
	}

	public Notes getNotesPsycoSocialNeeds() {
		return notesPsycoSocialNeeds;
	}

	public void setNotesPsycoSocialNeeds(Notes notesPsycoSocialNeeds) {
		this.notesPsycoSocialNeeds = notesPsycoSocialNeeds;
	}

	public Notes getNotesFamilyCounseling() {
		return notesFamilyCounseling;
	}

	public void setNotesFamilyCounseling(Notes notesFamilyCounseling) {
		this.notesFamilyCounseling = notesFamilyCounseling;
	}

}

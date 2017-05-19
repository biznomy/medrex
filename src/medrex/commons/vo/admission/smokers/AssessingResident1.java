package medrex.commons.vo.admission.smokers;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AssessingResident1")
public class AssessingResident1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8785872646831740903L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "assistanceSmoking")
	private int assistanceSmoking;
	@Column(name = "dateOfIndependently")
	private Date dateOfIndependently;
	@Column(name = "birthDate")
	private Date birthDate;
	@Column(name = "smoke")
	private int smoke;
	@Column(name = "nameOfResident")
	private String nameOfResident;
	@Column(name = "TimeOfAssessing")
	private String TimeOfAssessing;
	@Column(name = "room")
	private String room;
	@Column(name = "observation")
	private boolean observation;
	@Column(name = "family")
	private boolean family;
	@Column(name = "review")
	private boolean review;
	@Column(name = "discussion")
	private boolean discussion;
	@Column(name = "nursing")
	private boolean nursing;
	@Column(name = "attendingPhysician")
	private boolean attendingPhysician;
	@Column(name = "sourceOfInformation")
	private String sourceOfInformation;
	@Column(name = "notifyYes")
	private boolean notifyYes;
	@Column(name = "notifyNo")
	private boolean notifyNo;
	@Column(name = "manyCigarettes")
	private String manyCigarettes;
	@Column(name = "firstCigarette")
	private String firstCigarette;
	@Column(name = "ExplainInShort")
	private String ExplainInShort;
	@Column(name = "YesnotifyAttendingPhysician")
	private int YesnotifyAttendingPhysician;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getAssistanceSmoking() {
		return assistanceSmoking;
	}

	public Date getDateOfIndependently() {
		return dateOfIndependently;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public int getSmoke() {
		return smoke;
	}

	public String getNameOfResident() {
		return nameOfResident;
	}

	/*
	 * public String getTime() { return time; }
	 */
	public String getRoom() {
		return room;
	}

	public boolean isObservation() {
		return observation;
	}

	public boolean isFamily() {
		return family;
	}

	public boolean isReview() {
		return review;
	}

	public boolean isDiscussion() {
		return discussion;
	}

	public boolean isNursing() {
		return nursing;
	}

	public boolean isAttendingPhysician() {
		return attendingPhysician;
	}

	public String getSourceOfInformation() {
		return sourceOfInformation;
	}

	public boolean isNotifyYes() {
		return notifyYes;
	}

	public boolean isNotifyNo() {
		return notifyNo;
	}

	public String getManyCigarettes() {
		return manyCigarettes;
	}

	public String getFirstCigarette() {
		return firstCigarette;
	}

	/*
	 * public String getExplain() { return explain; }
	 */
	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setAssistanceSmoking(int assistanceSmoking) {
		this.assistanceSmoking = assistanceSmoking;
	}

	public void setDateOfIndependently(Date dateOfIndependently) {
		this.dateOfIndependently = dateOfIndependently;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setSmoke(int smoke) {
		this.smoke = smoke;
	}

	public void setNameOfResident(String nameOfResident) {
		this.nameOfResident = nameOfResident;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public void setObservation(boolean observation) {
		this.observation = observation;
	}

	public void setFamily(boolean family) {
		this.family = family;
	}

	public void setReview(boolean review) {
		this.review = review;
	}

	public void setDiscussion(boolean discussion) {
		this.discussion = discussion;
	}

	public void setNursing(boolean nursing) {
		this.nursing = nursing;
	}

	public void setAttendingPhysician(boolean attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}

	public void setSourceOfInformation(String sourceOfInformation) {
		this.sourceOfInformation = sourceOfInformation;
	}

	public void setNotifyYes(boolean notifyYes) {
		this.notifyYes = notifyYes;
	}

	public void setNotifyNo(boolean notifyNo) {
		this.notifyNo = notifyNo;
	}

	public void setManyCigarettes(String manyCigarettes) {
		this.manyCigarettes = manyCigarettes;
	}

	public void setFirstCigarette(String firstCigarette) {
		this.firstCigarette = firstCigarette;
	}

	public String getTimeOfAssessing() {
		return TimeOfAssessing;
	}

	public String getExplainInShort() {
		return ExplainInShort;
	}

	public void setTimeOfAssessing(String timeOfAssessing) {
		TimeOfAssessing = timeOfAssessing;
	}

	public void setExplainInShort(String explainInShort) {
		ExplainInShort = explainInShort;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getYesnotifyAttendingPhysician() {
		return YesnotifyAttendingPhysician;
	}

	public void setYesnotifyAttendingPhysician(int yesnotifyAttendingPhysician) {
		YesnotifyAttendingPhysician = yesnotifyAttendingPhysician;
	}

}

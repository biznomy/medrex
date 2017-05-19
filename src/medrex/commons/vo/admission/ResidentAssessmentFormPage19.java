package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage19")
public class ResidentAssessmentFormPage19 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6387009729224079276L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	// new Form coding without parent child relation

	private int residentId;

	private int speech;
	private int alert;
	private int eyesOpen;
	private String rTLowerExtrimity;
	private String rTUpperExtrimity;
	private String lTLowerExtrimity;
	private String lTUpperExtrimity;
	private String lPupil;
	private String rPupil;
	private String shallowIrregular;
	private String normal;
	private String respiration;
	private String pulse;
	private String temprature;
	private String bloodPressure;
	private String time;
	private Date assessmentDate;
	private String roomNum;
	private String residentName;
	private String roomBed;
	private String recordNo;
	private String attendingPhysician;
	private String middleName;
	private String firstName;
	private String lastName;
	private boolean nAvailable;

	// --------------------------------
	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formSerial) {
		this.formId = formSerial;
	}

	// -----------------------------------
	/* TODO: remove page 19 columns table after acceptance */

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSpeech() {
		return speech;
	}

	public void setSpeech(int speech) {
		this.speech = speech;
	}

	public int getAlert() {
		return alert;
	}

	public void setAlert(int alert) {
		this.alert = alert;
	}

	public int getEyesOpen() {
		return eyesOpen;
	}

	public void setEyesOpen(int eyesOpen) {
		this.eyesOpen = eyesOpen;
	}

	public String getRTLowerExtrimity() {
		return rTLowerExtrimity;
	}

	public void setRTLowerExtrimity(String lowerExtrimity) {
		rTLowerExtrimity = lowerExtrimity;
	}

	public String getRTUpperExtrimity() {
		return rTUpperExtrimity;
	}

	public void setRTUpperExtrimity(String upperExtrimity) {
		rTUpperExtrimity = upperExtrimity;
	}

	public String getLTLowerExtrimity() {
		return lTLowerExtrimity;
	}

	public void setLTLowerExtrimity(String lowerExtrimity) {
		lTLowerExtrimity = lowerExtrimity;
	}

	public String getLTUpperExtrimity() {
		return lTUpperExtrimity;
	}

	public void setLTUpperExtrimity(String upperExtrimity) {
		lTUpperExtrimity = upperExtrimity;
	}

	public String getLPupil() {
		return lPupil;
	}

	public void setLPupil(String pupil) {
		lPupil = pupil;
	}

	public String getRPupil() {
		return rPupil;
	}

	public void setRPupil(String pupil) {
		rPupil = pupil;
	}

	public String getShallowIrregular() {
		return shallowIrregular;
	}

	public void setShallowIrregular(String shallowIrregular) {
		this.shallowIrregular = shallowIrregular;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public String getRespiration() {
		return respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
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

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoomBed() {
		return roomBed;
	}

	public void setRoomBed(String roomBed) {
		this.roomBed = roomBed;
	}

	public String getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}

	public String getAttendingPhysician() {
		return attendingPhysician;
	}

	public void setAttendingPhysician(String attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isNAvailable() {
		return nAvailable;
	}

	public void setNAvailable(boolean available) {
		nAvailable = available;
	}

}

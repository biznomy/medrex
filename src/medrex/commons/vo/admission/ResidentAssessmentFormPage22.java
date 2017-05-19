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
@Table(name = "ResidentAssessmentFormPage22")
public class ResidentAssessmentFormPage22 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5560535187510751649L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	@Column(name = "eatingType")
	private int eatingType;

	@Column(name = "eatingReason")
	private String eatingReason;

	@Column(name = "eatingAdaptive")
	private String eatingAdaptive;

	@Column(name = "date")
	private Date date;

	@Column(name = "room")
	private String room;

	@Column(name = "physician")
	private String physician;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "diet")
	private String diet;

	@Column(name = "diagnosis")
	private String diagnosis;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "labData")
	private Notes labData;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "preference")
	private Notes preference;

	@Column(name = "appetite")
	private int appetite;

	@Column(name = "fluidIntake")
	private String fluidIntake;

	@Column(name = "foodAlergy")
	private String foodAlergy;

	@Column(name = "openAreas")
	private String openAreas;

	@Column(name = "constipation")
	private String constipation;

	@Column(name = "edema")
	private String edema;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Notes getLabData() {
		return labData;
	}

	public void setLabData(Notes labData) {
		this.labData = labData;
	}

	public int getAppetite() {
		return appetite;
	}

	public Notes getPreference() {
		return preference;
	}

	public void setPreference(Notes preference) {
		this.preference = preference;
	}

	public void setAppetite(int appetite) {
		this.appetite = appetite;
	}

	public String getFluidIntake() {
		return fluidIntake;
	}

	public void setFluidIntake(String fluidIntake) {
		this.fluidIntake = fluidIntake;
	}

	public String getFoodAlergy() {
		return foodAlergy;
	}

	public void setFoodAlergy(String foodAlergy) {
		this.foodAlergy = foodAlergy;
	}

	public String getOpenAreas() {
		return openAreas;
	}

	public void setOpenAreas(String openAreas) {
		this.openAreas = openAreas;
	}

	public String getConstipation() {
		return constipation;
	}

	public void setConstipation(String constipation) {
		this.constipation = constipation;
	}

	public String getEdema() {
		return edema;
	}

	public void setEdema(String edema) {
		this.edema = edema;
	}

}

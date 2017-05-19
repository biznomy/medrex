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

import medrex.commons.vo.notes.Notes;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "DietaryAlertSheet")
public class DietaryAlertSheet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1238488343011869684L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "formId")
	private int formId;

	@Column(name = "diet")
	private boolean diet;

	@Column(name = "attendingPhysicianDate")
	private Date attendingPhysicianDate;

	@Column(name = "nursingDupervisorDate")
	private Date nursingDupervisorDate;

	@Column(name = "dietitianDate")
	private Date dietitianDate;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "actionToBeTaken")
	private Notes actionToBeTaken;

	@Column(name = "signature")
	private String signature;

	@Column(name = "nursingDupervisor")
	private boolean nursingDupervisor;

	@Column(name = "attendPhysician")
	private boolean attendPhysician;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "descriptionOfProblem")
	private Notes descriptionOfProblem;

	@Column(name = "other")
	private boolean other;

	@Column(name = "abnormalLabValues")
	private boolean abnormalLabValues;

	@Column(name = "medication")
	private boolean medication;

	@Column(name = "supplementalFeedings")
	private boolean supplementalFeedings;

	@Column(name = "tubeFeedings")
	private boolean tubeFeedings;

	@Column(name = "catheter")
	private boolean catheter;

	@Column(name = "edema")
	private boolean edema;

	@Column(name = "vomiting")
	private boolean vomiting;

	@Column(name = "diarrhea")
	private boolean diarrhea;

	@Column(name = "constipation")
	private boolean constipation;

	@Column(name = "skinBreakdown")
	private boolean skinBreakdown;

	@Column(name = "skinFragibility")
	private boolean skinFragibility;

	@Column(name = "needsAssistanceWithMeals")
	private boolean needsAssistanceWithMeals;

	@Column(name = "needsAdaptiveDevice")
	private boolean needsAdaptiveDevice;

	@Column(name = "chewingDifficulties")
	private boolean chewingDifficulties;

	@Column(name = "poorAppetite")
	private boolean poorAppetite;

	@Column(name = "fluctuatingWeight")
	private boolean fluctuatingWeight;

	@Column(name = "lossOf5lbs")
	private boolean lossOf5lbs;

	@Column(name = "gained5lbs")
	private boolean gained5lbs;

	@Column(name = "room")
	private String room;

	@Column(name = "diets")
	private String diets;

	@Column(name = "ibwRange")
	private String ibwRange;

	@Column(name = "weight")
	private String weight;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "formDate")
	private Date formDate;

	@Column(name = "form")
	private String form;

	@Column(name = "dietitian")
	private boolean dietitian;

	@Column(name = "nursingSupervisor")
	private boolean nursingSupervisor;

	@Column(name = "attendingPhysician")
	private boolean attendingPhysician;

	public boolean isDiet() {
		return diet;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}

	public Date getAttendingPhysicianDate() {
		return attendingPhysicianDate;
	}

	public void setAttendingPhysicianDate(Date attendingPhysicianDate) {
		this.attendingPhysicianDate = attendingPhysicianDate;
	}

	public Date getNursingDupervisorDate() {
		return nursingDupervisorDate;
	}

	public void setNursingDupervisorDate(Date nursingDupervisorDate) {
		this.nursingDupervisorDate = nursingDupervisorDate;
	}

	public Date getDietitianDate() {
		return dietitianDate;
	}

	public void setDietitianDate(Date dietitianDate) {
		this.dietitianDate = dietitianDate;
	}

	public String getDiets() {
		return diets;
	}

	public void setDiets(String diets) {
		this.diets = diets;
	}

	public boolean isdiet() {
		return this.diet;
	}

	public void setdiet(boolean diet) {
		this.diet = diet;
	}

	public Notes getActionToBeTaken() {
		return actionToBeTaken;
	}

	public void setActionToBeTaken(Notes actionToBeTaken) {
		this.actionToBeTaken = actionToBeTaken;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public boolean isNursingDupervisor() {
		return this.nursingDupervisor;
	}

	public void setNursingDupervisor(boolean nursingDupervisor) {
		this.nursingDupervisor = nursingDupervisor;
	}

	public boolean isAttendPhysician() {
		return this.attendPhysician;
	}

	public void setAttendPhysician(boolean attendPhysician) {
		this.attendPhysician = attendPhysician;
	}

	public Notes getDescriptionOfProblem() {
		return descriptionOfProblem;
	}

	public void setDescriptionOfProblem(Notes descriptionOfProblem) {
		this.descriptionOfProblem = descriptionOfProblem;
	}

	public boolean isOther() {
		return this.other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public boolean isAbnormalLabValues() {
		return this.abnormalLabValues;
	}

	public void setAbnormalLabValues(boolean abnormalLabValues) {
		this.abnormalLabValues = abnormalLabValues;
	}

	public boolean isMedication() {
		return this.medication;
	}

	public void setMedication(boolean medication) {
		this.medication = medication;
	}

	public boolean isSupplementalFeedings() {
		return this.supplementalFeedings;
	}

	public void setSupplementalFeedings(boolean supplementalFeedings) {
		this.supplementalFeedings = supplementalFeedings;
	}

	public boolean isTubeFeedings() {
		return this.tubeFeedings;
	}

	public void setTubeFeedings(boolean tubeFeedings) {
		this.tubeFeedings = tubeFeedings;
	}

	public boolean isCatheter() {
		return this.catheter;
	}

	public void setCatheter(boolean catheter) {
		this.catheter = catheter;
	}

	public boolean isEdema() {
		return this.edema;
	}

	public void setEdema(boolean edema) {
		this.edema = edema;
	}

	public boolean isVomiting() {
		return this.vomiting;
	}

	public void setVomiting(boolean vomiting) {
		this.vomiting = vomiting;
	}

	public boolean isDiarrhea() {
		return this.diarrhea;
	}

	public void setDiarrhea(boolean diarrhea) {
		this.diarrhea = diarrhea;
	}

	public boolean isConstipation() {
		return this.constipation;
	}

	public void setConstipation(boolean constipation) {
		this.constipation = constipation;
	}

	public boolean isSkinBreakdown() {
		return this.skinBreakdown;
	}

	public void setSkinBreakdown(boolean skinBreakdown) {
		this.skinBreakdown = skinBreakdown;
	}

	public boolean isSkinFragibility() {
		return this.skinFragibility;
	}

	public void setSkinFragibility(boolean skinFragibility) {
		this.skinFragibility = skinFragibility;
	}

	public boolean isNeedsAssistanceWithMeals() {
		return this.needsAssistanceWithMeals;
	}

	public void setNeedsAssistanceWithMeals(boolean needsAssistanceWithMeals) {
		this.needsAssistanceWithMeals = needsAssistanceWithMeals;
	}

	public boolean isNeedsAdaptiveDevice() {
		return this.needsAdaptiveDevice;
	}

	public void setNeedsAdaptiveDevice(boolean needsAdaptiveDevice) {
		this.needsAdaptiveDevice = needsAdaptiveDevice;
	}

	public boolean isChewingDifficulties() {
		return this.chewingDifficulties;
	}

	public void setChewingDifficulties(boolean chewingDifficulties) {
		this.chewingDifficulties = chewingDifficulties;
	}

	public boolean isPoorAppetite() {
		return this.poorAppetite;
	}

	public void setPoorAppetite(boolean poorAppetite) {
		this.poorAppetite = poorAppetite;
	}

	public boolean isFluctuatingWeight() {
		return this.fluctuatingWeight;
	}

	public void setFluctuatingWeight(boolean fluctuatingWeight) {
		this.fluctuatingWeight = fluctuatingWeight;
	}

	public boolean isLossOf5lbs() {
		return this.lossOf5lbs;
	}

	public void setLossOf5lbs(boolean lossOf5lbs) {
		this.lossOf5lbs = lossOf5lbs;
	}

	public boolean isGained5lbs() {
		return this.gained5lbs;
	}

	public void setGained5lbs(boolean gained5lbs) {
		this.gained5lbs = gained5lbs;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getIbwRange() {
		return this.ibwRange;
	}

	public void setIbwRange(String ibwRange) {
		this.ibwRange = ibwRange;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public Date getFormDate() {
		return this.formDate;
	}

	public void setFormDate(Date formDate) {
		this.formDate = formDate;
	}

	public String getForm() {
		return this.form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public boolean isDietitian() {
		return this.dietitian;
	}

	public void setDietitian(boolean dietitian) {
		this.dietitian = dietitian;
	}

	public boolean isNursingSupervisor() {
		return this.nursingSupervisor;
	}

	public void setNursingSupervisor(boolean nursingSupervisor) {
		this.nursingSupervisor = nursingSupervisor;
	}

	public boolean isAttendingPhysician() {
		return this.attendingPhysician;
	}

	public void setAttendingPhysician(boolean attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
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

package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentCarePlan")
public class ResidentCarePlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8585399072675738559L;

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

	@Column(name = "nextAppointment")
	private Date nextAppointment;

	@Column(name = "updatedDate")
	private Date updatedDate;

	@Column(name = "carePlanPreparedBy")
	private String carePlanPreparedBy;

	@Column(name = "dischargePlan")
	private String dischargePlan;

	@Column(name = "overAllGoal")
	private String overAllGoal;

	@Column(name = "poorPotential")
	private boolean poorPotential;

	@Column(name = "fairPotential")
	private boolean fairPotential;

	@Column(name = "goodPtential")
	private boolean goodPtential;

	@Column(name = "strengths")
	private String strengths;

	@Column(name = "diagnosis")
	private String diagnosis;

	@Column(name = "diet")
	private String diet;

	@Column(name = "allergies")
	private String allergies;

	@Column(name = "othersValue")
	private String othersValue;

	@Column(name = "others")
	private boolean others;

	@Column(name = "hearingAid")
	private boolean hearingAid;

	@Column(name = "prostheresis")
	private boolean prostheresis;

	@Column(name = "dentures")
	private boolean dentures;

	@Column(name = "glasses")
	private boolean glasses;

	@Column(name = "catheterSize")
	private String catheterSize;

	@Column(name = "routineLabWork")
	private String routineLabWork;

	@Column(name = "immunizationType4")
	private String immunizationType4;

	@Column(name = "immunizationType3")
	private String immunizationType3;

	@Column(name = "immunizationType2")
	private String immunizationType2;

	@Column(name = "immunizationType1")
	private String immunizationType1;

	@Column(name = "tbScreeningResult")
	private String tbScreeningResult;

	@Column(name = "chestXray")
	private boolean chestXray;

	@Column(name = "mantoux")
	private boolean mantoux;

	@Column(name = "elimination")
	private String elimination;

	@Column(name = "bathing")
	private String bathing;

	@Column(name = "skinCondition")
	private String skinCondition;

	@Column(name = "oralCare")
	private String oralCare;

	@Column(name = "dressing")
	private String dressing;

	@Column(name = "grooming")
	private String grooming;

	@Column(name = "mobility")
	private String mobility;

	@Column(name = "eatingHabits")
	private String eatingHabits;

	@Column(name = "speechHearing")
	private String speechHearing;

	@Column(name = "mentalStatus")
	private String mentalStatus;

	@Column(name = "restraints")
	private String restraints;

	@Column(name = "theraples")
	private String theraples;

	@Column(name = "activityInterest")
	private String activityInterest;

	@Column(name = "privileges")
	private String privileges;

	@Column(name = "dateChanged")
	private Date dateChanged;

	@Column(name = "immunizationType4Date")
	private Date immunizationType4Date;

	@Column(name = "immunizationType3Date")
	private Date immunizationType3Date;

	@Column(name = "immunizationType2Date")
	private Date immunizationType2Date;

	@Column(name = "tbScreeningDate")
	private Date tbScreeningDate;

	@Column(name = "immunizationType1Date")
	private Date immunizationType1Date;

	public Date getNextAppointment() {
		return this.nextAppointment;
	}

	public void setNextAppointment(Date nextAppointment) {
		this.nextAppointment = nextAppointment;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCarePlanPreparedBy() {
		return this.carePlanPreparedBy;
	}

	public void setCarePlanPreparedBy(String carePlanPreparedBy) {
		this.carePlanPreparedBy = carePlanPreparedBy;
	}

	public String getDischargePlan() {
		return this.dischargePlan;
	}

	public void setDischargePlan(String dischargePlan) {
		this.dischargePlan = dischargePlan;
	}

	public String getOverAllGoal() {
		return this.overAllGoal;
	}

	public void setOverAllGoal(String overAllGoal) {
		this.overAllGoal = overAllGoal;
	}

	public boolean isPoorPotential() {
		return this.poorPotential;
	}

	public void setPoorPotential(boolean poorPotential) {
		this.poorPotential = poorPotential;
	}

	public boolean isFairPotential() {
		return this.fairPotential;
	}

	public void setFairPotential(boolean fairPotential) {
		this.fairPotential = fairPotential;
	}

	public boolean isGoodPtential() {
		return this.goodPtential;
	}

	public void setGoodPtential(boolean goodPtential) {
		this.goodPtential = goodPtential;
	}

	public String getStrengths() {
		return this.strengths;
	}

	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getAllergies() {
		return this.allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public boolean isOthers() {
		return this.others;
	}

	public void setOthers(boolean others) {
		this.others = others;
	}

	public boolean isHearingAid() {
		return this.hearingAid;
	}

	public void setHearingAid(boolean hearingAid) {
		this.hearingAid = hearingAid;
	}

	public boolean isProstheresis() {
		return this.prostheresis;
	}

	public void setProstheresis(boolean prostheresis) {
		this.prostheresis = prostheresis;
	}

	public boolean isDentures() {
		return this.dentures;
	}

	public void setDentures(boolean dentures) {
		this.dentures = dentures;
	}

	public boolean isGlasses() {
		return this.glasses;
	}

	public void setGlasses(boolean glasses) {
		this.glasses = glasses;
	}

	public String getCatheterSize() {
		return this.catheterSize;
	}

	public void setCatheterSize(String catheterSize) {
		this.catheterSize = catheterSize;
	}

	public String getRoutineLabWork() {
		return this.routineLabWork;
	}

	public void setRoutineLabWork(String routineLabWork) {
		this.routineLabWork = routineLabWork;
	}

	public void setImmunizationType1(String immunizationType1) {
		this.immunizationType1 = immunizationType1;
	}

	public String getTbScreeningResult() {
		return this.tbScreeningResult;
	}

	public void setTbScreeningResult(String tbScreeningResult) {
		this.tbScreeningResult = tbScreeningResult;
	}

	public boolean isChestXray() {
		return this.chestXray;
	}

	public void setChestXray(boolean chestXray) {
		this.chestXray = chestXray;
	}

	public boolean isMantoux() {
		return this.mantoux;
	}

	public void setMantoux(boolean mantoux) {
		this.mantoux = mantoux;
	}

	public String getElimination() {
		return this.elimination;
	}

	public void setElimination(String elimination) {
		this.elimination = elimination;
	}

	public String getBathing() {
		return this.bathing;
	}

	public void setBathing(String bathing) {
		this.bathing = bathing;
	}

	public String getSkinCondition() {
		return this.skinCondition;
	}

	public void setSkinCondition(String skinCondition) {
		this.skinCondition = skinCondition;
	}

	public String getOralCare() {
		return this.oralCare;
	}

	public void setOralCare(String oralCare) {
		this.oralCare = oralCare;
	}

	public String getDressing() {
		return this.dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public String getGrooming() {
		return this.grooming;
	}

	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}

	public String getMobility() {
		return this.mobility;
	}

	public void setMobility(String mobility) {
		this.mobility = mobility;
	}

	public String getEatingHabits() {
		return this.eatingHabits;
	}

	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}

	public String getSpeechHearing() {
		return this.speechHearing;
	}

	public void setSpeechHearing(String speechHearing) {
		this.speechHearing = speechHearing;
	}

	public String getMentalStatus() {
		return this.mentalStatus;
	}

	public void setMentalStatus(String mentalStatus) {
		this.mentalStatus = mentalStatus;
	}

	public String getRestraints() {
		return this.restraints;
	}

	public void setRestraints(String restraints) {
		this.restraints = restraints;
	}

	public String getTheraples() {
		return this.theraples;
	}

	public void setTheraples(String theraples) {
		this.theraples = theraples;
	}

	public String getActivityInterest() {
		return this.activityInterest;
	}

	public void setActivityInterest(String activityInterest) {
		this.activityInterest = activityInterest;
	}

	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public Date getDateChanged() {
		return this.dateChanged;
	}

	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}

	public Date getTbScreeningDate() {
		return this.tbScreeningDate;
	}

	public void setTbScreeningDate(Date tbScreeningDate) {
		this.tbScreeningDate = tbScreeningDate;
	}

	public String getOthersValue() {
		return othersValue;
	}

	public void setOthersValue(String othersValue) {
		this.othersValue = othersValue;
	}

	public String getImmunizationType4() {
		return immunizationType4;
	}

	public void setImmunizationType4(String immunizationType4) {
		this.immunizationType4 = immunizationType4;
	}

	public String getImmunizationType3() {
		return immunizationType3;
	}

	public void setImmunizationType3(String immunizationType3) {
		this.immunizationType3 = immunizationType3;
	}

	public String getImmunizationType2() {
		return immunizationType2;
	}

	public void setImmunizationType2(String immunizationType2) {
		this.immunizationType2 = immunizationType2;
	}

	public Date getImmunizationType4Date() {
		return immunizationType4Date;
	}

	public void setImmunizationType4Date(Date immunizationType4Date) {
		this.immunizationType4Date = immunizationType4Date;
	}

	public Date getImmunizationType3Date() {
		return immunizationType3Date;
	}

	public void setImmunizationType3Date(Date immunizationType3Date) {
		this.immunizationType3Date = immunizationType3Date;
	}

	public Date getImmunizationType2Date() {
		return immunizationType2Date;
	}

	public void setImmunizationType2Date(Date immunizationType2Date) {
		this.immunizationType2Date = immunizationType2Date;
	}

	public Date getImmunizationType1Date() {
		return immunizationType1Date;
	}

	public void setImmunizationType1Date(Date immunizationType1Date) {
		this.immunizationType1Date = immunizationType1Date;
	}

	public String getImmunizationType1() {
		return immunizationType1;
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

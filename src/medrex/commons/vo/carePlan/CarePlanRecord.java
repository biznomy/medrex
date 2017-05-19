package medrex.commons.vo.carePlan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CarePlanRecord")
public class CarePlanRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8898583721879920600L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "carePlanDate")
	private Date carePlanDate;
	@Column(name = "delirium")
	private boolean delirium;
	@Column(name = "cogitiveLoss")
	private boolean cogitiveLoss;
	@Column(name = "visualFunction")
	private boolean visualFunction;
	@Column(name = "communication")
	private boolean communication;
	@Column(name = "adlFuncationRehabitationPotential")
	private boolean adlFuncationRehabitationPotential;
	@Column(name = "uninaryIncontinenceAndIndwellingCatheter")
	private boolean uninaryIncontinenceAndIndwellingCatheter;
	@Column(name = "psychosocialWellBeing")
	private boolean psychosocialWellBeing;
	@Column(name = "moodState")
	private boolean moodState;
	@Column(name = "behavioralSymptoms")
	private boolean behavioralSymptoms;
	@Column(name = "activities")
	private boolean activities;
	@Column(name = "falls")
	private boolean falls;
	@Column(name = "nutritionalStatus")
	private boolean nutritionalStatus;
	@Column(name = "feedingTubes")
	private boolean feedingTubes;
	@Column(name = "dehydrationaFluidMaintenance")
	private boolean dehydrationaFluidMaintenance;
	@Column(name = "dentalCare")
	private boolean dentalCare;
	@Column(name = "pressureUlcers")
	private boolean pressureUlcers;
	@Column(name = "psychotropicDrugUse")
	private boolean psychotropicDrugUse;
	@Column(name = "physicalRestraints")
	private boolean physicalRestraints;
	@Column(name = "problem")
	private String problem;
	@Column(name = "goals")
	private String goals;

	@Column(name = "submittedUser")
	private String submittedUser;

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public boolean isActivities() {
		return activities;
	}

	public void setActivities(boolean activities) {
		this.activities = activities;
	}

	public boolean isAdlFuncationRehabitationPotential() {
		return adlFuncationRehabitationPotential;
	}

	public void setAdlFuncationRehabitationPotential(
			boolean adlFuncationRehabitationPotential) {
		this.adlFuncationRehabitationPotential = adlFuncationRehabitationPotential;
	}

	public boolean isBehavioralSymptoms() {
		return behavioralSymptoms;
	}

	public void setBehavioralSymptoms(boolean behavioralSymptoms) {
		this.behavioralSymptoms = behavioralSymptoms;
	}

	public Date getCarePlanDate() {
		return carePlanDate;
	}

	public void setCarePlanDate(Date carePlanDate) {
		this.carePlanDate = carePlanDate;
	}

	public boolean isCogitiveLoss() {
		return cogitiveLoss;
	}

	public void setCogitiveLoss(boolean cogitiveLoss) {
		this.cogitiveLoss = cogitiveLoss;
	}

	public boolean isCommunication() {
		return communication;
	}

	public void setCommunication(boolean communication) {
		this.communication = communication;
	}

	public boolean isDehydrationaFluidMaintenance() {
		return dehydrationaFluidMaintenance;
	}

	public void setDehydrationaFluidMaintenance(
			boolean dehydrationaFluidMaintenance) {
		this.dehydrationaFluidMaintenance = dehydrationaFluidMaintenance;
	}

	public boolean isDelirium() {
		return delirium;
	}

	public void setDelirium(boolean delirium) {
		this.delirium = delirium;
	}

	public boolean isDentalCare() {
		return dentalCare;
	}

	public void setDentalCare(boolean dentalCare) {
		this.dentalCare = dentalCare;
	}

	public boolean isFalls() {
		return falls;
	}

	public void setFalls(boolean falls) {
		this.falls = falls;
	}

	public boolean isFeedingTubes() {
		return feedingTubes;
	}

	public void setFeedingTubes(boolean feedingTubes) {
		this.feedingTubes = feedingTubes;
	}

	public boolean isMoodState() {
		return moodState;
	}

	public void setMoodState(boolean moodState) {
		this.moodState = moodState;
	}

	public boolean isNutritionalStatus() {
		return nutritionalStatus;
	}

	public void setNutritionalStatus(boolean nutritionalStatus) {
		this.nutritionalStatus = nutritionalStatus;
	}

	public boolean isPhysicalRestraints() {
		return physicalRestraints;
	}

	public void setPhysicalRestraints(boolean physicalRestraints) {
		this.physicalRestraints = physicalRestraints;
	}

	public boolean isPressureUlcers() {
		return pressureUlcers;
	}

	public void setPressureUlcers(boolean pressureUlcers) {
		this.pressureUlcers = pressureUlcers;
	}

	public boolean isPsychosocialWellBeing() {
		return psychosocialWellBeing;
	}

	public void setPsychosocialWellBeing(boolean psychosocialWellBeing) {
		this.psychosocialWellBeing = psychosocialWellBeing;
	}

	public boolean isPsychotropicDrugUse() {
		return psychotropicDrugUse;
	}

	public void setPsychotropicDrugUse(boolean psychotropicDrugUse) {
		this.psychotropicDrugUse = psychotropicDrugUse;
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

	public boolean isUninaryIncontinenceAndIndwellingCatheter() {
		return uninaryIncontinenceAndIndwellingCatheter;
	}

	public void setUninaryIncontinenceAndIndwellingCatheter(
			boolean uninaryIncontinenceAndIndwellingCatheter) {
		this.uninaryIncontinenceAndIndwellingCatheter = uninaryIncontinenceAndIndwellingCatheter;
	}

	public boolean isVisualFunction() {
		return visualFunction;
	}

	public void setVisualFunction(boolean visualFunction) {
		this.visualFunction = visualFunction;
	}

	public void setSubmittedUser(String submittedUser) {
		this.submittedUser = submittedUser;
	}

	public String getSubmittedUser() {
		return submittedUser;
	}

}

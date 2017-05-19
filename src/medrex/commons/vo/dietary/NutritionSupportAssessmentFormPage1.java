package medrex.commons.vo.dietary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NutritionSupportAssessmentFormPage1")
public class NutritionSupportAssessmentFormPage1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5802055946169143696L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@Column(name = "formId")
	int formId;

	@Column(name = "residentId")
	int residentId;

	@Column(name = "beeper")
	String beeper;

	@Column(name = "timeOfAssessment")
	String time;

	@Column(name = "dateOfAssessment")
	Date date;

	@Column(name = "dietitan")
	String dietitan;

	@Column(name = "dietEducation")
	String dietEducation;

	@Column(name = "lowRisk")
	boolean lowRisk;

	@Column(name = "moderateRisk")
	boolean moderateRisk;

	@Column(name = "highRisk")
	boolean highRisk;

	@Column(name = "plan")
	String plan;

	@Column(name = "nutritionGoal")
	String nutritionGoal;

	@Column(name = "nutritionDiagnosis")
	String nutritionDiagnosis;

	@Column(name = "nutritionAssessment")
	String nutritionAssessment;

	@Column(name = "fluidsPerDay")
	String fluidsPerDay;

	@Column(name = "fluids")
	String fluids;

	@Column(name = "proteinPerDay")
	String proteinPerDay;

	@Column(name = "protein")
	String protein;

	@Column(name = "caloriesPerDay")
	String caloriesPerDay;

	@Column(name = "calories")
	String calories;

	@Column(name = "estimatedNutritionNeeds")
	String estimatedNutritionNeeds;

	@Column(name = "pHMX")
	String pMHX;

	@Column(name = "nutritionFocusedPhysicalExam")
	String nutritionFocusedPhysicalExam;

	@Column(name = "se")
	boolean se;

	@Column(name = "significant")
	boolean significant;

	@Column(name = "nAweightLoss")
	boolean nAweightLoss;

	@Column(name = "weightLoss")
	String weightLoss;

	@Column(name = "nAweightChange")
	boolean nAweightChange;

	@Column(name = "weightChange")
	String weightChange;

	@Column(name = "severe")
	boolean severe;

	@Column(name = "moderate")
	boolean moderate;

	@Column(name = "mild")
	boolean mild;

	@Column(name = "malnutrition")
	boolean malnutrition;

	@Column(name = "wNL")
	boolean wNL;

	@Column(name = "percentUsualBodyWeight")
	String percentUsualBodyWeight;

	@Column(name = "wtTextInterpretation")
	String wtTextInterpretation;

	@Column(name = "wtInterpretation")
	boolean wtInterpretation;

	@Column(name = "wNLs")
	boolean wNLs;

	@Column(name = "bodyMassIndex")
	String bodyMassIndex;

	@Column(name = "bMI")
	double bMI;

	@Column(name = "usualBodyWeight")
	String usualBodyWeight;

	@Column(name = "adjustments")
	String adjustments;

	@Column(name = "desiredBodyWeight")
	String desiredBodyWeight;

	@Column(name = "height")
	double height;

	@Column(name = "weight")
	double weight;

	@Column(name = "labs")
	String labs;

	@Column(name = "pertinentMedications")
	String pertinentMedications;

	@Column(name = "provides")
	String provides;

	@Column(name = "nutritionSupport")
	String nutritionSupport;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getBeeper() {
		return this.beeper;
	}

	public void setBeeper(String beeper) {
		this.beeper = beeper;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDietitan() {
		return this.dietitan;
	}

	public void setDietitan(String dietitan) {
		this.dietitan = dietitan;
	}

	public String getDietEducation() {
		return this.dietEducation;
	}

	public void setDietEducation(String dietEducation) {
		this.dietEducation = dietEducation;
	}

	public boolean isLowRisk() {
		return this.lowRisk;
	}

	public void setLowRisk(boolean lowRisk) {
		this.lowRisk = lowRisk;
	}

	public boolean isModerateRisk() {
		return this.moderateRisk;
	}

	public void setModerateRisk(boolean moderateRisk) {
		this.moderateRisk = moderateRisk;
	}

	public boolean isHighRisk() {
		return this.highRisk;
	}

	public void setHighRisk(boolean highRisk) {
		this.highRisk = highRisk;
	}

	public String getPlan() {
		return this.plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getNutritionGoal() {
		return this.nutritionGoal;
	}

	public void setNutritionGoal(String nutritionGoal) {
		this.nutritionGoal = nutritionGoal;
	}

	public String getNutritionDiagnosis() {
		return this.nutritionDiagnosis;
	}

	public void setNutritionDiagnosis(String nutritionDiagnosis) {
		this.nutritionDiagnosis = nutritionDiagnosis;
	}

	public String getNutritionAssessment() {
		return this.nutritionAssessment;
	}

	public void setNutritionAssessment(String nutritionAssessment) {
		this.nutritionAssessment = nutritionAssessment;
	}

	public String getFluidsPerDay() {
		return this.fluidsPerDay;
	}

	public void setFluidsPerDay(String fluidsPerDay) {
		this.fluidsPerDay = fluidsPerDay;
	}

	public String getFluids() {
		return this.fluids;
	}

	public void setFluids(String fluids) {
		this.fluids = fluids;
	}

	public String getProteinPerDay() {
		return this.proteinPerDay;
	}

	public void setProteinPerDay(String proteinPerDay) {
		this.proteinPerDay = proteinPerDay;
	}

	public String getProtein() {
		return this.protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getCaloriesPerDay() {
		return this.caloriesPerDay;
	}

	public void setCaloriesPerDay(String caloriesPerDay) {
		this.caloriesPerDay = caloriesPerDay;
	}

	public String getCalories() {
		return this.calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getEstimatedNutritionNeeds() {
		return this.estimatedNutritionNeeds;
	}

	public void setEstimatedNutritionNeeds(String estimatedNutritionNeeds) {
		this.estimatedNutritionNeeds = estimatedNutritionNeeds;
	}

	public String getPMHX() {
		return this.pMHX;
	}

	public void setPMHX(String pMHX) {
		this.pMHX = pMHX;
	}

	public String getNutritionFocusedPhysicalExam() {
		return this.nutritionFocusedPhysicalExam;
	}

	public void setNutritionFocusedPhysicalExam(
			String nutritionFocusedPhysicalExam) {
		this.nutritionFocusedPhysicalExam = nutritionFocusedPhysicalExam;
	}

	public boolean isSe() {
		return this.se;
	}

	public void setSe(boolean se) {
		this.se = se;
	}

	public boolean isSignificant() {
		return this.significant;
	}

	public void setSignificant(boolean significant) {
		this.significant = significant;
	}

	public boolean isNAweightLoss() {
		return this.nAweightLoss;
	}

	public void setNAweightLoss(boolean nAweightLoss) {
		this.nAweightLoss = nAweightLoss;
	}

	public String getWeightLoss() {
		return this.weightLoss;
	}

	public void setWeightLoss(String weightLoss) {
		this.weightLoss = weightLoss;
	}

	public boolean isNAweightChange() {
		return this.nAweightChange;
	}

	public void setNAweightChange(boolean nAweightChange) {
		this.nAweightChange = nAweightChange;
	}

	public String getWeightChange() {
		return this.weightChange;
	}

	public void setWeightChange(String weightChange) {
		this.weightChange = weightChange;
	}

	public boolean isSevere() {
		return this.severe;
	}

	public void setSevere(boolean severe) {
		this.severe = severe;
	}

	public boolean isModerate() {
		return this.moderate;
	}

	public void setModerate(boolean moderate) {
		this.moderate = moderate;
	}

	public boolean isMild() {
		return this.mild;
	}

	public void setMild(boolean mild) {
		this.mild = mild;
	}

	public boolean isMalnutrition() {
		return this.malnutrition;
	}

	public void setMalnutrition(boolean malnutrition) {
		this.malnutrition = malnutrition;
	}

	public boolean isWNL() {
		return this.wNL;
	}

	public void setWNL(boolean wNL) {
		this.wNL = wNL;
	}

	public String getPercentUsualBodyWeight() {
		return this.percentUsualBodyWeight;
	}

	public void setPercentUsualBodyWeight(String percentUsualBodyWeight) {
		this.percentUsualBodyWeight = percentUsualBodyWeight;
	}

	public String getWtTextInterpretation() {
		return wtTextInterpretation;
	}

	public void setWtTextInterpretation(String wtTextInterpretation) {
		this.wtTextInterpretation = wtTextInterpretation;
	}

	public boolean isWtInterpretation() {
		return wtInterpretation;
	}

	public void setWtInterpretation(boolean wtInterpretation) {
		this.wtInterpretation = wtInterpretation;
	}

	public boolean isWNLs() {
		return this.wNLs;
	}

	public void setWNLs(boolean wNLs) {
		this.wNLs = wNLs;
	}

	public String getBodyMassIndex() {
		return this.bodyMassIndex;
	}

	public void setBodyMassIndex(String bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}

	public String getUsualBodyWeight() {
		return this.usualBodyWeight;
	}

	public void setUsualBodyWeight(String usualBodyWeight) {
		this.usualBodyWeight = usualBodyWeight;
	}

	public String getAdjustments() {
		return this.adjustments;
	}

	public void setAdjustments(String adjustments) {
		this.adjustments = adjustments;
	}

	public String getDesiredBodyWeight() {
		return this.desiredBodyWeight;
	}

	public void setDesiredBodyWeight(String desiredBodyWeight) {
		this.desiredBodyWeight = desiredBodyWeight;
	}

	public double getBMI() {
		return bMI;
	}

	public void setBMI(double bmi) {
		bMI = bmi;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getLabs() {
		return this.labs;
	}

	public void setLabs(String labs) {
		this.labs = labs;
	}

	public String getPertinentMedications() {
		return this.pertinentMedications;
	}

	public void setPertinentMedications(String pertinentMedications) {
		this.pertinentMedications = pertinentMedications;
	}

	public String getProvides() {
		return this.provides;
	}

	public void setProvides(String provides) {
		this.provides = provides;
	}

	public String getNutritionSupport() {
		return this.nutritionSupport;
	}

	public void setNutritionSupport(String nutritionSupport) {
		this.nutritionSupport = nutritionSupport;
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

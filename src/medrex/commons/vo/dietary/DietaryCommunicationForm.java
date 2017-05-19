package medrex.commons.vo.dietary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DietaryCommunicationForm")
public class DietaryCommunicationForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6860376732785946938L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "admission")
	private int admission;
	@Column(name = "dateCreated")
	private Date dateCreated;
	@Column(name = "foodAllergies")
	private String foodAllergies;
	@Column(name = "adaptiveFeedingEquipment")
	private String adaptiveFeedingEquipment;
	@Column(name = "decubitis")
	private String decubitis;
	@Column(name = "stage")
	private String stage;
	@Column(name = "residentDC")
	private String residentDC;
	@Column(name = "residentDCTo")
	private int residentDCTo;
	@Column(name = "height")
	private String height;
	@Column(name = "roomChange")
	private String roomChange;
	@Column(name = "weight")
	private String weight;
	@Column(name = "dietitian")
	private String dietitian;
	@Column(name = "visuallyImpaired")
	private boolean visuallyImpaired;
	@Column(name = "earlyLate")
	private String earlyLate;
	@Column(name = "earlyLateTime")
	private String earlyLateTime;
	@Column(name = "eating")
	private String eating;
	@Column(name = "eatingOption")
	private String eatingOption;
	@Column(name = "dietOrder")
	private String dietOrder;
	@Column(name = "previousDiet")
	private String previousDiet;
	@Column(name = "newDiet")
	private String newDiet;
	@Column(name = "supplement")
	private String supplement;
	@Column(name = "totalAssistance")
	private String totalAssistance;
	@Column(name = "partialAssistance")
	private String partialAssistance;
	@Column(name = "independent")
	private String independent;
	@Column(name = "enternalTube")
	private String enternalTube;
	@Column(name = "nurseSignature")
	private String nurseSignature;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getAdmission() {
		return this.admission;
	}

	public void setAdmission(int admission) {
		this.admission = admission;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFoodAllergies() {
		return foodAllergies;
	}

	public void setFoodAllergies(String foodAllergies) {
		this.foodAllergies = foodAllergies;
	}

	public String getAdaptiveFeedingEquipment() {
		return adaptiveFeedingEquipment;
	}

	public void setAdaptiveFeedingEquipment(String adaptiveFeedingEquipment) {
		this.adaptiveFeedingEquipment = adaptiveFeedingEquipment;
	}

	public String getDecubitis() {
		return decubitis;
	}

	public void setDecubitis(String decubitis) {
		this.decubitis = decubitis;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getResidentDC() {
		return residentDC;
	}

	public void setResidentDC(String residentDC) {
		this.residentDC = residentDC;
	}

	public int getResidentDCTo() {
		return residentDCTo;
	}

	public void setResidentDCTo(int residentDCTo) {
		this.residentDCTo = residentDCTo;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getRoomChange() {
		return roomChange;
	}

	public void setRoomChange(String roomChange) {
		this.roomChange = roomChange;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDietitian() {
		return dietitian;
	}

	public void setDietitian(String dietitian) {
		this.dietitian = dietitian;
	}

	public boolean isVisuallyImpaired() {
		return visuallyImpaired;
	}

	public void setVisuallyImpaired(boolean visuallyImpaired) {
		this.visuallyImpaired = visuallyImpaired;
	}

	public String getEarlyLate() {
		return earlyLate;
	}

	public void setEarlyLate(String earlyLate) {
		this.earlyLate = earlyLate;
	}

	public String getEarlyLateTime() {
		return earlyLateTime;
	}

	public void setEarlyLateTime(String earlyLateTime) {
		this.earlyLateTime = earlyLateTime;
	}

	public String getEating() {
		return eating;
	}

	public void setEating(String eating) {
		this.eating = eating;
	}

	public String getEatingOption() {
		return eatingOption;
	}

	public void setEatingOption(String eatingOption) {
		this.eatingOption = eatingOption;
	}

	public String getDietOrder() {
		return dietOrder;
	}

	public void setDietOrder(String dietOrder) {
		this.dietOrder = dietOrder;
	}

	public String getPreviousDiet() {
		return previousDiet;
	}

	public void setPreviousDiet(String previousDiet) {
		this.previousDiet = previousDiet;
	}

	public String getNewDiet() {
		return newDiet;
	}

	public void setNewDiet(String newDiet) {
		this.newDiet = newDiet;
	}

	public String getSupplement() {
		return supplement;
	}

	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}

	public String getTotalAssistance() {
		return totalAssistance;
	}

	public void setTotalAssistance(String totalAssistance) {
		this.totalAssistance = totalAssistance;
	}

	public String getPartialAssistance() {
		return partialAssistance;
	}

	public void setPartialAssistance(String partialAssistance) {
		this.partialAssistance = partialAssistance;
	}

	public String getIndependent() {
		return independent;
	}

	public void setIndependent(String independent) {
		this.independent = independent;
	}

	public String getEnternalTube() {
		return enternalTube;
	}

	public void setEnternalTube(String enternalTube) {
		this.enternalTube = enternalTube;
	}

	public String getNurseSignature() {
		return nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

}

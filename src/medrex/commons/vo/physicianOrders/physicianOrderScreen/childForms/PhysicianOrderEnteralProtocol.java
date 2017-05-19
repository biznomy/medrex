package medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;

@Entity
@Table(name = "PhysicianOrderEnteralProtocol")
public class PhysicianOrderEnteralProtocol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4580340962335933470L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	
	@Column(name = "residentId")
	int residentId;
	
	
	
	@Column(name = "residualMLNotifyMD")
	String residualMLNotifyMD;
	@Column(name = "feedingFor")
	String feedingFor;
	@Column(name = "residualML")
	String residualML;
	@Column(name = "checkForResidual")
	String checkForResidual;
	@Column(name = "flushBetweenMedication")
	String flushBetweenMedication;
	@Column(name = "flushHours")
	String flushHours;
	@Column(name = "flushML")
	String flushML;
	@Column(name = "feedingFrequencyHoursPerDay")
	String feedingFrequencyHoursPerDay;
	@Column(name = "feedingFrequencyMLPerHour")
	String feedingFrequencyMLPerHour;
	@Column(name = "bolusViaPumpRatePerHour")
	String bolusViaPumpRatePerHour;
	@Column(name = "bolusViaPumpML")
	String bolusViaPumpML;
	@Column(name = "totalCalories")
	String totalCalories;
	@Column(name = "timeUp")
	String timeUp;
	@Column(name = "timeDown")
	String timeDown;
	@Column(name = "cleanseSiteWith")
	String cleanseSiteWith;
	@Column(name = "cleanseSite")
	String cleanseSite;
	@Column(name = "changeEquipment")
	String changeEquipment;
	@Column(name = "changeFeeding")
	String changeFeeding;
	@Column(name = "tubeSize")
	String tubeSize;
	@Column(name = "tubeFeeding")
	String tubeFeeding;
	@Column(name = "allergyHistory3")
	String allergyHistory3;
	@Column(name = "allergyHistory2")
	String allergyHistory2;
	@Column(name = "allergyHistory1")
	String allergyHistory1;

	@Column(name = "diagnosis3")
	String diagnosis3;
	@Column(name = "diagnosis2")
	String diagnosis2;
	@Column(name = "diagnosis1")
	String diagnosis1;
	@Column(name = "height")
	String height;
	@Column(name = "weight")
	String weight;
	@Column(name = "physicianLastName")
	String physicianLastName;
	@Column(name = "physicianFirstName")
	String physicianFirstName;
	@Column(name = "oB")
	String oB;
	@Column(name = "facilityName")
	String facilityName;
	@Column(name = "admission")
	String admission;
	@Column(name = "lastName")
	String lastName;
	@Column(name = "firstName")
	String firstName;
	@Column(name = "notedByDetails")
	String notedByDetails;
	@Column(name = "physicianSign")
	String physicianSign;
	@Column(name = "nurseSign")
	String nurseSign;
	@Column(name = "otedBy")
	String otedBy;
	@Column(name = "hysician")
	String hysician;
	@Column(name = "urse")
	String urse;
	@Column(name = "notedByTime")
	String notedByTime;
	@Column(name = "physicianTime")
	String physicianTime;
	@Column(name = "nurseTime")
	String nurseTime;
	@Column(name = "dOB")
	Date dOB;
	@Column(name = "peg")
	boolean peg;
	@Column(name = "pump")
	boolean pump;
	@Column(name = "gravity")
	boolean gravity;
	@Column(name = "bolus")
	boolean bolus;
	@Column(name = "feeding")
	String feeding;
	@Column(name = "feedingFrequencyTimesPerDay")
	String feedingFrequencyTimesPerDay;
	@Column(name = "totalNutrient")
	String totalNutrient;
	@Column(name = "yCheckBox")
	boolean yCheckBox;
	@Column(name = "yNotReplaceCheckBox")
	boolean yNotReplaceCheckBox;
	@Column(name = "placement")
	String placement;
	@Column(name = "tArea")
	String tArea;
	@Column(name = "nurse")
	Date nurse;
	@Column(name = "physician")
	Date physician;
	@Column(name = "notedBy")
	Date notedBy;
	
	

	


	public int getSerial() {
		return serial;
	}

	
	/*public PhysicianOrderDiets getDiets() {
		return diets;
	}


	public void setDiets(PhysicianOrderDiets diets) {
		this.diets = diets;
	}*/



	public static long getSerialVersionUID() {
		return serialVersionUID;
	}



	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getResidualMLNotifyMD() {
		return residualMLNotifyMD;
	}

	public void setResidualMLNotifyMD(String residualMLNotifyMD) {
		this.residualMLNotifyMD = residualMLNotifyMD;
	}

	public String getFeedingFor() {
		return feedingFor;
	}

	public void setFeedingFor(String feedingFor) {
		this.feedingFor = feedingFor;
	}

	public String getResidualML() {
		return residualML;
	}

	public void setResidualML(String residualML) {
		this.residualML = residualML;
	}

	public String getCheckForResidual() {
		return checkForResidual;
	}

	public void setCheckForResidual(String checkForResidual) {
		this.checkForResidual = checkForResidual;
	}

	public String getFlushBetweenMedication() {
		return flushBetweenMedication;
	}

	public void setFlushBetweenMedication(String flushBetweenMedication) {
		this.flushBetweenMedication = flushBetweenMedication;
	}

	public String getFlushHours() {
		return flushHours;
	}

	public void setFlushHours(String flushHours) {
		this.flushHours = flushHours;
	}

	public String getFlushML() {
		return flushML;
	}

	public void setFlushML(String flushML) {
		this.flushML = flushML;
	}

	public String getFeedingFrequencyHoursPerDay() {
		return feedingFrequencyHoursPerDay;
	}

	public void setFeedingFrequencyHoursPerDay(
			String feedingFrequencyHoursPerDay) {
		this.feedingFrequencyHoursPerDay = feedingFrequencyHoursPerDay;
	}

	public String getFeedingFrequencyMLPerHour() {
		return feedingFrequencyMLPerHour;
	}

	public void setFeedingFrequencyMLPerHour(String feedingFrequencyMLPerHour) {
		this.feedingFrequencyMLPerHour = feedingFrequencyMLPerHour;
	}

	public String getBolusViaPumpRatePerHour() {
		return bolusViaPumpRatePerHour;
	}

	public void setBolusViaPumpRatePerHour(String bolusViaPumpRatePerHour) {
		this.bolusViaPumpRatePerHour = bolusViaPumpRatePerHour;
	}

	public String getBolusViaPumpML() {
		return bolusViaPumpML;
	}

	public void setBolusViaPumpML(String bolusViaPumpML) {
		this.bolusViaPumpML = bolusViaPumpML;
	}

	public String getTotalCalories() {
		return totalCalories;
	}

	public void setTotalCalories(String totalCalories) {
		this.totalCalories = totalCalories;
	}

	public String getTimeUp() {
		return timeUp;
	}

	public void setTimeUp(String timeUp) {
		this.timeUp = timeUp;
	}

	public String getTimeDown() {
		return timeDown;
	}

	public void setTimeDown(String timeDown) {
		this.timeDown = timeDown;
	}

	public String getCleanseSiteWith() {
		return cleanseSiteWith;
	}

	public void setCleanseSiteWith(String cleanseSiteWith) {
		this.cleanseSiteWith = cleanseSiteWith;
	}

	public String getCleanseSite() {
		return cleanseSite;
	}

	public void setCleanseSite(String cleanseSite) {
		this.cleanseSite = cleanseSite;
	}

	public String getChangeEquipment() {
		return changeEquipment;
	}

	public void setChangeEquipment(String changeEquipment) {
		this.changeEquipment = changeEquipment;
	}

	public String getChangeFeeding() {
		return changeFeeding;
	}

	public void setChangeFeeding(String changeFeeding) {
		this.changeFeeding = changeFeeding;
	}

	public String getTubeSize() {
		return tubeSize;
	}

	public void setTubeSize(String tubeSize) {
		this.tubeSize = tubeSize;
	}

	public String getTubeFeeding() {
		return tubeFeeding;
	}

	public void setTubeFeeding(String tubeFeeding) {
		this.tubeFeeding = tubeFeeding;
	}

	public String getAllergyHistory3() {
		return allergyHistory3;
	}

	public void setAllergyHistory3(String allergyHistory3) {
		this.allergyHistory3 = allergyHistory3;
	}

	public String getAllergyHistory2() {
		return allergyHistory2;
	}

	public void setAllergyHistory2(String allergyHistory2) {
		this.allergyHistory2 = allergyHistory2;
	}

	public String getAllergyHistory1() {
		return allergyHistory1;
	}

	public void setAllergyHistory1(String allergyHistory1) {
		this.allergyHistory1 = allergyHistory1;
	}

	public String getDiagnosis3() {
		return diagnosis3;
	}

	public void setDiagnosis3(String diagnosis3) {
		this.diagnosis3 = diagnosis3;
	}

	public String getDiagnosis2() {
		return diagnosis2;
	}

	public void setDiagnosis2(String diagnosis2) {
		this.diagnosis2 = diagnosis2;
	}

	public String getDiagnosis1() {
		return diagnosis1;
	}

	public void setDiagnosis1(String diagnosis1) {
		this.diagnosis1 = diagnosis1;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPhysicianLastName() {
		return physicianLastName;
	}

	public void setPhysicianLastName(String physicianLastName) {
		this.physicianLastName = physicianLastName;
	}

	public String getPhysicianFirstName() {
		return physicianFirstName;
	}

	public void setPhysicianFirstName(String physicianFirstName) {
		this.physicianFirstName = physicianFirstName;
	}

	public String getOB() {
		return oB;
	}

	public void setOB(String ob) {
		oB = ob;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNotedByDetails() {
		return notedByDetails;
	}

	public void setNotedByDetails(String notedByDetails) {
		this.notedByDetails = notedByDetails;
	}

	public String getPhysicianSign() {
		return physicianSign;
	}

	public void setPhysicianSign(String physicianSign) {
		this.physicianSign = physicianSign;
	}

	public String getNurseSign() {
		return nurseSign;
	}

	public void setNurseSign(String nurseSign) {
		this.nurseSign = nurseSign;
	}

	public String getOtedBy() {
		return otedBy;
	}

	public void setOtedBy(String otedBy) {
		this.otedBy = otedBy;
	}

	public String getHysician() {
		return hysician;
	}

	public void setHysician(String hysician) {
		this.hysician = hysician;
	}

	public String getUrse() {
		return urse;
	}

	public void setUrse(String urse) {
		this.urse = urse;
	}

	public String getNotedByTime() {
		return notedByTime;
	}

	public void setNotedByTime(String notedByTime) {
		this.notedByTime = notedByTime;
	}

	public String getPhysicianTime() {
		return physicianTime;
	}

	public void setPhysicianTime(String physicianTime) {
		this.physicianTime = physicianTime;
	}

	public String getNurseTime() {
		return nurseTime;
	}

	public void setNurseTime(String nurseTime) {
		this.nurseTime = nurseTime;
	}

	public Date getDOB() {
		return dOB;
	}

	public void setDOB(Date dob) {
		dOB = dob;
	}

	public boolean isPeg() {
		return peg;
	}

	public void setPeg(boolean peg) {
		this.peg = peg;
	}

	public boolean isPump() {
		return pump;
	}

	public void setPump(boolean pump) {
		this.pump = pump;
	}

	public boolean isGravity() {
		return gravity;
	}

	public void setGravity(boolean gravity) {
		this.gravity = gravity;
	}

	public boolean isBolus() {
		return bolus;
	}

	public void setBolus(boolean bolus) {
		this.bolus = bolus;
	}

	public String getFeeding() {
		return feeding;
	}

	public void setFeeding(String feeding) {
		this.feeding = feeding;
	}

	public String getFeedingFrequencyTimesPerDay() {
		return feedingFrequencyTimesPerDay;
	}

	public void setFeedingFrequencyTimesPerDay(
			String feedingFrequencyTimesPerDay) {
		this.feedingFrequencyTimesPerDay = feedingFrequencyTimesPerDay;
	}

	public String getTotalNutrient() {
		return totalNutrient;
	}

	public void setTotalNutrient(String totalNutrient) {
		this.totalNutrient = totalNutrient;
	}

	public boolean isYCheckBox() {
		return yCheckBox;
	}

	public void setYCheckBox(boolean checkBox) {
		yCheckBox = checkBox;
	}

	public boolean isYNotReplaceCheckBox() {
		return yNotReplaceCheckBox;
	}

	public void setYNotReplaceCheckBox(boolean notReplaceCheckBox) {
		yNotReplaceCheckBox = notReplaceCheckBox;
	}

	public String getPlacement() {
		return placement;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}

	public String getTArea() {
		return tArea;
	}

	public void setTArea(String area) {
		tArea = area;
	}

	public Date getNurse() {
		return nurse;
	}

	public void setNurse(Date nurse) {
		this.nurse = nurse;
	}

	public Date getPhysician() {
		return physician;
	}

	public void setPhysician(Date physician) {
		this.physician = physician;
	}

	public Date getNotedBy() {
		return notedBy;
	}

	public void setNotedBy(Date notedBy) {
		this.notedBy = notedBy;
	}

}

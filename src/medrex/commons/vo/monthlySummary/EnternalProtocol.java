package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EnternalProtocol")
public class EnternalProtocol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3634419989272535393L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentFirstName")
	private String residentFirstName;

	@Column(name = "residentLastName")
	private String residentlastName;
	@Column(name = "admission")
	private String admission;
	@Column(name = "monthYear")
	private String monthYear;
	@Column(name = "facilityName")
	private String facilityName;
	@Column(name = "unitRoom")
	private String unitRoom;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "physicianFirstName")
	private String physicianFirstName;
	@Column(name = "physicianLastName")
	private String physicianLastName;
	@Column(name = "weight")
	private String weight;
	@Column(name = "height")
	private String height;
	@Column(name = "diagnosis1")
	private String diagnosis1;
	@Column(name = "diagnosis2")
	private String diagnosis2;
	@Column(name = "diagnosis3")
	private String diagnosis3;
	@Column(name = "allergyHistory1")
	private String allergyHistory1;
	@Column(name = "allergyHistory2")
	private String allergyHistory2;
	@Column(name = "allergyHistory3")
	private String allergyHistory3;
	@Column(name = "tubeFeeding")
	private String tubeFeeding;
	@Column(name = "feedingFrequencyML")
	private String feedingFrequencyML;
	@Column(name = "timesPerDay")
	private String timesPerDay;
	@Column(name = "mlPerHour")
	private String mlPerHour;
	@Column(name = "hoursPerDay")
	private String hoursPerDay;
	@Column(name = "bolusViaPump")
	private String bolusViaPump;
	@Column(name = "ratePerHour")
	private String ratePerHour;
	@Column(name = "totalNutrient")
	private String totalNutrient;
	@Column(name = "totalCalories")
	private String totalCalories;
	@Column(name = "timeUp")
	private String timeUp;
	@Column(name = "timeDown")
	private String timeDown;
	@Column(name = "tubeSize")
	private String tubeSize;
	@Column(name = "tubeMay")
	private boolean tubeMay;
	@Column(name = "tubeMayNot")
	private boolean tubeMayNot;
	@Column(name = "changeFeeding")
	private String changeEquipment;
	@Column(name = "cleanseSite")
	private String cleanseSite;
	@Column(name = "cleanseSiteWith")
	private String cleanseSiteWith;
	@Column(name = "flushML")
	private String flushML;
	@Column(name = "flushHours")
	private String flushHours;
	@Column(name = "flushBeforeAfterMedication")
	private String flushBeforeAfterMedication;
	@Column(name = "flushBetweenMedication")
	private String flushBetweenMedication;
	@Column(name = "placement")
	private String placement;
	@Column(name = "checkForResidual")
	private String checkForResidual;
	@Column(name = "residualML")
	private String residualML;
	@Column(name = "residualFeedingFor")
	private String residualFeedingFor;
	@Column(name = "residualNotifyMD")
	private String residualNotifyMD;
	@Column(name = "additionalEnteralOrders")
	private String additionalEnteralOrders;
	@Column(name = "nurseSignature")
	private String nurseSignature;
	@Column(name = "physicianSignature")
	private String physicianSignature;
	@Column(name = "notedBy")
	private String notedBy;
	@Column(name = "notedByDate")
	private Date notedByDate;
	@Column(name = "physicianDate")
	private Date physicianDate;
	@Column(name = "nurseDate")
	private Date nurseDate;
	@Column(name = "notedByTime")
	private String notedByTime;
	@Column(name = "physicianTime")
	private String physicianTime;
	@Column(name = "nurseTime")
	private String nurseTime;
	@Column(name = "nG")
	private boolean nG;
	@Column(name = "gT")
	private boolean gT;
	@Column(name = "peg")
	private boolean peg;
	@Column(name = "jT")
	private boolean jT;
	@Column(name = "pump")
	private boolean pump;
	@Column(name = "gravity")
	private boolean gravity;
	@Column(name = "bolus")
	private boolean bolus;

	public void setBolus(boolean bolus) {
		this.bolus = bolus;
	}

	public boolean isBolus() {
		return bolus;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getSerial() {
		return serial;
	}

	public void setResidentFirstName(String residentFirstName) {
		this.residentFirstName = residentFirstName;
	}

	public String getResidentFirstName() {
		return residentFirstName;
	}

	public void setResidentlastName(String residentlastName) {
		this.residentlastName = residentlastName;
	}

	public String getResidentlastName() {
		return residentlastName;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getAdmission() {
		return admission;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setUnitRoom(String unitRoom) {
		this.unitRoom = unitRoom;
	}

	public String getUnitRoom() {
		return unitRoom;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setPhysicianFirstName(String physicianFirstName) {
		this.physicianFirstName = physicianFirstName;
	}

	public String getPhysicianFirstName() {
		return physicianFirstName;
	}

	public void setPhysicianLastName(String physicianLastName) {
		this.physicianLastName = physicianLastName;
	}

	public String getPhysicianLastName() {
		return physicianLastName;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return weight;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHeight() {
		return height;
	}

	public void setDiagnosis1(String diagnosis1) {
		this.diagnosis1 = diagnosis1;
	}

	public String getDiagnosis1() {
		return diagnosis1;
	}

	public void setDiagnosis2(String diagnosis2) {
		this.diagnosis2 = diagnosis2;
	}

	public String getDiagnosis2() {
		return diagnosis2;
	}

	public void setDiagnosis3(String diagnosis3) {
		this.diagnosis3 = diagnosis3;
	}

	public String getDiagnosis3() {
		return diagnosis3;
	}

	public void setAllergyHistory1(String allergyHistory1) {
		this.allergyHistory1 = allergyHistory1;
	}

	public String getAllergyHistory1() {
		return allergyHistory1;
	}

	public void setAllergyHistory2(String allergyHistory2) {
		this.allergyHistory2 = allergyHistory2;
	}

	public String getAllergyHistory2() {
		return allergyHistory2;
	}

	public void setAllergyHistory3(String allergyHistory3) {
		this.allergyHistory3 = allergyHistory3;
	}

	public String getAllergyHistory3() {
		return allergyHistory3;
	}

	public void setTubeFeeding(String tubeFeeding) {
		this.tubeFeeding = tubeFeeding;
	}

	public String getTubeFeeding() {
		return tubeFeeding;
	}

	public void setFeedingFrequencyML(String feedingFrequencyML) {
		this.feedingFrequencyML = feedingFrequencyML;
	}

	public String getFeedingFrequencyML() {
		return feedingFrequencyML;
	}

	public void setTimesPerDay(String timesPerDay) {
		this.timesPerDay = timesPerDay;
	}

	public String getTimesPerDay() {
		return timesPerDay;
	}

	public void setMlPerHour(String mlPerHour) {
		this.mlPerHour = mlPerHour;
	}

	public String getMlPerHour() {
		return mlPerHour;
	}

	public void setHoursPerDay(String hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public String getHoursPerDay() {
		return hoursPerDay;
	}

	public void setBolusViaPump(String bolusViaPump) {
		this.bolusViaPump = bolusViaPump;
	}

	public String getBolusViaPump() {
		return bolusViaPump;
	}

	public void setRatePerHour(String ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public String getRatePerHour() {
		return ratePerHour;
	}

	public void setTotalNutrient(String totalNutrient) {
		this.totalNutrient = totalNutrient;
	}

	public String getTotalNutrient() {
		return totalNutrient;
	}

	public void setTotalCalories(String totalCalories) {
		this.totalCalories = totalCalories;
	}

	public String getTotalCalories() {
		return totalCalories;
	}

	public void setTimeUp(String timeUp) {
		this.timeUp = timeUp;
	}

	public String getTimeUp() {
		return timeUp;
	}

	public void setTimeDown(String timeDown) {
		this.timeDown = timeDown;
	}

	public String getTimeDown() {
		return timeDown;
	}

	public void setTubeSize(String tubeSize) {
		this.tubeSize = tubeSize;
	}

	public String getTubeSize() {
		return tubeSize;
	}

	public void setTubeMay(boolean tubeMay) {
		this.tubeMay = tubeMay;
	}

	public boolean isTubeMay() {
		return tubeMay;
	}

	public void setTubeMayNot(boolean tubeMayNot) {
		this.tubeMayNot = tubeMayNot;
	}

	public boolean isTubeMayNot() {
		return tubeMayNot;
	}

	public void setChangeEquipment(String changeEquipment) {
		this.changeEquipment = changeEquipment;
	}

	public String getChangeEquipment() {
		return changeEquipment;
	}

	public void setCleanseSite(String cleanseSite) {
		this.cleanseSite = cleanseSite;
	}

	public String getCleanseSite() {
		return cleanseSite;
	}

	public void setCleanseSiteWith(String cleanseSiteWith) {
		this.cleanseSiteWith = cleanseSiteWith;
	}

	public String getCleanseSiteWith() {
		return cleanseSiteWith;
	}

	public void setFlushML(String flushML) {
		this.flushML = flushML;
	}

	public String getFlushML() {
		return flushML;
	}

	public void setFlushHours(String flushHours) {
		this.flushHours = flushHours;
	}

	public String getFlushHours() {
		return flushHours;
	}

	public void setFlushBeforeAfterMedication(String flushBeforeAfterMedication) {
		this.flushBeforeAfterMedication = flushBeforeAfterMedication;
	}

	public String getFlushBeforeAfterMedication() {
		return flushBeforeAfterMedication;
	}

	public void setFlushBetweenMedication(String flushBetweenMedication) {
		this.flushBetweenMedication = flushBetweenMedication;
	}

	public String getFlushBetweenMedication() {
		return flushBetweenMedication;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}

	public String getPlacement() {
		return placement;
	}

	public void setCheckForResidual(String checkForResidual) {
		this.checkForResidual = checkForResidual;
	}

	public String getCheckForResidual() {
		return checkForResidual;
	}

	public void setResidualML(String residualML) {
		this.residualML = residualML;
	}

	public String getResidualML() {
		return residualML;
	}

	public void setResidualFeedingFor(String residualFeedingFor) {
		this.residualFeedingFor = residualFeedingFor;
	}

	public String getResidualFeedingFor() {
		return residualFeedingFor;
	}

	public void setResidualNotifyMD(String residualNotifyMD) {
		this.residualNotifyMD = residualNotifyMD;
	}

	public String getResidualNotifyMD() {
		return residualNotifyMD;
	}

	public void setAdditionalEnteralOrders(String additionalEnteralOrders) {
		this.additionalEnteralOrders = additionalEnteralOrders;
	}

	public String getAdditionalEnteralOrders() {
		return additionalEnteralOrders;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public String getNurseSignature() {
		return nurseSignature;
	}

	public void setPhysicianSignature(String physicianSignature) {
		this.physicianSignature = physicianSignature;
	}

	public String getPhysicianSignature() {
		return physicianSignature;
	}

	public void setNotedBy(String notedBy) {
		this.notedBy = notedBy;
	}

	public String getNotedBy() {
		return notedBy;
	}

	public void setNotedByDate(Date notedByDate) {
		this.notedByDate = notedByDate;
	}

	public Date getNotedByDate() {
		return notedByDate;
	}

	public void setPhysicianDate(Date physicianDate) {
		this.physicianDate = physicianDate;
	}

	public Date getPhysicianDate() {
		return physicianDate;
	}

	public void setNurseDate(Date nurseDate) {
		this.nurseDate = nurseDate;
	}

	public Date getNurseDate() {
		return nurseDate;
	}

	public void setNotedByTime(String notedByTime) {
		this.notedByTime = notedByTime;
	}

	public String getNotedByTime() {
		return notedByTime;
	}

	public void setPhysicianTime(String physicianTime) {
		this.physicianTime = physicianTime;
	}

	public String getPhysicianTime() {
		return physicianTime;
	}

	public void setNurseTime(String nurseTime) {
		this.nurseTime = nurseTime;
	}

	public String getNurseTime() {
		return nurseTime;
	}

	public void setNG(boolean nG) {
		this.nG = nG;
	}

	public boolean isNG() {
		return nG;
	}

	public void setGT(boolean gT) {
		this.gT = gT;
	}

	public boolean isGT() {
		return gT;
	}

	public void setPeg(boolean peg) {
		this.peg = peg;
	}

	public boolean isPeg() {
		return peg;
	}

	public void setJT(boolean jT) {
		this.jT = jT;
	}

	public boolean isJT() {
		return jT;
	}

	public void setPump(boolean pump) {
		this.pump = pump;
	}

	public boolean isPump() {
		return pump;
	}

	public void setGravity(boolean gravity) {
		this.gravity = gravity;
	}

	public boolean isGravity() {
		return gravity;
	}

}

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

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "ResidentAssessmentFormPage14")
public class ResidentAssessmentFormPage14 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5413997060250181328L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "room")
	private String room;
	@Column(name = "floorType")
	private String floorType;
	@Column(name = "woundLocation")
	private String woundLocation;
	@Column(name = "identifiedDate")
	private Date identifiedDate;
	@Column(name = "hospitalAcquired")
	private String hospitalAcquired;
	@Column(name = "facilityAcquired")
	private String facilityAcquired;

	// changes from text field to check box

	@Column(name = "pressure")
	private boolean pressure;
	@Column(name = "venous")
	private boolean venous;
	@Column(name = "sx")
	private boolean sx;
	@Column(name = "skinTear")
	private boolean skinTear;
	@Column(name = "diabetic")
	private boolean diabetic;
	@Column(name = "arterial")
	private boolean arterial;
	@Column(name = "others")
	private boolean others;

	// changes from text field to check box

	@Column(name = "currentApperanceWeek1")
	private String currentApperanceWeek1;

	/*
	 * @Column(name = "currentApperanceWeek2") private String
	 * currentApperanceWeek2;
	 * 
	 * @Column(name = "currentApperanceWeek3") private String
	 * currentApperanceWeek3;
	 * 
	 * @Column(name = "currentApperanceWeek4") private String
	 * currentApperanceWeek4;
	 */

	@Column(name = "stageWeek1")
	private String stageWeek1;

	/*
	 * @Column(name = "stageWeek2") private String stageWeek2;
	 * 
	 * @Column(name = "stageWeek3") private String stageWeek3;
	 * 
	 * @Column(name = "stageWeek4") private String stageWeek4;
	 */

	@Column(name = "lengthWeek1")
	private String lengthWeek1;

	/*
	 * @Column(name = "lengthWeek2") private String lengthWeek2;
	 * 
	 * @Column(name = "lengthWeek3") private String lengthWeek3;
	 * 
	 * @Column(name = "lengthWeek4") private String lengthWeek4;
	 */

	@Column(name = "widthWeek1")
	private String widthWeek1;

	/*
	 * @Column(name = "widthWeek2") private String widthWeek2;
	 * 
	 * @Column(name = "widthWeek3") private String widthWeek3;
	 * 
	 * @Column(name = "widthWeek4") private String widthWeek4;
	 */

	@Column(name = "depthWeek1")
	private String depthWeek1;

	/*
	 * @Column(name = "depthWeek2") private String depthWeek2;
	 * 
	 * @Column(name = "depthWeek3") private String depthWeek3;
	 * 
	 * @Column(name = "depthWeek4") private String depthWeek4;
	 */

	@Column(name = "tunnelling12Week1")
	private String tunnelling12Week1;
	@Column(name = "tunnelling3Week1")
	private String tunnelling3Week1;
	@Column(name = "tunnelling6Week1")
	private String tunnelling6Week1;
	@Column(name = "tunnelling9Week1")
	private String tunnelling9Week1;

	/*
	 * @Column(name = "tunnelling12Week2") private String tunnelling12Week2;
	 * 
	 * @Column(name = "tunnelling3Week2") private String tunnelling3Week2;
	 * 
	 * @Column(name = "tunnelling6Week2") private String tunnelling6Week2;
	 * 
	 * @Column(name = "tunnelling9Week2") private String tunnelling9Week2;
	 * 
	 * @Column(name = "tunnelling12Week3") private String tunnelling12Week3;
	 * 
	 * @Column(name = "tunnelling3Week3") private String tunnelling3Week3;
	 * 
	 * @Column(name = "tunnelling6Week3") private String tunnelling6Week3;
	 * 
	 * @Column(name = "tunnelling9Week3") private String tunnelling9Week3;
	 * 
	 * @Column(name = "tunnelling12Week4") private String tunnelling12Week4;
	 * 
	 * @Column(name = "tunnelling3Week4") private String tunnelling3Week4;
	 * 
	 * @Column(name = "tunnelling6Week4") private String tunnelling6Week4;
	 * 
	 * @Column(name = "tunnelling9Week4") private String tunnelling9Week4;
	 */

	@Column(name = "underminingWeek1")
	private String underminingWeek1;

	/*
	 * @Column(name = "underminingWeek2") private String underminingWeek2;
	 * 
	 * @Column(name = "underminingWeek3") private String underminingWeek3;
	 * 
	 * @Column(name = "underminingWeek4") private String underminingWeek4;
	 */

	@Column(name = "sloughNecrosisWeek1")
	private String sloughNecrosisWeek1;

	/*
	 * @Column(name = "sloughNecrosisWeek2") private String sloughNecrosisWeek2;
	 * 
	 * @Column(name = "sloughNecrosisWeek3") private String sloughNecrosisWeek3;
	 * 
	 * @Column(name = "sloughNecrosisWeek4") private String sloughNecrosisWeek4;
	 */

	@Column(name = "sloughColorWeek1")
	private String sloughColorWeek1;

	/*
	 * @Column(name = "sloughColorWeek2") private String sloughColorWeek2;
	 * 
	 * @Column(name = "sloughColorWeek3") private String sloughColorWeek3;
	 * 
	 * @Column(name = "sloughColorWeek4") private String sloughColorWeek4;
	 */

	@Column(name = "inflamationWeek1")
	private String inflamationWeek1;

	/*
	 * @Column(name = "inflamationWeek2") private String inflamationWeek2;
	 * 
	 * @Column(name = "inflamationWeek3") private String inflamationWeek3;
	 * 
	 * @Column(name = "inflamationWeek4") private String inflamationWeek4;
	 */

	@Column(name = "drainageExudateTypeOfWeek1")
	private String drainageExudateTypeOfWeek1;

	/*
	 * @Column(name="drainageExudateTypeOfWeek2") private String
	 * drainageExudateTypeOfWeek2;
	 * 
	 * @Column(name="drainageExudateTypeOfWeek3") private String
	 * drainageExudateTypeOfWeek3;
	 * 
	 * @Column(name="drainageExudateTypeOfWeek4") private String
	 * drainageExudateTypeOfWeek4;
	 */

	@Column(name = "amountOfExudateWeek1")
	private String amountOfExudateWeek1;

	/*
	 * @Column(name="amountOfExudateWeek2") private String amountOfExudateWeek2;
	 * 
	 * @Column(name="amountOfExudateWeek3") private String amountOfExudateWeek3;
	 * 
	 * @Column(name="amountOfExudateWeek4") private String amountOfExudateWeek4;
	 */

	@Column(name = "exudateOdorWeek1")
	private String exudateOdorWeek1;

	/*
	 * @Column(name = "exudateOdorWeek2") private String exudateOdorWeek2;
	 * 
	 * @Column(name = "exudateOdorWeek3") private String exudateOdorWeek3;
	 * 
	 * @Column(name = "exudateOdorWeek4") private String exudateOdorWeek4;
	 */

	@Column(name = "turningScheduleWeek1")
	private String turningScheduleWeek1;

	/*
	 * @Column(name = "turningScheduleWeek2") private String
	 * turningScheduleWeek2;
	 * 
	 * @Column(name = "turningScheduleWeek3") private String
	 * turningScheduleWeek3;
	 * 
	 * @Column(name = "turningScheduleWeek4") private String
	 * turningScheduleWeek4;
	 */

	@Column(name = "specialBedWeek1")
	private String specialBedWeek1;

	/*
	 * @Column(name = "specialBedWeek2") private String specialBedWeek2;
	 * 
	 * @Column(name = "specialBedWeek3") private String specialBedWeek3;
	 * 
	 * @Column(name = "specialBedWeek4") private String specialBedWeek4;
	 */

	@Column(name = "pressureRelievingDeviceWeek1")
	private String pressureRelievingDeviceWeek1;

	/*
	 * @Column(name = "pressureRelievingDeviceWeek2") private String
	 * pressureRelievingDeviceWeek2;
	 * 
	 * @Column(name = "pressureRelievingDeviceWeek3") private String
	 * pressureRelievingDeviceWeek3;
	 * 
	 * @Column(name = "pressureRelievingDeviceWeek4") private String
	 * pressureRelievingDeviceWeek4;
	 */

	@Column(name = "treatmentOrderDateWeek1")
	private Date treatmentOrderDateWeek1;

	/*
	 * @Column(name = "treatmentOrderDateWeek2") private Date
	 * treatmentOrderDateWeek2;
	 * 
	 * @Column(name = "treatmentOrderDateWeek3") private Date
	 * treatmentOrderDateWeek3;
	 * 
	 * @Column(name = "treatmentOrderDateWeek4") private Date
	 * treatmentOrderDateWeek4;
	 */

	@Column(name = "supplementWeek1")
	private String supplementWeek1;

	/*
	 * @Column(name = "supplementWeek2") private String supplementWeek2;
	 * 
	 * @Column(name = "supplementWeek3") private String supplementWeek3;
	 * 
	 * @Column(name = "supplementWeek4") private String supplementWeek4;
	 */

	@Column(name = "appetiteFluidIntakeWeek1")
	private String appetiteFluidIntakeWeek1;

	/*
	 * @Column(name = "appetiteFluidIntakeWeek2") private String
	 * appetiteFluidIntakeWeek2;
	 * 
	 * @Column(name = "appetiteFluidIntakeWeek3") private String
	 * appetiteFluidIntakeWeek3;
	 * 
	 * @Column(name = "appetiteFluidIntakeWeek4") private String
	 * appetiteFluidIntakeWeek4;
	 */

	@Column(name = "painManagementWeek1")
	private String painManagementWeek1;

	/*
	 * @Column(name = "painManagementWeek2") private String painManagementWeek2;
	 * 
	 * @Column(name = "painManagementWeek3") private String painManagementWeek3;
	 * 
	 * @Column(name = "painManagementWeek4") private String painManagementWeek4;
	 */

	@Column(name = "treatmentRecommedationWeek1")
	private String treatmentRecommedationWeek1;

	/*
	 * @Column(name = "treatmentRecommedationWeek2") private String
	 * treatmentRecommedationWeek2;
	 * 
	 * @Column(name = "treatmentRecommedationWeek3") private String
	 * treatmentRecommedationWeek3;
	 * 
	 * @Column(name = "treatmentRecommedationWeek4") private String
	 * treatmentRecommedationWeek4;
	 */

	/* TODO new master table for wound assessment has to be created */

	@Column(name = "FormName")
	private String formName;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "createdBy")
	private Users user;

	@Column(name = "dateOfCreation")
	private Date dateOfCreation;

	public boolean isPressure() {
		return pressure;
	}

	public void setPressure(boolean pressure) {
		this.pressure = pressure;
	}

	public boolean isVenous() {
		return venous;
	}

	public void setVenous(boolean venous) {
		this.venous = venous;
	}

	public boolean isSx() {
		return sx;
	}

	public void setSx(boolean sx) {
		this.sx = sx;
	}

	public boolean isSkinTear() {
		return skinTear;
	}

	public void setSkinTear(boolean skinTear) {
		this.skinTear = skinTear;
	}

	public boolean isDiabetic() {
		return diabetic;
	}

	public void setDiabetic(boolean diabetic) {
		this.diabetic = diabetic;
	}

	public boolean isArterial() {
		return arterial;
	}

	public void setArterial(boolean arterial) {
		this.arterial = arterial;
	}

	public boolean isOthers() {
		return others;
	}

	public void setOthers(boolean others) {
		this.others = others;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

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

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getWoundLocation() {
		return woundLocation;
	}

	public void setWoundLocation(String woundLocation) {
		this.woundLocation = woundLocation;
	}

	public Date getIdentifiedDate() {
		return identifiedDate;
	}

	public void setIdentifiedDate(Date identifiedDate) {
		this.identifiedDate = identifiedDate;
	}

	public String getHospitalAcquired() {
		return hospitalAcquired;
	}

	public void setHospitalAcquired(String hospitalAcquired) {
		this.hospitalAcquired = hospitalAcquired;
	}

	public String getFacilityAcquired() {
		return facilityAcquired;
	}

	public void setFacilityAcquired(String facilityAcquired) {
		this.facilityAcquired = facilityAcquired;
	}

	public String getCurrentApperanceWeek1() {
		return currentApperanceWeek1;
	}

	public void setCurrentApperanceWeek1(String currentApperanceWeek1) {
		this.currentApperanceWeek1 = currentApperanceWeek1;
	}

	/*
	 * public String getCurrentApperanceWeek2() { return currentApperanceWeek2;
	 * } public void setCurrentApperanceWeek2(String currentApperanceWeek2) {
	 * this.currentApperanceWeek2 = currentApperanceWeek2; } public String
	 * getCurrentApperanceWeek3() { return currentApperanceWeek3; } public void
	 * setCurrentApperanceWeek3(String currentApperanceWeek3) {
	 * this.currentApperanceWeek3 = currentApperanceWeek3; } public String
	 * getCurrentApperanceWeek4() { return currentApperanceWeek4; } public void
	 * setCurrentApperanceWeek4(String currentApperanceWeek4) {
	 * this.currentApperanceWeek4 = currentApperanceWeek4; }
	 */
	public String getStageWeek1() {
		return stageWeek1;
	}

	public void setStageWeek1(String stageWeek1) {
		this.stageWeek1 = stageWeek1;
	}

	/*
	 * public String getStageWeek2() { return stageWeek2; } public void
	 * setStageWeek2(String stageWeek2) { this.stageWeek2 = stageWeek2; } public
	 * String getStageWeek3() { return stageWeek3; } public void
	 * setStageWeek3(String stageWeek3) { this.stageWeek3 = stageWeek3; } public
	 * String getStageWeek4() { return stageWeek4; } public void
	 * setStageWeek4(String stageWeek4) { this.stageWeek4 = stageWeek4; }
	 */
	public String getLengthWeek1() {
		return lengthWeek1;
	}

	public void setLengthWeek1(String lengthWeek1) {
		this.lengthWeek1 = lengthWeek1;
	}

	/*
	 * public String getLengthWeek2() { return lengthWeek2; } public void
	 * setLengthWeek2(String lengthWeek2) { this.lengthWeek2 = lengthWeek2; }
	 * public String getLengthWeek3() { return lengthWeek3; } public void
	 * setLengthWeek3(String lengthWeek3) { this.lengthWeek3 = lengthWeek3; }
	 * public String getLengthWeek4() { return lengthWeek4; } public void
	 * setLengthWeek4(String lengthWeek4) { this.lengthWeek4 = lengthWeek4; }
	 */
	public String getWidthWeek1() {
		return widthWeek1;
	}

	public void setWidthWeek1(String widthWeek1) {
		this.widthWeek1 = widthWeek1;
	}

	/*
	 * public String getWidthWeek2() { return widthWeek2; } public void
	 * setWidthWeek2(String widthWeek2) { this.widthWeek2 = widthWeek2; } public
	 * String getWidthWeek3() { return widthWeek3; } public void
	 * setWidthWeek3(String widthWeek3) { this.widthWeek3 = widthWeek3; } public
	 * String getWidthWeek4() { return widthWeek4; } public void
	 * setWidthWeek4(String widthWeek4) { this.widthWeek4 = widthWeek4; }
	 */
	public String getDepthWeek1() {
		return depthWeek1;
	}

	public void setDepthWeek1(String depthWeek1) {
		this.depthWeek1 = depthWeek1;
	}

	/*
	 * public String getDepthWeek2() { return depthWeek2; } public void
	 * setDepthWeek2(String depthWeek2) { this.depthWeek2 = depthWeek2; } public
	 * String getDepthWeek3() { return depthWeek3; } public void
	 * setDepthWeek3(String depthWeek3) { this.depthWeek3 = depthWeek3; } public
	 * String getDepthWeek4() { return depthWeek4; } public void
	 * setDepthWeek4(String depthWeek4) { this.depthWeek4 = depthWeek4; }
	 */
	public String getTunnelling12Week1() {
		return tunnelling12Week1;
	}

	public void setTunnelling12Week1(String tunnelling12Week1) {
		this.tunnelling12Week1 = tunnelling12Week1;
	}

	public String getTunnelling3Week1() {
		return tunnelling3Week1;
	}

	public void setTunnelling3Week1(String tunnelling3Week1) {
		this.tunnelling3Week1 = tunnelling3Week1;
	}

	public String getTunnelling6Week1() {
		return tunnelling6Week1;
	}

	public void setTunnelling6Week1(String tunnelling6Week1) {
		this.tunnelling6Week1 = tunnelling6Week1;
	}

	public String getTunnelling9Week1() {
		return tunnelling9Week1;
	}

	public void setTunnelling9Week1(String tunnelling9Week1) {
		this.tunnelling9Week1 = tunnelling9Week1;
	}

	/*
	 * public String getTunnelling12Week2() { return tunnelling12Week2; } public
	 * void setTunnelling12Week2(String tunnelling12Week2) {
	 * this.tunnelling12Week2 = tunnelling12Week2; } public String
	 * getTunnelling3Week2() { return tunnelling3Week2; } public void
	 * setTunnelling3Week2(String tunnelling3Week2) { this.tunnelling3Week2 =
	 * tunnelling3Week2; } public String getTunnelling6Week2() { return
	 * tunnelling6Week2; } public void setTunnelling6Week2(String
	 * tunnelling6Week2) { this.tunnelling6Week2 = tunnelling6Week2; } public
	 * String getTunnelling9Week2() { return tunnelling9Week2; } public void
	 * setTunnelling9Week2(String tunnelling9Week2) { this.tunnelling9Week2 =
	 * tunnelling9Week2; } public String getTunnelling12Week3() { return
	 * tunnelling12Week3; } public void setTunnelling12Week3(String
	 * tunnelling12Week3) { this.tunnelling12Week3 = tunnelling12Week3; } public
	 * String getTunnelling3Week3() { return tunnelling3Week3; } public void
	 * setTunnelling3Week3(String tunnelling3Week3) { this.tunnelling3Week3 =
	 * tunnelling3Week3; } public String getTunnelling6Week3() { return
	 * tunnelling6Week3; } public void setTunnelling6Week3(String
	 * tunnelling6Week3) { this.tunnelling6Week3 = tunnelling6Week3; } public
	 * String getTunnelling9Week3() { return tunnelling9Week3; } public void
	 * setTunnelling9Week3(String tunnelling9Week3) { this.tunnelling9Week3 =
	 * tunnelling9Week3; } public String getTunnelling12Week4() { return
	 * tunnelling12Week4; } public void setTunnelling12Week4(String
	 * tunnelling12Week4) { this.tunnelling12Week4 = tunnelling12Week4; } public
	 * String getTunnelling3Week4() { return tunnelling3Week4; } public void
	 * setTunnelling3Week4(String tunnelling3Week4) { this.tunnelling3Week4 =
	 * tunnelling3Week4; } public String getTunnelling6Week4() { return
	 * tunnelling6Week4; } public void setTunnelling6Week4(String
	 * tunnelling6Week4) { this.tunnelling6Week4 = tunnelling6Week4; } public
	 * String getTunnelling9Week4() { return tunnelling9Week4; } public void
	 * setTunnelling9Week4(String tunnelling9Week4) { this.tunnelling9Week4 =
	 * tunnelling9Week4; }
	 */
	public String getUnderminingWeek1() {
		return underminingWeek1;
	}

	public void setUnderminingWeek1(String underminingWeek1) {
		this.underminingWeek1 = underminingWeek1;
	}

	/*
	 * public String getUnderminingWeek2() { return underminingWeek2; } public
	 * void setUnderminingWeek2(String underminingWeek2) { this.underminingWeek2
	 * = underminingWeek2; } public String getUnderminingWeek3() { return
	 * underminingWeek3; } public void setUnderminingWeek3(String
	 * underminingWeek3) { this.underminingWeek3 = underminingWeek3; } public
	 * String getUnderminingWeek4() { return underminingWeek4; } public void
	 * setUnderminingWeek4(String underminingWeek4) { this.underminingWeek4 =
	 * underminingWeek4; }
	 */
	public String getSloughNecrosisWeek1() {
		return sloughNecrosisWeek1;
	}

	public void setSloughNecrosisWeek1(String sloughNecrosisWeek1) {
		this.sloughNecrosisWeek1 = sloughNecrosisWeek1;
	}

	/*
	 * public String getSloughNecrosisWeek2() { return sloughNecrosisWeek2; }
	 * public void setSloughNecrosisWeek2(String sloughNecrosisWeek2) {
	 * this.sloughNecrosisWeek2 = sloughNecrosisWeek2; } public String
	 * getSloughNecrosisWeek3() { return sloughNecrosisWeek3; } public void
	 * setSloughNecrosisWeek3(String sloughNecrosisWeek3) {
	 * this.sloughNecrosisWeek3 = sloughNecrosisWeek3; } public String
	 * getSloughNecrosisWeek4() { return sloughNecrosisWeek4; } public void
	 * setSloughNecrosisWeek4(String sloughNecrosisWeek4) {
	 * this.sloughNecrosisWeek4 = sloughNecrosisWeek4; }
	 */
	public String getSloughColorWeek1() {
		return sloughColorWeek1;
	}

	public void setSloughColorWeek1(String sloughColorWeek1) {
		this.sloughColorWeek1 = sloughColorWeek1;
	}

	/*
	 * public String getSloughColorWeek2() { return sloughColorWeek2; } public
	 * void setSloughColorWeek2(String sloughColorWeek2) { this.sloughColorWeek2
	 * = sloughColorWeek2; } public String getSloughColorWeek3() { return
	 * sloughColorWeek3; } public void setSloughColorWeek3(String
	 * sloughColorWeek3) { this.sloughColorWeek3 = sloughColorWeek3; } public
	 * String getSloughColorWeek4() { return sloughColorWeek4; } public void
	 * setSloughColorWeek4(String sloughColorWeek4) { this.sloughColorWeek4 =
	 * sloughColorWeek4; }
	 */
	public String getInflamationWeek1() {
		return inflamationWeek1;
	}

	public void setInflamationWeek1(String inflamationWeek1) {
		this.inflamationWeek1 = inflamationWeek1;
	}

	/*
	 * public String getInflamationWeek2() { return inflamationWeek2; } public
	 * void setInflamationWeek2(String inflamationWeek2) { this.inflamationWeek2
	 * = inflamationWeek2; } public String getInflamationWeek3() { return
	 * inflamationWeek3; } public void setInflamationWeek3(String
	 * inflamationWeek3) { this.inflamationWeek3 = inflamationWeek3; } public
	 * String getInflamationWeek4() { return inflamationWeek4; } public void
	 * setInflamationWeek4(String inflamationWeek4) { this.inflamationWeek4 =
	 * inflamationWeek4; }
	 */
	public String getDrainageExudateTypeOfWeek1() {
		return drainageExudateTypeOfWeek1;
	}

	public void setDrainageExudateTypeOfWeek1(String drainageExudateTypeOfWeek1) {
		this.drainageExudateTypeOfWeek1 = drainageExudateTypeOfWeek1;
	}

	/*
	 * public String getDrainageExudateTypeOfWeek2() { return
	 * drainageExudateTypeOfWeek2; } public void
	 * setDrainageExudateTypeOfWeek2(String drainageExudateTypeOfWeek2) {
	 * this.drainageExudateTypeOfWeek2 = drainageExudateTypeOfWeek2; } public
	 * String getDrainageExudateTypeOfWeek3() { return
	 * drainageExudateTypeOfWeek3; } public void
	 * setDrainageExudateTypeOfWeek3(String drainageExudateTypeOfWeek3) {
	 * this.drainageExudateTypeOfWeek3 = drainageExudateTypeOfWeek3; } public
	 * String getDrainageExudateTypeOfWeek4() { return
	 * drainageExudateTypeOfWeek4; } public void
	 * setDrainageExudateTypeOfWeek4(String drainageExudateTypeOfWeek4) {
	 * this.drainageExudateTypeOfWeek4 = drainageExudateTypeOfWeek4; }
	 */
	public String getAmountOfExudateWeek1() {
		return amountOfExudateWeek1;
	}

	public void setAmountOfExudateWeek1(String amountOfExudateWeek1) {
		this.amountOfExudateWeek1 = amountOfExudateWeek1;
	}

	/*
	 * public String getAmountOfExudateWeek2() { return amountOfExudateWeek2; }
	 * public void setAmountOfExudateWeek2(String amountOfExudateWeek2) {
	 * this.amountOfExudateWeek2 = amountOfExudateWeek2; } public String
	 * getAmountOfExudateWeek3() { return amountOfExudateWeek3; } public void
	 * setAmountOfExudateWeek3(String amountOfExudateWeek3) {
	 * this.amountOfExudateWeek3 = amountOfExudateWeek3; } public String
	 * getAmountOfExudateWeek4() { return amountOfExudateWeek4; } public void
	 * setAmountOfExudateWeek4(String amountOfExudateWeek4) {
	 * this.amountOfExudateWeek4 = amountOfExudateWeek4; }
	 */
	public String getExudateOdorWeek1() {
		return exudateOdorWeek1;
	}

	public void setExudateOdorWeek1(String exudateOdorWeek1) {
		this.exudateOdorWeek1 = exudateOdorWeek1;
	}

	/*
	 * public String getExudateOdorWeek2() { return exudateOdorWeek2; } public
	 * void setExudateOdorWeek2(String exudateOdorWeek2) { this.exudateOdorWeek2
	 * = exudateOdorWeek2; } public String getExudateOdorWeek3() { return
	 * exudateOdorWeek3; } public void setExudateOdorWeek3(String
	 * exudateOdorWeek3) { this.exudateOdorWeek3 = exudateOdorWeek3; } public
	 * String getExudateOdorWeek4() { return exudateOdorWeek4; } public void
	 * setExudateOdorWeek4(String exudateOdorWeek4) { this.exudateOdorWeek4 =
	 * exudateOdorWeek4; }
	 */
	public String getTurningScheduleWeek1() {
		return turningScheduleWeek1;
	}

	public void setTurningScheduleWeek1(String turningScheduleWeek1) {
		this.turningScheduleWeek1 = turningScheduleWeek1;
	}

	/*
	 * public String getTurningScheduleWeek2() { return turningScheduleWeek2; }
	 * public void setTurningScheduleWeek2(String turningScheduleWeek2) {
	 * this.turningScheduleWeek2 = turningScheduleWeek2; } public String
	 * getTurningScheduleWeek3() { return turningScheduleWeek3; } public void
	 * setTurningScheduleWeek3(String turningScheduleWeek3) {
	 * this.turningScheduleWeek3 = turningScheduleWeek3; } public String
	 * getTurningScheduleWeek4() { return turningScheduleWeek4; } public void
	 * setTurningScheduleWeek4(String turningScheduleWeek4) {
	 * this.turningScheduleWeek4 = turningScheduleWeek4; }
	 */
	public String getSpecialBedWeek1() {
		return specialBedWeek1;
	}

	public void setSpecialBedWeek1(String specialBedWeek1) {
		this.specialBedWeek1 = specialBedWeek1;
	}

	/*
	 * public String getSpecialBedWeek2() { return specialBedWeek2; } public
	 * void setSpecialBedWeek2(String specialBedWeek2) { this.specialBedWeek2 =
	 * specialBedWeek2; } public String getSpecialBedWeek3() { return
	 * specialBedWeek3; } public void setSpecialBedWeek3(String specialBedWeek3)
	 * { this.specialBedWeek3 = specialBedWeek3; } public String
	 * getSpecialBedWeek4() { return specialBedWeek4; } public void
	 * setSpecialBedWeek4(String specialBedWeek4) { this.specialBedWeek4 =
	 * specialBedWeek4; }
	 */
	public String getPressureRelievingDeviceWeek1() {
		return pressureRelievingDeviceWeek1;
	}

	public void setPressureRelievingDeviceWeek1(
			String pressureRelievingDeviceWeek1) {
		this.pressureRelievingDeviceWeek1 = pressureRelievingDeviceWeek1;
	}

	/*
	 * public String getPressureRelievingDeviceWeek2() { return
	 * pressureRelievingDeviceWeek2; } public void
	 * setPressureRelievingDeviceWeek2(String pressureRelievingDeviceWeek2) {
	 * this.pressureRelievingDeviceWeek2 = pressureRelievingDeviceWeek2; }
	 * public String getPressureRelievingDeviceWeek3() { return
	 * pressureRelievingDeviceWeek3; } public void
	 * setPressureRelievingDeviceWeek3(String pressureRelievingDeviceWeek3) {
	 * this.pressureRelievingDeviceWeek3 = pressureRelievingDeviceWeek3; }
	 * public String getPressureRelievingDeviceWeek4() { return
	 * pressureRelievingDeviceWeek4; } public void
	 * setPressureRelievingDeviceWeek4(String pressureRelievingDeviceWeek4) {
	 * this.pressureRelievingDeviceWeek4 = pressureRelievingDeviceWeek4; }
	 */
	public Date getTreatmentOrderDateWeek1() {
		return treatmentOrderDateWeek1;
	}

	public void setTreatmentOrderDateWeek1(Date treatmentOrderDateWeek1) {
		this.treatmentOrderDateWeek1 = treatmentOrderDateWeek1;
	}

	/*
	 * public Date getTreatmentOrderDateWeek2() { return
	 * treatmentOrderDateWeek2; } public void setTreatmentOrderDateWeek2(Date
	 * treatmentOrderDateWeek2) { this.treatmentOrderDateWeek2 =
	 * treatmentOrderDateWeek2; } public Date getTreatmentOrderDateWeek3() {
	 * return treatmentOrderDateWeek3; } public void
	 * setTreatmentOrderDateWeek3(Date treatmentOrderDateWeek3) {
	 * this.treatmentOrderDateWeek3 = treatmentOrderDateWeek3; } public Date
	 * getTreatmentOrderDateWeek4() { return treatmentOrderDateWeek4; } public
	 * void setTreatmentOrderDateWeek4(Date treatmentOrderDateWeek4) {
	 * this.treatmentOrderDateWeek4 = treatmentOrderDateWeek4; }
	 */
	public String getSupplementWeek1() {
		return supplementWeek1;
	}

	public void setSupplementWeek1(String supplementWeek1) {
		this.supplementWeek1 = supplementWeek1;
	}

	/*
	 * public String getSupplementWeek2() { return supplementWeek2; } public
	 * void setSupplementWeek2(String supplementWeek2) { this.supplementWeek2 =
	 * supplementWeek2; } public String getSupplementWeek3() { return
	 * supplementWeek3; } public void setSupplementWeek3(String supplementWeek3)
	 * { this.supplementWeek3 = supplementWeek3; } public String
	 * getSupplementWeek4() { return supplementWeek4; } public void
	 * setSupplementWeek4(String supplementWeek4) { this.supplementWeek4 =
	 * supplementWeek4; }
	 */
	public String getAppetiteFluidIntakeWeek1() {
		return appetiteFluidIntakeWeek1;
	}

	public void setAppetiteFluidIntakeWeek1(String appetiteFluidIntakeWeek1) {
		this.appetiteFluidIntakeWeek1 = appetiteFluidIntakeWeek1;
	}

	/*
	 * public String getAppetiteFluidIntakeWeek2() { return
	 * appetiteFluidIntakeWeek2; } public void
	 * setAppetiteFluidIntakeWeek2(String appetiteFluidIntakeWeek2) {
	 * this.appetiteFluidIntakeWeek2 = appetiteFluidIntakeWeek2; } public String
	 * getAppetiteFluidIntakeWeek3() { return appetiteFluidIntakeWeek3; } public
	 * void setAppetiteFluidIntakeWeek3(String appetiteFluidIntakeWeek3) {
	 * this.appetiteFluidIntakeWeek3 = appetiteFluidIntakeWeek3; } public String
	 * getAppetiteFluidIntakeWeek4() { return appetiteFluidIntakeWeek4; } public
	 * void setAppetiteFluidIntakeWeek4(String appetiteFluidIntakeWeek4) {
	 * this.appetiteFluidIntakeWeek4 = appetiteFluidIntakeWeek4; }
	 */
	public String getPainManagementWeek1() {
		return painManagementWeek1;
	}

	public void setPainManagementWeek1(String painManagementWeek1) {
		this.painManagementWeek1 = painManagementWeek1;
	}

	/*
	 * public String getPainManagementWeek2() { return painManagementWeek2; }
	 * public void setPainManagementWeek2(String painManagementWeek2) {
	 * this.painManagementWeek2 = painManagementWeek2; } public String
	 * getPainManagementWeek3() { return painManagementWeek3; } public void
	 * setPainManagementWeek3(String painManagementWeek3) {
	 * this.painManagementWeek3 = painManagementWeek3; } public String
	 * getPainManagementWeek4() { return painManagementWeek4; } public void
	 * setPainManagementWeek4(String painManagementWeek4) {
	 * this.painManagementWeek4 = painManagementWeek4; }
	 */
	public String getTreatmentRecommedationWeek1() {
		return treatmentRecommedationWeek1;
	}

	public void setTreatmentRecommedationWeek1(
			String treatmentRecommedationWeek1) {
		this.treatmentRecommedationWeek1 = treatmentRecommedationWeek1;
	}
	/*
	 * public String getTreatmentRecommedationWeek2() { return
	 * treatmentRecommedationWeek2; } public void
	 * setTreatmentRecommedationWeek2(String treatmentRecommedationWeek2) {
	 * this.treatmentRecommedationWeek2 = treatmentRecommedationWeek2; } public
	 * String getTreatmentRecommedationWeek3() { return
	 * treatmentRecommedationWeek3; } public void
	 * setTreatmentRecommedationWeek3(String treatmentRecommedationWeek3) {
	 * this.treatmentRecommedationWeek3 = treatmentRecommedationWeek3; } public
	 * String getTreatmentRecommedationWeek4() { return
	 * treatmentRecommedationWeek4; } public void
	 * setTreatmentRecommedationWeek4(String treatmentRecommedationWeek4) {
	 * this.treatmentRecommedationWeek4 = treatmentRecommedationWeek4; }
	 */

}

package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianInfusion")
public class PhysicianInfusion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4334798033676731844L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "venousOpen")
	private boolean venousOpen;
	@Column(name = "centralOpen")
	private boolean centralOpen;
	@Column(name = "midlineOpen")
	private boolean midlineOpen;
	@Column(name = "nurseSign")
	private String nurseSign;
	@Column(name = "physicianSign")
	private String physicianSign;
	@Column(name = "venousContinuous")
	private boolean venousContinuous;
	@Column(name = "venousMaintenance")
	private boolean venousMaintenance;
	@Column(name = "centralContinuous")
	private boolean centralContinuous;
	@Column(name = "venousClosedTip")
	private boolean venousClosedTip;
	@Column(name = "venousPort")
	private boolean venousPort;
	@Column(name = "centralIntermittent")
	private boolean centralIntermittent;
	@Column(name = "centralMaintenance")
	private boolean centralMaintenance;
	@Column(name = "centralClosedTip")
	private boolean centralClosedTip;
	@Column(name = "central")
	private boolean central;
	@Column(name = "midlineIntermittent")
	private boolean midlineIntermittent;
	@Column(name = "midlineContinuous")
	private boolean midlineContinuous;
	@Column(name = "midlineMaintenance")
	private boolean midlineMaintenance;
	@Column(name = "midlineClosedTip")
	private boolean midlineClosedTip;
	@Column(name = "midline")
	private boolean midline;
	@Column(name = "peripheralIntermittent")
	private boolean peripheralIntermittent;
	@Column(name = "peripheralContinuous")
	private boolean peripheralContinuous;
	@Column(name = "nurseTime")
	private String nurseTime;
	@Column(name = "physicianTime")
	private String physicianTime;
	@Column(name = "nurseDate")
	private Date nurseDate;
	@Column(name = "physicianDate")
	private Date physicianDate;
	@Column(name = "venousDate")
	private Date venousDate;
	@Column(name = "venousIntermittent")
	private boolean venousIntermittent;
	@Column(name = "plcc")
	private boolean plcc;
	@Column(name = "peripheralMaintenance")
	private boolean peripheralMaintenance;
	@Column(name = "peripheralCatheter")
	private boolean peripheralCatheter;
	@Column(name = "externalEveryweek")
	private boolean externalEveryweek;
	@Column(name = "midlineEveryweek")
	private boolean midlineEveryweek;
	@Column(name = "midlinePost")
	private boolean midlinePost;
	@Column(name = "timeMedication")
	private String timeMedication;
	@Column(name = "newPatientDate")
	private Date newPatientDate;
	@Column(name = "lenghtTherapy")
	private String lenghtTherapy;
	@Column(name = "administerPush")
	private boolean administerPush;
	@Column(name = "administerGravity")
	private boolean administerGravity;
	@Column(name = "administerFlow")
	private boolean administerFlow;
	@Column(name = "administerPump")
	private boolean administerPump;
	@Column(name = "firstDose")
	private boolean firstDose;
	@Column(name = "anaphylaxis")
	private String anaphylaxis;
	@Column(name = "medicationOrSol")
	private String medicationOrSol;
	@Column(name = "newOrder")
	private boolean newOrder;
	@Column(name = "reAdmission")
	private boolean reAdmission;
	@Column(name = "newAdmission")
	private boolean newAdmission;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "verbal")
	private boolean verbal;
	@Column(name = "telephoneOrder")
	private boolean telephoneOrder;
	@Column(name = "orderingPhysician")
	private String orderingPhysician;
	@Column(name = "socialSecurity")
	private String socialSecurity;
	@Column(name = "payerCAID")
	private boolean payerCAID;
	@Column(name = "payerPVT")
	private boolean payerPVT;
	@Column(name = "payerManaged")
	private boolean payerManaged;
	@Column(name = "payerMedD")
	private boolean payerMedD;
	@Column(name = "payerMedA")
	private boolean payerMedA;
	@Column(name = "patientDate")
	private Date patientDate;
	@Column(name = "roomNo")
	private String roomNo;
	@Column(name = "patientBirthDate")
	private Date patientBirthDate;
	@Column(name = "patientName")
	private String patientName;

	public boolean isVenousOpen() {
		return this.venousOpen;
	}

	public void setVenousOpen(boolean venousOpen) {
		this.venousOpen = venousOpen;
	}

	public boolean isCentralOpen() {
		return this.centralOpen;
	}

	public void setCentralOpen(boolean centralOpen) {
		this.centralOpen = centralOpen;
	}

	public boolean isMidlineOpen() {
		return this.midlineOpen;
	}

	public void setMidlineOpen(boolean midlineOpen) {
		this.midlineOpen = midlineOpen;
	}

	public String getNurseSign() {
		return this.nurseSign;
	}

	public void setNurseSign(String nurseSign) {
		this.nurseSign = nurseSign;
	}

	public String getPhysicianSign() {
		return this.physicianSign;
	}

	public void setPhysicianSign(String physicianSign) {
		this.physicianSign = physicianSign;
	}

	public boolean isVenousContinuous() {
		return this.venousContinuous;
	}

	public void setVenousContinuous(boolean venousContinuous) {
		this.venousContinuous = venousContinuous;
	}

	public boolean isVenousMaintenance() {
		return this.venousMaintenance;
	}

	public void setVenousMaintenance(boolean venousMaintenance) {
		this.venousMaintenance = venousMaintenance;
	}

	public boolean isCentralContinuous() {
		return this.centralContinuous;
	}

	public void setCentralContinuous(boolean centralContinuous) {
		this.centralContinuous = centralContinuous;
	}

	public boolean isVenousClosedTip() {
		return this.venousClosedTip;
	}

	public void setVenousClosedTip(boolean venousClosedTip) {
		this.venousClosedTip = venousClosedTip;
	}

	public boolean isVenousPort() {
		return this.venousPort;
	}

	public void setVenousPort(boolean venousPort) {
		this.venousPort = venousPort;
	}

	public boolean isCentralIntermittent() {
		return this.centralIntermittent;
	}

	public void setCentralIntermittent(boolean centralIntermittent) {
		this.centralIntermittent = centralIntermittent;
	}

	public boolean isCentralMaintenance() {
		return this.centralMaintenance;
	}

	public void setCentralMaintenance(boolean centralMaintenance) {
		this.centralMaintenance = centralMaintenance;
	}

	public boolean isCentralClosedTip() {
		return this.centralClosedTip;
	}

	public void setCentralClosedTip(boolean centralClosedTip) {
		this.centralClosedTip = centralClosedTip;
	}

	public boolean isCentral() {
		return this.central;
	}

	public void setCentral(boolean central) {
		this.central = central;
	}

	public boolean isMidlineIntermittent() {
		return this.midlineIntermittent;
	}

	public void setMidlineIntermittent(boolean midlineIntermittent) {
		this.midlineIntermittent = midlineIntermittent;
	}

	public boolean isMidlineContinuous() {
		return this.midlineContinuous;
	}

	public void setMidlineContinuous(boolean midlineContinuous) {
		this.midlineContinuous = midlineContinuous;
	}

	public boolean isMidlineMaintenance() {
		return this.midlineMaintenance;
	}

	public void setMidlineMaintenance(boolean midlineMaintenance) {
		this.midlineMaintenance = midlineMaintenance;
	}

	public boolean isMidlineClosedTip() {
		return this.midlineClosedTip;
	}

	public void setMidlineClosedTip(boolean midlineClosedTip) {
		this.midlineClosedTip = midlineClosedTip;
	}

	public boolean isMidline() {
		return this.midline;
	}

	public void setMidline(boolean midline) {
		this.midline = midline;
	}

	public boolean isPeripheralIntermittent() {
		return this.peripheralIntermittent;
	}

	public void setPeripheralIntermittent(boolean peripheralIntermittent) {
		this.peripheralIntermittent = peripheralIntermittent;
	}

	public boolean isPeripheralContinuous() {
		return this.peripheralContinuous;
	}

	public void setPeripheralContinuous(boolean peripheralContinuous) {
		this.peripheralContinuous = peripheralContinuous;
	}

	public String getNurseTime() {
		return this.nurseTime;
	}

	public void setNurseTime(String nurseTime) {
		this.nurseTime = nurseTime;
	}

	public String getPhysicianTime() {
		return this.physicianTime;
	}

	public void setPhysicianTime(String physicianTime) {
		this.physicianTime = physicianTime;
	}

	public Date getNurseDate() {
		return this.nurseDate;
	}

	public void setNurseDate(Date nurseDate) {
		this.nurseDate = nurseDate;
	}

	public Date getPhysicianDate() {
		return this.physicianDate;
	}

	public void setPhysicianDate(Date physicianDate) {
		this.physicianDate = physicianDate;
	}

	public Date getVenousDate() {
		return this.venousDate;
	}

	public void setVenousDate(Date venousDate) {
		this.venousDate = venousDate;
	}

	public boolean isVenousIntermittent() {
		return this.venousIntermittent;
	}

	public void setVenousIntermittent(boolean venousIntermittent) {
		this.venousIntermittent = venousIntermittent;
	}

	public boolean isPlcc() {
		return this.plcc;
	}

	public void setPlcc(boolean plcc) {
		this.plcc = plcc;
	}

	public boolean isPeripheralMaintenance() {
		return this.peripheralMaintenance;
	}

	public void setPeripheralMaintenance(boolean peripheralMaintenance) {
		this.peripheralMaintenance = peripheralMaintenance;
	}

	public boolean isPeripheralCatheter() {
		return this.peripheralCatheter;
	}

	public void setPeripheralCatheter(boolean peripheralCatheter) {
		this.peripheralCatheter = peripheralCatheter;
	}

	public boolean isExternalEveryweek() {
		return this.externalEveryweek;
	}

	public void setExternalEveryweek(boolean externalEveryweek) {
		this.externalEveryweek = externalEveryweek;
	}

	public boolean isMidlineEveryweek() {
		return this.midlineEveryweek;
	}

	public void setMidlineEveryweek(boolean midlineEveryweek) {
		this.midlineEveryweek = midlineEveryweek;
	}

	public boolean isMidlinePost() {
		return this.midlinePost;
	}

	public void setMidlinePost(boolean midlinePost) {
		this.midlinePost = midlinePost;
	}

	public String getTimeMedication() {
		return this.timeMedication;
	}

	public void setTimeMedication(String timeMedication) {
		this.timeMedication = timeMedication;
	}

	public Date getNewPatientDate() {
		return this.newPatientDate;
	}

	public void setNewPatientDate(Date newPatientDate) {
		this.newPatientDate = newPatientDate;
	}

	public String getLenghtTherapy() {
		return this.lenghtTherapy;
	}

	public void setLenghtTherapy(String lenghtTherapy) {
		this.lenghtTherapy = lenghtTherapy;
	}

	public boolean isAdministerPush() {
		return this.administerPush;
	}

	public void setAdministerPush(boolean administerPush) {
		this.administerPush = administerPush;
	}

	public boolean isAdministerGravity() {
		return this.administerGravity;
	}

	public void setAdministerGravity(boolean administerGravity) {
		this.administerGravity = administerGravity;
	}

	public boolean isAdministerFlow() {
		return this.administerFlow;
	}

	public void setAdministerFlow(boolean administerFlow) {
		this.administerFlow = administerFlow;
	}

	public boolean isAdministerPump() {
		return this.administerPump;
	}

	public void setAdministerPump(boolean administerPump) {
		this.administerPump = administerPump;
	}

	public boolean isFirstDose() {
		return this.firstDose;
	}

	public void setFirstDose(boolean firstDose) {
		this.firstDose = firstDose;
	}

	public String getAnaphylaxis() {
		return this.anaphylaxis;
	}

	public void setAnaphylaxis(String anaphylaxis) {
		this.anaphylaxis = anaphylaxis;
	}

	public String getMedicationOrSol() {
		return this.medicationOrSol;
	}

	public void setMedicationOrSol(String medicationOrSol) {
		this.medicationOrSol = medicationOrSol;
	}

	public boolean isNewOrder() {
		return this.newOrder;
	}

	public void setNewOrder(boolean newOrder) {
		this.newOrder = newOrder;
	}

	public boolean isReAdmission() {
		return this.reAdmission;
	}

	public void setReAdmission(boolean reAdmission) {
		this.reAdmission = reAdmission;
	}

	public boolean isNewAdmission() {
		return this.newAdmission;
	}

	public void setNewAdmission(boolean newAdmission) {
		this.newAdmission = newAdmission;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getAllergies() {
		return this.allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public boolean isVerbal() {
		return this.verbal;
	}

	public void setVerbal(boolean verbal) {
		this.verbal = verbal;
	}

	public boolean isTelephoneOrder() {
		return this.telephoneOrder;
	}

	public void setTelephoneOrder(boolean telephoneOrder) {
		this.telephoneOrder = telephoneOrder;
	}

	public String getOrderingPhysician() {
		return this.orderingPhysician;
	}

	public void setOrderingPhysician(String orderingPhysician) {
		this.orderingPhysician = orderingPhysician;
	}

	public String getSocialSecurity() {
		return this.socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public boolean isPayerCAID() {
		return this.payerCAID;
	}

	public void setPayerCAID(boolean payerCAID) {
		this.payerCAID = payerCAID;
	}

	public boolean isPayerPVT() {
		return this.payerPVT;
	}

	public void setPayerPVT(boolean payerPVT) {
		this.payerPVT = payerPVT;
	}

	public boolean isPayerManaged() {
		return this.payerManaged;
	}

	public void setPayerManaged(boolean payerManaged) {
		this.payerManaged = payerManaged;
	}

	public boolean isPayerMedD() {
		return this.payerMedD;
	}

	public void setPayerMedD(boolean payerMedD) {
		this.payerMedD = payerMedD;
	}

	public boolean isPayerMedA() {
		return this.payerMedA;
	}

	public void setPayerMedA(boolean payerMedA) {
		this.payerMedA = payerMedA;
	}

	public Date getPatientDate() {
		return this.patientDate;
	}

	public void setPatientDate(Date patientDate) {
		this.patientDate = patientDate;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Date getPatientBirthDate() {
		return this.patientBirthDate;
	}

	public void setPatientBirthDate(Date patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

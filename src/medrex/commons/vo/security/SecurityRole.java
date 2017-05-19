package medrex.commons.vo.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "SecurityRole")
public class SecurityRole implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "name")
	private String name;
	@Column(name = "accessCNA")
	private int accessCNA;
	@Column(name = "accessCareLog")
	private int accessCareLog;
	@Column(name = "accessMedicationCart")
	private int accessMedicationCart;
	@Column(name = "accessReports")
	private int accessReports;
	@Column(name = "accessProviders")
	private int accessProviders;
	@Column(name = "accessCensus")
	private int accessCensus;
	@Column(name = "accessAdmissionRecords")
	private int accessAdmissionRecords;
	@Column(name = "accessActivity")
	private int accessActivity;
	@Column(name = "accessMedicationTreatment")
	private int accessMedicationTreatment;
	@Column(name = "accessDietary")
	private int accessDietary;
	@Column(name = "accessConsultant")
	private int accessConsultant;
	@Column(name = "accessProgressNotes")
	private int accessProgressNotes;
	@Column(name = "accessLabSpecialReports")
	private int accessLabSpecialReports;
	@Column(name = "accessHistoryPhysical")
	private int accessHistoryPhysical;
	@Column(name = "accessPhysicianOrders")
	private int accessPhysicianOrders;
	@Column(name = "accessOtPtActSpeech")
	private int accessOtPtActSpeech;
	@Column(name = "accessMDS")
	private int accessMDS;
	@Column(name = "accessCarePlan")
	private int accessCarePlan;

	// suresh
	// Under Resident Information
	@Column(name = "accessResidentInfoAllergies")
	private int accessResidentInfoAllergies;
	@Column(name = "accessResidentInfoScheduling")
	private int accessResidentInfoScheduling;
	@Column(name = "accessResidentInfoVital")
	private int accessResidentInfoVital;
	@Column(name = "accessResidentInfoWeight")
	private int accessResidentInfoWeight;
	@Column(name = "accessResidentInfoWounds")
	private int accessResidentInfoWounds;
	@Column(name = "accessResidentInfoPersonalInfo")
	private int accessResidentInfoPersonalInfo;
	@Column(name = "accessResidentInfoPayerInfo")
	private int accessResidentInfoPayerInfo;
	@Column(name = "accessResidentInfoContactInfo")
	private int accessResidentInfoContactInfo;
	@Column(name = "accessResidentInfoPhysicians")
	private int accessResidentInfoPhysicians;
	@Column(name = "accessResidentInfoProviders")
	private int accessResidentInfoProviders;
	@Column(name = "accessResidentInfoCensus")
	private int accessResidentInfoCensus;
	@Column(name = "accessResidentInfoDiagnosis")
	private int accessResidentInfoDiagnosis;
	@Column(name = "accessResidentInfoScan")
	private int accessResidentInfoScan;
	@Column(name = "accessResidentInfoRoom")
	private int accessResidentInfoRoom;

	// The rest of the Main Dashboard security Role
	@Column(name = "accessResident")
	private int accessResident;
	@Column(name = "accessUsers")
	private int accessUsers;
	@Column(name = "accessUserLogon")
	private int accessUserLogon;
	@Column(name = "accessMessages")
	private int accessMessages;
	@Column(name = "accessMasterlist")
	private int accessMasterlist;
	@Column(name = "accessAdmin")
	private int accessAdmin;

	//

	@Column(name = "typeOfRole")
	private int typeOfRole;

	public int getTypeOfRole() {
		return typeOfRole;
	}

	public void setTypeOfRole(int typeOfRole) {
		this.typeOfRole = typeOfRole;
	}

	public int getAccessCarePlan() {
		return accessCarePlan;
	}

	public void setAccessCarePlan(int accessCarePlan) {
		this.accessCarePlan = accessCarePlan;
	}

	public int getAccessCensus() {
		return accessCensus;
	}

	public void setAccessCensus(int accessCensus) {
		this.accessCensus = accessCensus;
	}

	public int getAccessConsultant() {
		return accessConsultant;
	}

	public void setAccessConsultant(int accessConsultant) {
		this.accessConsultant = accessConsultant;
	}

	public int getAccessDietary() {
		return accessDietary;
	}

	public void setAccessDietary(int accessDietary) {
		this.accessDietary = accessDietary;
	}

	public int getAccessHistoryPhysical() {
		return accessHistoryPhysical;
	}

	public void setAccessHistoryPhysical(int accessHistoryPhysical) {
		this.accessHistoryPhysical = accessHistoryPhysical;
	}

	public int getAccessLabSpecialReports() {
		return accessLabSpecialReports;
	}

	public void setAccessLabSpecialReports(int accessLabSpecialReports) {
		this.accessLabSpecialReports = accessLabSpecialReports;
	}

	public int getAccessOtPtActSpeech() {
		return accessOtPtActSpeech;
	}

	public void setAccessOtPtActSpeech(int accessOtPtActSpeech) {
		this.accessOtPtActSpeech = accessOtPtActSpeech;
	}

	public int getAccessPhysicianOrders() {
		return accessPhysicianOrders;
	}

	public void setAccessPhysicianOrders(int accessPhysicianOrders) {
		this.accessPhysicianOrders = accessPhysicianOrders;
	}

	public int getAccessProgressNotes() {
		return accessProgressNotes;
	}

	public void setAccessProgressNotes(int accessProgressNotes) {
		this.accessProgressNotes = accessProgressNotes;
	}

	public int getAccessProviders() {
		return accessProviders;
	}

	public void setAccessProviders(int accessProviders) {
		this.accessProviders = accessProviders;
	}

	public int getAccessReports() {
		return accessReports;
	}

	public void setAccessReports(int accessReports) {
		this.accessReports = accessReports;
	}

	public int getAccessActivity() {
		return accessActivity;
	}

	public void setAccessActivity(int accessActivity) {
		this.accessActivity = accessActivity;
	}

	public int getAccessAdmissionRecords() {
		return accessAdmissionRecords;
	}

	public void setAccessAdmissionRecords(int accessAdmissionRecords) {
		this.accessAdmissionRecords = accessAdmissionRecords;
	}

	public int getAccessCareLog() {
		return accessCareLog;
	}

	public void setAccessCareLog(int accessCareLog) {
		this.accessCareLog = accessCareLog;
	}

	public int getAccessCNA() {
		return accessCNA;
	}

	public void setAccessCNA(int accessCNA) {
		this.accessCNA = accessCNA;
	}

	public int getAccessMDS() {
		return accessMDS;
	}

	public void setAccessMDS(int accessMDS) {
		this.accessMDS = accessMDS;
	}

	public int getAccessMedicationCart() {
		return accessMedicationCart;
	}

	public void setAccessMedicationCart(int accessMedication) {
		this.accessMedicationCart = accessMedication;
	}

	public int getAccessMedicationTreatment() {
		return accessMedicationTreatment;
	}

	public void setAccessMedicationTreatment(int accessMedicationTreatment) {
		this.accessMedicationTreatment = accessMedicationTreatment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getAccessResidentInfoAllergies() {
		return accessResidentInfoAllergies;
	}

	public void setAccessResidentInfoAllergies(int accessResidentInfoAllergies) {
		this.accessResidentInfoAllergies = accessResidentInfoAllergies;
	}

	public int getAccessResidentInfoScheduling() {
		return accessResidentInfoScheduling;
	}

	public void setAccessResidentInfoScheduling(int accessResidentInfoScheduling) {
		this.accessResidentInfoScheduling = accessResidentInfoScheduling;
	}

	public int getAccessResidentInfoVital() {
		return accessResidentInfoVital;
	}

	public void setAccessResidentInfoVital(int accessResidentInfoVital) {
		this.accessResidentInfoVital = accessResidentInfoVital;
	}

	public int getAccessResidentInfoWeight() {
		return accessResidentInfoWeight;
	}

	public void setAccessResidentInfoWeight(int accessResidentInfoWeight) {
		this.accessResidentInfoWeight = accessResidentInfoWeight;
	}

	public int getAccessResidentInfoWounds() {
		return accessResidentInfoWounds;
	}

	public void setAccessResidentInfoWounds(int accessResidentInfoWounds) {
		this.accessResidentInfoWounds = accessResidentInfoWounds;
	}

	public int getAccessResidentInfoPersonalInfo() {
		return accessResidentInfoPersonalInfo;
	}

	public void setAccessResidentInfoPersonalInfo(
			int accessResidentInfoPersonalInfo) {
		this.accessResidentInfoPersonalInfo = accessResidentInfoPersonalInfo;
	}

	public int getAccessResidentInfoPayerInfo() {
		return accessResidentInfoPayerInfo;
	}

	public void setAccessResidentInfoPayerInfo(int accessResidentInfoPayerInfo) {
		this.accessResidentInfoPayerInfo = accessResidentInfoPayerInfo;
	}

	public int getAccessResidentInfoContactInfo() {
		return accessResidentInfoContactInfo;
	}

	public void setAccessResidentInfoContactInfo(
			int accessResidentInfoContactInfo) {
		this.accessResidentInfoContactInfo = accessResidentInfoContactInfo;
	}

	public int getAccessResidentInfoPhysicians() {
		return accessResidentInfoPhysicians;
	}

	public void setAccessResidentInfoPhysicians(int accessResidentInfoPhysicians) {
		this.accessResidentInfoPhysicians = accessResidentInfoPhysicians;
	}

	public int getAccessResidentInfoProviders() {
		return accessResidentInfoProviders;
	}

	public void setAccessResidentInfoProviders(int accessResidentInfoProviders) {
		this.accessResidentInfoProviders = accessResidentInfoProviders;
	}

	public int getAccessResidentInfoCensus() {
		return accessResidentInfoCensus;
	}

	public void setAccessResidentInfoCensus(int accessResidentInfoCensus) {
		this.accessResidentInfoCensus = accessResidentInfoCensus;
	}

	public int getAccessResidentInfoDiagnosis() {
		return accessResidentInfoDiagnosis;
	}

	public void setAccessResidentInfoDiagnosis(int accessResidentInfoDiagnosis) {
		this.accessResidentInfoDiagnosis = accessResidentInfoDiagnosis;
	}

	public int getAccessResidentInfoScan() {
		return accessResidentInfoScan;
	}

	public void setAccessResidentInfoScan(int accessResidentInfoScan) {
		this.accessResidentInfoScan = accessResidentInfoScan;
	}

	public int getAccessResidentInfoRoom() {
		return accessResidentInfoRoom;
	}

	public void setAccessResidentInfoRoom(int accessResidentInfoRoom) {
		this.accessResidentInfoRoom = accessResidentInfoRoom;
	}

	public int getAccessResident() {
		return accessResident;
	}

	public void setAccessResident(int accessResident) {
		this.accessResident = accessResident;
	}

	public int getAccessUsers() {
		return accessUsers;
	}

	public void setAccessUsers(int accessUsers) {
		this.accessUsers = accessUsers;
	}

	public int getAccessUserLogon() {
		return accessUserLogon;
	}

	public void setAccessUserLogon(int accessUserLogon) {
		this.accessUserLogon = accessUserLogon;
	}

	public int getAccessMessages() {
		return accessMessages;
	}

	public void setAccessMessages(int accessMessages) {
		this.accessMessages = accessMessages;
	}

	public int getAccessMasterlist() {
		return accessMasterlist;
	}

	public void setAccessMasterlist(int accessMasterlist) {
		this.accessMasterlist = accessMasterlist;
	}

	public int getAccessAdmin() {
		return accessAdmin;
	}

	public void setAccessAdmin(int accessAdmin) {
		this.accessAdmin = accessAdmin;
	}

}

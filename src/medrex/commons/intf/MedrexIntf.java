package medrex.commons.intf;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;

import medrex.commons.dataObj.Rooms;
import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.activation.ActivationLicense;
import medrex.commons.vo.activity.ActivityAssessmentFormPage2;
import medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1;
import medrex.commons.vo.activity.ActivitysRecord;
import medrex.commons.vo.admin.AmbulationWeight;
import medrex.commons.vo.admin.Config;
import medrex.commons.vo.admin.DietList;
import medrex.commons.vo.admin.DietPlan;
import medrex.commons.vo.admin.FormSchedule;
import medrex.commons.vo.admin.MasterSchedule;
import medrex.commons.vo.admin.Medication;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.admin.PasswordSetting;
import medrex.commons.vo.admin.PendingForm;
import medrex.commons.vo.admin.Treatment;
import medrex.commons.vo.admin.TriggerWord;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.admission.AdmissionsRecord;
import medrex.commons.vo.admission.PainAssessment;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.admission.ResidentAssessmentFormPage10;
import medrex.commons.vo.admission.ResidentAssessmentFormPage11;
import medrex.commons.vo.admission.ResidentAssessmentFormPage12;
import medrex.commons.vo.admission.ResidentAssessmentFormPage13;
import medrex.commons.vo.admission.ResidentAssessmentFormPage14;
import medrex.commons.vo.admission.ResidentAssessmentFormPage15;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.admission.ResidentAssessmentFormPage17;
import medrex.commons.vo.admission.ResidentAssessmentFormPage18;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;
import medrex.commons.vo.admission.ResidentAssessmentFormPage2;
import medrex.commons.vo.admission.ResidentAssessmentFormPage20;
import medrex.commons.vo.admission.ResidentAssessmentFormPage21;
import medrex.commons.vo.admission.ResidentAssessmentFormPage22;
import medrex.commons.vo.admission.ResidentAssessmentFormPage3;
import medrex.commons.vo.admission.ResidentAssessmentFormPage4;
import medrex.commons.vo.admission.ResidentAssessmentFormPage5;
import medrex.commons.vo.admission.ResidentAssessmentFormPage6;
import medrex.commons.vo.admission.ResidentAssessmentFormPage7;
import medrex.commons.vo.admission.ResidentAssessmentFormPage8;
import medrex.commons.vo.admission.ResidentAssessmentFormPage9;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage7;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage8;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage9;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage1;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage2;
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;
import medrex.commons.vo.admission.analyzer.CarePlanValues;
import medrex.commons.vo.admission.smokers.AssessingResident1;
import medrex.commons.vo.admission.smokers.AssessingResident2;
import medrex.commons.vo.admission.smokers.AssessingResident3;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.AlertSetting;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.commons.vo.careLog.CareLog;
import medrex.commons.vo.careLog.CareLogMaster;
import medrex.commons.vo.carePlan.CarePlan;
import medrex.commons.vo.carePlan.CarePlanRecord;
import medrex.commons.vo.census.AdmissionFromHead;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusNotes;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.CensusStatusForResident;
import medrex.commons.vo.census.ResponsibleParty;
import medrex.commons.vo.census.SignOutTo;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.census.countAudit.CountAuditStatus;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.census.counts.Hospital;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.commons.vo.census.counts.SignOut;
import medrex.commons.vo.cna.CnaAdl;
import medrex.commons.vo.consultant.Consultant;
import medrex.commons.vo.consultant.PharmacistEvaluationReportForm;
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;
import medrex.commons.vo.consultant.ReferralForm;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage1;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage2;
import medrex.commons.vo.consultant.ReportOfConsultationForm;
import medrex.commons.vo.dashboard.Dashboard;
import medrex.commons.vo.dialysis.DialysisRecord;
import medrex.commons.vo.dietary.DietPlanByDate;
import medrex.commons.vo.dietary.Dietary;
import medrex.commons.vo.dietary.DietaryCommunicationForm;
import medrex.commons.vo.dietary.DietaryPlazaHealth;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;
import medrex.commons.vo.dietary.DietaryResidentDiagnosis;
import medrex.commons.vo.dietary.EnteralFeeding;
import medrex.commons.vo.dietary.NutritionSupportAssessmentFormPage1;
import medrex.commons.vo.formManager.FormPage;
import medrex.commons.vo.formManager.Tab;
import medrex.commons.vo.general.Icd9;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisForm;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysical;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage1;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage2;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetForm;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;
import medrex.commons.vo.historyAndPhysical.ResidentImmunizationRecord;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsForm;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;
import medrex.commons.vo.labSpecial.LabSpecial;
import medrex.commons.vo.labSpecial.MadexForm1;
import medrex.commons.vo.labSpecial.MadexForm2;
import medrex.commons.vo.labSpecial.ReasonForStudy;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.ProviderTypes;

import medrex.commons.vo.mds3.Mds3;
import medrex.commons.vo.medication.DailySkilledNursesNotes;
import medrex.commons.vo.medication.DailySkilledNursesNotesForm2;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;
import medrex.commons.vo.medication.MedicationAdministrationRecordForm;
import medrex.commons.vo.medication.MedicationAdministrationRecordFormCol;
import medrex.commons.vo.medication.MedicationNotes;
import medrex.commons.vo.medication.MedicationPRNRecordForm;
import medrex.commons.vo.medication.MedicationPRNRecordFormCol;
import medrex.commons.vo.medication.MedicationPRNRecordFormRow;
import medrex.commons.vo.medication.MedicationRoutineRecordForm;
import medrex.commons.vo.medication.MedicationRoutineRecordFormCol;
import medrex.commons.vo.medication.MedicationRoutineRecordFormRow;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;
import medrex.commons.vo.medication.NurseTreatmentNotesForm;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;
import medrex.commons.vo.medication.PainManagementRecordFormPage1;
import medrex.commons.vo.medication.PainManagementRecordRow;
import medrex.commons.vo.medication.PressureSoreAssessment;
import medrex.commons.vo.medication.PressureSoreRecordForm;
import medrex.commons.vo.medication.PressureSoreRecordFormRow;
import medrex.commons.vo.medication.Templates;
import medrex.commons.vo.medication.TreatmentPRNRecordForm;
import medrex.commons.vo.medication.TreatmentPRNRecordFormCol;
import medrex.commons.vo.medication.TreatmentPRNRecordFormRow;
import medrex.commons.vo.medication.TreatmentRoutineRecordForm;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormCol;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormRow;
import medrex.commons.vo.medicationCart.CalculatedMedication;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.medicationCart.Medications;
import medrex.commons.vo.medicationCart.PRNmedication;
import medrex.commons.vo.messageServer.MsgServer;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.monthlySummary.AdmissionAndDischargeSummary;
import medrex.commons.vo.monthlySummary.DietaryAlertSheet;
import medrex.commons.vo.monthlySummary.InfluenzaConsentForm;
import medrex.commons.vo.monthlySummary.InterDisciplinaryCarePlan;
import medrex.commons.vo.monthlySummary.InventoryPersonalEffect;
import medrex.commons.vo.monthlySummary.MSJN;
import medrex.commons.vo.monthlySummary.MonthlySummaryMainPage;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage1;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage2;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage3;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage4;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage5;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.monthlySummary.PhysicianProgressNotes;
import medrex.commons.vo.monthlySummary.ResidentCarePlan;
import medrex.commons.vo.monthlySummary.ResidentInformation;
import medrex.commons.vo.monthlySummary.ResidentStatusSheet;
import medrex.commons.vo.monthlySummary.ResidentTransferForm;
import medrex.commons.vo.monthlySummary.SkilledFlowSheet;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.nursesNotes.NursesNotesRecord;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.physicianOrders.PhysicianInfusion;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1Row;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2Row;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.commons.vo.physicianOrders.PhysicianPlazaHealthCare;
import medrex.commons.vo.physicianOrders.PhysicianSpeciality;
import medrex.commons.vo.physicianOrders.PhysicianSpecialityRow;
import medrex.commons.vo.physicianOrders.Prescription;
import medrex.commons.vo.physicianOrders.ProgressNotes2;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderConsultations;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiagnosticTests;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRespiratoryTherapy;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderSafetyPrecautions;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTherapyTest;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatment;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatmentTemp;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.RehabilitationRestrorative;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesForm;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesForm;
import medrex.commons.vo.progressNotes.ProgressNotes;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalDailyRecord;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalDailyRecord;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalTheray;
import medrex.commons.vo.ptOtSt.PtOtStPositioningEvaluation;
import medrex.commons.vo.ptOtSt.PtOtStRehabCarePlan;
import medrex.commons.vo.ptOtSt.PtOtStSpeechDailyRecord;
import medrex.commons.vo.ptOtSt.PtOtStSpeechLanguage;
import medrex.commons.vo.ptOtSt.PtOtStTherapyPhysical;
import medrex.commons.vo.ptOtSt.PtOtStTreatment;
import medrex.commons.vo.ra.RAFPg1;
import medrex.commons.vo.ra.RAFPg2;
import medrex.commons.vo.ra.RARecord;
import medrex.commons.vo.reports.Report;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentInfoGeneralPhone;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayer;
import medrex.commons.vo.resident.ResidentPayerNew;
import medrex.commons.vo.resident.ResidentVitalSigns;
import medrex.commons.vo.resident.ResidentWeight;
import medrex.commons.vo.resident.ResidentWeightBean;
import medrex.commons.vo.resident.RoomChange;
import medrex.commons.vo.resident.RoomHistory;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.commons.vo.richTextField.RichTextField;
import medrex.commons.vo.scan.ScanForm;
import medrex.commons.vo.schedule.Schedule;
import medrex.commons.vo.schedule.UserSchedule;
import medrex.commons.vo.scheduling.scheduling;
import medrex.commons.vo.security.SecurityRole;
import medrex.commons.vo.treatmentCart.TreatmentView;

public interface MedrexIntf extends Remote {

	public Date getDateOfServer() throws MedrexException, RemoteException;

	public int getMasterList(Class cls, String retrieveString)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException, RemoteException;

	/*
	 * public int insertOrUpdateRoomHistory(RoomHistory roomHistory) throws
	 * MedrexException, RemoteException;
	 */

	public int insertOrUpdateRoomHistory(TempRoomHistory roomHistory)
			throws MedrexException, RemoteException;

	public List<TempRoomHistory> getRoomHistory(Date from, Date to)
			throws MedrexException, RemoteException;

	public List<RoomHistory> getRoomHistory(int residentId)
			throws MedrexException, RemoteException;

	/*
	 * public RoomHistory getRoomHistory(int residentId, Date date) throws
	 * MedrexException, RemoteException ;
	 */

	public TempRoomHistory getRoomHistory(int residentId, Date date)
			throws MedrexException, RemoteException;

	public List<Rooms> getResidentCountAuditInfo(List<CountAuditFloor> records,
			Date searchDate) throws MedrexException, RemoteException;

	// public RoomHistory getLastRoomHistory(int residentId)
	// throws MedrexException, RemoteException;
	//	
	public TempRoomHistory getLastRoomHistory(int residentId)
			throws MedrexException, RemoteException;

	public TempRoomHistory getCurrentRoomForResident(int residentId)
			throws MedrexException, RemoteException;

	public List<TempRoomHistory> getRoomHistories(Date dateAndTime)
			throws MedrexException, RemoteException;

	public TempRoomHistory getRoomHistoriesForResident(int residentId,
			Date dateAndTime) throws MedrexException, RemoteException;

	public List<TempRoomHistory> getRoomHistoriesForResident(int residentId)
			throws MedrexException, RemoteException;

	public TempRoomHistory getRoomForResident(int residentId,
			Date currentDateAndTime) throws MedrexException, RemoteException;

	public List<Rooms> getRoomStatusForResidents(Date dateAndTime)
			throws MedrexException, RemoteException;

	public List<Rooms> getRoomStatusForResidents(Date dateAndTime,
			String floorType) throws MedrexException, RemoteException;

	public List getResidentMain() throws MedrexException, RemoteException;

	public List getResidentMain(String status) throws MedrexException,
			RemoteException;

	public List getResidents(String find, String firstName, String SS1,
			String status) throws MedrexException, RemoteException;

	public List getResidents(String floorType) throws MedrexException,
			RemoteException;

	public ResidentMain getResident(String lastName, String firstName,
			String SSN) throws MedrexException, RemoteException;

	public int updateInsuranceCount(int resId) throws MedrexException,
			RemoteException;

	public ResidentMain getResident(int serial) throws MedrexException,
			RemoteException;

	public boolean getResidentExistInHouse(int resientId)
			throws MedrexException, RemoteException;

	public List<Rooms> getFirstFloorResidents() throws MedrexException,
			RemoteException;

	public List<Rooms> getSecondFloorResidents() throws MedrexException,
			RemoteException;

	public List getFirstFloorResidents(Date date) throws MedrexException,
			RemoteException;

	public List getSecondFloorResidents(Date date) throws MedrexException,
			RemoteException;

	public List getOccupiedRoom() throws MedrexException, RemoteException;

	public int insertOrUpdateResidentPayer(ResidentPayer residentPayer)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentPayerNew(ResidentPayerNew residentPayerNew)
			throws MedrexException, RemoteException;

	public List getResidentPayers(int residentSerial) throws MedrexException,
			RemoteException;

	public List getResidentPayersNew(int residentSerial)
			throws MedrexException, RemoteException;

	public ResidentPayerNew getPayerInfoStatusNewByResidentId(
			ResidentMain residentId) throws MedrexException, RemoteException;

	public ResidentPayer getResidentPayer(int serial) throws MedrexException,
			RemoteException;

	public void deleteResidentPayer(int serial) throws MedrexException,
			RemoteException;

	public void deleteResidentPayerNew(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentContact(ResidentContact residentContact)
			throws MedrexException, RemoteException;

	public ResidentContact getResidentContact(String lastName, String firstName)
			throws MedrexException, RemoteException;

	public List getResidentContacts(int residentSerial) throws MedrexException,
			RemoteException;

	public List getResidentContactsWithSignature(int residentSerial)
			throws MedrexException, RemoteException;

	public List getResidentContactsWithSignature(int residentSerial,
			String likeStr) throws MedrexException, RemoteException;

	public List getResidentContacts(int residentSerial, String likeStr)
			throws MedrexException, RemoteException;

	public ResidentContact getResidentContact(int serial)
			throws MedrexException, RemoteException;

	public void deleteResidentContact(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentContactPhone(
			ResidentContactPhone residentContactPhone) throws MedrexException,
			RemoteException;

	public List getResidentContactPhones(int residentContactSerial)
			throws MedrexException, RemoteException;

	public ResidentContactPhone getResidentContactPhone(int serial)
			throws MedrexException, RemoteException;

	public ResidentContactPhone getResidentContactPhonePrimary(
			int residentContactSerial) throws MedrexException, RemoteException;

	public void deleteResidentContactPhone(int serial) throws MedrexException,
			RemoteException;

	public void deleteAllPhonesForContact(int residentContactSerial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateAdmissionsRecord(AdmissionsRecord residentPayer)
			throws MedrexException, RemoteException;

	public List getAdmissionsRecords(int residentSerial)
			throws MedrexException, RemoteException;

	public AdmissionsRecord getAdmissionsRecord(int serial)
			throws MedrexException, RemoteException;

	public void deleteAdmissionsRecord(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage1(
			ResidentAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException;

	public List getResidentAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage1 getResidentAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage2(
			ResidentAssessmentFormPage2 rafp2) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage2 getResidentAssessmentFormPage2(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage3(
			ResidentAssessmentFormPage3 rafp3) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage3 getResidentAssessmentFormPage3(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage3(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePressureSoreAssessment(PressureSoreAssessment psa)
			throws MedrexException, RemoteException;

	public PressureSoreAssessment getPressureSoreAssessment(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage4(
			ResidentAssessmentFormPage4 rafp4) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage4 getResidentAssessmentFormPage4(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage4(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage5(
			ResidentAssessmentFormPage5 rafp5) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage5 getResidentAssessmentFormPage5(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage5(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage6(
			ResidentAssessmentFormPage6 rafp6) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage6 getResidentAssessmentFormPage6(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage6(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage7(
			ResidentAssessmentFormPage7 rafp7) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage7 getResidentAssessmentFormPage7(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePainAssessment(PainAssessment painAssessment)
			throws MedrexException, RemoteException;

	public PainAssessment getPainAssessment(int formId, int formNum)
			throws MedrexException, RemoteException;

	public void deletePainAssessment(int formId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage8(
			ResidentAssessmentFormPage8 rafp8) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage8 getResidentAssessmentFormPage8(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage9(
			ResidentAssessmentFormPage9 rafp9) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage9 getResidentAssessmentFormPage9(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage10(
			ResidentAssessmentFormPage10 rafp10) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage10 getResidentAssessmentFormPage10(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage10(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage11(
			ResidentAssessmentFormPage11 rafp11) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage11 getResidentAssessmentFormPage11(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage11(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage12(
			ResidentAssessmentFormPage12 rafp12) throws MedrexException,
			RemoteException;

	public ResidentAssessmentFormPage12 getResidentAssessmentFormPage12(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage12(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage13(
			ResidentAssessmentFormPage13 rafp13) throws MedrexException,
			RemoteException;

	public List<ResidentAssessmentFormPage13> getResidentAssessmentFormPage13(
			int resdentId, int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage13(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage14(
			ResidentAssessmentFormPage14 residentAssessmentFormPage14)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage14 getResidentAssessmentFormPage14(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage14(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage15(
			ResidentAssessmentFormPage15 residentAssessmentFormPage15)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage15 getResidentAssessmentFormPage15(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage15(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage16(
			ResidentAssessmentFormPage16 residentAssessmentFormPage16)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage16(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage17(
			ResidentAssessmentFormPage17 residentAssessmentFormPage17)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage17 getResidentAssessmentFormPage17(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage17(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage18(
			ResidentAssessmentFormPage18 residentAssessmentFormPage18)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage18 getResidentAssessmentFormPage18(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage18(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage19(
			ResidentAssessmentFormPage19 refResidentAssessmentForm19)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage19(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage19Col(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage20(
			ResidentAssessmentFormPage20 refResidentAssessmentForm20)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage20 getResidentAssessmentFormPage20(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage20(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage21(
			ResidentAssessmentFormPage21 refResidentAssessmentFormPage21)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage21 getResidentAssessmentFormPage21(
			int currentResidentAssessmentFormPage21Key) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentAssessmentFormPage22(
			ResidentAssessmentFormPage22 refResidentAssessmentFormPage22)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage22 getResidentAssessmentFormPage22(
			int currentResidentAssessmentFormKey) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage7(
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7)
			throws MedrexException, RemoteException;

	public ResidentQuarterlyAssessmentFormPage7 getResidentQuarterlyAssessmentFormPage7(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentQuarterlyAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage8(
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8)
			throws MedrexException, RemoteException;

	public ResidentQuarterlyAssessmentFormPage8 getResidentQuarterlyAssessmentFormPage8(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentQuarterlyAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage9(
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9)
			throws MedrexException, RemoteException;

	public ResidentQuarterlyAssessmentFormPage9 getResidentQuarterlyAssessmentFormPage9(
			int formId) throws MedrexException, RemoteException;

	public void deleteResidentQuarterlyAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateActivitysRecord(ActivitysRecord residentPayer)
			throws MedrexException, RemoteException;

	public List getActivitysRecords(int residentSerial) throws MedrexException,
			RemoteException;

	public ActivitysRecord getActivitysRecord(int serial)
			throws MedrexException, RemoteException;

	public void deleteActivitysRecord(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateMedicationTreatmentForm(
			MedicationTreatmentForm residentPayer) throws MedrexException,
			RemoteException;

	public List getMedicationTreatmentForms(int residentSerial)
			throws MedrexException, RemoteException;

	public MedicationTreatmentForm getMedicationTreatmentForm(int serial)
			throws MedrexException, RemoteException;

	public MedicationTreatmentForm getMedicationTreatmentFormCurrentWhere(
			int residentSerial, String type) throws MedrexException,
			RemoteException;

	public void deleteMedicationTreatmentForm(long serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateActivityInitialAssessmentFormPage1(
			ActivityInitialAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException;

	public List getActivityInitialAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException;

	public ActivityInitialAssessmentFormPage1 getActivityInitialAssessmentFormPage1(
			int serial) throws MedrexException, RemoteException;

	public void deleteActivityInitialAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateActivityAssessmentFormPage2(
			ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2)
			throws MedrexException, RemoteException;

	public List getActivityAssessmentFormPage2s(int residentSerial)
			throws MedrexException, RemoteException;

	public ActivityAssessmentFormPage2 getActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException;

	public void deleteActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePainManagementRecordFormPage1(
			PainManagementRecordFormPage1 pmrP1) throws MedrexException,
			RemoteException;

	public List getPainManagementRecordFormPage1s(int residentSerial)
			throws MedrexException, RemoteException;

	public PainManagementRecordFormPage1 getPainManagementRecordFormPage1(
			int serial) throws MedrexException, RemoteException;

	public void deletePainManagementRecordFormPage1(int serial)
			throws MedrexException, RemoteException;

	public void deletePainManagementRecordFormPage1Row(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePainManagementRecordRow(PainManagementRecordRow psa)
			throws MedrexException, RemoteException;

	public PainManagementRecordRow getPainManagementRecordRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateNurseTreatmentNotesForm(
			NurseTreatmentNotesForm ntnf) throws MedrexException,
			RemoteException;

	public List getNurseTreatmentNotesForms(int residentSerial)
			throws MedrexException, RemoteException;

	public NurseTreatmentNotesForm getNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteNurseMedicationNotesFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteNurseMedicationNotesFormRow1(int formId)
			throws MedrexException, RemoteException;

	public void deleteNurseTreatmentNotesFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteNurseTreatmentNotesFormRow1(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseTreatmentNotesFormRow(
			NurseTreatmentNotesFormRow ntnfr) throws MedrexException,
			RemoteException;

	public void insertOrUpdateNurseTreatmentNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException;

	public NurseTreatmentNotesFormRow getNurseTreatmentNotesFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public List getNurseTreatmentNotesFormRows(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseTreatmentNotesFormRow1(
			NurseTreatmentNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException;

	public void insertOrUpdateNurseTreatmentNotesFormRow1(List ntnfr)
			throws MedrexException, RemoteException;

	public List getNurseTreatmentNotesFormRow1s(int formId)
			throws MedrexException, RemoteException;

	public NurseTreatmentNotesFormRow1 getNurseTreatmentNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdatePressureSoreRecordForm(PressureSoreRecordForm psrf)
			throws MedrexException, RemoteException;

	public List getPressureSoreRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public PressureSoreRecordForm getPressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deletePressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deletePressureSoreRecordFormRow(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePressureSoreRecordFormRow(
			PressureSoreRecordFormRow psrfr) throws MedrexException,
			RemoteException;

	public PressureSoreRecordFormRow getPressureSoreRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateNurseMedicationNotesForm(
			NurseMedicationNotesForm nmnf) throws MedrexException,
			RemoteException;

	public List getNurseMedicationNotesForms(int residentSerial)
			throws MedrexException, RemoteException;

	public List getNurseMedicationNotesForms() throws MedrexException,
			RemoteException;

	public NurseMedicationNotesForm getNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseMedicationNotesFormRow(
			NurseMedicationNotesFormRow ntnfr) throws MedrexException,
			RemoteException;

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum) throws MedrexException, RemoteException;

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum, Date currentDate) throws MedrexException,
			RemoteException;

	public List getNurseMedicationNotesFormRow(int formId, Date currentDate)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseMedicationNotesFormRow1(
			NurseMedicationNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException;

	public NurseMedicationNotesFormRow1 getNurseMedicationNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationAdministrationRecordForm(
			MedicationAdministrationRecordForm marf) throws MedrexException,
			RemoteException;

	public List getMedicationAdministrationRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public MedicationAdministrationRecordForm getMedicationAdministrationRecordForm(
			int serial) throws MedrexException, RemoteException;

	public void deleteMedicationAdministrationRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationAdministrationRecordFormCol(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationAdministrationRecordFormCol(
			MedicationAdministrationRecordFormCol marfc)
			throws MedrexException, RemoteException;

	public MedicationAdministrationRecordFormCol getMedicationAdministrationRecordFormCol(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationPRNRecordForm(
			MedicationPRNRecordForm mprnrf) throws MedrexException,
			RemoteException;

	public List getMedicationPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public MedicationPRNRecordForm getMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteMedicationPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationPRNRecordFormRow(
			MedicationPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException;

	public MedicationPRNRecordFormRow getMedicationPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationPRNRecordFormCol(
			MedicationPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException;

	public MedicationPRNRecordFormCol getMedicationPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationRoutineRecordForm(
			MedicationRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException;

	public List getMedicationRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public MedicationRoutineRecordForm getMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteMedicationRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationRoutineRecordFormRow(
			MedicationRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException;

	public MedicationRoutineRecordFormRow getMedicationRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationRoutineRecordFormCol(
			MedicationRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException;

	public MedicationRoutineRecordFormCol getMedicationRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException;

	public int insertOrUpdateTreatmentPRNRecordForm(
			TreatmentPRNRecordForm mprnrf) throws MedrexException,
			RemoteException;

	public List getTreatmentPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public TreatmentPRNRecordForm getTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteTreatmentPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteTreatmentPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateTreatmentPRNRecordFormRow(
			TreatmentPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException;

	public TreatmentPRNRecordFormRow getTreatmentPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateTreatmentPRNRecordFormCol(
			TreatmentPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException;

	public TreatmentPRNRecordFormCol getTreatmentPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException;

	public int insertOrUpdateTreatmentRoutineRecordForm(
			TreatmentRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException;

	public List getTreatmentRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException;

	public TreatmentRoutineRecordForm getTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteTreatmentRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteTreatmentRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateTreatmentRoutineRecordFormRow(
			TreatmentRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException;

	public TreatmentRoutineRecordFormRow getTreatmentRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateTreatmentRoutineRecordFormCol(
			TreatmentRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException;

	public TreatmentRoutineRecordFormCol getTreatmentRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietary(Dietary dietary) throws MedrexException,
			RemoteException;

	public List getDietarys(int residentSerial) throws MedrexException,
			RemoteException;

	public Dietary getDietary(int serial) throws MedrexException,
			RemoteException;

	public void deleteDietary(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietaryCommunicationForm(
			DietaryCommunicationForm dietaryCommunicationForm)
			throws MedrexException, RemoteException;

	public List getDietaryCommunicationForms(int residentSerial)
			throws MedrexException, RemoteException;

	public DietaryCommunicationForm getDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateDietaryResidentDiagnosis(
			DietaryResidentDiagnosis refDietaryResidentDiagnosis)
			throws MedrexException, RemoteException;

	public List getDietaryResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException;

	public DietaryResidentDiagnosis getDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException;

	public void deleteDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateEnteralFeeding(EnteralFeeding refEnteralFeeding)
			throws MedrexException, RemoteException;

	public List getEnteralFeedings(int residentSerial) throws MedrexException,
			RemoteException;

	public EnteralFeeding getEnteralFeeding(int serial) throws MedrexException,
			RemoteException;

	public void deleteEnteralFeeding(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietaryPlazaHealth(
			DietaryPlazaHealth refDietaryPlazaHealth) throws MedrexException,
			RemoteException;

	public List getDietaryPlazaHealths(int residentSerial)
			throws MedrexException, RemoteException;

	public DietaryPlazaHealth getDietaryPlazaHealth(int serial)
			throws MedrexException, RemoteException;

	public void deleteDietaryPlazaHealth(int serial) throws MedrexException,
			RemoteException;

	public void deleteDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietaryPlazaHealthRow(DietaryPlazaHealthRow psr)
			throws MedrexException, RemoteException;

	public int insertOrUpdateDietaryPlazaHealthRows(List psr)
			throws MedrexException, RemoteException;

	public List getDietaryPlazaHealthRows(int formId) throws MedrexException,
			RemoteException;

	public List getDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateConsultant(Consultant consultant)
			throws MedrexException, RemoteException;

	public List getConsultants(int residentSerial) throws MedrexException,
			RemoteException;

	public Consultant getConsultant(int serial) throws MedrexException,
			RemoteException;

	public void deleteConsultant(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateRenalDialysisCommunicationFormPage1(
			RenalDialysisCommunicationFormPage1 residentPayer)
			throws MedrexException, RemoteException;

	public List getRenalDialysisCommunicationFormPage1s(int residentSerial)
			throws MedrexException, RemoteException;

	public RenalDialysisCommunicationFormPage1 getRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException, RemoteException;

	public void deleteRenalDialysisCommunicationFormPage1(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateRenalDialysisCommunicationFormPage2(
			RenalDialysisCommunicationFormPage2 residentPayer)
			throws MedrexException, RemoteException;

	public RenalDialysisCommunicationFormPage2 getRenalDialysisCommunicationFormPage2(
			int serial) throws MedrexException, RemoteException;

	public void deleteRenalDialysisCommunicationFormPage2(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateReferralForm(ReferralForm rf)
			throws MedrexException, RemoteException;

	public List getReferralForms(int residentSerial) throws MedrexException,
			RemoteException;

	public ReferralForm getReferralForm(int serial) throws MedrexException,
			RemoteException;

	public void deleteReferralForm(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateReportOfConsultationForm(
			ReportOfConsultationForm rf) throws MedrexException,
			RemoteException;

	public List getReportOfConsultationForms(int residentSerial)
			throws MedrexException, RemoteException;

	public ReportOfConsultationForm getReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePharmacistEvaluationReportForm(
			PharmacistEvaluationReportForm rf) throws MedrexException,
			RemoteException;

	public List getPharmacistEvaluationReportForms(int residentSerial)
			throws MedrexException, RemoteException;

	public PharmacistEvaluationReportForm getPharmacistEvaluationReportForm(
			int serial) throws MedrexException, RemoteException;

	public void deletePharmacistEvaluationReportForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePharmacistEvaluationReportFormRows(List rfr)
			throws MedrexException, RemoteException;

	public List getPharmacistEvaluationReportFormRows(int formid)
			throws MedrexException, RemoteException;

	public PharmacistEvaluationReportFormRow getPharmacistEvaluationReportFormRow(
			int formId, int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateProgressNotes(ProgressNotes activityPayer)
			throws MedrexException, RemoteException;

	public List getProgressNotess(int activitySerial) throws MedrexException,
			RemoteException;

	public ProgressNotes getProgressNotes(int serial) throws MedrexException,
			RemoteException;

	public void deleteProgressNotes(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDoctorsProgressNotesForm(
			DoctorsProgressNotesForm ntnf) throws MedrexException,
			RemoteException;

	public List getDoctorProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException;

	public DoctorsProgressNotesForm getDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateDoctorsProgressNotesFormRows(List ntnfr)
			throws MedrexException, RemoteException;

	public List getDoctorProgressNotesFormRows(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateInterDisciplinaryProgressNotesForm(
			InterDisciplinaryProgressNotesForm ntnf) throws MedrexException,
			RemoteException;

	public List getInterDisciplinaryProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException;

	public InterDisciplinaryProgressNotesForm getInterDisciplinaryProgressNotesForm(
			int serial) throws MedrexException, RemoteException;

	public void deleteInterDisciplinaryProgressNotesForm(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateInterDisciplinaryProgressNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException;

	public List getInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateHistoryAndPhysical(HistoryAndPhysical consultant)
			throws MedrexException, RemoteException;

	public List getHistoryAndPhysicals(int residentSerial)
			throws MedrexException, RemoteException;

	public HistoryAndPhysical getHistoryAndPhysical(int serial)
			throws MedrexException, RemoteException;

	public void deleteHistoryAndPhysical(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage1(
			HistoryAndPhysicalGeneralFormPage1 rafp1) throws MedrexException,
			RemoteException;

	public List getHistoryAndPhysicalGeneralFormPage1s(int residentSerial)
			throws MedrexException, RemoteException;

	public HistoryAndPhysicalGeneralFormPage1 getHistoryAndPhysicalGeneralFormPage1(
			int serial) throws MedrexException, RemoteException;

	public void deleteHistoryAndPhysicalGeneralFormPage1(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage2(
			HistoryAndPhysicalGeneralFormPage2 rafp2) throws MedrexException,
			RemoteException;

	public HistoryAndPhysicalGeneralFormPage2 getHistoryAndPhysicalGeneralFormPage2(
			int formId) throws MedrexException, RemoteException;

	public void deleteHistoryAndPhysicalGeneralFormPage2(int serial)
			throws MedrexException, RemoteException;

	// /////
	public int insertOrUpdateCumulativeDiagnosisForm(
			CumulativeDiagnosisForm ntnf) throws MedrexException,
			RemoteException;

	public List getCumulativeDiagnosisForms(int residentSerial)
			throws MedrexException, RemoteException;

	public CumulativeDiagnosisForm getCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateCumulativeDiagnosisFormRow(
			CumulativeDiagnosisFormRow ntnfr) throws MedrexException,
			RemoteException;

	public CumulativeDiagnosisFormRow getCumulativeDiagnosisFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateMonthlyVitalSheetForm(MonthlyVitalSheetForm ntnf)
			throws MedrexException, RemoteException;

	public List getMonthlyVitalSheetForms(int residentSerial)
			throws MedrexException, RemoteException;

	public MonthlyVitalSheetForm getMonthlyVitalSheetForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteMonthlyVitalSheetForm(int serial) throws MedrexException,
			RemoteException;

	public void deleteMonthlyVitalSheetFormRow(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMonthlyVitalSheetFormRow(
			MonthlyVitalSheetFormRow ntnfr) throws MedrexException,
			RemoteException;

	public MonthlyVitalSheetFormRow getMonthlyVitalSheetFormRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdateWeeklyWeightsForm(WeeklyWeightsForm ntnf)
			throws MedrexException, RemoteException;

	public List getWeeklyWeightsForms(int residentSerial)
			throws MedrexException, RemoteException;

	public WeeklyWeightsForm getWeeklyWeightsForm(int serial)
			throws MedrexException, RemoteException;

	public void deleteWeeklyWeightsForm(int serial) throws MedrexException,
			RemoteException;

	public void deleteWeeklyWeightsFormRow(int formId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateWeeklyWeightsFormRow(WeeklyWeightsFormRow ntnfr)
			throws MedrexException, RemoteException;

	public WeeklyWeightsFormRow getWeeklyWeightsFormRow(int formId, int formNum)
			throws MedrexException, RemoteException;

	public int insertOrUpdateWeeklyWeightsFormRows(List ntnfr)
			throws MedrexException, RemoteException;

	public List getWeeklyWeightsFormRows(int formId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateLabSpecial(LabSpecial labSpecial)
			throws MedrexException, RemoteException;

	public List getLabSpecials(int residentSerial) throws MedrexException,
			RemoteException;

	public LabSpecial getLabSpecial(int serial) throws MedrexException,
			RemoteException;

	public void deleteLabSpecial(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateReasonForStudy(ReasonForStudy rfStudy)
			throws MedrexException, RemoteException;

	public List getReasonForStudys(int residentSerial) throws MedrexException,
			RemoteException;

	public ReasonForStudy getReasonForStudy(int serial) throws MedrexException,
			RemoteException;

	public void deleteReasonForStudy(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateMadexForm1(MadexForm1 refMadexForm1)
			throws MedrexException, RemoteException;

	public List getMadexForm1s(int residentSerial) throws MedrexException,
			RemoteException;

	public MadexForm1 getMadexForm1(int serial) throws MedrexException,
			RemoteException;

	public void deleteMadexForm1(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateMadexForm2(MadexForm2 refMadexForm2)
			throws MedrexException, RemoteException;

	public List getMadexForm2s(int residentSerial) throws MedrexException,
			RemoteException;

	public MadexForm2 getMadexForm2(int serial) throws MedrexException,
			RemoteException;

	public void deleteMadexForm2(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianOrder(PhysicianOrders physicianOrders)
			throws MedrexException, RemoteException;

	public List getPhysicianOrders(int residentSerial) throws MedrexException,
			RemoteException;

	public PhysicianOrders getPhysicianOrder(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrder(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianPlazaHealthCare(
			PhysicianPlazaHealthCare refPhysicianPlazaHealthCare)
			throws MedrexException, RemoteException;

	public List getPhysicianPlazaHealthCares(int residentSerial)
			throws MedrexException, RemoteException;

	public PhysicianPlazaHealthCare getPhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianInfusion(
			PhysicianInfusion refPhysicianInfusion) throws MedrexException,
			RemoteException;

	public List getPhysicianInfusions(int residentSerial)
			throws MedrexException, RemoteException;

	public PhysicianInfusion getPhysicianInfusion(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianInfusion(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentImmunizationRecord(
			ResidentImmunizationRecord refResidentImmunizationRecord)
			throws MedrexException, RemoteException;

	public List getResidentImmunizationRecords(int residentSerial)
			throws MedrexException, RemoteException;

	public ResidentImmunizationRecord getResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException;

	public void deleteResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianSpeciality(PhysicianSpeciality ps)
			throws MedrexException, RemoteException;

	public List getPhysicianSpecialitys(int residentSerial)
			throws MedrexException, RemoteException;

	public PhysicianSpeciality getPhysicianSpeciality(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianSpeciality(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianSpecialityRow(PhysicianSpecialityRow psr)
			throws MedrexException, RemoteException;

	public PhysicianSpecialityRow getPhysicianSpecialityRow(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm1(
			PhysicianOrderForm1 refPhysicianOrderForm1) throws MedrexException,
			RemoteException;

	public List getPhysicianOrderForm1s(int residentSerial)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm1 getPhysicianOrderForm1(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderForm1(int serial) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderForm1Row(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm1Row(PhysicianOrderForm1Row psr)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm1Row getPhysicianOrderForm1Row(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm2(
			PhysicianOrderForm2 refPhysicianOrderForm2) throws MedrexException,
			RemoteException;

	public List getPhysicianOrderForm2s(int residentSerial)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm2 getPhysicianOrderForm2(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderForm2(int serial) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderForm2Row(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm2Row(PhysicianOrderForm2Row psr)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm2Row getPhysicianOrderForm2Row(int formId,
			int formNum) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm3(
			PhysicianOrderForm3 refPhysicianOrderForm3) throws MedrexException,
			RemoteException;

	public List getPhysicianOrderForm3s(int residentSerial)
			throws MedrexException, RemoteException;

	public List getPhysicianOrderForm3s() throws MedrexException,
			RemoteException;

	public PhysicianOrderForm3 getPhysicianOrderForm3(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderForm3(int serial) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderForm3Row(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm3Row(PhysicianOrderForm3Row psr)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderForm3Rows(List psr)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum) throws MedrexException, RemoteException;

	// PtOtSt ------------------------------------------------------------- //
	public int insertOrUpdatePtOtSt(PtOtSt ptOtSt) throws MedrexException,
			RemoteException;

	public List getPtOtSts(int residentSerial) throws MedrexException,
			RemoteException;

	public PtOtSt getPtOtSt(int serial) throws MedrexException, RemoteException;

	public void deletePtOtSt(int serial) throws MedrexException,
			RemoteException;

	// PtOtStOccupationalDailyRecord
	public int insertOrUpdatePtOtStOccupationalDailyRecord(
			PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord)
			throws MedrexException, RemoteException;

	public List getPtOtStOccupationalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecord(
			int serial) throws MedrexException, RemoteException;

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecordByDate(
			Date date) throws RemoteException, MedrexException;

	public void deletePtOtStOccupationalDailyRecord(int serial)
			throws MedrexException, RemoteException;

	// PtOtStOccupationalTherapy
	public int insertOrUpdatePtOtStOccupationalTherapy(
			PtOtStOccupationalTherapy refPtOtStOccupationalTherapy)
			throws MedrexException, RemoteException;

	public List getPtOtStOccupationalTherapys(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStOccupationalTherapy getPtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException;

	// PtOtStPhysicalDailyRecord
	public int insertOrUpdatePtOtStPhysicalDailyRecord(
			PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord)
			throws MedrexException, RemoteException;

	public List getPtOtStPhysicalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStPhysicalDailyRecord getPtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException;

	// PtOtStPhysicalTheray
	public int insertOrUpdatePtOtStPhysicalTheray(
			PtOtStPhysicalTheray refPtOtStPhysicalTheray)
			throws MedrexException, RemoteException;

	public List getPtOtStPhysicalTherays(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStPhysicalTheray getPtOtStPhysicalTheray(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStPhysicalTheray(int serial) throws MedrexException,
			RemoteException;

	public PtOtStPhysicalTheray getExistingPhysicalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException, RemoteException;

	// PtOtStPositioningEvaluation
	public int insertOrUpdatePtOtStPositioningEvaluation(
			PtOtStPositioningEvaluation refPtOtStPositioningEvaluation)
			throws MedrexException, RemoteException;

	public List getPtOtStPositioningEvaluations(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStPositioningEvaluation getPtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException;

	// PtOtStRehabCarePlan
	public int insertOrUpdatePtOtStRehabCarePlan(
			PtOtStRehabCarePlan refPtOtStRehabCarePlan) throws MedrexException,
			RemoteException;

	public List getPtOtStRehabCarePlans(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStRehabCarePlan getPtOtStRehabCarePlan(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStRehabCarePlan(int serial) throws MedrexException,
			RemoteException;

	// PtOtStSpeechDailyRecord
	public int insertOrUpdatePtOtStSpeechDailyRecord(
			PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord)
			throws MedrexException, RemoteException;

	public List getPtOtStSpeechDailyRecords(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStSpeechDailyRecord getPtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException;

	// PtOtStSpeechLanguage
	public int insertOrUpdatePtOtStSpeechLanguage(
			PtOtStSpeechLanguage refPtOtStSpeechLanguage)
			throws MedrexException, RemoteException;

	public List getPtOtStSpeechLanguages(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStSpeechLanguage getPtOtStSpeechLanguage(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStSpeechLanguage(int serial) throws MedrexException,
			RemoteException;

	// PtOtStTherapyPhysical
	public int insertOrUpdatePtOtStTherapyPhysical(
			PtOtStTherapyPhysical refPtOtStTherapyPhysical)
			throws MedrexException, RemoteException;

	public List getPtOtStTherapyPhysicals(int residentSerial)
			throws MedrexException, RemoteException;

	public PtOtStTherapyPhysical getPtOtStTherapyPhysical(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStTherapyPhysical(int serial) throws MedrexException,
			RemoteException;

	// PtOtStTreatment
	public int insertOrUpdatePtOtStTreatment(PtOtStTreatment refPtOtStTreatment)
			throws MedrexException, RemoteException;

	public List getPtOtStTreatments(int residentSerial) throws MedrexException,
			RemoteException;

	public PtOtStTreatment getPtOtStTreatment(int serial)
			throws MedrexException, RemoteException;

	public void deletePtOtStTreatment(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateUser(Users user) throws MedrexException,
			RemoteException;

	/*
	 * public List getUsers(int userSerial) throws MedrexException,
	 * RemoteException { return ((new UserService()).getUsers(userSerial)); }
	 */

	public Users getUser(int serial) throws MedrexException, RemoteException;

	public List getUsers() throws MedrexException, RemoteException;

	public void deleteUser(int serial) throws MedrexException, RemoteException;

	public boolean isValidUserLogin(String user, String password)
			throws MedrexException, RemoteException;

	public int insertOrUpdateDoctorsRecord(Doctors refDoctors)
			throws MedrexException, RemoteException;

	public List getDoctorsRecords() throws MedrexException, RemoteException;

	public List getDoctorsRecords(int residentSerial) throws MedrexException,
			RemoteException;

	public Doctors getDoctorsRecord(int serial) throws MedrexException,
			RemoteException;

	public Doctors getDoctorsRecord(DoctorTypes type, String fName, String lName)
			throws MedrexException, RemoteException;

	public void deleteDoctorsRecord(int serial) throws MedrexException,
			RemoteException;

	public List getDoctorsRecords(DoctorTypes type) throws MedrexException,
			RemoteException;

	public int insertOrUpdateNurseRecord(Nurse refNurse)
			throws MedrexException, RemoteException;

	public List getNurseRecords() throws MedrexException, RemoteException;

	public Nurse getNurseRecord(int serial) throws MedrexException,
			RemoteException;

	public Nurse getNurseRecordForSchedule(int serial) throws MedrexException,
			RemoteException;

	public void deleteNurseRecord(int serial) throws MedrexException,
			RemoteException;

	

	public int insertOrUpdatePhysicianForm(PhysicianForm refPhysicianForm)
			throws MedrexException, RemoteException;

	public List getPhysicianForms(int residentSerial) throws MedrexException,
			RemoteException;

	public PhysicianForm getPhysicianForm(int serial) throws MedrexException,
			RemoteException;

	public PhysicianForm getPhysicianForm(int residentId, int physicianType)
			throws MedrexException, RemoteException;

	public void deletePhysicianForm(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateProvidersRecord(ProvidersRecord providersRecord)
			throws MedrexException, RemoteException;

	public boolean getProvidersRecordsOfType(int residentSerial,
			int providerType) throws MedrexException, RemoteException;

	public ProvidersRecord getProvidersRecord(int residentSerial,
			int providerType) throws MedrexException, RemoteException;

	public List getProvidersRecords(int residentSerial) throws MedrexException,
			RemoteException;

	public List getProvidersRecords() throws MedrexException, RemoteException;

	public ProvidersRecord getProvidersRecord(int serial)
			throws MedrexException, RemoteException;

	public void deleteProvidersRecord(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException,
			RemoteException;

	public List getProvidersRecordForms() throws MedrexException,
			RemoteException;

	public ProvidersRecordForm getProvidersRecordForm(int serial)
			throws MedrexException, RemoteException;

	public ProvidersRecordForm getProvidersRecordForm(ProviderTypes type,
			String address, String city) throws MedrexException,
			RemoteException;

	public void deleteProvidersRecordForm(int serial) throws MedrexException,
			RemoteException;

	public List getProvidersRecordForms(String type) throws MedrexException,
			RemoteException;

	public List getProvidersRecordForms(ProviderTypes pTypes)
			throws MedrexException, RemoteException;

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum, Date date) throws MedrexException, RemoteException;

	// mds
	public void insertOrUpdateScanForm(ScanForm scanForm)
			throws MedrexException, RemoteException;

	public List getScanForms(int residentSerial) throws MedrexException,
			RemoteException;

	public ScanForm getScanForm(int serial) throws MedrexException,
			RemoteException;

	public void deleteScanForm(int serial) throws MedrexException,
			RemoteException;

	public void insertOrUpdateMessagesRecord(MessagesRecord messagesRecord)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMessagesRecord(MessagesRecord messagesRecord,
			List<Users> rUsers) throws MedrexException, RemoteException;

	public List getMessagesRecords() throws MedrexException, RemoteException;

	public List getMessagesRecords(int residentserial) throws MedrexException,
			RemoteException;

	public MessagesRecord getMessagesRecord(int serial) throws MedrexException,
			RemoteException;

	public void deleteMessagesRecord(int serial) throws MedrexException,
			RemoteException;

	public int getTotalMessage(int currentLoggedInUserKey)
			throws MedrexException, RemoteException;

	public int getTriggerWordMailCount(int currentLoggedInUserKey)
			throws MedrexException, RemoteException;

	// ResidentDiagnosis
	public int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException,
			RemoteException;

	public List getResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException;

	public ResidentDiagnosis getLastDiagnosisAccToOrder(int residentId)
			throws MedrexException, RemoteException;

	public ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException, RemoteException;

	public void deleteResidentDiagnosis(int serial) throws MedrexException,
			RemoteException;

	
	public int insertOrUpdateMonthlyVitalSheetFormRows(List ntnfr)
			throws MedrexException, RemoteException;

	public List getMonthlyVitalSheetFormRows(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseMedicationNotesFormRows(
			List<NurseMedicationNotesFormRow> rows) throws MedrexException,
			RemoteException;

	public List getNurseMedicationNotesFormRows(int formId)
			throws MedrexException, RemoteException;

	public List getNurseMedicationNotesFormRow1s(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNurseMedicationNotesFormRow1s(
			List<NurseMedicationNotesFormRow1> rows1) throws MedrexException,
			RemoteException;

	public int insertOrUpdateCumulativeDiagnosisFormRows(List ntnfr)
			throws MedrexException, RemoteException;

	public List getCumulativeDiagnosisFormRows(int formId)
			throws MedrexException, RemoteException;

	public List getPhysicianOrderForm3Rows(int currentPhysicianOrderForm3Key)
			throws MedrexException, RemoteException;

	public int insertOrUpdateResidentInfoGeneralPhone(
			ResidentInfoGeneralPhone refResidentInfoGeneralPhone)
			throws MedrexException, RemoteException;

	public List getResidentInfoGeneralPhones(int residentSerial)
			throws MedrexException, RemoteException;

	public ResidentInfoGeneralPhone getResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException;

	public void deleteResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateCarePlan(CarePlan carePlan)
			throws MedrexException, RemoteException;

	public List getCarePlanList(int residentSerial) throws MedrexException,
			RemoteException;

	public CarePlan getCarePlan(int serial) throws MedrexException,
			RemoteException;

	public void deleteCarePlan(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateCarePlanRecord(CarePlanRecord carePlanRecord)
			throws MedrexException, RemoteException;

	public CarePlanRecord getCarePlanRecord(int serial) throws MedrexException,
			RemoteException;

	public void deleteCarePlanRecord(int serial) throws MedrexException,
			RemoteException;

	public List getAllCarePlanMatchingThisCarePlan(CarePlanRecord careplanrecord)
			throws MedrexException, RemoteException;

	public List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord, String userName)
			throws MedrexException, RemoteException;

	 

	// Security Role
	public int insertOrUpdatedSecurityRole(SecurityRole securityRole)
			throws MedrexException, RemoteException;

	public List getAllRoles() throws MedrexException, RemoteException;

	public List getAllApplicationRoles() throws MedrexException,
			RemoteException;

	public SecurityRole getSecurityRole(int serial) throws MedrexException,
			RemoteException;

	public SecurityRole getSecurityRole(String name) throws MedrexException,
			RemoteException;

	public void deleteSecurityRole(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePanelProgressNotes(
			ProgressNotes2 refpanelProgressNotes) throws MedrexException,
			RemoteException;

	public List getPanelProgressNotes(int residentSerial)
			throws MedrexException, RemoteException;

	public ProgressNotes2 getPanelProgressNote(int serial)
			throws MedrexException, RemoteException;

	public void deletePanelProgressNotes(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePrescription(Prescription refPrescription)
			throws MedrexException, RemoteException;

	public List getPrescriptions(int residentSerial) throws MedrexException,
			RemoteException;

	public Prescription getPrescription(int serial) throws MedrexException,
			RemoteException;

	public void deletePrescription(int serial) throws MedrexException,
			RemoteException;

	public void deleteProgressNotes2(int formId) throws MedrexException,
			RemoteException;

	// UserLogon
	public int insertOrUpdateUserLogon(UserLogon refUserLogon)
			throws MedrexException, RemoteException;

	public List getUserLogons() throws MedrexException, RemoteException;

	public UserLogon getUserLogon(int serial) throws MedrexException,
			RemoteException;

	public void deleteUserLogon(int serial) throws MedrexException,
			RemoteException;

	public UserLogon getcurrentUserLogon() throws MedrexException,
			RemoteException;

	// Care Log
	public int insertOrUpdateCareLog(CareLog cnaAdl) throws MedrexException,
			RemoteException;

	public List getCareLogForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public CareLog getCareLog(int id) throws MedrexException, RemoteException;

	// CNA
	public int insertOrUpdateCnaAdl(CnaAdl cnaAdl) throws MedrexException,
			RemoteException;

	public List getCnaAdlForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public CnaAdl getCnaAdl(int id) throws MedrexException, RemoteException;

	// AdmissionFromHead
	public int insertOrUpdateAdmissionFromHead(
			AdmissionFromHead refAdmissionFromHead) throws MedrexException,
			RemoteException;

	public List getAdmissionFromHeads() throws MedrexException, RemoteException;

	public List getAdmissionFromHeads(String likeStr) throws MedrexException,
			RemoteException;

	public AdmissionFromHead getAdmissionFromHead(int serial)
			throws MedrexException, RemoteException;

	public void deleteAdmissionFromHead(int serial) throws MedrexException,
			RemoteException;

	// AdmissionFromSubHead
	public int insertOrUpdateAdmissionFromSubHead(
			AdmissionFromSubHead refAdmissionFromSubHead)
			throws MedrexException, RemoteException;

	public List getAdmissionFromSubHeads(int headId) throws MedrexException,
			RemoteException;

	public List getAdmissionFromSubHeads(int headId, String likeStr)
			throws MedrexException, RemoteException;

	public AdmissionFromSubHead getAdmissionFromSubHead(int serial)
			throws MedrexException, RemoteException;

	public void deleteAdmissionFromSubHead(int serial) throws MedrexException,
			RemoteException;

	// AdmissionTransportation
	public int insertOrUpdateAdmissionTransportation(
			AdmissionTransportation refAdmissionTransportation)
			throws MedrexException, RemoteException;

	public List getAdmissionTransportations(int residentSerial)
			throws MedrexException, RemoteException;

	public List getAdmissionTransportations(String likeStr)
			throws MedrexException, RemoteException;

	public AdmissionTransportation getAdmissionTransportation(int serial)
			throws MedrexException, RemoteException;

	public void deleteAdmissionTransportation(int serial)
			throws MedrexException, RemoteException;

	// CensusStatus
	public int insertOrUpdateCensusStatus(CensusStatus refCensusStatus)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusStatus(int serial, int residentSerial)
			throws MedrexException, RemoteException;

	public List getCensusStatuss(int residentSerial) throws MedrexException,
			RemoteException;

	public List getCensusStatuss(String order, int residentSerial)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusStatus(int residentSerial, String typename)
			throws MedrexException, RemoteException;

	public List getCensusStatuss(int residentSerial, String typename)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusStatus() throws MedrexException,
			RemoteException;

	public void deleteCensusStatus(int serial) throws MedrexException,
			RemoteException;

	public CensusStatus getCensusLastAdmission(int residentSerial)
			throws MedrexException, RemoteException;

	// for ORIGINAL Admisstion or first time admission
	public CensusStatus getCensusOriginalAdmission(int residentSerial)
			throws MedrexException, RemoteException;

	// for getting last allergies
	public ResidentAssessmentFormPage1 getResidentAllergies(int residentSerial)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastDischarge(int residentSerial)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastSignIn(int residentSerial)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastSignOut(int residentSerial)
			throws MedrexException, RemoteException;

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey) throws MedrexException, RemoteException;

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey, Date forDate) throws MedrexException,
			RemoteException;

	public CensusStatus getCensusLastAdmission(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastDischarge(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastSignIn(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public CensusStatus getCensusLastSignOut(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public List getCensusStatuss(String typename) throws MedrexException,
			RemoteException;

	public List getCensusStatuss(String typename, Date tillDate)
			throws MedrexException, RemoteException;

	public List getCensusStatussAdmission() throws MedrexException,
			RemoteException;

	public List getCensusStatussAdmission(Date tillDate)
			throws MedrexException, RemoteException;

	public List getCensusStatussDischarge() throws MedrexException,
			RemoteException;

	public List getCensusStatussDischarge(Date tillDate)
			throws MedrexException, RemoteException;

	public List getCensusStatussSignOut() throws MedrexException,
			RemoteException;

	public List getCensusStatussSignOut(Date tillDate) throws MedrexException,
			RemoteException;

	public List getCensusStatussSignIn() throws MedrexException,
			RemoteException;

	public List getCensusStatussSignIn(Date tillDate) throws MedrexException,
			RemoteException;

	// ResponsibleParty
	public int insertOrUpdateResponsibleParty(ResponsibleParty ref)
			throws MedrexException, RemoteException;

	public List getResponsiblePartys(int residentId) throws MedrexException,
			RemoteException;

	public List getResponsiblePartys(int residentId, String likeStr)
			throws MedrexException, RemoteException;

	public ResponsibleParty getResponsibleParty(int serial)
			throws MedrexException, RemoteException;

	public void deleteDischargeResponsibleParty(int serial)
			throws MedrexException, RemoteException;

	// SignOutTo
	public int insertOrUpdateSignOutTo(SignOutTo ref) throws MedrexException,
			RemoteException;

	public List getSignOutTos() throws MedrexException, RemoteException;

	public List getSignOutTos(String likeStr) throws MedrexException,
			RemoteException;

	public SignOutTo getSignOutTo(int serial) throws MedrexException,
			RemoteException;

	public void deleteDischargeSignOutTo(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateCensusNotes(CensusNotes refCensusNotes)
			throws MedrexException, RemoteException;

	public List getCensusNotesForStatus(int statusid) throws MedrexException,
			RemoteException;

	public CensusNotes getCensusNotes(int serial) throws MedrexException,
			RemoteException;

	// dashboard
	public void deleteDashboard(int serial) throws MedrexException,
			RemoteException;

	public Dashboard getDashboard(int serial) throws MedrexException,
			RemoteException;

	public Dashboard getDashboard(String type) throws MedrexException,
			RemoteException;

	public int getCensusLastDayAdmissionCount() throws MedrexException,
			RemoteException;

	public int getCensusLastDayAdmissionFirstFloorCount()
			throws MedrexException, RemoteException;

	public int getCensusLastDayAdmissionSecondFloorCount()
			throws MedrexException, RemoteException;

	public int getCensusLastDayDischargeCount() throws MedrexException,
			RemoteException;

	public int getCensusLastDayDischargeFirstFloorCount()
			throws MedrexException, RemoteException;

	public int getCensusLastDayDischargeSecondFloorCount()
			throws MedrexException, RemoteException;

	public List getCensusLastDayAdmissionResidents() throws MedrexException,
			RemoteException;

	public List getCensusLastDayAdmissionFirstFloorResidents()
			throws MedrexException, RemoteException;

	public List getCensusLastDayAdmissionSecondFloorResidents()
			throws MedrexException, RemoteException;

	public List getCensusLastDayDischargeResidents() throws MedrexException,
			RemoteException;

	public List getCensusLastDayDischargeFirstFloorResidents()
			throws MedrexException, RemoteException;

	public List getCensusLastDayDischargeSecondFloorResidents()
			throws MedrexException, RemoteException;

	public List<Dashboard> getDashboards() throws MedrexException,
			RemoteException;

	public int insertOrUpdateDashboard(Dashboard ref) throws MedrexException,
			RemoteException;

	// counts --- BedHold
	public void deleteBedHold(int residentId) throws MedrexException,
			RemoteException;

	public BedHold getBedHold(int serial) throws MedrexException,
			RemoteException;

	public List<BedHold> getBedHolds() throws MedrexException, RemoteException;

	public int insertOrUpdateBedHold(BedHold ref) throws MedrexException,
			RemoteException;

	public int getCountBedHold() throws MedrexException, RemoteException;

	public BedHold getBedHoldForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public BedHold getBedHoldForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public List<BedHold> getBedHoldForResidents() throws MedrexException,
			RemoteException;

	public List<BedHold> getBedHoldForResidents(Date tillDate)
			throws MedrexException, RemoteException;

	// counts --- Hospital
	public void deleteHospital(int residentId) throws MedrexException,
			RemoteException;

	public Hospital getHospital(int serial) throws MedrexException,
			RemoteException;

	public List<Hospital> getHospitals() throws MedrexException,
			RemoteException;

	public int insertOrUpdateHospital(Hospital ref) throws MedrexException,
			RemoteException;

	public int getHospitalCount() throws MedrexException, RemoteException;

	public Hospital getHospitalForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public Hospital getHospitalForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public List<Hospital> getHospitalForResidents() throws MedrexException,
			RemoteException;

	public List<Hospital> getHospitalForResidents(Date tillDate)
			throws MedrexException, RemoteException;

	// counts --- InHouse
	public void deleteInHouse(int residentId) throws MedrexException,
			RemoteException;

	public InHouse getInHouse(int serial) throws MedrexException,
			RemoteException;

	public List<DashboardInfo> getInHouses() throws MedrexException,
			RemoteException;

	public int insertOrUpdateInHouse(InHouse ref) throws MedrexException,
			RemoteException;

	public int getInHouseCount() throws MedrexException, RemoteException;

	public InHouse getInHouseForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public InHouse getInHouseForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public List<InHouse> getInHouseForResidents() throws MedrexException,
			RemoteException;

	public List<InHouse> getInHouseForResidents(Date tillDate)
			throws MedrexException, RemoteException;

	// counts --- SignOut
	public void deleteSignOut(int residentId) throws MedrexException,
			RemoteException;

	public SignOut getSignOut(int serial) throws MedrexException,
			RemoteException;

	public List<SignOut> getSignOuts() throws MedrexException, RemoteException;

	public List<SignOut> getSignOutsLate() throws MedrexException,
			RemoteException;

	public List<SignOut> getSignOutsLateMoreThanHour() throws MedrexException,
			RemoteException;

	public int insertOrUpdateSignOut(SignOut ref) throws MedrexException,
			RemoteException;

	public int getSignOutCount() throws MedrexException, RemoteException;

	public int getSignOutLateCount() throws MedrexException, RemoteException;

	public int getSignOutLateMoreThanHourCount() throws MedrexException,
			RemoteException;

	// counts --- OutOfPass
	public void insertOrUpdateOutOfPass(OutOfPass oop) throws MedrexException,
			RemoteException;

	public int getOutOfPassCount() throws MedrexException, RemoteException;

	public void deleteOutOfPass(int serial) throws MedrexException,
			RemoteException;

	public OutOfPass getOutOfPassForResident(int residentSerial)
			throws MedrexException, RemoteException;

	public int getOutOfPassCalendarYearCount(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public int getOutOnPassCalendarYearCount(int currentResidenceKey, int year)
			throws MedrexException, RemoteException;

	public OutOfPass getOutOfPassForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException;

	public List<OutOfPass> getOutOfPassForResidents() throws MedrexException,
			RemoteException;

	public List<OutOfPass> getOutOfPassForResidents(Date tillDate)
			throws MedrexException, RemoteException;

	// Icd9
	public int insertOrUpdateIcd9(Icd9 refIcd9) throws MedrexException,
			RemoteException;

	public List getIcd9s() throws MedrexException, RemoteException;

	public List getIcd9s(String likeStr) throws MedrexException,
			RemoteException;

	public List<Icd9> getIcd9s(String text, String selectedButton)
			throws MedrexException, RemoteException;

	public Icd9 getIcd9ByCode(String code) throws MedrexException,
			RemoteException;

	public Icd9 getIcd9(int serial) throws MedrexException, RemoteException;

	public void deleteIcd9(int serial) throws MedrexException, RemoteException;

	// Accurities
	public int insertOrUpdateAccurities(List<Accurities> accList, String floor,
			Date d) throws MedrexException, RemoteException;

	public List getCurrentAccuritiesList() throws MedrexException,
			RemoteException;

	// CountAudit
	public int insertOrUpdateCountAudit(CountAudit refCountAudit)
			throws MedrexException, RemoteException;

	public List getCountAudits() throws MedrexException, RemoteException;

	public List getCountAudits(Date date) throws MedrexException,
			RemoteException;

	public CountAudit getCountAudit(int serial) throws MedrexException,
			RemoteException;

	public int getCountAuditSeialByDateFloor(Date date, String floor)
			throws MedrexException, RemoteException;

	public void deleteCountAudit(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateCountAuditFloor(CountAuditFloor refCountAuditFloor)
			throws MedrexException, RemoteException;

	public List getCountAuditFloors() throws MedrexException, RemoteException;

	public CountAuditFloor getCountAuditFloor(int serial)
			throws MedrexException, RemoteException;

	public void deleteCountAuditFloor(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateCountAuditStatus(
			CountAuditStatus refCountAuditStatus) throws MedrexException,
			RemoteException;

	public List<CountAuditStatus> getCountAuditStatuss()
			throws MedrexException, RemoteException;

	public CountAuditStatus getCountAuditStatus(int serial)
			throws MedrexException, RemoteException;

	public CountAuditStatus getCountAuditStatusOfToday()
			throws MedrexException, RemoteException;

	public void deleteCountAuditStatus(int serial) throws MedrexException,
			RemoteException;

	public Accurities getAccurities(int currentAccuritiesKey)
			throws MedrexException, RemoteException;

	public void deleteAccurities(int serial) throws MedrexException,
			RemoteException;

	public List getAllTemplates() throws MedrexException, RemoteException;

	public int insertOrUpdateTemplates(Templates templates)
			throws MedrexException, RemoteException;

	public Templates getTemplate(int serial) throws MedrexException,
			RemoteException;

	public List getTemplate(String formName) throws MedrexException,
			RemoteException;

	public void deleteTemplate(int serial) throws MedrexException,
			RemoteException;

	public List getNotesCategories(String formName) throws MedrexException,
			RemoteException;

	public List getLatestNotes(String formName, int userId,
			NotesCategories notesCat) throws MedrexException, RemoteException;

	public int insertOrUpdateNotesCategories(NotesCategories notesCategories)
			throws MedrexException, RemoteException;

	public NotesCategories getNotesCategories(int serial)
			throws MedrexException, RemoteException;

	public void deleteNotesCategories(int serial) throws MedrexException,
			RemoteException;

	public List getAllNotesCategories() throws MedrexException, RemoteException;

	public int insertOrUpdateDietList(DietList diet) throws MedrexException,
			RemoteException;

	public DietList getDiet(int serial) throws MedrexException, RemoteException;

	public List getAllDiets() throws MedrexException, RemoteException;

	public void deleteDiet(int serial) throws MedrexException, RemoteException;

	public List<DietList> getDietByCategory(String cat) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietPlan(DietPlan dietPlan)
			throws MedrexException, RemoteException;

	public List<DietPlan> getAllDietPlan() throws MedrexException,
			RemoteException;

	public DietPlan getDietPlan(int serial) throws MedrexException,
			RemoteException;

	public List<DietPlan> getDietPlanByCategory(String cat)
			throws MedrexException, RemoteException;

	public List<DietPlan> getDietPlanByDietName(String dietName)
			throws MedrexException, RemoteException;

	public void deleteDietPlan(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDietPlanByDate(DietPlanByDate dietPlanByDate)
			throws MedrexException, RemoteException;

	public DietPlanByDate getDietPlanByDate(String date)
			throws MedrexException, RemoteException;

	public int insertOrUpdateMedicationNotes(MedicationNotes notes)
			throws MedrexException, RemoteException;

	public List getTemplatesNoteText(int userId, int resId)
			throws MedrexException, RemoteException;

	public MedicationNotes getMedicationNotes(int serial)
			throws MedrexException, RemoteException;

	public void deleteMedicationNotes(int serial) throws MedrexException,
			RemoteException;

	// Notes
	public int insertOrUpdateNotes(Notes notes) throws MedrexException,
			RemoteException;

	public Notes getNotes(int serial) throws MedrexException, RemoteException;

	public void deleteNotes(int serial) throws MedrexException, RemoteException;

	public String get1stFloorResident() throws MedrexException, RemoteException;

	public String get2ndFloorResident() throws MedrexException, RemoteException;

	// MasterList

	public void insertOrUpdateMasterListRecord(MasterList refMasterList)
			throws Exception;

	public List<MasterList> getMasterListRecords(Class cls) throws Exception;

	public MasterList getMasterListRecord(Class cls, int id) throws Exception;

	public MasterList getMasterListRecord(Class cls, String name)
			throws Exception;

	public void deleteMasterListRecord(Class cls, int id) throws Exception;

	public List getAccuritiesListByDate(Date d, String floor) throws Exception;

	public List<CensusStatus> getAllCensus(Date dFrom, Date dTo)
			throws MedrexException, RemoteException;

	public List getAllCensusStatusByYear() throws MedrexException,
			RemoteException;

	public List<CensusStatus> getCensusAdmissionReportData(Date from, Date to)
			throws MedrexException, RemoteException;

	public List<CensusStatus> getCensusDischargeReportData(Date from, Date to)
			throws MedrexException, RemoteException;

	public void deleteDoctorProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException;

	public void deleteInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException;

	// Form Scheduler
	public void deleteFormSchedule(int serial) throws MedrexException,
			RemoteException;

	public FormSchedule getFormSchedule(int serial) throws MedrexException,
			RemoteException;

	public List<FormSchedule> getFormSchedules() throws MedrexException,
			RemoteException;

	public int insertOrUpdateFormSchedule(FormSchedule ref)
			throws MedrexException, RemoteException;

	// PendingForm
	public void deletePendingForm(int serial) throws MedrexException,
			RemoteException;

	public PendingForm getPendingForm(int serial) throws MedrexException,
			RemoteException;

	public List<PendingForm> getPendingForms() throws MedrexException,
			RemoteException;

	public List<PendingForm> getPendingFormsByResidentId(int residentId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePendingForm(PendingForm ref)
			throws MedrexException, RemoteException;

	public List getPendingFormsAccordingResident() throws MedrexException,
			RemoteException;

	public List getFirstFloorPendingFormResidents() throws MedrexException,
			RemoteException;

	public List getSecondFloorPendingFormResidents() throws MedrexException,
			RemoteException;

	public List getSecondFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException;

	public List getFirstFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException;

	public List getPendingAlert() throws MedrexException, RemoteException;

	public List getAllNewLabReportsResidents() throws MedrexException,
			RemoteException;

	public List getFirstFloorNewLabReportResidents() throws MedrexException,
			RemoteException;

	public List getSecondFloorNewLabReportResidents() throws MedrexException,
			RemoteException;

	// /
	public ResidentMain getResident(int residentId, int activeId)
			throws MedrexException, RemoteException;

	public ResidentMain getResidentFloorWise(int residentId, String floor)
			throws MedrexException, RemoteException;

	public List<ResidentMain> getActiveResident(int str)
			throws MedrexException, RemoteException;

	// checking server version

	public float serverVersion() throws MedrexException, RemoteException;

	public Report getLabReports(int serial) throws MedrexException,
			RemoteException;

	public void insertOrUpdatedLabReportText(Report rep)
			throws MedrexException, RemoteException;

	public List getLabReportList(int residentId) throws MedrexException,
			RemoteException;

	public int insertOrUpdateResidentassessmentFormPage19Col(
			List<ResidentAssessmentFormPage19Col> columns)
			throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage19 getResidentAssessmentFormPage19(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException;

	public List<ResidentAssessmentFormPage19Col> getResidentAssessmentFormPage19Columns(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDailySkilledNursesNotesForm2(
			DailySkilledNursesNotesForm2 refForm2) throws MedrexException,
			RemoteException;

	public void insertOrUpdateDailySkilledNursesNotesRows(
			List<DailySkilledNursesNotesRow> rows) throws MedrexException,
			RemoteException;

	public DailySkilledNursesNotesForm2 getDailySkilledNursesNotesForm2(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException;

	public List<DailySkilledNursesNotesRow> getDailySkilledNursesNotesRows(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException;

	public int insertOrUpdateDailySkilledNursesNotes(
			DailySkilledNursesNotes refDailySkilledNursesNotes)
			throws MedrexException, RemoteException;

	// screen saver
	public void insertOrUpdateScreenSaverConfig(Config config)
			throws MedrexException, RemoteException;

	public Config getScreenSaverConfig() throws MedrexException,
			RemoteException;

	// Alert
	public int insertOrUpdateAlert(Alert alert) throws MedrexException,
			RemoteException;

	public List getAlertList(int currentResidenceKey) throws MedrexException,
			RemoteException;

	public void deleteAlertRecord(int id) throws MedrexException,
			RemoteException;

	public Alert getAlertRecord(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public DailySkilledNursesNotes getDailySkilledNursesNotes(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException;

	public void deleteDailySkilledNursesNotes(int formId)
			throws MedrexException, RemoteException;

	public void deleteDailySkilledNursesNotesForm2(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException;

	public void deleteDailySkilledNursesNotesRow(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException;

	public void deleteResidentAssessmentFormPage21(int formId)
			throws MedrexException, RemoteException;

	public void deleteResidentAssessmentFormPage22(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage1(
			SocialServiceInitialAssessmentFormPage1 refSocialServiceForm1)
			throws MedrexException, RemoteException;

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage2(
			SocialServiceInitialAssessmentFormPage2 refSocialServiceAssessmentForm2)
			throws MedrexException, RemoteException;

	public SocialServiceInitialAssessmentFormPage1 getSocialServiceInitialAssessmentFormPage1(
			int currentSocialServiceInitialAssessmentKey)
			throws MedrexException, RemoteException;

	public SocialServiceInitialAssessmentFormPage2 getSocialServiceInitialAssessmentFormPage2(
			int currentSocialServiceInitialAssessmentForm2Key)
			throws MedrexException, RemoteException;

	public void deleteSocialServiceInitialAssessmentFormPage1(int formId)
			throws MedrexException, RemoteException;

	public void deleteSocialServiceInitialAssessmentFormPage2(int formId)
			throws MedrexException, RemoteException;

	// Nutrition Support
	public int insertOrUpdateNutritionSupportAssessmentFormPage1(
			NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1)
			throws MedrexException, RemoteException;

	public NutritionSupportAssessmentFormPage1 getNutritionSupportAssessmentFormPage1(
			int currentNutritionSupportAssessmentFormKey)
			throws MedrexException, RemoteException;

	public void deleteNutritionSupportAssessmentFormPage1(int formId)
			throws MedrexException, RemoteException;

	// form page 1
	public ResidentAssessmentFormPage1 getLatestResidentAssessmentFormPage1(
			int residentId) throws MedrexException, RemoteException;

	// public int insertOrUpdatePendingAlert(PendingAlert pa)
	// throws MedrexException, RemoteException;

	public List getPendingAlertList(int currentResidenceKey, String str,
			int key, String type) throws MedrexException, RemoteException;

	// public void deletePendingAlertRecord(int id) throws MedrexException,
	// RemoteException;

	public List getPendingAlertRecords(int currentAlertKey)
			throws MedrexException, RemoteException;

	public int getTotalPendingAlertCount() throws MedrexException,
			RemoteException;

	public List getResidentPendingAlerts(String str, int key)
			throws MedrexException, RemoteException;

	public int getUpcomingAlerts(int time, String type, String key)
			throws MedrexException, RemoteException;

	public List getAccutiesDate() throws MedrexException, RemoteException;

	public List<UserLogon> getFilteredUsers(Date from, Date to)
			throws MedrexException, RemoteException;

	public int getTotalPastAlerts(String key) throws MedrexException,
			RemoteException;

	public Alert getGlobalAlertRecord(int id) throws MedrexException,
			RemoteException;

	public List getGlobalAlertList(int globalAlertId, int userKey)
			throws MedrexException, RemoteException;

	// public List getGlobalPendingAlertList(int globalAlertId)throws
	// MedrexException,RemoteException;

	public int getGlobalUpcomingAlerts(int time, String type, String key)
			throws MedrexException, RemoteException;

	public int getGlobalTotalPastAlerts(String key) throws MedrexException,
			RemoteException;

	public List getDepartmentList() throws MedrexException, RemoteException;

	public List<Users> getUserListFromDepartment(String user)
			throws MedrexException, RemoteException;

	public void insertOrUpdateAlertSetting(AlertSetting as)
			throws MedrexException, RemoteException;

	public List getAlertSetting() throws MedrexException, RemoteException;

	// public PendingAlert getPendingAlert(int currentPendingAlertKey)
	// throws MedrexException, RemoteException;

	// public List<PendingAlert> getPendingAlertList(String string)throws
	// MedrexException,RemoteException;

	public List getResidentFutureAlerts(int time, String type,
			String currentLoggedInUserName) throws MedrexException,
			RemoteException;

	public List getGlobalPendingAlerts(String currentLoggedInUserName)
			throws MedrexException, RemoteException;

	public List getPendingOwnerList(int currentLoggedInUserKey)
			throws MedrexException, RemoteException;

	public int getCompletedAlertsCount(int key, String str)
			throws MedrexException, RemoteException;

	public int getAlertCountSentByMe(int key) throws MedrexException,
			RemoteException;

	public int getGlobalCompletedAlertsCount(int key, String str)
			throws MedrexException, RemoteException;

	public int getGlobalAlertCountSentByMe(int currentLoggedInUserKey)
			throws MedrexException, RemoteException;

	public void addMessageServer(MsgServer msgServer) throws MedrexException,
			RemoteException;

	public void deletePressureSoreAssessment(int formId)
			throws MedrexException, RemoteException;

	// Trigger Word

	public int insertOrUpdateTriggerWord(TriggerWord tw)
			throws MedrexException, RemoteException;

	public TriggerWord getTriggerWord(int serial) throws MedrexException,
			RemoteException;

	public List<TriggerWord> getAllTriggerWords() throws MedrexException,
			RemoteException;

	public void deleteTriggerWord(int id) throws MedrexException,
			RemoteException;

	public List getTriggerWordList() throws MedrexException, RemoteException;

	public int getCarePlanAnalyzerCount() throws MedrexException,
			RemoteException;

	public List getCarePlanAnalyzerResidentCount() throws MedrexException,
			RemoteException;

	// Admin Medication
	public Long insertOrUpdateMedications(Medication med)
			throws MedrexException, RemoteException;

	public Medication getMedication(long l) throws MedrexException,
			RemoteException;

	public List<Medication> getAllMedications() throws MedrexException,
			RemoteException;

	public void deleteMedication(long id) throws MedrexException,
			RemoteException;

	public List<CarePlanAnalyzerBean> getCarePlanAnalyzerByResidentId(
			int residentId) throws MedrexException, RemoteException;

	// public List<PendingAlert> getPendingPastAlertList(int
	// currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws MedrexException,
	// RemoteException;
	//
	// public List<PendingAlert> getPendingUpcomingAlertList(int alertTime,
	// String alertType, int currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws MedrexException,
	// RemoteException;
	//
	// public List<PendingAlert> getPendingCompletedAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws MedrexException, RemoteException;
	//
	// public List<PendingAlert> getPendingISendOutAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws MedrexException, RemoteException;

	// public List getResidentAlertsISendOut(int currentLoggedInUserKey)
	// throws MedrexException, RemoteException;

	// public List getResidentAlertsCompleted(int currentLoggedInUserKey)
	// throws MedrexException, RemoteException;

	public void suspendAlert(int serial, int time, String type)
			throws MedrexException, RemoteException;

	public void insertOrUpdateNursinhHome(NursingHome nh)
			throws MedrexException, RemoteException;

	public NursingHome getNursingHomeInfo(int i) throws MedrexException,
			RemoteException;

	public List getRichTextFieldValues(String rtfType, String key)
			throws MedrexException, RemoteException;

	public void insertOrUpdateRichTextFieldValue(RichTextField rtf)
			throws MedrexException, RemoteException;

	// for test RA
	public int insertOrUpdateRARecord(RARecord raRecord)
			throws RemoteException, MedrexException;

	public List<DataObject> getRARecord(int serial) throws MedrexException,
			RemoteException;

	public List<RARecord> getRARecordList(int residentId)
			throws MedrexException, RemoteException;

	public void deleteRAFPg1Record(int serial) throws MedrexException,
			RemoteException;

	public void deleteRAFPg2Record(int serial) throws MedrexException,
			RemoteException;

	public void deleteRARecord(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdateRAFPg1(RAFPg1 raPg1) throws MedrexException,
			RemoteException;

	public RAFPg1 getRAFP1(int serial) throws RemoteException, MedrexException;

	public int insertOrUpdateRAFPg2(RAFPg2 raPg2) throws MedrexException,
			RemoteException;

	public RAFPg2 getRAFPg2(int serial) throws RemoteException, MedrexException;

	public void saveRAFPages(List<DataObject> listDataObjects)
			throws RemoteException, MedrexException;

	public int getKeyByDate(Date cal) throws RemoteException, MedrexException;

	public List<CensusStatus> getCensusDayReportAdmissionList(Date date)
			throws RemoteException, MedrexException;

	public List<CensusStatus> getCensusDayReportDischargeList(Date date)
			throws RemoteException, MedrexException;

	public List<CensusStatus> getCensusDayReportOutOnPassList(Date date)
			throws RemoteException, MedrexException;

	public List<CensusStatus> getCensusDayReportHospitalList(Date date)
			throws RemoteException, MedrexException;

	public List<RoomChange> getRoomChange(Date searchDate)
			throws RemoteException, MedrexException;

	public List<RoomChange> getRoomChangeFirstFloor(Date searchDate)
			throws RemoteException, MedrexException;

	public List<RoomChange> getRoomChangeSecondFloor(Date searchDate)
			throws RemoteException, MedrexException;

	// public TempRoomHistory getRoomHistoryAccToCensus(int cenId)
	// throws RemoteException, MedrexException;

	public TempRoomHistory getRoomHistoryAccToCensusAdmission(int cenAdmissionId)
			throws RemoteException, MedrexException;

	public TempRoomHistory getRoomHistoryAccToCensusDischarge(int cenDischargeId)
			throws RemoteException, MedrexException;

	public int getSpeechDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException;

	public int getPhysicalDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException;

	public PtOtStOccupationalTherapy getExistingOccupationalTherapyForm700(
			Date fromDate, Date toDate) throws RemoteException, MedrexException;

	public PtOtStSpeechLanguage getExistingSpeechLanguageForm700(Date fromDate,
			Date toDate) throws RemoteException, MedrexException;

	public List<CensusStatus> getCensusSignInOutReportData(Date from, Date to)
			throws RemoteException, MedrexException;

	public int insertOrUpdateCarePlanValues(CarePlanValues careValues)
			throws RemoteException, MedrexException;

	public CarePlanValues getCarePlanValues(
			int currentResidentAssessmentFormKey, int currentResidenceKey)
			throws RemoteException, MedrexException;

	public void deleteResidentCarePlanValues(int formId, int currentResidenceKey)
			throws RemoteException, MedrexException;

	public void deletegetAlertTimeRecord(int id) throws RemoteException,
			MedrexException;

	public List<CalculatedAlert> getCalculatedAlertList()
			throws RemoteException, MedrexException;

	public List<CalculatedAlert> getCalculatedAlertListByUser(
			int currentLoggedInUserKey, String str, int key, String string)
			throws RemoteException, MedrexException;

	public int getCalculatedAlert(int id) throws RemoteException,
			MedrexException;

	public CalculatedAlert getCalculatedAlertBean(int serial)
			throws RemoteException, MedrexException;

	public void insertOrUpdateCalculatedAlert(CalculatedAlert pa)
			throws RemoteException, MedrexException;

	public List getAllAlertCounts(int currentLoggedInUserKey)
			throws RemoteException, MedrexException;

	public void lockUserStatus(String userID) throws RemoteException,
			MedrexException;

	public PasswordSetting getPasswordSetting() throws RemoteException,
			MedrexException;

	public int insertOrUpdatePasswordSettings(PasswordSetting ps)
			throws RemoteException, MedrexException;

	public List<Users> getUserWithStatus(int status) throws RemoteException,
			MedrexException;

	public void changeUserStatus(int[] selectedUserId, int status)
			throws RemoteException, MedrexException;

	public String getUserName(int currentLoggedInUserkey)
			throws RemoteException, MedrexException;

	public List getSignOutsER() throws RemoteException, MedrexException;

	public List<SignOut> getErForResidents(Date date) throws RemoteException,
			MedrexException;

	public List getCurrentSlotTime(String floorType) throws RemoteException,
			MedrexException;

	public List<MedicationView> getMedicationsList(int currentResidenceKey)
			throws RemoteException, MedrexException;

	public void insertOrUpdateCalculatedMedication(CalculatedMedication cm)
			throws RemoteException, MedrexException;

	public Medications getMedications(int calcSerial) throws RemoteException,
			MedrexException;

	public List getMedicationHistoryTimes() throws RemoteException,
			MedrexException;

	public boolean getAdminUsers(String userName) throws RemoteException,
			MedrexException;

	public int insertOrUpdateMonthlySummaryPage1(
			MonthlySummaryPage1 refMonthlySummaryPage1) throws RemoteException,
			MedrexException;

	public MonthlySummaryPage1 getMonthlySummaryPage1(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException;

	// for 2nd page

	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryPage2 refMonthlySummaryPage2) throws RemoteException,
			MedrexException;

	public MonthlySummaryPage2 getMonthlySummaryPage2(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException;

	// for main page
	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryMainPage refMonthlySummaryMainPage)
			throws RemoteException, MedrexException;

	public MonthlySummaryMainPage getMonthlySummaryMainPage(
			MonthlySummaryRecord msr) throws RemoteException, MedrexException;

	public int insertOrUpdateMonthlySummaryRecord(
			MonthlySummaryRecord monthlySum) throws RemoteException,
			MedrexException;

	public MonthlySummaryRecord getMonthlySummaryRecord(
			int currentActivitysRecordKey) throws RemoteException,
			MedrexException;

	public ArrayList<MonthlySummaryRecord> getMonthlySummaryRecords(
			int currentResidenceKey) throws RemoteException, MedrexException;

	public void deleteMonthlySummaryMainPage(int formId)
			throws RemoteException, MedrexException;

	public void deleteMonthlySummaryPage1(int formId) throws RemoteException,
			MedrexException;

	public void deleteMonthlySummaryPage2(int formId) throws RemoteException,
			MedrexException;

	public void deleteMonthlySummaryRecord(int id) throws RemoteException,
			MedrexException;

	public TempRoomHistory getRoomForResident(int serial, String str)
			throws RemoteException, MedrexException;

	public int insertOrUpdateMonthlySummaryPage5(
			MonthlySummaryPage5 refMonthlySummaryPage5) throws RemoteException,
			MedrexException;

	public MonthlySummaryPage5 getMonthlySummaryPage5(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException;

	public int insertOrUpdateMonthlySummaryPage4(
			MonthlySummaryPage4 refMonthlySummaryPage4) throws RemoteException,
			MedrexException;

	public MonthlySummaryPage4 getMonthlySummaryPage4(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException;

	public int insertOrUpdateMonthlySummaryPage3(
			MonthlySummaryPage3 refMonthlySummaryPage3) throws RemoteException,
			MedrexException;

	public MonthlySummaryPage3 getMonthlySummaryPage3(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException;

	public void deleteDoctorsRecord(int currentSelectedUserId,
			int currentUsersKey) throws RemoteException, MedrexException;

	public void deleteNurseRecord(int currentSelectedUserId, int currentUsersKey)
			throws RemoteException, MedrexException;

	public void deleteUserRecord(int currentUsersKey, int currentSelectedUserId)
			throws RemoteException, MedrexException;

	public void doScanSave(int residentId, String residentTabName,
			String scanFormName, ImageIcon icon) throws RemoteException,
			MedrexException;

	public List<ScanForm> doLoadScans(int residentId, String residentTabName)
			throws RemoteException, MedrexException;

	public ScanForm getScan(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException;

	public void deleteScanForm(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException;

	public void deleteScanFile(File file) throws RemoteException,
			MedrexException;

	public Object[] getRoomHistoryDataSource(Date from, Date to)
			throws RemoteException, MedrexException;

	public int insertOrUpdateAdmissionDischargeSummary(
			AdmissionAndDischargeSummary admissionAndDischargeSummary)
			throws MedrexException, RemoteException;

	public AdmissionAndDischargeSummary getAdmissionAndDischarge(
			MonthlySummaryRecord msr) throws MedrexException, RemoteException;

	public int insertOrUpdateResidentAllergies(ResidentAllergies ref)
			throws RemoteException, MedrexException;

	public List<ResidentAllergies> getResidentAllergiesforResident(
			int residentId) throws RemoteException, MedrexException;

	public void deleteResidentAllergies(int id) throws RemoteException,
			MedrexException;

	public ResidentAllergies getResidentAllergy(int currSerial)
			throws RemoteException, MedrexException;

	public List<ResidentAllergies> getResidentAllergiesForString(String text,
			String selectedButton) throws RemoteException, MedrexException;

	public List<ResidentAllergies> getResidentAllergiesForString(
			String selectedButton) throws RemoteException, MedrexException;

	// Validation test
	public ValidationForm getRaFPg1ValidationRecord(String className)
			throws MedrexException, RemoteException;

	public int insertOrUpdateValidationForm(ValidationForm vfRef)
			throws RemoteException, MedrexException;

	public ValidationForm getValidations(int currentValidationFormKey)
			throws RemoteException, MedrexException;

	public ValidationForm getAllValidations(String selectedFormFullPath)
			throws RemoteException, MedrexException;

	public List<Users> getUsersAccordingToTriggerWords(String triggerWords)
			throws MedrexException, RemoteException;

	public List<TriggerWord> getTriggerWordCreatedAndModifiedDate(
			String triggerWords) throws MedrexException, RemoteException;

	public boolean isFormFieldAlreadyExist(String retrieveNameOf,
			String selectedFormFullPath) throws RemoteException,
			MedrexException;

	public int insertFormConfigAlert(FormConfigAlert alertRef)
			throws RemoteException, MedrexException;

	public void deleteValidationFormField(int serial) throws RemoteException,
			MedrexException;

	public List<Notes> getSelectedNotesAccToFrmAndCategories(String formName,
			List<NotesCategories> notesCategories, int residentId, Date dFrom,
			Date dTo) throws MedrexException, RemoteException;

	public void insertOrUpdateScheduling(scheduling sch)
			throws RemoteException, MedrexException;

	public List getResidentScheduling(int serial) throws RemoteException,
			MedrexException;

	public scheduling getSchedulingObject(int currentSerial)
			throws RemoteException, MedrexException;

	public String deleteScheduling(int currentSerial, String srt)
			throws RemoteException, MedrexException;

	public List<NotesCategories> getNoteCategories(int serial)
			throws RemoteException, MedrexException;

	public List<Notes> getLatestNotes(NotesCategories nc)
			throws MedrexException, RemoteException;

	public List<CareLogMaster> getCareLogMasterForResident(
			int currentResidenceKey) throws RemoteException, MedrexException;

	public int insertOrUpdateCareLog(CareLogMaster careLogMaster)
			throws RemoteException, MedrexException;

	public CareLogMaster getCareLogMaster(int careLogSerial)
			throws RemoteException, MedrexException;

	public int insertOrUpdateMsnj(MSJN refMSJN) throws RemoteException,
			MedrexException;

	public MSJN getMsnj(int currentMsjnKey) throws RemoteException,
			MedrexException;

	public int insertOrUpdateAssessingResident1(
			AssessingResident1 refAssessingResident1) throws RemoteException,
			MedrexException;

	public AssessingResident1 getAssessingResident1(
			int currentAssessingResident1) throws RemoteException,
			MedrexException;

	public int insertOrUpdateAssessingResident2(
			AssessingResident2 refAssessingResident2) throws RemoteException,
			MedrexException;

	public AssessingResident2 getAssessingResident2(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException;

	public int insertOrUpdateAssessingResident3(
			AssessingResident3 refAssessingResident3) throws RemoteException,
			MedrexException;

	public AssessingResident3 getAssessingResident3(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException;

	public int insertOrUpdatePhysicianNotes(
			PhysicianProgressNotes refPhysicianProgressNotes)
			throws RemoteException, MedrexException;

	public PhysicianProgressNotes getPhysicianProgressNotes(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException;

	public void deleteMsnj(int formId) throws RemoteException, MedrexException;

	public void deleteAccessingResident1(int formId) throws RemoteException,
			MedrexException;

	public void deleteAccessingResident2(int formId) throws RemoteException,
			MedrexException;

	public void deleteAccessingResident3(int formId) throws RemoteException,
			MedrexException;

	public void deletePhysicalProgressNotes(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateVitals(ResidentVitalSigns vital)
			throws RemoteException, MedrexException;

	public List<ResidentVitalSigns> getVitalSigns(int currentResidenceKey)
			throws RemoteException, MedrexException;

	public void deleteResidentVitalRecord(int vitalId) throws RemoteException,
			MedrexException;

	public ResidentVitalSigns getVitalSign(int currentVitalSignKey)
			throws RemoteException, MedrexException;

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfResident(
			int currentResidenceKey) throws RemoteException, MedrexException;

	public int insertOrUpdateResidentWeight(ResidentWeight resWeight)
			throws RemoteException, MedrexException;

	public List<ResidentWeight> getResidentWeights(int currentResidenceKey)
			throws RemoteException, MedrexException;

	public void deleteResidentWeightRecord(int id) throws RemoteException,
			MedrexException;

	public ResidentWeight getResidentWeightRecord(int currentResidentWeightKey)
			throws RemoteException, MedrexException;

	public ResidentWeight getResidentLatestWeight(int currentResidenceKey)
			throws RemoteException, MedrexException;

	public List<ResidentWeightBean> getResidentsWeight(Date dFrom, Date dTo,
			String withOrWithoutWeight) throws RemoteException, MedrexException;

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfLast3Weeks(
			int resId, int currentPg14Key) throws RemoteException,
			MedrexException;

	public ResidentWeight getPreviousResidentWeightRecord(
			int currentResidenceKey, int previousMonths)
			throws RemoteException, MedrexException;

	// new forms
	public ResidentInformation getResidentInformation(int currentMsjnKey)
			throws RemoteException, MedrexException;

	public int insertOrUpdateResidentInformation(
			ResidentInformation refResidentInformation) throws RemoteException,
			MedrexException;

	public void deleteResidentInformation(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateResidentTransferForm(
			ResidentTransferForm refResidentTransferForm)
			throws RemoteException, MedrexException;

	public ResidentTransferForm getResidentTransferForm(int formId)
			throws RemoteException, MedrexException;

	public int insertOrUpdateResidentStatusSheet(
			ResidentStatusSheet refResidentStatusSheet) throws RemoteException,
			MedrexException;

	public ResidentStatusSheet getResidentStatusSheet(int formId)
			throws RemoteException, MedrexException;

	public int insertOrUpdateResidentInventoryPersonalEffect(
			InventoryPersonalEffect refResidentInventoryPersonalEffect)
			throws RemoteException, MedrexException;

	public InventoryPersonalEffect getResidentInventoryPersonalEffect(int formId)
			throws RemoteException, MedrexException;

	public int insertOrUpdateResidentCarePlan(
			ResidentCarePlan refResidentCarePlan) throws RemoteException,
			MedrexException;

	public ResidentCarePlan getResidentCarePlan(int formId)
			throws RemoteException, MedrexException;

	public void deleteResidentTransferForm(int formId) throws RemoteException,
			MedrexException;

	public void deleteResidentInventoryPersonalEffectForm(int formId)
			throws RemoteException, MedrexException;

	public void deleteResidentStatusSheet(int formId) throws RemoteException,
			MedrexException;

	public void deleteResidentCarePlanForm(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateInterDisciplinaryForm(
			InterDisciplinaryCarePlan interDsc) throws RemoteException,
			MedrexException;

	public InterDisciplinaryCarePlan getInterDisciplinaryForm(int formId)
			throws RemoteException, MedrexException;

	public void deleteInterDisciplinaryCarePlanForm(int formId)
			throws RemoteException, MedrexException;

	public int insertOrUpdateDietaryAlertSheet(
			DietaryAlertSheet refDietaryAlertSheet) throws RemoteException,
			MedrexException;

	public DietaryAlertSheet getDietaryAlertSheet(int formId)
			throws RemoteException, MedrexException;

	public void deleteDietaryAlertSheet(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateInfluenzaConsentForm(
			InfluenzaConsentForm refInfluenzaConsentForm)
			throws RemoteException, MedrexException;

	public InfluenzaConsentForm getInfluenzaConsentForm(int formId)
			throws RemoteException, MedrexException;

	public void deleteInfluenzaConsentForm(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateSkilledFlowSheet(
			SkilledFlowSheet refSkilledFlowSheet) throws RemoteException,
			MedrexException;

	public SkilledFlowSheet getSkilledFlowSheet(int formId)
			throws RemoteException, MedrexException;

	public void deleteSkilledFlowSheet(int formId) throws RemoteException,
			MedrexException;

	public int insertOrUpdateAmbulationWeight(AmbulationWeight ambWeight)
			throws MedrexException, RemoteException;

	public List<AmbulationWeight> getAmbulationWeights()
			throws MedrexException, RemoteException;

	public AmbulationWeight getAmbulationWeight(int serial)
			throws MedrexException, RemoteException;

	public void deleteAmbulationWeight(int serial) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianOrderDiet(PhysicianOrderDiets refPhyDiet)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderRecord(PhysicianOrderRecord refPhyRec)
			throws MedrexException, RemoteException;

	public List<PhysicianOrderRecord> getPhysicianOrderRecords(String formType,
			int currentResidentKey) throws MedrexException, RemoteException;

	public PhysicianOrderDiets getPhysicianOrderDiet(int serial)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderRecord(int serial) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderDiet(int serial) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderTreat(
			PhysicianOrderTreatment refPhyTreat) throws MedrexException,
			RemoteException;

	public PhysicianOrderTreatment getPhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderConsultations(
			PhysicianOrderConsultations phycon) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException;

	public PhysicianOrderConsultations getPhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderDiagnosticTests(
			PhysicianOrderDiagnosticTests phytest) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderDiagnosticTests(int serial)
			throws MedrexException, RemoteException;

	public PhysicianOrderDiagnosticTests getPhysicianOrderDiagnosticTests(
			int serial) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderRespiratoryTherapy(
			PhysicianOrderRespiratoryTherapy phyresp) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderRespiratoryTherapy(int serial)
			throws MedrexException, RemoteException;

	public PhysicianOrderRespiratoryTherapy getPhysicianOrderRespiratoryTherapy(
			int serial) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderAdvanceDirectives(
			PhysicianOrderAdvanceDirectives phyadvance) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderAdvanceDirectives(int serial)
			throws MedrexException, RemoteException;

	public PhysicianOrderAdvanceDirectives getPhysicianOrderAdvanceDirectives(
			int serial) throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderMedication(
			PhysicianOrderMedication refPhysicianOrderMedication)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderMedication(
			int currentPhysicianOrderMedicationKey) throws MedrexException,
			RemoteException;

	public PhysicianOrderMedication getPhysicianOrderMedication(int formId)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderMiscellaneous(
			PhysicianOrderMiscellaneous phymisc) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderMiscellaneous(
			int currentPhysicianOrderMiscellaneouskey) throws MedrexException,
			RemoteException;

	public PhysicianOrderMiscellaneous getPhysicianOrderMiscellaneous(int serial)
			throws MedrexException, RemoteException;

	public int insertOrUpdateRehabilitationRestrorative(
			RehabilitationRestrorative refRehabilitationRestrorative)
			throws MedrexException, RemoteException;

	public RehabilitationRestrorative getRehabilitationRestrorative(int formId)
			throws MedrexException, RemoteException;

	public void deleteRehabilitationRestrorative(
			int currentRehabilitationRestrorativekey) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianOrderSafetyPrecautions(
			PhysicianOrderSafetyPrecautions physafety) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderSafetyPrecautions(
			int currentPhysicianOrderSafetyPrecautionsKey)
			throws MedrexException, RemoteException;

	public PhysicianOrderSafetyPrecautions getPhysicianOrderSafetyPrecautions(
			int formId) throws MedrexException, RemoteException;

	public int insertOrUpdateEnteralProtocal(
			PhysicianOrderEnteralProtocol refEnteralProtocol)
			throws MedrexException, RemoteException;

	public PhysicianOrderEnteralProtocol getPanelEnteralProtocol(int formId)
			throws MedrexException, RemoteException;

	public void deletePhysicianOrderEnteralProtocol(
			int currentPhysicianOrderEnteralProtocolKey)
			throws MedrexException, RemoteException;

	public int insertOrUpdateParentalNutritionalOrderForm(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm)
			throws MedrexException, RemoteException;

	public ParentalNutritionalOrderForm getParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException;

	public void deletePhysicianOrderParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException;

	public boolean isDNR(int currentResidenceKey) throws MedrexException,
			RemoteException;

	public List<PhysicianOrderMedication> getPhysicianOrderMedicationList(
			int currentResidentId) throws MedrexException, RemoteException;

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16ByResidentId(
			int currentResidenceKey) throws MedrexException, RemoteException;

	public List<Object[]> getMedicationStatusForWeek(Calendar calendar,
			String slot, int currentResidentId, int medicationSerial)
			throws MedrexException, RemoteException;

	public String getCautionaryName(Long medicationId) throws MedrexException,
			RemoteException;

	public List<String> getTimeSlot(int frequency) throws MedrexException,
			RemoteException;

	public List getPrnResidentsByFloor(String floorType)
			throws MedrexException, RemoteException;

	public List<MedicationView> getPrnMedicationsList(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public List<Medication> getMedication() throws MedrexException,
			RemoteException;

	public List<Medication> getMedication(String text, String selectedButton)
			throws MedrexException, RemoteException;

	public List<Medication> getMedication(String selectedButton)
			throws MedrexException, RemoteException;

	public int insertOrUpdatePRN(PRNmedication prn) throws MedrexException,
			RemoteException;

	public List<Object[]> getMedicationFrequencies() throws MedrexException,
			RemoteException;

	public int insertOrUpdateDialysisRecord(DialysisRecord dialysisRecord)
			throws MedrexException, RemoteException;

	public DialysisRecord getDialysisRecord(int currentDialysisRecordKey)
			throws MedrexException, RemoteException;

	public void deleteDialysisRecord(int id) throws MedrexException,
			RemoteException;

	public List<DialysisRecord> getDialysisRecords(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public int insertOrUpdateNursesNotes(NursesNotesRecord nursesSum)
			throws MedrexException, RemoteException;

	public NursesNotesRecord getNursesNotesRecord(
			int currentNursesNotesRecordKey) throws MedrexException,
			RemoteException;

	public List<NursesNotesRecord> getNursesNotesRecords(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public void deleteNursesNotes(int formId) throws MedrexException,
			RemoteException;

	public Long insertOrUpdateTreatments(Treatment treatment)
			throws MedrexException, RemoteException;

	public Treatment getTreatment(long currentTreatmentKey)
			throws MedrexException, RemoteException;

	public List<Treatment> getAllTreatments() throws MedrexException,
			RemoteException;

	public void deleteTreatment(long id) throws MedrexException,
			RemoteException;

	public int insertOrUpdatePhysicianOrderTreatmentTemp(
			PhysicianOrderTreatmentTemp refphysicianOrderTreatmentTemp)
			throws MedrexException, RemoteException;

	public PhysicianOrderTreatmentTemp getPhysicianOrderTreatmentTemp(int formId)
			throws MedrexException, RemoteException;

	public List getTreatmentHistoryTimes() throws MedrexException,
			RemoteException;

	public List getCurrentSlotTimeforTreatment(String floorType)
			throws MedrexException, RemoteException;

	public List<TreatmentView> getTreatmentsList(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public List<ResidentDiagnosis> getResidentDiagnosissByConfirm(int resId)
			throws MedrexException, RemoteException;

	public String getUserNameById(int userid) throws MedrexException,
			RemoteException;

	public void insertOrUpdateMDS3(Mds3 mds3) throws MedrexException,
			RemoteException;

	public void deleteMDS3(int id) throws MedrexException, RemoteException;

	public List getMDS3Sections(int currentResidenceKey)
			throws MedrexException, RemoteException;

	public Mds3 getMds3(int serial) throws MedrexException, RemoteException;

	public ArrayList<Notes> getNotesList(int userid, Date from, Date dcto,
			int start_index) throws MedrexException, RemoteException;

	public void insertOrUpdateForm(int formId, int selectedTabId)
			throws MedrexException, RemoteException;

	public int getFormIdByName(String selectedNode) throws MedrexException,
			RemoteException;

	// for Schedule---------------------------------------
	public int insertOrUpdateSchedule(Schedule sh) throws MedrexException,
			RemoteException;

	public List<Schedule> getScheduleRecords() throws MedrexException,
			RemoteException;

	public void insertOrUpdateUserSchedule(UserSchedule userschedule)
			throws MedrexException, RemoteException;

	public UserSchedule getUserScheduleRecord(int userID, int scheduleID,
			Date onDate) throws MedrexException, RemoteException;

	// for activator --------------------------------------
	public int insertOrUpdateActivationLicense(ActivationLicense license)
			throws MedrexException, RemoteException;

	public boolean isActivationLicenseValid() throws MedrexException,
			RemoteException;

	public void deleteActivationLicense(int serial) throws MedrexException,
			RemoteException;

	public List<ActivationLicense> getActivationLicenses()
			throws MedrexException, RemoteException;

	public ActivationLicense getActivationLicense(int serial)
			throws MedrexException, RemoteException;

	public ActivationLicense getActivationLicense(Date forDate)
			throws MedrexException, RemoteException;

	public void insertOrUpdateUserSchedules(List<UserSchedule> us)
			throws MedrexException, RemoteException;

	public List<Tab> getAllTabs() throws MedrexException, RemoteException;

	public List<FormPage> getAllFormPages(String text) throws MedrexException,
			RemoteException;

	public FormPage getFormPageWithId(int currSerial) throws MedrexException,
			RemoteException;

	public void insertOrUpdateFormPage(FormPage currref)
			throws MedrexException, RemoteException;

	public void insertOrUpdateForm_formPage(int formId, int parentid,
			boolean isNew) throws MedrexException, RemoteException;

	public List<FormPage> getAllForms() throws MedrexException, RemoteException;

	public List<Accurities> getAccuritiesListByDateTemp(Date d)
			throws MedrexException, RemoteException;

	public void deleteForm_formPage(int form_pageSerial, int form_serial)
			throws MedrexException, RemoteException;

	public Map<String, Object> getAccutiesByDate(String dt)
			throws MedrexException, RemoteException;

	public void deleteScheduleRecord(int scheduleSerial)
			throws MedrexException, RemoteException;

	public UserSchedule getUserScheduleRecordByDay(int userId, int scheduleId,
			int day)throws MedrexException, RemoteException;

	public int insertOrUpdatePhysicianOrderTherapyTest(
			PhysicianOrderTherapyTest phytherapy)
	throws MedrexException, RemoteException;

	public void deletePhysicianOrderTherapyTest(int currentPhysicianOrderTherapyTestkey)
	throws MedrexException, RemoteException;

	public PhysicianOrderTherapyTest getPhysicianOrderTherapyTest(int formId)
	throws MedrexException, RemoteException;

}

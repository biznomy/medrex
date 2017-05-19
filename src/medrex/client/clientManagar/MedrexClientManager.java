package medrex.client.clientManagar;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import medrex.client.FrameMedrexServerMessage;
import medrex.client.constants.Global;
import medrex.client.updater.FrameClientUpdater;
import medrex.client.updater.FrameStandaloneUpdater;
import medrex.commons.dataObj.Rooms;
import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.enums.CensusConstants;
//import medrex.commons.enums.MDSAssessmentTypes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.MedrexIntf;
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

public class MedrexClientManager {

	private static String args[];
	private static MedrexClientManager clientManagerObj = null;
	private static MedrexIntf medrexInterface = null;
	public static String selectedSource = "Local Server";
	private static long dateTimeofServer = 0;
	private static long dateTimeOfClient = 0;
	private static long timeDifference = 0;
	private static Date serverTime = null;

	private MedrexClientManager() {
	}

	// getInstance method//
	public static synchronized MedrexClientManager getInstance() {
		if (clientManagerObj == null) {
			clientManagerObj = new MedrexClientManager();
		}
		return (clientManagerObj);
	}

	private static void setRegistry() {
		try {
			if (args.length > 0) {
				if (System.getSecurityManager() == null) {
					System.setSecurityManager(new SecurityManager());
				}
				try {
					Registry registry = LocateRegistry.getRegistry(args[0]);
					medrexInterface = (MedrexIntf) registry.lookup("medrex");
					// System.out.println("Message: "+object.residentInfo());
				} catch (Exception e) {
					System.out.println("Medrex Client Exception:");
					e.printStackTrace();
				}
				// Global.ltcServer = medrexInterface;
			} else {
				medrexInterface = new medrex.server.MedrexServer(false);
				System.out.println("Time Differenece is:" + timeDifference);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// for connection eithor local or internet
	public static void connect() {
		if (args.length == 1) {
			if (getRmiConnection(args)) {
				if (medrexInterface != null) {
					selectedSource = "Local Server";
					updateVersion();
				}
			} else {
				new FrameMedrexServerMessage();
			}
		} else {
			if (args.length == 0) {
				Global.IS_STANDALONE = true;
				selectedSource = "Local Server";
				updateStandaloneVersion();
				medrexInterface = new medrex.server.MedrexServer(false);
				return;
			}
			if (args.length == 2) {
				if (getRmiConnection(args)) {
					if (medrexInterface != null) {
						if (args[1].toString().trim().equalsIgnoreCase("Local")) {
							selectedSource = "Local Server";
						} else if (args[1].toString().trim().equalsIgnoreCase(
								"Internet")) {
							selectedSource = "Internet";
						}
						updateVersion();
					}
				} else {
					new FrameMedrexServerMessage();
				}
			}
		}
	}

	public static boolean isConnected() {
		if (medrexInterface != null) {
			return true;
		}
		return false;
	}

	public static Date getServerTime() {
		if (isConnected()) {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.MILLISECOND, (int) timeDifference);
			return calendar.getTime();
		}
		return (new Date());
	}

	private static boolean getRmiConnection(String strArg[]) {
		boolean rmiConn = false;
		try {
			MedrexIntf refMedrexInterface = null;
			if (strArg.length > 0) {
				if (System.getSecurityManager() == null) {
					System.setSecurityManager(new SecurityManager());
				}
				try {
					Registry registry = LocateRegistry.getRegistry(strArg[0]);
					refMedrexInterface = (MedrexIntf) registry.lookup("medrex");
					refMedrexInterface.getAllRoles();
					rmiConn = true;
				} catch (Exception e) {
					System.out.println("Medrex Client Exception:");
					e.printStackTrace();
					rmiConn = false;
				}
				medrexInterface = refMedrexInterface;

				Date serverDate = medrexInterface.getDateOfServer();
				dateTimeofServer = serverDate.getTime();
				dateTimeOfClient = (new Date()).getTime();
				timeDifference = (dateTimeofServer - dateTimeOfClient);
				// getServerTime();
				// System.out.println("Date Time of Server in milli seconds is : "+dateTimeofServer);
				// System.out.println("Date Time of Client in milli seconds is : "+dateTimeOfClient);
				// System.out.println("Time Difference is : "+timeDifference);
				// System.out.println("New Synchronized date is : "+serverTime);
			}

		} catch (Exception e) {
			rmiConn = false;
		}
		return rmiConn;
	}

	private static void updateVersion() {
		try {
			if (selectedSource == null) {
				selectedSource = "Internet";
			}
			if (selectedSource.trim().equalsIgnoreCase("")) {
				selectedSource = "Internet";
			}
			if (selectedSource != null) {
				if (!FrameClientUpdater.isLatestVersion()) {
					FrameClientUpdater updater = new FrameClientUpdater();
					updater.updateVersion();
					updater.downloadMedrex();
					updater.extractMedrex();
					System.out.println("download complete");
					JOptionPane.showMessageDialog(null,
							"Medrex Updated. Please restart the application");
					updater.dispose();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateStandaloneVersion() {
		try {
			if (selectedSource == null) {
				selectedSource = "Local";
			}
			if (selectedSource.trim().equalsIgnoreCase("")) {
				selectedSource = "Local";
			}
			if (selectedSource != null) {
				if (!FrameStandaloneUpdater.isLatestVersion()) {
					FrameStandaloneUpdater updater = new FrameStandaloneUpdater();
					updater.updateVersion();
					updater.downloadMedrex();
					updater.extractMedrex();
					System.out.println("download complete");
					JOptionPane
							.showMessageDialog(
									null,
									" Medrex Standalone Updated. Please restart the application. If needed update database from Admin ");
					updater.dispose();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String[] getArgs() {
		return args;
	}

	public static void setArgs(String[] args) {
		MedrexClientManager.args = args;
	}

	// server methods.........

	public int getMasterList(Class cls, String retrieveString)
			throws MedrexException, RemoteException {
		return medrexInterface.getMasterList(cls, retrieveString);
	}

	public int insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateResidentMain(residentMain);
	}

	/*
	 * public int insertOrUpdateRoomHistory(RoomHistory roomHistory) throws
	 * MedrexException, RemoteException { return
	 * medrexInterface.insertOrUpdateRoomHistory(roomHistory); }
	 */

	public int insertOrUpdateRoomHistory(TempRoomHistory roomHistory)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateRoomHistory(roomHistory);
	}

	public List<TempRoomHistory> getRoomHistory(Date from, Date to)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistory(from, to);
	}

	public List<RoomHistory> getRoomHistory(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistory(residentId);
	}

	/*
	 * public RoomHistory getRoomHistory(int residentId, Date date) throws
	 * MedrexException, RemoteException { return
	 * medrexInterface.getRoomHistory(residentId, date); }
	 */

	public TempRoomHistory getRoomHistory(int residentId, Date date)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistory(residentId, date);
	}

	public List<Rooms> getResidentCountAuditInfo(List<CountAuditFloor> records,
			Date searchDate) throws MedrexException, RemoteException {
		return medrexInterface.getResidentCountAuditInfo(records, searchDate);
	}

	/*
	 * public RoomHistory getLastRoomHistory(int residentId) throws
	 * MedrexException, RemoteException { return
	 * medrexInterface.getLastRoomHistory(residentId); }
	 */

	public TempRoomHistory getLastRoomHistory(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getLastRoomHistory(residentId);
	}

	public List<TempRoomHistory> getRoomHistories(Date dateAndTime)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistories(dateAndTime);
	}

	public TempRoomHistory getRoomHistoriesForResident(int residentId,
			Date dateAndTime) throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistoriesForResident(residentId,
				dateAndTime);
	}

	public List<TempRoomHistory> getRoomHistoriesForResident(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomHistoriesForResident(residentId);
	}

	public TempRoomHistory getRoomForResident(int residentId,
			Date currentDateAndTime) throws MedrexException, RemoteException {
		return medrexInterface.getRoomForResident(residentId,
				currentDateAndTime);
	}

	public List<Rooms> getRoomStatusForResidents(Date dateAndTime)
			throws MedrexException, RemoteException {
		return medrexInterface.getRoomStatusForResidents(dateAndTime);
	}

	public List<Rooms> getRoomStatusForResidents(Date dateAndTime,
			String floorType) throws MedrexException, RemoteException {
		return medrexInterface
				.getRoomStatusForResidents(dateAndTime, floorType);
	}

	public List getResidentMain() throws MedrexException, RemoteException {
		return medrexInterface.getResidentMain();
	}

	public List getResidentMain(String status) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidentMain(status);
	}

	public List getResidents(String find, String firstName, String SS1,
			String status) throws MedrexException, RemoteException {
		return medrexInterface.getResidents(find, firstName, SS1, status);
	}

	public List getResidents(String floorType) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidents(floorType);
	}

	public ResidentMain getResident(String lastName, String firstName,
			String SSN) throws MedrexException, RemoteException {
		return medrexInterface.getResident(lastName, firstName, SSN);
	}

	public int updateInsuranceCount(int resId) throws MedrexException,
			RemoteException {
		return medrexInterface.updateInsuranceCount(resId);
	}

	public ResidentMain getResident(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getResident(serial);
	}

	public boolean getResidentExistInHouse(int resientId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentExistInHouse(resientId);
	}

	public List<Rooms> getFirstFloorResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getFirstFloorResidents();
	}

	public List<Rooms> getSecondFloorResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getSecondFloorResidents();
	}

	public List getFirstFloorResidents(Date date) throws MedrexException,
			RemoteException {
		return medrexInterface.getFirstFloorResidents(date);
	}

	public List getSecondFloorResidents(Date date) throws MedrexException,
			RemoteException {
		return medrexInterface.getSecondFloorResidents(date);
	}

	public List getOccupiedRoom() throws MedrexException, RemoteException {
		return medrexInterface.getOccupiedRoom();
	}

	public int insertOrUpdateResidentPayer(ResidentPayer residentPayer)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateResidentPayer(residentPayer);
	}

	public int insertOrUpdateResidentPayerNew(ResidentPayerNew residentPayerNew)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateResidentPayerNew(residentPayerNew);
	}

	public List getResidentPayers(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidentPayers(residentSerial);
	}

	public List getResidentPayersNew(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentPayersNew(residentSerial);
	}

	public ResidentPayerNew getPayerInfoStatusNewByResidentId(
			ResidentMain residentId) throws MedrexException, RemoteException {
		return medrexInterface.getPayerInfoStatusNewByResidentId(residentId);
	}

	public ResidentPayer getResidentPayer(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidentPayer(serial);
	}

	public void deleteResidentPayer(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteResidentPayer(serial);
	}

	public void deleteResidentPayerNew(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteResidentPayerNew(serial);
	}

	public int insertOrUpdateResidentContact(ResidentContact residentContact)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateResidentContact(residentContact);
	}

	public ResidentContact getResidentContact(String lastName, String firstName)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContact(lastName, firstName);
	}

	public List getResidentContacts(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidentContacts(residentSerial);
	}

	public List getResidentContactsWithSignature(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContactsWithSignature(residentSerial);
	}

	public List getResidentContactsWithSignature(int residentSerial,
			String likeStr) throws MedrexException, RemoteException {
		return medrexInterface.getResidentContactsWithSignature(residentSerial,
				likeStr);
	}

	public List getResidentContacts(int residentSerial, String likeStr)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContacts(residentSerial, likeStr);
	}

	public ResidentContact getResidentContact(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContact(serial);
	}

	public void deleteResidentContact(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteResidentContact(serial);
	}

	public int insertOrUpdateResidentContactPhone(
			ResidentContactPhone residentContactPhone) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentContactPhone(residentContactPhone);
	}

	public List getResidentContactPhones(int residentContactSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContactPhones(residentContactSerial);
	}

	public ResidentContactPhone getResidentContactPhone(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentContactPhone(serial);
	}

	public ResidentContactPhone getResidentContactPhonePrimary(
			int residentContactSerial) throws MedrexException, RemoteException {
		return medrexInterface
				.getResidentContactPhonePrimary(residentContactSerial);
	}

	public void deleteResidentContactPhone(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteResidentContactPhone(serial);
	}

	public void deleteAllPhonesForContact(int residentContactSerial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteAllPhonesForContact(residentContactSerial);
	}

	public int insertOrUpdateAdmissionsRecord(AdmissionsRecord residentPayer)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateAdmissionsRecord(residentPayer);
	}

	public List getAdmissionsRecords(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionsRecords(residentSerial);
	}

	public AdmissionsRecord getAdmissionsRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionsRecord(serial);
	}

	public void deleteAdmissionsRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAdmissionsRecord(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage1(
			ResidentAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage1(rafp1);
	}

	public List getResidentAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage1s(residentSerial);
	}

	public ResidentAssessmentFormPage1 getResidentAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage1(serial);
	}

	public void deleteResidentAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage1(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage2(
			ResidentAssessmentFormPage2 rafp2) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage2(rafp2);
	}

	public ResidentAssessmentFormPage2 getResidentAssessmentFormPage2(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage2(formId);
	}

	public void deleteResidentAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage2(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage3(
			ResidentAssessmentFormPage3 rafp3) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage3(rafp3);
	}

	public ResidentAssessmentFormPage3 getResidentAssessmentFormPage3(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage3(formId);
	}

	public void deleteResidentAssessmentFormPage3(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage3(serial);
	}

	public int insertOrUpdatePressureSoreAssessment(PressureSoreAssessment psa)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePressureSoreAssessment(psa);
	}

	public PressureSoreAssessment getPressureSoreAssessment(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPressureSoreAssessment(formId, formNum);
	}

	public int insertOrUpdateResidentAssessmentFormPage4(
			ResidentAssessmentFormPage4 rafp4) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage4(rafp4);
	}

	public ResidentAssessmentFormPage4 getResidentAssessmentFormPage4(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage4(formId);
	}

	public void deleteResidentAssessmentFormPage4(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage4(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage5(
			ResidentAssessmentFormPage5 rafp5) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage5(rafp5);
	}

	public ResidentAssessmentFormPage5 getResidentAssessmentFormPage5(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage5(formId);
	}

	public void deleteResidentAssessmentFormPage5(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage5(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage6(
			ResidentAssessmentFormPage6 rafp6) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage6(rafp6);
	}

	public ResidentAssessmentFormPage6 getResidentAssessmentFormPage6(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage6(formId);
	}

	public void deleteResidentAssessmentFormPage6(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage6(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage7(
			ResidentAssessmentFormPage7 rafp7) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage7(rafp7);
	}

	public ResidentAssessmentFormPage7 getResidentAssessmentFormPage7(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage7(formId);
	}

	public void deleteResidentAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage7(serial);
	}

	public int insertOrUpdatePainAssessment(PainAssessment painAssessment)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePainAssessment(painAssessment);
	}

	public PainAssessment getPainAssessment(int formId, int formNum)
			throws MedrexException, RemoteException {
		return medrexInterface.getPainAssessment(formId, formNum);
	}

	public void deletePainAssessment(int formId) throws MedrexException,
			RemoteException {
		medrexInterface.deletePainAssessment(formId);
	}

	public int insertOrUpdateResidentAssessmentFormPage8(
			ResidentAssessmentFormPage8 rafp8) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage8(rafp8);
	}

	public ResidentAssessmentFormPage8 getResidentAssessmentFormPage8(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage8(formId);
	}

	public void deleteResidentAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage8(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage9(
			ResidentAssessmentFormPage9 rafp9) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateResidentAssessmentFormPage9(rafp9);
	}

	public ResidentAssessmentFormPage9 getResidentAssessmentFormPage9(
			int formIdf) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage9(formIdf);
	}

	public void deleteResidentAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage9(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage10(
			ResidentAssessmentFormPage10 rafp10) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage10(rafp10);
	}

	public ResidentAssessmentFormPage10 getResidentAssessmentFormPage10(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage10(formId);
	}

	public void deleteResidentAssessmentFormPage10(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage10(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage11(
			ResidentAssessmentFormPage11 rafp11) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage11(rafp11);
	}

	public ResidentAssessmentFormPage11 getResidentAssessmentFormPage11(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage11(formId);
	}

	public void deleteResidentAssessmentFormPage11(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage11(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage12(
			ResidentAssessmentFormPage12 rafp12) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage12(rafp12);
	}

	public ResidentAssessmentFormPage12 getResidentAssessmentFormPage12(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage12(formId);
	}

	public void deleteResidentAssessmentFormPage12(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage12(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage13(
			ResidentAssessmentFormPage13 rafp13) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage13(rafp13);
	}

	public List<ResidentAssessmentFormPage13> getResidentAssessmentFormPage13(
			int resdentId, int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage13(resdentId,
				formId);
	}

	public void deleteResidentAssessmentFormPage13(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage13(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage14(
			ResidentAssessmentFormPage14 residentAssessmentFormPage14)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage14(residentAssessmentFormPage14);
	}

	public ResidentAssessmentFormPage14 getResidentAssessmentFormPage14(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage14(formId);
	}

	public void deleteResidentAssessmentFormPage14(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage14(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage15(
			ResidentAssessmentFormPage15 residentAssessmentFormPage15)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage15(residentAssessmentFormPage15);
	}

	public ResidentAssessmentFormPage15 getResidentAssessmentFormPage15(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage15(formId);
	}

	public void deleteResidentAssessmentFormPage15(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage15(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage16(
			ResidentAssessmentFormPage16 residentAssessmentFormPage16)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage16(residentAssessmentFormPage16);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage16(formId);
	}

	public void deleteResidentAssessmentFormPage16(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage16(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage17(
			ResidentAssessmentFormPage17 residentAssessmentFormPage17)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage17(residentAssessmentFormPage17);
	}

	public ResidentAssessmentFormPage17 getResidentAssessmentFormPage17(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage17(formId);
	}

	public void deleteResidentAssessmentFormPage17(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage17(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage18(
			ResidentAssessmentFormPage18 residentAssessmentFormPage18)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage18(residentAssessmentFormPage18);
	}

	public ResidentAssessmentFormPage18 getResidentAssessmentFormPage18(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage18(formId);
	}

	public void deleteResidentAssessmentFormPage18(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage18(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage19(
			ResidentAssessmentFormPage19 refResidentAssessmentForm19)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage19(refResidentAssessmentForm19);
	}

	public void deleteResidentAssessmentFormPage19(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage19(formId);
	}

	public void deleteResidentAssessmentFormPage19Col(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage19Col(formId);
	}

	public int insertOrUpdateResidentAssessmentFormPage20(
			ResidentAssessmentFormPage20 refResidentAssessmentForm20)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage20(refResidentAssessmentForm20);
	}

	public ResidentAssessmentFormPage20 getResidentAssessmentFormPage20(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentAssessmentFormPage20(formId);
	}

	public void deleteResidentAssessmentFormPage20(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage20(formId);
	}

	public int insertOrUpdateResidentAssessmentFormPage21(
			ResidentAssessmentFormPage21 refResidentAssessmentFormPage21)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage21(refResidentAssessmentFormPage21);
	}

	public ResidentAssessmentFormPage21 getResidentAssessmentFormPage21(
			int currentResidentAssessmentFormPage21Key) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getResidentAssessmentFormPage21(currentResidentAssessmentFormPage21Key);
	}

	public int insertOrUpdateResidentAssessmentFormPage22(
			ResidentAssessmentFormPage22 refResidentAssessmentFormPage22)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentAssessmentFormPage22(refResidentAssessmentFormPage22);
	}

	public ResidentAssessmentFormPage22 getResidentAssessmentFormPage22(
			int currentResidentAssessmentFormKey) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getResidentAssessmentFormPage22(currentResidentAssessmentFormKey);
	}

	public void deleteResidentAssessmentFormPage22(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage22(formId);
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage7(
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentQuarterlyAssessmentFormPage7(residentQuarterlyAssessmentFormPage7);
	}

	public ResidentQuarterlyAssessmentFormPage7 getResidentQuarterlyAssessmentFormPage7(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentQuarterlyAssessmentFormPage7(formId);
	}

	public void deleteResidentQuarterlyAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentQuarterlyAssessmentFormPage7(serial);
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage8(
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentQuarterlyAssessmentFormPage8(residentQuarterlyAssessmentFormPage8);
	}

	public ResidentQuarterlyAssessmentFormPage8 getResidentQuarterlyAssessmentFormPage8(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentQuarterlyAssessmentFormPage8(formId);
	}

	public void deleteResidentQuarterlyAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentQuarterlyAssessmentFormPage8(serial);
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage9(
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentQuarterlyAssessmentFormPage9(residentQuarterlyAssessmentFormPage9);
	}

	public ResidentQuarterlyAssessmentFormPage9 getResidentQuarterlyAssessmentFormPage9(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getResidentQuarterlyAssessmentFormPage9(formId);
	}

	public void deleteResidentQuarterlyAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentQuarterlyAssessmentFormPage9(serial);
	}

	public int insertOrUpdateActivitysRecord(ActivitysRecord residentPayer)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateActivitysRecord(residentPayer);
	}

	public List getActivitysRecords(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getActivitysRecords(residentSerial);
	}

	public ActivitysRecord getActivitysRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getActivitysRecord(serial);
	}

	public void deleteActivitysRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteActivitysRecord(serial);
	}

	public int insertOrUpdateMedicationTreatmentForm(
			MedicationTreatmentForm residentPayer) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationTreatmentForm(residentPayer);
	}

	public List getMedicationTreatmentForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationTreatmentForms(residentSerial);
	}

	public MedicationTreatmentForm getMedicationTreatmentForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationTreatmentForm(serial);
	}

	public MedicationTreatmentForm getMedicationTreatmentFormCurrentWhere(
			int residentSerial, String type) throws MedrexException,
			RemoteException {
		return medrexInterface.getMedicationTreatmentFormCurrentWhere(
				residentSerial, type);
	}

	public void deleteMedicationTreatmentForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationTreatmentForm(serial);
	}

	public int insertOrUpdateActivityInitialAssessmentFormPage1(
			ActivityInitialAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateActivityInitialAssessmentFormPage1(rafp1);
	}

	public List getActivityInitialAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getActivityInitialAssessmentFormPage1s(residentSerial);
	}

	public ActivityInitialAssessmentFormPage1 getActivityInitialAssessmentFormPage1(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getActivityInitialAssessmentFormPage1(serial);
	}

	public void deleteActivityInitialAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteActivityInitialAssessmentFormPage1(serial);
	}

	public int insertOrUpdateActivityAssessmentFormPage2(
			ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateActivityAssessmentFormPage2(reflActivityAssessmentFormPage2);
	}

	public List getActivityAssessmentFormPage2s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getActivityAssessmentFormPage2s(residentSerial);
	}

	public ActivityAssessmentFormPage2 getActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getActivityAssessmentFormPage2(serial);
	}

	public void deleteActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteActivityAssessmentFormPage2(serial);
	}

	public int insertOrUpdatePainManagementRecordFormPage1(
			PainManagementRecordFormPage1 pmrP1) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePainManagementRecordFormPage1(pmrP1);
	}

	public List getPainManagementRecordFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getPainManagementRecordFormPage1s(residentSerial);
	}

	public PainManagementRecordFormPage1 getPainManagementRecordFormPage1(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getPainManagementRecordFormPage1(serial);
	}

	public void deletePainManagementRecordFormPage1(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePainManagementRecordFormPage1(serial);
	}

	public void deletePainManagementRecordFormPage1Row(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deletePainManagementRecordFormPage1Row(formId);
	}

	public int insertOrUpdatePainManagementRecordRow(PainManagementRecordRow psa)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePainManagementRecordRow(psa);
	}

	public PainManagementRecordRow getPainManagementRecordRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPainManagementRecordRow(formId, formNum);
	}

	public int insertOrUpdateNurseTreatmentNotesForm(
			NurseTreatmentNotesForm ntnf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseTreatmentNotesForm(ntnf);
	}

	public List getNurseTreatmentNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesForms(residentSerial);
	}

	public NurseTreatmentNotesForm getNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesForm(serial);
	}

	public void deleteNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseTreatmentNotesForm(serial);
	}

	public void deleteNurseMedicationNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseMedicationNotesFormRow(formId);
	}

	public void deleteNurseMedicationNotesFormRow1(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseMedicationNotesFormRow1(formId);
	}

	public void deleteNurseTreatmentNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseTreatmentNotesFormRow(formId);
	}

	public void deleteNurseTreatmentNotesFormRow1(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseTreatmentNotesFormRow1(formId);
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow(
			NurseTreatmentNotesFormRow ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	public void insertOrUpdateNurseTreatmentNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	public NurseTreatmentNotesFormRow getNurseTreatmentNotesFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesFormRow(formId, formNum);
	}

	public List getNurseTreatmentNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesFormRows(formId);
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow1(
			NurseTreatmentNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	public void insertOrUpdateNurseTreatmentNotesFormRow1(List ntnfr)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	public List getNurseTreatmentNotesFormRow1s(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesFormRow1s(formId);
	}

	public NurseTreatmentNotesFormRow1 getNurseTreatmentNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getNurseTreatmentNotesFormRow1(formId, formNum);
	}

	public int insertOrUpdatePressureSoreRecordForm(PressureSoreRecordForm psrf)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePressureSoreRecordForm(psrf);
	}

	public List getPressureSoreRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPressureSoreRecordForms(residentSerial);
	}

	public PressureSoreRecordForm getPressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPressureSoreRecordForm(serial);
	}

	public void deletePressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePressureSoreRecordForm(serial);
	}

	public void deletePressureSoreRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deletePressureSoreRecordFormRow(formId);
	}

	public int insertOrUpdatePressureSoreRecordFormRow(
			PressureSoreRecordFormRow psrfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdatePressureSoreRecordFormRow(psrfr);
	}

	public PressureSoreRecordFormRow getPressureSoreRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPressureSoreRecordFormRow(formId, formNum);
	}

	public int insertOrUpdateNurseMedicationNotesForm(
			NurseMedicationNotesForm nmnf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseMedicationNotesForm(nmnf);
	}

	public List getNurseMedicationNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesForms(residentSerial);
	}

	public List getNurseMedicationNotesForms() throws MedrexException,
			RemoteException {
		return medrexInterface.getNurseMedicationNotesForms();
	}

	public NurseMedicationNotesForm getNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesForm(serial);
	}

	public void deleteNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteNurseMedicationNotesForm(serial);
	}

	public int insertOrUpdateNurseMedicationNotesFormRow(
			NurseMedicationNotesFormRow ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseMedicationNotesFormRow(ntnfr);
	}

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRow(formId, formNum);
	}

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum, Date currentDate) throws MedrexException,
			RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRow(formId, formNum,
				currentDate);
	}

	public List getNurseMedicationNotesFormRow(int formId, Date currentDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRow(formId,
				currentDate);
	}

	public int insertOrUpdateNurseMedicationNotesFormRow1(
			NurseMedicationNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateNurseMedicationNotesFormRow1(ntnfr);
	}

	public NurseMedicationNotesFormRow1 getNurseMedicationNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRow1(formId, formNum);
	}

	public int insertOrUpdateMedicationAdministrationRecordForm(
			MedicationAdministrationRecordForm marf) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationAdministrationRecordForm(marf);
	}

	public List getMedicationAdministrationRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getMedicationAdministrationRecordForms(residentSerial);
	}

	public MedicationAdministrationRecordForm getMedicationAdministrationRecordForm(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getMedicationAdministrationRecordForm(serial);
	}

	public void deleteMedicationAdministrationRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationAdministrationRecordForm(serial);
	}

	public void deleteMedicationAdministrationRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationAdministrationRecordFormCol(formId);
	}

	public int insertOrUpdateMedicationAdministrationRecordFormCol(
			MedicationAdministrationRecordFormCol marfc)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationAdministrationRecordFormCol(marfc);
	}

	public MedicationAdministrationRecordFormCol getMedicationAdministrationRecordFormCol(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getMedicationAdministrationRecordFormCol(formId,
				formNum);
	}

	public int insertOrUpdateMedicationPRNRecordForm(
			MedicationPRNRecordForm mprnrf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateMedicationPRNRecordForm(mprnrf);
	}

	public List getMedicationPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationPRNRecordForms(residentSerial);
	}

	public MedicationPRNRecordForm getMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationPRNRecordForm(serial);
	}

	public void deleteMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationPRNRecordForm(serial);
	}

	public void deleteMedicationPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationPRNRecordFormRow(formId);
	}

	public void deleteMedicationPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationPRNRecordFormCol(formId);
	}

	public int insertOrUpdateMedicationPRNRecordFormRow(
			MedicationPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationPRNRecordFormRow(mprnrfr);
	}

	public MedicationPRNRecordFormRow getMedicationPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getMedicationPRNRecordFormRow(formId, formNum);
	}

	public int insertOrUpdateMedicationPRNRecordFormCol(
			MedicationPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationPRNRecordFormCol(mprnrfc);
	}

	public MedicationPRNRecordFormCol getMedicationPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException {
		return medrexInterface.getMedicationPRNRecordFormCol(formId, row, col);
	}

	public int insertOrUpdateMedicationRoutineRecordForm(
			MedicationRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationRoutineRecordForm(mprnrf);

	}

	public List getMedicationRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationRoutineRecordForms(residentSerial);
	}

	public MedicationRoutineRecordForm getMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationRoutineRecordForm(serial);
	}

	public void deleteMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationRoutineRecordForm(serial);
	}

	public void deleteMedicationRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationRoutineRecordFormRow(formId);
	}

	public void deleteMedicationRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMedicationRoutineRecordFormCol(formId);
	}

	public int insertOrUpdateMedicationRoutineRecordFormRow(
			MedicationRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationRoutineRecordFormRow(mprnrfr);
	}

	public MedicationRoutineRecordFormRow getMedicationRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getMedicationRoutineRecordFormRow(formId,
				formNum);
	}

	public int insertOrUpdateMedicationRoutineRecordFormCol(
			MedicationRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateMedicationRoutineRecordFormCol(mprnrfc);
	}

	public MedicationRoutineRecordFormCol getMedicationRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException {
		return medrexInterface.getMedicationRoutineRecordFormCol(formId, row,
				col);
	}

	public int insertOrUpdateTreatmentPRNRecordForm(
			TreatmentPRNRecordForm mprnrf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateTreatmentPRNRecordForm(mprnrf);
	}

	public List getTreatmentPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentPRNRecordForms(residentSerial);
	}

	public TreatmentPRNRecordForm getTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentPRNRecordForm(serial);
	}

	public void deleteTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentPRNRecordForm(serial);
	}

	public void deleteTreatmentPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentPRNRecordFormRow(formId);
	}

	public void deleteTreatmentPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentPRNRecordFormCol(formId);
	}

	public int insertOrUpdateTreatmentPRNRecordFormRow(
			TreatmentPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateTreatmentPRNRecordFormRow(mprnrfr);
	}

	public TreatmentPRNRecordFormRow getTreatmentPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentPRNRecordFormRow(formId, formNum);
	}

	public int insertOrUpdateTreatmentPRNRecordFormCol(
			TreatmentPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateTreatmentPRNRecordFormCol(mprnrfc);
	}

	public TreatmentPRNRecordFormCol getTreatmentPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentPRNRecordFormCol(formId, row, col);
	}

	public int insertOrUpdateTreatmentRoutineRecordForm(
			TreatmentRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateTreatmentRoutineRecordForm(mprnrf);
	}

	public List getTreatmentRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentRoutineRecordForms(residentSerial);
	}

	public TreatmentRoutineRecordForm getTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentRoutineRecordForm(serial);
	}

	public void deleteTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentRoutineRecordForm(serial);
	}

	public void deleteTreatmentRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentRoutineRecordFormRow(formId);
	}

	public void deleteTreatmentRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteTreatmentRoutineRecordFormCol(formId);
	}

	public int insertOrUpdateTreatmentRoutineRecordFormRow(
			TreatmentRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateTreatmentRoutineRecordFormRow(mprnrfr);
	}

	public TreatmentRoutineRecordFormRow getTreatmentRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface
				.getTreatmentRoutineRecordFormRow(formId, formNum);
	}

	public int insertOrUpdateTreatmentRoutineRecordFormCol(
			TreatmentRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateTreatmentRoutineRecordFormCol(mprnrfc);
	}

	public TreatmentRoutineRecordFormCol getTreatmentRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException {
		return medrexInterface.getTreatmentRoutineRecordFormCol(formId, row,
				col);
	}

	public int insertOrUpdateDietary(Dietary dietary) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateDietary(dietary);
	}

	public List getDietarys(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietarys(residentSerial);
	}

	public Dietary getDietary(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietary(serial);

	}

	public void deleteDietary(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDietary(serial);
	}

	public int insertOrUpdateDietaryCommunicationForm(
			DietaryCommunicationForm dietaryCommunicationForm)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateDietaryCommunicationForm(dietaryCommunicationForm);
	}

	public List getDietaryCommunicationForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryCommunicationForms(residentSerial);
	}

	public DietaryCommunicationForm getDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryCommunicationForm(serial);
	}

	public void deleteDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDietaryCommunicationForm(serial);
	}

	public int insertOrUpdateDietaryResidentDiagnosis(
			DietaryResidentDiagnosis refDietaryResidentDiagnosis)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateDietaryResidentDiagnosis(refDietaryResidentDiagnosis);
	}

	public List getDietaryResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryResidentDiagnosiss(residentSerial);
	}

	public DietaryResidentDiagnosis getDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryResidentDiagnosis(serial);
	}

	public void deleteDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDietaryResidentDiagnosis(serial);
	}

	public int insertOrUpdateEnteralFeeding(EnteralFeeding refEnteralFeeding)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateEnteralFeeding(refEnteralFeeding);
	}

	public List getEnteralFeedings(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getEnteralFeedings(residentSerial);
	}

	public EnteralFeeding getEnteralFeeding(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getEnteralFeeding(serial);
	}

	public void deleteEnteralFeeding(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteEnteralFeeding(serial);
	}

	public int insertOrUpdateDietaryPlazaHealth(
			DietaryPlazaHealth refDietaryPlazaHealth) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateDietaryPlazaHealth(refDietaryPlazaHealth);

	}

	public List getDietaryPlazaHealths(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryPlazaHealths(residentSerial);
	}

	public DietaryPlazaHealth getDietaryPlazaHealth(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietaryPlazaHealth(serial);
	}

	public void deleteDietaryPlazaHealth(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDietaryPlazaHealth(serial);
	}

	public void deleteDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDietaryPlazaHealthRow(formId);
	}

	public int insertOrUpdateDietaryPlazaHealthRow(DietaryPlazaHealthRow psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateDietaryPlazaHealthRow(psr);
	}

	public int insertOrUpdateDietaryPlazaHealthRows(List psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateDietaryPlazaHealthRows(psr);
	}

	public List getDietaryPlazaHealthRows(int formId) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietaryPlazaHealthRows(formId);
	}

	public List getDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietaryPlazaHealthRow(formId);
	}

	public int insertOrUpdateConsultant(Consultant consultant)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateConsultant(consultant);
	}

	public List getConsultants(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getConsultants(residentSerial);
	}

	public Consultant getConsultant(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getConsultant(serial);
	}

	public void deleteConsultant(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteConsultant(serial);
	}

	public int insertOrUpdateRenalDialysisCommunicationFormPage1(
			RenalDialysisCommunicationFormPage1 residentPayer)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateRenalDialysisCommunicationFormPage1(residentPayer);
	}

	public List getRenalDialysisCommunicationFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getRenalDialysisCommunicationFormPage1s(residentSerial);
	}

	public RenalDialysisCommunicationFormPage1 getRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getRenalDialysisCommunicationFormPage1(serial);
	}

	public void deleteRenalDialysisCommunicationFormPage1(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteRenalDialysisCommunicationFormPage1(serial);
	}

	public int insertOrUpdateRenalDialysisCommunicationFormPage2(
			RenalDialysisCommunicationFormPage2 residentPayer)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateRenalDialysisCommunicationFormPage2(residentPayer);

	}

	public RenalDialysisCommunicationFormPage2 getRenalDialysisCommunicationFormPage2(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getRenalDialysisCommunicationFormPage2(serial);
	}

	public void deleteRenalDialysisCommunicationFormPage2(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteRenalDialysisCommunicationFormPage2(serial);
	}

	public int insertOrUpdateReferralForm(ReferralForm rf)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateReferralForm(rf);
	}

	public List getReferralForms(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getReferralForms(residentSerial);
	}

	public ReferralForm getReferralForm(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getReferralForm(serial);
	}

	public void deleteReferralForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteReferralForm(serial);
	}

	public int insertOrUpdateReportOfConsultationForm(
			ReportOfConsultationForm rf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateReportOfConsultationForm(rf);
	}

	public List getReportOfConsultationForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getReportOfConsultationForms(residentSerial);
	}

	public ReportOfConsultationForm getReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getReportOfConsultationForm(serial);
	}

	public void deleteReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteReportOfConsultationForm(serial);
	}

	public int insertOrUpdatePharmacistEvaluationReportForm(
			PharmacistEvaluationReportForm rf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdatePharmacistEvaluationReportForm(rf);
	}

	public List getPharmacistEvaluationReportForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getPharmacistEvaluationReportForms(residentSerial);
	}

	public PharmacistEvaluationReportForm getPharmacistEvaluationReportForm(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getPharmacistEvaluationReportForm(serial);
	}

	public void deletePharmacistEvaluationReportForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePharmacistEvaluationReportForm(serial);
	}

	public int insertOrUpdatePharmacistEvaluationReportFormRows(List rfr)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePharmacistEvaluationReportFormRows(rfr);
	}

	public List getPharmacistEvaluationReportFormRows(int formid)
			throws MedrexException, RemoteException {
		return medrexInterface.getPharmacistEvaluationReportFormRows(formid);
	}

	public PharmacistEvaluationReportFormRow getPharmacistEvaluationReportFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPharmacistEvaluationReportFormRow(formId,
				formNum);
	}

	public int insertOrUpdateProgressNotes(ProgressNotes activityPayer)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateProgressNotes(activityPayer);
	}

	public List getProgressNotess(int activitySerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getProgressNotess(activitySerial);
	}

	public ProgressNotes getProgressNotes(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getProgressNotes(serial);
	}

	public void deleteProgressNotes(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteProgressNotes(serial);
	}

	public int insertOrUpdateDoctorsProgressNotesForm(
			DoctorsProgressNotesForm ntnf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateDoctorsProgressNotesForm(ntnf);
	}

	public List getDoctorProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDoctorProgressNotesForms(residentSerial);
	}

	public DoctorsProgressNotesForm getDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getDoctorProgressNotesForm(serial);
	}

	public void deleteDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDoctorProgressNotesForm(serial);
	}

	public int insertOrUpdateDoctorsProgressNotesFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateDoctorsProgressNotesFormRows(ntnfr);
	}

	public List getDoctorProgressNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getDoctorProgressNotesFormRows(formId);
	}

	public int insertOrUpdateInterDisciplinaryProgressNotesForm(
			InterDisciplinaryProgressNotesForm ntnf) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateInterDisciplinaryProgressNotesForm(ntnf);
	}

	public List getInterDisciplinaryProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getInterDisciplinaryProgressNotesForms(residentSerial);
	}

	public InterDisciplinaryProgressNotesForm getInterDisciplinaryProgressNotesForm(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getInterDisciplinaryProgressNotesForm(serial);
	}

	public void deleteInterDisciplinaryProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteInterDisciplinaryProgressNotesForm(serial);
	}

	public int insertOrUpdateInterDisciplinaryProgressNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateInterDisciplinaryProgressNotesFormRow(ntnfr);
	}

	public List getInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getInterDisciplinaryProgressNotesFormRow(formId);
	}

	public int insertOrUpdateHistoryAndPhysical(HistoryAndPhysical consultant)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateHistoryAndPhysical(consultant);
	}

	public List getHistoryAndPhysicals(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getHistoryAndPhysicals(residentSerial);
	}

	public HistoryAndPhysical getHistoryAndPhysical(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getHistoryAndPhysical(serial);
	}

	public void deleteHistoryAndPhysical(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteHistoryAndPhysical(serial);
	}

	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage1(
			HistoryAndPhysicalGeneralFormPage1 rafp1) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage1(rafp1);
	}

	public List getHistoryAndPhysicalGeneralFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getHistoryAndPhysicalGeneralFormPage1s(residentSerial);
	}

	public HistoryAndPhysicalGeneralFormPage1 getHistoryAndPhysicalGeneralFormPage1(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getHistoryAndPhysicalGeneralFormPage1(serial);
	}

	public void deleteHistoryAndPhysicalGeneralFormPage1(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteHistoryAndPhysicalGeneralFormPage1(serial);
	}

	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage2(
			HistoryAndPhysicalGeneralFormPage2 rafp2) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage2(rafp2);
	}

	public HistoryAndPhysicalGeneralFormPage2 getHistoryAndPhysicalGeneralFormPage2(
			int formId) throws MedrexException, RemoteException {
		return medrexInterface.getHistoryAndPhysicalGeneralFormPage2(formId);
	}

	public void deleteHistoryAndPhysicalGeneralFormPage2(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteHistoryAndPhysicalGeneralFormPage2(serial);
	}

	// /////
	public int insertOrUpdateCumulativeDiagnosisForm(
			CumulativeDiagnosisForm ntnf) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateCumulativeDiagnosisForm(ntnf);
	}

	public List getCumulativeDiagnosisForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCumulativeDiagnosisForms(residentSerial);
	}

	public CumulativeDiagnosisForm getCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCumulativeDiagnosisForm(serial);
	}

	public void deleteCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteCumulativeDiagnosisForm(serial);
	}

	public void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteCumulativeDiagnosisFormRow(formId);
	}

	public int insertOrUpdateCumulativeDiagnosisFormRow(
			CumulativeDiagnosisFormRow ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateCumulativeDiagnosisFormRow(ntnfr);
	}

	public CumulativeDiagnosisFormRow getCumulativeDiagnosisFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getCumulativeDiagnosisFormRow(formId, formNum);
	}

	public int insertOrUpdateMonthlyVitalSheetForm(MonthlyVitalSheetForm ntnf)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMonthlyVitalSheetForm(ntnf);
	}

	public List getMonthlyVitalSheetForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMonthlyVitalSheetForms(residentSerial);
	}

	public MonthlyVitalSheetForm getMonthlyVitalSheetForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMonthlyVitalSheetForm(serial);
	}

	public void deleteMonthlyVitalSheetForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteMonthlyVitalSheetForm(serial);
	}

	public void deleteMonthlyVitalSheetFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteMonthlyVitalSheetFormRow(formId);
	}

	public int insertOrUpdateMonthlyVitalSheetFormRow(
			MonthlyVitalSheetFormRow ntnfr) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateMonthlyVitalSheetFormRow(ntnfr);
	}

	public MonthlyVitalSheetFormRow getMonthlyVitalSheetFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getMonthlyVitalSheetFormRow(formId, formNum);

	}

	public int insertOrUpdateWeeklyWeightsForm(WeeklyWeightsForm ntnf)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateWeeklyWeightsForm(ntnf);
	}

	public List getWeeklyWeightsForms(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getWeeklyWeightsForms(residentSerial);
	}

	public WeeklyWeightsForm getWeeklyWeightsForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getWeeklyWeightsForm(serial);
	}

	public void deleteWeeklyWeightsForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteWeeklyWeightsForm(serial);
	}

	public void deleteWeeklyWeightsFormRow(int formId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteWeeklyWeightsFormRow(formId);
	}

	public int insertOrUpdateWeeklyWeightsFormRow(WeeklyWeightsFormRow ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateWeeklyWeightsFormRow(ntnfr);
	}

	public WeeklyWeightsFormRow getWeeklyWeightsFormRow(int formId, int formNum)
			throws MedrexException, RemoteException {
		return medrexInterface.getWeeklyWeightsFormRow(formId, formNum);
	}

	public int insertOrUpdateWeeklyWeightsFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateWeeklyWeightsFormRows(ntnfr);
	}

	public List getWeeklyWeightsFormRows(int formId) throws MedrexException,
			RemoteException {
		return medrexInterface.getWeeklyWeightsFormRows(formId);
	}

	public int insertOrUpdateLabSpecial(LabSpecial labSpecial)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateLabSpecial(labSpecial);
	}

	public List getLabSpecials(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getLabSpecials(residentSerial);
	}

	public LabSpecial getLabSpecial(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getLabSpecial(serial);
	}

	public void deleteLabSpecial(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteLabSpecial(serial);
	}

	public int insertOrUpdateReasonForStudy(ReasonForStudy rfStudy)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateReasonForStudy(rfStudy);
	}

	public List getReasonForStudys(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getReasonForStudys(residentSerial);
	}

	public ReasonForStudy getReasonForStudy(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getReasonForStudy(serial);
	}

	public void deleteReasonForStudy(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteReasonForStudy(serial);
	}

	public int insertOrUpdateMadexForm1(MadexForm1 refMadexForm1)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMadexForm1(refMadexForm1);
	}

	public List getMadexForm1s(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMadexForm1s(residentSerial);
	}

	public MadexForm1 getMadexForm1(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMadexForm1(serial);
	}

	public void deleteMadexForm1(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteMadexForm1(serial);
	}

	public int insertOrUpdateMadexForm2(MadexForm2 refMadexForm2)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMadexForm2(refMadexForm2);
	}

	public List getMadexForm2s(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMadexForm2s(residentSerial);
	}

	public MadexForm2 getMadexForm2(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMadexForm2(serial);
	}

	public void deleteMadexForm2(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteMadexForm2(serial);
	}

	public int insertOrUpdatePhysicianOrder(PhysicianOrders physicianOrders)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianOrder(physicianOrders);
	}

	public List getPhysicianOrders(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPhysicianOrders(residentSerial);
	}

	public PhysicianOrders getPhysicianOrder(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrder(serial);
	}

	public void deletePhysicianOrder(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrder(serial);
	}

	public int insertOrUpdatePhysicianPlazaHealthCare(
			PhysicianPlazaHealthCare refPhysicianPlazaHealthCare)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianPlazaHealthCare(refPhysicianPlazaHealthCare);
	}

	public List getPhysicianPlazaHealthCares(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianPlazaHealthCares(residentSerial);
	}

	public PhysicianPlazaHealthCare getPhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianPlazaHealthCare(serial);
	}

	public void deletePhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianPlazaHealthCare(serial);
	}

	public int insertOrUpdatePhysicianInfusion(
			PhysicianInfusion refPhysicianInfusion) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianInfusion(refPhysicianInfusion);
	}

	public List getPhysicianInfusions(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianInfusions(residentSerial);
	}

	public PhysicianInfusion getPhysicianInfusion(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianInfusion(serial);
	}

	public void deletePhysicianInfusion(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianInfusion(serial);
	}

	public int insertOrUpdateResidentImmunizationRecord(
			ResidentImmunizationRecord refResidentImmunizationRecord)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentImmunizationRecord(refResidentImmunizationRecord);
	}

	public List getResidentImmunizationRecords(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentImmunizationRecords(residentSerial);
	}

	public ResidentImmunizationRecord getResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentImmunizationRecord(serial);
	}

	public void deleteResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentImmunizationRecord(serial);
	}

	public int insertOrUpdatePhysicianSpeciality(PhysicianSpeciality ps)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianSpeciality(ps);
	}

	public List getPhysicianSpecialitys(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianSpecialitys(residentSerial);
	}

	public PhysicianSpeciality getPhysicianSpeciality(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianSpeciality(serial);
	}

	public void deletePhysicianSpeciality(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianSpeciality(serial);
	}

	public int insertOrUpdatePhysicianSpecialityRow(PhysicianSpecialityRow psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianSpecialityRow(psr);
	}

	public PhysicianSpecialityRow getPhysicianSpecialityRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianSpecialityRow(formId, formNum);
	}

	public int insertOrUpdatePhysicianOrderForm1(
			PhysicianOrderForm1 refPhysicianOrderForm1) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderForm1(refPhysicianOrderForm1);
	}

	public List getPhysicianOrderForm1s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm1s(residentSerial);
	}

	public PhysicianOrderForm1 getPhysicianOrderForm1(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm1(serial);

	}

	public void deletePhysicianOrderForm1(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrderForm1(serial);
	}

	public void deletePhysicianOrderForm1Row(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderForm1Row(formId);
	}

	public int insertOrUpdatePhysicianOrderForm1Row(PhysicianOrderForm1Row psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianOrderForm1Row(psr);
	}

	public PhysicianOrderForm1Row getPhysicianOrderForm1Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm1Row(formId, formNum);
	}

	public int insertOrUpdatePhysicianOrderForm2(
			PhysicianOrderForm2 refPhysicianOrderForm2) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderForm2(refPhysicianOrderForm2);
	}

	public List getPhysicianOrderForm2s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm2s(residentSerial);
	}

	public PhysicianOrderForm2 getPhysicianOrderForm2(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm2(serial);
	}

	public void deletePhysicianOrderForm2(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrderForm2(serial);
	}

	public void deletePhysicianOrderForm2Row(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderForm2Row(formId);
	}

	public int insertOrUpdatePhysicianOrderForm2Row(PhysicianOrderForm2Row psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianOrderForm2Row(psr);
	}

	public PhysicianOrderForm2Row getPhysicianOrderForm2Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm2Row(formId, formNum);
	}

	public int insertOrUpdatePhysicianOrderForm3(
			PhysicianOrderForm3 refPhysicianOrderForm3) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderForm3(refPhysicianOrderForm3);
	}

	public List getPhysicianOrderForm3s(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm3s(residentSerial);
	}

	public List getPhysicianOrderForm3s() throws MedrexException,
			RemoteException {
		return medrexInterface.getPhysicianOrderForm3s();
	}

	public PhysicianOrderForm3 getPhysicianOrderForm3(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm3(serial);
	}

	public void deletePhysicianOrderForm3(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrderForm3(serial);
	}

	public void deletePhysicianOrderForm3Row(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderForm3Row(formId);
	}

	public int insertOrUpdatePhysicianOrderForm3Row(PhysicianOrderForm3Row psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianOrderForm3Row(psr);
	}

	public int insertOrUpdatePhysicianOrderForm3Rows(List psr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianOrderForm3Rows(psr);
	}

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm3Row(formId, formNum);
	}

	// PtOtSt ------------------------------------------------------------- //
	public int insertOrUpdatePtOtSt(PtOtSt ptOtSt) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdatePtOtSt(ptOtSt);
	}

	public List getPtOtSts(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPtOtSts(residentSerial);
	}

	public PtOtSt getPtOtSt(int serial) throws MedrexException, RemoteException {
		return medrexInterface.getPtOtSt(serial);
	}

	public void deletePtOtSt(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtSt(serial);
	}

	// PtOtStOccupationalDailyRecord
	public int insertOrUpdatePtOtStOccupationalDailyRecord(
			PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStOccupationalDailyRecord(refPtOtStOccupationalDailyRecord);
	}

	public List getPtOtStOccupationalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getPtOtStOccupationalDailyRecords(residentSerial);
	}

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecord(
			int serial) throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStOccupationalDailyRecord(serial);
	}

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecordByDate(
			Date date) throws RemoteException, MedrexException {
		return medrexInterface.getPtOtStOccupationalDailyRecordByDate(date);
	}

	public void deletePtOtStOccupationalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePtOtStOccupationalDailyRecord(serial);
	}

	// PtOtStOccupationalTherapy
	public int insertOrUpdatePtOtStOccupationalTherapy(
			PtOtStOccupationalTherapy refPtOtStOccupationalTherapy)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStOccupationalTherapy(refPtOtStOccupationalTherapy);
	}

	public List getPtOtStOccupationalTherapys(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStOccupationalTherapys(residentSerial);
	}

	public PtOtStOccupationalTherapy getPtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStOccupationalTherapy(serial);
	}

	public void deletePtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePtOtStOccupationalTherapy(serial);
	}

	// PtOtStPhysicalDailyRecord
	public int insertOrUpdatePtOtStPhysicalDailyRecord(
			PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStPhysicalDailyRecord(refPtOtStPhysicalDailyRecord);
	}

	public List getPtOtStPhysicalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPhysicalDailyRecords(residentSerial);
	}

	public PtOtStPhysicalDailyRecord getPtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPhysicalDailyRecord(serial);
	}

	public void deletePtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePtOtStPhysicalDailyRecord(serial);
	}

	// PtOtStPhysicalTheray
	public int insertOrUpdatePtOtStPhysicalTheray(
			PtOtStPhysicalTheray refPtOtStPhysicalTheray)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStPhysicalTheray(refPtOtStPhysicalTheray);
	}

	public List getPtOtStPhysicalTherays(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPhysicalTherays(residentSerial);
	}

	public PtOtStPhysicalTheray getPtOtStPhysicalTheray(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPhysicalTheray(serial);
	}

	public void deletePtOtStPhysicalTheray(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtStPhysicalTheray(serial);
	}

	public PtOtStPhysicalTheray getExistingPhysicalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException, RemoteException {
		return medrexInterface.getExistingPhysicalTherapyForm700(fromDate,
				toDate);
	}

	// PtOtStPositioningEvaluation
	public int insertOrUpdatePtOtStPositioningEvaluation(
			PtOtStPositioningEvaluation refPtOtStPositioningEvaluation)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStPositioningEvaluation(refPtOtStPositioningEvaluation);
	}

	public List getPtOtStPositioningEvaluations(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPositioningEvaluations(residentSerial);
	}

	public PtOtStPositioningEvaluation getPtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStPositioningEvaluation(serial);
	}

	public void deletePtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePtOtStPositioningEvaluation(serial);
	}

	// PtOtStRehabCarePlan
	public int insertOrUpdatePtOtStRehabCarePlan(
			PtOtStRehabCarePlan refPtOtStRehabCarePlan) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStRehabCarePlan(refPtOtStRehabCarePlan);
	}

	public List getPtOtStRehabCarePlans(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStRehabCarePlans(residentSerial);
	}

	public PtOtStRehabCarePlan getPtOtStRehabCarePlan(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStRehabCarePlan(serial);
	}

	public void deletePtOtStRehabCarePlan(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtStRehabCarePlan(serial);
	}

	// PtOtStSpeechDailyRecord
	public int insertOrUpdatePtOtStSpeechDailyRecord(
			PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStSpeechDailyRecord(refPtOtStSpeechDailyRecord);
	}

	public List getPtOtStSpeechDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStSpeechDailyRecords(residentSerial);
	}

	public PtOtStSpeechDailyRecord getPtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStSpeechDailyRecord(serial);
	}

	public void deletePtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePtOtStSpeechDailyRecord(serial);
	}

	// PtOtStSpeechLanguage
	public int insertOrUpdatePtOtStSpeechLanguage(
			PtOtStSpeechLanguage refPtOtStSpeechLanguage)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStSpeechLanguage(refPtOtStSpeechLanguage);
	}

	public List getPtOtStSpeechLanguages(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStSpeechLanguages(residentSerial);

	}

	public PtOtStSpeechLanguage getPtOtStSpeechLanguage(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStSpeechLanguage(serial);
	}

	public void deletePtOtStSpeechLanguage(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtStSpeechLanguage(serial);
	}

	// PtOtStTherapyPhysical
	public int insertOrUpdatePtOtStTherapyPhysical(
			PtOtStTherapyPhysical refPtOtStTherapyPhysical)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStTherapyPhysical(refPtOtStTherapyPhysical);
	}

	public List getPtOtStTherapyPhysicals(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStTherapyPhysicals(residentSerial);
	}

	public PtOtStTherapyPhysical getPtOtStTherapyPhysical(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStTherapyPhysical(serial);
	}

	public void deletePtOtStTherapyPhysical(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtStTherapyPhysical(serial);
	}

	// PtOtStTreatment
	public int insertOrUpdatePtOtStTreatment(PtOtStTreatment refPtOtStTreatment)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePtOtStTreatment(refPtOtStTreatment);
	}

	public List getPtOtStTreatments(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPtOtStTreatments(residentSerial);
	}

	public PtOtStTreatment getPtOtStTreatment(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPtOtStTreatment(serial);
	}

	public void deletePtOtStTreatment(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePtOtStTreatment(serial);
	}

	public int insertOrUpdateUser(Users user) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateUser(user);
	}

	/*
	 * public List getUsers(int userSerial) throws MedrexException,
	 * RemoteException { return ((new UserService()).getUsers(userSerial)); }
	 */

	public Users getUser(int serial) throws MedrexException, RemoteException {
		return medrexInterface.getUser(serial);
	}

	public List getUsers() throws MedrexException, RemoteException {
		return medrexInterface.getUsers();
	}

	public void deleteUser(int serial) throws MedrexException, RemoteException {
		medrexInterface.deleteUser(serial);
	}

	public boolean isValidUserLogin(String user, String password)
			throws MedrexException, RemoteException {
		return medrexInterface.isValidUserLogin(user, password);
	}

	public int insertOrUpdateDoctorsRecord(Doctors refDoctors)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateDoctorsRecord(refDoctors);
	}

	public List getDoctorsRecords() throws MedrexException, RemoteException {
		return medrexInterface.getDoctorsRecords();
	}

	public List getDoctorsRecords(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDoctorsRecords(residentSerial);
	}

	public Doctors getDoctorsRecord(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDoctorsRecord(serial);
	}

	public Doctors getDoctorsRecord(DoctorTypes type, String fName, String lName)
			throws MedrexException, RemoteException {
		return medrexInterface.getDoctorsRecord(type, fName, lName);
	}

	public void deleteDoctorsRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDoctorsRecord(serial);
	}

	public List getDoctorsRecords(DoctorTypes type) throws MedrexException,
			RemoteException {
		return medrexInterface.getDoctorsRecords(type);
	}

	public int insertOrUpdateNurseRecord(Nurse refNurse)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateNurseRecord(refNurse);
	}

	public List getNurseRecords() throws MedrexException, RemoteException {
		return medrexInterface.getNurseRecords();
	}

	public Nurse getNurseRecord(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getNurseRecord(serial);
	}

	public Nurse getNurseRecordForSchedule(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getNurseRecordForSchedule(serial);
	}

	public void deleteNurseRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteNurseRecord(serial);
	}



	public int insertOrUpdatePhysicianForm(PhysicianForm refPhysicianForm)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePhysicianForm(refPhysicianForm);
	}

	public List getPhysicianForms(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPhysicianForms(residentSerial);
	}

	public PhysicianForm getPhysicianForm(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPhysicianForm(serial);
	}

	public PhysicianForm getPhysicianForm(int residentId, int physicianType)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianForm(residentId, physicianType);
	}

	public void deletePhysicianForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianForm(serial);
	}

	public int insertOrUpdateProvidersRecord(ProvidersRecord providersRecord)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateProvidersRecord(providersRecord);
	}

	public boolean getProvidersRecordsOfType(int residentSerial,
			int providerType) throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecordsOfType(residentSerial,
				providerType);
	}

	public ProvidersRecord getProvidersRecord(int residentSerial,
			int providerType) throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecord(residentSerial, providerType);
	}

	public List getProvidersRecords(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getProvidersRecords(residentSerial);
	}

	public List getProvidersRecords() throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecords();
	}

	public ProvidersRecord getProvidersRecord(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecord(serial);
	}

	public void deleteProvidersRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteProvidersRecord(serial);
	}

	public int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateProvidersRecordForm(providersRecordForm);
	}

	public List getProvidersRecordForms() throws MedrexException,
			RemoteException {
		return medrexInterface.getProvidersRecordForms();
	}

	public ProvidersRecordForm getProvidersRecordForm(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecordForm(serial);
	}

	public ProvidersRecordForm getProvidersRecordForm(ProviderTypes type,
			String address, String city) throws MedrexException,
			RemoteException {
		return medrexInterface.getProvidersRecordForm(type, address, city);
	}

	public void deleteProvidersRecordForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteProvidersRecordForm(serial);
	}

	public List getProvidersRecordForms(String type) throws MedrexException,
			RemoteException {
		return medrexInterface.getProvidersRecordForms(type);
	}

	public List getProvidersRecordForms(ProviderTypes pTypes)
			throws MedrexException, RemoteException {
		return medrexInterface.getProvidersRecordForms(pTypes);
	}

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum, Date date) throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderForm3Row(formId, formNum, date);
	}

	// mds
	public void insertOrUpdateScanForm(ScanForm scanForm)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateScanForm(scanForm);
	}

	public List getScanForms(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getScanForms(residentSerial);
	}

	public ScanForm getScanForm(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getScanForm(serial);
	}

	public void deleteScanForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteScanForm(serial);
	}

	public void insertOrUpdateMessagesRecord(MessagesRecord messagesRecord)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateMessagesRecord(messagesRecord);
	}

	public int insertOrUpdateMessagesRecord(MessagesRecord messagesRecord,
			List<Users> rUsers) throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMessagesRecord(messagesRecord,
				rUsers);
	}

	public List getMessagesRecords() throws MedrexException, RemoteException {
		return medrexInterface.getMessagesRecords();
	}

	public List getMessagesRecords(int residentserial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMessagesRecords(residentserial);
	}

	public MessagesRecord getMessagesRecord(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getMessagesRecord(serial);
	}

	public void deleteMessagesRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteMessagesRecord(serial);
	}

	public int getTotalMessage(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getTotalMessage(currentLoggedInUserKey);
	}

	public int getTriggerWordMailCount(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getTriggerWordMailCount(currentLoggedInUserKey);
	}

	// ResidentDiagnosis
	public int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateResidentDiagnosis(refResidentDiagnosis);
	}

	public List getResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentDiagnosiss(residentSerial);
	}

	public ResidentDiagnosis getLastDiagnosisAccToOrder(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getLastDiagnosisAccToOrder(residentId);
	}

	public ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentDiagnosis(serial);
	}

	public void deleteResidentDiagnosis(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteResidentDiagnosis(serial);
	}

	

	public int insertOrUpdateMonthlyVitalSheetFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMonthlyVitalSheetFormRows(ntnfr);
	}

	public List getMonthlyVitalSheetFormRows(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getMonthlyVitalSheetFormRows(formId);
	}

	public int insertOrUpdateNurseMedicationNotesFormRows(
			List<NurseMedicationNotesFormRow> rows) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNurseMedicationNotesFormRows(rows);
	}

	public List getNurseMedicationNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRows(formId);
	}

	public List getNurseMedicationNotesFormRow1s(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getNurseMedicationNotesFormRow1s(formId);
	}

	public int insertOrUpdateNurseMedicationNotesFormRow1s(
			List<NurseMedicationNotesFormRow1> rows1) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateNurseMedicationNotesFormRow1s(rows1);
	}

	public int insertOrUpdateCumulativeDiagnosisFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCumulativeDiagnosisFormRows(ntnfr);
	}

	public List getCumulativeDiagnosisFormRows(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getCumulativeDiagnosisFormRows(formId);
	}

	public List getPhysicianOrderForm3Rows(int currentPhysicianOrderForm3Key)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getPhysicianOrderForm3Rows(currentPhysicianOrderForm3Key);
	}

	public int insertOrUpdateResidentInfoGeneralPhone(
			ResidentInfoGeneralPhone refResidentInfoGeneralPhone)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentInfoGeneralPhone(refResidentInfoGeneralPhone);
	}

	public List getResidentInfoGeneralPhones(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentInfoGeneralPhones(residentSerial);
	}

	public ResidentInfoGeneralPhone getResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentInfoGeneralPhone(serial);
	}

	public void deleteResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentInfoGeneralPhone(serial);
	}

	public int insertOrUpdateCarePlan(CarePlan carePlan)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCarePlan(carePlan);
	}

	public List getCarePlanList(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCarePlanList(residentSerial);
	}

	public CarePlan getCarePlan(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCarePlan(serial);
	}

	public void deleteCarePlan(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCarePlan(serial);
	}

	public int insertOrUpdateCarePlanRecord(CarePlanRecord carePlanRecord)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCarePlanRecord(carePlanRecord);
	}

	public CarePlanRecord getCarePlanRecord(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCarePlanRecord(serial);
	}

	public void deleteCarePlanRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCarePlanRecord(serial);
	}

	public List getAllCarePlanMatchingThisCarePlan(CarePlanRecord careplanrecord)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getAllCarePlanMatchingThisCarePlan(careplanrecord);
	}

	public List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord, String userName)
			throws MedrexException, RemoteException {
		return medrexInterface.getAllCarePlanMatchingThisCarePlan(
				careplanrecord, userName);
	}


	// Security Role
	public int insertOrUpdatedSecurityRole(SecurityRole securityRole)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatedSecurityRole(securityRole);
	}

	public List getAllRoles() throws MedrexException, RemoteException {
		return medrexInterface.getAllRoles();
	}

	public List getAllApplicationRoles() throws MedrexException,
			RemoteException {
		return medrexInterface.getAllApplicationRoles();
	}

	public SecurityRole getSecurityRole(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getSecurityRole(serial);
	}

	public SecurityRole getSecurityRole(String name) throws MedrexException,
			RemoteException {
		return medrexInterface.getSecurityRole(name);
	}

	public void deleteSecurityRole(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteSecurityRole(serial);
	}

	public int insertOrUpdatePanelProgressNotes(
			ProgressNotes2 refpanelProgressNotes) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePanelProgressNotes(refpanelProgressNotes);
	}

	public List getPanelProgressNotes(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPanelProgressNotes(residentSerial);
	}

	public ProgressNotes2 getPanelProgressNote(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPanelProgressNote(serial);
	}

	public void deletePanelProgressNotes(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePanelProgressNotes(serial);
	}

	public int insertOrUpdatePrescription(Prescription refPrescription)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePrescription(refPrescription);
	}

	public List getPrescriptions(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPrescriptions(residentSerial);
	}

	public Prescription getPrescription(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPrescription(serial);
	}

	public void deletePrescription(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePrescription(serial);
	}

	public void deleteProgressNotes2(int formId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteProgressNotes2(formId);
	}

	// UserLogon
	public int insertOrUpdateUserLogon(UserLogon refUserLogon)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateUserLogon(refUserLogon);
	}

	public List getUserLogons() throws MedrexException, RemoteException {
		return medrexInterface.getUserLogons();
	}

	public UserLogon getUserLogon(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getUserLogon(serial);
	}

	public void deleteUserLogon(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteUserLogon(serial);
	}

	public UserLogon getcurrentUserLogon() throws RemoteException,
			MedrexException {
		return medrexInterface.getcurrentUserLogon();
	}

	// Care Log
	public int insertOrUpdateCareLog(CareLog cnaAdl) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateCareLog(cnaAdl);
	}

	public List getCareLogForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCareLogForResident(residentSerial);
	}

	public CareLog getCareLog(int id) throws MedrexException, RemoteException {
		return medrexInterface.getCareLog(id);
	}

	// CNA
	public int insertOrUpdateCnaAdl(CnaAdl cnaAdl) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateCnaAdl(cnaAdl);
	}

	public List getCnaAdlForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCnaAdlForResident(residentSerial);
	}

	public CnaAdl getCnaAdl(int id) throws MedrexException, RemoteException {
		return medrexInterface.getCnaAdl(id);
	}

	// AdmissionFromHead
	public int insertOrUpdateAdmissionFromHead(
			AdmissionFromHead refAdmissionFromHead) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateAdmissionFromHead(refAdmissionFromHead);
	}

	public List getAdmissionFromHeads() throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionFromHeads();
	}

	public List getAdmissionFromHeads(String likeStr) throws MedrexException,
			RemoteException {
		return medrexInterface.getAdmissionFromHeads(likeStr);
	}

	public AdmissionFromHead getAdmissionFromHead(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionFromHead(serial);
	}

	public void deleteAdmissionFromHead(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAdmissionFromHead(serial);
	}

	// AdmissionFromSubHead
	public int insertOrUpdateAdmissionFromSubHead(
			AdmissionFromSubHead refAdmissionFromSubHead)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateAdmissionFromSubHead(refAdmissionFromSubHead);
	}

	public List getAdmissionFromSubHeads(int headId) throws MedrexException,
			RemoteException {
		return medrexInterface.getAdmissionFromSubHeads(headId);
	}

	public List getAdmissionFromSubHeads(int headId, String likeStr)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionFromSubHeads(headId, likeStr);
	}

	public AdmissionFromSubHead getAdmissionFromSubHead(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionFromSubHead(serial);
	}

	public void deleteAdmissionFromSubHead(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAdmissionFromSubHead(serial);
	}

	// AdmissionTransportation
	public int insertOrUpdateAdmissionTransportation(
			AdmissionTransportation refAdmissionTransportation)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateAdmissionTransportation(refAdmissionTransportation);
	}

	public List getAdmissionTransportations(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionTransportations(residentSerial);
	}

	public List getAdmissionTransportations(String likeStr)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionTransportations(likeStr);
	}

	public AdmissionTransportation getAdmissionTransportation(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAdmissionTransportation(serial);
	}

	public void deleteAdmissionTransportation(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteAdmissionTransportation(serial);
	}

	// CensusStatus
	public int insertOrUpdateCensusStatus(CensusStatus refCensusStatus)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCensusStatus(refCensusStatus);
	}

	public CensusStatus getCensusStatus(int serial, int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatus(serial, residentSerial);
	}

	public List getCensusStatuss(int residentSerial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(residentSerial);
	}

	public List getCensusStatuss(String order, int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatuss(order, residentSerial);
	}

	public CensusStatus getCensusStatus(int residentSerial, String typename)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatus(residentSerial, typename);
	}

	public List getCensusStatuss(int residentSerial, String typename)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatuss(residentSerial, typename);
	}

	public CensusStatus getCensusStatus() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatus();
	}

	public void deleteCensusStatus(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCensusStatus(serial);
	}

	public CensusStatus getCensusLastAdmission(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastAdmission(residentSerial);
	}

	// for ORIGINAL Admisstion or first time admission
	public CensusStatus getCensusOriginalAdmission(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusOriginalAdmission(residentSerial);
	}

	// for getting last allergies
	public ResidentAssessmentFormPage1 getResidentAllergies(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentAllergies(residentSerial);
	}

	public CensusStatus getCensusLastDischarge(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDischarge(residentSerial);
	}

	public CensusStatus getCensusLastSignIn(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastSignIn(residentSerial);
	}

	public CensusStatus getCensusLastSignOut(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastSignOut(residentSerial);
	}

	public CensusStatusForResident getCensusStatusForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatusForResident(residentSerial);
	}

	public CensusStatusForResident getCensusStatusForResident(
			int residentSerial, Date forDate) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatusForResident(residentSerial,
				forDate);
	}

	public CensusStatus getCensusLastAdmission(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastAdmission(residentSerial, forDate);
	}

	public CensusStatus getCensusLastDischarge(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDischarge(residentSerial, forDate);
	}

	public CensusStatus getCensusLastSignIn(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastSignIn(residentSerial, forDate);
	}

	public CensusStatus getCensusLastSignOut(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastSignOut(residentSerial, forDate);
	}

	public List getCensusStatuss(String typename) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(typename);
	}

	public List getCensusStatuss(String typename, Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatuss(typename, tillDate);
	}

	public List getCensusStatussAdmission() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_ADMISSION);
	}

	public List getCensusStatussAdmission(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_ADMISSION,
				tillDate);
	}

	public List getCensusStatussDischarge() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_DISCHARGE);
	}

	public List getCensusStatussDischarge(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_DISCHARGE,
				tillDate);
	}

	public List getCensusStatussSignOut() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_SIGN_OUT);
	}

	public List getCensusStatussSignOut(Date tillDate) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_SIGN_OUT,
				tillDate);
	}

	public List getCensusStatussSignIn() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_SIGN_IN);
	}

	public List getCensusStatussSignIn(Date tillDate) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusStatuss(CensusConstants.TYPE_SIGN_IN,
				tillDate);
	}

	// ResponsibleParty
	public int insertOrUpdateResponsibleParty(ResponsibleParty ref)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateResponsibleParty(ref);
	}

	public List getResponsiblePartys(int residentId) throws MedrexException,
			RemoteException {
		return medrexInterface.getResponsiblePartys(residentId);
	}

	public List getResponsiblePartys(int residentId, String likeStr)
			throws MedrexException, RemoteException {
		return medrexInterface.getResponsiblePartys(residentId, likeStr);
	}

	public ResponsibleParty getResponsibleParty(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getResponsibleParty(serial);
	}

	public void deleteDischargeResponsibleParty(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDischargeResponsibleParty(serial);
	}

	// SignOutTo
	public int insertOrUpdateSignOutTo(SignOutTo ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateSignOutTo(ref);
	}

	public List getSignOutTos() throws MedrexException, RemoteException {
		return medrexInterface.getSignOutTos();
	}

	public List getSignOutTos(String likeStr) throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOutTos(likeStr);
	}

	public SignOutTo getSignOutTo(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOutTo(serial);
	}

	public void deleteDischargeSignOutTo(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDischargeSignOutTo(serial);
	}

	public int insertOrUpdateCensusNotes(CensusNotes refCensusNotes)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCensusNotes(refCensusNotes);
	}

	public List getCensusNotesForStatus(int statusid) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusNotesForStatus(statusid);
	}

	public CensusNotes getCensusNotes(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusNotes(serial);
	}

	// dashboard
	public void deleteDashboard(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDashboard(serial);
	}

	public Dashboard getDashboard(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDashboard(serial);
	}

	public Dashboard getDashboard(String type) throws MedrexException,
			RemoteException {
		return medrexInterface.getDashboard(type);
	}

	public int getCensusLastDayAdmissionCount() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusLastDayAdmissionCount();
	}

	public int getCensusLastDayAdmissionFirstFloorCount()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayAdmissionFirstFloorCount();
	}

	public int getCensusLastDayAdmissionSecondFloorCount()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayAdmissionSecondFloorCount();
	}

	public int getCensusLastDayDischargeCount() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusLastDayDischargeCount();
	}

	public int getCensusLastDayDischargeFirstFloorCount()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayDischargeFirstFloorCount();
	}

	public int getCensusLastDayDischargeSecondFloorCount()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayDischargeSecondFloorCount();
	}

	public List getCensusLastDayAdmissionResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusLastDayAdmissionResidents();
	}

	public List getCensusLastDayAdmissionFirstFloorResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayAdmissionFirstFloorResidents();
	}

	public List getCensusLastDayAdmissionSecondFloorResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayAdmissionSecondFloorResidents();
	}

	public List getCensusLastDayDischargeResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getCensusLastDayDischargeResidents();
	}

	public List getCensusLastDayDischargeFirstFloorResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayDischargeFirstFloorResidents();
	}

	public List getCensusLastDayDischargeSecondFloorResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusLastDayDischargeSecondFloorResidents();
	}

	public List<Dashboard> getDashboards() throws MedrexException,
			RemoteException {
		return medrexInterface.getDashboards();
	}

	public int insertOrUpdateDashboard(Dashboard ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateDashboard(ref);
	}

	// counts --- BedHold
	public void deleteBedHold(int residentId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteBedHold(residentId);
	}

	public BedHold getBedHold(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getBedHold(serial);
	}

	public List<BedHold> getBedHolds() throws MedrexException, RemoteException {
		return medrexInterface.getBedHolds();
	}

	public int insertOrUpdateBedHold(BedHold ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateBedHold(ref);
	}

	public int getCountBedHold() throws MedrexException, RemoteException {
		return medrexInterface.getCountBedHold();
	}

	public BedHold getBedHoldForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getBedHoldForResident(residentSerial);
	}

	public BedHold getBedHoldForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getBedHoldForResident(residentSerial, forDate);
	}

	public List<BedHold> getBedHoldForResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getBedHoldForResidents();
	}

	public List<BedHold> getBedHoldForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getBedHoldForResidents(tillDate);
	}

	// counts --- Hospital
	public void deleteHospital(int residentId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteHospital(residentId);
	}

	public Hospital getHospital(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getHospital(serial);
	}

	public List<Hospital> getHospitals() throws MedrexException,
			RemoteException {
		return medrexInterface.getHospitals();
	}

	public int insertOrUpdateHospital(Hospital ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateHospital(ref);
	}

	public int getHospitalCount() throws MedrexException, RemoteException {
		return medrexInterface.getHospitalCount();
	}

	public Hospital getHospitalForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getHospitalForResident(residentSerial);
	}

	public Hospital getHospitalForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getHospitalForResident(residentSerial, forDate);
	}

	public List<Hospital> getHospitalForResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getHospitalForResidents();
	}

	public List<Hospital> getHospitalForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getHospitalForResidents(tillDate);
	}

	// counts --- InHouse
	public void deleteInHouse(int residentId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteInHouse(residentId);
	}

	public InHouse getInHouse(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getInHouse(serial);
	}

	public List<DashboardInfo> getInHouses() throws MedrexException,
			RemoteException {
		return medrexInterface.getInHouses();
	}

	public int insertOrUpdateInHouse(InHouse ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateInHouse(ref);
	}

	public int getInHouseCount() throws MedrexException, RemoteException {
		return medrexInterface.getInHouseCount();
	}

	public InHouse getInHouseForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getInHouseForResident(residentSerial);
	}

	public InHouse getInHouseForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getInHouseForResident(residentSerial, forDate);
	}

	public List<InHouse> getInHouseForResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getInHouseForResidents();
	}

	public List<InHouse> getInHouseForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getInHouseForResidents(tillDate);
	}

	// counts --- SignOut
	public void deleteSignOut(int residentId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteSignOut(residentId);
	}

	public SignOut getSignOut(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOut(serial);
	}

	public List<SignOut> getSignOuts() throws MedrexException, RemoteException {
		return medrexInterface.getSignOuts();
	}

	public List<SignOut> getSignOutsLate() throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOutsLate();
	}

	public List<SignOut> getSignOutsLateMoreThanHour() throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOutsLateMoreThanHour();
	}

	public int insertOrUpdateSignOut(SignOut ref) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateSignOut(ref);
	}

	public int getSignOutCount() throws MedrexException, RemoteException {
		return medrexInterface.getSignOutCount();
	}

	public int getSignOutLateCount() throws MedrexException, RemoteException {
		return medrexInterface.getSignOutLateCount();
	}

	public int getSignOutLateMoreThanHourCount() throws MedrexException,
			RemoteException {
		return medrexInterface.getSignOutLateMoreThanHourCount();
	}

	// OutOfPass
	public void insertOrUpdateOutOfPass(OutOfPass ref) throws MedrexException,
			RemoteException {
		medrexInterface.insertOrUpdateOutOfPass(ref);
	}

	public int getOutOfPassCount() throws MedrexException, RemoteException {
		return medrexInterface.getOutOfPassCount();
	}

	public void deleteOutOfPass(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteOutOfPass(serial);
	}

	public OutOfPass getOutOfPassForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return medrexInterface.getOutOfPassForResident(residentSerial);
	}

	public int getOutOfPassCalendarYearCount(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return medrexInterface
				.getOutOfPassCalendarYearCount(currentResidenceKey);
	}

	public int getOutOnPassCalendarYearCount(int currentResidenceKey, int year)
			throws MedrexException, RemoteException {
		return medrexInterface.getOutOnPassCalendarYearCount(
				currentResidenceKey, year);
	}

	public OutOfPass getOutOfPassForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getOutOfPassForResident(residentSerial, forDate);
	}

	public List<OutOfPass> getOutOfPassForResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getOutOfPassForResidents();
	}

	public List<OutOfPass> getOutOfPassForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getOutOfPassForResidents();
	}

	// Icd9
	public int insertOrUpdateIcd9(Icd9 refIcd9) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateIcd9(refIcd9);
	}

	public List getIcd9s() throws MedrexException, RemoteException {
		return medrexInterface.getIcd9s();
	}

	public List getIcd9s(String likeStr) throws MedrexException,
			RemoteException {
		return medrexInterface.getIcd9s(likeStr);
	}

	public List<Icd9> getIcd9s(String text, String selectedButton)
			throws MedrexException, RemoteException {
		return medrexInterface.getIcd9s(text, selectedButton);
	}

	public Icd9 getIcd9ByCode(String code) throws MedrexException,
			RemoteException {
		return medrexInterface.getIcd9ByCode(code);
	}

	public Icd9 getIcd9(int serial) throws MedrexException, RemoteException {
		return medrexInterface.getIcd9(serial);
	}

	public void deleteIcd9(int serial) throws MedrexException, RemoteException {
		medrexInterface.deleteIcd9(serial);
	}

	// Accurities
	public int insertOrUpdateAccurities(List<Accurities> accList, String floor,
			Date d) throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateAccurities(accList, floor, d);
	}

	public List getCurrentAccuritiesList() throws MedrexException,
			RemoteException {
		return medrexInterface.getCurrentAccuritiesList();
	}

	// CountAudit
	public int insertOrUpdateCountAudit(CountAudit refCountAudit)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateCountAudit(refCountAudit);
	}

	public List getCountAudits() throws MedrexException, RemoteException {
		return medrexInterface.getCountAudits();
	}

	public List getCountAudits(Date d) throws MedrexException, RemoteException {
		return medrexInterface.getCountAudits(d);
	}

	public CountAudit getCountAudit(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getCountAudit(serial);
	}

	public int getCountAuditSeialByDateFloor(Date date, String floor)
			throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditSeialByDateFloor(date, floor);
	}

	public void deleteCountAudit(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCountAudit(serial);
	}

	public int insertOrUpdateCountAuditFloor(CountAuditFloor refCountAuditFloor)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateCountAuditFloor(refCountAuditFloor);
	}

	public List getCountAuditFloors() throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditFloors();
	}

	public CountAuditFloor getCountAuditFloor(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditFloor(serial);
	}

	public void deleteCountAuditFloor(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCountAuditFloor(serial);
	}

	public int insertOrUpdateCountAuditStatus(
			CountAuditStatus refCountAuditStatus) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateCountAuditStatus(refCountAuditStatus);
	}

	public List<CountAuditStatus> getCountAuditStatuss()
			throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditStatuss();
	}

	public CountAuditStatus getCountAuditStatus(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditStatus(serial);
	}

	public CountAuditStatus getCountAuditStatusOfToday()
			throws MedrexException, RemoteException {
		return medrexInterface.getCountAuditStatusOfToday();
	}

	public void deleteCountAuditStatus(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteCountAuditStatus(serial);
	}

	public Accurities getAccurities(int currentAccuritiesKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getAccurities(currentAccuritiesKey);
	}

	public void deleteAccurities(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAccurities(serial);
	}

	public List getAllTemplates() throws MedrexException, RemoteException {
		return medrexInterface.getAllTemplates();
	}

	public int insertOrUpdateTemplates(Templates templates)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateTemplates(templates);
	}

	public Templates getTemplate(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getTemplate(serial);
	}

	public List getTemplate(String formName) throws MedrexException,
			RemoteException {
		return medrexInterface.getTemplate(formName);
	}

	public void deleteTemplate(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteTemplate(serial);
	}

	public List getNotesCategories(String formName) throws MedrexException,
			RemoteException {
		return medrexInterface.getNotesCategories(formName);
	}

	public List getLatestNotes(String formName, int userId,
			NotesCategories notesCat) throws MedrexException, RemoteException {
		return medrexInterface.getLatestNotes(formName, userId, notesCat);
	}

	public int insertOrUpdateNotesCategories(NotesCategories notesCategories)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateNotesCategories(notesCategories);
	}

	public NotesCategories getNotesCategories(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getNotesCategories(serial);
	}

	public void deleteNotesCategories(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteNotesCategories(serial);
	}

	public List getAllNotesCategories() throws MedrexException, RemoteException {
		return medrexInterface.getAllNotesCategories();
	}

	public int insertOrUpdateDietList(DietList diet) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateDietList(diet);
	}

	public DietList getDiet(int serial) throws MedrexException, RemoteException {
		return medrexInterface.getDiet(serial);
	}

	public List getAllDiets() throws MedrexException, RemoteException {
		return medrexInterface.getAllDiets();
	}

	public void deleteDiet(int serial) throws MedrexException, RemoteException {
		medrexInterface.deleteDiet(serial);
	}

	public List<DietList> getDietByCategory(String cat) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietByCategory(cat);
	}

	public int insertOrUpdateDietPlan(DietPlan dietPlan)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateDietPlan(dietPlan);
	}

	public List<DietPlan> getAllDietPlan() throws MedrexException,
			RemoteException {
		return medrexInterface.getAllDietPlan();
	}

	public DietPlan getDietPlan(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getDietPlan(serial);
	}

	public List<DietPlan> getDietPlanByCategory(String cat)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietPlanByCategory(cat);
	}

	public List<DietPlan> getDietPlanByDietName(String dietName)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietPlanByDietName(dietName);
	}

	public void deleteDietPlan(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDietPlan(serial);
	}

	public int insertOrUpdateDietPlanByDate(DietPlanByDate dietPlanByDate)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateDietPlanByDate(dietPlanByDate);
	}

	public DietPlanByDate getDietPlanByDate(String date)
			throws MedrexException, RemoteException {
		return medrexInterface.getDietPlanByDate(date);
	}

	public int insertOrUpdateMedicationNotes(MedicationNotes notes)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateMedicationNotes(notes);
	}

	public List getTemplatesNoteText(int userId, int resId)
			throws MedrexException, RemoteException {
		return medrexInterface.getTemplatesNoteText(userId, resId);
	}

	public MedicationNotes getMedicationNotes(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedicationNotes(serial);
	}

	public void deleteMedicationNotes(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteMedicationNotes(serial);
	}

	// Notes
	public int insertOrUpdateNotes(Notes notes) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateNotes(notes);
	}

	public Notes getNotes(int serial) throws MedrexException, RemoteException {
		return medrexInterface.getNotes(serial);
	}

	public void deleteNotes(int serial) throws MedrexException, RemoteException {
		medrexInterface.deleteNotes(serial);
	}

	public String get1stFloorResident() throws MedrexException, RemoteException {
		return medrexInterface.get1stFloorResident();
	}

	public String get2ndFloorResident() throws MedrexException, RemoteException {
		return medrexInterface.get2ndFloorResident();
	}

	// MasterList

	public void insertOrUpdateMasterListRecord(MasterList refMasterList)
			throws Exception {
		medrexInterface.insertOrUpdateMasterListRecord(refMasterList);
	}

	public List<MasterList> getMasterListRecords(Class cls) throws Exception {
		return medrexInterface.getMasterListRecords(cls);
	}

	public MasterList getMasterListRecord(Class cls, int id) throws Exception {
		return medrexInterface.getMasterListRecord(cls, id);
	}

	public MasterList getMasterListRecord(Class cls, String name)
			throws Exception {
		return medrexInterface.getMasterListRecord(cls, name);
	}

	public void deleteMasterListRecord(Class cls, int id) throws Exception {
		medrexInterface.deleteMasterListRecord(cls, id);
	}

	public List getAccuritiesListByDate(Date d, String floor) throws Exception {
		return medrexInterface.getAccuritiesListByDate(d, floor);
	}

	public List<CensusStatus> getAllCensus(Date dFrom, Date dTo)
			throws MedrexException, RemoteException {
		return medrexInterface.getAllCensus(dFrom, dTo);
	}

	public List getAllCensusStatusByYear() throws MedrexException,
			RemoteException {
		return medrexInterface.getAllCensusStatusByYear();
	}

	public List<CensusStatus> getCensusAdmissionReportData(Date from, Date to)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusAdmissionReportData(from, to);
	}

	public List<CensusStatus> getCensusDischargeReportData(Date from, Date to)
			throws MedrexException, RemoteException {
		return medrexInterface.getCensusDischargeReportData(from, to);
	}

	public void deleteDoctorProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDoctorProgressNotesFormRow(formId);
	}

	public void deleteInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteInterDisciplinaryProgressNotesFormRow(formId);
	}

	// Form Scheduler
	public void deleteFormSchedule(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteFormSchedule(serial);
	}

	public FormSchedule getFormSchedule(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getFormSchedule(serial);
	}

	public List<FormSchedule> getFormSchedules() throws MedrexException,
			RemoteException {
		return medrexInterface.getFormSchedules();
	}

	public int insertOrUpdateFormSchedule(FormSchedule ref)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateFormSchedule(ref);
	}

	// PendingForm
	public void deletePendingForm(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePendingForm(serial);
	}

	public PendingForm getPendingForm(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getPendingForm(serial);
	}

	public List<PendingForm> getPendingForms() throws MedrexException,
			RemoteException {
		return medrexInterface.getPendingForms();
	}

	public List<PendingForm> getPendingFormsByResidentId(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getPendingFormsByResidentId(residentId);
	}

	public int insertOrUpdatePendingForm(PendingForm ref)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdatePendingForm(ref);
	}

	public List getPendingFormsAccordingResident() throws MedrexException,
			RemoteException {
		return medrexInterface.getPendingFormsAccordingResident();
	}

	public List getFirstFloorPendingFormResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getFirstFloorPendingFormResidents();

	}

	public List getSecondFloorPendingFormResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getSecondFloorPendingFormResidents();
	}

	public List getSecondFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getSecondFloorPendingFormAlertResidents();
	}

	public List getFirstFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException {
		return medrexInterface.getFirstFloorPendingFormAlertResidents();
	}

	public List getPendingAlert() throws MedrexException, RemoteException {
		return medrexInterface.getPendingAlert();
	}

	public List getAllNewLabReportsResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getAllNewLabReportsResidents();
	}

	public List getFirstFloorNewLabReportResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getFirstFloorNewLabReportResidents();
	}

	public List getSecondFloorNewLabReportResidents() throws MedrexException,
			RemoteException {
		return medrexInterface.getSecondFloorNewLabReportResidents();
	}

	// /
	public ResidentMain getResident(int residentId, int activeId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResident(residentId, activeId);
	}

	public ResidentMain getResidentFloorWise(int residentId, String floor)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentFloorWise(residentId, floor);
	}

	public List<ResidentMain> getActiveResident(int str)
			throws MedrexException, RemoteException {
		return medrexInterface.getActiveResident(str);
	}

	// checking server version

	public float serverVersion() throws MedrexException, RemoteException {
		return medrexInterface.serverVersion();
	}

	public Report getLabReports(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getLabReports(serial);
	}

	public void insertOrUpdatedLabReportText(Report rep)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdatedLabReportText(rep);
	}

	public List getLabReportList(int residentId) throws MedrexException,
			RemoteException {
		return medrexInterface.getLabReportList(residentId);
	}

	public int insertOrUpdateResidentassessmentFormPage19Col(
			List<ResidentAssessmentFormPage19Col> columns)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateResidentassessmentFormPage19Col(columns);
	}

	public ResidentAssessmentFormPage19 getResidentAssessmentFormPage19(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getResidentAssessmentFormPage19(currentResidentAssessmentFormPage19Key);
	}

	public List<ResidentAssessmentFormPage19Col> getResidentAssessmentFormPage19Columns(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getResidentAssessmentFormPage19Columns(currentResidentAssessmentFormPage19Key);
	}

	public int insertOrUpdateDailySkilledNursesNotesForm2(
			DailySkilledNursesNotesForm2 refForm2) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdateDailySkilledNursesNotesForm2(refForm2);
	}

	public void insertOrUpdateDailySkilledNursesNotesRows(
			List<DailySkilledNursesNotesRow> rows) throws MedrexException,
			RemoteException {
		medrexInterface.insertOrUpdateDailySkilledNursesNotesRows(rows);
	}

	public DailySkilledNursesNotesForm2 getDailySkilledNursesNotesForm2(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getDailySkilledNursesNotesForm2(currentDailySkilledNursesNotesForm2Key);
	}

	public List<DailySkilledNursesNotesRow> getDailySkilledNursesNotesRows(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getDailySkilledNursesNotesRows(currentDailySkilledNursesNotesForm2Key);
	}

	public int insertOrUpdateDailySkilledNursesNotes(
			DailySkilledNursesNotes refDailySkilledNursesNotes)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateDailySkilledNursesNotes(refDailySkilledNursesNotes);
	}

	// screen saver
	public void insertOrUpdateScreenSaverConfig(Config config)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateScreenSaverConfig(config);
	}

	public Config getScreenSaverConfig() throws MedrexException,
			RemoteException {
		return medrexInterface.getScreenSaverConfig();
	}

	// Alert
	public int insertOrUpdateAlert(Alert alert) throws MedrexException,
			RemoteException {
		return medrexInterface.insertOrUpdateAlert(alert);
	}

	public List getAlertList(int currentResidenceKey) throws MedrexException,
			RemoteException {
		return medrexInterface.getAlertList(currentResidenceKey);
	}

	public void deleteAlertRecord(int id) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAlertRecord(id);
	}

	public Alert getAlertRecord(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getAlertRecord(currentResidenceKey);
	}

	public DailySkilledNursesNotes getDailySkilledNursesNotes(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getDailySkilledNursesNotes(currentDailySkilledNursesNotesKey);
	}

	public void deleteDailySkilledNursesNotes(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteDailySkilledNursesNotes(formId);
	}

	public void deleteDailySkilledNursesNotesForm2(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException {

		medrexInterface
				.deleteDailySkilledNursesNotesForm2(currentDailySkilledNursesNotesKey);
	}

	public void deleteDailySkilledNursesNotesRow(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException {
		medrexInterface
				.deleteDailySkilledNursesNotesRow(currentDailySkilledNursesNotesForm2Key);
	}

	public void deleteResidentAssessmentFormPage21(int formId)
			throws MedrexException, RemoteException {
		medrexInterface.deleteResidentAssessmentFormPage21(formId);
	}

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage1(
			SocialServiceInitialAssessmentFormPage1 refSocialServiceInitialAssessmentFormPage1)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateSocialServiceInitialAssessmentFormPage1(refSocialServiceInitialAssessmentFormPage1);
	}

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage2(
			SocialServiceInitialAssessmentFormPage2 refSocialServiceAssessmentForm2)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateSocialServiceInitialAssessmentFormPage2(refSocialServiceAssessmentForm2);
	}

	public SocialServiceInitialAssessmentFormPage1 getSocialServiceInitialAssessmentFormPage1(
			int currentSocialServiceInitialAssessmentKey)
			throws RemoteException, MedrexException {

		return medrexInterface
				.getSocialServiceInitialAssessmentFormPage1(currentSocialServiceInitialAssessmentKey);
	}

	public SocialServiceInitialAssessmentFormPage2 getSocialServiceInitialAssessmentFormPage2(
			int currentSocialServiceInitialAssessmentForm2Key)
			throws RemoteException, MedrexException {
		return medrexInterface
				.getSocialServiceInitialAssessmentFormPage2(currentSocialServiceInitialAssessmentForm2Key);
	}

	public void deleteSocialServiceInitialAssessmentFormPage1(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteSocialServiceInitialAssessmentFormPage1(formId);
	}

	public void deleteSocialServiceInitialAssessmentFormPage2(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteSocialServiceInitialAssessmentFormPage2(formId);
	}

	// Nutrition Support
	public int insertOrUpdateNutritionSupportAssessmentFormPage1(
			NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1)
			throws RemoteException, MedrexException {
		return medrexInterface
				.insertOrUpdateNutritionSupportAssessmentFormPage1(refNutritionSupportAssessmentFormPage1);
	}

	// public int insertOrUpdatePendingAlert(PendingAlert pa)
	// throws RemoteException, MedrexException {
	// return medrexInterface.insertOrUpdatePendingAlert(pa);
	// }

	public List getPendingAlertList(int currentResidenceKey, String str,
			int key, String type) throws RemoteException, MedrexException {
		return medrexInterface.getPendingAlertList(currentResidenceKey, str,
				key, type);
	}

	// public void deletePendingAlertRecord(int id) throws RemoteException,
	// MedrexException {
	// medrexInterface.deletePendingAlertRecord(id);
	// }

	public List getPendingAlertRecords(int currentAlertKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getPendingAlertRecords(currentAlertKey);
	}

	public int getTotalPendingAlertCount() throws RemoteException,
			MedrexException {
		return medrexInterface.getTotalPendingAlertCount();
	}

	public List getResidentPendingAlerts(String str, int key)
			throws RemoteException, MedrexException {
		return medrexInterface.getResidentPendingAlerts(str, key);
	}

	public NutritionSupportAssessmentFormPage1 getNutritionSupportAssessmentFormPage1(
			int currentNutritionSupportAssessmentFormKey)
			throws MedrexException, RemoteException {

		return medrexInterface
				.getNutritionSupportAssessmentFormPage1(currentNutritionSupportAssessmentFormKey);
	}

	public void deleteNutritionSupportAssessmentFormPage1(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteNutritionSupportAssessmentFormPage1(formId);

	}

	public ResidentAssessmentFormPage1 getLatestResidentAssessmentFormPage1(
			int residentId) throws RemoteException, MedrexException {
		return medrexInterface.getLatestResidentAssessmentFormPage1(residentId);
	}

	public List getAccutiesDate() throws RemoteException, MedrexException {
		return medrexInterface.getAccutiesDate();
	}

	public List<UserLogon> getFilteredUsers(Date from, Date to)
			throws RemoteException, MedrexException {
		return medrexInterface.getFilteredUsers(from, to);
	}

	public int getUpcomingAlerts(int time, String type, String key)
			throws RemoteException, MedrexException {
		return medrexInterface.getUpcomingAlerts(time, type, key);
	}

	public int getTotalPastAlerts(String key) throws RemoteException,
			MedrexException {
		return medrexInterface.getTotalPastAlerts(key);
	}

	public Alert getGlobalAlertRecord(int id) throws RemoteException,
			MedrexException {
		return medrexInterface.getGlobalAlertRecord(id);
	}

	public List getGlobalAlertList(int globalAlertId, int userKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getGlobalAlertList(globalAlertId, userKey);
	}

	// public List getGlobalPendingAlertList(int globalAlertId) throws
	// RemoteException, MedrexException {
	// return medrexInterface.getGlobalPendingAlertList(globalAlertId);
	// }

	public int getGlobalUpcomingAlerts(int time, String str, String key)
			throws RemoteException, MedrexException {
		return medrexInterface.getGlobalUpcomingAlerts(time, str, key);
	}

	public int getGlobalTotalPastAlerts(String key) throws RemoteException,
			MedrexException {
		return medrexInterface.getGlobalTotalPastAlerts(key);
	}

	public List getDepartmentList() throws RemoteException, MedrexException {
		return medrexInterface.getDepartmentList();
	}

	public List<Users> getUserListFromDepartment(String user)
			throws RemoteException, MedrexException {
		return medrexInterface.getUserListFromDepartment(user);
	}

	public void insertOrUpdateAlertSetting(AlertSetting as)
			throws RemoteException, MedrexException {
		medrexInterface.insertOrUpdateAlertSetting(as);
	}

	public List getAlertSetting() throws RemoteException, MedrexException {
		return medrexInterface.getAlertSetting();
	}

	// public PendingAlert getPendingAlert(int currentPendingAlertKey)
	// throws RemoteException, MedrexException {
	// return medrexInterface.getPendingAlert(currentPendingAlertKey);
	// }

	// public List<PendingAlert> getPendingAlertList(String string) throws
	// RemoteException, MedrexException {
	// return medrexInterface.getPendingAlertList(string);
	// }

	public List getResidentFutureAlerts(int time, String type,
			String currentLoggedInUserName) throws RemoteException,
			MedrexException {
		return medrexInterface.getResidentFutureAlerts(time, type,
				currentLoggedInUserName);
	}

	public List getGlobalPendingAlerts(String currentLoggedInUserName)
			throws RemoteException, MedrexException {
		return medrexInterface.getGlobalPendingAlerts(currentLoggedInUserName);
	}

	public List getPendingOwnerList(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getPendingOwnerList(currentLoggedInUserKey);
	}

	// public int insertOrUpdatePendingMedication(PendingMedication pm)throws
	// RemoteException, MedrexException {
	// return medrexInterface.insertOrUpdatePendingMedication(pm);
	// }

	public int getCompletedAlertsCount(int key, String str)
			throws RemoteException, MedrexException {
		return medrexInterface.getCompletedAlertsCount(key, str);
	}

	public int getAlertCountSentByMe(int key) throws RemoteException,
			MedrexException {
		return medrexInterface.getAlertCountSentByMe(key);
	}

	public int getGlobalCompletedAlertsCount(int key, String str)
			throws RemoteException, MedrexException {
		return medrexInterface.getGlobalCompletedAlertsCount(key, str);
	}

	public int getGlobalAlertCountSentByMe(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return medrexInterface
				.getGlobalAlertCountSentByMe(currentLoggedInUserKey);
	}

	public void addMessageServer(MsgServer msgServer) throws RemoteException,
			MedrexException {
		medrexInterface.addMessageServer(msgServer);
	}

	// Trigger Word
	public int insertOrUpdateTriggerWord(TriggerWord tw)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateTriggerWord(tw);
	}

	public TriggerWord getTriggerWord(int serial) throws RemoteException,
			MedrexException {
		return medrexInterface.getTriggerWord(serial);
	}

	public List<TriggerWord> getAllTriggerWords() throws RemoteException,
			MedrexException {
		return medrexInterface.getAllTriggerWords();
	}

	public void deleteTriggerWord(int id) throws RemoteException,
			MedrexException {
		medrexInterface.deleteTriggerWord(id);
	}

	public List getTriggerWordList() throws RemoteException, MedrexException {
		return medrexInterface.getTriggerWordList();
	}

	public void deletePressureSoreAssessment(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deletePressureSoreAssessment(formId);

	}

	public int getCarePlanAnalyzerCount() throws RemoteException,
			MedrexException {
		return medrexInterface.getCarePlanAnalyzerCount();
	}

	public List getCarePlanAnalyzerResidentCount() throws RemoteException,
			MedrexException {
		// TODO Auto-generated method stub
		return medrexInterface.getCarePlanAnalyzerResidentCount();
	}

	public List<CarePlanAnalyzerBean> getCarePlanAnalyzerByResidentId(
			int residentId) throws RemoteException, MedrexException {
		return medrexInterface.getCarePlanAnalyzerByResidentId(residentId);
	}

	// Admin Medication
	public Long insertOrUpdateMedications(Medication med)
			throws RemoteException, MedrexException {
		// TODO Auto-generated method stub
		return medrexInterface.insertOrUpdateMedications(med);
	}

	public Medication getMedication(long l) throws RemoteException,
			MedrexException {
		return medrexInterface.getMedication(l);
	}

	public List<Medication> getAllMedications() throws RemoteException,
			MedrexException {
		return medrexInterface.getAllMedications();
	}

	public void deleteMedication(long id) throws RemoteException,
			MedrexException {
		medrexInterface.deleteMedication(id);
	}

	// public List<PendingAlert> getPendingPastAlertList(int
	// currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws RemoteException,
	// MedrexException {
	// return medrexInterface.getPendingPastAlertList(currentResidenceKey,
	// currentLoggedInUserName, currentLoggedInUserKey,
	// currentLoggedInUserType);
	// }
	//
	// public List<PendingAlert> getPendingUpcomingAlertList(int alertTime,
	// String alertType, int currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws RemoteException,
	// MedrexException {
	// return medrexInterface.getPendingUpcomingAlertList(alertTime,
	// alertType, currentResidenceKey, currentLoggedInUserName,
	// currentLoggedInUserKey, currentLoggedInUserType);
	// }

	// public List<PendingAlert> getPendingCompletedAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws RemoteException, MedrexException {
	// return medrexInterface.getPendingCompletedAlertList(
	// currentResidenceKey, currentLoggedInUserKey);
	// }
	//
	// public List<PendingAlert> getPendingISendOutAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws RemoteException, MedrexException {
	// return medrexInterface.getPendingISendOutAlertList(currentResidenceKey,
	// currentLoggedInUserKey);
	// }

	// public List getResidentAlertsISendOut(int currentLoggedInUserKey)
	// throws RemoteException, MedrexException {
	// return medrexInterface
	// .getResidentAlertsISendOut(currentLoggedInUserKey);
	// }
	//
	// public List getResidentAlertsCompleted(int currentLoggedInUserKey)
	// throws RemoteException, MedrexException {
	// return medrexInterface
	// .getResidentAlertsCompleted(currentLoggedInUserKey);
	// }

	public void suspendAlert(int serial, int time, String type)
			throws RemoteException, MedrexException {
		medrexInterface.suspendAlert(serial, time, type);
	}

	public void insertOrUpdateNursinhHome(NursingHome nh)
			throws RemoteException, MedrexException {
		medrexInterface.insertOrUpdateNursinhHome(nh);
	}

	public NursingHome getNursingHomeInfo(int i) throws RemoteException,
			MedrexException {
		return medrexInterface.getNursingHomeInfo(i);
	}

	public List getRichTextFieldValues(String rtfType, String key)
			throws RemoteException, MedrexException {
		return medrexInterface.getRichTextFieldValues(rtfType, key);
	}

	public void insertOrUpdateRichTextFieldValue(RichTextField rtf)
			throws RemoteException, MedrexException {
		medrexInterface.insertOrUpdateRichTextFieldValue(rtf);
	}

	// test fro RA

	public int insertOrUpdateRARecord(RARecord raRecord)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateRARecord(raRecord);
	}

	public List<DataObject> getRARecord(int serial) throws RemoteException,
			MedrexException {
		return medrexInterface.getRARecord(serial);
	}

	public List<RARecord> getRARecordList(int residentId)
			throws RemoteException, MedrexException {
		return medrexInterface.getRARecordList(residentId);
	}

	public void deleteRAFPg1Record(int serial) throws RemoteException,
			MedrexException {
		medrexInterface.deleteRAFPg1Record(serial);
	}

	public void deleteRAFPg2Record(int serial) throws RemoteException,
			MedrexException {
		medrexInterface.deleteRAFPg2Record(serial);
	}

	public void deleteRARecord(int serial) throws RemoteException,
			MedrexException {
		medrexInterface.deleteRARecord(serial);
	}

	public int insertOrUpdateRAFPg1(RAFPg1 raPg1) throws RemoteException,
			MedrexException {
		return medrexInterface.insertOrUpdateRAFPg1(raPg1);
	}

	public RAFPg1 getRAFP1(int serial) throws RemoteException, MedrexException {
		return medrexInterface.getRAFP1(serial);
	}

	public int insertOrUpdateRAFPg2(RAFPg2 raPg2) throws RemoteException,
			MedrexException {
		return medrexInterface.insertOrUpdateRAFPg2(raPg2);
	}

	public RAFPg2 getRAFPg2(int serial) throws RemoteException, MedrexException {
		return medrexInterface.getRAFPg2(serial);
	}

	public void saveRAFPages(List<DataObject> listDataObjects)
			throws RemoteException, MedrexException {
		medrexInterface.saveRAFPages(listDataObjects);
	}

	public int getKeyByDate(Date cal) throws RemoteException, MedrexException {
		return medrexInterface.getKeyByDate(cal);
	}

	public List<RoomChange> getRoomChange(Date searchDate)
			throws RemoteException, MedrexException {
		return medrexInterface.getRoomChange(searchDate);
	}

	public List<RoomChange> getRoomChangeFirstFloor(Date searchDate)
			throws RemoteException, MedrexException {
		return medrexInterface.getRoomChangeFirstFloor(searchDate);
	}

	public List<RoomChange> getRoomChangeSecondFloor(Date searchDate)
			throws RemoteException, MedrexException {
		return medrexInterface.getRoomChangeSecondFloor(searchDate);
	}

	public int getSpeechDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException {
		return medrexInterface.getSpeechDailyKeyByDate(cal);
	}

	public List<CensusStatus> getCensusDayReportAdmissionList(Date date)
			throws RemoteException, MedrexException {
		return medrexInterface.getCensusDayReportAdmissionList(date);
	}

	public List<CensusStatus> getCensusDayReportDischargeList(Date date)
			throws RemoteException, MedrexException {
		return medrexInterface.getCensusDayReportDischargeList(date);
	}

	public List<CensusStatus> getCensusDayReportOutOnPassList(Date date)
			throws RemoteException, MedrexException {
		return medrexInterface.getCensusDayReportOutOnPassList(date);
	}

	public List<CensusStatus> getCensusDayReportHospitalList(Date date)
			throws RemoteException, MedrexException {
		return medrexInterface.getCensusDayReportHospitalList(date);
	}

	/*
	 * public TempRoomHistory getRoomHistoryAccToCensus(int cenId) throws
	 * RemoteException, MedrexException { return
	 * medrexInterface.getRoomHistoryAccToCensus(cenId); }
	 */

	public TempRoomHistory getRoomHistoryAccToCensusAdmission(int cenAdmissionId)
			throws RemoteException, MedrexException {
		return medrexInterface
				.getRoomHistoryAccToCensusAdmission(cenAdmissionId);
	}

	public TempRoomHistory getRoomHistoryAccToCensusDischarge(int cenDischargeId)
			throws RemoteException, MedrexException {
		return medrexInterface
				.getRoomHistoryAccToCensusDischarge(cenDischargeId);
	}

	public int getPhysicalDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException {
		return medrexInterface.getPhysicalDailyKeyByDate(cal);
	}

	public PtOtStOccupationalTherapy getExistingOccupationalTherapyForm700(
			Date fromDate, Date toDate) throws RemoteException, MedrexException {
		return medrexInterface.getExistingOccupationalTherapyForm700(fromDate,
				toDate);
	}

	public PtOtStSpeechLanguage getExistingSpeechLanguageForm700(Date fromDate,
			Date toDate) throws RemoteException, MedrexException {
		return medrexInterface.getExistingSpeechLanguageForm700(fromDate,
				toDate);
	}

	public List<CensusStatus> getCensusSignInOutReportData(Date from, Date to)
			throws RemoteException, MedrexException {
		return medrexInterface.getCensusSignInOutReportData(from, to);
	}

	public int insertOrUpdateCarePlanValues(CarePlanValues careValues)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateCarePlanValues(careValues);
	}

	public CarePlanValues getCarePlanValues(
			int currentResidentAssessmentFormKey, int currentResidenceKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getCarePlanValues(
				currentResidentAssessmentFormKey, currentResidenceKey);
	}

	public void deleteResidentCarePlanValues(int formId, int currentResidenceKey)
			throws RemoteException, MedrexException {
		medrexInterface.deleteResidentCarePlanValues(formId,
				currentResidenceKey);
	}

	public void lockUserStatus(String userID) throws RemoteException,
			MedrexException {
		medrexInterface.lockUserStatus(userID);
	}

	public PasswordSetting getPasswordSetting() throws RemoteException,
			MedrexException {
		return medrexInterface.getPasswordSetting();
	}

	public int insertOrUpdatePasswordSettings(PasswordSetting ps)
			throws RemoteException, MedrexException {

		return medrexInterface.insertOrUpdatePasswordSettings(ps);
	}

	public List<Users> getUserWithStatus(int status) throws RemoteException,
			MedrexException {

		return medrexInterface.getUserWithStatus(status);
	}

	public void deletegetAlertTimeRecord(int id) throws RemoteException,
			MedrexException {
		medrexInterface.deletegetAlertTimeRecord(id);
	}

	public List<CalculatedAlert> getCalculatedAlertList()
			throws RemoteException, MedrexException {
		return medrexInterface.getCalculatedAlertList();
	}

	public List<CalculatedAlert> getCalculatedAlertListByUser(
			int currentLoggedInUserKey, String str, int key, String string)
			throws RemoteException, MedrexException {
		return medrexInterface.getCalculatedAlertListByUser(
				currentLoggedInUserKey, str, key, string);
	}

	public int getCalculatedAlert(int id) throws RemoteException,
			MedrexException {
		return medrexInterface.getCalculatedAlert(id);
	}

	public CalculatedAlert getCalculatedAlertBean(int serial)
			throws RemoteException, MedrexException {
		return medrexInterface.getCalculatedAlertBean(serial);
	}

	public void insertOrUpdateCalculatedAlert(CalculatedAlert pa)
			throws RemoteException, MedrexException {
		medrexInterface.insertOrUpdateCalculatedAlert(pa);
	}

	public List getAllAlertCounts(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getAllAlertCounts(currentLoggedInUserKey);
	}

	public void changeUserStatus(int[] selectedUserId, int status)
			throws RemoteException, MedrexException {

		medrexInterface.changeUserStatus(selectedUserId, status);
	}

	public String getUserName(int currentLoggedInUserkey)
			throws RemoteException, MedrexException {
		return medrexInterface.getUserName(currentLoggedInUserkey);
	}

	public List getSignOutsER() throws RemoteException, MedrexException {

		return medrexInterface.getSignOutsER();
	}

	public List<SignOut> getErForResidents(Date date) throws RemoteException,
			MedrexException {
		return medrexInterface.getErForResidents(date);
	}

	public List getCurrentSlotTime(String floorType) throws RemoteException,
			MedrexException {
		return medrexInterface.getCurrentSlotTime(floorType);
	}

	public List<MedicationView> getMedicationsList(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getMedicationsList(currentResidenceKey);
	}

	public void insertOrUpdateCalculatedMedication(CalculatedMedication cm)
			throws RemoteException, MedrexException {
		medrexInterface.insertOrUpdateCalculatedMedication(cm);
	}

	public Medications getMedications(int calcSerial) throws RemoteException,
			MedrexException {
		return medrexInterface.getMedications(calcSerial);
	}

	public List getMedicationHistoryTimes() throws RemoteException,
			MedrexException {
		return medrexInterface.getMedicationHistoryTimes();
	}

	public static boolean getAdminUsers(String userName)
			throws RemoteException, MedrexException {
		return medrexInterface.getAdminUsers(userName);
	}

	public int insertOrUpdateMonthlySummaryPage1(
			MonthlySummaryPage1 refMonthlySummaryPage1) throws RemoteException,
			MedrexException {
		return medrexInterface
				.insertOrUpdateMonthlySummaryPage1(refMonthlySummaryPage1);
	}

	public MonthlySummaryPage1 getMonthlySummaryPage1(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {

		return medrexInterface.getMonthlySummaryPage1(msr);
	}

	// for 2nd page
	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryPage2 refMonthlySummaryPage2) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateMonthlySummaryPage2(refMonthlySummaryPage2);
	}

	public MonthlySummaryPage2 getMonthlySummaryPage2(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryPage2(msr);
	}

	// for main page
	public int insertOrUpdateMonthlySummaryMainPage(
			MonthlySummaryMainPage refMonthlySummaryMainPage)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateMonthlySummaryPage2(refMonthlySummaryMainPage);
	}

	public MonthlySummaryMainPage getMonthlySummaryMainPage(
			MonthlySummaryRecord msr) throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryMainPage(msr);
	}

	public int insertOrUpdateMonthlySummaryRecord(
			MonthlySummaryRecord monthlySum) throws RemoteException,
			MedrexException {
		return medrexInterface.insertOrUpdateMonthlySummaryRecord(monthlySum);
	}

	public MonthlySummaryRecord getMonthlySummaryRecord(
			int currentActivitysRecordKey) throws RemoteException,
			MedrexException {
		return medrexInterface
				.getMonthlySummaryRecord(currentActivitysRecordKey);
	}

	public ArrayList<MonthlySummaryRecord> getMonthlySummaryRecords(
			int currentResidenceKey) throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryRecords(currentResidenceKey);
	}

	public void deleteMonthlySummaryMainPage(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteMonthlySummaryMainPage(formId);
	}

	public void deleteMonthlySummaryPage1(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteMonthlySummaryPage1(formId);
	}

	public void deleteMonthlySummaryPage2(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteMonthlySummaryPage2(formId);
	}

	public void deleteMonthlySummaryRecord(int id) throws RemoteException,
			MedrexException {
		medrexInterface.deleteMonthlySummaryRecord(id);
	}

	public TempRoomHistory getRoomForResident(int serial, String str)
			throws RemoteException, MedrexException {
		return medrexInterface.getRoomForResident(serial, str);
	}

	public TempRoomHistory getCurrentRoomForResident(int residentId)
			throws MedrexException, RemoteException {
		return medrexInterface.getCurrentRoomForResident(residentId);
	}

	public int insertOrUpdateMonthlySummaryPage5(
			MonthlySummaryPage5 refMonthlySummaryPage5) throws RemoteException,
			MedrexException {
		return medrexInterface
				.insertOrUpdateMonthlySummaryPage5(refMonthlySummaryPage5);
	}

	public MonthlySummaryPage5 getMonthlySummaryPage5(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryPage5(msr);
	}

	public int insertOrUpdateMonthlySummaryPage4(
			MonthlySummaryPage4 refMonthlySummaryPage4) throws RemoteException,
			MedrexException {
		return medrexInterface
				.insertOrUpdateMonthlySummaryPage4(refMonthlySummaryPage4);
	}

	public MonthlySummaryPage4 getMonthlySummaryPage4(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryPage4(msr);
	}

	public int insertOrUpdateMonthlySummaryPage3(
			MonthlySummaryPage3 refMonthlySummaryPage3) throws RemoteException,
			MedrexException {
		return medrexInterface
				.insertOrUpdateMonthlySummaryPage3(refMonthlySummaryPage3);
	}

	public MonthlySummaryPage3 getMonthlySummaryPage3(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return medrexInterface.getMonthlySummaryPage3(msr);
	}

	public void deleteDoctorsRecord(int currentSelectedUserId,
			int currentUsersKey) throws RemoteException, MedrexException {
		medrexInterface.deleteDoctorsRecord(currentSelectedUserId,
				currentUsersKey);
	}

	public void deleteNurseRecord(int currentSelectedUserId, int currentUsersKey)
			throws RemoteException, MedrexException {
		medrexInterface.deleteNurseRecord(currentSelectedUserId,
				currentUsersKey);
	}

	public void deleteUser(int currentUsersKey, int currentSelectedUserId)
			throws RemoteException, MedrexException {
		medrexInterface
				.deleteUserRecord(currentUsersKey, currentSelectedUserId);
	}

	public void doScanSave(int residentId, String residentTabName,
			String scanFormName, ImageIcon icon) throws RemoteException,
			MedrexException {
		medrexInterface.doScanSave(residentId, residentTabName, scanFormName,
				icon);
	}

	public Object[] getRoomHistoryDataSource(Date from, Date to)
			throws RemoteException, MedrexException {
		return medrexInterface.getRoomHistoryDataSource(from, to);
	}

	public List<ScanForm> doLoadScans(int residentId, String residentTabName)
			throws RemoteException, MedrexException {
		return medrexInterface.doLoadScans(residentId, residentTabName);
	}

	public ScanForm getScan(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException {
		return medrexInterface.getScan(residentId, residentTabName, fileName);
	}

	public void deleteScanForm(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException {
		medrexInterface.deleteScanForm(residentId, residentTabName, fileName);
	}

	public void deleteScanFile(File file) throws RemoteException,
			MedrexException {
		medrexInterface.deleteScanFile(file);
	}

	public int insertOrUpdateAdmissionDischargeSummary(
			AdmissionAndDischargeSummary admissionAndDischargeSummary)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateAdmissionDischargeSummary(admissionAndDischargeSummary);
	}

	public AdmissionAndDischargeSummary getAdmissionAndDischarge(
			MonthlySummaryRecord msr) throws RemoteException, MedrexException {
		return medrexInterface.getAdmissionAndDischarge(msr);
	}

	public int insertOrUpdateResidentAllergies(ResidentAllergies ref)
			throws RemoteException, MedrexException {

		return medrexInterface.insertOrUpdateResidentAllergies(ref);
	}

	public List<ResidentAllergies> getResidentAllergiesforResident(
			int residentId) throws RemoteException, MedrexException {
		return medrexInterface.getResidentAllergiesforResident(residentId);
	}

	public void deleteResidentAllergies(int id) throws RemoteException,
			MedrexException {
		medrexInterface.deleteResidentAllergies(id);
	}

	public ResidentAllergies getResidentAllergy(int currSerial)
			throws RemoteException, MedrexException {
		return medrexInterface.getResidentAllergy(currSerial);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(String text,
			String selectedButton) throws RemoteException, MedrexException {

		return medrexInterface.getResidentAllergiesForString(text,
				selectedButton);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(
			String selectedButton) throws RemoteException, MedrexException {
		return medrexInterface.getResidentAllergiesForString(selectedButton);
	}

	// Validation test
	public ValidationForm getRaFPg1ValidationRecord(String className)
			throws MedrexException, RemoteException {
		return medrexInterface.getRaFPg1ValidationRecord(className);
	}

	public int insertOrUpdateValidationForm(ValidationForm vfRef)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateValidationForm(vfRef);
	}

	public ValidationForm getValidations(int currentValidationFormKey)
			throws RemoteException, MedrexException {

		return medrexInterface.getValidations(currentValidationFormKey);
	}

	public ValidationForm getAllValidations(String selectedFormFullPath)
			throws RemoteException, MedrexException {

		return medrexInterface.getAllValidations(selectedFormFullPath);
	}

	public boolean isFormFieldAlreadyExist(String retrieveNameOf,
			String selectedFormFullPath) throws RemoteException,
			MedrexException {

		return medrexInterface.isFormFieldAlreadyExist(retrieveNameOf,
				selectedFormFullPath);
	}

	public int insertFormConfigAlert(FormConfigAlert alertRef)
			throws RemoteException, MedrexException {

		return medrexInterface.insertFormConfigAlert(alertRef);
	}

	public void deleteValidationFormField(int serial) throws RemoteException,
			MedrexException {

		medrexInterface.deleteValidationFormField(serial);
	}

	// for getting all users according to given triggered words.
	public List<Users> getUsersAccordingToTriggerWords(String triggerWords)
			throws MedrexException, RemoteException {
		return medrexInterface.getUsersAccordingToTriggerWords(triggerWords);
	}

	// get created date and modified date of triggerd word
	public List<TriggerWord> getTriggerWordCreatedAndModifiedDate(
			String triggerWords) throws MedrexException, RemoteException {
		return medrexInterface
				.getTriggerWordCreatedAndModifiedDate(triggerWords);
	}

	public List<Notes> getSelectedNotesAccToFrmAndCategories(String formName,
			List<NotesCategories> notesCategories, int residentId, Date dFrom,
			Date dTo) throws MedrexException, RemoteException {
		return medrexInterface.getSelectedNotesAccToFrmAndCategories(formName,
				notesCategories, residentId, dFrom, dTo);
	}

	public void insertOrUpdateScheduling(scheduling sch)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateScheduling(sch);
	}

	public List getResidentScheduling(int serial) throws MedrexException,
			RemoteException {
		return medrexInterface.getResidentScheduling(serial);

	}

	public scheduling getSchedulingObject(int currentSerial)
			throws MedrexException, RemoteException {

		return medrexInterface.getSchedulingObject(currentSerial);
	}

	public String deleteScheduling(int currentSerial, String str)
			throws MedrexException, RemoteException {
		return medrexInterface.deleteScheduling(currentSerial, str);
	}

	public List<NotesCategories> getNoteCategories(int serial)
			throws RemoteException, MedrexException {

		return medrexInterface.getNoteCategories(serial);
	}

	public List<Notes> getLatestNotes(NotesCategories nc)
			throws MedrexException, RemoteException {
		return medrexInterface.getLatestNotes(nc);
	}

	public List<CareLogMaster> getCareLogMasterForResident(
			int currentResidenceKey) throws RemoteException, MedrexException {

		return medrexInterface.getCareLogMasterForResident(currentResidenceKey);
	}

	public int insertOrUpdateCareLog(CareLogMaster careLogMaster)
			throws RemoteException, MedrexException {

		return medrexInterface.insertOrUpdateCareLog(careLogMaster);
	}

	public CareLogMaster getCareLogMaster(int careLogSerial)
			throws RemoteException, MedrexException {

		return medrexInterface.getCareLogMaster(careLogSerial);
	}

	public int insertOrUpdateMSJN(MSJN refMSJN) throws RemoteException,
			MedrexException {
		return medrexInterface.insertOrUpdateMsnj(refMSJN);

	}

	public MSJN getMsnj(int currentMsjnKey) throws RemoteException,
			MedrexException {
		return medrexInterface.getMsnj(currentMsjnKey);
	}

	public int insertOrUpdateAssessingResident1(
			AssessingResident1 refAssessingResident1) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateAssessingResident1(refAssessingResident1);
	}

	public AssessingResident1 getAssessingResident1(
			int currentAssessingResident1) throws RemoteException,
			MedrexException {
		return medrexInterface.getAssessingResident1(currentAssessingResident1);
	}

	public int insertOrUpdateAssessingResident2(
			AssessingResident2 refAssessingResident2) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateAssessingResident2(refAssessingResident2);
	}

	public AssessingResident2 getAssessingResident2(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {

		return medrexInterface
				.getAssessingResident2(currentMonthlySummaryRecordKey);
	}

	public int insertOrUpdateAssessingResident3(
			AssessingResident3 refAssessingResident3) throws RemoteException,
			MedrexException {
		return medrexInterface
				.insertOrUpdateAssessingResident3(refAssessingResident3);
	}

	public AssessingResident3 getAssessingResident3(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {

		return medrexInterface
				.getAssessingResident3(currentMonthlySummaryRecordKey);
	}

	public int insertOrUpdatePhysicianNotes(
			PhysicianProgressNotes refPhysicianProgressNotes)
			throws RemoteException, MedrexException {
		return medrexInterface
				.insertOrUpdatePhysicianNotes(refPhysicianProgressNotes);
	}

	public PhysicianProgressNotes getPhysicianProgressNotes(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {

		return medrexInterface
				.getPhysicianProgressNotes(currentMonthlySummaryRecordKey);
	}

	public void deleteMsnj(int formId) throws RemoteException, MedrexException {
		medrexInterface.deleteMsnj(formId);
	}

	public void deleteAccessingResident1(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteAccessingResident1(formId);
	}

	public void deleteAccessingResident2(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteAccessingResident2(formId);

	}

	public void deleteAccessingResident3(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteAccessingResident3(formId);
	}

	public void deletePhysicalProgressNotes(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deletePhysicalProgressNotes(formId);

	}

	public int insertOrUpdateVitals(ResidentVitalSigns vital)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateVitals(vital);
	}

	public List<ResidentVitalSigns> getVitalSigns(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getVitalSigns(currentResidenceKey);
	}

	public void deleteResidentVitalRecord(int vitalId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteResidentVitalRecord(vitalId);
	}

	public ResidentVitalSigns getVitalSign(int currentVitalSignKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getVitalSign(currentVitalSignKey);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfResident(
			int currentResidenceKey) throws RemoteException, MedrexException {
		return medrexInterface
				.getResidentAssessmentFormPage14OfResident(currentResidenceKey);
	}

	public int insertOrUpdateResidentWeight(ResidentWeight resWeight)
			throws RemoteException, MedrexException {
		return medrexInterface.insertOrUpdateResidentWeight(resWeight);
	}

	public List<ResidentWeight> getResidentWeights(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getResidentWeights(currentResidenceKey);
	}

	public void deleteResidentWeightRecord(int id) throws RemoteException,
			MedrexException {
		medrexInterface.deleteResidentWeightRecord(id);

	}

	public ResidentWeight getResidentWeightRecord(int currentResidentWeightKey)
			throws RemoteException, MedrexException {
		return medrexInterface
				.getResidentWeightRecord(currentResidentWeightKey);
	}

	public ResidentWeight getResidentLatestWeight(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return medrexInterface.getResidentLatestWeight(currentResidenceKey);
	}

	public List<ResidentWeightBean> getResidentsWeight(Date dFrom, Date dTo,
			String withOrWithoutWeight) throws RemoteException, MedrexException {
		return medrexInterface.getResidentsWeight(dFrom, dTo,
				withOrWithoutWeight);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfLast3Weeks(
			int resId, int currentPg14Key) throws RemoteException,
			MedrexException {

		return medrexInterface.getResidentAssessmentFormPage14OfLast3Weeks(
				resId, currentPg14Key);
	}

	public ResidentWeight getPreviousResidentWeightRecord(
			int currentResidenceKey, int previousMonths)
			throws RemoteException, MedrexException {

		return medrexInterface.getPreviousResidentWeightRecord(
				currentResidenceKey, previousMonths);
	}

	public ResidentInformation getResidentInformation(int currentMsjnKey)
			throws RemoteException, MedrexException {

		return medrexInterface.getResidentInformation(currentMsjnKey);
	}

	public int insertOrUpdateResidentInformation(
			ResidentInformation refResidentInformation) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateResidentInformation(refResidentInformation);
	}

	public void deleteResidentInformation(int formId) throws RemoteException,
			MedrexException {

		medrexInterface.deleteResidentInformation(formId);
	}

	// new forms miscellaneous

	public int insertOrUpdateResidentTransferForm(
			ResidentTransferForm refResidentTransferForm)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateResidentTransferForm(refResidentTransferForm);
	}

	public ResidentTransferForm getResidentTransferForm(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getResidentTransferForm(formId);
	}

	public int insertOrUpdateResidentStatusSheet(
			ResidentStatusSheet refResidentStatusSheet) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateResidentStatusSheet(refResidentStatusSheet);
	}

	public ResidentStatusSheet getResidentStatusSheet(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getResidentStatusSheet(formId);
	}

	public int insertOrUpdateResidentInventoryPersonalEffect(
			InventoryPersonalEffect refResidentInventoryPersonalEffect)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateResidentInventoryPersonalEffect(refResidentInventoryPersonalEffect);
	}

	public InventoryPersonalEffect getResidentInventoryPersonalEffect(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getResidentInventoryPersonalEffect(formId);
	}

	public int insertOrUpdateResidentCarePlan(
			ResidentCarePlan refResidentCarePlan) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateResidentCarePlan(refResidentCarePlan);
	}

	public ResidentCarePlan getResidentCarePlan(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getResidentCarePlan(formId);
	}

	public void deleteResidentTransferForm(int formId) throws RemoteException,
			MedrexException {

		medrexInterface.deleteResidentTransferForm(formId);
	}

	public void deleteResidentInventoryPersonalEffectForm(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteResidentInventoryPersonalEffectForm(formId);

	}

	public void deleteResidentStatusSheet(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteResidentStatusSheet(formId);

	}

	public void deleteResidentCarePlanForm(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteResidentCarePlanForm(formId);

	}

	public int insertOrUpdateInterDisciplinaryForm(
			InterDisciplinaryCarePlan interDsc) throws RemoteException,
			MedrexException {

		return medrexInterface.insertOrUpdateInterDisciplinaryForm(interDsc);
	}

	public InterDisciplinaryCarePlan getInterDisciplinaryForm(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getInterDisciplinaryForm(formId);
	}

	public void deleteInterDisciplinaryCarePlanForm(int formId)
			throws RemoteException, MedrexException {
		medrexInterface.deleteInterDisciplinaryCarePlanForm(formId);

	}

	public int insertOrUpdateDietaryAlertSheet(
			DietaryAlertSheet refDietaryAlertSheet) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateDietaryAlertSheet(refDietaryAlertSheet);
	}

	public DietaryAlertSheet getDietaryAlertSheet(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getDietaryAlertSheet(formId);
	}

	public void deleteDietaryAlertSheet(int formId) throws RemoteException,
			MedrexException {

		medrexInterface.deleteDietaryAlertSheet(formId);
	}

	public int insertOrUpdateInfluenzaConsentForm(
			InfluenzaConsentForm refInfluenzaConsentForm)
			throws RemoteException, MedrexException {

		return medrexInterface
				.insertOrUpdateInfluenzaConsentForm(refInfluenzaConsentForm);
	}

	public InfluenzaConsentForm getInfluenzaConsentForm(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getInfluenzaConsentForm(formId);
	}

	public void deleteInfluenzaConsentForm(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteInfluenzaConsentForm(formId);

	}

	public static int insertOrUpdateSkilledFlowSheet(
			SkilledFlowSheet refSkilledFlowSheet) throws RemoteException,
			MedrexException {

		return medrexInterface
				.insertOrUpdateSkilledFlowSheet(refSkilledFlowSheet);
	}

	public SkilledFlowSheet getSkilledFlowSheet(int formId)
			throws RemoteException, MedrexException {

		return medrexInterface.getSkilledFlowSheet(formId);
	}

	public void deleteSkilledFlowSheet(int formId) throws RemoteException,
			MedrexException {
		medrexInterface.deleteSkilledFlowSheet(formId);

	}

	public int insertOrUpdateAmbulationWeight(AmbulationWeight ambWeight)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateAmbulationWeight(ambWeight);
	}

	public List<AmbulationWeight> getAmbulationWeights()
			throws MedrexException, RemoteException {
		return medrexInterface.getAmbulationWeights();
	}

	public AmbulationWeight getAmbulationWeight(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getAmbulationWeight(serial);
	}

	public void deleteAmbulationWeight(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteAmbulationWeight(serial);
	}

	public int insertOrUpdatePhysicianOrderDiet(PhysicianOrderDiets refPhyDiet)
			throws MedrexException, RemoteException {

		return medrexInterface.insertOrUpdatePhysicianOrderDiet(refPhyDiet);
	}

	public int insertOrUpdatePhysicianOrderRecord(PhysicianOrderRecord refPhyRec)
			throws MedrexException, RemoteException {

		return medrexInterface.insertOrUpdatePhysicianOrderRecord(refPhyRec);
	}

	public List<PhysicianOrderRecord> getPhysicianOrderRecords(String formType,
			int currentResidentKey) throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderRecords(formType,
				currentResidentKey);
	}

	public PhysicianOrderDiets getPhysicianOrderDiet(int serial)
			throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderDiet(serial);
	}

	public void deletePhysicianOrderRecord(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrderRecord(serial);
	}

	public void deletePhysicianOrderDiet(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deletePhysicianOrderDiet(serial);
	}

	public int insertOrUpdatePhysicianOrderTreat(
			PhysicianOrderTreatment refPhyTreat) throws MedrexException,
			RemoteException {

		return medrexInterface.insertOrUpdatePhysicianOrderTreat(refPhyTreat);
	}

	public void deletePhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException {

		medrexInterface.deletePhysicianOrderTreatment(serial);
	}

	public PhysicianOrderTreatment getPhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderTreatment(serial);
	}

	public int insertOrUpdatePhysicianOrderMedication(
			PhysicianOrderMedication refPhysicianOrderMedication)
			throws MedrexException, RemoteException {

		return medrexInterface
				.insertOrUpdatePhysicianOrderMedication(refPhysicianOrderMedication);
	}

	public int insertOrUpdatePhysicianOrderConsultations(
			PhysicianOrderConsultations phycon) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderConsultations(phycon);
	}

	public void deletePhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderConsultations(serial);

	}

	public PhysicianOrderConsultations getPhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderConsultations(serial);
	}

	public int insertOrUpdatePhysicianOrderDiagnosticTests(
			PhysicianOrderDiagnosticTests phytest) throws MedrexException,
			RemoteException {

		return medrexInterface
				.insertOrUpdatePhysicianOrderDiagnosticTests(phytest);
	}

	public void deletePhysicianOrderDiagnosticTests(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderDiagnosticTests(serial);

	}

	public PhysicianOrderDiagnosticTests getPhysicianOrderDiagnosticTests(
			int serial) throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderDiagnosticTests(serial);
	}

	public void deletePhysicianOrderMedication(
			int currentPhysicianOrderMedicationKey) throws MedrexException,
			RemoteException {
		medrexInterface
				.deletePhysicianOrderMedication(currentPhysicianOrderMedicationKey);

	}

	public int insertOrUpdatePhysicianOrderRespiratoryTherapy(
			PhysicianOrderRespiratoryTherapy phyresp) throws MedrexException,
			RemoteException {

		return medrexInterface
				.insertOrUpdatePhysicianOrderRespiratoryTherapy(phyresp);
	}

	public void deletePhysicianOrderRespiratoryTherapy(int serial)
			throws MedrexException, RemoteException {

		medrexInterface.deletePhysicianOrderRespiratoryTherapy(serial);
	}

	public PhysicianOrderRespiratoryTherapy getPhysicianOrderRespiratoryTherapy(
			int serial) throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderRespiratoryTherapy(serial);
	}

	public int insertOrUpdatePhysicianOrderAdvanceDirectives(
			PhysicianOrderAdvanceDirectives phyadvance) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderAdvanceDirectives(phyadvance);
	}

	public void deletePhysicianOrderAdvanceDirectives(int serial)
			throws MedrexException, RemoteException {
		medrexInterface.deletePhysicianOrderAdvanceDirectives(serial);

	}

	public PhysicianOrderAdvanceDirectives getPhysicianOrderAdvanceDirectives(
			int serial) throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderAdvanceDirectives(serial);
	}

	public PhysicianOrderMedication getPhysicianOrderMedication(int formId)
			throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderMedication(formId);
	}

	public int insertOrUpdatePhysicianOrderMiscellaneous(
			PhysicianOrderMiscellaneous phymisc) throws MedrexException,
			RemoteException {

		return medrexInterface
				.insertOrUpdatePhysicianOrderMiscellaneous(phymisc);
	}

	public PhysicianOrderMiscellaneous getPhysicianOrderMiscellaneous(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getPhysicianOrderMiscellaneous(serial);
	}

	public void deletePhysicianOrderMiscellaneous(int serial)
			throws MedrexException, RemoteException {

		medrexInterface.deletePhysicianOrderMiscellaneous(serial);
	}

	public int insertOrUpdateRehabilitationRestrorative(
			RehabilitationRestrorative refRehabilitationRestrorative)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateRehabilitationRestrorative(refRehabilitationRestrorative);
	}

	public RehabilitationRestrorative getRehabilitationRestrorative(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getRehabilitationRestrorative(formId);
	}

	public void deleteRehabilitationRestrorative(
			int currentRehabilitationRestrorativekey) throws MedrexException,
			RemoteException {
		medrexInterface
				.deleteRehabilitationRestrorative(currentRehabilitationRestrorativekey);

	}

	public int insertOrUpdatePhysicianOrderSafetyPrecautions(
			PhysicianOrderSafetyPrecautions physafety) throws MedrexException,
			RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderSafetyPrecautions(physafety);
	}

	public void deletePhysicianOrderSafetyPrecautions(
			int currentPhysicianOrderSafetyPrecautionsKey)
			throws MedrexException, RemoteException {
		medrexInterface
				.deletePhysicianOrderSafetyPrecautions(currentPhysicianOrderSafetyPrecautionsKey);

	}

	public PhysicianOrderSafetyPrecautions getPhysicianOrderSafetyPrecautions(
			int formId) throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderSafetyPrecautions(formId);
	}

	public int insertOrUpdateEnteralProtocal(
			PhysicianOrderEnteralProtocol refEnteralProtocol)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateEnteralProtocal(refEnteralProtocol);
	}

	public PhysicianOrderEnteralProtocol getPanelEnteralProtocol(int formId)
			throws MedrexException, RemoteException {
		return medrexInterface.getPanelEnteralProtocol(formId);
	}

	public void deletePhysicianOrderEnteralProtocol(
			int currentPhysicianOrderEnteralProtocolKey)
			throws MedrexException, RemoteException {
		medrexInterface
				.deletePhysicianOrderEnteralProtocol(currentPhysicianOrderEnteralProtocolKey);

	}

	public int insertOrUpdateParentalNutritionalOrderForm(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdateParentalNutritionalOrderForm(refParentalNutritionalOrderForm);
	}

	public ParentalNutritionalOrderForm getParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getParentalNutritionalOrderForm(currentParentalNutritionalOrderFormKey);
	}

	public void deletePhysicianOrderParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException {
		medrexInterface
				.deletePhysicianOrderParentalNutritionalOrderForm(currentParentalNutritionalOrderFormKey);
	}

	public boolean isDNR(int currentResidenceKey) throws MedrexException,
			RemoteException {
		return medrexInterface.isDNR(currentResidenceKey);
	}

	public List<PhysicianOrderMedication> getPhysicianOrderMedicationList(
			int currentResidentId) throws MedrexException, RemoteException {
		return medrexInterface
				.getPhysicianOrderMedicationList(currentResidentId);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16ByResidentId(
			int currentResidenceKey) throws MedrexException, RemoteException {

		return medrexInterface
				.getResidentAssessmentFormPage16ByResidentId(currentResidenceKey);
	}

	public List<Object[]> getMedicationStatusForWeek(Calendar calendar,
			String slot, int currentResidentId, int medicationSerial)
			throws MedrexException, RemoteException {

		return medrexInterface.getMedicationStatusForWeek(calendar, slot,
				currentResidentId, medicationSerial);
	}

	public String getCautionaryName(Long medicationId) throws MedrexException,
			RemoteException {
		return medrexInterface.getCautionaryName(medicationId);
	}

	public List<String> getTimeSlot(int frequency) throws MedrexException,
			RemoteException {

		return medrexInterface.getTimeSlot(frequency);
	}

	public List getPrnResidentsByFloor(String floorType)
			throws MedrexException, RemoteException {

		return medrexInterface.getPrnResidentsByFloor(floorType);
	}

	public List<MedicationView> getPrnMedicationsList(int currentResidenceKey)
			throws MedrexException, RemoteException {

		return medrexInterface.getPrnMedicationsList(currentResidenceKey);
	}

	public List<Medication> getMedication() throws MedrexException,
			RemoteException {
		return medrexInterface.getMedication();
	}

	public List<Medication> getMedication(String text, String selectedButton)
			throws MedrexException, RemoteException {

		return medrexInterface.getMedication(text, selectedButton);
	}

	public List<Medication> getMedication(String selectedButton)
			throws MedrexException, RemoteException {
		return medrexInterface.getMedication(selectedButton);
	}

	public int insertOrUpdatePRN(PRNmedication prn) throws MedrexException,
			RemoteException {

		return medrexInterface.insertOrUpdatePRN(prn);
	}

	public List<Object[]> getMedicationFrequencies() throws MedrexException,
			RemoteException {
		return medrexInterface.getMedicationFrequencies();
	}

	public int insertOrUpdateDialysisRecord(DialysisRecord dialysisRecord)
			throws MedrexException, RemoteException {

		return medrexInterface.insertOrUpdateDialysisRecord(dialysisRecord);
	}

	public DialysisRecord getDialysisRecord(int currentDialysisRecordKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getDialysisRecord(currentDialysisRecordKey);
	}

	public void deleteDialysisRecord(int id) throws MedrexException,
			RemoteException {
		medrexInterface.deleteDialysisRecord(id);
	}

	public List<DialysisRecord> getDialysisRecords(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getDialysisRecords(currentResidenceKey);
	}

	public int insertOrUpdateNursesNotes(NursesNotesRecord nursesSum)
			throws MedrexException, RemoteException {

		return medrexInterface.insertOrUpdateNursesNotes(nursesSum);
	}

	public NursesNotesRecord getNursesNotesRecord(
			int currentNursesNotesRecordKey) throws MedrexException,
			RemoteException {
		return medrexInterface
				.getNursesNotesRecord(currentNursesNotesRecordKey);
	}

	public List<NursesNotesRecord> getNursesNotesRecords(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getNursesNotesRecords(currentResidenceKey);
	}

	public void deleteNursesNotes(int formId) throws MedrexException,
			RemoteException {
		medrexInterface.deleteNursesNotes(formId);

	}

	public Long insertOrUpdateTreatments(Treatment treatment)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateTreatments(treatment);
	}

	public Treatment getTreatment(long currentTreatmentKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatment(currentTreatmentKey);

	}

	public List<Treatment> getAllTreatments() throws MedrexException,
			RemoteException {
		return medrexInterface.getAllTreatments();

	}

	public void deleteTreatment(long id) throws MedrexException,
			RemoteException {
		medrexInterface.deleteTreatment(id);

	}

	public int insertOrUpdatePhysicianOrderTreatmentTemp(
			PhysicianOrderTreatmentTemp refphysicianOrderTreatmentTemp)
			throws MedrexException, RemoteException {
		return medrexInterface
				.insertOrUpdatePhysicianOrderTreatmentTemp(refphysicianOrderTreatmentTemp);
	}

	public PhysicianOrderTreatmentTemp getPhysicianOrderTreatmentTemp(int formId)
			throws MedrexException, RemoteException {

		return medrexInterface.getPhysicianOrderTreatmentTemp(formId);
	}

	public List getTreatmentHistoryTimes() throws MedrexException,
			RemoteException {
		return medrexInterface.getTreatmentHistoryTimes();
	}

	public List getCurrentSlotTimeforTreatment(String floorType)
			throws MedrexException, RemoteException {
		return medrexInterface.getCurrentSlotTimeforTreatment(floorType);
	}

	public List<TreatmentView> getTreatmentsList(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return medrexInterface.getTreatmentsList(currentResidenceKey);
	}

	public List<ResidentDiagnosis> getResidentDiagnosissByConfirm(int resId)
			throws MedrexException, RemoteException {
		return medrexInterface.getResidentDiagnosissByConfirm(resId);
	}

	public String getUserNameById(int userid) throws MedrexException,
			RemoteException {
		return medrexInterface.getUserNameById(userid);
	}

	public void insertOrUpdateMDS3(Mds3 mds3) throws MedrexException,
			RemoteException {
		medrexInterface.insertOrUpdateMDS3(mds3);
	}

	public void deleteMDS3(int id) throws MedrexException, RemoteException {
		medrexInterface.deleteMDS3(id);

	}

	public List getMDS3Sections(int currentResidenceKey)
			throws MedrexException, RemoteException {

		return medrexInterface.getMDS3Sections(currentResidenceKey);
	}

	public Mds3 getMds3(int serial) throws MedrexException, RemoteException {

		return medrexInterface.getMds3(serial);
	}

	public ArrayList<Notes> getNotesList(int userid, Date from, Date dcto,
			int start_index) throws MedrexException, RemoteException {
		return medrexInterface.getNotesList(userid, from, dcto, start_index);
	}

	public void insertOrUpdateForm(int formId, int selectedTabId)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateForm(formId, selectedTabId);

	}

	public int getFormIdByName(String selectedNode) throws MedrexException,
			RemoteException {
		return medrexInterface.getFormIdByName(selectedNode);
	}

	// For Schedule--------------------------------

	public int insertOrUpdateSchedule(Schedule sh) throws MedrexException,
			RemoteException {

		return (medrexInterface.insertOrUpdateSchedule(sh));
	}

	public List<Schedule> getScheduleRecords() throws MedrexException {
		try {
			return (medrexInterface.getScheduleRecords());
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Getting schedule records");
		}
	}

	public List<Tab> getAllTabs() throws MedrexException, RemoteException {
		return medrexInterface.getAllTabs();
	}

	public List<FormPage> getAllFormPages(String text) throws MedrexException,
			RemoteException {
		return medrexInterface.getAllFormPages(text);
	}

	public FormPage getFormPageWithId(int currSerial) throws MedrexException,
			RemoteException {

		return medrexInterface.getFormPageWithId(currSerial);
	}

	public void insertOrUpdateFormPage(FormPage currref)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateFormPage(currref);

	}

	public void insertOrUpdateForm_formPage(int formId, int parentid,
			boolean isNew) throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateForm_formPage(formId, parentid, isNew);

	}

	public List<FormPage> getAllForms() throws MedrexException, RemoteException {

		return medrexInterface.getAllForms();
	}

	public List<Accurities> getAccuritiesListByDateTemp(Date d)
			throws MedrexException, RemoteException {

		return medrexInterface.getAccuritiesListByDateTemp(d);
	}

	public UserSchedule getUserScheduleRecord(int userID, int scheduleID,
			Date onDate) throws MedrexException, RemoteException {

		return (medrexInterface.getUserScheduleRecord(userID, scheduleID,
				onDate));
	}



	public void insertOrUpdateUserSchedules(List<UserSchedule> us)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateUserSchedules(us);

	}

	public void insertOrUpdateUserSchedule(UserSchedule us)
			throws MedrexException, RemoteException {
		medrexInterface.insertOrUpdateUserSchedule(us);

	}

	// ---------------------- for Activator --------------------//
	public int insertOrUpdateActivationLicense(ActivationLicense license)
			throws MedrexException, RemoteException {
		return medrexInterface.insertOrUpdateActivationLicense(license);
	}

	public boolean isActivationLicenseValid() throws MedrexException,
			RemoteException {
		return medrexInterface.isActivationLicenseValid();
	}

	public void deleteActivationLicense(int serial) throws MedrexException,
			RemoteException {
		medrexInterface.deleteActivationLicense(serial);
	}

	public List<ActivationLicense> getActivationLicenses()
			throws MedrexException, RemoteException {
		return medrexInterface.getActivationLicenses();
	}

	public ActivationLicense getActivationLicense(int serial)
			throws MedrexException, RemoteException {
		return medrexInterface.getActivationLicense(serial);
	}

	public ActivationLicense getActivationLicense(Date forDate)
			throws MedrexException, RemoteException {
		return medrexInterface.getActivationLicense(forDate);
	}



	public void deleteForm_formPage(int form_pageSerial, int form_serial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteForm_formPage(form_pageSerial, form_serial);

	}

	public Map<String, Object> getAccutiesByDate(String dt)
			throws MedrexException, RemoteException {
		return medrexInterface.getAccutiesByDate(dt);
	}

	public void deleteScheduleRecord(int scheduleSerial)
			throws MedrexException, RemoteException {
		medrexInterface.deleteScheduleRecord(scheduleSerial);

	}

	public UserSchedule getUserScheduleRecordByDay(int userId, int scheduleId, int day)throws  MedrexException, RemoteException  {
		return (medrexInterface.getUserScheduleRecordByDay(userId, scheduleId,
				day));
	}

	public int insertOrUpdatePhysicianOrderTherapyTest(
			PhysicianOrderTherapyTest phytherapy) throws RemoteException, MedrexException {
		
		return medrexInterface.insertOrUpdatePhysicianOrderTherapyTest(phytherapy);
	}

	public void deletePhysicianOrderTherapyTest(
			int serial) throws RemoteException, MedrexException {
		medrexInterface.deletePhysicianOrderTherapyTest(serial);
		
	}

	public PhysicianOrderTherapyTest getPhysicianOrderTherapyTest(int formId) throws RemoteException, MedrexException {
		
		return medrexInterface.getPhysicianOrderTherapyTest(formId);
	}

}

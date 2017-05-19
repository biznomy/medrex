package medrex.client.constants;

import java.awt.Window;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

import medrex.client.FrameDownloadSourceChooser;
import medrex.client.FrameMainDesktopTmp;
import medrex.client.MessageServer;
import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.accurities.FrameAccuritiesAdd;
import medrex.client.accurities.FrameAccuritiesListAdd;
import medrex.client.accurities.PanelResidentMain;
import medrex.client.accurities.PanelResidents;
import medrex.client.admin.PanelAdministrationMain;
import medrex.client.admin.formConfig.FrameValidationPopUp;
import medrex.client.admin.formConfig.PanelFormConfigAlertInfo;
import medrex.client.admin.formConfig.PanelFormTree;
import medrex.client.admin.formManager.FrameFormManager;
import medrex.client.admin.formScheduler.PanelFormSchedulerMain;
import medrex.client.carelog.FrameCareLogCategory;
import medrex.client.carelog.PanelCareLogCategory;
import medrex.client.carelog.PanelCareLogLevelA;
import medrex.client.carelog.PanelCareLogLevelB;
import medrex.client.census.FrameCensusReportDateChooser;
import medrex.client.census.FrameCensusStatusHistoryReportChooser;
import medrex.client.census.countAudit.PanelCountAuditMain;
import medrex.client.census.ui.FrameCensusNotes;
import medrex.client.census.ui.FrameCensusNotesAdd;

import medrex.client.floorPlan.PanelFirstFloor;
import medrex.client.floorPlan.PanelRoomPopUp;
import medrex.client.gui.FrameResidentInfoGeneralAddDialog;
import medrex.client.main.FrameCategoriesNotesReport;
import medrex.client.main.FrameMainOptions;
import medrex.client.main.MonthlySummary.FrameMonthlySummaryRecordAdd;
import medrex.client.main.MonthlySummary.PanelEnteralProtocol;
import medrex.client.main.MonthlySummary.PanelMonthlySummaryMainPage;
import medrex.client.main.MonthlySummary.PanelMonthlySummaryPage1;
import medrex.client.main.MonthlySummary.PanelMonthlySummaryPage2;
import medrex.client.main.MonthlySummary.PanelParentalNutritionalOrderForm;
import medrex.client.main.MonthlySummary.PanelResidentAssessmentFormPage21;
import medrex.client.main.MonthlySummary.PanelResidentAssessmentFormPage22;
import medrex.client.main.activity.FrameActivitysRecordAdd;
import medrex.client.main.activity.PanelActivityAssessmentFormPage2;
import medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1;
import medrex.client.main.admission.FrameResidentAssessmentFormPage19Dialog;
import medrex.client.main.admission.PanelResidentAssessmentFormPage1;
import medrex.client.main.admission.PanelResidentAssessmentFormPage10;
import medrex.client.main.admission.PanelResidentAssessmentFormPage11;
import medrex.client.main.admission.PanelResidentAssessmentFormPage12;
import medrex.client.main.admission.PanelResidentAssessmentFormPage13;
import medrex.client.main.admission.PanelResidentAssessmentFormPage14;
import medrex.client.main.admission.PanelResidentAssessmentFormPage19;
import medrex.client.main.admission.PanelResidentAssessmentFormPage2;
import medrex.client.main.admission.PanelResidentAssessmentFormPage3;
import medrex.client.main.admission.PanelResidentAssessmentFormPage4;
import medrex.client.main.admission.PanelResidentAssessmentFormPage5;
import medrex.client.main.admission.PanelResidentAssessmentFormPage6;
import medrex.client.main.admission.PanelResidentAssessmentFormPage7;
import medrex.client.main.admission.PanelResidentAssessmentFormPage8;
import medrex.client.main.admission.PanelResidentAssessmentFormPage9;
import medrex.client.main.admission.PanelResidentImmunizationRecord;
import medrex.client.main.admission.PanelSocialServiceInitialAssessmentFormPage1;
import medrex.client.main.consultant.FramePharmacistEvaluationReportFormRowDialog;
import medrex.client.main.consultant.PanelPharmacistEvaluationReportForm;
import medrex.client.main.consultant.PanelReferralForm;
import medrex.client.main.consultant.PanelReportOfConsultationForm;
import medrex.client.main.dialysis.FrameDialysisRecordAdd;
import medrex.client.main.dialysis.PanelRenalDialysisCommunicationFormPage1;
import medrex.client.main.dialysis.PanelRenalDialysisCommunicationFormPage2;
import medrex.client.main.dietary.FrameDietaryPlazaHealthRowDialog;
import medrex.client.main.dietary.PanelDietaryAlertSheet;
import medrex.client.main.dietary.PanelDietaryCommunicationForm;
import medrex.client.main.dietary.PanelDietaryPlazaHealth;
import medrex.client.main.dietary.PanelDietaryResidentDiagnosis;
import medrex.client.main.dietary.PanelEnteralFeeding;
import medrex.client.main.dietary.PanelNutritionSupportAssessmentFormPage1;
import medrex.client.main.historyandphysical.FrameCumulativeDiagnosisFormRowDialog;
import medrex.client.main.historyandphysical.FrameMonthlyVitalSheetFormRowDialog;
import medrex.client.main.historyandphysical.FrameWeeklyWeightsFormRowDialog;
import medrex.client.main.historyandphysical.PanelCumulativeDiagnosisForm;
import medrex.client.main.historyandphysical.PanelHistoryAndPhysicalGeneralFormPage1;
import medrex.client.main.historyandphysical.PanelHistoryAndPhysicalGeneralFormPage2;
import medrex.client.main.historyandphysical.PanelMontlhlyVitalSheetForm;
import medrex.client.main.historyandphysical.PanelWeeklyWeightsForm;
import medrex.client.main.labspecial.PanelLabReasonForStudyPage1;
import medrex.client.main.labspecial.PanelMadexForm1;
import medrex.client.main.labspecial.PanelMadexForm2;
import medrex.client.main.medication.FrameMedicationTreatmentFormAdd;
import medrex.client.main.medication.PanelMedicationAdministrationRecordForm;
import medrex.client.main.medication.PanelMedicationAllOrders;
import medrex.client.main.medication.PanelMedicationNotes;
import medrex.client.main.medication.PanelMedicationPRNRecordForm;
import medrex.client.main.medication.PanelMedicationRoutineRecordForm;
import medrex.client.main.medication.PanelPainManagementRecordFormPage1;
import medrex.client.main.medication.PanelPressureScoreRecord;
import medrex.client.main.medication.PanelTreatmentPRNRecordForm;
import medrex.client.main.medication.PanelTreatmentRoutineRecordForm;
import medrex.client.main.medication.nurseMedicationNotes.FrameNurseMedicationNotesRow1Dialog;
import medrex.client.main.medication.nurseMedicationNotes.FrameNurseMedicationNotesRowDialog;
import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
import medrex.client.main.medication.nurseTreatmentNotes.FrameNurseTreatmentNotesFormRow1Dialog;
import medrex.client.main.medication.nurseTreatmentNotes.FrameNurseTreatmentNotesFormRowDialog;
import medrex.client.main.nursesNote.FrameNursesNotesRecordAdd;
import medrex.client.main.physicanOrders.FramePhysicianOrderForm3Dialog;
import medrex.client.main.physicanOrders.PanelAddNewPhysician;
import medrex.client.main.physicanOrders.PanelPhysicianInfusion;
import medrex.client.main.physicanOrders.PanelPhysicianOrderForm1;
import medrex.client.main.physicanOrders.PanelPhysicianOrderForm2;
import medrex.client.main.physicanOrders.PanelPhysicianOrderForm3;
import medrex.client.main.physicanOrders.PanelPhysicianOrderForm3Dialog;
import medrex.client.main.physicanOrders.PanelPhysicianPlazaHealthCare;
import medrex.client.main.physicanOrders.PanelPhysicianSpeciality;
import medrex.client.main.physicanOrders.physicianOrderScreen.FramePhysicianOrder;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicanOrderMedication;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderAdvanceDirectives;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderConsultations;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderDetails;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderDiagnosticTests;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderMiscellaneous;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderRespiratoryTherapy;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderSafetyPrecautions;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderTherapyTest;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderTreatment;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderTreatmentTemp;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrdersDiets;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelRehabilitationRestrorative;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelShowMedicationDetails;
import medrex.client.main.physicanOrders.prescription.PanelPrescription;
import medrex.client.main.physicanOrders.progressNotes.FrameProgressNotes2Dialog;
import medrex.client.main.physicanOrders.progressNotes.PanelProgressNotes2;
import medrex.client.main.progressNotes.FrameInterDisciplinaryProgressNotesFormRowDialog;
import medrex.client.main.progressNotes.FrameProgressNotesFormDialog;
import medrex.client.main.progressNotes.PanelDoctorsProgressNotesForm;
import medrex.client.main.progressNotes.PanelInterDisciplinaryProgressNotesForm;
import medrex.client.main.progressNotes.PanelProgressNotesFormDialog;
import medrex.client.main.ptOtSt.FrameAddTextArea;
//import medrex.client.main.ptOtSt.FrameMDSOTPTACTAdd;
import medrex.client.main.ptOtSt.FramePhysicalDailyTextArea;
import medrex.client.main.ptOtSt.FrameSpeechTextArea;
import medrex.client.main.ptOtSt.PanelPtOtStOccupationalDailyRecord;
import medrex.client.main.ptOtSt.PanelPtOtStOccupationalTherapy;
import medrex.client.main.ptOtSt.PanelPtOtStPhysicalDailyRecord;
import medrex.client.main.ptOtSt.PanelPtOtStPhysicalTheray;
import medrex.client.main.ptOtSt.PanelPtOtStPositioningEvaluation;
import medrex.client.main.ptOtSt.PanelPtOtStRehabCarePlan;
import medrex.client.main.ptOtSt.PanelPtOtStSpeechDailyRecord;
import medrex.client.main.ptOtSt.PanelPtOtStSpeechLanguage;
import medrex.client.main.ptOtSt.PanelPtOtStTherapyPhysical;
import medrex.client.main.ptOtSt.PanelPtOtStTreatment;
import medrex.client.main.resident.census.PanelCensusResident;
import medrex.client.main.resident.census.PanelCensusStatus;
import medrex.client.main.resident.census.PanelCensusStatusResident;
import medrex.client.main.resident.changeRoom.PanelChangeRoomForm;
import medrex.client.main.resident.payerInfo.PanelResidentInfoPayerAdd;
import medrex.client.main.resident.scan.FrameScanResidentFormAdd;
import medrex.client.main.resident.scan.PanelScanResidentFormAdd;
import medrex.client.main.resident.wounds.FrameWoundRecordAdd;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.main.scan.FrameScanPageAdd;
import medrex.client.main.scan.PanelScanFormAdd;
import medrex.client.masterList.FrameMasterListAdd;
import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.ui.FrameMds3RecordAdd;
import medrex.client.medicationcart.FrameMedicationForms;
import medrex.client.medicationcart.FrameMedicationNotes;
import medrex.client.medicationcart.FrameResidentDesktopMedication;
import medrex.client.medicationcart.PanelMedication;
import medrex.client.medicationcart.PanelMedicationDesktop;
import medrex.client.medicationcart.PanelMedicationNurseNotes;
import medrex.client.medicationcart.PanelPhysicianOrder;
import medrex.client.messages.FrameMessages;
import medrex.client.messages.FrameMessagesRecordAdd;
import medrex.client.messages.FrameMessagesShowAdd;
import medrex.client.messages.PanelMessages;
import medrex.client.messages.PanelMessagesRecordAdd;
import medrex.client.messages.PanelMessagesShowAdd;
import medrex.client.providers.PanelProvidersRecord;
import medrex.client.reports.FrameLabReports;
import medrex.client.reports.PanelLabReport;
import medrex.client.reports.PanelLabReportMails;
import medrex.client.test.ra.ui.PanelRAFPg1;
import medrex.client.test.ra.ui.PanelRAFPg2;
import medrex.client.users.FramePhysicianFormAdd;
import medrex.client.users.FrameUsers;
import medrex.client.users.PanelNurseRecordForm;
import medrex.client.users.PanelPhysicianForm;
import medrex.client.users.PanelPhysicianRecordForm;
import medrex.client.users.PanelUsers;
import medrex.client.users.PanelUsersAdd;
import medrex.client.utils.controls.SsnField;
//import medrex.commons.enums.MDSAssessmentTypes;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.physicianOrders.ProgressNotes2;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesFormRow;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesFormRow;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentInfoGeneralPhone;
import medrex.commons.vo.resident.ResidentMain;

public class Global {

	
	
	public static boolean IS_DEMO = false;
	public static boolean IS_STANDALONE = true;
	public static boolean IS_DEVELOPMENT = true;

	// public static MedrexIntf ltcServer;
	public static float clientversion = 1.08f;

	public static float clienthotfixversion = 0.300f;

	public static int currentResidentAssessmentFormPage1Key;
	// check mode either development=true, deployment=false;
	public static boolean mode = false;

	public static String tabName;

	public static String currentResidentStatus;

	public static int currentResidenceKey;

	public static int currentPayerKey;

	public static String viewOrUpdate;

	// public static int currentcontactKey;

	// public static int currentcontactPhoneKey;

	public static int currentAdmissionsRecordKey;

	public static int currentResidentAssessmentFormPage;

	public static int currentRAFormPage;
	public static int currentRAFKey;
	public static int currentRAF2Key;
	public static PanelRAFPg1 panelRAFPg1;
	public static PanelRAFPg2 panelRAFPg2;

	public static int currentResidentAssessmentFormKey;

	public static int currentResidentAssessmentFormPage2Key;

	public static int currentResidentAssessmentFormPage3Key;

	public static int currentResidentAssessmentFormPage4Key;

	public static int currentResidentAssessmentFormPage5Key;

	public static int currentResidentAssessmentFormPage6Key;

	public static int currentResidentAssessmentFormPage7Key;

	public static int currentResidentAssessmentFormPage8Key;

	public static int currentResidentAssessmentFormPage9Key;

	public static int currentResidentAssessmentFormPage10Key;
	public static int currentResidentAssessmentFormPage11Key;

	public static int currentResidentAssessmentFormPage12Key;

	public static int currentResidentAssessmentFormPage13Key;

	public static int currentResidentAssessmentFormPage14Key;
	public static int currentResidentAssessmentFormPage15Key;
	public static int currentResidentAssessmentFormPage16Key;
	public static int currentResidentAssessmentFormPage17Key;
	public static int currentResidentAssessmentFormPage18Key;

	public static int currentResidentQuarterlyAssessmentFormPage7;
	public static int currentResidentQuarterlyAssessmentFormPage8;
	public static int currentResidentQuarterlyAssessmentFormPage9;

	public static int currentActivitysRecordKey;

	public static String currentActivityForm;

	public static int currentActivityAssessmentFormPage2Key;

	public static int currentActivitysInitAssmntKey;

	public static int currentMedicationTreatmentFormKey;

	public static int currentMedicationNotesFormKey;

	public static int currentPainManagementFormPage1Key;

	public static int currentPressureSoreRecordFormKey;

	public static int currentPainAssessmentFormKey;

	public static int currentNurseTreatmentNotesFormKey;

	public static int currentNurseMedicationNotesFormKey;

	public static int currentMedicationAdministrationRecordFormKey;

	public static int currentMedicationPRNRecordFormKey;

	public static int currentMedicationRoutineRecordFormKey;

	public static int currentTreatmentPRNRecordFormKey;

	public static int currentTreatmentRoutineRecordFormKey;

	public static int currentTreatmentTreatmentRecordFormKey;

	public static int currentDietaryKey;
	public static String currentDietaryForm;

	public static int currentAmbulationWeightKey;

	public static String[] ambulationType = new String[] { "", "Weel Chair",
			"Chair", "Bed Scale", "Walker", "Hoyer Lift" };

	public static int currentDietaryCommunicationFormKey;

	public static int currentDietaryResidentDiagnosisKey;

	public static int currentEnteralFeedingKey;

	public static int currentDietaryPlazaHealthKey;

	public static int currentConsultantKey;

	public static String currentConsultantForm;

	public static int currentRenalDialysisCommunicationFormKey;

	public static int currentRenalDialysisCommunicationFormPage2Key;

	public static int currentReferralFormKey;

	public static int currentReportOfConsultationFormKey;

	public static int currentPharmacistResidentEvaluationFormKey;

	public static int currentProgressNotesKey;
	public static String currentProgressNotesForm;

	public static int currentDoctorsProgressNotesKey;

	public static int currentInterdisciplinaryProgressNotesKey;

	public static int currentHistoryAndPhysicalKey;

	public static String currentHistoryForm;

	public static int currentHistoryAndPhysicalGeneralFormPage1Key;

	public static int currentHistoryAndPhysicalGeneralFormPage2Key;

	public static int currentCumulativeDiagnosisFormKey;

	public static int currentMonthlyVitalSheetFormKey;

	public static int currentWeeklyWeightsFormKey;

	public static int currentLabSpecialKey;

	public static String currentLabSpecialForm;

	public static int currentLabReasonFormKey;

	public static int currentMadexForm1Key;

	public static int currentMadexForm2Key;

	public static int currentPhysisianOrdersKey;

	public static int currentPhysicianPlazaHealthCareKey;

	public static int currentPanelPhysicianSpecialityKey;

	public static int currentPhysicianInfusionKey;

	public static int currentResidentImmunizationRecordKey;

	public static int currentPhysicianSpecialityKey;

	public static int currentPhysicianOrderForm1Key;

	public static int currentPhysicianOrderForm2Key;
	public static int currentPhysicianOrderForm2RowKey;
	public static int currentPhysicianOrderForm3Key;
	public static int currentPhysicianOrderForm3RowKey;

	public static String currentAdmissionRecordForm;
	public static String currentPhysicianOrderForm;

	public static int currentAssessmentButtonKey;

	public static int currentResidentDiagnosisKey;

	public static int currentPendingMDSSerial;

	public static int currentMDSOTPTACTKey;

	public static int currentDailySkilledNursesNotesKey;

	public static int currentDailySkilledNursesNotesFormPage;

	// public static int current FormPage2Key;

	// public static PanelAdmissionsRecordPageResidentAssForm
	// panelAdmissionsRecordPageResidentAssForm;

	public static String currentMedicationTreatmentForm;

	// public static PanelResidentInfoGeneral panelResidentInfoGeneral;

	// public static PanelResidentInfoPayerMain panelResidentInfoPayerMain;

	public static PanelResidentInfoPayerAdd panelResidentInfoPayerAdd;

	// public static PanelResidentInfoContactMain panelResidentInfoContactMain;

	// public static PanelResidentInfoContactAdd panelResidentInfoContactAdd;

	// public static PanelAdmissionsRecord panelAdmissionsRecord;
	//
	// public static PanelAdmissionsRecordAdd panelAdmissionsRecordAdd;

	public static PanelResidentAssessmentFormPage1 panelResidentAssessmentFormPage1;

	public static PanelResidentAssessmentFormPage2 panelResidentAssessmentFormPage2;

	public static PanelResidentAssessmentFormPage3 panelResidentAssessmentFormPage3;

	public static PanelResidentAssessmentFormPage4 panelResidentAssessmentFormPage4;

	public static PanelResidentAssessmentFormPage5 panelResidentAssessmentFormPage5;

	public static PanelResidentAssessmentFormPage6 panelResidentAssessmentFormPage6;

	public static PanelResidentAssessmentFormPage7 panelResidentAssessmentFormPage7;

	public static PanelResidentAssessmentFormPage8 panelResidentAssessmentFormPage8;

	public static PanelResidentAssessmentFormPage9 panelResidentAssessmentFormPage9;

	public static PanelResidentAssessmentFormPage10 panelResidentAssessmentFormPage10;

	public static PanelResidentAssessmentFormPage11 panelResidentAssessmentFormPage11;

	public static PanelResidentAssessmentFormPage12 panelResidentAssessmentFormPage12;

	public static PanelResidentAssessmentFormPage13 panelResidentAssessmentFormPage13;

	// public static PanelActivitysRecord panelActivitysRecord;

	// public static PanelActivitysRecordAdd panelActivitysRecordAdd;

	public static PanelActivityInitialAssessmentFormPage1 panelActivityInitalAssessmentFormPage1;

	public static PanelActivityAssessmentFormPage2 panelActivityAssessmentFormPage2;

	// public static PanelMedicationTreatmentForm panelMedicationTreatmentForm;
	//
	// public static PanelMedicationTreatmentFormAdd
	// panelMedicationTreatmentFormAdd;

	public static PanelMedicationNotes panelMedicationNotes;

	public static PanelPressureScoreRecord panelPressureScoreRecord;

	public static PanelPainManagementRecordFormPage1 panelPainManagementRecordFormPage1;

	public static medrex.client.main.medication.nurseTreatmentNotes.PanelNurseTreatmentNotes panelNurseTreatmentNotes;

	public static PanelNurseMedicationNotes panelNurseMedicationNotes;

	public static PanelMedicationAdministrationRecordForm panelMedicationAdministrationRecordForm;

	public static PanelMedicationPRNRecordForm panelMedicationPRNRecordForm;

	public static PanelMedicationRoutineRecordForm panelMedicationRoutineRecordForm;

	public static PanelTreatmentPRNRecordForm panelTreatmentPRNRecordForm;

	public static PanelTreatmentRoutineRecordForm panelTreatmentRoutineRecordForm;

	public static PanelDietaryCommunicationForm panelDietaryCommunicationForm;

	public static PanelDietaryResidentDiagnosis panelDietaryResidentDiagnosis;
	public static PanelEnteralFeeding panelEnteralFeeding;
	public static PanelDietaryPlazaHealth panelDietaryPlazaHealth;

	public static PanelRenalDialysisCommunicationFormPage1 panelRenalDialysisCommunicationFormPage1;

	public static PanelRenalDialysisCommunicationFormPage2 panelRenalDialysisCommunicationFormPage2;

	public static PanelReferralForm panelReferralForm;

	public static PanelReportOfConsultationForm panelReportOfConsultationForm;

	public static PanelPharmacistEvaluationReportForm panelPharmacistEvaluationReportForm;

	// public static PanelProgressNotes panelProgressNotes;
	//
	// public static PanelProgressNotesAdd panelProgressNotesAdd;

	public static PanelInterDisciplinaryProgressNotesForm panelInterdisciplinaryProgressNotesForm;

	public static PanelDoctorsProgressNotesForm panelDoctorsProgressNotesForm;

	public static PanelHistoryAndPhysicalGeneralFormPage1 panelHistoryAndPhysicalGeneralFormPage1;

	public static PanelHistoryAndPhysicalGeneralFormPage2 panelHistoryAndPhysicalGeneralFormPage2;

	public static PanelCumulativeDiagnosisForm panelCumulativeDiagnosisForm;

	// public static PanelCumulativeDiagnosisFormRow
	// panelCumulativeDiagnosisFormRow;

	public static PanelMontlhlyVitalSheetForm panelMontlhlyVitalSheetForm;

	public static PanelWeeklyWeightsForm panelWeeklyWeightsForm;

	public static PanelLabReasonForStudyPage1 panelLabReasonForStudyPage1;

	public static PanelMadexForm1 panelMadexForm1;

	public static PanelMadexForm2 panelMadexForm2;

	// public static PanelPhysicianOrders panelPhysicianOrders;

	// public static PanelPhysicianOrdersAdd panelPhysicianOrdersAdd;

	public static PanelPhysicianSpeciality panelPhysicianSpeciality;

	public static PanelPhysicianPlazaHealthCare panelPhysicianPlazaHealthCare;

	public static PanelPhysicianInfusion panelPhysicianInfusion;

	public static PanelResidentImmunizationRecord panelResidentImmunizationRecord;

	public static PanelPhysicianOrderForm1 panelPhysicianOrderForm1;
	public static PanelPhysicianOrderForm2 panelPhysicianOrderForm2;
	public static PanelPhysicianOrderForm3 panelPhysicianOrderForm3;

	public static PanelPhysicianOrderForm3Dialog panelPhysicianOrderForm3Dialog;
	public static FramePhysicianOrderForm3Dialog framePhysicianOrderForm3Dialog;

	// public static medrex.client.gui.FrameAdmissionRecordAdd
	// frameAdmissionRecordAdd;

	// public static FrameResidentInfoContactAdd frameResidentInfoContactAdd;

	// public static FrameResidentContactPhoneAdd frameResidentContactPhoneAdd;

	// public static FrameActivitysRecordAdd frameActivitysRecordAdd;

	public static FrameMedicationTreatmentFormAdd frameMedicationTreatmentFormAdd;

	// public static FrameProgressNotesAdd frameProgressNotesAdd;

	// public static FramePhysicianOrdersAdd framePhysicianOrdersAdd;

	// PtOtSt
	public static int currentPtOtStKey;
	public static String currentPtOtStForm;
	// public static PanelPtOtSt panelPtOtSt;
	// public static PanelPtOtStAdd panelPtOtStAdd;
	// public static FramePtOtStAdd framePtOtStAdd;
	public static PanelPtOtStOccupationalDailyRecord panelPtOtStOccupationalDailyRecord;
	public static PanelPtOtStOccupationalTherapy panelPtOtStOccupationalTherapy;
	public static PanelPtOtStPhysicalDailyRecord panelPtOtStPhysicalDailyRecord;
	public static PanelPtOtStPhysicalTheray panelPtOtStPhysicalTheray;
	public static PanelPtOtStPositioningEvaluation panelPtOtStPositioningEvaluation;
	public static PanelPtOtStRehabCarePlan panelPtOtStRehabCarePlan;
	public static PanelPtOtStSpeechDailyRecord panelPtOtStSpeechDailyRecord;
	public static PanelPtOtStSpeechLanguage panelPtOtStSpeechLanguage;
	public static PanelPtOtStTherapyPhysical panelPtOtStTherapyPhysical;
	public static PanelPtOtStTreatment panelPtOtStTreatment;
	public static int currentPtOtStOccupationalDailyRecordKey;
	public static int currentPtOtStOccupationalTherapyKey;
	public static int currentPtOtStPhysicalDailyRecordKey;
	public static int currentPtOtStPhysicalTherayKey;
	public static int currentPtOtStPositioningEvaluationKey;
	public static int currentPtOtStRehabCarePlanKey;
	public static int currentPtOtStSpeechDailyRecordKey;
	public static int currentPtOtStSpeechLanguageKey;
	public static int currentPtOtStTherapyPhysicalKey;
	public static int currentPtOtStTreatmentKey;

	/*
	 * //others
	 * 
	 * public static FrameOthersDesktop frameOthersDesktop;
	 * 
	 * public static PanelOthers panelOthers;
	 * 
	 * 
	 * //Users
	 * 
	 * public static PanelOthersUser panelOthersUser;
	 * 
	 * public static FrameOtherUserAdd frameOtherUserAdd;
	 * 
	 * public static PanelUsersRecord panelUsersRecord;
	 * 
	 * public static int currentOtherUserKey;
	 */
	// doctors
//	public static FrameMDSOTPTACTAdd frameMDSOTPTACT;

	public static int currentDoctorsKey;

	//

	public static int currentNurseKey;

	// CNA

	// public static FrameResidentDesktop frameResidentDesktop;
	// public static PanelResidentDesktop panelResidentDesktop;

	
	// Physicians

	public static int currentPhysicianKey;
	public static PanelPhysicianForm panelPhysicianForm;
	public static FramePhysicianFormAdd framePhysicianFormAdd;

	// Census

	public static PanelCensusStatus panelCensusStatus;
	public static CensusStatus currentCensusStatus;
	public static PanelCensusResident panelCensusResident;

	public static int currentAdmissionFromHeadKey;

	public static int currentAdmissionFromSubHeadKey;

	public static int currentAdmissionTransportationKey;

	// Resident Desktop Census
	// public static FrameResidentDesktopCensus frameResidentDesktopCensus;
	// public static PanelResidentDesktopCensus panelResidentDesktopCensus;

	//
	public static PanelCensusStatusResident panelCensusStatusResident;

	// /
	// public static PanelChooseCNA panelChooseCNA;

	// //
	// users add

	public static PanelUsersAdd panelUsersAdd;

	public static FrameUsers frameUsers;

	public static PanelUsers panelUsers;

	public static int currentUsersKey;

	public static String currentUsers;

	// nurse record form

	public static PanelNurseRecordForm panelNurseRecordForm;

	public static int currentNurseRecordFormKey;

	// physician record form

	public static PanelPhysicianRecordForm panelPhysicianRecordForm;

	public static int currentPhysicianRecordFormKey;

	/*
	 * //doctorstype
	 * 
	 * public static int currentDoctorsTypeKey; public static FrameDoctorsType
	 * frameDoctorsType; public static PanelDoctorsType panelDoctorsType;
	 */
	// ///////Providers
	// public static FrameProviders frameProviders;
	// public static PanelProviders panelProviders;
	public static PanelProvidersRecord panelProvidersRecord;
	public static int currentProviderRecordKey;
	public static int currentProviderRecordFormKey;

	// public static FrameProvidersRecordAdd frameProvidersRecordAdd;
	// public static PanelProvidersRecordAdd panelProvidersRecordAdd;

	// public static PanelResidentProviderRecord panelResidentProviderRecord;

	// //medication
	// dev added global variables
	// login
	public static int currentLoggedInUserKey;
	public static String currentLoggedInUserType;
	public static String currentLoggedInUserName;
	public static String currentUserFirstName;
	public static String currentUserLastName;

	// login
	public static String currentUserType;
	public static int currentUserKey;

	// Medication
	// public static FrameMedication frameMedication;
	// public static PanelMedication panelMedication;
	public static PhysicianOrderForm3Row currentMedicationPhyOrder;
	public static NurseMedicationNotesFormRow currentMedicationNurNotes;
	public static PanelMedicationDesktop panelMedicationDesktop;
	public static PanelMedicationAllOrders panelMedicationAllOrders;
	public static FrameMedicationForms frameMedicationForms;
	public static PanelMedicationNurseNotes panelMedicationNurseNotes;
	public static FrameMedicationNotes frameMedicationNotes;
	public static Date currentMedicationTimePrev;
	public static Date currentMedicationTimeCurr;
	public static Date currentMedicationTimeNext;

	// Resident Desktop Medication
	public static FrameResidentDesktopMedication frameResidentDesktopMedication;
	// public static PanelResidentDesktopMedication
	// panelResidentDesktopMedication;

	// ///////

	public static String currentPhyMedication;

	public static PhysicianOrderForm3Row currentPhysicianOrderForm3row;

	// ///
	// public static PhoneField phoneField;
	public static SsnField panelSSNumber;

	// /////

	public static int currentCensusStatusId;
	public static int currentCenusStatusPrevId;
	public static int currentCenusStatusNextId;

	public static int currentSignOutToKey;

	// Resident Desktop Care Log
	// public static FrameResidentDesktopCareLog frameResidentDesktopCareLog;
	// public static PanelResidentDesktopCareLog panelResidentDesktopCareLog;
	public static PanelCareLogCategory panelCareLogCategory;
	public static FrameCareLogCategory frameCareLogCategory;
	public static PanelCareLogLevelA panelCareLogLevelA;
	// public static PanelChooseCareLog panelChooseCareLog;
	public static PanelCareLogLevelB panelCareLogLevelB;
	// public static PanelCNALevelB panelCNALevelB;

	// /scan

	// public static PanelScanForm panelScanForm;

	public static FrameScanFormAdd frameScanFormAdd;
	public static PanelScanFormAdd panelScanFormAdd;
	// public static int currentScanFormKey;

	public static String currentScanFormname;

	public static ImageIcon currentScanFImageIcon;
	public static String currentScanFormImageFileName;

	public static medrex.commons.enums.ResidentTabs currentResidentTabs;
	public static boolean currentScanFormMode;

	public static FrameScanPageAdd frameScanPageAdd;

	// lab reports
	public static FrameLabReports frameLabReports;
	public static PanelLabReport panelLabReport;
	public static PanelLabReportMails panelLabReports;

	public static FrameInterDisciplinaryProgressNotesFormRowDialog frameInterDisciplinaryProgressNotesFormRowDialog;
	public static FrameProgressNotesFormDialog frameProgressNotesFormDialog;
	public static DoctorsProgressNotesFormRow currentDoctorsProgressNotesFormRow;
	public static InterDisciplinaryProgressNotesFormRow currentInterdisciplinaryProgressNotesFormRow;
	public static PanelProgressNotesFormDialog panelProgressNotesFormDialog;

	public static FramePharmacistEvaluationReportFormRowDialog framePharmacistEvaluationReportFormRowDialog;
	public static PharmacistEvaluationReportFormRow currentPharmacistResidentEvaluationFormRow;

	// ///messages

	public static FrameMessages frameMessages;
	public static PanelMessages panelMessages;
	public static FrameMessagesRecordAdd frameMessagesRecordAdd;
	public static PanelMessagesRecordAdd panelMessagesRecordAdd;

	public static int currentMessagesRecordKey;
	public static int currentMessagesRecordFormKey;
	// show
	public static FrameMessagesShowAdd frameMessagesShowAdd;
	public static PanelMessagesShowAdd panelMessagesShowAdd;

	public static FrameDietaryPlazaHealthRowDialog frameDietaryPlazaHealthRowDialog;
	public static FrameScanResidentFormAdd frameScanResidentFormAdd;
	public static DietaryPlazaHealthRow currentDietaryPlazaHealthRow;

	public static PanelScanResidentFormAdd panelScanResidentFormAdd;
	// public static PanelResidentDiagnosis panelResidentDiagnosis;

	public static boolean currentNurseTreatmentNotesFormDialogMode;
	public static NurseTreatmentNotesFormRow currentNurseTreatmentNotesFormRow;
	public static FrameNurseTreatmentNotesFormRow1Dialog frameNurseTreatmentNotesFormRow1Dialog;
	public static FrameNurseTreatmentNotesFormRowDialog frameNurseTreatmentNotesFormRowDialog;
	public static NurseTreatmentNotesFormRow1 currentNurseTreatmentNotesFormRow1;

	public static FrameMonthlyVitalSheetFormRowDialog frameMonthlyVitalSheetFormRowDialog;
	public static MonthlyVitalSheetFormRow currentMonthlyVitalSheetFormRow;

	public static FrameNurseMedicationNotesRowDialog frameNurseMedicationNotesRowDialog;

	public static NurseMedicationNotesFormRow currentNurseMedicationNotesFormRow;

	public static FrameNurseMedicationNotesRow1Dialog frameNurseMedicationNotesRow1Dialog;

	public static NurseMedicationNotesFormRow1 currentNurseMedicationNotesFormRow1;

	public static CumulativeDiagnosisFormRow currentCumulativeDiagnosisFormRow;

	public static FrameCumulativeDiagnosisFormRowDialog frameCumulativeDiagnosisFormRowDialog;

	public static FrameResidentInfoGeneralAddDialog frameResidentInfoGeneralAddDialog;

	public static FrameWeeklyWeightsFormRowDialog frameWeeklyWeightsFormRowDialog;

	public static int currentResidentInfoGeneralPhoneKey;

	public static ResidentMain currentResidentMain;

	public static ResidentInfoGeneralPhone currentResidentInfoGeneralPhone;

	public static WeeklyWeightsFormRow currentWeeklyWeightsFormRow;

	public static int currentMDSButtonKey;

	public static FrameMainDesktopTmp frameMainDesktopTmp;

	public static medrex.client.main.PanelMainDesktop panelMainDesktopTmp;
	public static int currentMDSProtocalSummaryKey;

//	public static MDSAssessmentTypes currentMDSAssessmentType;
	public static int currentMDSProtocolSummaryKey;
	public static int currentMDSMedicarePPS1Key;
	public static int currentMDSMedicarePPS2Key;
	public static int currentMDSMedicarePPS3Key;
	public static int currentMDSMedicarePPS4Key;
	public static int currentMDSDischargeTrackingForm1Key;
	public static int currentMDSReEntryTrackingForm1Key;

	public static medrex.client.main.resident.payerInfo.PanelResidentInfoPayerMain panelResidentInfoPayerMainTmp;
	// public static
	// medrex.client.main.resident.contactinfo.PanelResidentInfoContactMain
	// panelResidentInfoContactMainTmp;

	// public static medrex.ui.mds.FrameMDSFormAdd frameMDSFormAddNew;

	public static medrex.client.main.admission.FrameAdmissionRecordAdd frameAdmissionRecordAddNew;

	public static medrex.client.main.medication.FrameMedicationTreatmentFormAdd frameMedicationTreatmentFormAddNew;

	public static medrex.client.main.physicanOrders.FramePhysicianOrdersAdd framePhysicianOrdersAddNew;

	public static medrex.client.main.consultant.FrameConsultantAdd frameConsultantAddNew;

	public static medrex.client.main.dietary.FrameDietaryAdd frameDietaryAddNew;

	public static medrex.client.main.historyandphysical.FrameHistoryAndPhysicalAdd frameHistoryAndPhysicalAddNew;

	public static medrex.client.main.progressNotes.FrameProgressNotesAdd frameProgressNotesAddNew;

	public static medrex.client.main.labspecial.FrameLabSpecialAdd frameLabSpecialAddNew;

	public static medrex.client.main.ptOtSt.FramePtOtStAdd framePtOtStAddNew;

	public static medrex.client.main.medication.nurseTreatmentNotes.FrameNurseTreatmentNotesFormRow1Dialog frameNurseTreatmentNotesFormRow1DialogNew;

	public static medrex.client.main.medication.nurseTreatmentNotes.FrameNurseTreatmentNotesFormRowDialog frameNurseTreatmentNotesFormRowDialogNew;

	// public static medrex.client.providers.FrameProvidersRecordAdd
	// frameProvidersRecordAddNew;

	public static ResidentMain currentResidentObj;

	// public static FrameMainDashboard frameMainDashboard;

	public static FrameMainOptions frameMainOptions;

	// public static medrex.client.census.ui.FrameCensusForms
	// frameCensusFormsNew;

	// //

	public static int currentCarePlanKey;
	public static int currentCarePalnRecordKey;
	public static Date currentCarePlanDate;
	public static String currentCarePalnForm;
	public static medrex.client.main.careplan.FrameCarePlanAdd frameCarePlanAddNew;
	public static medrex.client.main.careplan.PanelCarePlan1 panelCarePaln1;

	public static medrex.client.PanelMainDashboard panelMainDashboard;

	public static medrex.client.carelog.PanelCareLogMain panelCareLogMain;

	// public static medrex.client.census.ui.FrameCensus frameCensusNew;

	public static medrex.client.census.ui.PanelCensusMain panelCensusMain;

	// my MDS

	public static int frameMDSFormkey;

	// Security

	public static medrex.client.admin.security.FrameSecurityAdd frameSecurityAddNew;
	public static int currentSecurityRoleKey;
	public static int currentRoleType;

	public static int currentPrescriptionKey;

	public static PanelPrescription panelPrescription;

	public static int currentUserLogonKey;

	public static int setPanelId;

	public static int userRoleId;

	public static int currentPanelProgressNotesKey;

	public static PanelProgressNotes2 panelProgressNotes2;

	public static FrameProgressNotes2Dialog frameProgressNotes2Dialog;

	public static ProgressNotes2 selectedMedication;

	public static int currentResponsiblePartyKey;

	// public static int currentCensusStatusId;

	public static FrameCensusNotes frameCensusNotes;

	public static ResidentContact tmpContact;
	public static ResidentContactPhone tmpContactPhone;
	public static int currentResidenceArgument;
	public static int currentMainTab;
	public static int currentInnerTab;

	public static boolean currentResidenceIsNew;

	public static FrameCensusNotesAdd frameCensusNotesAdd;

	public static int currentCensusNotesKey;

	public static String[] arguments;

	public static String selectedSource = null;

	public static FrameAccuritiesAdd frameAccuritiesAddNew;
	public static int currentAccuritiesKey;
	public static FrameAccuritiesListAdd frameAccuritiesListAddNew;
	public static int currentAccuritiesListKey;
	public static List accuritiesList;

	// public static FrameTreatmentAdd frameTreatmentAddNew;

	public static PanelCountAuditMain panelCountAuditMain;

	public static int currentCountAuditKey;

	public static int currentActivitysAssessmentFormPage;

	// MasterList

	public static FrameMasterListAdd frameMasterListAddNew;

	public static FrameCensusStatusHistoryReportChooser frameCensusStatusHistoryReportChoooser;

	public static FrameCensusReportDateChooser frameCensusReportDateChooser;

	public static FrameCategoriesNotesReport frameCategoriesNotesReport;

	// Form Scheduler
	public static PanelFormSchedulerMain panelFormSchedulerMain;

	public static PanelAdministrationMain panelAdministrationMain;

	public static int currentFormScheduleKey;

	public static FrameDownloadSourceChooser frameDownloadSourceChooser;

	public static FrameAddTextArea frameAddTextArea;

	public static FrameResidentAssessmentFormPage19Dialog FrameResidentAssessmentFormPage19Dialog;

	public static int currentResidentAssessmentFormPage19Key;

	public static int currentResidentAssessmentFormPage20Key;

	public static ResidentAssessmentFormPage19Col currentResidentAssessmentFormPage19Col;

	public static PanelResidentAssessmentFormPage19 panelResidentAssessmentFormPage19;

	protected static FrameResidentAssessmentFormPage19Dialog frameResidentAssessmentFormPage19Dialog;

	public static int currentScreenSaverTime;

	public static medrex.client.main.nursesNote.PanelDailySkilledNursesNotes panelDailySkilledNursesNotes;

	public static medrex.client.main.nursesNote.FrameDailySkilledNursesNotesDialog frameDailySkilledNursesNotesDialog;

	public static DailySkilledNursesNotesRow currentDailySkilledNursesNotesRow;

	public static medrex.client.main.nursesNote.PanelDailySkilledNursesNotesForm2 panelDailySkilledNursesNotesForm2;

	public static int currentDailySkilledNursesNotesForm2Key;

	public static int currentAlertKey;

	public static int currentTemplateKey;

	public static int currentNoteCategoriesKey;

	public static int currentDietListKey;

	public static int currentDietPlanKey;

	public static int currentResidentAssessmentFormPage21Key;

	public static PanelResidentAssessmentFormPage21 currentResidentAssessmentFormPage21;

	public static PanelResidentAssessmentFormPage22 currentResidentAssessmentFormPage22;

	public static int currentResidentAssessmentFormPage22Key;

	public static int currentSocialServiceInitialAssessmentForm2Key;
	public static int currentSocialServiceInitialAssessmentKey;

	public static PanelSocialServiceInitialAssessmentFormPage1 panelSocialServiceInitialAssessmentFormPage1;
	// Nutrition Support

	public static int currentNutritionSupportAssessmentFormKey;
	public static PanelNutritionSupportAssessmentFormPage1 panelNutritionSupportAssessmentForm;

	// public static int currentNutrtionSupportAssessmentFormKey;

	public static int currentPendingAlertKey;

	public static PanelAddNewPhysician panelAddNewPhysician;

	public static PanelPhysicianOrder panelPhysicianOrder;

	public static PanelMedication panelMedication;

	public static int NoOfMedicationPanel;

	public static MessageServer msgserver = null;

	public static int currentTriggerWordKey;

	public static long currentMedicationKey;
	public static long currentTreatmentKey;

	public static int siteNumber;

	public static Window rootWindow;

	public static String currentAlertStatus = "";

	public static int totalADL = 0;

	public static String currentRFPS = "";

	public static String currentRehab = "";

	public static FrameSpeechTextArea frameSpeechTextArea;

	public static FramePhysicalDailyTextArea framePhysicalDailyTextArea;

	public static List userList;

	public static int currentUserListKey;

	public static int currentPasswordSettingKey;

	public static PanelResidentMain panelResidentMainAcutites;

	public static PanelResidents panelResidentAcuities;

	public static String selectedRoom;

	public static PanelRoomPopUp panelRoomPopUpFloorPlan;

	public static PanelChangeRoomForm panelChangeRoomForm;

	public static JDialog frameRoomGraphicalView;

	public static PanelMonthlySummaryMainPage panelMonthlySummaryMainPage;

	public static PanelMonthlySummaryPage1 panelPainManagementMonthlySummaryPage1;

	public static PanelMonthlySummaryPage2 panelPainManagementMonthlySummarypage2;

	public static FrameMonthlySummaryRecordAdd frameMonthlySummaryRecordAdd;

	public static int currentMonthlySummaryFormPage;

	public static int currentMonthlySummaryRecordKey;

	public static int currentMonthlySummaryMainPageKey;

	public static int currentMonthlySummaryPage1Key;

	public static int currentMonthlySummaryPage2Key;

	public static String currentMonthlySummaryForm;

	public static int currentMonthlySummaryPage5Key;

	public static int currentMonthlySummaryPage3Key;

	public static int currentMonthlySummaryPage4Key;

	public static int currentAdmissionAndDischargeSummaryKey;

	public static int currentTestFormKey;

	public static int currentResidentAllergiesKey;

	public static FrameValidationPopUp frameValidationPopUp;

	public static int currentValidationFormKey;

	public static int currentValidationFormFieldKey;

	public static int currentFormFieldValidationKey;

	public static PanelFormTree framePanelJTree;

	public static int currentFormAlertConfig;

	public static PanelFormConfigAlertInfo panelFormConfigAlert;

	public static PanelFirstFloor panelRoomPopUp;

	public static int currentMsjnKey;

	public static int currentAssessingResident1;

	public static int currentAssessingResident2;

	public static int currentAssessingResident3;

	public static int currentPhysicianProgressNotesKey;

	public static int currentResidentImmunizationKey;

	public static int currentVitalSignKey;

	public static FrameWoundRecordAdd frameWoundRecordAdd;

	public static PanelResidentAssessmentFormPage14 panelResidentAssessmentFormPage14;

	public static FrameActivitysRecordAdd frameActivitysRecordAddNew;

	public static int currentResidentWeightKey;

	public static int currentResidentInformationKey;

	public static int currentResidentTransferFormKey;

	public static int currentInventoryPersonalEffectFormKey;

	public static int currentResidentStatusSheetKey;

	public static int currentResidentCarePlanFormKey;

	public static int currentInterDisciplinaryFormKey;

	public static PanelDietaryAlertSheet panelDietaryAlertSheet;

	public static int currentDietaryAlertSheetKey;

	public static int currentInfluenzaConsentFormKey;

	public static int currentSkilledFlowSheetKey;

	public static int currentPhysicianOrderDietKey;

	public static int currentPhysicianOrderRecordKey;

	public static String currentPhysicianOrderFormType;

	public static PanelPhysicianOrderDetails panelPhysicianOrderDetails;

	public static PanelPhysicianOrdersDiets panelPhysicianOrdersDiets;

	public static int currentPhysicianOrderTreatmentKey;
	public static int currentPhysicianOrderMedicationKey;
	public static int currentPhysicianOrderTreatmentTempKey;

	public static PanelPhysicianOrderTreatment panelPhysicianOrderTreatment;

	public static int currentPhysicianOrderConsultationskey;

	public static PanelPhysicianOrderConsultations panelPhysicianOrderConsultations;
	public static int currentPhysicianOrderMedicationRecordKey;

	public static int currentPhysicianOrderDiagnosticTestskey;

	public static PanelPhysicianOrderDiagnosticTests panelPhysicianOrderDiagnosticTests;

	public static int currentPhysicianOrderRespiratoryTherapyKey;

	public static PanelPhysicianOrderRespiratoryTherapy panelPhysicianOrdersRespiratoryTherapy;

	public static int currentPhysicianOrderAdvanceDirectivesKey;

	public static PanelPhysicianOrderAdvanceDirectives panelPhysicianOrdersAdvanceDirectives;

	public static PanelPhysicanOrderMedication panelPhysicianOrdersMedication;
	public static PanelShowMedicationDetails  panelShowMedicationDetails;
	public static PanelPhysicianOrderTherapyTest panelPhysicianOrderTherapyTest;

	public static PanelPhysicianOrderTreatmentTemp panelPhysicianOrderTreatmentTemp;
	public static int currentPhysicianOrderTherapyTestkey;

	public static PanelEnteralProtocol panelEnteralProtocol;

	public static int currentPhysicianOrderMiscellaneouskey;
	public static PanelPhysicianOrderMiscellaneous panelPhysicianOrderMiscellaneous;
	public static int currentRehabilitationRestrorativekey;
	public static PanelRehabilitationRestrorative panelRehabilitationRestrorative;

	public static int currentPhysicianOrderSafetyPrecautionsKey;

	public static PanelPhysicianOrderSafetyPrecautions panelPhysicianOrdersSafetyPrecautions;

	public static int currentPhysicianOrderEnteralProtocolKey;

	public static int currentParentalNutritionalOrderFormKey;

	public static PanelParentalNutritionalOrderForm PanelparentalNutritionalOrderForm;

	public static FrameFormManager frameFormManager;

	// for new Medication cart
	public static FrameMedicationDesktop frameMedicationDashboard;

	// for new Treatment cart
	// public static FrameTreatmentDesktop frameTreatmentDashboard;

	public static String currentMds3FormType;

	// public static FrameMDSRecordAdd frameMds3RecordAdd;
	// public static medrex.client.mds3.page.FrameMDSRecordAdd
	// frameMds3RecordAdd;

	public static FrameDialysisRecordAdd frameDialysisRecordAdd;

	public static String currentDialysisRecordForm;

	public static int currentDialysisRecordKey;

	public static FrameNursesNotesRecordAdd frameNursesNotesRecordAdd;

	public static String currentNursesNotesForm;

	public static int currentNursesNotesPageNo;

	public static int currentNursesNotesRecordKey;

	public static FramePhysicianOrder framePhysicianOrder;

	public static Mds3Controller mdsController;

	public static FrameMds3RecordAdd frameMDS3FormAdd;

	// creating MDS3.0 form
	public static int currentMDS3FormKey;
	public static int currentMDSRecordKey;
	public static String currentMDS3Form;
	public static Integer currentMds3Page;
	public static FrameMds3RecordAdd frameMds3RecordAdd;

	public static int currentFrameFormManagerKey;

	// mini cache of hashmap

	public static HashMap<Integer, Users> userMap = new HashMap();
	public static HashMap<Integer, AdmissionFromSubHead> admissionFromSubHeadMap = new HashMap();
	public static HashMap<Integer, AdmissionTransportation> admissionTransportMap = new HashMap();
	

}
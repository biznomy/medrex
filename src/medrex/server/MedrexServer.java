package medrex.server;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;

import medrex.commons.dataObj.Rooms;
import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.enums.CensusConstants;
import medrex.commons.enums.LoggerAction;
import medrex.commons.enums.LoggerModule;
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
import medrex.server.Logger.Logger;
import medrex.server.constants.Global;
import medrex.server.dao.resident.ResidentInformationDAO;
import medrex.server.service.accurities.AccuritiesService;
import medrex.server.service.activation.ActivationService;
import medrex.server.service.activity.ActivityAssessmentFormPage2Service;
import medrex.server.service.activity.ActivityInitialAssessmentFormService;
import medrex.server.service.activity.ActivitysRecordService;
import medrex.server.service.admin.ScreenSaver.ConfigService;
import medrex.server.service.admin.ambulation.AmbulationWeightService;
import medrex.server.service.admin.diet.DietService;
import medrex.server.service.admin.formManager.FormManagerService;
import medrex.server.service.admin.formScheduler.FormScheduleService;
import medrex.server.service.admin.formScheduler.PendingFormService;
import medrex.server.service.admin.medication.MedicationService;
import medrex.server.service.admin.notesCategories.NotesCategoriesService;
import medrex.server.service.admin.nursingHome.NursingHomeService;
import medrex.server.service.admin.passwordSetting.PasswordSettingService;
import medrex.server.service.admin.security.SecurityRoleService;
import medrex.server.service.admin.treatment.TreatmentService;
import medrex.server.service.admin.triggerWord.TriggerWordService;
import medrex.server.service.admin.userLogon.UserLogonService;
import medrex.server.service.admin.validation.ValidationService;
import medrex.server.service.admission.AdmissionRecordService;
import medrex.server.service.admission.NutritionSupportAssessmentFormService;
import medrex.server.service.admission.ResidentAssessmentFormService;
import medrex.server.service.admission.SocialServiceInitialAssessmentService;
import medrex.server.service.admission.analyzer.CarePlanAnalyzerService;
import medrex.server.service.admission.smokers.AssessingResidentService1;
import medrex.server.service.admission.smokers.AssessingResidentService2;
import medrex.server.service.admission.smokers.AssessingResidentService3;
import medrex.server.service.alert.AlertService;
import medrex.server.service.alert.AlertTimeService;
import medrex.server.service.alert.CalculatedAlertService;
import medrex.server.service.alert.PendingAlertService;
import medrex.server.service.careLog.CareLogService;
import medrex.server.service.carePlan.CarePlanRecordService;
import medrex.server.service.carePlan.CarePlanService;
import medrex.server.service.census.AdmissionFromHeadService;
import medrex.server.service.census.AdmissionFromSubHeadService;
import medrex.server.service.census.AdmissionTransportationService;
import medrex.server.service.census.CensusNotesService;
import medrex.server.service.census.CensusStatusService;
//import medrex.server.service.census.PendingMDSService;
import medrex.server.service.census.ResponsiblePartyService;
import medrex.server.service.census.SignOutToService;
import medrex.server.service.census.countAudit.CountAuditFloorService;
import medrex.server.service.census.countAudit.CountAuditService;
import medrex.server.service.census.countAudit.CountAuditStatusService;
import medrex.server.service.census.counts.BedHoldService;
import medrex.server.service.census.counts.HospitalService;
import medrex.server.service.census.counts.InHouseService;
import medrex.server.service.census.counts.OutOfPassService;
import medrex.server.service.census.counts.SignOutService;
import medrex.server.service.cna.CNAService;
import medrex.server.service.consultant.ConsultantService;
import medrex.server.service.consultant.PharmacistEvaluationReportService;
import medrex.server.service.consultant.ReferralFormService;
import medrex.server.service.consultant.RenalDialysisCommunicationFormService;
import medrex.server.service.consultant.ReportOfConsultationFormService;
import medrex.server.service.dashboard.DashboardService;
import medrex.server.service.dialysis.DialysisRecordService;
import medrex.server.service.dietary.DietaryCommunicationFormService;
import medrex.server.service.dietary.DietaryPlazaHealthService;
import medrex.server.service.dietary.DietaryResidentDiagnosisService;
import medrex.server.service.dietary.DietaryService;
import medrex.server.service.dietary.EnteralFeedingService;
import medrex.server.service.general.Icd9Service;
import medrex.server.service.historyAndPhysical.CumulativeDiagnosisFormService;
import medrex.server.service.historyAndPhysical.HistoryAndPhysicalGeneralFormService;
import medrex.server.service.historyAndPhysical.HistoryAndPhysicalService;
import medrex.server.service.historyAndPhysical.MonthlyVitalSheetFormService;
import medrex.server.service.historyAndPhysical.WeeklyWeightsFormService;
import medrex.server.service.labReport.LabReportService;
import medrex.server.service.labSpecial.LabSpecialService;
import medrex.server.service.labSpecial.MadexForm1Service;
import medrex.server.service.labSpecial.MadexForm2Service;
import medrex.server.service.labSpecial.ReasonForStudyService;
import medrex.server.service.masterList.MasterListService;

import medrex.server.service.mds3.Mds3Service;
import medrex.server.service.medication.DailySkilledNursesNotesForm2Service;
import medrex.server.service.medication.DailySkilledNursesNotesService;
import medrex.server.service.medication.MedicationAdministrationRecordFormService;
import medrex.server.service.medication.MedicationPRNRecordFormService;
import medrex.server.service.medication.MedicationRoutineRecordFormService;
import medrex.server.service.medication.NurseMedicationNotesFormService;
import medrex.server.service.medication.NurseTreatmentNotesFormService;
import medrex.server.service.medication.PainManagementRecordFormService;
import medrex.server.service.medication.PressureSoreRecordFormService;
import medrex.server.service.medication.TemplatesService;
import medrex.server.service.medication.TreatmentPRNRecordFormService;
import medrex.server.service.medication.TreatmentRoutineRecordFormService;
import medrex.server.service.medication.medicationTreatmentFormService;
import medrex.server.service.medicationCart.MedicationCartService;
import medrex.server.service.medicationCart.PRNmedicationService;
import medrex.server.service.messages.MessagesRecordService;
import medrex.server.service.monthlySummary.AdmissionAndDischargeService;
import medrex.server.service.monthlySummary.DietaryAlertSheetService;
import medrex.server.service.monthlySummary.InfluenzaConsentFormService;
import medrex.server.service.monthlySummary.InterDisciplinaryCarePlanService;
import medrex.server.service.monthlySummary.MonthlySummaryFormService;
import medrex.server.service.monthlySummary.MonthlySummaryPage3Service;
import medrex.server.service.monthlySummary.MonthlySummaryPage4Service;
import medrex.server.service.monthlySummary.MonthlySummaryPage5Service;
import medrex.server.service.monthlySummary.MsnjService;
import medrex.server.service.monthlySummary.PhysicianProgressNotesService;
import medrex.server.service.monthlySummary.ResidentCarePlanFormService;
import medrex.server.service.monthlySummary.ResidentInformationService;
import medrex.server.service.monthlySummary.ResidentInventoryPersonalEffectFormService;
import medrex.server.service.monthlySummary.ResidentStatusSheetService;
import medrex.server.service.monthlySummary.ResidentTransferFormService;
import medrex.server.service.monthlySummary.SkilledFlowSheetService;
import medrex.server.service.notes.NotesService;
import medrex.server.service.nursesNotes.NursesNotesService;
import medrex.server.service.others.DoctorsService;
import medrex.server.service.others.NurseService;
import medrex.server.service.others.UserService;
import medrex.server.service.physician.PhysicianFormService;
import medrex.server.service.physicianOrders.PanelPrescriptionNotesService;
import medrex.server.service.physicianOrders.PhysicianInfusionService;
import medrex.server.service.physicianOrders.PhysicianOrderForm1Service;
import medrex.server.service.physicianOrders.PhysicianOrderForm2Service;
import medrex.server.service.physicianOrders.PhysicianOrderForm3Service;
import medrex.server.service.physicianOrders.PhysicianOrdersService;
import medrex.server.service.physicianOrders.PhysicianPlazaHealthCareService;
import medrex.server.service.physicianOrders.PhysicianSpecialityService;
import medrex.server.service.physicianOrders.PrescriptionService;
import medrex.server.service.physicianOrders.ResidentImmunizationRecordService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderAdvanceDirectivesService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderConsultationsServices;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderDiagnosticTestsService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderDietService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderMiscellaneousService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderRecordService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderRespiratoryTherapyService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderSafetyPrecautionsService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderTherapyTestService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderTreatmentService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderTreatmentTempService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.RestrorativeService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.childForms.PhysicianOrderEnteralService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.childForms.PhysicianOrderParentalNutritionalOrderFormService;
import medrex.server.service.progressNotes.DoctorProgressNotesFormService;
import medrex.server.service.progressNotes.InterDisciplinaryProgressNotesFormService;
import medrex.server.service.progressNotes.ProgressNotesService;
import medrex.server.service.providers.ProvidersRecordFormService;
import medrex.server.service.providers.ProvidersRecordService;
import medrex.server.service.ptOtSt.PtOtStOccupationalDailyRecordService;
import medrex.server.service.ptOtSt.PtOtStOccupationalTherapyService;
import medrex.server.service.ptOtSt.PtOtStPhysicalDailyRecordService;
import medrex.server.service.ptOtSt.PtOtStPhysicalTherayService;
import medrex.server.service.ptOtSt.PtOtStPositioningEvaluationService;
import medrex.server.service.ptOtSt.PtOtStRehabCarePlanService;
import medrex.server.service.ptOtSt.PtOtStService;
import medrex.server.service.ptOtSt.PtOtStSpeechDailyRecordService;
import medrex.server.service.ptOtSt.PtOtStSpeechLanguageService;
import medrex.server.service.ptOtSt.PtOtStTherapyPhysicalService;
import medrex.server.service.ptOtSt.PtOtStTreatmentService;
import medrex.server.service.ra.RAService;
import medrex.server.service.resident.ResidentAllergiesService;
import medrex.server.service.resident.ResidentContactService;
import medrex.server.service.resident.ResidentDiagnosisService;
import medrex.server.service.resident.ResidentInfoGeneralPhoneService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.service.resident.ResidentPayerNewService;
import medrex.server.service.resident.ResidentPayerService;
import medrex.server.service.resident.ResidentVitalSignsService;
import medrex.server.service.resident.ResidentWeightService;
import medrex.server.service.resident.RoomHistroySerivice;
import medrex.server.service.richTextField.RichTextFieldService;
import medrex.server.service.scan.ScanFormService;
import medrex.server.service.schedule.ScheduleService;
import medrex.server.service.schedule.UserScheduleService;
import medrex.server.service.scheduling.SchedulingService;
import medrex.server.service.treatmentCart.TreatmentCartService;
import medrex.server.threads.CalculateAlertThread;
import medrex.server.threads.CountThread;
import medrex.server.threads.MailThread;

public class MedrexServer implements MedrexIntf {

	public CountThread countThread;
	public MailThread mailThread;
	public CalculateAlertThread alertThread;

	public MedrexServer(boolean reset) {
		super();
		MessageClient messageClient = new MessageClient();
		Global.messageClient = messageClient;
		if (reset) {
			Global.reset = true;
		} else {
			Global.reset = false;
		}

		Global.medrexServer = this;
		countThread = new CountThread();
		mailThread = new MailThread();
		alertThread = new CalculateAlertThread();

		List resi;
		try {
			resi = (ResidentInformationDAO.getInstance().getResidentMain());
			if (resi.size() == 0) {
				System.out.println("INSERTING Marital status ......");
				DummyData.insertMaritalStatus();
				DummyData.insertEmpty();
				System.out.println("INSERTING State ......");
				DummyData.insertState();
				System.out.println("INSERTING Sex ......");
				DummyData.insertSex();
				System.out.println("INSERTING Citizen ......");
				DummyData.insertCitizen();
				System.out.println("INSERTING Religion ......");
				DummyData.insertReligion();
				System.out.println("INSERTING Language ......");
				DummyData.insertLanguage();
				System.out.println("INSERTING Origin ......");
				DummyData.insertOrigin();
				System.out.println("INSERTING Status ......");
				DummyData.insertStatus();
				System.out.println("INSERTING County ......");
				DummyData.insertCounty();
				System.out.println("INSERTING Payer Type ......");
				DummyData.insertPayerType();
				System.out.println("INSERTING Responsible Party ......");
				DummyData.insertPayerResponsibleParty();
				System.out.println("INSERTING Insurance ......");
				DummyData.insertInsurance();
				System.out.println("INSERTING Medicare Days ......");
				DummyData.insertMedicareDays();
				System.out.println("INSERTING Relation ship ......");
				DummyData.insertRelation();
				System.out.println("INSERTING Phone Types ......");
				DummyData.insertPhoneTypes();
				System.out.println("INSERTING Provider Types ......");
				DummyData.insertProviderTypes();
				System.out.println("INSERTING Doctor Types ......");
				DummyData.insertDoctorTypes();
			}
		} catch (Exception e1) {
		}

		// ReadExcel reader = new ReadExcel("allInformation.xls");
		// List<ResidentMain> residentList = reader.getResidents();
		// List<Icd9> icd9List = reader.getIcd9Codes();
		// List<Object[]> icd9Resident = reader.getResidentIcd9Codes();
		// List<Object[]> contactList = reader.getResidentContact();
		// List<Object[]> contactListNew = reader.getResidentContactNew();
		// List<Doctors> doctorList = reader.getPhysicians();
		// List<Object[]> resiPhyList = reader.getResidentPhysicians();
		// List<ProvidersRecordForm> providerList = reader.getProviders();
		// List<Object[]> resiProList = reader.getResidentProviders();
		// List<Object[]> censusList = reader.getResidentCensus();

		// DummyData dummyData = new DummyData();

		System.out.println("INSERTING MEDREX DATA .......");

		// DummyData.insertResidentContactNew(contactListNew);

		try {

			List resii = (ResidentInformationDAO.getInstance()
					.getResidentMain());
			if (resii.size() == 0) {

				System.out.println("INSERTING RESIDENTS ......");
				// // DummyData.insertResidents(residentList);
				//
				// System.out
				// .println("INSERTING ICD 9 Codes ......this may take few minutes");
				// // DummyData.insertIcd9s(icd9List);
				// // DummyData.insertResidentIcd9(icd9Resident);
				//
				// System.out.println(new Date());
				// System.out.println("INSERTING RESIDENTS CONTACTS ......");
				// DummyData.insertResidentContact(contactList);
				// DummyData.insertResidentContactNew(contactListNew);
				// System.out.println("INSERTING DOCTORS ......");
				// DummyData.insertPhysicians(doctorList);
				// System.out.println("INSERTING RESIDENT DOCTORS ......");
				// DummyData.insertResidentPhysicians(resiPhyList);
				// DummyData.insertProviders(providerList);
				// DummyData.insertResidentProviders(resiProList);
				// System.out.println("INSERTING RESIDENT CENSUS ......");

				countThread.restart();
				mailThread.restart();
				alertThread.restart();

				// DummyData.insertResidentCensus(censusList);

				// DummyData.insertResidentCensus(censusList);

				// dummyData.insertDummyData();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		countThread.restart();
		mailThread.restart();
		alertThread.restart();
	}

	public Date getDateOfServer() {
		return (new Date());
	}

	public void addMessageServer(MsgServer msgServer) throws MedrexException,
			RemoteException {
		System.out.println("called " + msgServer);
		Global.messageClient.addServer(msgServer);
	}

	public static void main(String arg[]) {
		boolean resetVal;
		if (arg.length > 0) {
			resetVal = true;
		} else {
			resetVal = false;
		}
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			MedrexIntf medrexInterface = new MedrexServer(resetVal);
			MedrexIntf stub = (MedrexIntf) UnicastRemoteObject.exportObject(
					medrexInterface, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("medrex", stub);
			System.out.println("Medrex server is started.");
		} catch (Exception e) {
			System.out.println("Medrex server is not started.");
			e.printStackTrace();
		}

		// DummyData dummyData=new DummyData();
		// try {
		// List residents=Global.medrexServer.getResidentMain();
		// if (residents.size() == 0) {
		// dummyData.insertDummyData();
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentMain(medrex.commons
	 * .vo.resident.ResidentMain)
	 */
	public int insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentMain != null) {
			msg = "residentMain[serial:" + residentMain.getSerial()
					+ "; fname:" + residentMain.getUserName() + "; lname:"
					+ residentMain.getUserPass()/*
												 * + "; room:" +
												 * residentMain.getRoom()
												 */
					/* TODO: Migrating to room history */
					+ "]";
			if (residentMain.getSerial() != 0) {
				action = LoggerAction.UPDATE;
			}
		}
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentMainService())
				.insertOrUpdateResidentMain(residentMain);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentMain()
	 */
	public List getResidentMain() throws MedrexException, RemoteException {

		String msg = "Getting Resident Main";
		LoggerAction action = LoggerAction.GET;
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentMainService()).getResidentMain());
	}

	public List getResidentMain(String status) throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Resident Main with status";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentMainService()).getResidentMain(status));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResident(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	public List getResidents(String find, String firstName, String SS1,
			String status) throws MedrexException, RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Resident Main with find fname ss1 and status ";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentMainService()).getResidents(find, firstName, SS1,
				status));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResident(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	public List getResidents(String floorType) throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Resident Main with Floor Type";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentMainService()).getResidents(floorType));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResident(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public ResidentMain getResident(String lastName, String firstName,
			String SSN) throws MedrexException, RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Resident Main with Last Name first Name and SSN";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentMainService()).getResident(lastName, firstName,
				SSN));
	}

	public List<Rooms> getFirstFloorResidents() throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Residents in first floor";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentMainService()).getFirstFloorResidents();
	}

	public List<Rooms> getSecondFloorResidents() throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Residents in Second floor";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentMainService()).getSecondFloorResidents();
	}

	public List getFirstFloorResidents(Date date) throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Residents in first floor";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentMainService()).getFirstFloorResidents(date);
	}

	public List getSecondFloorResidents(Date date) throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Residents in Second floor";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentMainService()).getSecondFloorResidents(date);
	}

	public int updateInsuranceCount(int resid) throws MedrexException,
			RemoteException {

		LoggerAction action = LoggerAction.UPDATE;
		String msg = null;
		msg = "Updating Insurance Count";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentMainService().updateInsuranceCount(resid));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResident(int)
	 */
	public ResidentMain getResident(int serial) throws MedrexException,
			RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Resident with serial" + serial;
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentMainService()).getResident(serial));
	}

	public List getOccupiedRoom() throws MedrexException, RemoteException {
		LoggerAction action = LoggerAction.GET;
		String msg = null;
		msg = "Getting Occupied Room";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentMainService()).getOccupiedRoom());
	}

	// / Resident Payers

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentPayer(medrex.commons
	 * .vo.resident.ResidentPayer)
	 */
	public int insertOrUpdateResidentPayer(ResidentPayer residentPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			msg = "residentPayer[serial:" + residentPayer.getSerial()
					+ "; Responsible Party"
					+ residentPayer.getResponsibleParty()
					+ ";Associated Resident Id" + residentPayer.getResidentId()
					+ "]";
			if (residentPayer.getSerial() != 0) {
				action = LoggerAction.UPDATE;
			}
		}
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentPayerService())
				.insertOrUpdateResidentPayer(residentPayer);
	}

	public int insertOrUpdateResidentPayerNew(ResidentPayerNew residentPayerNew)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayerNew != null) {
			msg = "residentPayer[serial:" + residentPayerNew.getSerial()
					+ ";Associated Resident Id"
					+ residentPayerNew.getResidentId() + "]";
			if (residentPayerNew.getSerial() != 0) {
				action = LoggerAction.UPDATE;
			}
		}
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentPayerNewService())
				.insertOrUpdateResidentPayerNew(residentPayerNew);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentPayers(int)
	 */
	public List getResidentPayers(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Resident Payer";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentPayerService()).getResidentPayers(residentSerial));
	}

	public List getResidentPayersNew(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Resident Payers New";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentPayerNewService())
				.getResidentPayersNew(residentSerial));
	}

	public ResidentPayerNew getPayerInfoStatusNewByResidentId(
			ResidentMain residentId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Resident Payers New Status";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentPayerNewService())
				.getPayerInfoStatusNewByResidentId(residentId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentPayer(int)
	 */
	public ResidentPayer getResidentPayer(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Resident Payer with serial";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentPayerService()).getResidentPayer(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentPayer(int)
	 */
	public void deleteResidentPayer(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Payer";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResidentPayerService()).deleteResidentPayer(serial);
	}

	public void deleteResidentPayerNew(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Payer New";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResidentPayerNewService()).deleteResidentPayerNew(serial);
	}

	// / Resident Contact & Phones

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentContact(medrex.commons
	 * .vo.resident.ResidentContact)
	 */
	public int insertOrUpdateResidentContact(ResidentContact residentContact)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentContact != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Updating Resident Contact Info: [ResidentContact Name="
				+ residentContact.getFirstName()
				+ ";Resident Contact Last Name="
				+ residentContact.getLastName();
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResidentContactService())
				.insertOrUpdateResidentContact(residentContact);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContacts(int)
	 */
	public List getResidentContacts(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contacts info";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentContactService())
				.getResidentContacts(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContactsWithSignature(int)
	 */
	public List getResidentContactsWithSignature(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contacts with signature ";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentContactService())
				.getResidentContactsWithSignature(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContactsWithSignature(int,
	 * String)
	 */
	public List getResidentContactsWithSignature(int residentSerial,
			String likeStr) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contacts with signature and Other String";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentContactService())
				.getResidentContactsWithSignature(residentSerial, likeStr));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContacts(int,
	 * java.lang.String)
	 */
	public List getResidentContacts(int residentSerial, String likeStr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contacts list";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentContactService()).getResidentContacts(
				residentSerial, likeStr));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContact(int)
	 */
	public ResidentContact getResidentContact(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Single Resident Contact";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return ((new ResidentContactService()).getResidentContact(serial));
	}

	public ResidentContact getResidentContact(String lastName, String firstName)
			throws MedrexException, RemoteException {
		return ((new ResidentContactService()).getResidentContact(lastName,
				firstName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentContact(int)
	 */
	public void deleteResidentContact(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Contact";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResidentContactService()).deleteResidentContact(serial);
	}

	// Resident Contact Phone

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentContactPhone(medrex
	 * .commons.vo.resident.ResidentContactPhone)
	 */
	public int insertOrUpdateResidentContactPhone(
			ResidentContactPhone residentContactPhone) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentContactPhone != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "inserting or updating Resident Contact Phone";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentContactService())
				.insertOrUpdateResidentContactPhone(residentContactPhone);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContactPhones(int)
	 */
	public List getResidentContactPhones(int residentContactSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contact Phones";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentContactService())
				.getResidentContactPhones(residentContactSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentContactPhone(int)
	 */
	public ResidentContactPhone getResidentContactPhone(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contact Phone";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return ((new ResidentContactService()).getResidentContactPhone(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentContactPhone(int)
	 */
	public void deleteResidentContactPhone(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Contact Phone";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResidentContactService()).deleteResidentContactPhone(serial);
	}

	public void deleteAllPhonesForContact(int residentContactSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting All Phones for Resident Contact ";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResidentContactService())
				.deleteAllPhonesForContact(residentContactSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentContactPhone(int)
	 */
	public ResidentContactPhone getResidentContactPhonePrimary(
			int residentContactSerial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Contact Phone Primary";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResidentContactService())
				.getResidentContactPhonePrimary(residentContactSerial);
	}

	// / Admissions Record

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateAdmissionsRecord(medrex.
	 * commons.vo.admission.AdmissionsRecord)
	 */
	public int insertOrUpdateAdmissionsRecord(AdmissionsRecord residentPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting and Updating the Addmission Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_ADDMISSION, action, msg);
		return (new AdmissionRecordService())
				.insertOrUpdateAdmissionsRecord(residentPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionsRecords(int)
	 */
	public List getAdmissionsRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Admission records on resident serial";
		Logger.getInstance().log(LoggerModule.RESIDENT_ADDMISSION, action, msg);
		return ((new AdmissionRecordService())
				.getAdmissionsRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionsRecord(int)
	 */
	public AdmissionsRecord getAdmissionsRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Admission record on resident serial";
		Logger.getInstance().log(LoggerModule.RESIDENT_ADDMISSION, action, msg);

		return (new AdmissionRecordService()).getAdmissionsRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteAdmissionsRecord(int)
	 */
	public void deleteAdmissionsRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Admission records on resident serial";
		Logger.getInstance().log(LoggerModule.RESIDENT_ADDMISSION, action, msg);

		(new AdmissionRecordService()).deleteAdmissionsRecord(serial);
	}

	// / ResidentAssessmentForm Page1

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage1
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage1)
	 */
	public int insertOrUpdateResidentAssessmentFormPage1(
			ResidentAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating The Resident Assessment Form Page 1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage1(rafp1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage1s(int)
	 */
	public List getResidentAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Resident Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage1(int)
	 */
	public ResidentAssessmentFormPage1 getResidentAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage1(serial));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage1(int)
	 */
	public void deleteResidentAssessmentFormPage1(int serial)

	throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage1((serial));
	}

	// / ResidentAssessmentForm Page2

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage2
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage2)
	 */
	public int insertOrUpdateResidentAssessmentFormPage2(
			ResidentAssessmentFormPage2 rafp2) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating The Resident Assessment Form Page 2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage2(rafp2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage2(int)
	 */
	public ResidentAssessmentFormPage2 getResidentAssessmentFormPage2(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage2(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage2(int)
	 */
	public void deleteResidentAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage2((serial));
	}

	// / ResidentAssessmentForm Page3

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage3
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage3)
	 */
	public int insertOrUpdateResidentAssessmentFormPage3(
			ResidentAssessmentFormPage3 rafp3) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp3 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating The Resident Assessment Form Page 3";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage3(rafp3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage3(int)
	 */
	public ResidentAssessmentFormPage3 getResidentAssessmentFormPage3(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page3";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage3(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage3(int)
	 */
	public void deleteResidentAssessmentFormPage3(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page3";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage3((serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePressureSoreAssessment(medrex
	 * .commons.vo.medication.PressureSoreAssessment)
	 */
	public int insertOrUpdatePressureSoreAssessment(PressureSoreAssessment psa)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psa != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating The Pressure Sore Assessment";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdatePressureSoreAssessment(psa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPressureSoreAssessment(int, int)
	 */
	public PressureSoreAssessment getPressureSoreAssessment(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pressure Sore Assessment Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return ((new ResidentAssessmentFormService())
				.getPressureSoreAssessment(formId, formNum));
	}

	// / ResidentAssessmentForm Page4

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage4
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage4)
	 */
	public int insertOrUpdateResidentAssessmentFormPage4(
			ResidentAssessmentFormPage4 rafp4) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp4 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page4";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage4(rafp4);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage4(int)
	 */
	public ResidentAssessmentFormPage4 getResidentAssessmentFormPage4(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page4";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage4(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage4(int)
	 */
	public void deleteResidentAssessmentFormPage4(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page4";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage4((serial));
	}

	// / ResidentAssessmentForm Page5

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage5
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage5)
	 */
	public int insertOrUpdateResidentAssessmentFormPage5(
			ResidentAssessmentFormPage5 rafp5) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp5 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page5";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage5(rafp5);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage5(int)
	 */
	public ResidentAssessmentFormPage5 getResidentAssessmentFormPage5(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page5";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage5(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage5(int)
	 */
	public void deleteResidentAssessmentFormPage5(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page5";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage5((serial));
	}

	// / ResidentAssessmentForm Page6

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage6
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage6)
	 */
	public int insertOrUpdateResidentAssessmentFormPage6(
			ResidentAssessmentFormPage6 rafp6) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp6 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page6";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage6(rafp6);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage6(int)
	 */
	public ResidentAssessmentFormPage6 getResidentAssessmentFormPage6(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page6";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage6(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage6(int)
	 */
	public void deleteResidentAssessmentFormPage6(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page6";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage6((serial));
	}

	// / ResidentAssessmentForm Page7

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage7
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage7)
	 */
	public int insertOrUpdateResidentAssessmentFormPage7(
			ResidentAssessmentFormPage7 rafp7) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp7 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page7";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage7(rafp7);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage7(int)
	 */
	public ResidentAssessmentFormPage7 getResidentAssessmentFormPage7(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page7";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage7(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage7(int)
	 */
	public void deleteResidentAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page7";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage7((serial));
	}

	// PainAssessment Form

	public int insertOrUpdatePainAssessment(PainAssessment painAssessment)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		msg = "Inserting Resident Pain Assessment";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdatePainAssessment(painAssessment);
	}

	public PainAssessment getPainAssessment(int formId, int formNum)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pain Assessment (Assessment form page 7)";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		return (new ResidentAssessmentFormService()).getPainAssessment(formId,
				formNum);
	}

	public void deletePainAssessment(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pain Assessment (Assessment form page 7)";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		(new ResidentAssessmentFormService()).deletePainAssessment(formId);
	}

	// / ResidentAssessmentForm Page8

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage8
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage8)
	 */
	public int insertOrUpdateResidentAssessmentFormPage8(
			ResidentAssessmentFormPage8 rafp8) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp8 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page8";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage8(rafp8);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage8(int)
	 */
	public ResidentAssessmentFormPage8 getResidentAssessmentFormPage8(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page8";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage8(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage8(int)
	 */
	public void deleteResidentAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Getting Resident Assessment Form Page8";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage8((serial));
	}

	// / ResidentAssessmentForm Page9

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage9
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage9)
	 */
	public int insertOrUpdateResidentAssessmentFormPage9(
			ResidentAssessmentFormPage9 rafp9) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp9 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page9";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage9(rafp9);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage9(int)
	 */
	public ResidentAssessmentFormPage9 getResidentAssessmentFormPage9(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page9";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage9(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage9(int)
	 */
	public void deleteResidentAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "deleting Resident Assessment Form Page9";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage9((serial));
	}

	// / ResidentAssessmentForm Page10

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage10
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage10)
	 */
	public int insertOrUpdateResidentAssessmentFormPage10(
			ResidentAssessmentFormPage10 rafp10) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp10 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page10";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage10(rafp10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage10(int)
	 */
	public ResidentAssessmentFormPage10 getResidentAssessmentFormPage10(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page10";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage10(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage10(int)
	 */
	public void deleteResidentAssessmentFormPage10(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page10";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage10((serial));
	}

	// / ResidentAssessmentForm Page11

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage11
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage11)
	 */
	public int insertOrUpdateResidentAssessmentFormPage11(
			ResidentAssessmentFormPage11 rafp11) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp11 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page11";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage11(rafp11);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage11(int)
	 */
	public ResidentAssessmentFormPage11 getResidentAssessmentFormPage11(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page11";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage11(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage11(int)
	 */
	public void deleteResidentAssessmentFormPage11(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page11";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage11((serial));
	}

	// / ResidentAssessmentForm Page12

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage12
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage12)
	 */
	public int insertOrUpdateResidentAssessmentFormPage12(
			ResidentAssessmentFormPage12 rafp12) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp12 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page12";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage12(rafp12);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage12(int)
	 */
	public ResidentAssessmentFormPage12 getResidentAssessmentFormPage12(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page12";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage12(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteResidentAssessmentFormPage12(int)
	 */
	public void deleteResidentAssessmentFormPage12(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page12 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage12((serial));
	}

	// / ResidentAssessmentForm Page13

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentAssessmentFormPage13
	 * (medrex.commons.vo.admission.ResidentAssessmentFormPage13)
	 */
	public int insertOrUpdateResidentAssessmentFormPage13(
			ResidentAssessmentFormPage13 rafp13) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp13 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page13";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage13(rafp13);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentAssessmentFormPage13(int)
	 */
	public List<ResidentAssessmentFormPage13> getResidentAssessmentFormPage13(
			int resdentId, int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page13";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage13(resdentId, formId));
	}

	public void deleteResidentAssessmentFormPage13(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page13 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage13((serial));
	}

	public int insertOrUpdateResidentAssessmentFormPage14(
			ResidentAssessmentFormPage14 rafp14) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp14 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page14";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage14(rafp14);
	}

	public ResidentAssessmentFormPage14 getResidentAssessmentFormPage14(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page14";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage14(formId));
	}

	public void deleteResidentAssessmentFormPage14(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page14 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage14((serial));
	}

	public int insertOrUpdateResidentAssessmentFormPage15(
			ResidentAssessmentFormPage15 rafp15) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp15 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page15";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage15(rafp15);
	}

	public ResidentAssessmentFormPage15 getResidentAssessmentFormPage15(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page15";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage15(formId));
	}

	public void deleteResidentAssessmentFormPage15(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page15 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage15((serial));
	}

	public int insertOrUpdateResidentAssessmentFormPage16(
			ResidentAssessmentFormPage16 rafp16) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp16 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page16";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage16(rafp16);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page16";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage16(formId));
	}

	public void deleteResidentAssessmentFormPage16(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page16 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage16((serial));
	}

	public int insertOrUpdateResidentAssessmentFormPage17(
			ResidentAssessmentFormPage17 rafp17) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp17 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page17";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage17(rafp17);
	}

	public ResidentAssessmentFormPage17 getResidentAssessmentFormPage17(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page17 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage17(formId));
	}

	public void deleteResidentAssessmentFormPage17(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page17 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage17((serial));
	}

	public int insertOrUpdateResidentAssessmentFormPage18(
			ResidentAssessmentFormPage18 rafp18) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp18 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page18";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage18(rafp18);
	}

	public ResidentAssessmentFormPage18 getResidentAssessmentFormPage18(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page18 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage18(formId));
	}

	public void deleteResidentAssessmentFormPage18(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page18 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage18((serial));
	}

	public void deleteResidentAssessmentFormPage19(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page17 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage19((serial));

	}

	public void deleteResidentAssessmentFormPage19Col(int formSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page19 Column";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage19Col((formSerial));

	}

	public void deleteResidentAssessmentFormPage20(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page20 with serial" + serial;
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage20((serial));

	}

	public ResidentAssessmentFormPage20 getResidentAssessmentFormPage20(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page20 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage20(formId));
	}

	public int insertOrUpdateResidentAssessmentFormPage20(
			ResidentAssessmentFormPage20 refResidentAssessmentForm20)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentAssessmentForm20 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page20";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage20(refResidentAssessmentForm20));
	}

	public int insertOrUpdateResidentAssessmentFormPage21(
			ResidentAssessmentFormPage21 refResidentAssessmentFormPage21)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentAssessmentFormPage21 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page21";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage21(refResidentAssessmentFormPage21));
	}

	public ResidentAssessmentFormPage21 getResidentAssessmentFormPage21(
			int currentResidentAssessmentFormPage21Key) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page21 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage21(currentResidentAssessmentFormPage21Key));
	}

	public void deleteResidentAssessmentFormPage21(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page21";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage21(formId);
	}

	public int insertOrUpdateResidentAssessmentFormPage22(
			ResidentAssessmentFormPage22 refResidentAssessmentFormPage22)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentAssessmentFormPage22 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page22";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage22(refResidentAssessmentFormPage22));
	}

	public ResidentAssessmentFormPage22 getResidentAssessmentFormPage22(
			int currentResidentAssessmentFormKey) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page22 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage22(currentResidentAssessmentFormKey));
	}

	public void deleteResidentAssessmentFormPage22(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Assessment Form Page22";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);
		(new ResidentAssessmentFormService())
				.deleteResidentAssessmentFormPage22(formId);
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage7(
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentQuarterlyAssessmentFormPage7 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Quaterly Assessment Form Page 7";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentQuarterlyAssessmentFormPage7(residentQuarterlyAssessmentFormPage7);
	}

	public ResidentQuarterlyAssessmentFormPage7 getResidentQuarterlyAssessmentFormPage7(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Quarterly Assessment Form Page7 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentQuarterlyAssessmentFormPage7(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage7(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Quarterly Assessment Form Page7 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentQuarterlyAssessmentFormPage7((serial));
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage8(
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentQuarterlyAssessmentFormPage8 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Quaterly Assessment Form Page 8";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentQuarterlyAssessmentFormPage8(residentQuarterlyAssessmentFormPage8);
	}

	public ResidentQuarterlyAssessmentFormPage8 getResidentQuarterlyAssessmentFormPage8(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Quarterly Assessment Form Page8 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentQuarterlyAssessmentFormPage8(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage8(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Quarterly Assessment Form Page8 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		(new ResidentAssessmentFormService())
				.deleteResidentQuarterlyAssessmentFormPage8((serial));
	}

	public int insertOrUpdateResidentQuarterlyAssessmentFormPage9(
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentQuarterlyAssessmentFormPage9 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Quaterly Assessment Form Page 9";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateResidentQuarterlyAssessmentFormPage9(residentQuarterlyAssessmentFormPage9);
	}

	public ResidentQuarterlyAssessmentFormPage9 getResidentQuarterlyAssessmentFormPage9(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Quarterly Assessment Form Page9 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);

		return ((new ResidentAssessmentFormService())
				.getResidentQuarterlyAssessmentFormPage9(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage9(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Quarterly Assessment Form Page9 ";
		Logger.getInstance().log(LoggerModule.RESIDENT_QUARTERLY_ASSESSMENT,
				action, msg);
		(new ResidentAssessmentFormService())
				.deleteResidentQuarterlyAssessmentFormPage9((serial));
	}

	// / Activitys Record

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateActivitysRecord(medrex.commons
	 * .vo.activity.ActivitysRecord)
	 */
	public int insertOrUpdateActivitysRecord(ActivitysRecord residentPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Activity Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return (new ActivitysRecordService())
				.insertOrUpdateActivitysRecord(residentPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getActivitysRecords(int)
	 */
	public List getActivitysRecords(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Activity Records ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);
		return ((new ActivitysRecordService())
				.getActivitysRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getActivitysRecord(int)
	 */
	public ActivitysRecord getActivitysRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Activity Record ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return (new ActivitysRecordService()).getActivitysRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteActivitysRecord(int)
	 */
	public void deleteActivitysRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Activity Record ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		(new ActivitysRecordService()).deleteActivitysRecord(serial);
	}

	// / MedicationTreatment Form

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationTreatmentForm(
	 * medrex.commons.vo.medication.MedicationTreatmentForm)
	 */
	public int insertOrUpdateMedicationTreatmentForm(
			MedicationTreatmentForm residentPayer) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Treatment Form Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return (new medicationTreatmentFormService())
				.insertOrUpdateMedicationTreatmentForm(residentPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationTreatmentForms(int)
	 */
	public List getMedicationTreatmentForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Medication Treatment Forms Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return ((new medicationTreatmentFormService())
				.getMedicationTreatmentForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationTreatmentForm(int)
	 */
	public MedicationTreatmentForm getMedicationTreatmentForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Treatment Form Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return (new medicationTreatmentFormService())
				.getMedicationTreatmentForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationTreatmentFormCurrentWhere
	 * (int, java.lang.String)
	 */
	public MedicationTreatmentForm getMedicationTreatmentFormCurrentWhere(
			int residentSerial, String type) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Treatment Form Current According to resident serial and Type";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		return ((new medicationTreatmentFormService())
				.getMedicationTreatmentFormCurrentWhere(residentSerial, type));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMedicationTreatmentForm(int)
	 */
	public void deleteMedicationTreatmentForm(long serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Treatment Form ";
		Logger.getInstance().log(LoggerModule.RESIDENT_MEDICATION, action, msg);

		(new medicationTreatmentFormService())
				.deleteMedicationTreatmentForm(serial);
	}

	// / ActivityInitialAssessmentForm Page1

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateActivityInitialAssessmentFormPage1
	 * (medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1)
	 */
	public int insertOrUpdateActivityInitialAssessmentFormPage1(
			ActivityInitialAssessmentFormPage1 rafp1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Activity Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return (new ActivityInitialAssessmentFormService())
				.insertOrUpdateActivityInitialAssessmentFormPage1(rafp1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getActivityInitialAssessmentFormPage1s
	 * (int)
	 */
	public List getActivityInitialAssessmentFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Activity Initial Assessment Form Page1s";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return ((new ActivityInitialAssessmentFormService())
				.getActivityInitialAssessmentFormPage1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getActivityInitialAssessmentFormPage1(int)
	 */
	public ActivityInitialAssessmentFormPage1 getActivityInitialAssessmentFormPage1(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Activity Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return ((new ActivityInitialAssessmentFormService())
				.getActivityInitialAssessmentFormPage1(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteActivityInitialAssessmentFormPage1
	 * (int)
	 */
	public void deleteActivityInitialAssessmentFormPage1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Activity Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		(new ActivityInitialAssessmentFormService())
				.deleteActivityInitialAssessmentFormPage1((serial));
	}

	// ActivityAssessmentFormPage2

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateActivityAssessmentFormPage2
	 * (medrex.commons.vo.activity.ActivityAssessmentFormPage2)
	 */
	public int insertOrUpdateActivityAssessmentFormPage2(
			ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (reflActivityAssessmentFormPage2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Activity Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return (new ActivityAssessmentFormPage2Service())
				.insertOrUpdateActivityAssessmentFormPage2(reflActivityAssessmentFormPage2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getActivityAssessmentFormPage2s(int)
	 */
	public List getActivityAssessmentFormPage2s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Activity Initial Assessment Form Page2s";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return ((new ActivityAssessmentFormPage2Service())
				.getActivityAssessmentFormPage2s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getActivityAssessmentFormPage2(int)
	 */
	public ActivityAssessmentFormPage2 getActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Activity Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		return (new ActivityAssessmentFormPage2Service())
				.getActivityAssessmentFormPage2(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteActivityAssessmentFormPage2(int)
	 */
	public void deleteActivityAssessmentFormPage2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Deleting Activity Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ACTIVITY, action, msg);

		(new ActivityAssessmentFormPage2Service())
				.deleteActivityAssessmentFormPage2(serial);
	}

	// ////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePainManagementRecordFormPage1
	 * (medrex.commons.vo.medication.PainManagementRecordFormPage1)
	 */
	public int insertOrUpdatePainManagementRecordFormPage1(
			PainManagementRecordFormPage1 pmrP1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (pmrP1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pain Management Record Form Page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		return (new PainManagementRecordFormService())
				.insertOrUpdatePainManagementRecordFormPage1(pmrP1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPainManagementRecordFormPage1s(int)
	 */
	public List getPainManagementRecordFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Pain Management Record Form Page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		return ((new PainManagementRecordFormService())
				.getPainManagementRecordFormPage1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPainManagementRecordFormPage1(int)
	 */
	public PainManagementRecordFormPage1 getPainManagementRecordFormPage1(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pain Management Record Form Page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		return ((new PainManagementRecordFormService())
				.getPainManagementRecordFormPage1(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deletePainManagementRecordFormPage1(int)
	 */
	public void deletePainManagementRecordFormPage1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pain Management Record Form Page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		(new PainManagementRecordFormService())
				.deletePainManagementRecordFormPage1(serial);
	}

	public void deletePainManagementRecordFormPage1Row(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pain Management Record Form Page1 Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		(new PainManagementRecordFormService())
				.deletePainManagementRecordFormPage1Row(formId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePainManagementRecordRow(
	 * medrex.commons.vo.medication.PainManagementRecordRow)
	 */
	public int insertOrUpdatePainManagementRecordRow(PainManagementRecordRow psa)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psa != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pain Management Record Form Page1 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		return (new PainManagementRecordFormService())
				.insertOrUpdatePainManagementRecordRow(psa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPainManagementRecordRow(int, int)
	 */
	public PainManagementRecordRow getPainManagementRecordRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pain Management Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PainManagement, action, msg);

		return ((new PainManagementRecordFormService())
				.getPainManagementRecordRow(formId, formNum));
	}

	// Nurses Treatment Notes

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseTreatmentNotesForm(
	 * medrex.commons.vo.medication.NurseTreatmentNotesForm)
	 */
	public int insertOrUpdateNurseTreatmentNotesForm(
			NurseTreatmentNotesForm ntnf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Treatment Notes Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return (new NurseTreatmentNotesFormService())
				.insertOrUpdateNurseTreatmentNotesForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesForms(int)
	 */
	public List getNurseTreatmentNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All Nurses Treatment Notes Forms Records";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesForm(int)
	 */
	public NurseTreatmentNotesForm getNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  Nurse Treatment Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteNurseTreatmentNotesForm(int)
	 */
	public void deleteNurseTreatmentNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nurse Treatment Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		(new NurseTreatmentNotesFormService())
				.deleteNurseTreatmentNotesForm(serial);
	}

	public void deleteNurseMedicationNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nurse  Medication Treatment Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		(new NurseMedicationNotesFormService())
				.deleteNurseMedicationNotesFormRow(formId);
	}

	public void deleteNurseMedicationNotesFormRow1(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nurse  Medication Treatment Form Row1 ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		(new NurseMedicationNotesFormService())
				.deleteNurseMedicationNotesFormRow1(formId);
	}

	public void deleteNurseTreatmentNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nurse Treatment Notes Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		(new NurseTreatmentNotesFormService())
				.deleteNurseTreatmentNotesFormRow(formId);
	}

	public void deleteNurseTreatmentNotesFormRow1(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nurse Treatment Notes Form Row 1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		(new NurseTreatmentNotesFormService())
				.deleteNurseTreatmentNotesFormRow1(formId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseTreatmentNotesFormRow
	 * (medrex.commons.vo.medication.NurseTreatmentNotesFormRow)
	 */
	public int insertOrUpdateNurseTreatmentNotesFormRow(
			NurseTreatmentNotesFormRow ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Treatment Notes Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return (new NurseTreatmentNotesFormService())
				.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseTreatmentNotesFormRow
	 * (java.util.List)
	 */
	public void insertOrUpdateNurseTreatmentNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating List Of Nurse Treatment Notes Form Rows ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		(new NurseTreatmentNotesFormService())
				.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesFormRow(int,
	 * int)
	 */
	public NurseTreatmentNotesFormRow getNurseTreatmentNotesFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  Nurse Treatment Notes Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesFormRows(int)
	 */
	public List getNurseTreatmentNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  List of Nurse Treatment Form Rows ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesFormRows(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseTreatmentNotesFormRow1
	 * (medrex.commons.vo.medication.NurseTreatmentNotesFormRow1)
	 */
	public int insertOrUpdateNurseTreatmentNotesFormRow1(
			NurseTreatmentNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating List Of Nurse Treatment Notes Form Rows1 ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return (new NurseTreatmentNotesFormService())
				.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseTreatmentNotesFormRow1
	 * (java.util.List)
	 */
	public void insertOrUpdateNurseTreatmentNotesFormRow1(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating List Of Nurse Treatment Notes Form Row1 ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		(new NurseTreatmentNotesFormService())
				.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesFormRow1s(int)
	 */
	public List getNurseTreatmentNotesFormRow1s(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  List of Nurse Treatment Form Rows1s ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesFormRow1s(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseTreatmentNotesFormRow1(int,
	 * int)
	 */
	public NurseTreatmentNotesFormRow1 getNurseTreatmentNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  Row of Nurse Treatment Notes Form  ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseTreatmentNotes, action,
				msg);

		return ((new NurseTreatmentNotesFormService())
				.getNurseTreatmentNotesFormRow1(formId, formNum));
	}

	// / Pressure Sore Record Form

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePressureSoreRecordForm(medrex
	 * .commons.vo.medication.PressureSoreRecordForm)
	 */
	public int insertOrUpdatePressureSoreRecordForm(PressureSoreRecordForm psrf)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psrf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pressure Sore Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		return (new PressureSoreRecordFormService())
				.insertOrUpdatePressureSoreRecordForm(psrf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPressureSoreRecordForms(int)
	 */
	public List getPressureSoreRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting  List of All Pressure Sore Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		return ((new PressureSoreRecordFormService())
				.getPressureSoreRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPressureSoreRecordForm(int)
	 */
	public PressureSoreRecordForm getPressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pressure Sore Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		return ((new PressureSoreRecordFormService())
				.getPressureSoreRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePressureSoreRecordForm(int)
	 */
	public void deletePressureSoreRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pressure Sore Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		(new PressureSoreRecordFormService())
				.deletePressureSoreRecordForm(serial);
	}

	public void deletePressureSoreRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pressure Sore Record Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		(new PressureSoreRecordFormService())
				.deletePressureSoreRecordFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePressureSoreRecordFormRow
	 * (medrex.commons.vo.medication.PressureSoreRecordFormRow)
	 */
	public int insertOrUpdatePressureSoreRecordFormRow(
			PressureSoreRecordFormRow psrfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psrfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pressure Sore Record Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		return (new PressureSoreRecordFormService())
				.insertOrUpdatePressureSoreRecordFormRow(psrfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPressureSoreRecordFormRow(int,
	 * int)
	 */
	public PressureSoreRecordFormRow getPressureSoreRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pressure Sore Record Form Row With Respect to Form Id"
				+ formId + "And Form number" + formNum;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_PressureSoreRecordForm,
				action, msg);

		return ((new PressureSoreRecordFormService())
				.getPressureSoreRecordFormRow(formId, formNum));
	}

	// Nurses Medication Notes

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseMedicationNotesForm
	 * (medrex.commons.vo.medication.NurseMedicationNotesForm)
	 */
	public int insertOrUpdateNurseMedicationNotesForm(
			NurseMedicationNotesForm nmnf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (nmnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Medication Notes";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return (new NurseMedicationNotesFormService())
				.insertOrUpdateNurseMedicationNotesForm(nmnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesForms(int)
	 */
	public List getNurseMedicationNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Nurse Medication Notes Forms on resident Serial"
				+ residentSerial;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesForms()
	 */
	public List getNurseMedicationNotesForms() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Nurse Medication Notes Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesForms());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesForm(int)
	 */
	public NurseMedicationNotesForm getNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Nurse Medication Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteNurseMedicationNotesForm(int)
	 */
	public void deleteNurseMedicationNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Nurse Medication Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		(new NurseMedicationNotesFormService())
				.deleteNurseMedicationNotesForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseMedicationNotesFormRow
	 * (medrex.commons.vo.medication.NurseMedicationNotesFormRow)
	 */
	public int insertOrUpdateNurseMedicationNotesFormRow(
			NurseMedicationNotesFormRow ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Medication Notes Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return (new NurseMedicationNotesFormService())
				.insertOrUpdateNurseMedicationNotesFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRow(int,
	 * int)
	 */
	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Nurse Medication Notes Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);
		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRow(int,
	 * int, java.util.Date)
	 */
	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum, Date currentDate) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Nurse Medication Notes Form Row on form Id" + formId
				+ ";form No" + formNum + "And Date" + currentDate;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRow(formId, formNum, currentDate));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRow(int,
	 * java.util.Date)
	 */
	public List getNurseMedicationNotesFormRow(int formId, Date currentDate)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Nurse Medication Notes Form Row on form Id" + formId
				+ "And Date" + currentDate;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);
		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRow(formId, currentDate));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseMedicationNotesFormRow1
	 * (medrex.commons.vo.medication.NurseMedicationNotesFormRow1)
	 */
	public int insertOrUpdateNurseMedicationNotesFormRow1(
			NurseMedicationNotesFormRow1 ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Medication Notes Form Row1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return (new NurseMedicationNotesFormService())
				.insertOrUpdateNurseMedicationNotesFormRow1(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRow1(int,
	 * int)
	 */
	public NurseMedicationNotesFormRow1 getNurseMedicationNotesFormRow1(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Nurse Medication Notes Form Row1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRow1(formId, formNum));
	}

	//

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateMedicationAdministrationRecordForm
	 * (medrex.commons.vo.medication.MedicationAdministrationRecordForm)
	 */
	public int insertOrUpdateMedicationAdministrationRecordForm(
			MedicationAdministrationRecordForm marf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (marf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Administration Record Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		return (new MedicationAdministrationRecordFormService())
				.insertOrUpdateMedicationAdministrationRecordForm(marf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationAdministrationRecordForms
	 * (int)
	 */
	public List getMedicationAdministrationRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Medication Administration Record Forms";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		return ((new MedicationAdministrationRecordFormService())
				.getMedicationAdministrationRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationAdministrationRecordForm(int)
	 */
	public MedicationAdministrationRecordForm getMedicationAdministrationRecordForm(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Administration Record Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		return ((new MedicationAdministrationRecordFormService())
				.getMedicationAdministrationRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteMedicationAdministrationRecordForm
	 * (int)
	 */
	public void deleteMedicationAdministrationRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Administration Record Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		(new MedicationAdministrationRecordFormService())
				.deleteMedicationAdministrationRecordForm(serial);
	}

	public void deleteMedicationAdministrationRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Administration Record Form Column";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		(new MedicationAdministrationRecordFormService())
				.deleteMedicationAdministrationRecordFormCol(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateMedicationAdministrationRecordFormCol
	 * (medrex.commons.vo.medication.MedicationAdministrationRecordFormCol)
	 */
	public int insertOrUpdateMedicationAdministrationRecordFormCol(
			MedicationAdministrationRecordFormCol marfc)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (marfc != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Administration Record Form Column";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		return (new MedicationAdministrationRecordFormService())
				.insertOrUpdateMedicationAdministrationRecordFormCol(marfc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationAdministrationRecordFormCol
	 * (int, int)
	 */
	public MedicationAdministrationRecordFormCol getMedicationAdministrationRecordFormCol(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Administration Record Form Column with respect to Form Id:"
				+ formId + "; Form Num:" + formNum;
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_MEDICATION_MedicationAdministrationRecord,
						action, msg);

		return ((new MedicationAdministrationRecordFormService())
				.getMedicationAdministrationRecordFormCol(formId, formNum));
	}

	// / Medication PRN

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationPRNRecordForm(
	 * medrex.commons.vo.medication.MedicationPRNRecordForm)
	 */
	public int insertOrUpdateMedicationPRNRecordForm(
			MedicationPRNRecordForm mprnrf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication PRN Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		return (new MedicationPRNRecordFormService())
				.insertOrUpdateMedicationPRNRecordForm(mprnrf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationPRNRecordForms(int)
	 */
	public List getMedicationPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Medication PRN Record Form with respect to Resident Serial:"
				+ residentSerial;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);
		return ((new MedicationPRNRecordFormService())
				.getMedicationPRNRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationPRNRecordForm(int)
	 */
	public MedicationPRNRecordForm getMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication PRN Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);
		return ((new MedicationPRNRecordFormService())
				.getMedicationPRNRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMedicationPRNRecordForm(int)
	 */
	public void deleteMedicationPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication PRN Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		(new MedicationPRNRecordFormService())
				.deleteMedicationPRNRecordForm(serial);
	}

	public void deleteMedicationPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication PRN Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		(new MedicationPRNRecordFormService())
				.deleteMedicationPRNRecordFormCol(formId);
	}

	public void deleteMedicationPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication PRN Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		(new MedicationPRNRecordFormService())
				.deleteMedicationPRNRecordFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationPRNRecordFormRow
	 * (medrex.commons.vo.medication.MedicationPRNRecordFormRow)
	 */
	public int insertOrUpdateMedicationPRNRecordFormRow(
			MedicationPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication PRN Record Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);
		return (new MedicationPRNRecordFormService())
				.insertOrUpdateMedicationPRNRecordFormRow(mprnrfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationPRNRecordFormRow(int,
	 * int)
	 */
	public MedicationPRNRecordFormRow getMedicationPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication PRN Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		return ((new MedicationPRNRecordFormService())
				.getMedicationPRNRecordFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationPRNRecordFormCol
	 * (medrex.commons.vo.medication.MedicationPRNRecordFormCol)
	 */
	public int insertOrUpdateMedicationPRNRecordFormCol(
			MedicationPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfc != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication PRN Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		return (new MedicationPRNRecordFormService())
				.insertOrUpdateMedicationPRNRecordFormCol(mprnrfc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationPRNRecordFormCol(int,
	 * int, int)
	 */
	public MedicationPRNRecordFormCol getMedicationPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication PRN Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationPRNRecordForm,
				action, msg);

		return ((new MedicationPRNRecordFormService())
				.getMedicationPRNRecordFormCol(formId, row, col));
	}

	// / Medication Routine

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationRoutineRecordForm
	 * (medrex.commons.vo.medication.MedicationRoutineRecordForm)
	 */
	public int insertOrUpdateMedicationRoutineRecordForm(
			MedicationRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Routine Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);
		return (new MedicationRoutineRecordFormService())
				.insertOrUpdateMedicationRoutineRecordForm(mprnrf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationRoutineRecordForms(int)
	 */
	public List getMedicationRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Medication Routine Record Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return ((new MedicationRoutineRecordFormService())
				.getMedicationRoutineRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMedicationRoutineRecordForm(int)
	 */
	public MedicationRoutineRecordForm getMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Routine Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return ((new MedicationRoutineRecordFormService())
				.getMedicationRoutineRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteMedicationRoutineRecordForm(int)
	 */
	public void deleteMedicationRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Routine Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		(new MedicationRoutineRecordFormService())
				.deleteMedicationRoutineRecordForm(serial);
	}

	public void deleteMedicationRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Routine Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		new MedicationRoutineRecordFormService()
				.deleteMedicationRoutineRecordFormCol(formId);
	}

	public void deleteMedicationRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Routine Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		new MedicationRoutineRecordFormService()
				.deleteMedicationRoutineRecordFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationRoutineRecordFormRow
	 * (medrex.commons.vo.medication.MedicationRoutineRecordFormRow)
	 */
	public int insertOrUpdateMedicationRoutineRecordFormRow(
			MedicationRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Routine Record Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return (new MedicationRoutineRecordFormService())
				.insertOrUpdateMedicationRoutineRecordFormRow(mprnrfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationRoutineRecordFormRow(int,
	 * int)
	 */
	public MedicationRoutineRecordFormRow getMedicationRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Routine Record Form Row wrt FormId:" + formId
				+ "and Form No:" + formNum;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return ((new MedicationRoutineRecordFormService())
				.getMedicationRoutineRecordFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMedicationRoutineRecordFormCol
	 * (medrex.commons.vo.medication.MedicationRoutineRecordFormCol)
	 */
	public int insertOrUpdateMedicationRoutineRecordFormCol(
			MedicationRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfc != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Routine Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return (new MedicationRoutineRecordFormService())
				.insertOrUpdateMedicationRoutineRecordFormCol(mprnrfc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getMedicationRoutineRecordFormCol(int,
	 * int, int)
	 */
	public MedicationRoutineRecordFormCol getMedicationRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Routine Record Form Column wrt FormId:"
				+ formId + "Row:" + row + "Column:" + col;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_MedicationRoutineRecordForm,
				action, msg);

		return ((new MedicationRoutineRecordFormService())
				.getMedicationRoutineRecordFormCol(formId, row, col));
	}

	// / Treatment PRN

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentPRNRecordForm(medrex
	 * .commons.vo.medication.TreatmentPRNRecordForm)
	 */
	public int insertOrUpdateTreatmentPRNRecordForm(
			TreatmentPRNRecordForm mprnrf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment PRN Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return (new TreatmentPRNRecordFormService())
				.insertOrUpdateTreatmentPRNRecordForm(mprnrf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentPRNRecordForms(int)
	 */
	public List getTreatmentPRNRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Treatment PRN Record Form wrt Resident Serial:"
				+ residentSerial;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return ((new TreatmentPRNRecordFormService())
				.getTreatmentPRNRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentPRNRecordForm(int)
	 */
	public TreatmentPRNRecordForm getTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment PRN Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return ((new TreatmentPRNRecordFormService())
				.getTreatmentPRNRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteTreatmentPRNRecordForm(int)
	 */
	public void deleteTreatmentPRNRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment PRN Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		(new TreatmentPRNRecordFormService())
				.deleteTreatmentPRNRecordForm(serial);
	}

	public void deleteTreatmentPRNRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment PRN Record Form Column ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		(new TreatmentPRNRecordFormService())
				.deleteTreatmentPRNRecordFormCol(formId);
	}

	public void deleteTreatmentPRNRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment PRN Record Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		(new TreatmentPRNRecordFormService())
				.deleteTreatmentPRNRecordFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentPRNRecordFormRow
	 * (medrex.commons.vo.medication.TreatmentPRNRecordFormRow)
	 */
	public int insertOrUpdateTreatmentPRNRecordFormRow(
			TreatmentPRNRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment PRN Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return (new TreatmentPRNRecordFormService())
				.insertOrUpdateTreatmentPRNRecordFormRow(mprnrfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentPRNRecordFormRow(int,
	 * int)
	 */
	public TreatmentPRNRecordFormRow getTreatmentPRNRecordFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment PRN Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);
		return ((new TreatmentPRNRecordFormService())
				.getTreatmentPRNRecordFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentPRNRecordFormCol
	 * (medrex.commons.vo.medication.TreatmentPRNRecordFormCol)
	 */
	public int insertOrUpdateTreatmentPRNRecordFormCol(
			TreatmentPRNRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfc != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment PRN Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return (new TreatmentPRNRecordFormService())
				.insertOrUpdateTreatmentPRNRecordFormCol(mprnrfc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentPRNRecordFormCol(int,
	 * int, int)
	 */
	public TreatmentPRNRecordFormCol getTreatmentPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment PRN Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentPRNRecordForm,
				action, msg);

		return ((new TreatmentPRNRecordFormService())
				.getTreatmentPRNRecordFormCol(formId, row, col));
	}

	// / Treatment Routine

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentRoutineRecordForm
	 * (medrex.commons.vo.medication.TreatmentRoutineRecordForm)
	 */
	public int insertOrUpdateTreatmentRoutineRecordForm(
			TreatmentRoutineRecordForm mprnrf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment Routine Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return (new TreatmentRoutineRecordFormService())
				.insertOrUpdateTreatmentRoutineRecordForm(mprnrf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentRoutineRecordForms(int)
	 */
	public List getTreatmentRoutineRecordForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Treatment Routine Record Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return ((new TreatmentRoutineRecordFormService())
				.getTreatmentRoutineRecordForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentRoutineRecordForm(int)
	 */
	public TreatmentRoutineRecordForm getTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment Routine Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return ((new TreatmentRoutineRecordFormService())
				.getTreatmentRoutineRecordForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteTreatmentRoutineRecordForm(int)
	 */
	public void deleteTreatmentRoutineRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment Routine Record Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		(new TreatmentRoutineRecordFormService())
				.deleteTreatmentRoutineRecordForm(serial);
	}

	public void deleteTreatmentRoutineRecordFormCol(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment Routine Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		(new TreatmentRoutineRecordFormService())
				.deleteTreatmentRoutineRecordFormCol(formId);
	}

	public void deleteTreatmentRoutineRecordFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Treatment Routine Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		(new TreatmentRoutineRecordFormService())
				.deleteTreatmentRoutineRecordFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentRoutineRecordFormRow
	 * (medrex.commons.vo.medication.TreatmentRoutineRecordFormRow)
	 */
	public int insertOrUpdateTreatmentRoutineRecordFormRow(
			TreatmentRoutineRecordFormRow mprnrfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment Routine Record Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return (new TreatmentRoutineRecordFormService())
				.insertOrUpdateTreatmentRoutineRecordFormRow(mprnrfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentRoutineRecordFormRow(int,
	 * int)
	 */
	public TreatmentRoutineRecordFormRow getTreatmentRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment Routine Record Form Row with formId: "
				+ formId + "and Form Num:" + formNum;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return ((new TreatmentRoutineRecordFormService())
				.getTreatmentRoutineRecordFormRow(formId, formNum));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateTreatmentRoutineRecordFormCol
	 * (medrex.commons.vo.medication.TreatmentRoutineRecordFormCol)
	 */
	public int insertOrUpdateTreatmentRoutineRecordFormCol(
			TreatmentRoutineRecordFormCol mprnrfc) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (mprnrfc != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Treatment Routine Record Form Column";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return (new TreatmentRoutineRecordFormService())
				.insertOrUpdateTreatmentRoutineRecordFormCol(mprnrfc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getTreatmentRoutineRecordFormCol(int,
	 * int, int)
	 */
	public TreatmentRoutineRecordFormCol getTreatmentRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Treatment Routine Record Form Column with formId: "
				+ formId + "and Row:" + row + "Column:" + col;
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_TreatmentRoutineRecordForm,
				action, msg);

		return ((new TreatmentRoutineRecordFormService())
				.getTreatmentRoutineRecordFormCol(formId, row, col));
	}

	// // Dietary

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietary(medrex.commons.vo
	 * .dietary.Dietary)
	 */
	public int insertOrUpdateDietary(Dietary dietary) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (dietary != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Dietary ";
		Logger.getInstance().log(LoggerModule.RESIDENT_DIETARY, action, msg);
		return (new DietaryService()).insertOrUpdateDietary(dietary);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietarys(int)
	 */
	public List getDietarys(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Dietarys ";
		Logger.getInstance().log(LoggerModule.RESIDENT_DIETARY, action, msg);
		return ((new DietaryService()).getDietarys(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietary(int)
	 */
	public Dietary getDietary(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dietary ";
		Logger.getInstance().log(LoggerModule.RESIDENT_DIETARY, action, msg);

		return ((new DietaryService()).getDietary(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDietary(int)
	 */
	public void deleteDietary(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary ";
		Logger.getInstance().log(LoggerModule.RESIDENT_DIETARY, action, msg);

		(new DietaryService()).deleteDietary(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietaryCommunicationForm
	 * (medrex.commons.vo.dietary.DietaryCommunicationForm)
	 */
	public int insertOrUpdateDietaryCommunicationForm(
			DietaryCommunicationForm dietaryCommunicationForm)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (dietaryCommunicationForm != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Communication Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryCommunicationForm, action,
				msg);

		return (new DietaryCommunicationFormService())
				.insertOrUpdateDietaryCommunicationForm(dietaryCommunicationForm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryCommunicationForms(int)
	 */
	public List getDietaryCommunicationForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting The list of all Dietary Communication Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryCommunicationForm, action,
				msg);

		return ((new DietaryCommunicationFormService())
				.getDietaryCommunicationForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryCommunicationForm(int)
	 */
	public DietaryCommunicationForm getDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dietary Communication Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryCommunicationForm, action,
				msg);

		return ((new DietaryCommunicationFormService())
				.getDietaryCommunicationForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDietaryCommunicationForm(int)
	 */
	public void deleteDietaryCommunicationForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary Communication Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryCommunicationForm, action,
				msg);

		(new DietaryCommunicationFormService())
				.deleteDietaryCommunicationForm(serial);
	}

	// DietaryResidentDiagnosis

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietaryResidentDiagnosis
	 * (medrex.commons.vo.dietary.DietaryResidentDiagnosis)
	 */
	public int insertOrUpdateDietaryResidentDiagnosis(
			DietaryResidentDiagnosis refDietaryResidentDiagnosis)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refDietaryResidentDiagnosis != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Resident Diagnosis Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryResidentDiagnosisForm,
				action, msg);

		return (new DietaryResidentDiagnosisService())
				.insertOrUpdateDietaryResidentDiagnosis(refDietaryResidentDiagnosis);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryResidentDiagnosiss(int)
	 */
	public List getDietaryResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting The list of all Dietary Resident Diagnosis Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryResidentDiagnosisForm,
				action, msg);

		return ((new DietaryResidentDiagnosisService())
				.getDietaryResidentDiagnosiss(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryResidentDiagnosis(int)
	 */
	public DietaryResidentDiagnosis getDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dietary Resident Diagnosis Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryResidentDiagnosisForm,
				action, msg);

		return (new DietaryResidentDiagnosisService())
				.getDietaryResidentDiagnosis(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDietaryResidentDiagnosis(int)
	 */
	public void deleteDietaryResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary Resident Diagnosis Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryResidentDiagnosisForm,
				action, msg);

		(new DietaryResidentDiagnosisService())
				.deleteDietaryResidentDiagnosis(serial);
	}

	// EnteralFeeding

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateEnteralFeeding(medrex.commons
	 * .vo.dietary.EnteralFeeding)
	 */
	public int insertOrUpdateEnteralFeeding(EnteralFeeding refEnteralFeeding)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refEnteralFeeding != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Enternal Feeding Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryEnteralFeedingForm,
				action, msg);

		return (new EnteralFeedingService())
				.insertOrUpdateEnteralFeeding(refEnteralFeeding);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getEnteralFeedings(int)
	 */
	public List getEnteralFeedings(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of all Dietary Enternal Feeding Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryEnteralFeedingForm,
				action, msg);

		return ((new EnteralFeedingService())
				.getEnteralFeedings(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getEnteralFeeding(int)
	 */
	public EnteralFeeding getEnteralFeeding(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dietary Enternal Feeding Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryEnteralFeedingForm,
				action, msg);

		return (new EnteralFeedingService()).getEnteralFeeding(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteEnteralFeeding(int)
	 */
	public void deleteEnteralFeeding(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary Enternal Feeding Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryEnteralFeedingForm,
				action, msg);

		(new EnteralFeedingService()).deleteEnteralFeeding(serial);
	}

	// DietaryPlazaHealth

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietaryPlazaHealth(medrex
	 * .commons.vo.dietary.DietaryPlazaHealth)
	 */
	public int insertOrUpdateDietaryPlazaHealth(
			DietaryPlazaHealth refDietaryPlazaHealth) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refDietaryPlazaHealth != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Plaza Health ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return (new DietaryPlazaHealthService())
				.insertOrUpdateDietaryPlazaHealth(refDietaryPlazaHealth);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryPlazaHealths(int)
	 */
	public List getDietaryPlazaHealths(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of all Dietary Plaza Health Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return ((new DietaryPlazaHealthService())
				.getDietaryPlazaHealths(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryPlazaHealth(int)
	 */
	public DietaryPlazaHealth getDietaryPlazaHealth(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dietary Plaza Health Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return (new DietaryPlazaHealthService()).getDietaryPlazaHealth(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDietaryPlazaHealth(int)
	 */
	public void deleteDietaryPlazaHealth(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary Plaza Health Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		(new DietaryPlazaHealthService()).deleteDietaryPlazaHealth(serial);
	}

	public void deleteDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dietary Plaza Health Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		(new DietaryPlazaHealthService()).deleteDietaryPlazaHealthRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietaryPlazaHealthRow(medrex
	 * .commons.vo.dietary.DietaryPlazaHealthRow)
	 */
	public int insertOrUpdateDietaryPlazaHealthRow(DietaryPlazaHealthRow psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Plaza Health Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return (new DietaryPlazaHealthService())
				.insertOrUpdateDietaryPlazaHealthRow(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDietaryPlazaHealthRows(java
	 * .util.List)
	 */
	public int insertOrUpdateDietaryPlazaHealthRows(List psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Dietary Plaza Health Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return (new DietaryPlazaHealthService())
				.insertOrUpdateDietaryPlazaHealthRows(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryPlazaHealthRows(int)
	 */
	public List getDietaryPlazaHealthRows(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Dietary Plaza Health Form Rows ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return ((new DietaryPlazaHealthService())
				.getDietaryPlazaHealthRows(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDietaryPlazaHealthRow(int)
	 */
	public List getDietaryPlazaHealthRow(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Dietary Plaza Health Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_DIETARY_DietaryPlazaHealths, action, msg);

		return ((new DietaryPlazaHealthService())
				.getDietaryPlazaHealthRow(formId));
	}

	// /////

	// /////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateConsultant(medrex.commons
	 * .vo.consultant.Consultant)
	 */
	public int insertOrUpdateConsultant(Consultant consultant)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (consultant != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Consultants";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT, action, msg);

		return (new ConsultantService()).insertOrUpdateConsultant(consultant);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getConsultants(int)
	 */
	public List getConsultants(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Consultants";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT, action, msg);

		return ((new ConsultantService()).getConsultants(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getConsultant(int)
	 */
	public Consultant getConsultant(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Consultant";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT, action, msg);

		return ((new ConsultantService()).getConsultant(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteConsultant(int)
	 */
	public void deleteConsultant(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "deleting Consultant";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT, action, msg);

		(new ConsultantService()).deleteConsultant(serial);
	}

	// /////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateRenalDialysisCommunicationFormPage1
	 * (medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage1)
	 */
	public int insertOrUpdateRenalDialysisCommunicationFormPage1(
			RenalDialysisCommunicationFormPage1 residentPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Renal Dialysis Communication Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		return (new RenalDialysisCommunicationFormService())
				.insertOrUpdateRenalDialysisCommunicationFormPage1(residentPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getRenalDialysisCommunicationFormPage1s
	 * (int)
	 */
	public List getRenalDialysisCommunicationFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Renal Dialysis Communication Form Page 1";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		return ((new RenalDialysisCommunicationFormService())
				.getRenalDialysisCommunicationFormPage1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getRenalDialysisCommunicationFormPage1
	 * (int)
	 */
	public RenalDialysisCommunicationFormPage1 getRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Renal Dialysis Communication Form Page 1";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		return ((new RenalDialysisCommunicationFormService())
				.getRenalDialysisCommunicationFormPage1(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteRenalDialysisCommunicationFormPage1
	 * (int)
	 */
	public void deleteRenalDialysisCommunicationFormPage1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Renal Dialysis Communication Form Page 1";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		(new RenalDialysisCommunicationFormService())
				.deleteRenalDialysisCommunicationFormPage1(serial);
	}

	// //////////

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateRenalDialysisCommunicationFormPage2
	 * (medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage2)
	 */
	public int insertOrUpdateRenalDialysisCommunicationFormPage2(
			RenalDialysisCommunicationFormPage2 residentPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (residentPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Renal Dialysis Communication Form Page2";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		return (new RenalDialysisCommunicationFormService())
				.insertOrUpdateRenalDialysisCommunicationFormPage2(residentPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getRenalDialysisCommunicationFormPage2
	 * (int)
	 */
	public RenalDialysisCommunicationFormPage2 getRenalDialysisCommunicationFormPage2(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Renal Dialysis Communication Form Page 2";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);
		return ((new RenalDialysisCommunicationFormService())
				.getRenalDialysisCommunicationFormPage2(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteRenalDialysisCommunicationFormPage2
	 * (int)
	 */
	public void deleteRenalDialysisCommunicationFormPage2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Renal Dialysis Communication Form Page 2";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_RenalDialysisCommunicationForm,
						action, msg);

		(new RenalDialysisCommunicationFormService())
				.deleteRenalDialysisCommunicationFormPage2(serial);
	}

	// ////////////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateReferralForm(medrex.commons
	 * .vo.consultant.ReferralForm)
	 */
	public int insertOrUpdateReferralForm(ReferralForm rf)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Referral Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT_ReferralForm,
				action, msg);

		return (new ReferralFormService()).insertOrUpdateReferralForm(rf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReferralForms(int)
	 */
	public List getReferralForms(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Referral Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT_ReferralForm,
				action, msg);

		return ((new ReferralFormService()).getReferralForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReferralForm(int)
	 */
	public ReferralForm getReferralForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Referral Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT_ReferralForm,
				action, msg);
		return ((new ReferralFormService()).getReferralForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteReferralForm(int)
	 */
	public void deleteReferralForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Referral Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_CONSULTANT_ReferralForm,
				action, msg);

		(new ReferralFormService()).deleteReferralForm(serial);
	}

	// ////////////////////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateReportOfConsultationForm
	 * (medrex.commons.vo.consultant.ReportOfConsultationForm)
	 */
	public int insertOrUpdateReportOfConsultationForm(
			ReportOfConsultationForm rf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Report of consultation Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_CONSULTANT_ReportOfConsultationForm,
				action, msg);
		return (new ReportOfConsultationFormService())
				.insertOrUpdateReportOfConsultationForm(rf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReportOfConsultationForms(int)
	 */
	public List getReportOfConsultationForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Report of consultation Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_CONSULTANT_ReportOfConsultationForm,
				action, msg);

		return ((new ReportOfConsultationFormService())
				.getReportOfConsultationForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReportOfConsultationForm(int)
	 */
	public ReportOfConsultationForm getReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Report of consultation Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_CONSULTANT_ReportOfConsultationForm,
				action, msg);

		return ((new ReportOfConsultationFormService())
				.getReportOfConsultationForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteReportOfConsultationForm(int)
	 */
	public void deleteReportOfConsultationForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Report of consultation Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_CONSULTANT_ReportOfConsultationForm,
				action, msg);

		(new ReportOfConsultationFormService())
				.deleteReportOfConsultationForm(serial);
	}

	// ///////////////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePharmacistEvaluationReportForm
	 * (medrex.commons.vo.consultant.PharmacistEvaluationReportForm)
	 */
	public int insertOrUpdatePharmacistEvaluationReportForm(
			PharmacistEvaluationReportForm rf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pharmacist Evaluation Report Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return (new PharmacistEvaluationReportService())
				.insertOrUpdatePharmacistEvaluationReportForm(rf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPharmacistEvaluationReportForms(int)
	 */
	public List getPharmacistEvaluationReportForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Pharmacist Evaluation Report Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return ((new PharmacistEvaluationReportService())
				.getPharmacistEvaluationReportForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPharmacistEvaluationReportForm(int)
	 */
	public PharmacistEvaluationReportForm getPharmacistEvaluationReportForm(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pharmacist Evaluation Report Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return ((new PharmacistEvaluationReportService())
				.getPharmacistEvaluationReportForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deletePharmacistEvaluationReportForm(int)
	 */
	public void deletePharmacistEvaluationReportForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pharmacist Evaluation Report Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		(new PharmacistEvaluationReportService())
				.deletePharmacistEvaluationReportForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdatePharmacistEvaluationReportFormRows(java.util.List)
	 */
	public int insertOrUpdatePharmacistEvaluationReportFormRows(List rfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pharmacist Evaluation Report Form Rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return (new PharmacistEvaluationReportService())
				.insertOrUpdatePharmacistEvaluationReportFormRows(rfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPharmacistEvaluationReportFormRows(int)
	 */
	public List getPharmacistEvaluationReportFormRows(int formid)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Pharmacist Evaluation Report Form Rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return ((new PharmacistEvaluationReportService())
				.getPharmacistEvaluationReportFormRows(formid));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPharmacistEvaluationReportFormRow(int,
	 * int)
	 */
	public PharmacistEvaluationReportFormRow getPharmacistEvaluationReportFormRow(
			int formId, int formNum) throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pharmacist Evaluation Report Form Row";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_CONSULTANT_PharmacistEvaluationReportForm,
						action, msg);

		return ((new PharmacistEvaluationReportService())
				.getPharmacistEvaluationReportFormRow(formId, formNum));
	}

	// //

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateProgressNotes(medrex.commons
	 * .vo.progressNotes.ProgressNotes)
	 */
	public int insertOrUpdateProgressNotes(ProgressNotes activityPayer)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (activityPayer != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Progress Notes Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return (new ProgressNotesService())
				.insertOrUpdateProgressNotes(activityPayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProgressNotess(int)
	 */
	public List getProgressNotess(int activitySerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Progress Notes Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return ((new ProgressNotesService()).getProgressNotess(activitySerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProgressNotes(int)
	 */
	public ProgressNotes getProgressNotes(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Progress Notes ";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return ((new ProgressNotesService()).getProgressNotes(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteProgressNotes(int)
	 */
	public void deleteProgressNotes(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Progress Notes";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		(new ProgressNotesService()).deleteProgressNotes(serial);
	}

	// ///

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDoctorsProgressNotesForm
	 * (medrex.commons.vo.progressNotes.DoctorsProgressNotesForm)
	 */
	public int insertOrUpdateDoctorsProgressNotesForm(
			DoctorsProgressNotesForm ntnf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Doctors Progress Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		return (new DoctorProgressNotesFormService())
				.insertOrUpdateDoctorsProgressNotesForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorProgressNotesForms(int)
	 */
	public List getDoctorProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Doctors Progress Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		return ((new DoctorProgressNotesFormService())
				.getDoctorsProgressNotesForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorProgressNotesForm(int)
	 */
	public DoctorsProgressNotesForm getDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Doctors Progress Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		return ((new DoctorProgressNotesFormService())
				.getDoctorsProgressNotesForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDoctorProgressNotesForm(int)
	 */
	public void deleteDoctorProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Doctors Progress Notes Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		(new DoctorProgressNotesFormService())
				.deleteDoctorsProgressNotesForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDoctorsProgressNotesFormRows
	 * (java.util.List)
	 */
	public int insertOrUpdateDoctorsProgressNotesFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Doctors Progress Notes Form Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		return (new DoctorProgressNotesFormService())
				.insertOrUpdateDoctorsProgressNotesFormRows(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorProgressNotesFormRows(int)
	 */
	public List getDoctorProgressNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of all Doctors Progress Notes Form rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		return ((new DoctorProgressNotesFormService())
				.getDoctorsProgressNotesFormRows(formId));
	}

	// ///

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateInterDisciplinaryProgressNotesForm
	 * (medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesForm)
	 */
	public int insertOrUpdateInterDisciplinaryProgressNotesForm(
			InterDisciplinaryProgressNotesForm ntnf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating InterDisciplinary Progress Notes Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		return (new InterDisciplinaryProgressNotesFormService())
				.insertOrUpdateInterDisciplinaryProgressNotesForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getInterDisciplinaryProgressNotesForms
	 * (int)
	 */
	public List getInterDisciplinaryProgressNotesForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All InterDisciplinary Progress Notes Form ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		return ((new InterDisciplinaryProgressNotesFormService())
				.getInterDisciplinaryProgressNotesForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getInterDisciplinaryProgressNotesForm(int)
	 */
	public InterDisciplinaryProgressNotesForm getInterDisciplinaryProgressNotesForm(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting InterDisciplinary Progress Notes Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		return ((new InterDisciplinaryProgressNotesFormService())
				.getInterDisciplinaryProgressNotesForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteInterDisciplinaryProgressNotesForm
	 * (int)
	 */
	public void deleteInterDisciplinaryProgressNotesForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting InterDisciplinary Progress Notes Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		(new InterDisciplinaryProgressNotesFormService())
				.deleteInterDisciplinaryProgressNotesForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateInterDisciplinaryProgressNotesFormRow(java.util.List)
	 */
	public int insertOrUpdateInterDisciplinaryProgressNotesFormRow(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating InterDisciplinary Progress Notes Form Rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		return (new InterDisciplinaryProgressNotesFormService())
				.insertOrUpdateInterDisciplinaryProgressNotesFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getInterDisciplinaryProgressNotesFormRow
	 * (int)
	 */
	public List getInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All InterDisciplinary Progress Notes Form Rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		return ((new InterDisciplinaryProgressNotesFormService())
				.getInterDisciplinaryProgressNotesFormRows(formId));
	}

	// /////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateHistoryAndPhysical(medrex
	 * .commons.vo.historyAndPhysical.HistoryAndPhysical)
	 */
	public int insertOrUpdateHistoryAndPhysical(HistoryAndPhysical consultant)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (consultant != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical";
		Logger.getInstance().log(LoggerModule.RESIDENT_HISTORYandPHYSICAL,
				action, msg);

		return (new HistoryAndPhysicalService())
				.insertOrUpdateHistoryAndPhysical(consultant);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getHistoryAndPhysicals(int)
	 */
	public List getHistoryAndPhysicals(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All History and physical Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_HISTORYandPHYSICAL,
				action, msg);

		return ((new HistoryAndPhysicalService())
				.getHistoryAndPhysicals(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getHistoryAndPhysical(int)
	 */
	public HistoryAndPhysical getHistoryAndPhysical(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_HISTORYandPHYSICAL,
				action, msg);
		return ((new HistoryAndPhysicalService()).getHistoryAndPhysical(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteHistoryAndPhysical(int)
	 */
	public void deleteHistoryAndPhysical(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_HISTORYandPHYSICAL,
				action, msg);
		(new HistoryAndPhysicalService()).deleteHistoryAndPhysical(serial);
	}

	// ////

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateHistoryAndPhysicalGeneralFormPage1
	 * (medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage1)
	 */
	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage1(
			HistoryAndPhysicalGeneralFormPage1 rafp1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical General form page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		return (new HistoryAndPhysicalGeneralFormService())
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage1(rafp1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getHistoryAndPhysicalGeneralFormPage1s
	 * (int)
	 */
	public List getHistoryAndPhysicalGeneralFormPage1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of History and physical General form page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		return ((new HistoryAndPhysicalGeneralFormService())
				.getHistoryAndPhysicalGeneralFormPage1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getHistoryAndPhysicalGeneralFormPage1(int)
	 */
	public HistoryAndPhysicalGeneralFormPage1 getHistoryAndPhysicalGeneralFormPage1(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical General form page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		return ((new HistoryAndPhysicalGeneralFormService())
				.getHistoryAndPhysicalGeneralFormPage1(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteHistoryAndPhysicalGeneralFormPage1
	 * (int)
	 */
	public void deleteHistoryAndPhysicalGeneralFormPage1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical General form page1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		(new HistoryAndPhysicalGeneralFormService())
				.deleteHistoryAndPhysicalGeneralFormPage1((serial));
	}

	// / HistoryAndPhysicalGeneralForm Page2

	/*
	 * (non-Javadoc)
	 * 
	 * @seemedrex.commons.intf.MedrexIntf#
	 * insertOrUpdateHistoryAndPhysicalGeneralFormPage2
	 * (medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage2)
	 */
	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage2(
			HistoryAndPhysicalGeneralFormPage2 rafp2) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rafp2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical General form page2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		return (new HistoryAndPhysicalGeneralFormService())
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage2(rafp2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getHistoryAndPhysicalGeneralFormPage2(int)
	 */
	public HistoryAndPhysicalGeneralFormPage2 getHistoryAndPhysicalGeneralFormPage2(
			int formId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical General form page2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		return ((new HistoryAndPhysicalGeneralFormService())
				.getHistoryAndPhysicalGeneralFormPage2(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deleteHistoryAndPhysicalGeneralFormPage2
	 * (int)
	 */
	public void deleteHistoryAndPhysicalGeneralFormPage2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical General form page2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_General, action, msg);

		(new HistoryAndPhysicalGeneralFormService())
				.deleteHistoryAndPhysicalGeneralFormPage2((serial));
	}

	// /////
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCumulativeDiagnosisForm(
	 * medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisForm)
	 */
	public int insertOrUpdateCumulativeDiagnosisForm(
			CumulativeDiagnosisForm ntnf) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical Cumulative Diagnosis form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return (new CumulativeDiagnosisFormService())
				.insertOrUpdateCumulativeDiagnosisForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCumulativeDiagnosisForms(int)
	 */
	public List getCumulativeDiagnosisForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a List of History and physical Cumulative Diagnosis forms";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return ((new CumulativeDiagnosisFormService())
				.getCumulativeDiagnosisForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCumulativeDiagnosisForm(int)
	 */
	public CumulativeDiagnosisForm getCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Cumulative Diagnosis form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return ((new CumulativeDiagnosisFormService())
				.getCumulativeDiagnosisForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteCumulativeDiagnosisForm(int)
	 */
	public void deleteCumulativeDiagnosisForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Cumulative Diagnosis form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		(new CumulativeDiagnosisFormService())
				.deleteCumulativeDiagnosisForm(serial);
	}

	public void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Cumulative Diagnosis form Row";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		(new CumulativeDiagnosisFormService())
				.deleteCumulativeDiagnosisFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCumulativeDiagnosisFormRow
	 * (medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow)
	 */
	public int insertOrUpdateCumulativeDiagnosisFormRow(
			CumulativeDiagnosisFormRow ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical Cumulative Diagnosis form Row";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return (new CumulativeDiagnosisFormService())
				.insertOrUpdateCumulativeDiagnosisFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCumulativeDiagnosisFormRow(int,
	 * int)
	 */
	public CumulativeDiagnosisFormRow getCumulativeDiagnosisFormRow(int formId,
			int rowId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Cumulative Diagnosis form Row";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return ((new CumulativeDiagnosisFormService())
				.getCumulativeDiagnosisFormRow(formId, rowId));
	}

	// ////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMonthlyVitalSheetForm(medrex
	 * .commons.vo.historyAndPhysical.MonthlyVitalSheetForm)
	 */
	public int insertOrUpdateMonthlyVitalSheetForm(MonthlyVitalSheetForm ntnf)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in History and physical Monthly Vital Sheet Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return (new MonthlyVitalSheetFormService())
				.insertOrUpdateMonthlyVitalSheetForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMonthlyVitalSheetForms(int)
	 */
	public List getMonthlyVitalSheetForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of History and physical Monthly Vital Sheet Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return ((new MonthlyVitalSheetFormService())
				.getMonthlyVitalSheetForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMonthlyVitalSheetForm(int)
	 */
	public MonthlyVitalSheetForm getMonthlyVitalSheetForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Monthly Vital Sheet Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return ((new MonthlyVitalSheetFormService())
				.getMonthlyVitalSheetForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMonthlyVitalSheetForm(int)
	 */
	public void deleteMonthlyVitalSheetForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Monthly Vital Sheet Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		(new MonthlyVitalSheetFormService())
				.deleteMonthlyVitalSheetForm(serial);
	}

	public void deleteMonthlyVitalSheetFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Monthly Vital Sheet Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		(new MonthlyVitalSheetFormService())
				.deleteMonthlyVitalSheetFormRow(formId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMonthlyVitalSheetFormRow
	 * (medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow)
	 */
	public int insertOrUpdateMonthlyVitalSheetFormRow(
			MonthlyVitalSheetFormRow ntnfr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating History and physical Monthly Vital Sheet Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return (new MonthlyVitalSheetFormService())
				.insertOrUpdateMonthlyVitalSheetFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMonthlyVitalSheetFormRow(int, int)
	 */
	public MonthlyVitalSheetFormRow getMonthlyVitalSheetFormRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Monthly Vital Sheet Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return ((new MonthlyVitalSheetFormService())
				.getMonthlyVitalSheetFormRow(formId, formNum));
	}

	// ////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateWeeklyWeightsForm(medrex
	 * .commons.vo.historyAndPhysical.WeeklyWeightsForm)
	 */
	public int insertOrUpdateWeeklyWeightsForm(WeeklyWeightsForm ntnf)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnf != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating History and physical Weekly Weights Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return (new WeeklyWeightsFormService())
				.insertOrUpdateWeeklyWeightsForm(ntnf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getWeeklyWeightsForms(int)
	 */
	public List getWeeklyWeightsForms(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All History and physical Weekly Weights Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return ((new WeeklyWeightsFormService())
				.getWeeklyWeightsForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getWeeklyWeightsForm(int)
	 */
	public WeeklyWeightsForm getWeeklyWeightsForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting History and physical Weekly Weights Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return ((new WeeklyWeightsFormService()).getWeeklyWeightsForm(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteWeeklyWeightsForm(int)
	 */
	public void deleteWeeklyWeightsForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Weekly Weights Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);
		(new WeeklyWeightsFormService()).deleteWeeklyWeightsForm(serial);
	}

	public void deleteWeeklyWeightsFormRow(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting History and physical Weekly Weights Form Row ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		(new WeeklyWeightsFormService()).deleteWeeklyWeightsFormRow(formId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateWeeklyWeightsFormRow(medrex
	 * .commons.vo.historyAndPhysical.WeeklyWeightsFormRow)
	 */
	public int insertOrUpdateWeeklyWeightsFormRow(WeeklyWeightsFormRow ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating History and physical Weekly Weights Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return (new WeeklyWeightsFormService())
				.insertOrUpdateWeeklyWeightsFormRow(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getWeeklyWeightsFormRow(int, int)
	 */
	public WeeklyWeightsFormRow getWeeklyWeightsFormRow(int formId, int formNum)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		msg = "Getting History and physical Weekly Weights Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return ((new WeeklyWeightsFormService()).getWeeklyWeightsFormRow(
				formId, formNum));
	}

	// ///////////////////////////////modified///////////////////

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateWeeklyWeightsFormRows(java
	 * .util.List)
	 */
	public int insertOrUpdateWeeklyWeightsFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating List of History and physical Weekly Weights Form Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return (new WeeklyWeightsFormService())
				.insertOrUpdateWeeklyWeightsFormRows(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getWeeklyWeightsFormRows(int)
	 */
	public List getWeeklyWeightsFormRows(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of History and physical Weekly Weights Form Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_WeeklyWeightsForm,
				action, msg);

		return ((new WeeklyWeightsFormService())
				.getWeeklyWeightsFormRows(formId));
	}

	// /////////////////////////////////////////////////////////////

	// Lab Special

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateLabSpecial(medrex.commons
	 * .vo.labSpecial.LabSpecial)
	 */
	public int insertOrUpdateLabSpecial(LabSpecial labSpecial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (labSpecial != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Lab Special";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL, action, msg);

		return (new LabSpecialService()).insertOrUpdateLabSpecial(labSpecial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getLabSpecials(int)
	 */
	public List getLabSpecials(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Lab Specials";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL, action, msg);

		return ((new LabSpecialService()).getLabSpecials(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getLabSpecial(int)
	 */
	public LabSpecial getLabSpecial(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Lab Special";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL, action, msg);

		return (new LabSpecialService()).getLabSpecial(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteLabSpecial(int)
	 */
	public void deleteLabSpecial(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Lab Special";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL, action, msg);

		(new LabSpecialService()).deleteLabSpecial(serial);
	}

	// Reason For Study

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateReasonForStudy(medrex.commons
	 * .vo.labSpecial.ReasonForStudy)
	 */
	public int insertOrUpdateReasonForStudy(ReasonForStudy rfStudy)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rfStudy != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Lab Special-Reason for study Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_LABSPECIAL_ReasonForStudyForm, action,
				msg);
		return (new ReasonForStudyService())
				.insertOrUpdateReasonForStudy(rfStudy);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReasonForStudys(int)
	 */
	public List getReasonForStudys(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Lab Special-Reason for study Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_LABSPECIAL_ReasonForStudyForm, action,
				msg);

		return ((new ReasonForStudyService())
				.getReasonForStudys(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getReasonForStudy(int)
	 */
	public ReasonForStudy getReasonForStudy(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Lab Special-Reason for study Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_LABSPECIAL_ReasonForStudyForm, action,
				msg);

		return (new ReasonForStudyService()).getReasonForStudy(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteReasonForStudy(int)
	 */
	public void deleteReasonForStudy(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Lab Special-Reason for study Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_LABSPECIAL_ReasonForStudyForm, action,
				msg);
		(new ReasonForStudyService()).deleteReasonForStudy(serial);
	}

	// madexform1

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMadexForm1(medrex.commons
	 * .vo.labSpecial.MadexForm1)
	 */
	public int insertOrUpdateMadexForm1(MadexForm1 refMadexForm1)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refMadexForm1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Lab Special-MedFax Form1";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm1,
				action, msg);

		return (new MadexForm1Service())
				.insertOrUpdateMadexForm1(refMadexForm1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMadexForm1s(int)
	 */
	public List getMadexForm1s(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Lab Special-MedFax Form1";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm1,
				action, msg);

		return ((new MadexForm1Service()).getMadexForm1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMadexForm1(int)
	 */
	public MadexForm1 getMadexForm1(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Lab Special-MedFax Form1";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm1,
				action, msg);

		return (new MadexForm1Service()).getMadexForm1(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMadexForm1(int)
	 */
	public void deleteMadexForm1(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Lab Special-MedFax Form1";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm1,
				action, msg);

		(new MadexForm1Service()).deleteMadexForm1(serial);
	}

	// Madex Form 2

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMadexForm2(medrex.commons
	 * .vo.labSpecial.MadexForm2)
	 */
	public int insertOrUpdateMadexForm2(MadexForm2 refMadexForm2)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refMadexForm2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Lab Special-MedFax Form2";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm2,
				action, msg);

		return (new MadexForm2Service())
				.insertOrUpdateMadexForm2(refMadexForm2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMadexForm2s(int)
	 */
	public List getMadexForm2s(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Lab Special-MedFax Form2";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm2,
				action, msg);

		return ((new MadexForm2Service()).getMadexForm2s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMadexForm2(int)
	 */
	public MadexForm2 getMadexForm2(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Lab Special-MedFax Form2";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm2,
				action, msg);

		return (new MadexForm2Service()).getMadexForm2(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMadexForm2(int)
	 */
	public void deleteMadexForm2(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Lab Special-MedFax Form2";
		Logger.getInstance().log(LoggerModule.RESIDENT_LABSPECIAL_MedFaxForm2,
				action, msg);
		(new MadexForm2Service()).deleteMadexForm2(serial);
	}

	// Physician Orders

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrder(medrex.commons
	 * .vo.physicianOrders.PhysicianOrders)
	 */
	public int insertOrUpdatePhysicianOrder(PhysicianOrders physicianOrders)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (physicianOrders != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Phsycian Order";
		Logger.getInstance().log(LoggerModule.RESIDENT_PHYSICIANORDER, action,
				msg);

		return (new PhysicianOrdersService())
				.insertOrUpdatePhysicianOrder(physicianOrders);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrders(int)
	 */
	public List getPhysicianOrders(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Phsycian Orders";
		Logger.getInstance().log(LoggerModule.RESIDENT_PHYSICIANORDER, action,
				msg);

		return ((new PhysicianOrdersService())
				.getPhysicianOrders(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrder(int)
	 */
	public PhysicianOrders getPhysicianOrder(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Phsycian Order";
		Logger.getInstance().log(LoggerModule.RESIDENT_PHYSICIANORDER, action,
				msg);

		return (new PhysicianOrdersService()).getPhysicianOrder(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianOrder(int)
	 */
	public void deletePhysicianOrder(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Phsycian Orders";
		Logger.getInstance().log(LoggerModule.RESIDENT_PHYSICIANORDER, action,
				msg);

		(new PhysicianOrdersService()).deletePhysicianOrder(serial);
	}

	// PhysicianPlazaHealthCare

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianPlazaHealthCare
	 * (medrex.commons.vo.physicianOrders.PhysicianPlazaHealthCare)
	 */
	public int insertOrUpdatePhysicianPlazaHealthCare(
			PhysicianPlazaHealthCare refPhysicianPlazaHealthCare)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianPlazaHealthCare != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Plaza Health Care Form ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianPlazaHealthCareForm,
						action, msg);

		return (new PhysicianPlazaHealthCareService())
				.insertOrUpdatePhysicianPlazaHealthCare(refPhysicianPlazaHealthCare);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianPlazaHealthCares(int)
	 */
	public List getPhysicianPlazaHealthCares(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Physician Plaza Health Care Forms ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianPlazaHealthCareForm,
						action, msg);

		return ((new PhysicianPlazaHealthCareService())
				.getPhysicianPlazaHealthCares(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianPlazaHealthCare(int)
	 */
	public PhysicianPlazaHealthCare getPhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Plaza Health Care Form ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianPlazaHealthCareForm,
						action, msg);

		return (new PhysicianPlazaHealthCareService())
				.getPhysicianPlazaHealthCare(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianPlazaHealthCare(int)
	 */
	public void deletePhysicianPlazaHealthCare(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Plaza Health Care Form ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianPlazaHealthCareForm,
						action, msg);

		(new PhysicianPlazaHealthCareService())
				.deletePhysicianPlazaHealthCare(serial);
	}

	// PhysicianInfusion

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianInfusion(medrex
	 * .commons.vo.physicianOrders.PhysicianInfusion)
	 */
	public int insertOrUpdatePhysicianInfusion(
			PhysicianInfusion refPhysicianInfusion) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianInfusion != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Infusion Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianInfusionForm,
				action, msg);

		return (new PhysicianInfusionService())
				.insertOrUpdatePhysicianInfusion(refPhysicianInfusion);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianInfusions(int)
	 */
	public List getPhysicianInfusions(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of all Physician Infusion Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianInfusionForm,
				action, msg);

		return ((new PhysicianInfusionService())
				.getPhysicianInfusions(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianInfusion(int)
	 */
	public PhysicianInfusion getPhysicianInfusion(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Infusion Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianInfusionForm,
				action, msg);

		return (new PhysicianInfusionService()).getPhysicianInfusion(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianInfusion(int)
	 */
	public void deletePhysicianInfusion(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Infusion Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianInfusionForm,
				action, msg);

		(new PhysicianInfusionService()).deletePhysicianInfusion(serial);
	}

	// ResidentImmunizationRecord

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentImmunizationRecord
	 * (medrex.commons.vo.historyAndPhysical.ResidentImmunizationRecord)
	 */
	public int insertOrUpdateResidentImmunizationRecord(
			ResidentImmunizationRecord refResidentImmunizationRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentImmunizationRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Resident Immunization Record Form ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_ResidentImmunizationRecordForm,
						action, msg);

		return (new ResidentImmunizationRecordService())
				.insertOrUpdateResidentImmunizationRecord(refResidentImmunizationRecord);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentImmunizationRecords(int)
	 */
	public List getResidentImmunizationRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Physician Resident Immunization Record Forms ";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_ResidentImmunizationRecordForm,
						action, msg);

		return ((new ResidentImmunizationRecordService())
				.getResidentImmunizationRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentImmunizationRecord(int)
	 */
	public ResidentImmunizationRecord getResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Resident Immunization Record Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_ResidentImmunizationRecordForm,
						action, msg);

		return (new ResidentImmunizationRecordService())
				.getResidentImmunizationRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentImmunizationRecord(int)
	 */
	public void deleteResidentImmunizationRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Resident Immunization Record Form";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PHYSICIANORDER_ResidentImmunizationRecordForm,
						action, msg);
		(new ResidentImmunizationRecordService())
				.deleteResidentImmunizationRecord(serial);
	}

	// Physician Speciality form

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianSpeciality(medrex
	 * .commons.vo.physicianOrders.PhysicianSpeciality)
	 */
	public int insertOrUpdatePhysicianSpeciality(PhysicianSpeciality ps)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ps != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Speciality Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		return (new PhysicianSpecialityService())
				.insertOrUpdatePhysicianSpeciality(ps);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianSpecialitys(int)
	 */
	public List getPhysicianSpecialitys(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Physician Speciality Forms ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		return ((new PhysicianSpecialityService())
				.getPhysicianSpecialitys(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianSpeciality(int)
	 */
	public PhysicianSpeciality getPhysicianSpeciality(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Speciality Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		return ((new PhysicianSpecialityService())
				.getPhysicianSpeciality(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianSpeciality(int)
	 */
	public void deletePhysicianSpeciality(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Speciality Form ";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		(new PhysicianSpecialityService()).deletePhysicianSpeciality(serial);
	}

	// for physician speciality row

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianSpecialityRow(medrex
	 * .commons.vo.physicianOrders.PhysicianSpecialityRow)
	 */
	public int insertOrUpdatePhysicianSpecialityRow(PhysicianSpecialityRow psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Speciality Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		return (new PhysicianSpecialityService())
				.insertOrUpdatePhysicianSpecialityRow(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianSpecialityRow(int, int)
	 */
	public PhysicianSpecialityRow getPhysicianSpecialityRow(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Speciality Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianSpecialityForm,
				action, msg);

		return ((new PhysicianSpecialityService()).getPhysicianSpecialityRow(
				formId, formNum));
	}

	// Physician Order Form1

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm1(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm1)
	 */
	public int insertOrUpdatePhysicianOrderForm1(
			PhysicianOrderForm1 refPhysicianOrderForm1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianOrderForm1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);
		return (new PhysicianOrderForm1Service())
				.insertOrUpdatePhysicianOrderForm1(refPhysicianOrderForm1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm1s(int)
	 */
	public List getPhysicianOrderForm1s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Physician Order Form1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		return ((new PhysicianOrderForm1Service())
				.getPhysicianOrderForm1s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm1(int)
	 */
	public PhysicianOrderForm1 getPhysicianOrderForm1(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Order Form1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		return (new PhysicianOrderForm1Service())
				.getPhysicianOrderForm1(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianOrderForm1(int)
	 */
	public void deletePhysicianOrderForm1(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Order Form1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		(new PhysicianOrderForm1Service()).deletePhysicianOrderForm1(serial);
	}

	public void deletePhysicianOrderForm1Row(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Order Form1 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		(new PhysicianOrderForm1Service()).deletePhysicianOrderForm1Row(formId);
	}

	// for physician order form1 row

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm1Row(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm1Row)
	 */
	public int insertOrUpdatePhysicianOrderForm1Row(PhysicianOrderForm1Row psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form1 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		return (new PhysicianOrderForm1Service())
				.insertOrUpdatePhysicianOrderForm1Row(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm1Row(int, int)
	 */
	public PhysicianOrderForm1Row getPhysicianOrderForm1Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Order Form1 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm1,
				action, msg);

		return ((new PhysicianOrderForm1Service()).getPhysicianOrderForm1Row(
				formId, formNum));
	}

	// PhysicianOrderForm2

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm2(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm2)
	 */
	public int insertOrUpdatePhysicianOrderForm2(
			PhysicianOrderForm2 refPhysicianOrderForm2) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianOrderForm2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);

		return (new PhysicianOrderForm2Service())
				.insertOrUpdatePhysicianOrderForm2(refPhysicianOrderForm2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm2s(int)
	 */
	public List getPhysicianOrderForm2s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting A List of All Physician Order Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);

		return ((new PhysicianOrderForm2Service())
				.getPhysicianOrderForm2s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm2(int)
	 */
	public PhysicianOrderForm2 getPhysicianOrderForm2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Order Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);

		return (new PhysicianOrderForm2Service())
				.getPhysicianOrderForm2(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianOrderForm2(int)
	 */
	public void deletePhysicianOrderForm2(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Order Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);

		(new PhysicianOrderForm2Service()).deletePhysicianOrderForm2(serial);
	}

	public void deletePhysicianOrderForm2Row(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Order Form2 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);

		(new PhysicianOrderForm2Service()).deletePhysicianOrderForm2Row(formId);
	}

	// for physician order form2 row

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm2Row(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm2Row)
	 */
	public int insertOrUpdatePhysicianOrderForm2Row(PhysicianOrderForm2Row psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form2 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);
		return (new PhysicianOrderForm2Service())
				.insertOrUpdatePhysicianOrderForm2Row(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm2Row(int, int)
	 */
	public PhysicianOrderForm2Row getPhysicianOrderForm2Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Gettting Physician Order Form2 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm2,
				action, msg);
		return ((new PhysicianOrderForm2Service()).getPhysicianOrderForm2Row(
				formId, formNum));
	}

	// PhysicianOrderForm3

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm3(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm3)
	 */
	public int insertOrUpdatePhysicianOrderForm3(
			PhysicianOrderForm3 refPhysicianOrderForm3) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianOrderForm3 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form3";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		return (new PhysicianOrderForm3Service())
				.insertOrUpdatePhysicianOrderForm3(refPhysicianOrderForm3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3s(int)
	 */
	public List getPhysicianOrderForm3s(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Gettting List of Physician Order Form3";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);
		return ((new PhysicianOrderForm3Service())
				.getPhysicianOrderForm3s(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3s()
	 */
	public List getPhysicianOrderForm3s() throws MedrexException,
			RemoteException {
		return ((new PhysicianOrderForm3Service()).getPhysicianOrderForm3s());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3(int)
	 */
	public PhysicianOrderForm3 getPhysicianOrderForm3(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Gettting Physician Order Form3";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		return (new PhysicianOrderForm3Service())
				.getPhysicianOrderForm3(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianOrderForm3(int)
	 */
	public void deletePhysicianOrderForm3(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Deleting Physician Order Form3";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		(new PhysicianOrderForm3Service()).deletePhysicianOrderForm3(serial);
	}

	public void deletePhysicianOrderForm3Row(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Physician Order Form3 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		(new PhysicianOrderForm3Service()).deletePhysicianOrderForm3Row(formId);
	}

	// for physician order form3 row

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm3Row(medrex
	 * .commons.vo.physicianOrders.PhysicianOrderForm3Row)
	 */
	public int insertOrUpdatePhysicianOrderForm3Row(PhysicianOrderForm3Row psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form3 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		return (new PhysicianOrderForm3Service())
				.insertOrUpdatePhysicianOrderForm3Row(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePhysicianOrderForm3Rows(
	 * java.util.List)
	 */
	public int insertOrUpdatePhysicianOrderForm3Rows(List psr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (psr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Physician Order Form3 Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		return (new PhysicianOrderForm3Service())
				.insertOrUpdatePhysicianOrderForm3Rows(psr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3Row(int, int)
	 */
	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Gettting Physician Order Form3 Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);

		return ((new PhysicianOrderForm3Service()).getPhysicianOrderForm3Row(
				formId, formNum));
	}

	// PtOtSt ------------------------------------------------------------- //
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtSt(medrex.commons.vo
	 * .ptOtSt.PtOtSt)
	 */
	public int insertOrUpdatePtOtSt(PtOtSt ptOtSt) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ptOtSt != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Speech Act";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT, action, msg);

		return (new PtOtStService()).insertOrUpdatePtOtSt(ptOtSt);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtSts(int)
	 */
	public List getPtOtSts(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All OTPT Speech Act Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT, action, msg);

		return ((new PtOtStService()).getPtOtSts(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtSt(int)
	 */
	public PtOtSt getPtOtSt(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Act Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT, action, msg);

		return (new PtOtStService()).getPtOtSt(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtSt(int)
	 */
	public void deletePtOtSt(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Speech Act Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT, action, msg);

		(new PtOtStService()).deletePtOtSt(serial);
	}

	// PtOtStOccupationalDailyRecord
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStOccupationalDailyRecord
	 * (medrex.commons.vo.ptOtSt.PtOtStOccupationalDailyRecord)
	 */
	public int insertOrUpdatePtOtStOccupationalDailyRecord(
			PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStOccupationalDailyRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Speech Occupational Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		return (new PtOtStOccupationalDailyRecordService())
				.insertOrUpdatePtOtStOccupationalDailyRecord(refPtOtStOccupationalDailyRecord);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getPtOtStOccupationalDailyRecords(int)
	 */
	public List getPtOtStOccupationalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting A List of All OTPT Speech Occupational Records";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		return ((new PtOtStOccupationalDailyRecordService())
				.getPtOtStOccupationalDailyRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStOccupationalDailyRecord(int)
	 */
	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecord(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Occupational Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		return (new PtOtStOccupationalDailyRecordService())
				.getPtOtStOccupationalDailyRecord(serial);
	}

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecordByDate(
			Date date) throws RemoteException, MedrexException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Occupational Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		return (new PtOtStOccupationalDailyRecordService())
				.getPtOtStOccupationalDailyRecordByDate(date);
	}

	public int getKeyByDate(Date cal) throws RemoteException, MedrexException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Occupational Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		return (new PtOtStOccupationalDailyRecordService()).getKeyByDate(cal);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSpeechDailyKeyByDate(Date)
	 */
	public int getSpeechDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Daily Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_SpeechDailyRecordForm, action, msg);

		return (new PtOtStSpeechDailyRecordService())
				.getSpeechDailyKeyByDate(cal);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deletePtOtStOccupationalDailyRecord(int)
	 */
	public void deletePtOtStOccupationalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Speech Occupational Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_OccupationalDailyRecordForm, action,
				msg);

		(new PtOtStOccupationalDailyRecordService())
				.deletePtOtStOccupationalDailyRecord(serial);
	}

	// PtOtStOccupationalTherapy
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStOccupationalTherapy
	 * (medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy)
	 */
	public int insertOrUpdatePtOtStOccupationalTherapy(
			PtOtStOccupationalTherapy refPtOtStOccupationalTherapy)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStOccupationalTherapy != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Speech Occupational Therapy Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_OccupationalTherapyForm,
						action, msg);

		return (new PtOtStOccupationalTherapyService())
				.insertOrUpdatePtOtStOccupationalTherapy(refPtOtStOccupationalTherapy);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStOccupationalTherapys(int)
	 */
	public List getPtOtStOccupationalTherapys(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Speech Occupational Therapy Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_OccupationalTherapyForm,
						action, msg);

		return ((new PtOtStOccupationalTherapyService())
				.getPtOtStOccupationalTherapys(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStOccupationalTherapy(int)
	 */
	public PtOtStOccupationalTherapy getPtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Occupational Therapy Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_OccupationalTherapyForm,
						action, msg);

		return (new PtOtStOccupationalTherapyService())
				.getPtOtStOccupationalTherapy(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStOccupationalTherapy(int)
	 */
	public void deletePtOtStOccupationalTherapy(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Speech Occupational Therapy Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_OccupationalTherapyForm,
						action, msg);

		(new PtOtStOccupationalTherapyService())
				.deletePtOtStOccupationalTherapy(serial);
	}

	// PtOtStPhysicalDailyRecord
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStPhysicalDailyRecord
	 * (medrex.commons.vo.ptOtSt.PtOtStPhysicalDailyRecord)
	 */
	public int insertOrUpdatePtOtStPhysicalDailyRecord(
			PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStPhysicalDailyRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Physical Daily Record Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_PhysicalDailyRecordForm,
						action, msg);

		return (new PtOtStPhysicalDailyRecordService())
				.insertOrUpdatePtOtStPhysicalDailyRecord(refPtOtStPhysicalDailyRecord);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPhysicalDailyRecords(int)
	 */
	public List getPtOtStPhysicalDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Physical Daily Record Forms";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_PhysicalDailyRecordForm,
						action, msg);

		return ((new PtOtStPhysicalDailyRecordService())
				.getPtOtStPhysicalDailyRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPhysicalDailyRecord(int)
	 */
	public PtOtStPhysicalDailyRecord getPtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Physical Daily Record Form";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_PhysicalDailyRecordForm,
						action, msg);

		return (new PtOtStPhysicalDailyRecordService())
				.getPtOtStPhysicalDailyRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStPhysicalDailyRecord(int)
	 */
	public void deletePtOtStPhysicalDailyRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Physical Daily Record Forms";
		Logger.getInstance()
				.log(LoggerModule.RESIDENT_OTPT_PhysicalDailyRecordForm,
						action, msg);

		(new PtOtStPhysicalDailyRecordService())
				.deletePtOtStPhysicalDailyRecord(serial);
	}

	// PtOtStPhysicalTheray
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStPhysicalTheray(medrex
	 * .commons.vo.ptOtSt.PtOtStPhysicalTheray)
	 */
	public int insertOrUpdatePtOtStPhysicalTheray(
			PtOtStPhysicalTheray refPtOtStPhysicalTheray)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStPhysicalTheray != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Physical Therapy Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PhysicalTherapyForm, action, msg);
		return (new PtOtStPhysicalTherayService())
				.insertOrUpdatePtOtStPhysicalTheray(refPtOtStPhysicalTheray);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPhysicalTherays(int)
	 */
	public List getPtOtStPhysicalTherays(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Physical Therapy Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PhysicalTherapyForm, action, msg);

		return ((new PtOtStPhysicalTherayService())
				.getPtOtStPhysicalTherays(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPhysicalTheray(int)
	 */
	public PtOtStPhysicalTheray getPtOtStPhysicalTheray(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Physical Therapy Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PhysicalTherapyForm, action, msg);

		return (new PtOtStPhysicalTherayService())
				.getPtOtStPhysicalTheray(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStPhysicalTheray(int)
	 */
	public void deletePtOtStPhysicalTheray(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Deleting OTPT Physical Therapy Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PhysicalTherapyForm, action, msg);

		(new PtOtStPhysicalTherayService()).deletePtOtStPhysicalTheray(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStPhysicalTheray(int)
	 */
	public PtOtStPhysicalTheray getExistingPhysicalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Get Existing OTPT Physical Therapy Form 700";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PhysicalTherapyForm, action, msg);

		return (new PtOtStPhysicalTherayService())
				.getExistingPhysicalTherapyForm700(fromDate, toDate);
	}

	// PtOtStPositioningEvaluation
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStPositioningEvaluation
	 * (medrex.commons.vo.ptOtSt.PtOtStPositioningEvaluation)
	 */
	public int insertOrUpdatePtOtStPositioningEvaluation(
			PtOtStPositioningEvaluation refPtOtStPositioningEvaluation)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStPositioningEvaluation != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Positioning Evaluation Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PositioningEvaluationForm, action,
				msg);

		return (new PtOtStPositioningEvaluationService())
				.insertOrUpdatePtOtStPositioningEvaluation(refPtOtStPositioningEvaluation);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPositioningEvaluations(int)
	 */
	public List getPtOtStPositioningEvaluations(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting A List Of OTPT Positioning Evaluation Forms";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PositioningEvaluationForm, action,
				msg);

		return ((new PtOtStPositioningEvaluationService())
				.getPtOtStPositioningEvaluations(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStPositioningEvaluation(int)
	 */
	public PtOtStPositioningEvaluation getPtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Positioning Evaluation Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PositioningEvaluationForm, action,
				msg);

		return (new PtOtStPositioningEvaluationService())
				.getPtOtStPositioningEvaluation(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#deletePtOtStPositioningEvaluation(int)
	 */
	public void deletePtOtStPositioningEvaluation(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Deleting OTPT Positioning Evaluation Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_PositioningEvaluationForm, action,
				msg);

		(new PtOtStPositioningEvaluationService())
				.deletePtOtStPositioningEvaluation(serial);
	}

	// PtOtStRehabCarePlan
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStRehabCarePlan(medrex
	 * .commons.vo.ptOtSt.PtOtStRehabCarePlan)
	 */
	public int insertOrUpdatePtOtStRehabCarePlan(
			PtOtStRehabCarePlan refPtOtStRehabCarePlan) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStRehabCarePlan != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Rehab Care Plan Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_RehabCarePlanForm,
				action, msg);
		return (new PtOtStRehabCarePlanService())
				.insertOrUpdatePtOtStRehabCarePlan(refPtOtStRehabCarePlan);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStRehabCarePlans(int)
	 */
	public List getPtOtStRehabCarePlans(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a list of OTPT Rehab Care Plan Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_RehabCarePlanForm,
				action, msg);

		return ((new PtOtStRehabCarePlanService())
				.getPtOtStRehabCarePlans(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStRehabCarePlan(int)
	 */
	public PtOtStRehabCarePlan getPtOtStRehabCarePlan(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Rehab Care Plan Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_RehabCarePlanForm,
				action, msg);

		return (new PtOtStRehabCarePlanService())
				.getPtOtStRehabCarePlan(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStRehabCarePlan(int)
	 */
	public void deletePtOtStRehabCarePlan(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Rehab Care Plan Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_RehabCarePlanForm,
				action, msg);

		(new PtOtStRehabCarePlanService()).deletePtOtStRehabCarePlan(serial);
	}

	// PtOtStSpeechDailyRecord
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStSpeechDailyRecord(
	 * medrex.commons.vo.ptOtSt.PtOtStSpeechDailyRecord)
	 */
	public int insertOrUpdatePtOtStSpeechDailyRecord(
			PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStSpeechDailyRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Speech Daily Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_SpeechDailyRecordForm, action, msg);
		return (new PtOtStSpeechDailyRecordService())
				.insertOrUpdatePtOtStSpeechDailyRecord(refPtOtStSpeechDailyRecord);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStSpeechDailyRecords(int)
	 */
	public List getPtOtStSpeechDailyRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Speech Daily Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_SpeechDailyRecordForm, action, msg);

		return ((new PtOtStSpeechDailyRecordService())
				.getPtOtStSpeechDailyRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStSpeechDailyRecord(int)
	 */
	public PtOtStSpeechDailyRecord getPtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Daily Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_SpeechDailyRecordForm, action, msg);

		return (new PtOtStSpeechDailyRecordService())
				.getPtOtStSpeechDailyRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStSpeechDailyRecord(int)
	 */
	public void deletePtOtStSpeechDailyRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Speech Daily Record Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_SpeechDailyRecordForm, action, msg);

		(new PtOtStSpeechDailyRecordService())
				.deletePtOtStSpeechDailyRecord(serial);
	}

	// PtOtStSpeechLanguage
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStSpeechLanguage(medrex
	 * .commons.vo.ptOtSt.PtOtStSpeechLanguage)
	 */
	public int insertOrUpdatePtOtStSpeechLanguage(
			PtOtStSpeechLanguage refPtOtStSpeechLanguage)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStSpeechLanguage != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Speech Language Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_SpeechLanguageForm,
				action, msg);

		return (new PtOtStSpeechLanguageService())
				.insertOrUpdatePtOtStSpeechLanguage(refPtOtStSpeechLanguage);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStSpeechLanguages(int)
	 */
	public List getPtOtStSpeechLanguages(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Speech Language Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_SpeechLanguageForm,
				action, msg);

		return ((new PtOtStSpeechLanguageService())
				.getPtOtStSpeechLanguages(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStSpeechLanguage(int)
	 */
	public PtOtStSpeechLanguage getPtOtStSpeechLanguage(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Speech Language Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_SpeechLanguageForm,
				action, msg);

		return (new PtOtStSpeechLanguageService())
				.getPtOtStSpeechLanguage(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStSpeechLanguage(int)
	 */
	public void deletePtOtStSpeechLanguage(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Speech Language Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_SpeechLanguageForm,
				action, msg);

		(new PtOtStSpeechLanguageService()).deletePtOtStSpeechLanguage(serial);
	}

	// PtOtStTherapyPhysical
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStTherapyPhysical(medrex
	 * .commons.vo.ptOtSt.PtOtStTherapyPhysical)
	 */
	public int insertOrUpdatePtOtStTherapyPhysical(
			PtOtStTherapyPhysical refPtOtStTherapyPhysical)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStTherapyPhysical != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Therapy Physical Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_TherapyPhysicalForm, action, msg);

		return (new PtOtStTherapyPhysicalService())
				.insertOrUpdatePtOtStTherapyPhysical(refPtOtStTherapyPhysical);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStTherapyPhysicals(int)
	 */
	public List getPtOtStTherapyPhysicals(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of OTPT Therapy Physical Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_TherapyPhysicalForm, action, msg);

		return ((new PtOtStTherapyPhysicalService())
				.getPtOtStTherapyPhysicals(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStTherapyPhysical(int)
	 */
	public PtOtStTherapyPhysical getPtOtStTherapyPhysical(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Therapy Physical Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_TherapyPhysicalForm, action, msg);

		return (new PtOtStTherapyPhysicalService())
				.getPtOtStTherapyPhysical(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStTherapyPhysical(int)
	 */
	public void deletePtOtStTherapyPhysical(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Therapy Physical Form";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_OTPT_TherapyPhysicalForm, action, msg);

		(new PtOtStTherapyPhysicalService())
				.deletePtOtStTherapyPhysical(serial);
	}

	// PtOtStTreatment
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePtOtStTreatment(medrex.commons
	 * .vo.ptOtSt.PtOtStTreatment)
	 */
	public int insertOrUpdatePtOtStTreatment(PtOtStTreatment refPtOtStTreatment)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPtOtStTreatment != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in OTPT Treatment Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_Treatment, action,
				msg);

		return (new PtOtStTreatmentService())
				.insertOrUpdatePtOtStTreatment(refPtOtStTreatment);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStTreatments(int)
	 */
	public List getPtOtStTreatments(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a list of OTPT Treatment Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_Treatment, action,
				msg);

		return ((new PtOtStTreatmentService())
				.getPtOtStTreatments(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPtOtStTreatment(int)
	 */
	public PtOtStTreatment getPtOtStTreatment(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting OTPT Treatment Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_Treatment, action,
				msg);

		return (new PtOtStTreatmentService()).getPtOtStTreatment(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePtOtStTreatment(int)
	 */
	public void deletePtOtStTreatment(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting OTPT Treatment Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_OTPT_Treatment, action,
				msg);

		(new PtOtStTreatmentService()).deletePtOtStTreatment(serial);
	}

	// other user's

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateUser(medrex.commons.vo.others
	 * .Users)
	 */
	public int insertOrUpdateUser(Users user) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (user != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in User Module : UserName :"
				+ user.getUserName() + ";User Id:" + user.getUserId();
		Logger.getInstance().log(LoggerModule.USERS, action, msg);

		return (new UserService()).insertOrUpdateUser(user);

	}

	/*
	 * public List getUsers(int userSerial) throws MedrexException,
	 * RemoteException { return ((new UserService()).getUsers(userSerial)); }
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getUser(int)
	 */
	public Users getUser(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting all the information of Users";
		Logger.getInstance().log(LoggerModule.USERS, action, msg);

		return (new UserService()).getUser(serial);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getUsers()
	 */
	public List getUsers() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of all the Users";
		Logger.getInstance().log(LoggerModule.USERS, action, msg);

		return ((new UserService()).getUsers());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteUser(int)
	 */
	public void deleteUser(int serial) throws MedrexException, RemoteException {
		(new UserService()).deleteUser(serial);
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting the Users";
		Logger.getInstance().log(LoggerModule.USERS, action, msg);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#isValidUserLogin(java.lang.String,
	 * java.lang.String)
	 */
	public boolean isValidUserLogin(String user, String password)
			throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Validating The Current User with UserId" + user
				+ "; User Password:" + password;
		Logger.getInstance().log(LoggerModule.USERS, action, msg);

		return (new UserService()).isValidUserLogin(user, password);
	}

	/*
	 * 
	 * // User's
	 * 
	 * public void insertOrUpdateOtherUser(OtherUser refOtherUser) throws
	 * MedrexException, RemoteException { try { (new
	 * OtherUserService()).insertOrUpdateOtherUser(refOtherUser); } catch
	 * (MedrexException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public List getOtherUsers() throws MedrexException, RemoteException {
	 * return ((new OtherUserService()).getOtherUsers()); }
	 * 
	 * public OtherUser getOtherUser(int serial) throws MedrexException,
	 * RemoteException { return (new OtherUserService()).getOtherUser(serial); }
	 * 
	 * public void deleteOtherUser(int serial) throws MedrexException,
	 * RemoteException { (new OtherUserService()).deleteOtherUser(serial); }
	 * 
	 * public boolean isValidLogin(String user, String password) throws
	 * MedrexException, RemoteException { return (new
	 * OtherUserService()).isValidLogin(user, password); }
	 */

	// Doctor's
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateDoctorsRecord(medrex.commons
	 * .vo.others.Doctors)
	 */
	public int insertOrUpdateDoctorsRecord(Doctors refDoctors)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refDoctors != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Doctors Record";
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return (new DoctorsService()).insertOrUpdateDoctorsRecord(refDoctors);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorsRecords()
	 */
	public List getDoctorsRecords() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting A List Of Doctors Record";
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return ((new DoctorsService()).getDoctorsRecords());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorsRecords(int)
	 */
	public synchronized List getDoctorsRecords(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting A List Of Doctors Record on the Basis of Resident Serial as:"
				+ residentSerial;
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return ((new DoctorsService()).getDoctorsRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorsRecord(int)
	 */
	public Doctors getDoctorsRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Doctors Record";
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return (new DoctorsService()).getDoctorsRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorsRecord(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public Doctors getDoctorsRecord(DoctorTypes type, String fName, String lName)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Doctors Record on the Basis of Doctor Type as:" + type
				+ ";Name :" + fName;
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return ((new DoctorsService()).getDoctorsRecord(type, fName, lName));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDoctorsRecord(int)
	 */
	public void deleteDoctorsRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Doctors Record ";
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		(new DoctorsService()).deleteDoctorsRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getDoctorsRecords(java.lang.String)
	 */
	public List getDoctorsRecords(DoctorTypes type) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Doctors Record on the Basis of Doctor Type as:" + type;
		Logger.getInstance().log(LoggerModule.USERS_DOCTORS, action, msg);

		return ((new DoctorsService()).getDoctorsRecords(type));

	}

	// Nurse

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseRecord(medrex.commons
	 * .vo.others.Nurse)
	 */
	public int insertOrUpdateNurseRecord(Nurse refNurse)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refNurse != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Nurse Record";
		Logger.getInstance().log(LoggerModule.USERS_NURSE, action, msg);

		return (new NurseService()).insertOrUpdateNurseRecord(refNurse);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseRecords()
	 */
	public List getNurseRecords() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a list of all The Nurse Records";
		Logger.getInstance().log(LoggerModule.USERS_NURSE, action, msg);

		return ((new NurseService()).getNurseRecords());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseRecord(int)
	 */
	public Nurse getNurseRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting The Nurse Record";
		Logger.getInstance().log(LoggerModule.USERS_NURSE, action, msg);

		return (new NurseService()).getNurseRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteNurseRecord(int)
	 */

	public Nurse getNurseRecordForSchedule(int serial) throws MedrexException,
			RemoteException {
		return (new NurseService()).getNurseRecordForSchedule(serial);
	}

	public void deleteNurseRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting The Nurse Record";
		Logger.getInstance().log(LoggerModule.USERS_NURSE, action, msg);

		(new NurseService()).deleteNurseRecord(serial);
	}

	


	public int insertOrUpdatePhysicianForm(PhysicianForm refPhysicianForm)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPhysicianForm != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in physician Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PHYSICIAN,
				action, msg);
		return (new PhysicianFormService())
				.insertOrUpdatePhysicianForm(refPhysicianForm);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianForms(int)
	 */
	public List getPhysicianForms(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting The List of All physician Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PHYSICIAN,
				action, msg);

		return ((new PhysicianFormService()).getPhysicianForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianForm(int)
	 */
	public PhysicianForm getPhysicianForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting physician Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PHYSICIAN,
				action, msg);

		return (new PhysicianFormService()).getPhysicianForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianForm(int)
	 */
	public PhysicianForm getPhysicianForm(int residentId, int physicianType)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting physician Form on the basis of ResID:" + residentId
				+ " and Physician Type:" + physicianType;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PHYSICIAN,
				action, msg);
		return (new PhysicianFormService()).getResidentPhysician(residentId,
				physicianType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePhysicianForm(int)
	 */
	public void deletePhysicianForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting physician Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PHYSICIAN,
				action, msg);
		(new PhysicianFormService()).deletePhysicianForm(serial);
	}

	/*
	 * /// //doctorstype
	 * 
	 * public void insertOrUpdateDoctorsTypeRecord(DoctorsType refDoctors)
	 * throws MedrexException { try { (new
	 * DoctorsTypeService()).insertOrUpdateDoctorsTypeRecord(refDoctors);
	 * }catch(MedrexException ex) {} }
	 * 
	 * public List getDoctorsTypeRecords() throws MedrexException,
	 * RemoteException { return ((new
	 * DoctorsTypeService()).getDoctorsTypeRecords()); }
	 * 
	 * public DoctorsType getDoctorsTypeRecord(int serial) throws
	 * MedrexException, RemoteException { return (new
	 * DoctorsTypeService()).getDoctorsTypeRecord(serial); }
	 * 
	 * public void deleteDoctorsTypeRecord(int serial) throws MedrexException,
	 * RemoteException { (new
	 * DoctorsTypeService()).deleteDoctorsTypeRecord(serial);
	 * 
	 * }
	 */
	// /////providers
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateProvidersRecord(medrex.commons
	 * .vo.providers.ProvidersRecord)
	 */
	public int insertOrUpdateProvidersRecord(ProvidersRecord providersRecord)
			throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (providersRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Providers Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return (new ProvidersRecordService())
				.insertOrUpdateProvidersRecord(providersRecord);

	}

	public boolean getProvidersRecordsOfType(int residentSerial,
			int providerType) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Providers Record of type" + providerType;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordService()).getProvidersRecordsOfType(
				residentSerial, providerType));
	}

	public ProvidersRecord getProvidersRecord(int residentSerial,
			int providerType) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Providers Record " + providerType;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordService()).getProvidersRecord(
				residentSerial, providerType));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProvidersRecords(int)
	 */
	public List getProvidersRecords(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Providers Records on resident serial:"
				+ residentSerial;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordService())
				.getProvidersRecords(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProvidersRecords()
	 */
	public List getProvidersRecords() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Providers Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);
		return ((new ProvidersRecordService()).getProvidersRecords());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProvidersRecord(int)
	 */
	public ProvidersRecord getProvidersRecord(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Providers Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return (new ProvidersRecordService()).getProvidersRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteProvidersRecord(int)
	 */
	public void deleteProvidersRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Providers Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		(new ProvidersRecordService()).deleteProvidersRecord(serial);

	}

	// ///providers form

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateProvidersRecordForm(medrex
	 * .commons.vo.providers.ProvidersRecordForm)
	 */
	public int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (providersRecordForm != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Providers Record Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return (new ProvidersRecordFormService())
				.insertOrUpdateProvidersRecordForm(providersRecordForm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProvidersRecordForms()
	 */
	public List getProvidersRecordForms() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a List of Providers Record Forms";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordFormService()).getProvidersRecordForms());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getProvidersRecordForm(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public ProvidersRecordForm getProvidersRecordForm(ProviderTypes type,
			String address, String city) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Providers Record Form with ProviderType:" + type
				+ ";Address:" + address + ";City:'" + city;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return (new ProvidersRecordFormService()).getProvidersRecordForm(type,
				address, city);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getProvidersRecordForm(int)
	 */
	public ProvidersRecordForm getProvidersRecordForm(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Providers Record Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);
		return (new ProvidersRecordFormService())
				.getProvidersRecordForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteProvidersRecordForm(int)
	 */
	public void deleteProvidersRecordForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Providers Record Form";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		(new ProvidersRecordFormService()).deleteProvidersRecordForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getProvidersRecordForms(java.lang.String)
	 */
	public List getProvidersRecordForms(String type) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a List of Providers Record Forms on the basis of type:"
				+ type;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordFormService())
				.getProvidersRecordForms(type));

	}

	public List getProvidersRecordForms(ProviderTypes pTypes)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting a List of Providers Record Forms on the basis of Providertypes:"
				+ pTypes;
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PROVIDERS,
				action, msg);

		return ((new ProvidersRecordFormService())
				.getProvidersRecordForms(pTypes));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3Row(int, int,
	 * java.util.Date)
	 */
	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum, Date date) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting Physician Order form 3 row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PhysicianOrderForm3,
				action, msg);
		return ((new PhysicianOrderForm3Service()).getPhysicianOrderForm3Row(
				formId, formNum, date));
	}

	// mds
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateScanForm(medrex.commons.
	 * vo.scan.ScanForm)
	 */
	public void insertOrUpdateScanForm(ScanForm scanForm)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (scanForm != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating in Scan Form";
		Logger.getInstance().log(LoggerModule.SCAN, action, msg);

		(new ScanFormService()).insertOrUpdateScanForm(scanForm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getScanForms(int)
	 */
	public List getScanForms(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Scan Forms";
		Logger.getInstance().log(LoggerModule.SCAN, action, msg);

		return ((new ScanFormService()).getScanForms(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getScanForm(int)
	 */
	public ScanForm getScanForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Scan Forms";
		Logger.getInstance().log(LoggerModule.SCAN, action, msg);

		return (new ScanFormService()).getScanForm(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteScanForm(int)
	 */
	public void deleteScanForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Scan Forms";
		Logger.getInstance().log(LoggerModule.SCAN, action, msg);

		(new ScanFormService()).deleteScanForm(serial);

	}

	// // /messages

	// ///messages

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMessagesRecord(medrex.commons
	 * .vo.messages.MessagesRecord)
	 */
	public void insertOrUpdateMessagesRecord(MessagesRecord messagesRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (messagesRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating message record in Messages Module";
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);
		(new MessagesRecordService())
				.insertOrUpdateMessagesRecord(messagesRecord);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMessagesRecord(medrex.commons
	 * .vo.messages.MessagesRecord, java.util.List)
	 */
	public int insertOrUpdateMessagesRecord(MessagesRecord messagesRecord,
			List<Users> rUsers) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (messagesRecord != null && rUsers != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating message record:" + messagesRecord
				+ " -in Messages Module with specific User";
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);

		return (new MessagesRecordService()).insertOrUpdateMessagesRecord(
				messagesRecord, rUsers);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMessagesRecords()
	 */
	public List getMessagesRecords() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Messages Records";
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);
		return ((new MessagesRecordService()).getMessagesRecords());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMessagesRecords(int)
	 */
	public List getMessagesRecords(int residentserial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Messages Records on Resident Serial:"
				+ residentserial;
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);

		return ((new MessagesRecordService())
				.getMessagesRecords(residentserial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMessagesRecord(int)
	 */
	public MessagesRecord getMessagesRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Messages Record ";
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);

		return (new MessagesRecordService()).getMessagesRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteMessagesRecord(int)
	 */
	public void deleteMessagesRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Messages Records";
		Logger.getInstance().log(LoggerModule.MESSAGES, action, msg);

		(new MessagesRecordService()).deleteMessagesRecord(serial);
	}

	public int getTotalMessage(int currentLoggedInUserKey)
			throws MedrexException, RemoteException {
		return (new MessagesRecordService())
				.getTotalMessage(currentLoggedInUserKey);
	}

	public int getTriggerWordMailCount(int currentLoggedInUserKey)
			throws MedrexException, RemoteException {
		return (new MessagesRecordService())
				.getTriggerWordMailCount(currentLoggedInUserKey);
	}

	// ResidentDiagnosis
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentDiagnosis(medrex
	 * .commons.vo.resident.ResidentDiagnosis)
	 */
	public int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentDiagnosis != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Diagnosis Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_DIAGNOSIS,
				action, msg);

		return (new ResidentDiagnosisService())
				.insertOrUpdateResidentDiagnosis(refResidentDiagnosis);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentDiagnosiss(int)
	 */
	public List getResidentDiagnosiss(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Resident Diagnosis Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_DIAGNOSIS,
				action, msg);

		return ((new ResidentDiagnosisService())
				.getResidentDiagnosiss(residentSerial));
	}

	public ResidentDiagnosis getLastDiagnosisAccToOrder(int residentId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Last Diagnosis of Resident According to order ";
		Logger.getInstance().log(LoggerModule.RESIDENT_ADDMISSION, action, msg);
		return (new ResidentDiagnosisService())
				.getLastDiagnosisAccToOrder(residentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentDiagnosis(int)
	 */
	public ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Diagnosis Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_DIAGNOSIS,
				action, msg);

		return (new ResidentDiagnosisService()).getResidentDiagnosis(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentDiagnosis(int)
	 */
	public void deleteResidentDiagnosis(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident Diagnosis Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_DIAGNOSIS,
				action, msg);

		(new ResidentDiagnosisService()).deleteResidentDiagnosis(serial);
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateMonthlyVitalSheetFormRows
	 * (java.util.List)
	 */
	public int insertOrUpdateMonthlyVitalSheetFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Monthly vital Sheet form rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return (new MonthlyVitalSheetFormService())
				.insertOrUpdateMonthlyVitalSheetFormRows(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getMonthlyVitalSheetFormRows(int)
	 */
	public List getMonthlyVitalSheetFormRows(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Monthly vital Sheet form rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_HISTORYandPHYSICAL_MonthlyVitalSheetForm,
				action, msg);

		return ((new MonthlyVitalSheetFormService())
				.getMonthlyVitalSheetFormRows(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseMedicationNotesFormRows
	 * (java.util.List)
	 */
	public int insertOrUpdateNurseMedicationNotesFormRows(
			List<NurseMedicationNotesFormRow> rows) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rows != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Medication Notes form rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return (new NurseMedicationNotesFormService())
				.insertOrUpdateNurseMedicationNotesFormRows(rows);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRows(int)
	 */
	public List getNurseMedicationNotesFormRows(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Nurse Medication Notes form rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRows(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getNurseMedicationNotesFormRow1s(int)
	 */
	public List getNurseMedicationNotesFormRow1s(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Nurse Medication Notes form row 1s";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);
		return ((new NurseMedicationNotesFormService())
				.getNurseMedicationNotesFormRow1s(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateNurseMedicationNotesFormRow1s
	 * (java.util.List)
	 */
	public int insertOrUpdateNurseMedicationNotesFormRow1s(
			List<NurseMedicationNotesFormRow1> rows1) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rows1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Nurse Medication Notes form rows1";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_NurseMedicationNotes, action,
				msg);

		return (new NurseMedicationNotesFormService())
				.insertOrUpdateNurseMedicationNotesFormRow1s(rows1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCumulativeDiagnosisFormRows
	 * (java.util.List)
	 */
	public int insertOrUpdateCumulativeDiagnosisFormRows(List ntnfr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ntnfr != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating CumulativeDiagnosisForm rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return (new CumulativeDiagnosisFormService())
				.insertOrUpdateCumulativeDiagnosisFormRows(ntnfr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCumulativeDiagnosisFormRows(int)
	 */
	public List getCumulativeDiagnosisFormRows(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting CumulativeDiagnosisForm rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return ((new CumulativeDiagnosisFormService())
				.getCumulativeDiagnosisFormRows(formId));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPhysicianOrderForm3Rows(int)
	 */
	public List getPhysicianOrderForm3Rows(int currentPhysicianOrderForm3Key)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Physician Order Form3 rows";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_HISTORYandPHYSICAL_CumulativeDiagnosisForm,
						action, msg);

		return ((new PhysicianOrderForm3Service())
				.getPhysicianOrderForm3Rows(currentPhysicianOrderForm3Key));
	}

	// ResidentInfoGeneralPhone

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResidentInfoGeneralPhone
	 * (medrex.commons.vo.resident.ResidentInfoGeneralPhone)
	 */
	public int insertOrUpdateResidentInfoGeneralPhone(
			ResidentInfoGeneralPhone refResidentInfoGeneralPhone)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentInfoGeneralPhone != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident info General Phone";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PERSONAL,
				action, msg);

		return (new ResidentInfoGeneralPhoneService())
				.insertOrUpdateResidentInfoGeneralPhone(refResidentInfoGeneralPhone);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentInfoGeneralPhones(int)
	 */
	public List getResidentInfoGeneralPhones(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Resident info General Phone";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PERSONAL,
				action, msg);

		return ((new ResidentInfoGeneralPhoneService())
				.getResidentInfoGeneralPhones(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResidentInfoGeneralPhone(int)
	 */
	public ResidentInfoGeneralPhone getResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident info General Phone";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PERSONAL,
				action, msg);

		return (new ResidentInfoGeneralPhoneService())
				.getResidentInfoGeneralPhone(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteResidentInfoGeneralPhone(int)
	 */
	public void deleteResidentInfoGeneralPhone(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Resident info General Phone";
		Logger.getInstance().log(LoggerModule.RESIDENT_RESIDENTINFO_PERSONAL,
				action, msg);

		(new ResidentInfoGeneralPhoneService())
				.deleteResidentInfoGeneralPhone(serial);
	}

	/*
	 * // MDSProtocalSummary
	 * 
	 * public void insertOrUpdateMDSProtocalSummary(MDSProtocalSummary
	 * refMDSProtocalSummary) throws MedrexException, RemoteException { try {
	 * (newMDSProtocalSummaryService()).insertOrUpdateMDSProtocalSummary(
	 * refMDSProtocalSummary); } catch (MedrexException e) {
	 * 
	 * e.printStackTrace(); } }
	 * 
	 * public List getMDSProtocalSummarys(int residentSerial) throws
	 * MedrexException, RemoteException { return ((new
	 * MDSProtocalSummaryService()).getMDSProtocalSummarys(residentSerial)); }
	 * 
	 * public MDSProtocalSummary getMDSProtocalSummary(int serial) throws
	 * MedrexException, RemoteException { return (new
	 * MDSProtocalSummaryService()).getMDSProtocalSummary(serial); }
	 * 
	 * public void deleteMDSProtocalSummary(int serial) throws MedrexException,
	 * RemoteException { (new
	 * MDSProtocalSummaryService()).deleteMDSProtocalSummary(serial); }
	 */

	// Care Plan
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCarePlan(medrex.commons.
	 * vo.carePlan.CarePlan)
	 */
	public int insertOrUpdateCarePlan(CarePlan carePlan)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (carePlan != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Care Plan";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanService()).insertOrUpdateCarePlan(carePlan);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCarePlanList(int)
	 */
	public List getCarePlanList(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Care Plan List";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return ((new CarePlanService()).getCarePlanList(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCarePlan(int)
	 */
	public CarePlan getCarePlan(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Care Plan ";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanService()).getCarePlan(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteCarePlan(int)
	 */
	public void deleteCarePlan(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Care Plan";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		(new CarePlanService()).deleteCarePlan(serial);
	}

	// Care Plan Records

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCarePlanRecord(medrex.commons
	 * .vo.carePlan.CarePlanRecord)
	 */
	public int insertOrUpdateCarePlanRecord(CarePlanRecord carePlanRecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (carePlanRecord != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Care Plan Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanRecordService())
				.insertOrUpdateCarePlanRecord(carePlanRecord);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCarePlanRecord(int)
	 */
	public CarePlanRecord getCarePlanRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Care Plan Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanRecordService()).getCarePlanRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteCarePlanRecord(int)
	 */
	public void deleteCarePlanRecord(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Care Plan Record";
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		(new CarePlanRecordService()).deleteCarePlanRecord(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getAllCarePlanMatchingThisCarePlan(medrex
	 * .commons.vo.carePlan.CarePlanRecord)
	 */
	public List getAllCarePlanMatchingThisCarePlan(CarePlanRecord careplanrecord)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting All Care Plan Matching This CarePlan" + careplanrecord;
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanRecordService())
				.getAllCarePlanMatchingThisCarePlan(careplanrecord);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getAllCarePlanMatchingThisCarePlan(medrex
	 * .commons.vo.carePlan.CarePlanRecord, java.lang.String)
	 */
	public List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord, String userName)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "getting All Care Plan Matching This CarePlan" + careplanrecord
				+ "and UserName" + userName;
		Logger.getInstance().log(LoggerModule.RESIDENT_CARE_PLAN, action, msg);

		return (new CarePlanRecordService())
				.getAllCarePlanMatchingThisCarePlan(careplanrecord, userName);
	}

	// M D S
	


	// Security Roles

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatedSecurityRole(medrex.commons
	 * .vo.security.SecurityRole)
	 */
	public int insertOrUpdatedSecurityRole(SecurityRole securityRole)
			throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (securityRole != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Security Role";
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);

		return (new SecurityRoleService()).insertOrUpdate(securityRole);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAllRoles()
	 */
	public List getAllRoles() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Roles";
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);
		return ((new SecurityRoleService()).getAllRoles());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAllApplicationRoles()
	 */
	public List getAllApplicationRoles() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Application Roles";
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);

		return ((new SecurityRoleService()).getAllApplicationRoles());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSecurityRole(int)
	 */
	public SecurityRole getSecurityRole(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Security Role";
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);

		return ((new SecurityRoleService()).get(serial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSecurityRole(java.lang.String)
	 */
	public SecurityRole getSecurityRole(String name) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Security Role According to the name:" + name;
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);

		return ((new SecurityRoleService()).get(name));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteSecurityRole(int)
	 */
	public void deleteSecurityRole(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "deleting Security Role";
		Logger.getInstance().log(LoggerModule.SECURITY, action, msg);

		(new SecurityRoleService()).delete(serial);
	}

	// PhysicianInfusion

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePanelProgressNotes(medrex
	 * .commons.vo.physicianOrders.ProgressNotes2)
	 */
	public int insertOrUpdatePanelProgressNotes(
			ProgressNotes2 refpanelProgressNotes) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refpanelProgressNotes != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Progress Notes2";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return (new PanelPrescriptionNotesService())
				.insertOrUpdatePanelProgressNotes(refpanelProgressNotes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPanelProgressNotes(int)
	 */
	public List getPanelProgressNotes(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Progress Notes2 with resident Serial" + residentSerial;
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return ((new PanelPrescriptionNotesService())
				.getPanelProgressNotes(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPanelProgressNote(int)
	 */
	public ProgressNotes2 getPanelProgressNote(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Progress Notes2";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		return (new PanelPrescriptionNotesService())
				.getPanelProgressNote(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePanelProgressNotes(int)
	 */
	public void deletePanelProgressNotes(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Getting Panel Progress Notes";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		(new PanelPrescriptionNotesService()).deletePanelProgressNotes(serial);
	}

	// PanelProgressNotes

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdatePrescription(medrex.commons
	 * .vo.physicianOrders.Prescription)
	 */
	public int insertOrUpdatePrescription(Prescription refPrescription)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refPrescription != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Prescription";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PrescriptionForm, action,
				msg);

		return (new PrescriptionService())
				.insertOrUpdatePrescription(refPrescription);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPrescriptions(int)
	 */
	public List getPrescriptions(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Prescriptions";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PrescriptionForm, action,
				msg);

		return ((new PrescriptionService()).getPrescriptions(residentSerial));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getPrescription(int)
	 */
	public Prescription getPrescription(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Prescriptions";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PrescriptionForm, action,
				msg);

		return (new PrescriptionService()).getPrescription(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deletePrescription(int)
	 */
	public void deletePrescription(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Prescriptions";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PHYSICIANORDER_PrescriptionForm, action,
				msg);

		(new PrescriptionService()).deletePrescription(serial);
	}

	public void deleteProgressNotes2(int formId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Progress Notes2";
		Logger.getInstance().log(LoggerModule.RESIDENT_PROGRESSNOTES, action,
				msg);

		(new ProgressNotesService()).deleteProgressNotes2(formId);

	}

	// UserLogon
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateUserLogon(medrex.commons
	 * .vo.admin.UserLogon)
	 */
	public int insertOrUpdateUserLogon(UserLogon refUserLogon)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refUserLogon != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating User Logon With UserID:"
				+ refUserLogon.getUserId();
		Logger.getInstance().log(LoggerModule.USER_LOGON, action, msg);

		return (new UserLogonService()).insertOrUpdate(refUserLogon);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getUserLogons()
	 */
	public List getUserLogons() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of User Logons ";
		Logger.getInstance().log(LoggerModule.USER_LOGON, action, msg);

		return ((new UserLogonService()).getAll());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getUserLogon(int)
	 */
	public UserLogon getUserLogon(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting User Logon ";
		Logger.getInstance().log(LoggerModule.USER_LOGON, action, msg);

		return (new UserLogonService()).get(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteUserLogon(int)
	 */
	public void deleteUserLogon(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting User Logons ";
		Logger.getInstance().log(LoggerModule.USER_LOGON, action, msg);

		(new UserLogonService()).delete(serial);
	}

	public UserLogon getcurrentUserLogon() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting User Logons who is currently Logged On ";
		Logger.getInstance().log(LoggerModule.USER_LOGON, action, msg);

		return (new UserLogonService()).getcurrentUserLogon();
	}

	// Care Log
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCareLog(medrex.commons.vo
	 * .careLog.CareLog)
	 */
	public int insertOrUpdateCareLog(CareLog cnaAdl) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (cnaAdl != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Care Log";
		Logger.getInstance().log(LoggerModule.CARE_LOG, action, msg);

		return (new CareLogService()).insertOrUpdateCareLog(cnaAdl);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCareLogForResident(int)
	 */
	public List getCareLogForResident(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All Care Logs";
		Logger.getInstance().log(LoggerModule.CARE_LOG, action, msg);

		return (new CareLogService()).getCareLogForResident(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCareLog(int)
	 */
	public CareLog getCareLog(int id) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Care Log";
		Logger.getInstance().log(LoggerModule.CARE_LOG, action, msg);
		return (new CareLogService()).getCareLog(id);

	}

	// CNA
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCnaAdl(medrex.commons.vo
	 * .cna.CnaAdl)
	 */
	public int insertOrUpdateCnaAdl(CnaAdl cnaAdl) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (cnaAdl != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating CNA ADMIN";
		Logger.getInstance().log(LoggerModule.CNA_ADL, action, msg);

		return (new CNAService()).insertOrUpdateCnaAdl(cnaAdl);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCnaAdlForResident(int)
	 */
	public List getCnaAdlForResident(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All CNA ADMIN";
		Logger.getInstance().log(LoggerModule.CNA_ADL, action, msg);

		return (new CNAService()).getCnaAdlForResident(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCnaAdl(int)
	 */
	public CnaAdl getCnaAdl(int id) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting CNA ADMIN";
		Logger.getInstance().log(LoggerModule.CNA_ADL, action, msg);

		return (new CNAService()).getCnaAdl(id);

	}

	// Census

	// AdmissionFromHead
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateAdmissionFromHead(medrex
	 * .commons.vo.census.AdmissionFromHead)
	 */
	public int insertOrUpdateAdmissionFromHead(
			AdmissionFromHead refAdmissionFromHead) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refAdmissionFromHead != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Census Admission from Head";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromHeadService())
				.insertOrUpdateAdmissionFromHead(refAdmissionFromHead);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionFromHeads()
	 */
	public List getAdmissionFromHeads() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Census Admission from Heads";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromHeadService()).getAdmissionFromHeads();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getAdmissionFromHeads(java.lang.String)
	 */
	public List getAdmissionFromHeads(String likeStr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Census Admission from Heads According to the given String"
				+ likeStr;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromHeadService()).getAdmissionFromHeads(likeStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionFromHead(int)
	 */
	public AdmissionFromHead getAdmissionFromHead(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Admission from Head";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromHeadService()).getAdmissionFromHead(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteAdmissionFromHead(int)
	 */
	public void deleteAdmissionFromHead(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Census Admission from Heads";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);
		(new AdmissionFromHeadService()).deleteAdmissionFromHead(serial);
	}

	// AdmissionFromSubHead
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateAdmissionFromSubHead(medrex
	 * .commons.vo.census.AdmissionFromSubHead)
	 */
	public int insertOrUpdateAdmissionFromSubHead(
			AdmissionFromSubHead refAdmissionFromSubHead)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refAdmissionFromSubHead != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Census Admission from Sub Head";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromSubHeadService())
				.insertOrUpdateAdmissionFromSubHead(refAdmissionFromSubHead);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionFromSubHeads(int)
	 */
	public List getAdmissionFromSubHeads(int headId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Census Admission from Sub Heads According to the given HeadId"
				+ headId;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromSubHeadService())
				.getAdmissionFromSubHeads(headId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionFromSubHeads(int,
	 * java.lang.String)
	 */
	public List getAdmissionFromSubHeads(int headId, String likeStr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Admission from Sub Heads According to the given HeadId:"
				+ headId + " And String :" + likeStr;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromSubHeadService()).getAdmissionFromSubHeads(
				headId, likeStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionFromSubHead(int)
	 */
	public AdmissionFromSubHead getAdmissionFromSubHead(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Admission from Sub Heads";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionFromSubHeadService())
				.getAdmissionFromSubHead(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteAdmissionFromSubHead(int)
	 */
	public void deleteAdmissionFromSubHead(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Census Admission from Sub Heads";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		(new AdmissionFromSubHeadService()).deleteAdmissionFromSubHead(serial);
	}

	// AdmissionTransportation
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateAdmissionTransportation(
	 * medrex.commons.vo.census.AdmissionTransportation)
	 */
	public int insertOrUpdateAdmissionTransportation(
			AdmissionTransportation refAdmissionTransportation)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refAdmissionTransportation != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Census Transportation";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionTransportationService())
				.insertOrUpdateAdmissionTransportation(refAdmissionTransportation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionTransportations(int)
	 */
	public List getAdmissionTransportations(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Admission Transportation";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionTransportationService())
				.getAdmissionTransportations(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#getAdmissionTransportations(java.lang.
	 * String)
	 */
	public List getAdmissionTransportations(String likeStr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Admission Transportation According to a string pattern i.e:"
				+ likeStr;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionTransportationService())
				.getAdmissionTransportations(likeStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getAdmissionTransportation(int)
	 */
	public AdmissionTransportation getAdmissionTransportation(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Admission Transportation";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new AdmissionTransportationService())
				.getAdmissionTransportation(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteAdmissionTransportation(int)
	 */
	public void deleteAdmissionTransportation(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Census Admission Transportation";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		(new AdmissionTransportationService())
				.deleteAdmissionTransportation(serial);
	}

	// CensusStatus
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateCensusStatus(medrex.commons
	 * .vo.census.CensusStatus)
	 */
	public int insertOrUpdateCensusStatus(CensusStatus refCensusStatus)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refCensusStatus != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Census Status";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService())
				.insertOrUpdateCensusStatus(refCensusStatus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatus(int, int)
	 */
	public CensusStatus getCensusStatus(int serial, int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusStatus(serial,
				residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatuss(int)
	 */
	public List getCensusStatuss(int residentSerial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Census Status";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusStatuss(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatuss(java.lang.String,
	 * int)
	 */
	public List getCensusStatuss(String order, int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Status according to Order" + order
				+ "And Resident Serial" + residentSerial;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);
		return (new CensusStatusService()).getCensusStatuss(order,
				residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatus(int,
	 * java.lang.String)
	 */
	public CensusStatus getCensusStatus(int residentSerial, String typename)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status according to TypeName:" + typename
				+ "And Resident Serial" + residentSerial;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusStatus(residentSerial,
				typename);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatuss(int,
	 * java.lang.String)
	 */
	public List getCensusStatuss(int residentSerial, String typename)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Status according to TypeName:" + typename
				+ "And Resident Serial" + residentSerial;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusStatuss(residentSerial,
				typename);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusStatus(int,
	 * java.lang.String)
	 */
	public CensusStatus getCensusStatus() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);
		return (new CensusStatusService()).getCensusStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteCensusStatus(int)
	 */
	public void deleteCensusStatus(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Census Status";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		(new CensusStatusService()).deleteCensusStatus(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusLastAdmission(int)
	 */
	public CensusStatus getCensusLastAdmission(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status-getLastAdmission";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService())
				.getCensusLastAdmission(residentSerial);
	}

	// for ORIGINAL Admisstion or first time admission
	public CensusStatus getCensusOriginalAdmission(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status-get Original Admission";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService())
				.getCensusOriginalAdmission(residentSerial);
	}

	// for getting last allergies
	public ResidentAssessmentFormPage1 getResidentAllergies(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident assessment form page1 allergies";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.getResidentAllergies(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusLastDischarge(int)
	 */
	public CensusStatus getCensusLastDischarge(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status-getCensusLastDischarge";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService())
				.getCensusLastDischarge(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusLastSignIn(int)
	 */
	public CensusStatus getCensusLastSignIn(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status-getCensusLastSignIn";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusLastSignIn(residentSerial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getCensusLastSignOut(int)
	 */
	public CensusStatus getCensusLastSignOut(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Status-getCensusLastSignOut";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()).getCensusLastSignOut(residentSerial);
	}

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey) throws MedrexException, RemoteException {
		return (new CensusStatusService())
				.getCensusStatusForResident(currentResidenceKey);
	}

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey, Date forDate) throws MedrexException,
			RemoteException {
		return (new CensusStatusService()).getCensusStatusForResident(
				currentResidenceKey, forDate);
	}

	public CensusStatus getCensusLastAdmission(int residentSerial, Date forDate)
			throws MedrexException {
		return (new CensusStatusService()).getCensusStatus(residentSerial,
				"Admission", forDate);
	}

	public CensusStatus getCensusLastDischarge(int residentSerial, Date forDate)
			throws MedrexException {
		return (new CensusStatusService()).getCensusStatus(residentSerial,
				"Discharge", forDate);
	}

	public CensusStatus getCensusLastSignIn(int residentSerial, Date forDate)
			throws MedrexException {
		return (new CensusStatusService()).getCensusStatus(residentSerial,
				"Sign In", forDate);
	}

	public CensusStatus getCensusLastSignOut(int residentSerial, Date forDate)
			throws MedrexException {
		return (new CensusStatusService()).getCensusStatus(residentSerial,
				"Sign Out", forDate);
	}

	public List getCensusStatuss(String typename) throws MedrexException {
		return getCensusStatuss(typename, new Date());
	}

	public List getCensusStatuss(String typename, Date tillDate)
			throws MedrexException {
		return (new CensusStatusService()).getCensusStatuss(typename, tillDate);
	}

	public List getCensusStatussAdmission() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_ADMISSION, new Date());
	}

	public List getCensusStatussAdmission(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_ADMISSION, tillDate);
	}

	public List getCensusStatussDischarge() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_DISCHARGE, new Date());
	}

	public List getCensusStatussDischarge(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_DISCHARGE, tillDate);
	}

	public List getCensusStatussSignOut() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_OUT, new Date());
	}

	public List getCensusStatussSignOut(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_OUT, tillDate);
	}

	public List getCensusStatussSignIn() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_IN, new Date());
	}

	public List getCensusStatussSignIn(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_IN, tillDate);
	}

	// Census Notes
	public int insertOrUpdateCensusNotes(CensusNotes refCensusNotes)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refCensusNotes != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Census Notes";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusNotesService())
				.insertOrUpdateCensusNotes(refCensusNotes);
	}

	public List getCensusNotesForStatus(int statusid) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Notes-for Status with status ID:"
				+ statusid;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusNotesService()).getCensusNotesForStatus(statusid);

	}

	public CensusNotes getCensusNotes(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Census Notes";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusNotesService()).getCensusNotes(serial);
	}

	// ResponsibleParty
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateResponsibleParty(medrex.
	 * commons.vo.census.ResponsibleParty)
	 */
	public int insertOrUpdateResponsibleParty(ResponsibleParty ref)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Responsible Party";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResponsiblePartyService())
				.insertOrUpdateResponsibleParty(ref);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResponsiblePartys(int)
	 */
	public List getResponsiblePartys(int residentId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Responsible Partys";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResponsiblePartyService()).getResponsiblePartys(residentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResponsiblePartys(int,
	 * java.lang.String)
	 */
	public List getResponsiblePartys(int residentId, String likeStr)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Responsible Partys according to the String Pattern"
				+ likeStr + " and Resident ID" + residentId;
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		return (new ResponsiblePartyService()).getResponsiblePartys(residentId,
				likeStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getResponsibleParty(int)
	 */
	public ResponsibleParty getResponsibleParty(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Responsible Party";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);
		return (new ResponsiblePartyService()).getResponsibleParty(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDischargeResponsibleParty(int)
	 */
	public void deleteDischargeResponsibleParty(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "delete Discharge Responsible Party";
		Logger.getInstance().log(LoggerModule.GENERAL, action, msg);

		(new ResponsiblePartyService()).deleteDischargeResponsibleParty(serial);
	}

	// SignOutTo
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.MedrexIntf#insertOrUpdateSignOutTo(medrex.commons
	 * .vo.census.SignOutTo)
	 */
	public int insertOrUpdateSignOutTo(SignOutTo ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating SignOutTo";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new SignOutToService()).insertOrUpdateSignOutTo(ref);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSignOutTos()
	 */
	public List getSignOutTos() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of SignOutTos";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new SignOutToService()).getSignOutTos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSignOutTos(java.lang.String)
	 */
	public List getSignOutTos(String likeStr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of SignOutTos according to a String Pattern:"
				+ likeStr;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new SignOutToService()).getSignOutTos(likeStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getSignOutTo(int)
	 */
	public SignOutTo getSignOutTo(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting SignOutTo";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new SignOutToService()).getSignOutTo(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteDischargeSignOutTo(int)
	 */
	public void deleteDischargeSignOutTo(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting SignOutTo";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		(new SignOutToService()).deleteDischargeSignOutTo(serial);
	}


	// Dashboard
	public void deleteDashboard(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Dash Board with serial:" + serial;
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);
		new DashboardService().delete(serial);
	}

	public Dashboard getDashboard(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Dash Board with serial:" + serial;
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);
		return new DashboardService().get(serial);
	}

	public Dashboard getDashboard(String type) throws MedrexException,
			RemoteException {
		// Logger.getInstance().log(LoggerModule.CENSUS_COUNT,action,msg);
		return new DashboardService().get(type);
	}

	public int getCensusLastDayAdmissionCount() throws MedrexException,
			RemoteException {
		return new DashboardService().getCensusLastDayAdmissionCount();
	}

	public int getCensusLastDayAdmissionFirstFloorCount()
			throws MedrexException, RemoteException {
		return new DashboardService()
				.getCensusLastDayAdmissionFirstFloorCount();
	}

	public int getCensusLastDayAdmissionSecondFloorCount()
			throws MedrexException, RemoteException {
		return new DashboardService()
				.getCensusLastDayAdmissionSecondFloorCount();
	}

	public int getCensusLastDayDischargeCount() throws MedrexException,
			RemoteException {
		return new DashboardService().getCensusLastDayDischargeCount();
	}

	public int getCensusLastDayDischargeFirstFloorCount()
			throws MedrexException, RemoteException {
		return new DashboardService()
				.getCensusLastDayDischargeFirstFloorCount();
	}

	public int getCensusLastDayDischargeSecondFloorCount()
			throws MedrexException, RemoteException {
		return new DashboardService()
				.getCensusLastDayDischargeSecondFloorCount();
	}

	public List getCensusLastDayAdmissionResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Admission Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService().getCensusLastDayAdmissionResidents();
	}

	public List getCensusLastDayAdmissionFirstFloorResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Admission First Floor Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService()
				.getCensusLastDayAdmissionFirstFloorResidents();
	}

	public List getCensusLastDayAdmissionSecondFloorResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Admission Second Floor Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService()
				.getCensusLastDayAdmissionSecondFloorResidents();
	}

	public List getCensusLastDayDischargeResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Discharge Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService().getCensusLastDayDischargeResidents();
	}

	public List getCensusLastDayDischargeFirstFloorResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Dicharge First Floor Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService()
				.getCensusLastDayDischargeFirstFloorResidents();
	}

	public List getCensusLastDayDischargeSecondFloorResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Census Last Day Dicharge Second Floor Residents";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new DashboardService()
				.getCensusLastDayDischargeSecondFloorResidents();
	}

	public List<Dashboard> getDashboards() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Dashboards";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return new DashboardService().getAll();
	}

	public int insertOrUpdateDashboard(Dashboard ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating DashBoard";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return new DashboardService().insertOrUpdate(ref);
	}

	// counts --- BedHold
	public void deleteBedHold(int residentId) throws MedrexException,
			RemoteException {
		(new BedHoldService()).delete(residentId);
	}

	public BedHold getBedHold(int serial) throws MedrexException,
			RemoteException {
		return (new BedHoldService()).get(serial);
	}

	public List<BedHold> getBedHolds() throws MedrexException, RemoteException {
		return (new BedHoldService()).getAll();
	}

	public int insertOrUpdateBedHold(BedHold ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Bed Hold";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new BedHoldService()).insertOrUpdate(ref);
	}

	public int getCountBedHold() throws MedrexException, RemoteException {
		return (new BedHoldService()).count();
	}

	public BedHold getBedHoldForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return (new BedHoldService()).getBedHoldForResident(residentSerial);
	}

	public BedHold getBedHoldForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return (new BedHoldService()).getBedHoldForResident(residentSerial,
				forDate);
	}

	public List<BedHold> getBedHoldForResidents() throws MedrexException,
			RemoteException {
		return (new BedHoldService()).getBedHoldForResidents();
	}

	public List<BedHold> getBedHoldForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return (new BedHoldService()).getBedHoldForResidents(tillDate);
	}

	// counts --- Hospital
	public void deleteHospital(int residentId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Hospital on the basis of residentId:" + residentId;
		// Logger.getInstance().log(LoggerModule.CENSUS_COUNT,action,msg);

		new HospitalService().delete(residentId);
	}

	public Hospital getHospital(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Hospital";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new HospitalService().get(serial);
	}

	public List<Hospital> getHospitals() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Hospitals";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new HospitalService().getAll();
	}

	public int insertOrUpdateHospital(Hospital ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Hospital";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new HospitalService().insertOrUpdate(ref);
	}

	public int getHospitalCount() throws MedrexException, RemoteException {
		return new HospitalService().count();
	}

	public Hospital getHospitalForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return new HospitalService().getHospitalForResident(residentSerial);
	}

	public Hospital getHospitalForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return new HospitalService().getHospitalForResident(residentSerial,
				forDate);
	}

	public List<Hospital> getHospitalForResidents() throws MedrexException,
			RemoteException {
		return new HospitalService().getHospitalForResidents();
	}

	public List<Hospital> getHospitalForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return new HospitalService().getHospitalForResidents(tillDate);
	}

	// counts --- InHouse
	public void deleteInHouse(int residentId) throws MedrexException,
			RemoteException {
		new InHouseService().delete(residentId);
	}

	public InHouse getInHouse(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting InHouse";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);
		return new InHouseService().get(serial);
	}

	public List<DashboardInfo> getInHouses() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of inhouses";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);
		return new InHouseService().getAll();
	}

	public int insertOrUpdateInHouse(InHouse ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating InHouse";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new InHouseService().insertOrUpdate(ref);
	}

	public int getInHouseCount() throws MedrexException, RemoteException {
		return new InHouseService().count();
	}

	public boolean getResidentExistInHouse(int residentId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting if resident exist inhouse or not";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return ((new InHouseService()).getResidentExistInHouse(residentId));
	}

	public InHouse getInHouseForResident(int residentSerial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting inHouse for Resident with serial " + residentSerial;
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return ((new InHouseService()).getInHouseForResident(residentSerial));
	}

	public InHouse getInHouseForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting inHouse for Resident with serial " + residentSerial
				+ " on date " + forDate;
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return ((new InHouseService()).getInHouseForResident(residentSerial,
				forDate));
	}

	public List<InHouse> getInHouseForResidents() throws MedrexException,
			RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting current list of inHouse";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return ((new InHouseService()).getInHouseForResidents());
	}

	public List<InHouse> getInHouseForResidents(Date tillDate)
			throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting current list of inHouse on date " + tillDate;
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return ((new InHouseService()).getInHouseForResidents(tillDate));
	}

	// counts --- SignOut
	public void deleteSignOut(int residentId) throws MedrexException,
			RemoteException {
		new SignOutService().delete(residentId);
	}

	public SignOut getSignOut(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Sign Out";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);
		return new SignOutService().get(serial);
	}

	public List<SignOut> getSignOuts() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Sign Outs";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new SignOutService().getAll();
	}

	public List<SignOut> getSignOutsLate() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Late Sign Outs";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new SignOutService().getAllLate();
	}

	public List<SignOut> getSignOutsLateMoreThanHour() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Sign Outs-more than Hour";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new SignOutService().getAllLateMoreThanHour();
	}

	public int insertOrUpdateSignOut(SignOut ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Sign Out";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return new SignOutService().insertOrUpdate(ref);
	}

	public int getSignOutCount() throws MedrexException, RemoteException {
		// Logger.getInstance().log(LoggerModule.CENSUS_COUNT,action,msg);
		return new SignOutService().count();
	}

	public int getSignOutLateCount() throws MedrexException, RemoteException {
		return new SignOutService().countLate();
	}

	public int getSignOutLateMoreThanHourCount() throws MedrexException,
			RemoteException {
		return new SignOutService().countLateMoreThanHour();
	}

	// OutOfPass

	public void insertOrUpdateOutOfPass(OutOfPass ref) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating OutOfPass";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		new OutOfPassService().insertOrUpdateOutOfPass(ref);
	}

	public int getOutOfPassCount() throws MedrexException, RemoteException {
		return new OutOfPassService().count();
	}

	public void deleteOutOfPass(int serial) throws MedrexException,
			RemoteException {
		new OutOfPassService().deleteOutOfPass(serial);
	}

	public OutOfPass getOutOfPassForResident(int residentSerial)
			throws MedrexException, RemoteException {
		return new OutOfPassService().getOutOfPassForResident(residentSerial);
	}

	public int getOutOfPassCalendarYearCount(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return new OutOfPassService()
				.getOutOfPassCalendarYearCount(currentResidenceKey);
	}

	public int getOutOnPassCalendarYearCount(int currentResidenceKey, int year)
			throws MedrexException, RemoteException {
		return new OutOfPassService().getOutOnPassCalendarYearCount(
				currentResidenceKey, year);
	}

	public OutOfPass getOutOfPassForResident(int residentSerial, Date forDate)
			throws MedrexException, RemoteException {
		return new OutOfPassService().getOutOfPassForResident(residentSerial,
				forDate);
	}

	public List<OutOfPass> getOutOfPassForResidents() throws MedrexException,
			RemoteException {
		return new OutOfPassService().getOutOfPassForResidents();
	}

	public List<OutOfPass> getOutOfPassForResidents(Date tillDate)
			throws MedrexException, RemoteException {
		return new OutOfPassService().getOutOfPassForResidents(tillDate);
	}

	// Icd9
	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#insertOrUpdateIcd9(medrex
	 * .commons.vo.census.Icd9)
	 */
	public int insertOrUpdateIcd9(Icd9 refIcd9) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refIcd9 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Icd9 ";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new Icd9Service()).insertOrUpdateIcd9(refIcd9);
	}

	public void insertOrUpdateIcd9(List<Icd9> list) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (list != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating List of Icd9 ";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		(new Icd9Service()).insertOrUpdateIcd9(list);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getIcd9s()
	 */
	public List getIcd9s() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of ICD9s";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new Icd9Service()).getIcd9s();
	}

	public Icd9 getIcd9ByCode(String code) throws MedrexException,
			RemoteException {

		return (new Icd9Service()).getIcd9ByCode(code);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getIcd9s(java.lang.String)
	 */
	public List getIcd9s(String likeStr) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting ICD9s";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new Icd9Service()).getIcd9s(likeStr);
	}

	public List<Icd9> getIcd9s(String text, String selectedButton)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of ICD9s on Text:" + text + "and selected button:"
				+ selectedButton;
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new Icd9Service()).getIcd9s(text, selectedButton);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#getIcd9(int)
	 */
	public Icd9 getIcd9(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting ICD9s";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		return (new Icd9Service()).getIcd9(serial);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.MedrexIntf#deleteIcd9(int)
	 */
	public void deleteIcd9(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting ICD9s";
		Logger.getInstance().log(LoggerModule.CENSUS_COUNT, action, msg);

		(new Icd9Service()).deleteIcd9(serial);
	}

	public int insertOrUpdateAccurities(List<Accurities> accList, String floor,
			Date d) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (accList != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Accurities";
		Logger.getInstance().log(LoggerModule.ACCURITIES, action, msg);

		return (new AccuritiesService()).insertOrUpdateAccurities(accList,
				floor, d);
	}

	public List getCurrentAccuritiesList() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Current Accurities";
		Logger.getInstance().log(LoggerModule.ACCURITIES, action, msg);

		return ((new AccuritiesService()).getCurrentAccuritiesList());
	}

	/*
	 * public List getAccuritiesListByDate(Date d) throws MedrexException,
	 * RemoteException { String msg=null; LoggerAction action=LoggerAction.GET;
	 * msg="Getting List Of Accurities By Date";
	 * Logger.getInstance().log(LoggerModule.ACCURITIES,action,msg);
	 * 
	 * return ((new AccuritiesService()).getAccuritiesListByDate(d)); }
	 */

	public Accurities getAccurities(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Accurities";
		Logger.getInstance().log(LoggerModule.ACCURITIES, action, msg);

		return ((new AccuritiesService()).getAccurities(serial));
	}

	public void deleteAccurities(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Accurities";
		Logger.getInstance().log(LoggerModule.ACCURITIES, action, msg);

		(new AccuritiesService()).deleteAccurities(serial);
	}

	public List getAllTemplates() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Templates";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		return (new TemplatesService().getAllTemplates());
	}

	public int insertOrUpdateMedicationNotes(MedicationNotes notes)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (notes != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Medication Notes";
		Logger.getInstance().log(LoggerModule.ACCURITIES, action, msg);

		return ((new TemplatesService()).insertOrUpdateMedicationNotes(notes));
	}

	public List getTemplatesNoteText(int userId, int resId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All TemplatesNotesText";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);
		return (new TemplatesService().getTemplatesNoteText(userId, resId));
	}

	public MedicationNotes getMedicationNotes(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Medication Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		return (new TemplatesService().getMedicationNotes(serial));
	}

	public void deleteMedicationNotes(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Medication Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		new TemplatesService().deleteMedicationNotes(serial);
	}

	// Notes
	public int insertOrUpdateNotes(Notes notes) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (notes != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES, action, msg);

		return new NotesService().insertOrUpdateNotes(notes);
	}

	public Notes getNotes(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES, action, msg);

		return new NotesService().getNotes(serial);
	}

	public void deleteNotes(int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES, action, msg);

		new NotesService().deleteNotes(serial);
	}

	// CountAudit
	public int insertOrUpdateCountAudit(CountAudit refCountAudit)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refCountAudit != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Count Audit";
		Logger.getInstance().log(LoggerModule.COUNT_AUDIT, action, msg);

		return (new CountAuditService())
				.insertOrUpdateCountAudit(refCountAudit);
	}

	public List getCountAudits() throws MedrexException, RemoteException {
		return (new CountAuditService()).getCountAudits();
	}

	public List getCountAudits(Date date) throws MedrexException,
			RemoteException {
		return (new CountAuditService()).getCountAudits(date);
	}

	public CountAudit getCountAudit(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Count Audit";
		Logger.getInstance().log(LoggerModule.COUNT_AUDIT, action, msg);

		return (new CountAuditService()).getCountAudit(serial);
	}

	public void deleteCountAudit(int serial) throws MedrexException,
			RemoteException {
		(new CountAuditService()).deleteCountAudit(serial);
	}

	public int insertOrUpdateCountAuditFloor(CountAuditFloor refCountAuditFloor)
			throws MedrexException, RemoteException {
		if (refCountAuditFloor != null) {
		}
		return (new CountAuditFloorService())
				.insertOrUpdateCountAuditFloor(refCountAuditFloor);
	}

	public List getCountAuditFloors() throws MedrexException, RemoteException {
		return (new CountAuditFloorService()).getCountAuditFloors();
	}

	public CountAuditFloor getCountAuditFloor(int serial)
			throws MedrexException, RemoteException {
		return (new CountAuditFloorService()).getCountAuditFloor(serial);
	}

	public void deleteCountAuditFloor(int serial) throws MedrexException,
			RemoteException {
		(new CountAuditFloorService()).deleteCountAuditFloor(serial);
	}

	public int insertOrUpdateCountAuditStatus(
			CountAuditStatus refCountAuditStatus) throws MedrexException,
			RemoteException {
		if (refCountAuditStatus != null) {
		}
		return (new CountAuditStatusService())
				.insertOrUpdateCountAuditStatus(refCountAuditStatus);
	}

	public List<CountAuditStatus> getCountAuditStatuss()
			throws MedrexException, RemoteException {
		return (new CountAuditStatusService()).getCountAuditStatuss();
	}

	public CountAuditStatus getCountAuditStatus(int serial)
			throws MedrexException, RemoteException {
		return (new CountAuditStatusService()).getCountAuditStatus(serial);
	}

	public CountAuditStatus getCountAuditStatusOfToday()
			throws MedrexException, RemoteException {
		return (new CountAuditStatusService()).getCountAuditStatusOfToday();
	}

	public void deleteCountAuditStatus(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "deleting Count Audit Status ";
		Logger.getInstance().log(LoggerModule.COUNT_AUDIT, action, msg);

		(new CountAuditStatusService()).deleteCountAuditStatus(serial);
	}

	public String get1stFloorResident() throws MedrexException, RemoteException {
		return (new CountAuditFloorService()).get1stFloorResident();
	}

	public String get2ndFloorResident() throws MedrexException, RemoteException {
		return (new CountAuditFloorService()).get2ndFloorResident();
	}

	public int insertOrUpdateTemplates(Templates templates)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (templates != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Templates";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		return (new TemplatesService().insertOrUpdateTemplates(templates));
	}

	public Templates getTemplate(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Template";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		return (new TemplatesService().getTemplate(serial));
	}

	public List getTemplate(String formName) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Templates for the form Name:" + formName;
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		return (new TemplatesService().getTemplate(formName));
	}

	public void deleteTemplate(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Template";
		Logger.getInstance().log(LoggerModule.ADMIN_TEMPLATES, action, msg);

		new TemplatesService().deleteTemplate(serial);
	}

	public List getNotesCategories(String formName) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Notes Categories";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES_NoteCategories,
				action, msg);

		return (new NotesCategoriesService().getNotesCategories(formName));
	}

	public List getLatestNotes(String formName, int userId,
			NotesCategories notesCat) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Latest Notes";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES, action, msg);

		return (new NotesService().getLatestNotes(formName, userId, notesCat));
	}

	public int insertOrUpdateNotesCategories(NotesCategories notesCategories)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (notesCategories != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Notes Categories";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES_NoteCategories,
				action, msg);

		return ((new NotesCategoriesService())
				.insertOrUpdateNotesCategories(notesCategories));
	}

	public NotesCategories getNotesCategories(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Notes Categories";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES_NoteCategories,
				action, msg);

		return (new NotesCategoriesService().getNotesCategories(serial));
	}

	public void deleteNotesCategories(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Notes Categories";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES_NoteCategories,
				action, msg);

		new NotesCategoriesService().deleteNotesCategories(serial);
	}

	public List getAllNotesCategories() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All Notes Categories";
		Logger.getInstance().log(LoggerModule.ADMIN_NOTES_NoteCategories,
				action, msg);

		return ((new NotesCategoriesService()).getAllNotesCategories());

	}

	public int insertOrUpdateDietList(DietList diet) throws MedrexException,
			RemoteException {
		return ((new DietService()).insertOrUpdateDietList(diet));
	}

	public DietList getDiet(int serial) throws MedrexException, RemoteException {
		return ((new DietService()).getDiet(serial));
	}

	public List getAllDiets() throws MedrexException, RemoteException {
		return ((new DietService()).getAllDiets());
	}

	public void deleteDiet(int serial) throws MedrexException, RemoteException {
		(new DietService()).deleteDiet(serial);
	}

	public List<DietList> getDietByCategory(String cat) throws MedrexException,
			RemoteException {
		return (new DietService()).getDietByCategory(cat);
	}

	public int insertOrUpdateDietPlan(DietPlan dietPlan)
			throws MedrexException, RemoteException {
		return (new DietService()).insertOrUpdateDietPlan(dietPlan);
	}

	public List<DietPlan> getAllDietPlan() throws MedrexException,
			RemoteException {
		return (new DietService()).getAllDietPlan();
	}

	public List<DietPlan> getDietPlanByCategory(String cat)
			throws MedrexException, RemoteException {
		return (new DietService()).getDietPlanByCategory(cat);
	}

	public List<DietPlan> getDietPlanByDietName(String dietName)
			throws MedrexException, RemoteException {
		return (new DietService()).getDietPlanByDietName(dietName);
	}

	public DietPlan getDietPlan(int serial) throws MedrexException,
			RemoteException {
		return (new DietService()).getDietPlan(serial);
	}

	public void deleteDietPlan(int serial) throws MedrexException,
			RemoteException {
		new DietService().deleteDietPlan(serial);
	}

	public int insertOrUpdateDietPlanByDate(DietPlanByDate dietPlanByDate)
			throws MedrexException, RemoteException {
		return new DietService().insertOrUpdateDietPlanByDate(dietPlanByDate);
	}

	public DietPlanByDate getDietPlanByDate(String date)
			throws MedrexException, RemoteException {
		return new DietService().getDietPlanByDate(date);
	}

	public void insertOrUpdateMasterListRecord(MasterList ref) throws Exception {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Master List Record";
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		new MasterListService().insertOrUpdateMasterListRecord(ref);

	}

	public void deleteMasterListRecord(Class cls, int id) throws Exception {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Master List Record";
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		new MasterListService().deleteMasterListRecord(cls, id);

	}

	public MasterList getMasterListRecord(Class cls, int id) throws Exception {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Master List Record";
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		return (new MasterListService().getMasterListRecord(cls, id));

	}

	public MasterList getMasterListRecord(Class cls, String name)
			throws Exception {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Master List Record with Class:" + cls + " And Name:"
				+ name;
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		return (new MasterListService().getMasterListRecord(cls, name));

	}

	public List<MasterList> getMasterListRecords(Class cls) throws Exception {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of MasterList Records with Class:" + cls;
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		return (new MasterListService().getMasterListRecords(cls));

	}

	public int getMasterList(Class cls, String retrieveString)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Number of MasterList with Class:" + cls
				+ "And Retrieved String :" + retrieveString;
		Logger.getInstance().log(LoggerModule.MASTERLIST, action, msg);

		return (new MasterListService().getMasterList(cls, retrieveString));

	}

	public List<CensusStatus> getAllCensus(Date dFrom, Date dTo)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Census Status from date:" + dFrom
				+ "to Date:" + dTo;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService().getAllCensus(dFrom, dTo));
	}

	public List getAllCensusStatusByYear() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Census Status By Year";
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService().getAllCensusStatusByYear());
	}

	public List<CensusStatus> getCensusAdmissionReportData(Date from, Date to)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Census Status for Census Admission Report Data from date:"
				+ from + "to Date:" + to;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()
				.getCensusAdmissionReportData(from, to));
	}

	public List<CensusStatus> getCensusDischargeReportData(Date from, Date to)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Census Status for Census Discharge Report Data from date:"
				+ from + "to Date:" + to;
		Logger.getInstance().log(LoggerModule.CENSUS, action, msg);

		return (new CensusStatusService()
				.getCensusDischargeReportData(from, to));
	}

	public void deleteDoctorProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Doctor progress Notes Form Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_PROGRESSNOTES_DoctorsProgressNotes,
				action, msg);

		new DoctorProgressNotesFormService()
				.deleteDoctorsProgressNotesFormRow(formId);

	}

	public void deleteInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Inter Disciplinary progress Notes Form Row";
		Logger
				.getInstance()
				.log(
						LoggerModule.RESIDENT_PROGRESSNOTES_InterDisciplinaryProgressNotesForm,
						action, msg);

		new InterDisciplinaryProgressNotesFormService()
				.deleteInterDisciplinaryProgressNotesFormRow(formId);

	}

	// Form Scheduler
	public void deleteFormSchedule(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Form Schedule";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		(new FormScheduleService()).deleteFormSchedule(serial);
	}

	public ResidentMain getResident(int residentId, int activeId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident with Resident Id:" + residentId
				+ "And Active Id:" + activeId;
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return (new ResidentMainService().getResident(residentId, activeId));
	}

	public ResidentMain getResidentFloorWise(int residentId, String floor)
			throws MedrexException, RemoteException {
		return (new ResidentMainService().getResidentFloorWise(residentId,
				floor));
	}

	public FormSchedule getFormSchedule(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Form Schedule";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return (new FormScheduleService()).getFormSchedule(serial);
	}

	public List<FormSchedule> getFormSchedules() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Form Schedules";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return (new FormScheduleService()).getFormSchedules();
	}

	public int insertOrUpdateFormSchedule(FormSchedule ref)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Form Schedule";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return (new FormScheduleService()).insertOrUpdateFormSchedule(ref);
	}

	public List<ResidentMain> getActiveResident(int str)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Active Resident";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return (new ResidentMainService().getActiveResident(str));
	}

	public float serverVersion() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Server Version";
		Logger.getInstance().log(LoggerModule.ADMIN_FORMSCHEDULER, action, msg);

		return Global.serverversion;
	}

	// /
	public void deletePendingForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Pending Form";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		(new PendingFormService()).deletePendingForm(serial);
	}

	public PendingForm getPendingForm(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pending Form";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getPendingForm(serial);
	}

	public List<PendingForm> getPendingForms() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getPendingForms();
	}

	public List<PendingForm> getPendingFormsByResidentId(int residentId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms By Resident ID:" + residentId;
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getPendingFormsByResident(residentId);
	}

	public int insertOrUpdatePendingForm(PendingForm ref)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (ref != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Pending Form";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).insertOrUpdatePendingForm(ref);
	}

	public List getPendingFormsAccordingResident() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms According to Resident";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getPendingFormsAccordingResident();
	}

	public List getPendingAlert() throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Alerts ";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getPendingAlert();
	}

	public List getFirstFloorPendingFormResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms of Residents in First Floor";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getFirstFloorPendingFormResidents();
	}

	public List getSecondFloorPendingFormResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms of Residents in Second Floor";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService()).getSecondFloorPendingFormResidents();
	}

	public List getSecondFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms Alerts of Residents in Second Floor";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService())
				.getSecondFloorPendingFormAlertResidents();
	}

	public List getFirstFloorPendingFormAlertResidents()
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of All Pending Forms Alerts of Residents in First Floor";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingFormService())
				.getFirstFloorPendingFormAlertResidents();
	}

	public List getLabReportList(int residentId) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Lab Reports";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		return (new LabReportService()).getLabReportList(residentId);
	}

	public Report getLabReports(int serial) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Lab Report";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		return (new LabReportService()).getLabReports(serial);
	}

	public void insertOrUpdatedLabReportText(Report rep)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rep != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Lab Report Text";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		(new LabReportService()).insertOrUpdatedLabReportText(rep);
	}

	public List getAllNewLabReportsResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting All New Lab Reports Residents";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		return (new LabReportService()).getAllNewLabReportsResidents();
	}

	public List getFirstFloorNewLabReportResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting All New Lab Reports for the residents in Residents first floor";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		return (new LabReportService()).getFirstFloorNewLabReportResidents();
	}

	public List getSecondFloorNewLabReportResidents() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting All New Lab Reports for the residents in Residents Second floor";
		Logger.getInstance().log(LoggerModule.LABREPORTS, action, msg);

		return (new LabReportService()).getSecondFloorNewLabReportResidents();
	}

	public int insertOrUpdateResidentAssessmentFormPage19(
			ResidentAssessmentFormPage19 refResidentAssessmentForm19)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refResidentAssessmentForm19 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page 19";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return ((new ResidentAssessmentFormService())
				.insertOrUpdateResidentAssessmentFormPage19(refResidentAssessmentForm19));
	}

	public int insertOrUpdateResidentassessmentFormPage19Col(
			List<ResidentAssessmentFormPage19Col> columns)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (columns != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Assessment Form Page 19 Column";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.insertOrUpdateDoctorsProgressNotesFormRows(columns);

	}

	public ResidentAssessmentFormPage19 getResidentAssessmentFormPage19(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Resident Assessment Form Page 19";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage19(currentResidentAssessmentFormPage19Key);
	}

	public List<ResidentAssessmentFormPage19Col> getResidentAssessmentFormPage19Columns(
			int currentResidentAssessmentFormPage19Key) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of Resident Assessment Form Page 19 Column";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService())
				.getResidentAssessmentFormPage19Columns(currentResidentAssessmentFormPage19Key);
	}

	public void insertOrUpdateDailySkilledNursesNotesRows(
			List<DailySkilledNursesNotesRow> rows) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (rows != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Daily Skilled Nurses Notes Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		new DailySkilledNursesNotesForm2Service()
				.insertOrUpdateDailySkilledNursesNotesRows(rows);
	}

	public int insertOrUpdateDailySkilledNursesNotesForm2(
			DailySkilledNursesNotesForm2 refForm2) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refForm2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Daily Skilled Nurses Notes Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		return (new DailySkilledNursesNotesForm2Service()
				.insertOrUpdateDailySkilledNursesNotesForm2(refForm2));
	}

	public DailySkilledNursesNotesForm2 getDailySkilledNursesNotesForm2(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Daily Skilled Nurses Notes Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		return (new DailySkilledNursesNotesForm2Service()
				.getDailySkilledNursesNotesForm2(serial));
	}

	public List<DailySkilledNursesNotesRow> getDailySkilledNursesNotesRows(
			int serial) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Daily Skilled Nurses Notes Form Rows";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		return (new DailySkilledNursesNotesForm2Service()
				.getDailySkilledNursesNotesRows(serial));
	}

	public int insertOrUpdateDailySkilledNursesNotes(
			DailySkilledNursesNotes refDailySkilledNursesNotes)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refDailySkilledNursesNotes != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Daily Skilled Nurses Notes";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		return (new DailySkilledNursesNotesService()
				.insertOrUpdateDailySkilledNursesNotes(refDailySkilledNursesNotes));

	}

	// AutoLogOff
	public void insertOrUpdateScreenSaverConfig(Config config)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (config != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Screen Saver Config";
		Logger.getInstance().log(LoggerModule.ADMIN_SCREENSAVER, action, msg);

		new ConfigService().insertOrUpdateScreenSaverConfig(config);
	}

	public Config getScreenSaverConfig() throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Screen Saver Config";
		Logger.getInstance().log(LoggerModule.ADMIN_SCREENSAVER, action, msg);
		return (new ConfigService().getScreenSaverConfig());
	}

	// Alert
	public int insertOrUpdateAlert(Alert alert) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (alert != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Resident Alerts";
		Logger.getInstance().log(LoggerModule.RESIDENT_ALERT, action, msg);

		return (new AlertService().insertOrUpdateAlert(alert));
	}

	public List getAlertList(int currentResidenceKey) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Alert List with Resident Key:"
				+ currentResidenceKey;
		Logger.getInstance().log(LoggerModule.RESIDENT_ALERT, action, msg);

		return (new AlertService().getAlertList(currentResidenceKey));
	}

	public void deleteAlertRecord(int id) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Alert Records";
		Logger.getInstance().log(LoggerModule.RESIDENT_ALERT, action, msg);

		new AlertService().deleteAlertRecord(id);
	}

	public Alert getAlertRecord(int currentResidenceKey)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Alert Records with Resident Key:" + currentResidenceKey;
		Logger.getInstance().log(LoggerModule.RESIDENT_ALERT, action, msg);

		return (new AlertService().getAlertRecord(currentResidenceKey));
	}

	public DailySkilledNursesNotes getDailySkilledNursesNotes(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Daily Skilled Nurses Notes";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		return (new DailySkilledNursesNotesService()
				.getDailySkilledNursesNotes(currentDailySkilledNursesNotesKey));
	}

	public void deleteDailySkilledNursesNotes(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Daily Skilled Nurses Notes";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		new DailySkilledNursesNotesService()
				.deleteDailySkilledNursesNotes(formId);
	}

	public void deleteDailySkilledNursesNotesForm2(int serial)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Daily Skilled Nurses Notes Form2";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);

		new DailySkilledNursesNotesForm2Service()
				.deleteDailySkilledNursesNotesForm2(serial);

	}

	public void deleteDailySkilledNursesNotesRow(
			int currentDailySkilledNursesNotesForm2Key) throws MedrexException,
			RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Daily Skilled Nurses Notes Row";
		Logger.getInstance().log(
				LoggerModule.RESIDENT_MEDICATION_DailySkilledNursesNotes,
				action, msg);
		new DailySkilledNursesNotesForm2Service()
				.deleteDailySkilledNursesNotesRow(currentDailySkilledNursesNotesForm2Key);
	}

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage1(
			SocialServiceInitialAssessmentFormPage1 refSocialServiceForm1)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refSocialServiceForm1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Social Service Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new SocialServiceInitialAssessmentService())
				.insertOrUpdateSocialServiceInitialAssessmentFormPage1(refSocialServiceForm1);
	}

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage2(
			SocialServiceInitialAssessmentFormPage2 refSocialServiceForm2)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refSocialServiceForm2 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Social Service Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new SocialServiceInitialAssessmentService())
				.insertOrUpdateSocialServiceInitialAssessmentFormPage2(refSocialServiceForm2);
	}

	public SocialServiceInitialAssessmentFormPage1 getSocialServiceInitialAssessmentFormPage1(
			int currentSocialServiceInitialAssessmentKey)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Social Service Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new SocialServiceInitialAssessmentService()
				.getSocialServiceInitialAssessmentFormPage1(currentSocialServiceInitialAssessmentKey));
	}

	public SocialServiceInitialAssessmentFormPage2 getSocialServiceInitialAssessmentFormPage2(
			int currentSocialServiceInitialAssessmentForm2Key)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Social Service Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new SocialServiceInitialAssessmentService()
				.getSocialServiceInitialAssessmentFormPage2(currentSocialServiceInitialAssessmentForm2Key));
	}

	public void deleteSocialServiceInitialAssessmentFormPage1(int formId)
			throws MedrexException, RemoteException {

		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Social Service Initial Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		new SocialServiceInitialAssessmentService()
				.deleteSocialServiceInitialAssessmentFormPage1(formId);
	}

	public void deleteSocialServiceInitialAssessmentFormPage2(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting Social Service Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		new SocialServiceInitialAssessmentService()
				.deleteSocialServiceInitialAssessmentFormPage2(formId);

	}

	// Nutrition Support
	public int insertOrUpdateNutritionSupportAssessmentFormPage1(
			NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.INSERT;
		if (refNutritionSupportAssessmentFormPage1 != null) {
			action = LoggerAction.UPDATE;
		}
		msg = "Inserting Or Updating Social Service Initial Assessment Form Page2";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new NutritionSupportAssessmentFormService()
				.insertOrUpdateNutritionSupportAssessmentFormPage1(refNutritionSupportAssessmentFormPage1));
	}

	public NutritionSupportAssessmentFormPage1 getNutritionSupportAssessmentFormPage1(
			int currentNutritionSupportAssessmentFormKey)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Nutrition Support Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new NutritionSupportAssessmentFormService()
				.getNutritionSupportAssessmentFormPage1(currentNutritionSupportAssessmentFormKey));
	}

	public void deleteNutritionSupportAssessmentFormPage1(int formId)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.DELETE;
		msg = "Deleting  Nutrition Support Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		new NutritionSupportAssessmentFormService()
				.deleteNutritionSupportAssessmentFormPage1(formId);

	}

	public ResidentAssessmentFormPage1 getLatestResidentAssessmentFormPage1(
			int residentId) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Latest Resident Assessment Form Page1";
		Logger.getInstance().log(LoggerModule.RESIDENT_ASSESSMENT, action, msg);

		return (new ResidentAssessmentFormService()
				.getLatestResidentAssessmentFormPage1(residentId));
	}

	// public int insertOrUpdatePendingAlert(PendingAlert pa)
	// throws MedrexException, RemoteException {
	// String msg = null;
	// LoggerAction action = LoggerAction.INSERT;
	// if (pa != null) {
	// action = LoggerAction.UPDATE;
	// }
	// msg = "Inserting Or Updating Pending Alert";
	// Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);
	//
	// return (new PendingAlertService().insertOrUpdatePendingAlert(pa));
	// }

	public List getPendingAlertList(int currentResidenceKey, String str,
			int key, String type) throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List of All Pending Alert";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingAlertService().getPendingAlertList(
				currentResidenceKey, str, key, type));
	}

	// public void deletePendingAlertRecord(int id) throws MedrexException,
	// RemoteException {
	// String msg = null;
	// LoggerAction action = LoggerAction.GET;
	// msg = "Deleting Pending Alert Records";
	// Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);
	//
	// new PendingAlertService().deletePendingAlertRecord(id);
	// }

	public List getPendingAlertRecords(int currentAlertKey)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting Pending Alert Records with the Current Alert Key:"
				+ currentAlertKey;
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingAlertService()
				.getPendingAlertRecords(currentAlertKey));
	}

	public int getTotalPendingAlertCount() throws MedrexException,
			RemoteException {
		return (new PendingAlertService().getTotalPendingAlertCount());
	}

	public List getResidentPendingAlerts(String str, int key)
			throws MedrexException, RemoteException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "Getting List Of Resident Pending Alert";
		Logger.getInstance().log(LoggerModule.DASHBOARD, action, msg);

		return (new PendingAlertService().getResidentPendingAlerts(str, key));
	}

	public List<UserLogon> getFilteredUsers(Date from, Date to)
			throws MedrexException, RemoteException {
		return (new UserLogonService().getFilteredUsers(from, to));
	}

	public List getAccutiesDate() throws MedrexException, RemoteException {
		return (new AccuritiesService().getAccutiesDate());
	}

	public List getAccuritiesListByDate(Date d, String floor)
			throws MedrexException, RemoteException {
		return ((new AccuritiesService()).getAccuritiesListByDate(d, floor));
	}

	public int getCountAuditSeialByDateFloor(Date date, String floor)
			throws MedrexException, RemoteException {
		return (new CountAuditService()).getCountAuditSeialByDateFloor(date,
				floor);
	}

	public int getUpcomingAlerts(int time, String type, String key)
			throws MedrexException, RemoteException {
		return (new PendingAlertService().getUpcomingAlerts(time, type, key));
	}

	public int getTotalPastAlerts(String key) throws MedrexException,
			RemoteException {
		return (new PendingAlertService().getTotalPastAlerts(key));
	}

	public Alert getGlobalAlertRecord(int id) throws MedrexException,
			RemoteException {
		return (new AlertService().getGlobalAlertRecord(id));
	}

	public List getGlobalAlertList(int globalAlertId, int userKey)
			throws MedrexException, RemoteException {
		return (new AlertService().getGlobalAlertList(globalAlertId, userKey));
	}

	// public List getGlobalPendingAlertList(int globalAlertId)
	// throws MedrexException, RemoteException {
	// return (new
	// PendingAlertService().getGlobalPendingAlertList(globalAlertId));
	// }

	public int getGlobalUpcomingAlerts(int time, String str, String key)
			throws MedrexException, RemoteException {
		return (new PendingAlertService().getGlobalUpcomingAlerts(time, str,
				key));
	}

	public int getGlobalTotalPastAlerts(String key) throws MedrexException,
			RemoteException {
		return (new PendingAlertService().getGlobalTotalPastAlerts(key));
	}

	public List getDepartmentList() throws MedrexException, RemoteException {
		return (new UserService()).getDepartmentList();
	}

	public List<Users> getUserListFromDepartment(String user)
			throws MedrexException, RemoteException {
		return (new UserService()).getUserListFromDepartment(user);
	}

	public void insertOrUpdateAlertSetting(AlertSetting as)
			throws MedrexException, RemoteException {
		new AlertService().insertOrUpdateAlertSetting(as);
	}

	public List getAlertSetting() throws MedrexException, RemoteException {
		return (new AlertService().getAlertSetting());
	}

	// public PendingAlert getPendingAlert(int currentPendingAlertKey)
	// throws MedrexException, RemoteException {
	// return (new PendingAlertService()
	// .getPendingAlert(currentPendingAlertKey));
	// }

	// public List<PendingAlert> getPendingAlertList(String string) throws
	// MedrexException,
	// RemoteException {
	// return (new PendingAlertService().getPendingAlertList(string));
	// }

	public List getResidentFutureAlerts(int time, String type,
			String currentLoggedInUserName) throws MedrexException,
			RemoteException {
		return (new PendingAlertService().getResidentFutureAlerts(time, type,
				currentLoggedInUserName));
	}

	public List getGlobalPendingAlerts(String currentLoggedInUserName)
			throws MedrexException, RemoteException {
		return (new PendingAlertService()
				.getGlobalPendingAlerts(currentLoggedInUserName));
	}

	public List getPendingOwnerList(int currentLoggedInUserKey)
			throws MedrexException, RemoteException {
		return (new AlertService().getPendingOwnerList(currentLoggedInUserKey));
	}

	public int getCompletedAlertsCount(int key, String str)
			throws MedrexException, RemoteException {
		return (new PendingAlertService().getCompletedAlertsCount(key, str));
	}

	public int getAlertCountSentByMe(int key) throws MedrexException,
			RemoteException {
		return (new PendingAlertService().getAlertCountSentByMe(key));
	}

	public int getGlobalCompletedAlertsCount(int key, String str)
			throws MedrexException, RemoteException {
		return (new PendingAlertService().getGlobalCompletedAlertsCount(key,
				str));
	}

	public int getGlobalAlertCountSentByMe(int currentLoggedInUserKey)
			throws MedrexException, RemoteException {
		return (new PendingAlertService()
				.getGlobalAlertCountSentByMe(currentLoggedInUserKey));
	}

	public MedrexServer getMedrexServer() throws MedrexException,
			RemoteException {
		return Global.medrexServer;
	}

	// Trigger Word
	public int insertOrUpdateTriggerWord(TriggerWord tw)
			throws MedrexException, RemoteException {
		return (new TriggerWordService().insertOrUpdateTriggerWord(tw));
	}

	public TriggerWord getTriggerWord(int serial) throws MedrexException,
			RemoteException {
		return (new TriggerWordService().getTriggerWord(serial));
	}

	public List<TriggerWord> getAllTriggerWords() throws MedrexException,
			RemoteException {
		return (new TriggerWordService().getAllTriggerWords());
	}

	public void deleteTriggerWord(int id) throws MedrexException,
			RemoteException {
		new TriggerWordService().deleteTriggerWord(id);
	}

	public List getTriggerWordList() throws MedrexException, RemoteException {
		return new TriggerWordService().getTriggerWordList();
	}

	public void deletePressureSoreAssessment(int formId)
			throws MedrexException, RemoteException {
		new ResidentAssessmentFormService()
				.deletePressureSoreAssessment(formId);
	}

	public int getCarePlanAnalyzerCount() throws MedrexException,
			RemoteException {
		return (new CarePlanAnalyzerService().getCarePlanAnalyzerCount());
	}

	public List getCarePlanAnalyzerResidentCount() throws MedrexException,
			RemoteException {
		return (new CarePlanAnalyzerService()
				.getCarePlanAnalyzerResidentCount());
	}

	// Admin Medication
	public Long insertOrUpdateMedications(Medication med)
			throws MedrexException, RemoteException {
		return (new MedicationService().insertOrUpdateMedications(med));
	}

	public Medication getMedication(long serial) throws MedrexException,
			RemoteException {
		return (new MedicationService().getMedication(serial));
	}

	public List<Medication> getAllMedications() throws MedrexException,
			RemoteException {
		return (new MedicationService().getAllMedications());
	}

	public void deleteMedication(long serial) throws MedrexException,
			RemoteException {
		new MedicationService().deleteMedication(serial);
	}

	public List<CarePlanAnalyzerBean> getCarePlanAnalyzerByResidentId(
			int residentId) throws MedrexException, RemoteException {

		return (new CarePlanAnalyzerService()
				.getCarePlanAnalyzerByResidentId(residentId));
	}

	// public List<PendingAlert> getPendingPastAlertList(int
	// currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws MedrexException,
	// RemoteException {
	// return (new PendingAlertService().getPendingPastAlertList(
	// currentResidenceKey, currentLoggedInUserName,
	// currentLoggedInUserKey, currentLoggedInUserType));
	// }

	// public List<PendingAlert> getPendingUpcomingAlertList(int alertTime,
	// String alertType, int currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType) throws MedrexException,
	// RemoteException {
	// return (new PendingAlertService().getPendingUpcomingAlertList(
	// alertTime, alertType, currentResidenceKey,
	// currentLoggedInUserName, currentLoggedInUserKey,
	// currentLoggedInUserType));
	// }

	// public List<PendingAlert> getPendingCompletedAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws MedrexException, RemoteException {
	// return (new PendingAlertService().getPendingCompletedAlertList(
	// currentResidenceKey, currentLoggedInUserKey));
	// }

	// public List<PendingAlert> getPendingISendOutAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)
	// throws MedrexException, RemoteException {
	// return (new PendingAlertService().getPendingISendOutAlertList(
	// currentResidenceKey, currentLoggedInUserKey));
	// }

	// public List getResidentAlertsISendOut(int currentLoggedInUserKey)
	// throws MedrexException, RemoteException {
	// return new PendingAlertService()
	// .getResidentAlertsISendOut(currentLoggedInUserKey);
	// }

	// public List getResidentAlertsCompleted(int currentLoggedInUserKey)
	// throws MedrexException, RemoteException {
	// return new PendingAlertService()
	// .getResidentAlertsCompleted(currentLoggedInUserKey);
	// }

	public void suspendAlert(int serial, int time, String type)
			throws MedrexException, RemoteException {
		new CalculatedAlertService().suspendAlert(serial, time, type);
	}

	public void insertOrUpdateNursinhHome(NursingHome nh)
			throws MedrexException, RemoteException {
		new NursingHomeService().insertOrUpdateNursinhHome(nh);
	}

	public NursingHome getNursingHomeInfo(int i) throws MedrexException,
			RemoteException {
		return new NursingHomeService().getNursingHomeInfo(i);
	}

	public List getRichTextFieldValues(String rtfType, String key)
			throws MedrexException, RemoteException {
		return new RichTextFieldService().getRichTextFieldValues(rtfType, key);
	}

	public void insertOrUpdateRichTextFieldValue(RichTextField rtf)
			throws MedrexException, RemoteException {
		new RichTextFieldService().insertOrUpdateRichTextFieldValue(rtf);
	}

	// for test RA
	public int insertOrUpdateRARecord(RARecord raRecord)
			throws RemoteException, MedrexException {
		return new RAService().insertOrUpdateRARecord(raRecord);
	}

	public List<DataObject> getRARecord(int serial) throws MedrexException,
			RemoteException {
		return new RAService().getRARecord(serial);
	}

	public List<RARecord> getRARecordList(int residentId)
			throws MedrexException, RemoteException {
		return new RAService().getRARecordList(residentId);
	}

	public void deleteRARecord(int serial) throws MedrexException,
			RemoteException {
		new RAService().deleteRARecord(serial);
	}

	public void deleteRAFPg1Record(int serial) throws MedrexException,
			RemoteException {
		new RAService().deleteRAFPg1Record(serial);
	}

	public void deleteRAFPg2Record(int serial) throws MedrexException,
			RemoteException {
		new RAService().deleteRAFPg2Record(serial);
	}

	public int insertOrUpdateRAFPg1(RAFPg1 raPg1) throws MedrexException,
			RemoteException {
		return new RAService().insertOrUpdateRAFPg1(raPg1);
	}

	public RAFPg1 getRAFP1(int serial) throws RemoteException, MedrexException {
		return new RAService().getRAFP1(serial);
	}

	public int insertOrUpdateRAFPg2(RAFPg2 raPg2) throws MedrexException,
			RemoteException {
		return new RAService().insertOrUpdateRAFPg2(raPg2);
	}

	public RAFPg2 getRAFPg2(int serial) throws RemoteException, MedrexException {
		return new RAService().getRAFPg2(serial);
	}

	public void saveRAFPages(List<DataObject> listDataObjects)
			throws RemoteException, MedrexException {
		new RAService().saveRAFPages(listDataObjects);
	}

	/*
	 * public int insertOrUpdateRoomHistory(RoomHistory roomHistory) throws
	 * MedrexException, RemoteException { return (new RoomHistroySerivice()
	 * .insertOrUpdateRoomHistory(roomHistory)); }
	 */

	public int insertOrUpdateRoomHistory(TempRoomHistory roomHistory)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()
				.insertOrUpdateTempRoomHistory(roomHistory));
	}

	public List<TempRoomHistory> getRoomHistory(Date from, Date to)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice().getRoomHistory(from, to));
	}

	public List<RoomHistory> getRoomHistory(int residentId)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice().getRoomHistory(residentId));
	}

	/*
	 * public RoomHistory getRoomHistory(int residentId, Date date) throws
	 * MedrexException, RemoteException { return (new
	 * RoomHistroySerivice().getRoomHistory(residentId, date)); }
	 */

	public TempRoomHistory getRoomHistory(int residentId, Date date)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice().getRoomHistory(residentId, date));
	}

	public List<Rooms> getResidentCountAuditInfo(List<CountAuditFloor> records,
			Date searchDate) throws MedrexException, RemoteException {
		return (new RoomHistroySerivice().getResidentCountAuditInfo(records,
				searchDate));
	}

	/*
	 * public RoomHistory getLastRoomHistory(int residentId) throws
	 * MedrexException, RemoteException { return (new
	 * RoomHistroySerivice()).getLastRoomHistory(residentId); }
	 */
	public TempRoomHistory getLastRoomHistory(int residentId)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()).getLastRoomHistory(residentId);
	}

	// Getting current room for resident
	public TempRoomHistory getCurrentRoomForResident(int residentId)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice())
				.getCurrentRoomForResident(residentId);
	}

	// Getting all Room Histories Data according to dateAndTime
	public List<TempRoomHistory> getRoomHistories(Date dateAndTime)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()).getRoomHistories(dateAndTime);
	}

	// Getting Room History Data according to dateAndTime and residentId
	public TempRoomHistory getRoomHistoriesForResident(int residentId,
			Date dateAndTime) throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()).getRoomHistoriesForResident(
				residentId, dateAndTime);
	}

	// Getting Room Histories Data according to residentId
	public List<TempRoomHistory> getRoomHistoriesForResident(int residentId)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice())
				.getRoomHistoriesForResident(residentId);
	}

	// Getting current room for resident
	public TempRoomHistory getRoomForResident(int residentId,
			Date currentDateAndTime) throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()).getRoomForResident(residentId,
				currentDateAndTime);
	}

	// Getting room status for residents
	public List<Rooms> getRoomStatusForResidents(Date dateAndTime)
			throws MedrexException, RemoteException {
		return (new RoomHistroySerivice())
				.getRoomStatusForResidents(dateAndTime);
	}

	// Getting room status for residents according to dateAndTiem and floor wise
	public List<Rooms> getRoomStatusForResidents(Date dateAndTime,
			String floorType) throws MedrexException, RemoteException {
		return (new RoomHistroySerivice()).getRoomStatusForResidents(
				dateAndTime, floorType);
	}

	public List<CensusStatus> getCensusDayReportAdmissionList(Date date)
			throws RemoteException, MedrexException {
		return (new CensusStatusService().getCensusDayReportAdmissionList(date));
	}

	public List<CensusStatus> getCensusDayReportDischargeList(Date date)
			throws RemoteException, MedrexException {
		return (new CensusStatusService().getCensusDayReportDischargeList(date));
	}

	public List<CensusStatus> getCensusDayReportOutOnPassList(Date date)
			throws RemoteException, MedrexException {
		return (new CensusStatusService().getCensusDayReportOutOnPassList(date));
	}

	public List<CensusStatus> getCensusDayReportHospitalList(Date date)
			throws RemoteException, MedrexException {
		return (new CensusStatusService().getCensusDayReportHospitalList(date));
	}

	public List<RoomChange> getRoomChange(Date searchDate)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice().getRoomChange(searchDate));
	}

	public List<RoomChange> getRoomChangeFirstFloor(Date searchDate)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice().getRoomChangeFirstFloor(searchDate));
	}

	public List<RoomChange> getRoomChangeSecondFloor(Date searchDate)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice().getRoomChangeSecondFloor(searchDate));
	}

	/*
	 * public TempRoomHistory getRoomHistoryAccToCensus(int cenId) throws
	 * RemoteException, MedrexException { return (new
	 * RoomHistroySerivice().getRoomHistoryAccToCensus(cenId)); }
	 */

	public TempRoomHistory getRoomHistoryAccToCensusAdmission(int cenAdmissionId)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice()
				.getRoomHistoryAccToCensusAdmission(cenAdmissionId));
	}

	public TempRoomHistory getRoomHistoryAccToCensusDischarge(int cenDischargeId)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice()
				.getRoomHistoryAccToCensusDischarge(cenDischargeId));
	}

	public int getPhysicalDailyKeyByDate(Date cal) throws RemoteException,
			MedrexException {
		return (new PtOtStPhysicalDailyRecordService()
				.getPhysicalDailyKeyByDate(cal));
	}

	public PtOtStOccupationalTherapy getExistingOccupationalTherapyForm700(
			Date fromDate, Date toDate) throws RemoteException, MedrexException {
		return (new PtOtStOccupationalTherapyService()
				.getExistingOccupationalTherapyForm700(fromDate, toDate));
	}

	public PtOtStSpeechLanguage getExistingSpeechLanguageForm700(Date fromDate,
			Date toDate) throws RemoteException, MedrexException {

		return (new PtOtStSpeechLanguageService()
				.getExistingSpeechLanguageForm700(fromDate, toDate));
	}

	public List<CensusStatus> getCensusSignInOutReportData(Date from, Date to)
			throws RemoteException, MedrexException {
		return (new CensusStatusService()
				.getCensusSignInOutReportData(from, to));
	}

	public int insertOrUpdateCarePlanValues(CarePlanValues careValues)
			throws RemoteException, MedrexException {
		return (new CarePlanAnalyzerService()
				.insertOrUpdateCarePlanValues(careValues));
	}

	public CarePlanValues getCarePlanValues(
			int currentResidentAssessmentFormKey, int currentResidenceKey)
			throws RemoteException, MedrexException {
		return (new CarePlanAnalyzerService().getCarePlanValues(
				currentResidentAssessmentFormKey, currentResidenceKey));
	}

	public void deleteResidentCarePlanValues(int formId, int currentResidenceKey)
			throws RemoteException, MedrexException {
		new CarePlanAnalyzerService().deleteResidentCarePlanValues(formId,
				currentResidenceKey);
	}

	public void lockUserStatus(String userID) throws RemoteException,
			MedrexException {
		String msg = null;
		LoggerAction action = LoggerAction.GET;
		msg = "setting the status of the user to locked ";
		Logger.getInstance().log(LoggerModule.USERS, action, msg);
		new UserService().lockUserStatus(userID);
	}

	public PasswordSetting getPasswordSetting() throws RemoteException,
			MedrexException {
		return (new PasswordSettingService().getPasswordSetting());
	}

	public int insertOrUpdatePasswordSettings(PasswordSetting ps)
			throws RemoteException, MedrexException {
		return (new PasswordSettingService().insertOrUpdatePasswordSettings(ps));
	}

	public List<Users> getUserWithStatus(int status) throws RemoteException,
			MedrexException {
		return (new UserService().getUserWithStatus(status));
	}

	public void changeUserStatus(int[] selectedUserId, int status)
			throws RemoteException, MedrexException {
		new UserService().changeUserStatus(selectedUserId, status);
	}

	public void deletegetAlertTimeRecord(int id) throws RemoteException,
			MedrexException {
		new AlertTimeService().deletegetAlertTimeRecord(id);
	}

	public List<CalculatedAlert> getCalculatedAlertList()
			throws RemoteException, MedrexException {
		return (new CalculatedAlertService().getCalculatedAlertList());
	}

	public List<CalculatedAlert> getCalculatedAlertListByUser(
			int currentLoggedInUserKey, String str, int key, String string)
			throws RemoteException, MedrexException {
		return (new CalculatedAlertService().getCalculatedAlertListByUser(
				currentLoggedInUserKey, str, key, string));
	}

	public int getCalculatedAlert(int id) throws RemoteException,
			MedrexException {
		return (new CalculatedAlertService().getCalculatedAlert(id));
	}

	public CalculatedAlert getCalculatedAlertBean(int serial)
			throws RemoteException, MedrexException {
		return (new CalculatedAlertService().getCalculatedAlertBean(serial));
	}

	public void insertOrUpdateCalculatedAlert(CalculatedAlert pa)
			throws RemoteException, MedrexException {
		new CalculatedAlertService().insertOrUpdateCalculatedAlert(pa);
	}

	public List getAllAlertCounts(int currentLoggedInUserKey)
			throws RemoteException, MedrexException {
		return new CalculatedAlertService()
				.getAllAlertCounts(currentLoggedInUserKey);
	}

	public String getUserName(int currentLoggedInUserkey)
			throws RemoteException, MedrexException {
		return (new UserService().getUserName(currentLoggedInUserkey));
	}

	public List getSignOutsER() throws RemoteException, MedrexException {
		return new SignOutService().getSignOutsER();
	}

	public List<SignOut> getErForResidents(Date date) throws RemoteException,
			MedrexException {
		return new SignOutService().getErForResidents(date);
	}

	public List getCurrentSlotTime(String floorType) throws RemoteException,
			MedrexException {
		return new MedicationCartService().getCurrentSlotTime(floorType);
	}

	public List<MedicationView> getMedicationsList(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return new MedicationCartService()
				.getMedicationsList(currentResidenceKey);
	}

	public void insertOrUpdateCalculatedMedication(CalculatedMedication cm)
			throws RemoteException, MedrexException {
		new MedicationCartService().insertOrUpdateCalculatedMedication(cm);
	}

	public Medications getMedications(int calcSerial) throws RemoteException,
			MedrexException {
		return new MedicationCartService().getMedications(calcSerial);
	}

	public List getMedicationHistoryTimes() throws RemoteException,
			MedrexException {
		return new MedicationCartService().getMedicationHistoryTimes();
	}

	public boolean getAdminUsers(String userName) throws RemoteException,
			MedrexException {
		return new UserService().getAdminUsers(userName);
	}

	public TempRoomHistory getRoomForResident(int serial, String str)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice()).getRoomForResident(serial, str);
	}

	// for page1
	public int insertOrUpdateMonthlySummaryPage1(
			MonthlySummaryPage1 refMonthlySummaryPage1) throws RemoteException,
			MedrexException {

		return new MonthlySummaryFormService()
				.insertOrUpdateMonthlySummaryPage1(refMonthlySummaryPage1);
	}

	public MonthlySummaryPage1 getMonthlySummaryPage1(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return new MonthlySummaryFormService().getMonthlySummaryPage1(msr);
	}

	// for 2nd page
	public MonthlySummaryPage2 getMonthlySummaryPage2(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return new MonthlySummaryFormService().getMonthlySummaryPage2(msr);
	}

	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryPage2 refMonthlySummaryPage2) throws RemoteException,
			MedrexException {

		return new MonthlySummaryFormService()
				.insertOrUpdateMonthlySummaryPage2(refMonthlySummaryPage2);
	}

	// for main page
	public MonthlySummaryMainPage getMonthlySummaryMainPage(
			MonthlySummaryRecord msr) throws RemoteException, MedrexException {

		return new MonthlySummaryFormService().getMonthlySummaryMainPage(msr);
	}

	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryMainPage refMonthlySummaryMainPage)
			throws RemoteException, MedrexException {
		return new MonthlySummaryFormService()
				.insertOrUpdateMonthlySummaryMainPage(refMonthlySummaryMainPage);
	}

	public int insertOrUpdateMonthlySummaryRecord(
			MonthlySummaryRecord monthlySum) throws RemoteException,
			MedrexException {
		return new MonthlySummaryFormService()
				.insertOrUpdateMonthlySummaryRecord(monthlySum);
	}

	public MonthlySummaryRecord getMonthlySummaryRecord(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {
		return new MonthlySummaryFormService()
				.getMonthlySummaryRecord(currentMonthlySummaryRecordKey);
	}

	public ArrayList<MonthlySummaryRecord> getMonthlySummaryRecords(
			int currentResidenceKey) throws RemoteException, MedrexException {

		return new MonthlySummaryFormService()
				.getMonthlySummaryRecords(currentResidenceKey);
	}

	public void deleteMonthlySummaryMainPage(int formId)
			throws RemoteException, MedrexException {
		new MonthlySummaryFormService().deleteMonthlySummaryMainPage(formId);

	}

	public void deleteMonthlySummaryPage1(int formId) throws RemoteException,
			MedrexException {
		new MonthlySummaryFormService().deleteMonthlySummaryPage1(formId);

	}

	public void deleteMonthlySummaryPage2(int formId) throws RemoteException,
			MedrexException {
		new MonthlySummaryFormService().deleteMonthlySummaryPage2(formId);

	}

	public void deleteMonthlySummaryRecord(int id) throws RemoteException,
			MedrexException {
		new MonthlySummaryFormService().deleteMonthlySummaryRecord(id);

	}

	public int insertOrUpdateMonthlySummaryPage5(
			MonthlySummaryPage5 refMonthlySummaryPage5) throws RemoteException,
			MedrexException {
		return new MonthlySummaryPage5Service()
				.insertOrUpdateMonthlySummaryPage5(refMonthlySummaryPage5);
	}

	public MonthlySummaryPage5 getMonthlySummaryPage5(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return new MonthlySummaryPage5Service().getMonthlySummaryPage5(msr);
	}

	public int insertOrUpdateMonthlySummaryPage4(
			MonthlySummaryPage4 refMonthlySummaryPage4) throws RemoteException,
			MedrexException {
		return new MonthlySummaryPage4Service()
				.insertOrUpdateMonthlySummaryPage4(refMonthlySummaryPage4);
	}

	public MonthlySummaryPage4 getMonthlySummaryPage4(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return new MonthlySummaryPage4Service().getMonthlySummaryPage4(msr);
	}

	public int insertOrUpdateMonthlySummaryPage3(
			MonthlySummaryPage3 refMonthlySummaryPage3) throws RemoteException,
			MedrexException {
		return new MonthlySummaryPage3Service()
				.insertOrUpdateMonthlySummaryPage3(refMonthlySummaryPage3);
	}

	public MonthlySummaryPage3 getMonthlySummaryPage3(MonthlySummaryRecord msr)
			throws RemoteException, MedrexException {
		return new MonthlySummaryPage3Service().getMonthlySummaryPage3(msr);
	}

	public void deleteDoctorsRecord(int currentSelectedUserId,
			int currentUsersKey) throws RemoteException, MedrexException {
		(new DoctorsService()).deleteDoctorsRecord(currentSelectedUserId,
				currentUsersKey);
	}

	public void deleteNurseRecord(int currentSelectedUserId, int currentUsersKey)
			throws RemoteException, MedrexException {
		(new NurseService()).deleteDoctorsRecord(currentSelectedUserId,
				currentUsersKey);
	}

	public void deleteUserRecord(int currentUsersKey, int currentSelectedUserId)
			throws RemoteException, MedrexException {
		new UserService().deleteUserRecord(currentUsersKey,
				currentSelectedUserId);
	}

	public Object[] getRoomHistoryDataSource(Date from, Date to)
			throws RemoteException, MedrexException {
		return (new RoomHistroySerivice().getRoomHistoryDataSource(from, to));
	}

	public void doScanSave(int residentId, String residentTabName,
			String scanFormName, ImageIcon icon) throws RemoteException,
			MedrexException {
		new ScanFormService().doScanSave(residentId, residentTabName,
				scanFormName, icon);
	}

	public List<ScanForm> doLoadScans(int residentId, String residentTabName)
			throws RemoteException, MedrexException {
		return new ScanFormService().doLoadScans(residentId, residentTabName);
	}

	public ScanForm getScan(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException {
		return new ScanFormService().getScan(residentId, residentTabName,
				fileName);
	}

	public void deleteScanForm(int residentId, String residentTabName,
			String fileName) throws MedrexException, RemoteException {
		new ScanFormService().deleteScanForm(residentId, residentTabName,
				fileName);
	}

	public void deleteScanFile(File file) throws RemoteException,
			MedrexException {
		new ScanFormService().deleteScanFile(file);
	}

	public int insertOrUpdateAdmissionDischargeSummary(
			AdmissionAndDischargeSummary admissionAndDischargeSummary)
			throws MedrexException, RemoteException {

		return new AdmissionAndDischargeService()
				.insertOrUpdateAdmissionDischargeSummary(admissionAndDischargeSummary);
	}

	public AdmissionAndDischargeSummary getAdmissionAndDischarge(
			MonthlySummaryRecord msr) throws MedrexException, RemoteException {
		return new AdmissionAndDischargeService()
				.getAdmissionAndDischargeSummary(msr);
	}

	public int insertOrUpdateResidentAllergies(ResidentAllergies ref)
			throws RemoteException, MedrexException {
		return new ResidentAllergiesService()
				.insertOrUpdateResidentAllergies(ref);
	}

	public void deleteResidentAllergies(int id) throws RemoteException,
			MedrexException {
		new ResidentAllergiesService().deleteResidentAllergies(id);
	}

	public List<ResidentAllergies> getResidentAllergiesforResident(
			int residentId) throws RemoteException, MedrexException {
		return new ResidentAllergiesService()
				.getResidentAllergiesforResident(residentId);
	}

	public ResidentAllergies getResidentAllergy(int currSerial)
			throws RemoteException, MedrexException {
		return new ResidentAllergiesService().getResidentAllergy(currSerial);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(String text,
			String selectedButton) throws RemoteException, MedrexException {
		return new ResidentAllergiesService().getResidentAllergiesForString(
				text, selectedButton);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(
			String selectedButton) throws RemoteException, MedrexException {
		return new ResidentAllergiesService()
				.getResidentAllergiesForString(selectedButton);
	}

	// Validation test
	public ValidationForm getRaFPg1ValidationRecord(String className)
			throws MedrexException, RemoteException {
		return new RAService().getRaFPg1ValidationRecord(className);
	}

	public int insertOrUpdateValidationForm(ValidationForm vfRef)
			throws RemoteException, MedrexException {

		return new ValidationService().insertOrUpdateValidationForm(vfRef);
	}

	public ValidationForm getValidations(int currentValidationFormKey)
			throws RemoteException, MedrexException {

		return new ValidationService().getValidations(currentValidationFormKey);
	}

	public ValidationForm getAllValidations(String fullPathOfForm)
			throws RemoteException, MedrexException {

		return new ValidationService().getAllValidations(fullPathOfForm);
	}

	public List<Users> getUsersAccordingToTriggerWords(String triggerWords)
			throws MedrexException, RemoteException {
		return new TriggerWordService()
				.getUsersAccordingToTriggerWords(triggerWords);
	}

	public List<TriggerWord> getTriggerWordCreatedAndModifiedDate(
			String triggerWords) throws MedrexException, RemoteException {
		return new TriggerWordService()
				.getTriggerWordCreatedAndModifiedDate(triggerWords);
	}

	public boolean isFormFieldAlreadyExist(String retrievedNameOfComp,
			String selectedFormFullPath) throws RemoteException,
			MedrexException {

		return new ValidationService().isFormFieldAlreadyExist(
				retrievedNameOfComp, selectedFormFullPath);
	}

	public int insertFormConfigAlert(FormConfigAlert alertRef)
			throws RemoteException, MedrexException {

		return new ValidationService().insertFormConfigAlert(alertRef);
	}

	public void deleteValidationFormField(int serial) throws RemoteException,
			MedrexException {
		new ValidationService().deleteValidationFormField(serial);
	}

	public List<Notes> getSelectedNotesAccToFrmAndCategories(String formName,
			List<NotesCategories> notesCategories, int residentId, Date dFrom,
			Date dTo) throws MedrexException, RemoteException {
		return (new NotesService().getSelectedNotesAccToFrmAndCategories(
				formName, notesCategories, residentId, dFrom, dTo));
	}

	public void insertOrUpdateScheduling(scheduling sch)
			throws RemoteException, MedrexException {
		new SchedulingService().insertOrUpdateScheduling(sch);

	}

	public List<NotesCategories> getNoteCategories(int serial)
			throws RemoteException, MedrexException {

		return new NotesService().getNoteCategories(serial);
	}

	public List<Notes> getLatestNotes(NotesCategories nc)
			throws MedrexException, RemoteException {
		return new NotesService().getLatestNotes(nc);
	}

	public List getResidentScheduling(int serial) throws RemoteException,
			MedrexException {
		return new SchedulingService().getResidentScheduling(serial);

	}

	public scheduling getSchedulingObject(int serial) throws RemoteException,
			MedrexException {

		return new SchedulingService().getSchedulingObject(serial);
	}

	public String deleteScheduling(int currentSerial, String str)
			throws RemoteException, MedrexException {
		return new SchedulingService().deleteScheduling(currentSerial, str);
	}

	public List<CareLogMaster> getCareLogMasterForResident(
			int currentResidenceKey) throws RemoteException, MedrexException {
		return new CareLogService()
				.getCareLogMasterForResident(currentResidenceKey);

	}

	public int insertOrUpdateCareLog(CareLogMaster careLogMaster)
			throws RemoteException, MedrexException {

		return new CareLogService().insertOrUpdateCareLog(careLogMaster);
	}

	public CareLogMaster getCareLogMaster(int careLogSerial)
			throws RemoteException, MedrexException {

		return new CareLogService().getCareLogMaster(careLogSerial);
	}

	public int insertOrUpdateMsnj(MSJN refMSJN) throws RemoteException,
			MedrexException {

		return new MsnjService().insertOrUpdateMsnj(refMSJN);
	}

	public MSJN getMsnj(int currentMsjnKey) throws RemoteException,
			MedrexException {
		return new MsnjService().getMsnj(currentMsjnKey);
	}

	public int insertOrUpdateAssessingResident1(
			AssessingResident1 refAssessingResident1) throws RemoteException,
			MedrexException {

		return new AssessingResidentService1()
				.insertOrUpdateAssessingResident1(refAssessingResident1);
	}

	public AssessingResident1 getAssessingResident1(
			int currentAssessingResident1) throws RemoteException,
			MedrexException {

		return new AssessingResidentService1()
				.getAssessingResident1(currentAssessingResident1);
	}

	public int insertOrUpdateAssessingResident2(
			AssessingResident2 refAssessingResident2) throws RemoteException,
			MedrexException {

		return new AssessingResidentService2()
				.insertOrUpdateAssessingResident2(refAssessingResident2);
	}

	public AssessingResident2 getAssessingResident2(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {
		return new AssessingResidentService2()
				.getAssessingResident2(currentMonthlySummaryRecordKey);
	}

	public int insertOrUpdateAssessingResident3(
			AssessingResident3 refAssessingResident3) throws RemoteException,
			MedrexException {
		return new AssessingResidentService3()
				.insertOrUpdateAssessingResident3(refAssessingResident3);
	}

	public AssessingResident3 getAssessingResident3(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {

		return new AssessingResidentService3()
				.getAssessingResident3(currentMonthlySummaryRecordKey);
	}

	public int insertOrUpdatePhysicianNotes(
			PhysicianProgressNotes refPhysicianProgressNotes)
			throws RemoteException, MedrexException {

		return new PhysicianProgressNotesService()
				.insertOrUpdatePhysicianNotes(refPhysicianProgressNotes);
	}

	@Override
	public PhysicianProgressNotes getPhysicianProgressNotes(
			int currentMonthlySummaryRecordKey) throws RemoteException,
			MedrexException {
		return new PhysicianProgressNotesService()
				.getPhysicianProgressNotes(currentMonthlySummaryRecordKey);
	}

	public void deleteMsnj(int formId) throws RemoteException, MedrexException {
		new MsnjService().deleteMsnj(formId);
	}

	@Override
	public void deleteAccessingResident1(int formId) throws RemoteException,
			MedrexException {
		new AssessingResidentService1().deleteAccessingResident1(formId);

	}

	@Override
	public void deleteAccessingResident2(int formId) throws RemoteException,
			MedrexException {
		new AssessingResidentService2().deleteAccessingResident2(formId);

	}

	@Override
	public void deleteAccessingResident3(int formId) throws RemoteException,
			MedrexException {

		new AssessingResidentService3().deleteAccessingResident3(formId);
	}

	@Override
	public void deletePhysicalProgressNotes(int formId) throws RemoteException,
			MedrexException {
		new PhysicianProgressNotesService().deletePhysicalProgressNotes(formId);

	}

	public int insertOrUpdateVitals(ResidentVitalSigns vital)
			throws RemoteException, MedrexException {

		return new ResidentVitalSignsService().insertOrUpdateVitals(vital);
	}

	public List<ResidentVitalSigns> getVitalSigns(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return new ResidentVitalSignsService()
				.getVitalSigns(currentResidenceKey);
	}

	public void deleteResidentVitalRecord(int vitalId) throws RemoteException,
			MedrexException {
		new ResidentVitalSignsService().deleteResidentVitalRecord(vitalId);

	}

	public ResidentVitalSigns getVitalSign(int currentVitalSignKey)
			throws MedrexException {

		return new ResidentVitalSignsService()
				.getVitalSign(currentVitalSignKey);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfResident(
			int currentResidenceKey) throws RemoteException, MedrexException {

		return new ResidentAssessmentFormService()
				.getResidentAssessmentFormPage14OfResident(currentResidenceKey);
	}

	public int insertOrUpdateResidentWeight(ResidentWeight resWeight)
			throws RemoteException, MedrexException {

		return new ResidentWeightService()
				.insertOrUpdateResidentWeight(resWeight);
	}

	public List<ResidentWeight> getResidentWeights(int currentResidenceKey)
			throws RemoteException, MedrexException {

		return new ResidentWeightService()
				.getResidentWeights(currentResidenceKey);
	}

	public void deleteResidentWeightRecord(int id) throws RemoteException,
			MedrexException {
		new ResidentWeightService().deleteResidentWeightRecord(id);
	}

	public ResidentWeight getResidentWeightRecord(int currentResidentWeightKey)
			throws RemoteException, MedrexException {
		return new ResidentWeightService()
				.getResidentWeightRecord(currentResidentWeightKey);
	}

	public ResidentWeight getResidentLatestWeight(int currentResidenceKey)
			throws RemoteException, MedrexException {
		return new ResidentWeightService()
				.getResidentLatestWeight(currentResidenceKey);
	}

	public List<ResidentWeightBean> getResidentsWeight(Date dFrom, Date dTo,
			String withOrWithoutWeight) throws RemoteException, MedrexException {
		return new ResidentWeightService().getResidentsWeight(dFrom, dTo,
				withOrWithoutWeight);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfLast3Weeks(
			int resId, int currentPg14Key) throws RemoteException,
			MedrexException {

		return new ResidentAssessmentFormService()
				.getResidentAssessmentFormPage14OfLast3Weeks(resId,
						currentPg14Key);
	}

	public ResidentWeight getPreviousResidentWeightRecord(
			int currentResidenceKey, int previousMonths)
			throws RemoteException, MedrexException {

		return new ResidentWeightService().getPreviousResidentWeightRecord(
				currentResidenceKey, previousMonths);
	}

	// new Forms
	public void deleteResidentInformation(int formId) throws RemoteException,
			MedrexException {
		new ResidentInformationService().deleteResidentInformation(formId);

	}

	public ResidentInformation getResidentInformation(int currentMsjnKey)
			throws RemoteException, MedrexException {
		return new ResidentInformationService()
				.getResidentInformation(currentMsjnKey);
	}

	public int insertOrUpdateResidentInformation(
			ResidentInformation refResidentInformation) throws RemoteException,
			MedrexException {
		return new ResidentInformationService()
				.insertOrUpdateResidentInformation(refResidentInformation);
	}

	public void deleteResidentCarePlanForm(int formId) throws RemoteException,
			MedrexException {
		new ResidentCarePlanFormService().deleteResidentCarePlanForm(formId);

	}

	public void deleteResidentInventoryPersonalEffectForm(int formId)
			throws RemoteException, MedrexException {
		new ResidentInventoryPersonalEffectFormService()
				.deleteResidentCarePlanForm(formId);

	}

	public void deleteResidentStatusSheet(int formId) throws RemoteException,
			MedrexException {
		new ResidentStatusSheetService().deleteResidentStatusSheet(formId);
	}

	public void deleteResidentTransferForm(int formId) throws RemoteException,
			MedrexException {
		new ResidentTransferFormService().deleteResidentTransferForm(formId);

	}

	public ResidentCarePlan getResidentCarePlan(int formId)
			throws RemoteException, MedrexException {

		return new ResidentCarePlanFormService().getResidentCarePlan(formId);
	}

	public InventoryPersonalEffect getResidentInventoryPersonalEffect(int formId)
			throws RemoteException, MedrexException {

		return new ResidentInventoryPersonalEffectFormService()
				.getResidentInventoryPersonalEffect(formId);
	}

	public ResidentStatusSheet getResidentStatusSheet(int formId)
			throws RemoteException, MedrexException {

		return new ResidentStatusSheetService().getResidentStatusSheet(formId);
	}

	public ResidentTransferForm getResidentTransferForm(int formId)
			throws RemoteException, MedrexException {

		return new ResidentTransferFormService()
				.getResidentTransferForm(formId);
	}

	public int insertOrUpdateResidentCarePlan(
			ResidentCarePlan refResidentCarePlan) throws RemoteException,
			MedrexException {

		return new ResidentCarePlanFormService()
				.insertOrUpdateResidentCarePlan(refResidentCarePlan);
	}

	public int insertOrUpdateResidentInventoryPersonalEffect(
			InventoryPersonalEffect refResidentInventoryPersonalEffect)
			throws RemoteException, MedrexException {

		return new ResidentInventoryPersonalEffectFormService()
				.insertOrUpdateResidentInventoryPersonalEffect(refResidentInventoryPersonalEffect);
	}

	public int insertOrUpdateResidentStatusSheet(
			ResidentStatusSheet refResidentStatusSheet) throws RemoteException,
			MedrexException {

		return new ResidentStatusSheetService()
				.insertOrUpdateResidentStatusSheet(refResidentStatusSheet);
	}

	public int insertOrUpdateResidentTransferForm(
			ResidentTransferForm refResidentTransferForm)
			throws RemoteException, MedrexException {

		return new ResidentTransferFormService()
				.insertOrUpdateResidentTransferForm(refResidentTransferForm);
	}

	public int insertOrUpdateInterDisciplinaryForm(
			InterDisciplinaryCarePlan interDsc) throws RemoteException,
			MedrexException {

		return new InterDisciplinaryCarePlanService()
				.insertOrUpdateInterDisciplinaryForm(interDsc);
	}

	public InterDisciplinaryCarePlan getInterDisciplinaryForm(int formId)
			throws RemoteException, MedrexException {

		return new InterDisciplinaryCarePlanService()
				.getInterDisciplinaryForm(formId);
	}

	public void deleteInterDisciplinaryCarePlanForm(int formId)
			throws RemoteException, MedrexException {
		new InterDisciplinaryCarePlanService()
				.deleteInterDisciplinaryCarePlanForm(formId);

	}

	public int insertOrUpdateDietaryAlertSheet(
			DietaryAlertSheet refDietaryAlertSheet) throws RemoteException,
			MedrexException {

		return new DietaryAlertSheetService()
				.insertOrUpdateDietaryAlertSheet(refDietaryAlertSheet);
	}

	public DietaryAlertSheet getDietaryAlertSheet(int formId)
			throws RemoteException, MedrexException {

		return new DietaryAlertSheetService().getDietaryAlertSheet(formId);
	}

	public void deleteDietaryAlertSheet(int formId) throws RemoteException,
			MedrexException {
		new DietaryAlertSheetService().deleteDietaryAlertSheet(formId);

	}

	public int insertOrUpdateInfluenzaConsentForm(
			InfluenzaConsentForm refInfluenzaConsentForm)
			throws RemoteException, MedrexException {
		return new InfluenzaConsentFormService()
				.insertOrUpdateDietaryAlertSheet(refInfluenzaConsentForm);
	}

	public InfluenzaConsentForm getInfluenzaConsentForm(int formId)
			throws RemoteException, MedrexException {

		return new InfluenzaConsentFormService()
				.getInfluenzaConsentForm(formId);
	}

	public void deleteInfluenzaConsentForm(int formId) throws RemoteException,
			MedrexException {
		new InfluenzaConsentFormService().deleteInfluenzaConsentForm(formId);
	}

	public SkilledFlowSheet getSkilledFlowSheet(int formId)
			throws RemoteException, MedrexException {

		return new SkilledFlowSheetService().getSkilledFlowSheet(formId);
	}

	public int insertOrUpdateSkilledFlowSheet(
			SkilledFlowSheet refSkilledFlowSheet) throws RemoteException,
			MedrexException {

		return new SkilledFlowSheetService()
				.insertOrUpdateSkilledFlowSheet(refSkilledFlowSheet);
	}

	public void deleteSkilledFlowSheet(int formId) throws RemoteException,
			MedrexException {
		new SkilledFlowSheetService().deleteSkilledFlowSheet(formId);

	}

	public int insertOrUpdateAmbulationWeight(AmbulationWeight ambWeight)
			throws MedrexException, RemoteException {
		return (new AmbulationWeightService())
				.insertOrUpdateAmbulationWeight(ambWeight);
	}

	public List<AmbulationWeight> getAmbulationWeights()
			throws MedrexException, RemoteException {
		return (new AmbulationWeightService()).getAmbulationWeights();
	}

	public AmbulationWeight getAmbulationWeight(int serial)
			throws MedrexException, RemoteException {
		return (new AmbulationWeightService()).getAmbulationWeight(serial);
	}

	public void deleteAmbulationWeight(int serial) throws MedrexException,
			RemoteException {
		(new AmbulationWeightService()).deleteAmbulationWeight(serial);
	}

	public int insertOrUpdatePhysicianOrderDiet(PhysicianOrderDiets refPhyDiet)
			throws MedrexException, RemoteException {

		return new PhysicianOrderDietService()
				.insertOrUpdatePhysicianOrderDiet(refPhyDiet);
	}

	public int insertOrUpdatePhysicianOrderRecord(PhysicianOrderRecord refPhyRec)
			throws MedrexException, RemoteException {

		return new PhysicianOrderRecordService()
				.insertOrUpdatePhysicianOrderRecord(refPhyRec);
	}

	public List<PhysicianOrderRecord> getPhysicianOrderRecords(String formType,
			int currentResidentKey) throws MedrexException, RemoteException {

		return new PhysicianOrderRecordService().getPhysicianOrderRecords(
				formType, currentResidentKey);
	}

	public PhysicianOrderDiets getPhysicianOrderDiet(int serial)
			throws MedrexException, RemoteException {

		return new PhysicianOrderDietService().getPhysicianOrderDiet(serial);
	}

	public void deletePhysicianOrderDiet(int serial) throws MedrexException,
			RemoteException {
		new PhysicianOrderDietService().deletePhysicianOrderDiet(serial);

	}

	public void deletePhysicianOrderRecord(int serial) throws MedrexException,
			RemoteException {
		new PhysicianOrderRecordService().deletePhysicianOrderRecord(serial);

	}

	public int insertOrUpdatePhysicianOrderConsultations(
			PhysicianOrderConsultations phycon) throws MedrexException,
			RemoteException {

		return new PhysicianOrderConsultationsServices()
				.insertOrUpdatePhysicianOrderConsultations(phycon);
	}

	public int insertOrUpdatePhysicianOrderRespiratoryTherapy(
			PhysicianOrderRespiratoryTherapy phyresp) throws MedrexException,
			RemoteException {
		return new PhysicianOrderRespiratoryTherapyService()
				.insertOrUpdatePhysicianOrderRespiratoryTherapy(phyresp);
	}

	public void deletePhysicianOrderRespiratoryTherapy(int serial)
			throws MedrexException, RemoteException {
		new PhysicianOrderRespiratoryTherapyService()
				.deletePhysicianOrderRespiratoryTherapy(serial);
	}

	public PhysicianOrderRespiratoryTherapy getPhysicianOrderRespiratoryTherapy(
			int serial) throws MedrexException, RemoteException {
		return new PhysicianOrderRespiratoryTherapyService()
				.getPhysicianOrderRespiratoryTherapy(serial);
	}

	public int insertOrUpdatePhysicianOrderAdvanceDirectives(
			PhysicianOrderAdvanceDirectives phyadvance) throws MedrexException,
			RemoteException {
		return new PhysicianOrderAdvanceDirectivesService()
				.insertOrUpdatePhysicianOrderAdvanceDirectives(phyadvance);
	}

	public void deletePhysicianOrderAdvanceDirectives(int serial)
			throws MedrexException, RemoteException {
		new PhysicianOrderAdvanceDirectivesService()
				.deletePhysicianOrderAdvanceDirectives(serial);
	}

	public PhysicianOrderAdvanceDirectives getPhysicianOrderAdvanceDirectives(
			int serial) throws MedrexException, RemoteException {
		return new PhysicianOrderAdvanceDirectivesService()
				.getPhysicianOrderAdvanceDirectives(serial);
	}

	public int insertOrUpdatePhysicianOrderMedication(
			PhysicianOrderMedication refPhysicianOrderMedication)
			throws MedrexException, RemoteException {
		return new PhysicianOrderMedicationService()
				.insertOrUpdatePhysicianOrderMedication(refPhysicianOrderMedication);
	}

	public void deletePhysicianOrderMedication(
			int currentPhysicianOrderMedicationKey) throws MedrexException,
			RemoteException {

		new PhysicianOrderMedicationService()
				.deletePhysicianOrderMedication(currentPhysicianOrderMedicationKey);
	}

	public void deletePhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException {
		new PhysicianOrderConsultationsServices()
				.deletePhysicianOrderConsultations(serial);

	}

	public PhysicianOrderConsultations getPhysicianOrderConsultations(int serial)
			throws MedrexException, RemoteException {

		return new PhysicianOrderConsultationsServices()
				.getPhysicianOrderConsultations(serial);
	}

	public int insertOrUpdatePhysicianOrderDiagnosticTests(
			PhysicianOrderDiagnosticTests phytest) throws MedrexException,
			RemoteException {

		return new PhysicianOrderDiagnosticTestsService()
				.insertOrUpdatePhysicianOrderDiagnosticTests(phytest);
	}

	public void deletePhysicianOrderDiagnosticTests(int serial)
			throws MedrexException, RemoteException {

		new PhysicianOrderDiagnosticTestsService()
				.deletePhysicianOrderDiagnosticTests(serial);
	}

	public PhysicianOrderDiagnosticTests getPhysicianOrderDiagnosticTests(
			int serial) throws MedrexException, RemoteException {

		return new PhysicianOrderDiagnosticTestsService()
				.getPhysicianOrderDiagnosticTests(serial);
	}

	public int insertOrUpdatePhysicianOrderTreat(
			PhysicianOrderTreatment refPhyTreat) throws MedrexException,
			RemoteException {

		return new PhysicianOrderTreatmentService()
				.insertOrUpdatePhysicianOrderTreat(refPhyTreat);
	}

	public void deletePhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException {

		new PhysicianOrderTreatmentService()
				.deletePhysicianOrderTreatment(serial);
	}

	public PhysicianOrderTreatment getPhysicianOrderTreatment(int serial)
			throws MedrexException, RemoteException {
		return new PhysicianOrderTreatmentService()
				.getPhysicianOrderTreat(serial);
	}

	public PhysicianOrderMedication getPhysicianOrderMedication(int formId)
			throws MedrexException, RemoteException {

		return new PhysicianOrderMedicationService()
				.getPhysicianOrderMedication(formId);
	}

	public int insertOrUpdateRehabilitationRestrorative(
			RehabilitationRestrorative refRehabilitationRestrorative)
			throws MedrexException, RemoteException {
		return new RestrorativeService()
				.insertOrUpdateRehabilitationRestrorative(refRehabilitationRestrorative);
	}

	public RehabilitationRestrorative getRehabilitationRestrorative(int formId)
			throws MedrexException, RemoteException {

		return new RestrorativeService().getRehabilitationRestrorative(formId);
	}

	public void deleteRehabilitationRestrorative(
			int currentRehabilitationRestrorativekey) throws MedrexException,
			RemoteException {
		new RestrorativeService()
				.deleteRehabilitationRestrorative(currentRehabilitationRestrorativekey);

	}

	public int insertOrUpdatePhysicianOrderMiscellaneous(
			PhysicianOrderMiscellaneous phymisc) throws MedrexException,
			RemoteException {

		return new PhysicianOrderMiscellaneousService()
				.insertOrUpdatePhysicianOrderMiscellaneousForm(phymisc);
	}

	public void deletePhysicianOrderMiscellaneous(int serial)
			throws MedrexException, RemoteException {
		new PhysicianOrderMiscellaneousService()
				.deletePhysicianOrderMiscellaneous(serial);
	}

	public PhysicianOrderMiscellaneous getPhysicianOrderMiscellaneous(int serial)
			throws MedrexException, RemoteException {

		return new PhysicianOrderMiscellaneousService()
				.getPhysicianOrderMiscellaneous(serial);
	}

	public int insertOrUpdatePhysicianOrderSafetyPrecautions(
			PhysicianOrderSafetyPrecautions physafety) throws MedrexException,
			RemoteException {
		return new PhysicianOrderSafetyPrecautionsService()
				.insertOrUpdatePhysicianOrderSafetyPrecautions(physafety);
	}

	public void deletePhysicianOrderSafetyPrecautions(int serial)
			throws MedrexException, RemoteException {
		new PhysicianOrderSafetyPrecautionsService()
				.deletePhysicianOrderSafetyPrecautions(serial);
	}

	public PhysicianOrderSafetyPrecautions getPhysicianOrderSafetyPrecautions(
			int formId) throws MedrexException, RemoteException {

		return new PhysicianOrderSafetyPrecautionsService()
				.getPhysicianOrderSafetyPrecautions(formId);
	}

	public int insertOrUpdateEnteralProtocal(
			PhysicianOrderEnteralProtocol refEnteralProtocol)
			throws MedrexException, RemoteException {
		return new PhysicianOrderEnteralService()
				.insertOrUpdateEnteralProtocal(refEnteralProtocol);
	}

	public PhysicianOrderEnteralProtocol getPanelEnteralProtocol(int formId)
			throws MedrexException, RemoteException {
		return new PhysicianOrderEnteralService()
				.getPanelEnteralProtocol(formId);
	}

	public void deletePhysicianOrderEnteralProtocol(
			int currentPhysicianOrderEnteralProtocolKey)
			throws MedrexException, RemoteException {
		new PhysicianOrderEnteralService()
				.deletePhysicianOrderEnteralProtocol(currentPhysicianOrderEnteralProtocolKey);

	}

	public int insertOrUpdateParentalNutritionalOrderForm(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm)
			throws MedrexException, RemoteException {
		return new PhysicianOrderParentalNutritionalOrderFormService()
				.insertOrUpdateParentalNutritionalOrderForm(refParentalNutritionalOrderForm);
	}

	public ParentalNutritionalOrderForm getParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException {
		return new PhysicianOrderParentalNutritionalOrderFormService()
				.getParentalNutritionalOrderForm(currentParentalNutritionalOrderFormKey);
	}

	@Override
	public void deletePhysicianOrderParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException,
			RemoteException {
		new PhysicianOrderParentalNutritionalOrderFormService()
				.deletePhysicianOrderParentalNutritionalOrderForm(currentParentalNutritionalOrderFormKey);

	}

	public boolean isDNR(int currentResidenceKey) throws MedrexException,
			RemoteException {
		return new ResidentMainService().isDNR(currentResidenceKey);
	}

	public List<PhysicianOrderMedication> getPhysicianOrderMedicationList(
			int currentResidentId) throws MedrexException, RemoteException {
		return new PhysicianOrderMedicationService()
				.getPhysicianOrderMedicationList(currentResidentId);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16ByResidentId(
			int currentResidenceKey) throws MedrexException, RemoteException {
		return new ResidentAssessmentFormService()
				.getResidentAssessmentFormPage16ByResidentId(currentResidenceKey);
	}

	public String getCautionaryName(Long medicationId) throws MedrexException,
			RemoteException {
		return new PhysicianOrderMedicationService()
				.getCautionaryName(medicationId);
	}

	public List<Object[]> getMedicationStatusForWeek(Calendar calendar,
			String slot, int currentResidentId, int medicationSerial)
			throws MedrexException, RemoteException {

		return new MedicationCartService().getMedicationStatusForWeek(calendar,
				slot, currentResidentId, medicationSerial);
	}

	public List<String> getTimeSlot(int frequency) throws MedrexException,
			RemoteException {

		return new PhysicianOrderMedicationService().getTimeSlot(frequency);
	}

	public List getPrnResidentsByFloor(String floorType)
			throws MedrexException, RemoteException {

		return new MedicationCartService().getPrnResidentsByFloor(floorType);
	}

	public List<MedicationView> getPrnMedicationsList(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return new MedicationCartService()
				.getPrnMedicationsList(currentResidenceKey);
	}

	public List<Medication> getMedication() throws MedrexException,
			RemoteException {
		return new MedicationService().getMedication();
	}

	public List<Medication> getMedication(String text, String selectedButton)
			throws MedrexException, RemoteException {
		return new MedicationService().getMedication(text, selectedButton);
	}

	public List<Medication> getMedication(String selectedButton)
			throws MedrexException, RemoteException {
		return new MedicationService().getMedication(selectedButton);
	}

	public int insertOrUpdatePRN(PRNmedication prn) throws MedrexException,
			RemoteException {

		return new PRNmedicationService().insertOrUpdatePRN(prn);
	}

	public List<Object[]> getMedicationFrequencies() throws MedrexException,
			RemoteException {
		return new MedicationService().getMedicationFrequencies();
	}

	public void deleteDialysisRecord(int id) throws MedrexException,
			RemoteException {
		new DialysisRecordService().deleteDialysisRecord(id);

	}

	public DialysisRecord getDialysisRecord(int currentDialysisRecordKey)
			throws MedrexException, RemoteException {

		return new DialysisRecordService()
				.getDialysisRecord(currentDialysisRecordKey);
	}

	public List<DialysisRecord> getDialysisRecords(int currentResidenceKey)
			throws MedrexException, RemoteException {

		return new DialysisRecordService()
				.getDialysisRecords(currentResidenceKey);
	}

	public int insertOrUpdateDialysisRecord(DialysisRecord dialysisRecord)
			throws MedrexException, RemoteException {

		return new DialysisRecordService()
				.insertOrUpdateDialysisRecord(dialysisRecord);
	}

	public int insertOrUpdateNursesNotes(NursesNotesRecord nursesSum)
			throws MedrexException, RemoteException {

		return new NursesNotesService().insertOrUpdateNursesNotes(nursesSum);
	}

	public NursesNotesRecord getNursesNotesRecord(
			int currentNursesNotesRecordKey) throws MedrexException,
			RemoteException {
		return new NursesNotesService()
				.getNursesNotesRecord(currentNursesNotesRecordKey);
	}

	public List<NursesNotesRecord> getNursesNotesRecords(int currentResidenceKey)
			throws MedrexException, RemoteException {

		return new NursesNotesService()
				.getNursesNotesRecords(currentResidenceKey);
	}

	public void deleteNursesNotes(int formId) throws MedrexException,
			RemoteException {
		new NursesNotesService().deleteNursesNotes(formId);

	}

	public Long insertOrUpdateTreatments(Treatment tre) throws MedrexException,
			RemoteException {
		return (new TreatmentService().insertOrUpdateTreatments(tre));
	}

	public Treatment getTreatment(long currentTreatmentKey)
			throws MedrexException, RemoteException {
		return (new TreatmentService().getTreatment(currentTreatmentKey));
	}

	@Override
	public List<Treatment> getAllTreatments() throws MedrexException,
			RemoteException {
		return (new TreatmentService().getAllTreatments());
	}

	public void deleteTreatment(long id) throws MedrexException,
			RemoteException {
		new TreatmentService().deleteTreatment(id);
	}

	public int insertOrUpdatePhysicianOrderTreatmentTemp(
			PhysicianOrderTreatmentTemp refphysicianOrderTreatmentTemp)
			throws MedrexException, RemoteException {
		return new PhysicianOrderTreatmentTempService()
				.insertOrUpdatePhysicianOrderTreatmentTemp(refphysicianOrderTreatmentTemp);
	}

	public PhysicianOrderTreatmentTemp getPhysicianOrderTreatmentTemp(int formId)
			throws MedrexException, RemoteException {
		return new PhysicianOrderTreatmentTempService()
				.getPhysicianOrderTreatmentTemp(formId);
	}

	public List getTreatmentHistoryTimes() throws MedrexException,
			RemoteException {
		return new TreatmentCartService().getTreatmentHistoryTimes();
	}

	public List getCurrentSlotTimeforTreatment(String floorType)
			throws MedrexException, RemoteException {
		return new TreatmentCartService()
				.getCurrentSlotTimeforTreatment(floorType);
	}

	public List<TreatmentView> getTreatmentsList(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return new TreatmentCartService()
				.getTreatmentsList(currentResidenceKey);
	}

	public List<ResidentDiagnosis> getResidentDiagnosissByConfirm(int resId)
			throws MedrexException, RemoteException {

		return new ResidentDiagnosisService()
				.getResidentDiagnosissByConfirm(resId);
	}

	public String getUserNameById(int userid) throws MedrexException,
			RemoteException {
		return (new UserService().getUserNameById(userid));
	}

	public void insertOrUpdateMDS3(Mds3 mds3) throws MedrexException,
			RemoteException {
		Mds3Service.insertOrUpdateMDS3(mds3);
	}

	public void deleteMDS3(int id) throws MedrexException, RemoteException {
		Mds3Service.deleteMDS3(id);

	}

	public List getMDS3Sections(int currentResidenceKey)
			throws MedrexException, RemoteException {
		return Mds3Service.getMDS3Sections(currentResidenceKey);
	}

	public Mds3 getMds3(int serial) throws MedrexException, RemoteException {

		return Mds3Service.getMds3(serial);
	}

	@Override
	public ArrayList<Notes> getNotesList(int userid, Date from, Date dcto,
			int start_index) throws MedrexException, RemoteException {
		return (new NotesService()
				.getNotesList(userid, from, dcto, start_index));
	}

	public void insertOrUpdateForm(int formId, int selectedTabId)
			throws MedrexException, RemoteException {
		new FormManagerService().insertOrUpdateForm(formId, selectedTabId);

	}

	@Override
	public int getFormIdByName(String selectedNode) throws MedrexException,
			RemoteException {
		return (new FormManagerService().getFormIdByName(selectedNode));
	}

	// ----for schedule records...........................
	public int insertOrUpdateSchedule(Schedule sh) throws MedrexException,
			RemoteException {
		return (ScheduleService.insertOrUpdateSchedule(sh));
	}

	public List<Schedule> getScheduleRecords() throws MedrexException,
			RemoteException {
		return (new ScheduleService().getScheduleRecords());
	}

	public void deleteForm_formPage(int form_pageSerial, int form_serial)
			throws MedrexException, RemoteException {
		new FormManagerService().deleteForm_formPage(form_pageSerial,
				form_serial);

	}

	
	public void insertOrUpdateUserSchedules(List<UserSchedule> us)
			throws MedrexException, RemoteException {
		new UserScheduleService().insertOrUpdateUserSchedules(us);
	}

	public List<Tab> getAllTabs() throws MedrexException, RemoteException {
		return (new FormManagerService().getAllTabs());
	}

	public List<FormPage> getAllFormPages(String text) throws MedrexException,
			RemoteException {

		return (new FormManagerService().getAllFormPages(text));
	}

	public FormPage getFormPageWithId(int currSerial) throws MedrexException,
			RemoteException {

		return (new FormManagerService().getFormPageWithId(currSerial));
	}

	public void insertOrUpdateFormPage(FormPage currref)
			throws MedrexException, RemoteException {

		new FormManagerService().insertOrUpdateFormPage(currref);
	}

	public void insertOrUpdateForm_formPage(int formId, int parentid,
			boolean isNew) throws MedrexException, RemoteException {
		new FormManagerService().insertOrUpdateForm_formPage(formId, parentid,
				isNew);
	}

	public List<FormPage> getAllForms() throws MedrexException, RemoteException {

		return (new FormManagerService().getAllForms());
	}

	public List<Accurities> getAccuritiesListByDateTemp(Date d)
			throws MedrexException, RemoteException {
		return (new AccuritiesService().getAccuritiesListByDateTemp(d));
	}

	@Override
	public UserSchedule getUserScheduleRecord(int userID, int scheduleID,
			Date onDate) throws MedrexException, RemoteException {
		return (new UserScheduleService().getUserScheduleRecord(userID,
				scheduleID, onDate));
	}
	
	public UserSchedule getUserScheduleRecordByDay(int userID, int scheduleID,
			int day) throws MedrexException, RemoteException {
		return (new UserScheduleService().getUserScheduleRecordByDay(userID,
				scheduleID, day));
	}

	
	@Override
	public void insertOrUpdateUserSchedule(UserSchedule userschedule)
			throws MedrexException, RemoteException {
		new UserScheduleService().insertOrUpdateUserSchedule(userschedule);

	}

	public int insertOrUpdateActivationLicense(ActivationLicense license)
			throws MedrexException, RemoteException {
		return new ActivationService().insertOrUpdateActivationLicense(license);
	}

	public boolean isActivationLicenseValid() throws MedrexException,
			RemoteException {
		return new ActivationService().isActivationLicenseValid();
	}

	public void deleteActivationLicense(int serial) throws MedrexException,
			RemoteException {
		new ActivationService().deleteActivationLicense(serial);
	}

	public List<ActivationLicense> getActivationLicenses()
			throws MedrexException, RemoteException {
		return new ActivationService().getActivationLicenses();
	}

	public ActivationLicense getActivationLicense(int serial)
			throws MedrexException, RemoteException {
		return new ActivationService().getActivationLicense(serial);
	}

	public ActivationLicense getActivationLicense(Date forDate)
			throws MedrexException, RemoteException {
		return new ActivationService().getActivationLicense(forDate);
	}

	public Map<String, Object> getAccutiesByDate(String dt)
			throws MedrexException, RemoteException {

		return new AccuritiesService().getAccutiesByDate(dt);
	}

	public void deleteScheduleRecord(int scheduleSerial)
			throws MedrexException, RemoteException {
		new ScheduleService().deleteScheduleRecord(scheduleSerial);
	}

	@Override
	public void deletePhysicianOrderTherapyTest(int serial) throws MedrexException, RemoteException {
		new PhysicianOrderTherapyTestService().deletePhysicianOrderTherapyTest(serial);
		
	}

	@Override
	public int insertOrUpdatePhysicianOrderTherapyTest(PhysicianOrderTherapyTest phytherapy) 
	throws MedrexException,RemoteException {
		
		return new PhysicianOrderTherapyTestService().insertOrUpdatePhysicianOrderTherapyTest(phytherapy);
	}

	@Override
	public PhysicianOrderTherapyTest getPhysicianOrderTherapyTest(int serial) throws MedrexException, RemoteException {
		
		return new PhysicianOrderTherapyTestService().getPhysicianOrderTherapyTest(serial);
	}

}

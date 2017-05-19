package medrex.server.service.admission;

import java.rmi.RemoteException;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
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
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;
import medrex.commons.vo.medication.PressureSoreAssessment;
import medrex.server.dao.admission.ResidentAssessmentFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;
import medrex.server.service.admission.analyzer.CarePlanAnalyzer;
import medrex.server.service.admission.analyzer.CarePlanAnalyzerService;

public class ResidentAssessmentFormService {

	private CarePlanAnalyzer cpa = new CarePlanAnalyzer();

	public int insertOrUpdateResidentAssessmentFormPage1(
			ResidentAssessmentFormPage1 residentPayer) throws MedrexException {

		int serial = ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage1(residentPayer);
		if ((new CarePlanAnalyzerService().getCarePlanByFormId(serial))) {
			new CarePlanAnalyzerService().deleteCarePlanByFormId(serial);
			List<CarePlanAnalyzerBean> list = cpa
					.carePlanFormPage1(residentPayer);

			(new CarePlanAnalyzerService())
					.insertOrUpdateCarePlanAnalyzerList(list);
		} else {
			List<CarePlanAnalyzerBean> list = cpa
					.carePlanFormPage1(residentPayer);

			(new CarePlanAnalyzerService())
					.insertOrUpdateCarePlanAnalyzerList(list);
		}

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(residentPayer
				.getResidentId(),
				FormSchedulerConstants.RESIDENT_ADMISSION_ASSESSMENT, serial);

		return serial;

	}

	public List getResidentAssessmentFormPage1s(int residentSerial)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage1s(residentSerial));
	}

	public ResidentAssessmentFormPage1 getResidentAssessmentFormPage1(int serial)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage1(serial));
	}

	public void deleteResidentAssessmentFormPage1(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage1(serial);

		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.RESIDENT_ADMISSION_ASSESSMENT, serial);
	}

	public ResidentAssessmentFormPage1 getResidentAllergies(int residentSerial)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAllergies(residentSerial));
	}

	// P2
	public int insertOrUpdateResidentAssessmentFormPage2(
			ResidentAssessmentFormPage2 rafp2) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage2(rafp2);
	}

	public ResidentAssessmentFormPage2 getResidentAssessmentFormPage2(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage2(formId));
	}

	public void deleteResidentAssessmentFormPage2(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage2(serial);
	}

	// /P3
	public int insertOrUpdateResidentAssessmentFormPage3(
			ResidentAssessmentFormPage3 rafp3) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage3(rafp3);
	}

	public ResidentAssessmentFormPage3 getResidentAssessmentFormPage3(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage3(formId));
	}

	public void deleteResidentAssessmentFormPage3(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage3(serial);
	}

	public int insertOrUpdatePressureSoreAssessment(PressureSoreAssessment psa)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdatePressureSoreAssessment(psa);
	}

	public PressureSoreAssessment getPressureSoreAssessment(int formId,
			int formNum) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getPressureSoreAssessment(formId, formNum));
	}

	// /P4
	public int insertOrUpdateResidentAssessmentFormPage4(
			ResidentAssessmentFormPage4 rafp4) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage4(rafp4);
	}

	public ResidentAssessmentFormPage4 getResidentAssessmentFormPage4(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage4(formId));
	}

	public void deleteResidentAssessmentFormPage4(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage4(serial);
	}

	// /P6
	public int insertOrUpdateResidentAssessmentFormPage5(
			ResidentAssessmentFormPage5 rafp5) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage5(rafp5);
	}

	public ResidentAssessmentFormPage5 getResidentAssessmentFormPage5(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage5(formId));
	}

	public void deleteResidentAssessmentFormPage5(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage5(serial);
	}

	// /P6
	public int insertOrUpdateResidentAssessmentFormPage6(
			ResidentAssessmentFormPage6 rafp6) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage6(rafp6);
	}

	public ResidentAssessmentFormPage6 getResidentAssessmentFormPage6(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage6(formId));
	}

	public void deleteResidentAssessmentFormPage6(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage6(serial);
	}

	// /P7
	public int insertOrUpdateResidentAssessmentFormPage7(
			ResidentAssessmentFormPage7 rafp7) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage7(rafp7);
	}

	public ResidentAssessmentFormPage7 getResidentAssessmentFormPage7(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage7(formId));
	}

	public void deleteResidentAssessmentFormPage7(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage7(serial);
	}

	// PainAssessment
	public int insertOrUpdatePainAssessment(PainAssessment painAssessment)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdatePainAssessment(painAssessment);
	}

	public PainAssessment getPainAssessment(int formId, int formNum)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance().getPainAssessment(
				formId, formNum);
	}

	public void deletePainAssessment(int formId) throws MedrexException {
		ResidentAssessmentFormDAO.getInstance().deletePainAssessment(formId);
	}

	// /P8
	public int insertOrUpdateResidentAssessmentFormPage8(
			ResidentAssessmentFormPage8 rafp8) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage8(rafp8);
	}

	public ResidentAssessmentFormPage8 getResidentAssessmentFormPage8(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage8(formId));
	}

	public void deleteResidentAssessmentFormPage8(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage8(serial);
	}

	// /P9
	public int insertOrUpdateResidentAssessmentFormPage9(
			ResidentAssessmentFormPage9 rafp9) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage9(rafp9);
	}

	public ResidentAssessmentFormPage9 getResidentAssessmentFormPage9(int formId)
			throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage9(formId));
	}

	public void deleteResidentAssessmentFormPage9(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage9(serial);
	}

	// /P10
	public int insertOrUpdateResidentAssessmentFormPage10(
			ResidentAssessmentFormPage10 rafp10) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage10(rafp10);
	}

	public ResidentAssessmentFormPage10 getResidentAssessmentFormPage10(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage10(formId));
	}

	public void deleteResidentAssessmentFormPage10(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage10(serial);
	}

	// /P11
	public int insertOrUpdateResidentAssessmentFormPage11(
			ResidentAssessmentFormPage11 rafp11) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage11(rafp11);
	}

	public ResidentAssessmentFormPage11 getResidentAssessmentFormPage11(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage11(formId));
	}

	public void deleteResidentAssessmentFormPage11(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage11(serial);
	}

	// /P12
	public int insertOrUpdateResidentAssessmentFormPage12(
			ResidentAssessmentFormPage12 rafp12) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage12(rafp12);
	}

	public ResidentAssessmentFormPage12 getResidentAssessmentFormPage12(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage12(formId));
	}

	public void deleteResidentAssessmentFormPage12(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage12(serial);
	}

	// /P13
	public int insertOrUpdateResidentAssessmentFormPage13(
			ResidentAssessmentFormPage13 rafp13) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage13(rafp13);
	}

	public List<ResidentAssessmentFormPage13> getResidentAssessmentFormPage13(
			int resdentId, int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage13(resdentId, formId));
	}

	public void deleteResidentAssessmentFormPage13(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage13(serial);
	}

	// /P14
	public int insertOrUpdateResidentAssessmentFormPage14(
			ResidentAssessmentFormPage14 rafp14) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage14(rafp14);
	}

	public ResidentAssessmentFormPage14 getResidentAssessmentFormPage14(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage14(formId));
	}

	public void deleteResidentAssessmentFormPage14(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage14(serial);
	}

	// /P15
	public int insertOrUpdateResidentAssessmentFormPage15(
			ResidentAssessmentFormPage15 rafp15) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage15(rafp15);
	}

	public ResidentAssessmentFormPage15 getResidentAssessmentFormPage15(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage15(formId));
	}

	public void deleteResidentAssessmentFormPage15(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage15(serial);
	}

	// /P16
	public int insertOrUpdateResidentAssessmentFormPage16(
			ResidentAssessmentFormPage16 rafp16) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage16(rafp16);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage16(formId));
	}

	public void deleteResidentAssessmentFormPage16(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage16(serial);
	}

	// /P17
	public int insertOrUpdateResidentAssessmentFormPage17(
			ResidentAssessmentFormPage17 rafp17) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage17(rafp17);
	}

	public ResidentAssessmentFormPage17 getResidentAssessmentFormPage17(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage17(formId));
	}

	public void deleteResidentAssessmentFormPage17(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage17(serial);
	}

	// /P18
	public int insertOrUpdateResidentAssessmentFormPage18(
			ResidentAssessmentFormPage18 rafp18) throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage18(rafp18);
	}

	public ResidentAssessmentFormPage18 getResidentAssessmentFormPage18(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage18(formId));
	}

	public void deleteResidentAssessmentFormPage18(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage18(serial);
	}

	public void deleteResidentAssessmentFormPage19(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage19(serial);

	}

	public void deleteResidentAssessmentFormPage19Col(int formSerial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage19Col(formSerial);

	}

	public ResidentAssessmentFormPage20 getResidentAssessmentFormPage20(
			int formId) throws MedrexException {

		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage20(formId));
	}

	public void deleteResidentAssessmentFormPage20(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage20(serial);
	}

	// Resident Quarterly Assessment Form Page7
	public int insertOrUpdateResidentQuarterlyAssessmentFormPage7(
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentQuarterlyAssessmentFormPage7(
						residentQuarterlyAssessmentFormPage7);
	}

	public ResidentQuarterlyAssessmentFormPage7 getResidentQuarterlyAssessmentFormPage7(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentQuarterlyAssessmentFormPage7(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage7(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentQuarterlyAssessmentFormPage7(serial);
	}

	// Resident Quarterly Assessment Form Page8
	public int insertOrUpdateResidentQuarterlyAssessmentFormPage8(
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentQuarterlyAssessmentFormPage8(
						residentQuarterlyAssessmentFormPage8);
	}

	public ResidentQuarterlyAssessmentFormPage8 getResidentQuarterlyAssessmentFormPage8(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentQuarterlyAssessmentFormPage8(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage8(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentQuarterlyAssessmentFormPage8(serial);
	}

	// Resident Quarterly Assessment Form Page9
	public int insertOrUpdateResidentQuarterlyAssessmentFormPage9(
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentQuarterlyAssessmentFormPage9(
						residentQuarterlyAssessmentFormPage9);
	}

	public ResidentQuarterlyAssessmentFormPage9 getResidentQuarterlyAssessmentFormPage9(
			int formId) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentQuarterlyAssessmentFormPage9(formId));
	}

	public void deleteResidentQuarterlyAssessmentFormPage9(int serial)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentQuarterlyAssessmentFormPage9(serial);
	}

	public int insertOrUpdateResidentAssessmentFormPage20(
			ResidentAssessmentFormPage20 refResidentAssessmentForm20)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage20(
						refResidentAssessmentForm20);
	}

	public int insertOrUpdateResidentAssessmentFormPage19(
			ResidentAssessmentFormPage19 refResidentAssessmentForm19)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage19(
						refResidentAssessmentForm19);
	}

	public int insertOrUpdateDoctorsProgressNotesFormRows(
			List<ResidentAssessmentFormPage19Col> columns)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage19(columns);

	}

	public ResidentAssessmentFormPage19 getResidentAssessmentFormPage19(
			int currentResidentAssessmentFormPage19Key) throws MedrexException {

		return ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage19(
						currentResidentAssessmentFormPage19Key);
	}

	public List<ResidentAssessmentFormPage19Col> getResidentAssessmentFormPage19Columns(
			int currentResidentAssessmentFormPage19Key) throws MedrexException {

		return ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage19Columns(
						currentResidentAssessmentFormPage19Key);
	}

	public int insertOrUpdateResidentAssessmentFormPage21(
			ResidentAssessmentFormPage21 refResidentAssessmentFormPage21)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage21(
						refResidentAssessmentFormPage21);
	}

	public ResidentAssessmentFormPage21 getResidentAssessmentFormPage21(
			int currentResidentAssessmentFormPage21Key) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage21(currentResidentAssessmentFormPage21Key));
	}

	public void deleteResidentAssessmentFormPage21(int formId)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage21(formId);
	}

	public int insertOrUpdateResidentAssessmentFormPage22(
			ResidentAssessmentFormPage22 refResidentAssessmentFormPage22)
			throws MedrexException {
		return ResidentAssessmentFormDAO.getInstance()
				.insertOrUpdateResidentAssessmentFormPage22(
						refResidentAssessmentFormPage22);
	}

	public ResidentAssessmentFormPage22 getResidentAssessmentFormPage22(
			int currentResidentAssessmentFormKey) throws MedrexException {
		return (ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage22(currentResidentAssessmentFormKey));
	}

	public void deleteResidentAssessmentFormPage22(int formId)
			throws MedrexException {
		ResidentAssessmentFormDAO.getInstance()
				.deleteResidentAssessmentFormPage22(formId);
	}

	// form page1 latest
	public ResidentAssessmentFormPage1 getLatestResidentAssessmentFormPage1(
			int residentId) throws MedrexException, RemoteException {
		return ResidentAssessmentFormDAO.getInstance()
				.getLatestResidentAssessmentFormPage1(residentId);
	}

	public void deletePressureSoreAssessment(int formId)
			throws MedrexException, RemoteException {
		ResidentAssessmentFormDAO.getInstance().deletePressureSoreAssessment(
				formId);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfResident(
			int currentResidenceKey) throws MedrexException, RemoteException {

		return ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage14OfResident(currentResidenceKey);
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfLast3Weeks(
			int resId, int currentPg14Key) throws MedrexException {

		return ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage14OfLast3Weeks(resId,
						currentPg14Key);
	}

	public ResidentAssessmentFormPage16 getResidentAssessmentFormPage16ByResidentId(
			int currentResidenceKey) throws MedrexException, RemoteException {
		return ResidentAssessmentFormDAO.getInstance()
				.getResidentAssessmentFormPage16ByResidentId(
						currentResidenceKey);
	}
}

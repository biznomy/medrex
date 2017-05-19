package medrex.server.service.admission.analyzer;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;
import medrex.commons.vo.admission.analyzer.CarePlanValues;
import medrex.server.dao.admission.carePlanAnalyzer.CarePlanAnalyzerDAO;

public class CarePlanAnalyzerService {

	public void insertOrUpdateCarePlanAnalyzerList(
			List<CarePlanAnalyzerBean> list) throws MedrexException {
		CarePlanAnalyzerDAO.getInstance().insertOrUpdateCarePlanAnalyzerList(
				list);
	}

	public int getCarePlanAnalyzerCount() throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance().getCarePlanAnalyzerCount();
	}

	public List getCarePlanAnalyzerResidentCount() throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance()
				.getCarePlanAnalyzerResidentCount();
	}

	public boolean getCarePlanByFormId(int serial) throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance().getCarePlanByFormId(serial);
	}

	public void deleteCarePlanByFormId(int serial) throws MedrexException {
		CarePlanAnalyzerDAO.getInstance().deleteCarePlanByFormId(serial);
	}

	public List<CarePlanAnalyzerBean> getCarePlanAnalyzerByResidentId(
			int residentId) throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance()
				.getCarePlanAnalyzerByResidentId(residentId);
	}

	public int insertOrUpdateCarePlanValues(CarePlanValues careValues)
			throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance().insertOrUpdateCarePlanValues(
				careValues);
	}

	public CarePlanValues getCarePlanValues(
			int currentResidentAssessmentFormKey, int currentResidenceKey)
			throws MedrexException {
		return CarePlanAnalyzerDAO.getInstance().getCarePlanValues(
				currentResidentAssessmentFormKey, currentResidenceKey);
	}

	public void deleteResidentCarePlanValues(int formId, int currentResidenceKey)
			throws MedrexException {
		CarePlanAnalyzerDAO.getInstance().deleteResidentCarePlanValues(formId,
				currentResidenceKey);
	}

}

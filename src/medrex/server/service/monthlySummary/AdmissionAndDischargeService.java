package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.AdmissionAndDischargeSummary;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.monthlySummary.AdmissionAndDischargeDAO;

public class AdmissionAndDischargeService {

	public int insertOrUpdateAdmissionDischargeSummary(
			AdmissionAndDischargeSummary admissionAndDischargeSummary)
			throws MedrexException {

		return AdmissionAndDischargeDAO.getInstance()
				.insertOrUpdateAdmissionDischargeSummary(
						admissionAndDischargeSummary);
	}

	public AdmissionAndDischargeSummary getAdmissionAndDischargeSummary(
			MonthlySummaryRecord msr) throws MedrexException {

		return AdmissionAndDischargeDAO.getInstance().getAdmissionAndDischarge(
				msr);
	}

}

package medrex.server.service.labReport;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dashboard.Dashboard;
import medrex.commons.vo.reports.Report;
import medrex.server.dao.labReport.LabReportDao;
import medrex.server.service.dashboard.DashboardService;

public class LabReportService {

	public void insertOrUpdatedLabReportText(Report rep) throws MedrexException {
		new LabReportDao().getInstance().insertOrUpdatedLabReportText(rep);

		int firstFloorNewLabReports = new LabReportDao().getInstance()
				.firstFloorNewLabReportsCount();
		int secondFloorNewLabReports = new LabReportDao().getInstance()
				.secondFloorNewLabReportsCount();

		Dashboard dash = (new DashboardService()).get("CENSUS");
		dash.setLabReports1stFloorCount(firstFloorNewLabReports);
		dash.setLabReports2stFloorCount(secondFloorNewLabReports);

		(new DashboardService()).insertOrUpdate(dash);
	}

	public List getLabReportList(int residentId) throws MedrexException {
		return new LabReportDao().getInstance().getLabReportList(residentId);
	}

	public Report getLabReports(int serial) throws MedrexException {
		return new LabReportDao().getInstance().getLabReports(serial);
	}

	public List getAllNewLabReportsResidents() throws MedrexException {
		return new LabReportDao().getInstance().getAllNewLabReportsResidents();
	}

	public List getFirstFloorNewLabReportResidents() throws MedrexException {
		return new LabReportDao().getInstance()
				.getFirstFloorNewLabReportResidents();
	}

	public List getSecondFloorNewLabReportResidents() throws MedrexException {
		return new LabReportDao().getInstance()
				.getSecondFloorNewLabReportResidents();
	}
}

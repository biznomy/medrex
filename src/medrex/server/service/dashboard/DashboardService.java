package medrex.server.service.dashboard;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Service;
import medrex.commons.vo.dashboard.Dashboard;
import medrex.server.dao.dashboard.DashboardDAO;

public class DashboardService implements Service<Dashboard> {
	public void delete(int serial) throws MedrexException {
		DashboardDAO.getInstance().deleteDashboard(serial);
	}

	public Dashboard get(int serial) throws MedrexException {
		return DashboardDAO.getInstance().getDashboard(serial);
	}

	public Dashboard get(String type) throws MedrexException {
		return DashboardDAO.getInstance().getDashboard(type);
	}

	public int getCensusLastDayAdmissionCount() throws MedrexException {
		return DashboardDAO.getInstance().getCensusLastDayAdmissionCount();
	}

	public int getCensusLastDayAdmissionFirstFloorCount()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayAdmissionFirstFloorCount();
	}

	public int getCensusLastDayAdmissionSecondFloorCount()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayAdmissionSecondFloorCount();
	}

	public int getCensusLastDayDischargeCount() throws MedrexException {
		return DashboardDAO.getInstance().getCensusLastDayDischargeCount();
	}

	public int getCensusLastDayDischargeFirstFloorCount()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayDischargeFirstFloorCount();
	}

	public int getCensusLastDayDischargeSecondFloorCount()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayDischargeSecondFloorCount();
	}

	public List getCensusLastDayAdmissionResidents() throws MedrexException {
		return DashboardDAO.getInstance().getCensusLastDayAdmissionResidents();
	}

	public List getCensusLastDayAdmissionFirstFloorResidents()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayAdmissionFirstFloorResidents();
	}

	public List getCensusLastDayAdmissionSecondFloorResidents()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayAdmissionSecondFloorResidents();
	}

	public List getCensusLastDayDischargeResidents() throws MedrexException {
		return DashboardDAO.getInstance().getCensusLastDayDischargeResidents();
	}

	public List getCensusLastDayDischargeFirstFloorResidents()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayDischargeFirstFloorResidents();
	}

	public List getCensusLastDayDischargeSecondFloorResidents()
			throws MedrexException {
		return DashboardDAO.getInstance()
				.getCensusLastDayDischargeSecondFloorResidents();
	}

	public List<Dashboard> getAll() throws MedrexException {
		return DashboardDAO.getInstance().getDashboards();
	}

	public List<Dashboard> getAll(int none) throws MedrexException {
		return DashboardDAO.getInstance().getDashboards();
	}

	public int insertOrUpdate(Dashboard ref) throws MedrexException {
		return DashboardDAO.getInstance().insertOrUpdateDashboard(ref);
	}
}

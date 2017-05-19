package medrex.server.service.admin.diet;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.DietList;
import medrex.commons.vo.admin.DietPlan;
import medrex.commons.vo.dietary.DietPlanByDate;
import medrex.server.dao.admin.diet.DietDAO;

public class DietService {

	public int insertOrUpdateDietList(DietList diet) throws MedrexException {
		return (DietDAO.getInstance().insertOrUpdateDietList(diet));
	}

	public DietList getDiet(int serial) throws MedrexException {
		return (DietDAO.getInstance().getDiet(serial));
	}

	public List getAllDiets() throws MedrexException {
		return (DietDAO.getInstance().getAllDiets());
	}

	public void deleteDiet(int serial) throws MedrexException {
		DietDAO.getInstance().deleteDiet(serial);
	}

	public List<DietList> getDietByCategory(String cat) throws MedrexException {
		return DietDAO.getInstance().getDietByCategory(cat);
	}

	public int insertOrUpdateDietPlan(DietPlan dietPlan) throws MedrexException {
		return DietDAO.getInstance().insertOrUpdateDietPlan(dietPlan);
	}

	public List<DietPlan> getAllDietPlan() throws MedrexException {
		return DietDAO.getInstance().getAllDietPlan();
	}

	public List<DietPlan> getDietPlanByCategory(String cat)
			throws MedrexException {
		return DietDAO.getInstance().getDietPlanByCategory(cat);
	}

	public List<DietPlan> getDietPlanByDietName(String dietName)
			throws MedrexException {
		return DietDAO.getInstance().getDietPlanByDietName(dietName);
	}

	public DietPlan getDietPlan(int serial) throws MedrexException {
		return DietDAO.getInstance().getDietPlan(serial);
	}

	public void deleteDietPlan(int serial) throws MedrexException {
		DietDAO.getInstance().deleteDietPlan(serial);
	}

	public int insertOrUpdateDietPlanByDate(DietPlanByDate dietPlanByDate)
			throws MedrexException {
		return DietDAO.getInstance().insertOrUpdateDietPlanByDate(
				dietPlanByDate);
	}

	public DietPlanByDate getDietPlanByDate(String date) throws MedrexException {
		return DietDAO.getInstance().getDietPlanByDate(date);
	}
}

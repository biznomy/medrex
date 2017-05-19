package medrex.server.dao.carePlan;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.carePlan.CarePlanRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarePlanRecordDAO {

	private CarePlanRecordDAO() {
	}

	private static CarePlanRecordDAO carePlanRecordDAO = null;

	public static synchronized CarePlanRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (carePlanRecordDAO == null) {
			carePlanRecordDAO = new CarePlanRecordDAO();

		} // end if

		return (carePlanRecordDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCarePlanRecord(
			CarePlanRecord carePlanRecord) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from CarePlanRecord");
			session.saveOrUpdate(carePlanRecord);
			tx.commit();
			// Global.currentCarePlanDate=carePlanRecord.getCarePlanDate();
			return carePlanRecord.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving CarePlanRecord");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		String sql = "";

		try {

			tx = session.beginTransaction();
			if (careplanrecord.isDelirium()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.delirium = true";
			}

			if (careplanrecord.isCogitiveLoss()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.cogitiveLoss = true";
			}

			if (careplanrecord.isVisualFunction()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.visualFunction = true";
			}

			if (careplanrecord.isCommunication()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.communication = true";
			}

			if (careplanrecord.isAdlFuncationRehabitationPotential()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.adlFuncationRehabitationPotential = true";
			}

			if (careplanrecord.isUninaryIncontinenceAndIndwellingCatheter()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql
						+ " cpr.uninaryIncontinenceAndIndwellingCatheter = true";
			}

			if (careplanrecord.isPsychosocialWellBeing()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.psychosocialWellBeing = true";
			}

			if (careplanrecord.isMoodState()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.moodState = true";
			}

			if (careplanrecord.isBehavioralSymptoms()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.behavioralSymptoms = true";
			}

			if (careplanrecord.isActivities()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.activities = true";
			}

			if (careplanrecord.isFalls()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.falls = true";
			}

			if (careplanrecord.isNutritionalStatus()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.nutritionalStatus = true";
			}

			if (careplanrecord.isFeedingTubes()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.feedingTubes = true";
			}

			if (careplanrecord.isDehydrationaFluidMaintenance()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.dehydrationaFluidMaintenance = true";
			}

			if (careplanrecord.isDentalCare()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.dentalCare = true";
			}

			if (careplanrecord.isPressureUlcers()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.pressureUlcers = true";
			}

			if (careplanrecord.isPsychotropicDrugUse()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.psychotropicDrugUse = true";
			}

			if (careplanrecord.isPhysicalRestraints()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.physicalRestraints = true";
			}

			System.out.println(sql);
			if (sql.equalsIgnoreCase("")) {
				result = session.createQuery("from CarePlanRecord as cpr")
						.list();
			} else {
				result = session.createQuery(
						"from CarePlanRecord as cpr where " + sql).list();
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Residents Main Infomation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord, String username)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		String sql = "";

		try {

			tx = session.beginTransaction();
			if (careplanrecord.isDelirium()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.delirium = true";
			}

			if (careplanrecord.isCogitiveLoss()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.cogitiveLoss = true";
			}

			if (careplanrecord.isVisualFunction()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.visualFunction = true";
			}

			if (careplanrecord.isCommunication()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.communication = true";
			}

			if (careplanrecord.isAdlFuncationRehabitationPotential()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.adlFuncationRehabitationPotential = true";
			}

			if (careplanrecord.isUninaryIncontinenceAndIndwellingCatheter()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql
						+ " cpr.uninaryIncontinenceAndIndwellingCatheter = true";
			}

			if (careplanrecord.isPsychosocialWellBeing()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.psychosocialWellBeing = true";
			}

			if (careplanrecord.isMoodState()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.moodState = true";
			}

			if (careplanrecord.isBehavioralSymptoms()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.behavioralSymptoms = true";
			}

			if (careplanrecord.isActivities()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.activities = true";
			}

			if (careplanrecord.isFalls()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.falls = true";
			}

			if (careplanrecord.isNutritionalStatus()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.nutritionalStatus = true";
			}

			if (careplanrecord.isFeedingTubes()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.feedingTubes = true";
			}

			if (careplanrecord.isDehydrationaFluidMaintenance()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.dehydrationaFluidMaintenance = true";
			}

			if (careplanrecord.isDentalCare()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.dentalCare = true";
			}

			if (careplanrecord.isPressureUlcers()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.pressureUlcers = true";
			}

			if (careplanrecord.isPsychotropicDrugUse()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.psychotropicDrugUse = true";
			}

			if (careplanrecord.isPhysicalRestraints()) {
				if (!sql.equalsIgnoreCase("")) {
					sql = sql + " AND ";
				}
				sql = sql + " cpr.physicalRestraints = true";
			}

			System.out.println(sql);
			if (sql.equalsIgnoreCase("")) {
				result = session.createQuery(
						" from CarePlanRecord as cpr where cpr.submittedUser='"
								+ username + "'").list();
			} else {
				result = session.createQuery(
						" from CarePlanRecord as cpr where cpr.submittedUser='"
								+ username + "' AND " + sql).list();

			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Residents Main Infomation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CarePlanRecord getCarePlanRecord(int serial)
			throws MedrexException {
		CarePlanRecord carePlanRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			carePlanRecord = (CarePlanRecord) session.load(
					CarePlanRecord.class, serial);
			carePlanRecord.getProblem();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Care Plan Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return carePlanRecord;
	}

	public synchronized void deleteCarePlanRecord(int serial) throws Exception {

		CarePlanRecord carePlanRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			carePlanRecord = (CarePlanRecord) session.load(
					CarePlanRecord.class, serial);
			carePlanRecord.getProblem();
			session.delete(carePlanRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Care Plan Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}

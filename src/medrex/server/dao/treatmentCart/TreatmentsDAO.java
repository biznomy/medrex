package medrex.server.dao.treatmentCart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.treatmentCart.CalculatedTreatment;
import medrex.commons.vo.treatmentCart.TreatmentView;
import medrex.commons.vo.treatmentCart.Treatments;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreatmentsDAO {

	private TreatmentsDAO() {
	}

	private static TreatmentsDAO refTreatmentsDAO = null;

	public static synchronized TreatmentsDAO getInstance() {
		if (refTreatmentsDAO == null) {
			refTreatmentsDAO = new TreatmentsDAO();
		}
		return (refTreatmentsDAO);
	}

	public synchronized void insertOrUpdateTreatments(List psr)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Iterator i = psr.iterator();
			while (i.hasNext()) {
				Treatments med = new Treatments();
				PhysicianOrderForm3Row phy = (PhysicianOrderForm3Row) i.next();
				med.setFormId(phy.getSerial());
				med.setMedicationName(phy.getPhyMedication());
				med.setRoute(phy.getPhyRoute());
				med.setFrequency(Integer.parseInt(phy.getPhyFrequency()));
				med.setDosage(Integer.parseInt(phy.getPhyDosage()));
				med.setOrderDate(phy.getPhyOrderDate());
				med.setEndDate(phy.getPhyDcDate());
				med.setPrnIndicator(Integer.parseInt(phy.getPrnIndicator()));
				session.createQuery("from Treatments");
				session.saveOrUpdate(med);
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// this method call the list of resident whose medications lie in the
	// particular time slot.

	public synchronized List getCurrentSlotTimeforTreatment(String floorType)
			throws MedrexException {
		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("floor Type :"+floorType);
			// list =
			// session.createSQLQuery("SELECT (SELECT CONCAT(r.userpass ,', ', r.username) FROM residentmain AS r "
			// +
			// "WHERE r.serial = maxData.residentId) AS resident, maxData.calDate AS maxDate, minData.calDate AS minDate,"
			// +
			// " maxData.residentId AS residentId FROM (SELECT m.residentId, MAX(cst.calculatedStartTime) AS calDate "
			// +
			// "FROM calculatedmedication AS cst LEFT JOIN medications AS m ON m.serial = cst.medSerial "
			// +
			// "WHERE DATE(NOW()) = DATE(cst.calculatedStartTime) AND TIME(NOW()) >= TIME(cst.calculatedStartTime) "
			// +
			// "GROUP BY m.residentId) AS maxData LEFT JOIN (SELECT m.residentId, MIN(cst.calculatedStartTime) AS calDate "
			// +
			// "FROM calculatedmedication AS cst LEFT JOIN medications AS m ON m.serial = cst.medSerial "
			// +
			// "WHERE DATE(NOW()) = DATE(cst.calculatedStartTime) AND TIME(NOW()) <= TIME(cst.calculatedStartTime) "
			// +
			// "GROUP BY m.residentId) AS minData ON maxData.residentId = minData.residentId").list();
			list = session.createSQLQuery(
					"CALL ViewCurrentTreatment('" + floorType + "')").list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return list;
	}

	public synchronized List<TreatmentView> getTreatmentsList(
			int currentResidenceKey) throws MedrexException {
		List list = new ArrayList();
		List<TreatmentView> row3List = new ArrayList<TreatmentView>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = session
					.createSQLQuery(
							"SELECT m.route, m.prnIndicator, m.frequency, m.orderDate, m.dosage, m.endDate, c.serial,"
									+ " c.medSerial, c.calculatedStartTime, c.calculatedEndTime, m.medicationName ,c.status ,m.medicationId "
									+ "FROM treatments AS m LEFT JOIN calculatedtreatment AS c ON m.serial = c.medSerial "
									+ "WHERE DATE(NOW()) = DATE(c.calculatedStartTime) AND TIME(NOW()) >= TIME(c.calculatedStartTime) "
									+ "AND TIME(NOW()) <= TIME(c.calculatedEndTime)AND m.residentId ="
									+ currentResidenceKey).list();
			tx.commit();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Object[] obj = (Object[]) it.next();
				TreatmentView medView = new TreatmentView();
				medView.setRoute(obj[0].toString());
				medView.setPrnIndicator(Integer.parseInt(obj[1].toString()));
				medView.setFrequency(Integer.parseInt(obj[2].toString()));
				medView.setOrderDate((Date) obj[3]);
				medView.setDosage(Integer.parseInt(obj[4].toString()));
				medView.setEndDate((Date) obj[5]);
				medView.setFormId(Integer.parseInt(obj[6].toString()));
				medView.setCalcSerial(Integer.parseInt(obj[7].toString()));
				medView.setCalculatedStartTime((Date) obj[8]);
				medView.setCalculatedEndTime((Date) obj[9]);
				medView.setMedication(obj[10].toString());
				medView.setStatus(Integer.parseInt(obj[11].toString()));
				medView.setMedicationId(Long.valueOf(obj[12].toString()));
				row3List.add(medView);
			}
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return row3List;
	}

	public synchronized void insertOrUpdateCalculatedTreatment(
			CalculatedTreatment cm) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from CalculatedTreatment");
			session.saveOrUpdate(cm);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Calculated Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized Treatments getTreatments(int calcSerial)
			throws MedrexException {
		Treatments med = new Treatments();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			med = (Treatments) session.load(Treatments.class, calcSerial);
			med.getDosage();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Calculated Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return med;
	}

	public synchronized List getTreatmentHistoryTimes() throws MedrexException {
		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = session
					.createSQLQuery(
							"SELECT (SELECT CONCAT(r.userpass ,', ', r.username) FROM residentmain AS r "
									+ "WHERE r.serial = m.residentId) AS resident, MAX(cst.timeRecord) FROM calculatedtreatment AS cst "
									+ "LEFT JOIN treatments AS m ON m.serial = cst.medserial WHERE cst.timeRecord <= NOW() "
									+ "AND cst.timeRecord IS NOT NULL AND DATE(cst.calculatedStartTime) = DATE(NOW()) GROUP BY m.residentId ORDER BY cst.timeRecord DESC")
					.list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return list;
	}

	// getting a week's status of medication for medication scheduler

	public synchronized List getTreatmentStatusForWeek(Calendar startCal,
			String slotTime, int currentResidentId, int medicationSerial)
			throws MedrexException {
		List list = new ArrayList();
		// System.out.println("start Date"+startCal.get(Calendar.YEAR)+"-"+startCal.get(Calendar.MONTH)+"-"+startCal.get(Calendar.DATE));
		// startCal.set(Calendar.DATE, startCal.get(Calendar.DATE)+7);
		// System.out.println("End Date:"+startCal.get(Calendar.YEAR)+"-"+startCal.get(Calendar.MONTH)+"-"+(startCal.get(Calendar.DATE)));
		// System.out.println("slot time"+slotTime);

		// System.out.println(startCal.get(Calendar.DATE));
		// System.out.println(startCal.get(Calendar.DATE));
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String startDate = startCal.get(Calendar.YEAR) + "-"
					+ startCal.get(Calendar.MONTH) + "-"
					+ startCal.get(Calendar.DATE);
			// Date startDt = new
			// Date(startCal.get(Calendar.YEAR),startCal.get(Calendar.MONTH),startCal.get(Calendar.DATE));
			// startCal.set(Calendar.DATE, startCal.get(Calendar.DATE)+6);
			// Date endDt = new
			// Date(startCal.get(Calendar.YEAR),startCal.get(Calendar.MONTH),startCal.get(Calendar.DATE));
			System.out.println("start Date" + startCal.get(Calendar.YEAR) + "-"
					+ startCal.get(Calendar.MONTH) + "-"
					+ startCal.get(Calendar.DATE));
			Calendar tempCal = new GregorianCalendar(startCal
					.get(Calendar.YEAR), startCal.get(Calendar.MONTH), startCal
					.get(Calendar.DATE));

			tempCal.set(Calendar.DATE, startCal.get(Calendar.DATE) + 7);
			String endDate = tempCal.get(Calendar.YEAR) + "-"
					+ tempCal.get(Calendar.MONTH) + "-"
					+ (tempCal.get(Calendar.DATE));
			System.out.println("End Date:" + startCal.get(Calendar.YEAR) + "-"
					+ startCal.get(Calendar.MONTH) + "-"
					+ (startCal.get(Calendar.DATE)));
			// System.out.println("Start Date:"+startDt);
			// System.out.println("End Date:"+endDt);

			list = session
					.createSQLQuery(
							"SELECT med.medicationName , med.residentId , med.frequency , calMed.calculatedStartTime , DATE_FORMAT(calMed.calculatedStartTime,'%h:%i %p') ,calMed.status, calMed.userId, calMed.timeRecord "
									+ "FROM treatments AS med LEFT JOIN calculatedTreatment AS calMed "
									+ "ON med.serial = calMed.medSerial "
									+ "WHERE med.residentId = "
									+ currentResidentId
									+ " AND calMed.calculatedStartTime >= DATE('"
									+ startDate
									+ "') AND calMed.calculatedStartTime <= DATE('"
									+ endDate
									+ "') "
									+ "AND DATE_FORMAT(calMed.calculatedStartTime,'%h:%i %p') = '"
									+ slotTime
									+ "' AND med.formId = "
									+ medicationSerial).list();
			tx.commit();

			return list;

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// getting prn medication list in a particular floor

	public synchronized List getPrnResidentsByFloor(String floorType)
			throws MedrexException {
		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			list = session
					.createSQLQuery(
							"SELECT prn.* FROM (SELECT med.residentId ,CONCAT(rm.userPass ,',',rm.userName), med.medicationName ,med.frequency,med.route, med.isPRN ,"
									+ "(	SELECT tmp.room FROM residentMain AS r JOIN temproomhistory AS tmp "
									+ " ON r.serial = tmp.residentId "
									+ "WHERE med.residentId = tmp.residentId AND tmp.endDate IS NULL "
									+ ")AS room, "
									+ "( "
									+ "SELECT tmp.floor FROM residentMain AS r JOIN temproomhistory AS tmp "
									+ "ON r.serial = tmp.residentId "
									+ "WHERE med.residentId = tmp.residentId AND tmp.endDate IS NULL "
									+ ") "
									+ " AS residentfloor "
									+ "FROM treatments AS med LEFT JOIN residentMain AS rm "
									+ "ON med.residentId = rm.serial "
									+ "WHERE med.isPRN =1) AS prn "
									+ "WHERE prn.residentfloor = '"
									+ floorType
									+ "'" + "GROUP BY prn.residentId ").list();
			tx.commit();
			return list;

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	/* getting information about the prn medication of the current resident */

	public synchronized List<TreatmentView> getPrnTreatmentsList(
			int currentResidenceKey) throws MedrexException {

		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			list = session
					.createSQLQuery(
							"SELECT med.residentId ,CONCAT(rm.userPass ,',',rm.userName), med.medicationName ,med.frequency,med.route,med.dosage, med.isPRN ,med.medicationId"
									+ " FROM treatments AS med LEFT JOIN residentMain AS rm "
									+ " ON med.residentId = rm.serial "
									+ " WHERE med.isPRN =1 "
									+ " AND med.residentId = "
									+ currentResidenceKey).list();
			tx.commit();

			List<TreatmentView> templist = new ArrayList<TreatmentView>();
			for (Object obj : list) {
				Object[] o = (Object[]) obj;
				TreatmentView mv = new TreatmentView();
				for (int i = 0; i < o.length; i++) {

					mv.setMedication((String) o[2]);
					mv.setFrequency((Integer) o[3]);
					mv.setRoute((String) o[4]);
					mv.setDosage((Integer) o[5]);
					mv.setMedicationId(Long.valueOf(o[7].toString()));
				}
				templist.add(mv);
			}
			return templist;

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}

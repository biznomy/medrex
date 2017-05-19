package medrex.server.dao.accurities;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.accurities.AcuitiesFinalReport;
import medrex.commons.vo.accurities.AcuitiesReport;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.SessionUtil;
import medrex.server.dao.schedule.UserScheduleDAO;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class AccuritiesDAO {

	private Map<String, Object> parameter1;
	private Date d2;
	private Integer cna;
	private Integer nurses;

	private AccuritiesDAO() {
	}

	private static AccuritiesDAO accuritiesDAO = null;

	public static synchronized AccuritiesDAO getInstance() {

		// if obj is null create it , else just return it
		if (accuritiesDAO == null) {
			accuritiesDAO = new AccuritiesDAO();

		} // end if

		return (accuritiesDAO);

	}

	public synchronized int insertOrUpdateAccurities(List<Accurities> accList,
			String floor, Date d) throws MedrexException {
		Accurities accurities = new Accurities();
		deleteAllAcuitiesForADay(d, floor);
		try {
			Iterator<Accurities> itr = accList.iterator();
			while (itr.hasNext()) {
				accurities = itr.next();
				accurities.setFloor(floor);
				accurities.setDate(d);
				// System.out.println("accurities:"+accurities.getResidentId()+": "+accurities.getFloor());
				insertOrUpdateAccuritiesOneByOne(accurities);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return 0;
	}

	public synchronized int insertOrUpdateAccuritiesOneByOne(Accurities acc)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(acc);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving accurities");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return acc.getSerial();
	}

	private synchronized void deleteAllAcuitiesForADay(Date d, String floor)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Accurities> accList = null;
		try {
			tx = session.beginTransaction();
			System.out.println("date:"
					+ new SimpleDateFormat("yyyy-MM-dd").format(d));
			accList = session.createCriteria(Accurities.class).add(
					Restrictions.eq("floor", floor)).add(
					Restrictions.eq("date", d)).list();
			tx.commit();

			Iterator<Accurities> itr = accList.iterator();
			while (itr.hasNext()) {
				Accurities accurities = itr.next();
				deleteAccurities(accurities.getSerial());
			}

		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting All accurities Records a day");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCurrentAccuritiesList() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session
					.createQuery(
							"SELECT ac.accdate, ac.typeId, COUNT(ac.residentId) from Accurities as ac GROUP BY ac.typeId,ac.accdate order by ac.accdate desc")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving current Accurities List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAccuritiesListByDate(Date d, String floor)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

			String strDate = df.format(d);
			Date date = null;
			try {
				date = df.parse(strDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			result = session.createCriteria(Accurities.class).add(
					Restrictions.eq("date", date)).add(
					Restrictions.eq("floor", floor)).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving current Accurities List according to date");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAccuritiesListByDateTemp(Date d)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

			String strDate = df.format(d);
			Date date = null;
			try {
				date = df.parse(strDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			result = session.createCriteria(Accurities.class).add(
					Restrictions.eq("date", date)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving current Accurities List according to date");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Accurities getAccurities(int serial)
			throws MedrexException {
		Accurities accurities = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			accurities = (Accurities) session.load(Accurities.class, serial);
			accurities.getDate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving accurities");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return accurities;
	}

	public synchronized void deleteAccurities(int serial)
			throws MedrexException {

		Accurities accurities = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			accurities = (Accurities) session.load(Accurities.class, serial);
			accurities.getResidentId();
			session.delete(accurities);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting accurities Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public List getAccutiesDate() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date date = df.parse("10/05/2009");
			Criteria crit = session.createCriteria(Accurities.class).add(
					Restrictions.ge("accdate", date)).addOrder(
					Order.desc("accdate"));
			crit.setProjection(Projections.distinct(Projections
					.property("accdate")));
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving current Accurities List according to date");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public Map<String, Object> getAccutiesByDate(String currentdate)
			throws MedrexException {

		System.out.println(currentdate + "");

		List tempList = new ArrayList();
		Date d;
		int censusCount = 0;
		List<Accurities> accList = null;
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

		String dt = currentdate;
		List<AcuitiesReport> firstFloorReportList = new ArrayList<AcuitiesReport>();
		List<AcuitiesReport> secondFloorReportList = new ArrayList<AcuitiesReport>();

		try {
			d = df.parse(dt);
			d2 = d;
			accList = MedrexClientManager.getInstance()
					.getAccuritiesListByDateTemp(d);

			firstFloorReportList = MedrexClientManager.getInstance()
					.getFirstFloorResidents(d);
			secondFloorReportList = MedrexClientManager.getInstance()
					.getSecondFloorResidents(d);

			int totalCensusCount = firstFloorReportList.size()
					+ secondFloorReportList.size();
			censusCount = totalCensusCount;
			System.out.println(totalCensusCount);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<AcuitiesReport> accReportList = new ArrayList<AcuitiesReport>();

		// First Floor
		Iterator<Accurities> itr = accList.iterator();
		while (itr.hasNext()) {
			AcuitiesReport acReport = new AcuitiesReport();
			Accurities acc = itr.next();

			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						acc.getResidentId());
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
			acReport.setResidentId(rm.getUserPass() + ", " + rm.getUserName());
			acReport.setTypeId(acc.getTypeId() + "");
			accReportList.add(acReport);

		}
		tempList.add(accReportList);

		List<AcuitiesFinalReport> acuFirstList = new ArrayList<AcuitiesFinalReport>();
		new ArrayList<AcuitiesFinalReport>();

		int o2, iv, wo, t, ortho, advNeuro, respServ, trach, head;
		o2 = iv = wo = t = ortho = advNeuro = respServ = trach = head = 0;

		for (AcuitiesReport firstItr : accReportList) {
			int typeId = Integer.parseInt(firstItr.getTypeId());
			switch (typeId) {
			case 1: {
				AcuitiesFinalReport ref = null;
				if (o2 < acuFirstList.size()) {
					ref = acuFirstList.get(o2);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setO2resident(firstItr.getResidentId());
				o2++;
			}
				break;
			case 2: {
				AcuitiesFinalReport ref = null;
				if (iv < acuFirstList.size()) {
					ref = acuFirstList.get(iv);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setIvresident(firstItr.getResidentId());
				iv++;
			}
				break;
			case 3: {
				AcuitiesFinalReport ref = null;
				if (wo < acuFirstList.size()) {
					ref = acuFirstList.get(wo);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setWoresident(firstItr.getResidentId());
				wo++;
			}
				break;
			case 4: {
				AcuitiesFinalReport ref = null;
				if (t < acuFirstList.size()) {
					ref = acuFirstList.get(t);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setTresident(firstItr.getResidentId());
				t++;

			}
				break;
			case 5: {
				AcuitiesFinalReport ref = null;
				if (trach < acuFirstList.size()) {
					ref = acuFirstList.get(trach);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setTracheotomyResident(firstItr.getResidentId());
				trach++;
			}
				break;
			case 6: {
				AcuitiesFinalReport ref = null;
				if (respServ < acuFirstList.size()) {
					ref = acuFirstList.get(respServ);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setRespiratoryServicesResident(firstItr.getResidentId());
				respServ++;
			}
				break;
			case 7: {

				AcuitiesFinalReport ref = null;
				if (advNeuro < acuFirstList.size()) {
					ref = acuFirstList.get(advNeuro);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setAdvancedNeuroCareResident(firstItr.getResidentId());
				advNeuro++;
			}
				break;
			case 8: {
				AcuitiesFinalReport ref = null;
				if (ortho < acuFirstList.size()) {
					ref = acuFirstList.get(ortho);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setOrthopedicCareResident(firstItr.getResidentId());
				ortho++;
			}
				break;
			case 9: {
				AcuitiesFinalReport ref = null;
				if (head < acuFirstList.size()) {
					ref = acuFirstList.get(head);
				} else {
					ref = new AcuitiesFinalReport();
					acuFirstList.add(ref);
				}
				ref.setHeadTrauma(firstItr.getResidentId());
				head++;
			}
				break;
			}
		}

		acuFirstList.toArray();

		// total calculation of every count

		float total02 = 0;
		float totaliv = 0;
		float totalwo = 0;
		float totalt = 0;
		float totalortho = 0;
		float totaladvNeuro = 0;
		float totalrespServ = 0;
		float totaltrach = 0;
		float totalhead = 0;
		float val02 = 0.75f;
		float valiv = 1.5f;
		float valwo = 0.75f;
		float valt = 1.0f;
		float valortho = 1.5f;
		float valrespServ = 0;
		float valtrach = 1.25f;
		float valhead = 1.5f;
		// total calculation
		total02 = val02 * o2;
		totaliv = valiv * iv;
		totalwo = valwo * wo;
		totalt = valt * t;
		totalortho = valortho * ortho;
		totaladvNeuro = valortho * advNeuro;
		totalrespServ = valrespServ * respServ;
		totaltrach = valtrach * trach;
		totalhead = valhead * head;

		try {
			cna = UserScheduleDAO.getInstance().getTotalCNA(d2);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		try {
			nurses = UserScheduleDAO.getInstance().getTotalNurse(d2);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		int cnaTotal = cna.intValue() * 8;
		int nursesTotal = nurses.intValue() * 8;
		double totalCensusCount = censusCount * 2.5;
		double allTotal = total02 + totaliv + totalwo + totalt + totalortho
				+ totaladvNeuro + totalrespServ + totaltrach + totalCensusCount;
		System.out.println(allTotal);

		Map<String, Object> parameter1 = new HashMap();

		try {

			// parameter1.put("acuitiesDataSource", acuFirstDataSource);
			parameter1.put("o2", "" + o2);
			parameter1.put("iv", "" + iv);
			parameter1.put("wo", "" + wo);
			parameter1.put("t", "" + t);
			parameter1.put("ortho", "" + ortho);
			parameter1.put("advNeuro", "" + advNeuro);
			parameter1.put("respServ", "" + respServ);
			parameter1.put("trach", "" + trach);
			parameter1.put("head", "" + head);
			parameter1.put("date", "" + dt);
			// calculated values
			parameter1.put("total02", "" + total02);
			parameter1.put("totaliv", "" + totaliv);
			parameter1.put("totalwo", "" + totalwo);
			parameter1.put("totalt", "" + totalt);
			parameter1.put("totalortho", "" + totalortho);
			parameter1.put("totaladvNeuro", "" + totaladvNeuro);
			parameter1.put("totalrespServ", "" + totalrespServ);
			parameter1.put("totaltrach", "" + totaltrach);
			parameter1.put("totalhead", "" + totalhead);
			// census count
			parameter1.put("censusCount", "" + censusCount);
			parameter1.put("totalCensusCount", "" + totalCensusCount);
			// calculation of CNA and Nurses
			parameter1.put("cna", "" + cna);
			parameter1.put("nurses", "" + nurses);
			parameter1.put("cnaTotal", "" + cnaTotal);
			parameter1.put("nursesTotal", "" + nursesTotal);
			parameter1.put("allTotal", "" + allTotal);
			System.out.println(t);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return parameter1;
	}

	public void getTotalCNA(int form_pageSerial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			String sql = "SELECT  * FROM form_formpage   WHERE   form_serial =  "
					+ form_pageSerial;
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting form  records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
	
	

}

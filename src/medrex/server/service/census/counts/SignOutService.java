/**
 * 
 */
package medrex.server.service.census.counts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.SignOut;
import medrex.server.dao.SessionUtil;
import medrex.server.dao.census.counts.SignOutDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author D S Naruka
 * 
 */
public class SignOutService {
	public void delete(int residentId) throws MedrexException {
		SignOutDAO.getInstance().deleteSignOut(residentId);
	}

	public void deleteSerial(int serial) throws MedrexException {
		SignOutDAO.getInstance().deleteSignOutSerial(serial);
	}

	public SignOut get(int serial) throws MedrexException {
		return SignOutDAO.getInstance().getSignOut(serial);
	}

	public List<SignOut> getAll() throws MedrexException {
		return SignOutDAO.getInstance().getSignOuts();
	}

	public List<SignOut> getAllLate() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutsLate();
	}

	public List<SignOut> getAllLateMoreThanHour() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutsLateMoreThanHour();
	}

	public List<SignOut> getAllWithCensusStatus(CensusStatus ref)
			throws MedrexException {
		return SignOutDAO.getInstance().getAllWithCensusStatus(ref);
	}

	public int insertOrUpdate(SignOut ref) throws MedrexException {
		return SignOutDAO.getInstance().insertOrUpdateSignOut(ref);
	}

	public int count() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutCount();
	}

	public int countLate() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutLateCount();
	}

	public int countLateMoreThanHour() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutLateMoreThanHourCount();
	}

	public int countEr() throws MedrexException {
		return SignOutDAO.getInstance().countEr();
	}

	public List getSignOutsER() throws MedrexException {
		return SignOutDAO.getInstance().getSignOutsER();
	}

	// -------------------------------------------------------
	public List<SignOut> getErForResidents(Date tillDate)
			throws MedrexException {
		List<SignOut> result = null;
		// System.out.println("Er:Date"+new
		// SimpleDateFormat("yyyy-MM-dd").format(tillDate));
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(SignOut.class).add(
					Restrictions.eq("isEr", true)).add(
					Restrictions.sqlRestriction("date(signOutDate) = '"
							+ new SimpleDateFormat("yyyy-MM-dd")
									.format(tillDate) + "'")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}

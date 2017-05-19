package medrex.server.service.mds3;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.mds3.Mds3;
import medrex.server.dao.mds3.Mds3DAO;

public class Mds3Service {

	public static void insertOrUpdateMDS3(Mds3 mds3) throws MedrexException {
		Mds3DAO.getInstance().insertOrUpdateMDS3(mds3);
	}

	public static void getMDS3(int serial) throws MedrexException {
		Mds3DAO.getInstance().getMds3(serial);
	}

	public static void deleteMDS3(int id) throws MedrexException {
		Mds3DAO.getInstance().deleteMDS3(id);

	}

	public static List getMDS3Sections(int currentResidenceKey)
			throws MedrexException {
		return Mds3DAO.getInstance().getMDS3Sections(currentResidenceKey);
	}

	public static Mds3 getMds3(int serial) throws MedrexException {
		return Mds3DAO.getInstance().getMds3(serial);
	}
}

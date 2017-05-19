package medrex.server.service.ptOtSt;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.server.dao.ptOtStAct.PtOtStDAO;

public class PtOtStService {

	public int insertOrUpdatePtOtSt(PtOtSt ptOtSt) throws MedrexException {
		return PtOtStDAO.getInstance().insertOrUpdatePtOtSt(ptOtSt);
	}

	public List getPtOtSts(int residentSerial) throws MedrexException {
		return (PtOtStDAO.getInstance().getPtOtSts(residentSerial));
	}

	public PtOtSt getPtOtSt(int serial) throws MedrexException {
		return (PtOtStDAO.getInstance().getPtOtSt(serial));
	}

	public void deletePtOtSt(int serial) throws MedrexException {
		try {
			PtOtStDAO.getInstance().deletePtOtSt(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

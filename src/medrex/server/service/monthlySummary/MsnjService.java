package medrex.server.service.monthlySummary;

import java.rmi.RemoteException;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MSJN;
import medrex.server.dao.monthlySummary.MSJNDAO;

public class MsnjService {
	public int insertOrUpdateMsnj(MSJN msnj) throws MedrexException {

		return MSJNDAO.getInstance().insertOrUpdateMsnj(msnj);
	}

	public MSJN getMsnj(int currentMsjnKey) throws RemoteException,
			MedrexException {
		return MSJNDAO.getInstance().getMsnj(currentMsjnKey);
	}

	public void deleteMsnj(int formId) throws MedrexException {
		MSJNDAO.getInstance().deleteMsnj(formId);
	}
}

package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.ProgressNotes2;
import medrex.server.dao.physicianOrders.PanelProgressNotesDAO;

public class PanelPrescriptionNotesService {

	public int insertOrUpdatePanelProgressNotes(
			ProgressNotes2 refpanelProgressNotes) throws MedrexException {
		return PanelProgressNotesDAO.getInstance()
				.insertOrUpdatePanelProgressNotes(refpanelProgressNotes);
	}

	public List getPanelProgressNotes(int residentSerial)
			throws MedrexException {
		return (PanelProgressNotesDAO.getInstance()
				.getPanelProgressNotes(residentSerial));
	}

	public ProgressNotes2 getPanelProgressNote(int serial)
			throws MedrexException {
		return (PanelProgressNotesDAO.getInstance()
				.getPanelProgressNote(serial));
	}

	// public List getPanelProgressNotes() throws MedrexException {
	// return (PanelProgressNotesDAO.getInstance().getPanelProgressNotes());
	// }

	public void deletePanelProgressNotes(int serial) throws MedrexException {
		try {
			PanelProgressNotesDAO.getInstance()
					.deletePanelProgressNotes(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

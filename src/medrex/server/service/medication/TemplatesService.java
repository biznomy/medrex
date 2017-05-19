package medrex.server.service.medication;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationNotes;
import medrex.commons.vo.medication.Templates;
import medrex.server.dao.medicationTreatment.TemplatesDAO;

public class TemplatesService {

	public List getAllTemplates() throws MedrexException {
		return (TemplatesDAO.getInstance().getAllTemplates());
	}

	public int insertOrUpdateMedicationNotes(MedicationNotes notes)
			throws MedrexException {
		int serial = 0;
		serial = TemplatesDAO.getInstance()
				.insertOrUpdateMedicationNotes(notes);
		return serial;
	}

	public List getTemplatesNoteText(int userId, int resId)
			throws MedrexException {
		return (TemplatesDAO.getInstance().getTemplatesNoteText(userId, resId));
	}

	public MedicationNotes getMedicationNotes(int serial)
			throws MedrexException {
		return (TemplatesDAO.getInstance().getMedicationNotes(serial));
	}

	public void deleteMedicationNotes(int serial) throws MedrexException {
		TemplatesDAO.getInstance().deleteMedicationNotes(serial);
	}

	public int insertOrUpdateTemplates(Templates templates)
			throws MedrexException {
		return (TemplatesDAO.getInstance().insertOrUpdateTemplates(templates));
	}

	public Templates getTemplate(int serial) throws MedrexException {
		return (TemplatesDAO.getInstance().getTemplate(serial));
	}

	public List getTemplate(String formName) throws MedrexException {
		return (TemplatesDAO.getInstance().getTemplate(formName));
	}

	public void deleteTemplate(int serial) throws MedrexException {
		TemplatesDAO.getInstance().deleteTemplate(serial);
	}

}

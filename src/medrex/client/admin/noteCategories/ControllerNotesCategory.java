package medrex.client.admin.noteCategories;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.admin.NotesCategories;

public class ControllerNotesCategory implements Controller {

	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		NotesCategories notesCategories = (NotesCategories) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("formType") || field.equals("")) {
			if (notesCategories.getFormType() != null)
				medValidation.checkRequiredValidation(notesCategories
						.getFormType().toString().trim(), "Form", errorList);
		}

		if (field.equals("noteCategory") || field.equals("")) {
			if (notesCategories.getNoteCategory() != null)
				medValidation.checkRangeValidation(notesCategories
						.getNoteCategory().toString().trim(), 3, 25,
						"Notes Category", errorList);
		}
		return errorList;
	}

}

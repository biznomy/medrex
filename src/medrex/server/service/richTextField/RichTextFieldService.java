package medrex.server.service.richTextField;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.richTextField.RichTextField;
import medrex.server.dao.richTextField.RichTextFieldDAO;

public class RichTextFieldService {

	public List getRichTextFieldValues(String rtfType, String key)
			throws MedrexException {
		return RichTextFieldDAO.getInstance().getRichTextFieldValues(rtfType,
				key);
	}

	public void insertOrUpdateRichTextFieldValue(RichTextField rtf)
			throws MedrexException {
		RichTextFieldDAO.getInstance().insertOrUpdateRichTextFieldValue(rtf);
	}

}

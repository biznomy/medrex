package medrex.commons.vo.notes;

import java.io.Serializable;

public class NotesReport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6756370569473984203L;
	private String categoryName;
	private String formName;
	private String noteText;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}

}

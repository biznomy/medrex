package medrex.commons.vo.admin;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;

@Entity
@Table(name = "NotesCategories")
public class NotesCategories implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3749802534479450555L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	/*
	 * @ManyToMany(targetEntity = medrex.commons.vo.notes.Notes.class , cascade
	 * = CascadeType.ALL,fetch=FetchType.EAGER , mappedBy = "notesCategories")
	 * 
	 * @JoinTable(name = "notes_notescategories", joinColumns = {
	 * 
	 * @JoinColumn(name = "notesCategories_serial") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "notes_serial") }) private List<NotesCategories>
	 * notes;
	 * 
	 * public List<NotesCategories> getNotes() { return notes; }
	 * 
	 * public void setNotes(List<NotesCategories> notes) { this.notes = notes; }
	 */
	@ManyToMany(mappedBy = "notesCategories", fetch = FetchType.EAGER)
	private List<Notes> notes;

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	@Column(name = "userId")
	private int userId;

	@Column(name = "formType")
	private String formType;

	@Column(name = "noteCategory")
	private String noteCategory;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getNoteCategory() {
		return noteCategory;
	}

	public void setNoteCategory(String noteCategory) {
		this.noteCategory = noteCategory;
	}

	/*
	 * public String toString() { if(this.noteCategory!=null){ return
	 * this.noteCategory.toString(); }else{ return super.toString(); } }
	 */

	@Override
	public String toString() {
		if (this.formType != null) {
			return this.formType.toString();
		} else {
			return super.toString();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NotesCategories) {
			NotesCategories noCat = (NotesCategories) obj;
			if (this.getSerial() == noCat.getSerial()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}

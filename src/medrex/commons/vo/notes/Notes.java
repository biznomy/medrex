package medrex.commons.vo.notes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import medrex.commons.vo.admin.NotesCategories;

@Entity
@Table(name = "Notes")
public class Notes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9158297248722616149L;

	public Notes() {
		notesCategories = new ArrayList<NotesCategories>();
	}

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "userId")
	private int userId;

	// @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,targetEntity =
	// medrex.commons.vo.admin.NotesCategories.class)
	/*
	 * @JoinTable( name="notes_notescategories", joinColumns =
	 * 
	 * @JoinColumn(name="Notes_serial"), inverseJoinColumns =
	 * 
	 * @JoinColumn(name="notesCategories_serial") )
	 */

	@Column(name = "formName")
	private String formName;
	@Column(name = "noteText")
	private String noteText;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "pageNum")
	private int pageNum;
	@Column(name = "createdDate")
	private Date createdDate;

	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}

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

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	// public NotesCategories getNotesCategories() {
	// return notesCategories;
	// }
	//
	// public void setNotesCategories(NotesCategories notesCategories) {
	// this.notesCategories = notesCategories;
	// }

	@ManyToMany(targetEntity = medrex.commons.vo.admin.NotesCategories.class, cascade = { CascadeType.REFRESH }, fetch = FetchType.EAGER)
	// @OnDelete(action = OnDeleteAction.CASCADE)
	// @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
	// @Cascade(value={org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@JoinTable(name = "notes_notescategories", joinColumns = { @JoinColumn(name = "notes_serial") }, inverseJoinColumns = { @JoinColumn(name = "notesCategories_serial") })
	private List<NotesCategories> notesCategories;

	public List<NotesCategories> getNotesCategories() {
		return notesCategories;
	}

	public void setNotesCategories(List<NotesCategories> notesCategories) {
		this.notesCategories = notesCategories;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		if (this.noteText != null) {
			return this.noteText.toString();
		} else {
			return super.toString();
		}
	}
}

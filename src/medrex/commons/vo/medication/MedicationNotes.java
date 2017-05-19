package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;

@Entity
@Table(name = "MedicationNotes")
public class MedicationNotes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2643431019984359530L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "userId")
	private int userId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesId")
	private Notes notes;

	@Column(name = "notesDate")
	private Date notesDate;
	@Column(name = "type")
	private String type;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getNotesDate() {
		return notesDate;
	}

	public void setNotesDate(Date notesDate) {
		this.notesDate = notesDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

}

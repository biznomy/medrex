package medrex.commons.vo.census;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CensusNotes")
public class CensusNotes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6524253928308206013L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "notes", length = 1000)
	private String notes;

	@Column(name = "username")
	private String username;

	@Column(name = "statusid")
	private int statusid;

	@Column(name = "notesDate")
	private Date notesDate;

	public Date getNotesDate() {
		return notesDate;
	}

	public void setNotesDate(Date notesDate) {
		this.notesDate = notesDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

}

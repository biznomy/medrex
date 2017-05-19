package medrex.commons.vo.dietary;

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
@Table(name = "Dietary")
public class Dietary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7325840582913206404L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "formType")
	private String formType;
	@Column(name = "notes")
	private String notes;
	@Column(name = "user")
	private String user;
	@Column(name = "status")
	private String status;
	@Column(name = "dateCreated")
	private Date dateCreated;
	@Column(name = "lastModified")
	private Date lastModified;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dietaryNotes")
	private Notes dietaryNotes;

	public Notes getDietaryNotes() {
		return dietaryNotes;
	}

	public void setDietaryNotes(Notes dietaryNotes) {
		this.dietaryNotes = dietaryNotes;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

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

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}

package medrex.commons.vo.alert;

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

@Entity
@Table(name = "CalculatedAlert")
public class CalculatedAlert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8781666442472140478L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "notes")
	private String notes;

	@Column(name = "updater")
	private int updater;

	@Column(name = "comments")
	private String comments;

	@Column(name = "alertDate")
	private Date alertDate;

	@Column(name = "ownerStatus")
	private int ownerStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "alertId")
	private Alert alertId;

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

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getAlertDate() {
		return alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	public int getOwnerStatus() {
		return ownerStatus;
	}

	public void setOwnerStatus(int ownerStatus) {
		this.ownerStatus = ownerStatus;
	}

	public Alert getAlertId() {
		return alertId;
	}

	public void setAlertId(Alert alertId) {
		this.alertId = alertId;
	}

}

package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "ResidentDiagnosis")
public class ResidentDiagnosis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4973812088945716700L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne
	@JoinColumn(name = "residentId")
	private ResidentMain resident;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private String status;

	@Column(name = "confirmed")
	private boolean confirmed;

	@Column(name = "dateConfirmed")
	private Date dateConfirmed;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "discontinued")
	private boolean discontinued;

	@Column(name = "dateDiscontinued")
	private Date dateDiscontinued;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "diaorder")
	private int order;

	@OneToOne
	@JoinColumn(name = "addedBy")
	private Users addedBy;

	@OneToOne
	@JoinColumn(name = "discontinueBy")
	private Users discontinueBy;

	@OneToOne
	@JoinColumn(name = "confirmedBy")
	private Users confirmedBy;

	public Users getConfirmedBy() {
		return confirmedBy;
	}

	public void setConfirmedBy(Users confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public Users getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(Users addedBy) {
		this.addedBy = addedBy;
	}

	public Users getDiscontinueBy() {
		return discontinueBy;
	}

	public void setDiscontinueBy(Users discontinueBy) {
		this.discontinueBy = discontinueBy;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateDiscontinued() {
		return dateDiscontinued;
	}

	public void setDateDiscontinued(Date dateDiscontinued) {
		this.dateDiscontinued = dateDiscontinued;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ResidentMain getResident() {
		return resident;
	}

	public void setResident(ResidentMain resident) {
		this.resident = resident;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateConfirmed() {
		return dateConfirmed;
	}

	public void setDateConfirmed(Date dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}
}

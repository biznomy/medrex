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

@Entity
@Table(name = "ResidentAllergies")
public class ResidentAllergies implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1579771921643949815L;

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

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "diaorder")
	private int order;

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
}

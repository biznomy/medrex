package medrex.commons.vo.census.countAudit;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "CountAudit")
public class CountAudit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2319907203735810859L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "floor")
	private String floor;

	@Column(name = "auditedBy")
	private int auditedBy;

	@Column(name = "dateAndTime")
	@Type(type = "timestamp")
	private Date dateAndTime;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "auditId")
	private List<CountAuditFloor> auditedFloors;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public int getAuditedBy() {
		return auditedBy;
	}

	public void setAuditedBy(int auditedBy) {
		this.auditedBy = auditedBy;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public List<CountAuditFloor> getAuditedFloors() {
		return auditedFloors;
	}

	public void setAuditedFloors(List<CountAuditFloor> auditedFloors) {
		this.auditedFloors = auditedFloors;
	}

}

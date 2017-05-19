package medrex.commons.vo.census.counts;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.intf.DashboardItem;
import medrex.commons.intf.ValueObject;
import medrex.commons.vo.census.CensusStatus;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "OutOfPass")
public class OutOfPass implements Serializable, ValueObject, DashboardItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6327986652159766476L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "dischargedOn")
	@Type(type = "timestamp")
	private Date dischargedOn;

	@Column(name = "timestamp")
	@Type(type = "timestamp")
	private Date timestamp;

	@OneToOne
	@JoinColumn(name = "censusStatus")
	private CensusStatus censusStatus;

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

	public Date getDischargedOn() {
		return dischargedOn;
	}

	public void setDischargedOn(Date dischargedOn) {
		this.dischargedOn = dischargedOn;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public CensusStatus getCensusStatus() {
		return censusStatus;
	}

	public void setCensusStatus(CensusStatus censusStatus) {
		this.censusStatus = censusStatus;
	}

}

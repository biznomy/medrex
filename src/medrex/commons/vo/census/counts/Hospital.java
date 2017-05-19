/**
 * 
 */
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

/**
 * @author D S Naruka
 * 
 */

@Entity
@Table(name = "Hospital")
public class Hospital implements Serializable, ValueObject, DashboardItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8142987876642670555L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "dischargedOn")
	@Type(type = "timestamp")
	private Date dischargedOn;

	@Column(name = "toId")
	private int toId;

	@Column(name = "timestamp")
	@Type(type = "timestamp")
	private Date timestamp;

	@OneToOne
	@JoinColumn(name = "censusStatus")
	private CensusStatus censusStatus;

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.ValueObject#getSerial()
	 */
	public int getSerial() {
		return this.serial;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.ValueObject#setSerial(int)
	 */
	public void setSerial(int serial) {
		this.serial = serial;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.DashboardItem#getResidentId()
	 */
	public int getResidentId() {
		return this.residentId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.DashboardItem#setResidentId(int)
	 */
	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	/**
	 * @return the dischargedOn
	 */
	public Date getDischargedOn() {
		return dischargedOn;
	}

	/**
	 * @param dischargedOn
	 *            the dischargedOn to set
	 */
	public void setDischargedOn(Date dischargedOn) {
		this.dischargedOn = dischargedOn;
	}

	/**
	 * @return the toId
	 */
	public int getToId() {
		return toId;
	}

	/**
	 * @param toId
	 *            the toId to set
	 */
	public void setToId(int toId) {
		this.toId = toId;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
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

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
@Table(name = "SignOut")
public class SignOut implements Serializable, ValueObject, DashboardItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6872367105489316451L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "toId")
	private int toId;

	@Column(name = "responsibleContactId")
	private int responsibleContactId;

	@Column(name = "signOutDate")
	@Type(type = "timestamp")
	private Date signOutDate;

	@Column(name = "anticipatedDate")
	@Type(type = "timestamp")
	private Date anticipatedDate;

	@Column(name = "timestamp")
	@Type(type = "timestamp")
	private Date timestamp;

	// if status true then Er otherwise other status
	@Column(name = "isEr")
	private boolean isEr;

	@OneToOne
	@JoinColumn(name = "censusStatus")
	private CensusStatus censusStatus;

	/**
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.ValueObject#getSerial()
	 */
	public int getSerial() {
		return this.serial;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.ValueObject#setSerial(int)
	 */
	public void setSerial(int serial) {
		this.serial = serial;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.DashboardItem#getResidentId()
	 */
	public int getResidentId() {
		return this.residentId;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.DashboardItem#setResidentId(int)
	 */
	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	/**
	 * @return the signOutDate
	 */
	public Date getSignOutDate() {
		return signOutDate;
	}

	/**
	 * @param signOutDate
	 *            the signOutDate to set
	 */
	public void setSignOutDate(Date signOutDate) {
		this.signOutDate = signOutDate;
	}

	/**
	 * @return the anticipatedDate
	 */
	public Date getAnticipatedDate() {
		return anticipatedDate;
	}

	/**
	 * @param anticipatedDate
	 *            the anticipatedDate to set
	 */
	public void setAnticipatedDate(Date anticipatedDate) {
		this.anticipatedDate = anticipatedDate;
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
	 * @return the responsibleContactId
	 */
	public int getResponsibleContactId() {
		return responsibleContactId;
	}

	/**
	 * @param responsibleContactId
	 *            the responsibleContactId to set
	 */
	public void setResponsibleContactId(int responsibleContactId) {
		this.responsibleContactId = responsibleContactId;
	}

	public CensusStatus getCensusStatus() {
		return censusStatus;
	}

	public void setCensusStatus(CensusStatus censusStatus) {
		this.censusStatus = censusStatus;
	}

	public boolean isEr() {
		return isEr;
	}

	public void setEr(boolean isEr) {
		this.isEr = isEr;
	}
}

/**
 * Medrex
 * --------------------------
 * Filename: ActivationLicense.java
 * Package: medrex.commons.vo.activation
 */
package medrex.commons.vo.activation;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author D S Naruka
 * 
 */
@Entity
@Table(name = "ActivationLicense")
public class ActivationLicense implements Serializable {
	/**
	 * Generated serial VersionUID
	 */
	private static final long serialVersionUID = -7503158406027203570L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "activated")
	private boolean activated;

	/**
	 * @return the serial
	 */
	public int getSerial() {
		return serial;
	}

	/**
	 * @param serial
	 *            the serial to set
	 */
	public void setSerial(int serial) {
		this.serial = serial;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the activated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * @param activated
	 *            the activated to set
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
}

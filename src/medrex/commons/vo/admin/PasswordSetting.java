package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passwordSetting")
public class PasswordSetting implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4852954293212312943L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "noOfAttempts")
	private int noOfAttempts;

	@Column(name = "maximumDays")
	private int maximumDays;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public int getMaximumDays() {
		return maximumDays;
	}

	public void setMaximumDays(int maximumDays) {
		this.maximumDays = maximumDays;
	}

}

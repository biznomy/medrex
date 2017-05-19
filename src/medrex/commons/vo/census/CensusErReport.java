package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusErReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1752397337036546714L;

	private int serial;

	private String erResidentId;

	private String erDate;

	private String eUser;

	private String erCount;

	private String erSFCount;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getErResidentId() {
		return erResidentId;
	}

	public void setErResidentId(String erResidentId) {
		this.erResidentId = erResidentId;
	}

	public String getErDate() {
		return erDate;
	}

	public void setErDate(String erDate) {
		this.erDate = erDate;
	}

	public String getEUser() {
		return eUser;
	}

	public void setEUser(String user) {
		eUser = user;
	}

	public String getErCount() {
		return erCount;
	}

	public void setErCount(String erCount) {
		this.erCount = erCount;
	}

	public String getErSFCount() {
		return erSFCount;
	}

	public void setErSFCount(String erSFCount) {
		this.erSFCount = erSFCount;
	}

}

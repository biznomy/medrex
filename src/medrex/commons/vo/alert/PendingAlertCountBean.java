package medrex.commons.vo.alert;

import java.io.Serializable;

public class PendingAlertCountBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -786824377981315064L;
	private int residentId;
	private int pastCount;

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getPastCount() {
		return pastCount;
	}

	public void setPastCount(int pastCount) {
		this.pastCount = pastCount;
	}

}

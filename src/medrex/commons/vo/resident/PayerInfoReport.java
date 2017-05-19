package medrex.commons.vo.resident;

import java.io.Serializable;

public class PayerInfoReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6135631151508902205L;
	private String type;
	private String startDate;
	private String endDate;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}

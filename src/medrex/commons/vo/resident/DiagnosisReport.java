package medrex.commons.vo.resident;

import java.io.Serializable;

public class DiagnosisReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -721735529433728830L;
	private String diagnosis;
	private String order;

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}

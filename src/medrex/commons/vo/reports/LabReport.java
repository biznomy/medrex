package medrex.commons.vo.reports;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LabReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4930745975565534541L;
	// patientDetails :: must be another object
	private String patientFirstName;
	private String patientLastName;
	private int patientId;
	private Date dob;

	// reportDetails
	String type;
	List<LabReportTest> testResults;

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public List<LabReportTest> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<LabReportTest> testResults) {
		this.testResults = testResults;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

package medrex.commons.vo.census;

import java.io.Serializable;

import medrex.commons.enums.Severity;

/**
 * @author D S Narkua
 */
public class CensusStatusForResident implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5228976193480176940L;

	private boolean admissionStatus;
	private String admissionStatusDesc;
	private Severity admissionSeverity;
	private boolean dischargeToHospital;
	private boolean signInStatus;
	private String signInStatusDesc;
	private Severity signInSeverity;
	private String outOnPassStatusDesc;
	private Severity outOnPassSeverity;
	private int outOnPassDays;

	public boolean isAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(boolean admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public String getAdmissionStatusDesc() {
		return admissionStatusDesc;
	}

	public void setAdmissionStatusDesc(String admissionStatusDesc) {
		this.admissionStatusDesc = admissionStatusDesc;
	}

	public Severity getAdmissionSeverity() {
		return admissionSeverity;
	}

	public void setAdmissionSeverity(Severity admissionSeverity) {
		this.admissionSeverity = admissionSeverity;
	}

	public void setDischargeToHospital(boolean dischargeToHospital) {
		this.dischargeToHospital = dischargeToHospital;
	}

	public boolean isDischargeToHospital() {
		return dischargeToHospital;
	}

	public boolean isSignInStatus() {
		return signInStatus;
	}

	public void setSignInStatus(boolean signInStatus) {
		this.signInStatus = signInStatus;
	}

	public String getSignInStatusDesc() {
		return signInStatusDesc;
	}

	public void setSignInStatusDesc(String signInStatusDesc) {
		this.signInStatusDesc = signInStatusDesc;
	}

	public Severity getSignInSeverity() {
		return signInSeverity;
	}

	public void setSignInSeverity(Severity signInSeverity) {
		this.signInSeverity = signInSeverity;
	}

	public String getOutOnPassStatusDesc() {
		return outOnPassStatusDesc;
	}

	public void setOutOnPassStatusDesc(String outOnPassStatusDesc) {
		this.outOnPassStatusDesc = outOnPassStatusDesc;
	}

	public Severity getOutOnPassSeverity() {
		return outOnPassSeverity;
	}

	public void setOutOnPassSeverity(Severity outOnPassSeverity) {
		this.outOnPassSeverity = outOnPassSeverity;
	}

	public int getOutOnPassDays() {
		return outOnPassDays;
	}

	public void setOutOnPassDays(int outOnPassDays) {
		this.outOnPassDays = outOnPassDays;
	}
}

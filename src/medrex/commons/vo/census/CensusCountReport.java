package medrex.commons.vo.census;

import java.io.Serializable;

/**
 * @author D S Naruka
 */
public class CensusCountReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1604539112300053655L;

	private String date;
	private String inHouseCount;
	private String inHouseFirstFloor;
	private String inHouseSecondFloor;
	private String admissionCount;
	private String dischargeCount;
	private String bedholdCount;
	private String hospitalCount;
	private String outOnPassCount;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInHouseCount() {
		return inHouseCount;
	}

	public void setInHouseCount(String inHouseCount) {
		this.inHouseCount = inHouseCount;
	}

	public String getInHouseFirstFloor() {
		return inHouseFirstFloor;
	}

	public void setInHouseFirstFloor(String inHouseFirstFloor) {
		this.inHouseFirstFloor = inHouseFirstFloor;
	}

	public String getInHouseSecondFloor() {
		return inHouseSecondFloor;
	}

	public void setInHouseSecondFloor(String inHouseSecondFloor) {
		this.inHouseSecondFloor = inHouseSecondFloor;
	}

	public String getAdmissionCount() {
		return admissionCount;
	}

	public void setAdmissionCount(String admissionCount) {
		this.admissionCount = admissionCount;
	}

	public String getDischargeCount() {
		return dischargeCount;
	}

	public void setDischargeCount(String dischargeCount) {
		this.dischargeCount = dischargeCount;
	}

	public String getBedholdCount() {
		return bedholdCount;
	}

	public void setBedholdCount(String bedholdCount) {
		this.bedholdCount = bedholdCount;
	}

	public String getHospitalCount() {
		return hospitalCount;
	}

	public void setHospitalCount(String hospitalCount) {
		this.hospitalCount = hospitalCount;
	}

	public String getOutOnPassCount() {
		return outOnPassCount;
	}

	public void setOutOnPassCount(String outOnPassCount) {
		this.outOnPassCount = outOnPassCount;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}

package medrex.commons.vo.accurities;

import java.io.Serializable;

public class AcuitiesReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5262388593120138855L;
	private int serial;
	private String residentId;
	private String typeId;
	private String date;
	private String floor;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getResidentId() {
		return residentId;
	}

	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
}

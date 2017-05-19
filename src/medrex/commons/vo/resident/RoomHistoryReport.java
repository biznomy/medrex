package medrex.commons.vo.resident;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoomHistory")
public class RoomHistoryReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2774187785174844105L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private String residentId;
	@Column(name = "censusId")
	private String censusId;
	@Column(name = "floor")
	private String floor;
	@Column(name = "room")
	private String room;
	@Column(name = "startDate")
	private String startDate;
	@Column(name = "endDate")
	private String endDate;

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

	public String getCensusId() {
		return censusId;
	}

	public void setCensusId(String censusId) {
		this.censusId = censusId;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
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

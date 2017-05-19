package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "temproomhistory")
public class TempRoomHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2780163346561469224L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "censusAdmissionId")
	private int censusAdmissionId;
	@Column(name = "censusDischargeId")
	private int censusDischargeId;
	@Column(name = "floor")
	private String floor;
	@Column(name = "room")
	private String room;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getCensusAdmissionId() {
		return censusAdmissionId;
	}

	public void setCensusAdmissionId(int censusAdmissionId) {
		this.censusAdmissionId = censusAdmissionId;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public int getCensusDischargeId() {
		return censusDischargeId;
	}

	public void setCensusDischargeId(int censusDischargeId) {
		this.censusDischargeId = censusDischargeId;
	}

}

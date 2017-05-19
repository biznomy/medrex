package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoomHistory")
public class RoomHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8020639870033649939L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "censusId")
	private int censusId;
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

	public int getCensusId() {
		return censusId;
	}

	public void setCensusId(int censusId) {
		this.censusId = censusId;
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

}

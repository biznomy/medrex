package medrex.commons.dataObj;

import java.io.Serializable;
import java.util.Date;

import medrex.commons.enums.RoomStatus;
import medrex.commons.vo.resident.ResidentMain;

public class Rooms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6981055424832756643L;
	private String currentFloor;
	private String currentRoom;
	private RoomStatus status;
	private ResidentMain resmain;
	private Date timeSince;

	public String getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(String currentFloor) {
		this.currentFloor = currentFloor;
	}

	public String getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(String currentRoom) {
		this.currentRoom = currentRoom;
	}

	public RoomStatus getStatus() {
		return status;
	}

	public void setStatus(RoomStatus status) {
		this.status = status;
	}

	public ResidentMain getResmain() {
		return resmain;
	}

	public void setResmain(ResidentMain resmain) {
		this.resmain = resmain;
	}

	public Date getTimeSince() {
		return timeSince;
	}

	public void setTimeSince(Date timeSince) {
		this.timeSince = timeSince;
	}

}

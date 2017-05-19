package medrex.commons.dataObj.census;

import java.io.Serializable;
import java.util.Date;

import medrex.commons.vo.resident.ResidentMain;

public class DashboardInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7654133322903484056L;
	private ResidentMain resmain;
	private int fromId;
	private String currentFloor;
	private String currentRoom;
	private Date admittedOn;

	public ResidentMain getResmain() {
		return resmain;
	}

	public void setResmain(ResidentMain resmain) {
		this.resmain = resmain;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

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

	public Date getAdmittedOn() {
		return admittedOn;
	}

	public void setAdmittedOn(Date admittedOn) {
		this.admittedOn = admittedOn;
	}

}

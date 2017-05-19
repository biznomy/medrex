package medrex.commons.vo.resident;

import java.util.Date;

public class RoomChange {

	Date changeDate;
	String fromRoom;
	String toRoom;
	int residentId;

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getFromRoom() {
		return fromRoom;
	}

	public void setFromRoom(String fromRoom) {
		this.fromRoom = fromRoom;
	}

	public String getToRoom() {
		return toRoom;
	}

	public void setToRoom(String toRoom) {
		this.toRoom = toRoom;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

}

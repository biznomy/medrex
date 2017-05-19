package medrex.commons.dataObj.physicianOrders;

import java.util.Date;

public class Wound {

	private String locationWound;
	private boolean ota;
	private boolean shift;
	private boolean cleanseNs;
	private boolean removeStaples;
	private Date on;
	private String dailyBid;

	public void setLocationWound(String locationWound) {
		this.locationWound = locationWound;
	}

	public String getLocationWound() {
		return this.locationWound;
	}

	public void setOta(boolean ota) {
		this.ota = ota;
	}

	public boolean isOta() {
		return this.ota;
	}

	public void setCleanseNs(boolean cleanseNs) {
		this.cleanseNs = cleanseNs;
	}

	public boolean isCleanseNs() {
		return this.cleanseNs;
	}

	public void setShift(boolean shift) {
		this.shift = shift;
	}

	public boolean isShift() {
		return this.shift;
	}

	public void setRemoveStaples(boolean removeStaples) {
		this.removeStaples = removeStaples;
	}

	public boolean isRemoveStaples() {
		return this.removeStaples;
	}

	public void setOn(Date on) {
		this.on = on;
	}

	public Date getOn() {
		return this.on;
	}

	public void setDailyBid(String dailyBid) {
		this.dailyBid = dailyBid;
	}

	public String getDailyBid() {
		return this.dailyBid;
	}
}

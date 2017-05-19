package medrex.commons.dataObj.physicianOrders;

public class Stage2 {

	private int days;
	private String location;
	private boolean applyNoSting;
	private boolean cleanseArea;
	private boolean hydrocolloid;
	private boolean foamDressing;
	private boolean daysAndPrn;
	private boolean hydrogel;
	private int granulatingTissue;

	public int getGranulatingTissue() {
		return granulatingTissue;
	}

	public void setGranulatingTissue(int granulatingTissue) {
		this.granulatingTissue = granulatingTissue;
	}

	public boolean isHydrogel() {
		return hydrogel;
	}

	public void setHydrogel(boolean hydrogel) {
		this.hydrogel = hydrogel;
	}

	public int getDays() {
		return this.days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isApplyNoSting() {
		return this.applyNoSting;
	}

	public void setApplyNoSting(boolean applyNoSting) {
		this.applyNoSting = applyNoSting;
	}

	public boolean isCleanseArea() {
		return this.cleanseArea;
	}

	public void setCleanseArea(boolean cleanseArea) {
		this.cleanseArea = cleanseArea;
	}

	public boolean isHydrocolloid() {
		return this.hydrocolloid;
	}

	public void setHydrocolloid(boolean hydrocolloid) {
		this.hydrocolloid = hydrocolloid;
	}

	public boolean isFoamDressing() {
		return this.foamDressing;
	}

	public void setFoamDressing(boolean foamDressing) {
		this.foamDressing = foamDressing;
	}

	public boolean isDaysAndPrn() {
		return this.daysAndPrn;
	}

	public void setDaysAndPrn(boolean daysAndPrn) {
		this.daysAndPrn = daysAndPrn;
	}

}
package medrex.commons.dataObj.physicianOrders;

public class Stage1 {

	private String location;
	private boolean applyProtective;
	private boolean skinSealants;
	private boolean hydrocolloid;
	private boolean days;
	private boolean foamDressing;
	private boolean protectiveBarrier;
	private boolean other;

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public void setProtectiveBarrier(boolean protectiveBarrier) {
		this.protectiveBarrier = protectiveBarrier;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isApplyProtective() {
		return this.applyProtective;
	}

	public void setApplyProtective(boolean applyProtective) {
		this.applyProtective = applyProtective;
	}

	public boolean isSkinSealants() {
		return this.skinSealants;
	}

	public void setSkinSealants(boolean skinSealants) {
		this.skinSealants = skinSealants;
	}

	public boolean isHydrocolloid() {
		return this.hydrocolloid;
	}

	public void setHydrocolloid(boolean hydrocolloid) {
		this.hydrocolloid = hydrocolloid;
	}

	public boolean isDays() {
		return this.days;
	}

	public void setDays(boolean days) {
		this.days = days;
	}

	public boolean isFoamDressing() {
		return this.foamDressing;
	}

	public void setFoamDressing(boolean foamDressing) {
		this.foamDressing = foamDressing;
	}

	public boolean isProtectiveBarrier() {
		return this.protectiveBarrier;
	}
}

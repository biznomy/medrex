package medrex.commons.dataObj.physicianOrders;

public class SkinTears {

	private String locationSkinTears;
	private boolean miscellaneous;
	private boolean capillaryRefill;
	private String frequencyRefill;
	private boolean pedalPulse;
	private String locationPedalPulse;
	private String frequencyPedalPulse;

	public void setLocationSkinTears(String locationSkinTears) {
		this.locationSkinTears = locationSkinTears;
	}

	public String getLocationSkinTears() {
		return this.locationSkinTears;
	}

	public void setMiscellaneous(boolean miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public boolean isMiscellaneous() {
		return this.miscellaneous;
	}

	public void setCapillaryRefill(boolean capillaryRefill) {
		this.capillaryRefill = capillaryRefill;
	}

	public boolean isCapillaryRefill() {
		return this.capillaryRefill;
	}

	public void setFrequencyRefill(String frequencyRefill) {
		this.frequencyRefill = frequencyRefill;
	}

	public String getFrequencyRefill() {
		return this.frequencyRefill;
	}

	public void setPedalPulse(boolean pedalPulse) {
		this.pedalPulse = pedalPulse;
	}

	public boolean isPedalPulse() {
		return this.pedalPulse;
	}

	public void setLocationPedalPulse(String locationPedalPulse) {
		this.locationPedalPulse = locationPedalPulse;
	}

	public String getLocationPedalPulse() {
		return this.locationPedalPulse;
	}

	public void setFrequencyPedalPulse(String frequencyPedalPulse) {
		this.frequencyPedalPulse = frequencyPedalPulse;
	}

	public String getFrequencyPedalPulse() {
		return this.frequencyPedalPulse;
	}
}

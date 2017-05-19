package medrex.commons.dataObj.physicianOrders;

public class Fungal {
	private String antifungal;
	private boolean cleanse;

	public boolean isCleanse() {
		return this.cleanse;
	}

	public void setCleanse(boolean cleanse) {
		this.cleanse = cleanse;
	}

	public String getAntifungal() {
		return this.antifungal;
	}

	public void setAntifungal(String antifungal) {
		this.antifungal = antifungal;
	}

}

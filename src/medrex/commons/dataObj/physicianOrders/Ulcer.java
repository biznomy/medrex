package medrex.commons.dataObj.physicianOrders;

public class Ulcer {

	private boolean heelLift;
	private boolean offLoad;
	private boolean barrierFilm;

	public boolean isOffLoad() {
		return this.offLoad;
	}

	public void setOffLoad(boolean offLoad) {
		this.offLoad = offLoad;
	}

	public boolean isHeelLift() {
		return this.heelLift;
	}

	public void setHeelLift(boolean heelLift) {
		this.heelLift = heelLift;
	}

	public boolean isBarrierFilm() {
		return this.barrierFilm;
	}

	public void setBarrierFilm(boolean barrierFilm) {
		this.barrierFilm = barrierFilm;
	}

}

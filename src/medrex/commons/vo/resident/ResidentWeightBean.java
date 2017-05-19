package medrex.commons.vo.resident;

import java.io.Serializable;

public class ResidentWeightBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3131856030138115261L;
	private String residentName;
	private String weight;
	private String weightDate;

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeightDate() {
		return weightDate;
	}

	public void setWeightDate(String weightDate) {
		this.weightDate = weightDate;
	}
}

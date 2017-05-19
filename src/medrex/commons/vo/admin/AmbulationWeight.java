package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AmbulationWeight")
public class AmbulationWeight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1469642316184783531L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "ambulationType")
	private String ambulationType;
	@Column(name = "weight")
	private double weight;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getAmbulationType() {
		return ambulationType;
	}

	public void setAmbulationType(String ambulationType) {
		this.ambulationType = ambulationType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}

package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WeeklyWeightsFormRow")
public class WeeklyWeightsFormRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5824020566216066716L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formSerial")
	private int formSerial;
	@Column(name = "rowSerial")
	private int rowSerial;
	@Column(name = "name")
	private String name;
	@Column(name = "room")
	private String room;
	@Column(name = "physician")
	private String physician;
	@Column(name = "weightPrior")
	private String weightPrior;
	@Column(name = "weight1")
	private String weight1;
	@Column(name = "weight2")
	private String weight2;
	@Column(name = "weight3")
	private String weight3;
	@Column(name = "weight4")
	private String weight4;
	@Column(name = "scaleUsed")
	private String scaleUsed;
	@Column(name = "weight")
	private String weight;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormSerial() {
		return formSerial;
	}

	public void setFormSerial(int formSerial) {
		this.formSerial = formSerial;
	}

	public int getRowSerial() {
		return rowSerial;
	}

	public void setRowSerial(int rowSerial) {
		this.rowSerial = rowSerial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getWeightPrior() {
		return weightPrior;
	}

	public void setWeightPrior(String weightPrior) {
		this.weightPrior = weightPrior;
	}

	public String getWeight1() {
		return weight1;
	}

	public void setWeight1(String weight1) {
		this.weight1 = weight1;
	}

	public String getWeight2() {
		return weight2;
	}

	public void setWeight2(String weight2) {
		this.weight2 = weight2;
	}

	public String getWeight3() {
		return weight3;
	}

	public void setWeight3(String weight3) {
		this.weight3 = weight3;
	}

	public String getWeight4() {
		return weight4;
	}

	public void setWeight4(String weight4) {
		this.weight4 = weight4;
	}

	public String getScaleUsed() {
		return scaleUsed;
	}

	public void setScaleUsed(String scaleUsed) {
		this.scaleUsed = scaleUsed;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}

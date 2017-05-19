package medrex.commons.vo.scheduling;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scheduling")
public class scheduling implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1318195407613645073L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "procedureType")
	private String procedureType;
	@Column(name = "monproced")
	private int monproced;
	@Column(name = "tusproced")
	private int tusproced;
	@Column(name = "wedproced")
	private int wedproced;
	@Column(name = "thruproced")
	private int thruproced;
	@Column(name = "friproced")
	private int friproced;
	@Column(name = "satproced")
	private int satproced;
	@Column(name = "sunproced")
	private int sunproced;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public String getProcedureType() {
		return procedureType;
	}

	public int getMonproced() {
		return monproced;
	}

	public int getTusproced() {
		return tusproced;
	}

	public int getWedproced() {
		return wedproced;
	}

	public int getThruproced() {
		return thruproced;
	}

	public int getFriproced() {
		return friproced;
	}

	public int getSatproced() {
		return satproced;
	}

	public int getSunproced() {
		return sunproced;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setProcedureType(String procedureType) {
		this.procedureType = procedureType;
	}

	public void setMonproced(int monproced) {
		this.monproced = monproced;
	}

	public void setTusproced(int tusproced) {
		this.tusproced = tusproced;
	}

	public void setWedproced(int wedproced) {
		this.wedproced = wedproced;
	}

	public void setThruproced(int thruproced) {
		this.thruproced = thruproced;
	}

	public void setFriproced(int friproced) {
		this.friproced = friproced;
	}

	public void setSatproced(int satproced) {
		this.satproced = satproced;
	}

	public void setSunproced(int sunproced) {
		this.sunproced = sunproced;
	}

}

package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PressureSoreRecordFormRow")
public class PressureSoreRecordFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8710941222382674456L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "pressureSoreRecordFormSerial")
	private int pressureSoreRecordFormSerial;
	@Column(name = "pressureSoreRecordFormRowSerial")
	private int pressureSoreRecordFormRowSerial;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "location")
	private String location;
	@Column(name = "stage")
	private String stage;
	@Column(name = "diameter")
	private String diameter;
	@Column(name = "depth")
	private String depth;
	@Column(name = "color")
	private String color;
	@Column(name = "odor")
	private String odor;
	@Column(name = "drain")
	private String drain;
	@Column(name = "tunneling")
	private String tunneling;
	@Column(name = "comments")
	private String comments;
	@Column(name = "initials")
	private boolean initials;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getDrain() {
		return drain;
	}

	public void setDrain(String drain) {
		this.drain = drain;
	}

	public boolean isInitials() {
		return initials;
	}

	public void setInitials(boolean initials) {
		this.initials = initials;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOdor() {
		return odor;
	}

	public void setOdor(String odor) {
		this.odor = odor;
	}

	public int getPressureSoreRecordFormRowSerial() {
		return pressureSoreRecordFormRowSerial;
	}

	public void setPressureSoreRecordFormRowSerial(
			int pressureSoreRecordFormRowSerial) {
		this.pressureSoreRecordFormRowSerial = pressureSoreRecordFormRowSerial;
	}

	public int getPressureSoreRecordFormSerial() {
		return pressureSoreRecordFormSerial;
	}

	public void setPressureSoreRecordFormSerial(int pressureSoreRecordFormSerial) {
		this.pressureSoreRecordFormSerial = pressureSoreRecordFormSerial;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTunneling() {
		return tunneling;
	}

	public void setTunneling(String tunneling) {
		this.tunneling = tunneling;
	}

}

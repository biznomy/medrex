package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NurseTreatmentNotesFormRow1")
public class NurseTreatmentNotesFormRow1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5600050975926311013L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formSerial")
	private int formSerial;
	@Column(name = "rowSerial")
	private int rowSerial;
	@Column(name = "nursesInitial")
	private boolean nursesInitial;
	@Column(name = "shift")
	private String shift;
	@Column(name = "signature")
	private String signature;
	@Column(name = "nurseTreatmentNotesFormSerial")
	private int nurseTreatmentNotesFormSerial;
	@Column(name = "nurseTreatmentNotesRowSerial")
	int nurseTreatmentNotesRowSerial;

	public int getFormSerial() {
		return formSerial;
	}

	public void setFormSerial(int formSerial) {
		this.formSerial = formSerial;
	}

	public boolean isNursesInitial() {
		return nursesInitial;
	}

	public void setNursesInitial(boolean nursesInitial) {
		this.nursesInitial = nursesInitial;
	}

	public int getRowSerial() {
		return rowSerial;
	}

	public void setRowSerial(int rowSerial) {
		this.rowSerial = rowSerial;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getNurseTreatmentNotesFormSerial() {
		return nurseTreatmentNotesFormSerial;
	}

	public void setNurseTreatmentNotesFormSerial(
			int nurseTreatmentNotesFormSerial) {
		this.nurseTreatmentNotesFormSerial = nurseTreatmentNotesFormSerial;
	}
}

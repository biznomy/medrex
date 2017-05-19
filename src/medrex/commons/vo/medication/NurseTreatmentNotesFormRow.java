package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NurseTreatmentNotesFormRow")
public class NurseTreatmentNotesFormRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2007103973417579872L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formSerial")
	private int formSerial;
	@Column(name = "rowSerial")
	private int rowSerial;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "timeRecord")
	private String timeRecord;
	@Column(name = "nursesInitial")
	private boolean nursesInitial;
	@Column(name = "treatment")
	private String treatment;
	@Column(name = "result")
	private String result;
	@Column(name = "reason")
	private String reason;
	@Column(name = "nurseTreatmentNotesFormSerial")
	private int nurseTreatmentNotesFormSerial;
	@Column(name = "nurseTreatmentNotesRowSerial")
	private int nurseTreatmentNotesRowSerial;

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public String getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(String timeRecord) {
		this.timeRecord = timeRecord;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public int getNurseTreatmentNotesRowSerial() {
		return nurseTreatmentNotesRowSerial;
	}

	public void setNurseTreatmentNotesRowSerial(int nurseTreatmentNotesRowSerial) {
		this.nurseTreatmentNotesRowSerial = nurseTreatmentNotesRowSerial;
	}

}

package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "NurseMedicationNotesFormRow")
public class NurseMedicationNotesFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1040490432395299504L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formSerial")
	private int formSerial;
	@Column(name = "rowSerial")
	private int rowSerial;
	@Column(name = "dateRecord")
	@Type(type = "date")
	private Date dateRecord;
	@Column(name = "timeRecord")
	private String timeRecord;
	@Column(name = "nursesInitial")
	private boolean nursesInitial;
	@Column(name = "drugStrength")
	private String drugStrength;
	@Column(name = "site")
	private String site;
	@Column(name = "result")
	private String result;
	@Column(name = "reason")
	private String reason;
	@Column(name = "obsInitial")
	private boolean obsInitial;

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getDrugStrength() {
		return drugStrength;
	}

	public void setDrugStrength(String drugStrength) {
		this.drugStrength = drugStrength;
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

	public boolean isObsInitial() {
		return obsInitial;
	}

	public void setObsInitial(boolean obsInitial) {
		this.obsInitial = obsInitial;
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(String timeRecord) {
		this.timeRecord = timeRecord;
	}
}

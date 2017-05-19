package medrex.commons.vo.progressNotes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InterDisciplinaryProgressNotesFormRow")
public class InterDisciplinaryProgressNotesFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7344352245412740227L;
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
	@Column(name = "discipline")
	private String discipline;
	@Column(name = "notes")
	private String notes;

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

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(String timeRecord) {
		this.timeRecord = timeRecord;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}

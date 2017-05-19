package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DailySkilledNursesNotesRow")
public class DailySkilledNursesNotesRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6907176715530566589L;

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

	@Column(name = "comments")
	private String comments;

	@Column(name = "signature")
	private String signature;

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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}

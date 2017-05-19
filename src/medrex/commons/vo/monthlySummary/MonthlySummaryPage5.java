package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MonthlySummaryPage5")
public class MonthlySummaryPage5 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6266008609133545612L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	private MonthlySummaryRecord formId;

	@Column(name = "signature3")
	private String signature3;

	@Column(name = "signature2")
	private String signature2;

	@Column(name = "signature1")
	private String signature1;

	@Column(name = "areaComments")
	private String areaComments;

	@Column(name = "date")
	private Date date;

	@Column(name = "room")
	private String room;

	@Column(name = "residentName")
	private String residentName;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public String getSignature3() {
		return signature3;
	}

	public void setSignature3(String signature3) {
		this.signature3 = signature3;
	}

	public String getSignature2() {
		return signature2;
	}

	public void setSignature2(String signature2) {
		this.signature2 = signature2;
	}

	public String getSignature1() {
		return signature1;
	}

	public void setSignature1(String signature1) {
		this.signature1 = signature1;
	}

	public String getAreaComments() {
		return areaComments;
	}

	public void setAreaComments(String areaComments) {
		this.areaComments = areaComments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

}

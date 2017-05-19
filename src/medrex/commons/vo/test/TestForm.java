package medrex.commons.vo.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;

@Entity
@Table(name = "TestForm")
public class TestForm {
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	private MonthlySummaryRecord formId;
	@Column(name = "residentId")
	int residentId;
	@Column(name = "username")
	String username;
	@Column(name = "address")
	String address;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

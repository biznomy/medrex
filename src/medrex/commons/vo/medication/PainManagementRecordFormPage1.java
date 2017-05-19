package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PainManagementRecordFormPage1")
public class PainManagementRecordFormPage1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4274560526477599853L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "evaluation1")
	private String evaluation1;
	@Column(name = "evaluation2")
	private String evaluation2;

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

	public String getEvaluation1() {
		return evaluation1;
	}

	public void setEvaluation1(String evaluation1) {
		this.evaluation1 = evaluation1;
	}

	public String getEvaluation2() {
		return evaluation2;
	}

	public void setEvaluation2(String evaluation2) {
		this.evaluation2 = evaluation2;
	}

}

package medrex.commons.vo.admission.analyzer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CarePlanAnalyzer")
public class CarePlanAnalyzerBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3818229931824756079L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "formName")
	private String formName;
	@Column(name = "formSubName")
	private String formSubName;
	@Column(name = "message")
	private String message;

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

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFormSubName() {
		return formSubName;
	}

	public void setFormSubName(String formSubName) {
		this.formSubName = formSubName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

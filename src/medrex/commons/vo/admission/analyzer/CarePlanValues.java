package medrex.commons.vo.admission.analyzer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CarePlanValues")
public class CarePlanValues implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2545568720475673884L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "carePlanCommunication")
	private String carePlanCommunication;
	@Column(name = "carePlanHearing")
	private String carePlanHearing;
	@Column(name = "carePlanVision")
	private String carePlanVision;

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

	public String getCarePlanCommunication() {
		return carePlanCommunication;
	}

	public void setCarePlanCommunication(String carePlanCommunication) {
		this.carePlanCommunication = carePlanCommunication;
	}

	public String getCarePlanHearing() {
		return carePlanHearing;
	}

	public void setCarePlanHearing(String carePlanHearing) {
		this.carePlanHearing = carePlanHearing;
	}

	public String getCarePlanVision() {
		return carePlanVision;
	}

	public void setCarePlanVision(String carePlanVision) {
		this.carePlanVision = carePlanVision;
	}

}

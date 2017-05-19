package medrex.commons.vo.dietary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DietaryPlazaHealthRow")
public class DietaryPlazaHealthRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3158813342918716543L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "dietaryPlazaHealthSerial")
	private int dietaryPlazaHealthSerial;
	@Column(name = "dietaryPlazaHealthRowSerial")
	private int dietaryPlazaHealthRowSerial;
	@Column(name = "nurseSign")
	private String nurseSign;
	@Column(name = "dieticianSign")
	private String dieticianSign;
	@Column(name = "consultant")
	private String consultant;
	@Column(name = "dateField")
	private Date dateField;

	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public Date getDateField() {
		return dateField;
	}

	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}

	public int getDietaryPlazaHealthRowSerial() {
		return dietaryPlazaHealthRowSerial;
	}

	public void setDietaryPlazaHealthRowSerial(int dietaryPlazaHealthRowSerial) {
		this.dietaryPlazaHealthRowSerial = dietaryPlazaHealthRowSerial;
	}

	public int getDietaryPlazaHealthSerial() {
		return dietaryPlazaHealthSerial;
	}

	public void setDietaryPlazaHealthSerial(int dietaryPlazaHealthSerial) {
		this.dietaryPlazaHealthSerial = dietaryPlazaHealthSerial;
	}

	public String getDieticianSign() {
		return dieticianSign;
	}

	public void setDieticianSign(String dieticianSign) {
		this.dieticianSign = dieticianSign;
	}

	public String getNurseSign() {
		return nurseSign;
	}

	public void setNurseSign(String nurseSign) {
		this.nurseSign = nurseSign;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}

package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formSchedule")
public class FormSchedule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1773245452508441926L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "form")
	private String form;

	@Column(name = "type")
	private String type;

	@Column(name = "timeFrom")
	private int timeFrom;

	@Column(name = "timeFromType")
	private String timeFromType;

	@Column(name = "alertAfter")
	private int alertAfter;

	@Column(name = "alertAfterType")
	private String alertAfterType;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(int timeFrom) {
		this.timeFrom = timeFrom;
	}

	public int getAlertAfter() {
		return alertAfter;
	}

	public void setAlertAfter(int alertAfter) {
		this.alertAfter = alertAfter;
	}

	public String getTimeFromType() {
		return timeFromType;
	}

	public void setTimeFromType(String timeFromType) {
		this.timeFromType = timeFromType;
	}

	public String getAlertAfterType() {
		return alertAfterType;
	}

	public void setAlertAfterType(String alertAfterType) {
		this.alertAfterType = alertAfterType;
	}
}

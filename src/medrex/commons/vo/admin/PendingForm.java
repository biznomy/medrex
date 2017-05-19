package medrex.commons.vo.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pendingforms")
public class PendingForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9140908775388594166L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "form")
	private String form;

	@Column(name = "alertDate")
	private Date alertDate;

	@Column(name = "formDueDate")
	private Date formDueDate;

	@Column(name = "censusId")
	private int censusId;

	@Column(name = "formId")
	private int formId;

	@Column(name = "type")
	private String type;

	@Column(name = "residentId")
	private int residentId;

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

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

	public Date getAlertDate() {
		return alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	public Date getFormDueDate() {
		return formDueDate;
	}

	public void setFormDueDate(Date formDueDate) {
		this.formDueDate = formDueDate;
	}

	public int getCensusId() {
		return censusId;
	}

	public void setCensusId(int censusId) {
		this.censusId = censusId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

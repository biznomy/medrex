package medrex.commons.vo.alert;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AlertReciever")
public class AlertReciever implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2192826567533022538L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "alertId")
	private Alert alertId;

	@Column(name = "recieverId")
	private int recieverId;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Alert getAlertId() {
		return alertId;
	}

	public void setAlertId(Alert alertId) {
		this.alertId = alertId;
	}

	public int getRecieverId() {
		return recieverId;
	}

	public void setRecieverId(int recieverId) {
		this.recieverId = recieverId;
	}

}

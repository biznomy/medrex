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
@Table(name = "AlertTime")
public class AlertTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1240010360996920077L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "alertId")
	private Alert alertId;

	@Column(name = "time")
	private String time;

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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}

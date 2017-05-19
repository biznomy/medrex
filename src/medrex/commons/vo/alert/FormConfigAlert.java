package medrex.commons.vo.alert;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FormConfigAlert")
public class FormConfigAlert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6614298570419206949L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "recieverUser")
	private String recieverUser;
	@Column(name = "recieverDepartment")
	private String recieverDepartment;

	@Column(name = "message")
	private String message;

	@Column(name = "loggedInUser")
	private int loggedInUser;

	@Column(name = "alertDate")
	private Date alertDate;

	@Column(name = "userInfo")
	private String userInfo;

	@Column(name = "userNames")
	private String userNames;

	public String getUserNames() {
		return userNames;
	}

	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}

	@Column(name = "departmentNames")
	private String departmentNames;

	public String getDepartmentNames() {
		return departmentNames;
	}

	public void setDepartmentNames(String departmentNames) {
		this.departmentNames = departmentNames;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public int getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(int loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public Date getAlertDate() {
		return alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	// @Column(name="validationId")
	// private int validationId;
	//		
	// public int getValidationId() {
	// return validationId;
	// }
	// public void setValidationId(int validationId) {
	// this.validationId = validationId;
	// }
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getRecieverUser() {
		return recieverUser;
	}

	public void setRecieverUser(String recieverUser) {
		this.recieverUser = recieverUser;
	}

	public String getRecieverDepartment() {
		return recieverDepartment;
	}

	public void setRecieverDepartment(String recieverDepartment) {
		this.recieverDepartment = recieverDepartment;
	}

}

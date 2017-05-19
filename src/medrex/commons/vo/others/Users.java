package medrex.commons.vo.others;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.security.SecurityRole;

@Entity
@Table(name = "Users")
public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6754502302248832243L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "userStatus")
	private boolean userStatus;
	@Column(name = "userId")
	private int userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userType")
	private String userType;
	@Column(name = "passwdField")
	private String passwdField;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdApplicationRole")
	private SecurityRole applicationRole;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdUserRole")
	private SecurityRole userRole;

	/*
	 * @Column(name = "userRoleId") private int userRoleId;
	 */

	public boolean isUserStatus() {
		return userStatus;
	}

	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

	public SecurityRole getApplicationRole() {
		return applicationRole;
	}

	public void setApplicationRole(SecurityRole applicationRole) {
		this.applicationRole = applicationRole;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getPasswdField() {
		return passwdField;
	}

	public void setPasswdField(String passwdField) {
		this.passwdField = passwdField;
	}

	public SecurityRole getUserRole() {
		return userRole;
	}

	public void setUserRole(SecurityRole userRole) {
		this.userRole = userRole;
	}
}

package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "UserLogon")
public class UserLogon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1132485146706702160L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "USERID")
	private int userId;

	@Column(name = "Login")
	private String login;

	@Column(name = "Logout")
	private String logout;

	@Transient
	@Column(name = "userName")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
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

}

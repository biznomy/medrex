package medrex.commons.vo.ra;

import java.io.Serializable;
import java.util.Date;

import medrex.commons.intf.DataObject;

public class RAFPg1Sec1 implements Serializable, DataObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3168507252778513840L;
	private int rafpg1Serial;
	private String firstName;
	private String lastName;
	private String roomNo;
	private Date dateOfBirth;
	private int age;
	private String sex;

	public int getRafpg1Serial() {
		return rafpg1Serial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setRafpg1Serial(int rafpg1Serial) {
		this.rafpg1Serial = rafpg1Serial;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}

package medrex.commons.vo.tutorial.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @Entity means  hibernate understand that this class behaves like an entity containing 
 *   multiple information.
 */
@Entity
/*
 * @Table shows that this class is mapped with a table inside database
 * associated with the name attribute of table entity.
 */
@Table(name = "TutPhones")
/*
 * Serializable interface is just a marker interface and every class need to
 * implement this interface in order to get persisted. in other words marker
 * interface is used to persists the state of an object....
 */
public class TutPhones implements Serializable {
	/*
	 * Property serial of the class position is mapped with @Id and
	 * 
	 * @GeneratedValue because every table must have a primary key (here is the
	 * serial) and the serial will always store a non unique value and will be
	 * auto generated.
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	/*
	 * @GeneratedValue defines the strategy for id value generation.
	 */
	@GeneratedValue
	/*
	 * Every property in position VO is mapped with aunique column inside the
	 * position table with @Column annotation.
	 */
	@Column(name = "serial")
	private int serial;

	@Column(name = "phoneNumber")
	private String phoneNumaber;

	@Column(name = "phoneType")
	private String phoneType;

	/*
	 * this is default constructor....
	 */
	public TutPhones() {

	}

	/*
	 * This is Parameterized constructor....
	 */
	public TutPhones(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumaber = phoneNumber;
	}

	/*
	 * Getter and setter methods are used to set and get values...
	 */
	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getPhoneNumaber() {
		return phoneNumaber;
	}

	public void setPhoneNumaber(String phoneNumaber) {
		this.phoneNumaber = phoneNumaber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
}

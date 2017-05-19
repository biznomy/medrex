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
@Table(name = "TutDoctor")
/*
 * Serializable interface is just a marker interface and every class need to
 * implement this interface in order to get persisted. in other words marker
 * interface is used to persists the state of an object....
 */
public class TutDoctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4437353162045657448L;

	/**
	 * @Id specifies that this field will behave as a primary key. Property
	 *     Property serial of the class position is mapped with @Id and @GeneratedValue
	 *     because every table must have a primary key (here is the serial) and
	 *     the serial will always store a non unique value and will be auto
	 *     generated.
	 **/
	@Id
	/*
	 * @GeneratedValue defines the strategy for id value generation.
	 */
	@GeneratedValue
	/*
	 * Every property in position VO is mapped with aunique column inside the
	 * position table with @Column annotation.
	 */
	@Column(name = "Serial")
	private int serial;

	@Column(name = "doctorName")
	private String doctor_Name;

	/*
	 * @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 * 
	 * @JoinColumn(name="Id_Doctors") public List<TutResident> residents;
	 */

	/*
	 * this is default constructor....
	 */
	public TutDoctor() {

	}

	/*
	 * This is Parameterized constructor....
	 */
	public TutDoctor(String doctor_Name) {
		this.doctor_Name = doctor_Name;

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

	public String getDoctor_Name() {
		return doctor_Name;
	}

	public void setDoctor_Name(String doctor_Name) {
		this.doctor_Name = doctor_Name;
	}
}

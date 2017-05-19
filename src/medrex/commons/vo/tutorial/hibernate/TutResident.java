package medrex.commons.vo.tutorial.hibernate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/*
 * @Entity means  hibernate understand that this class behaves like an entity containing 
 *   multiple information and a table is supposed to be generated for the same.
 */
@Entity
/*
 * @Table shows that this class is mapped with a table inside database
 * associated with the name attribute of table entity.
 */
@Table(name = "TutResident")
/*
 * java.io.Serializable interface is just a marker interface and every class
 * need to implement this interface in order to get persisted. in other words
 * marker interface is used to persists the state of an object....
 */
public class TutResident implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -846652362141450406L;

	/*
	 * @Id specifies that this field will behave as a primary key. Property
	 * serial of the class position is mapped with @Id and @GeneratedValue
	 * because every table must have a primary key (here is the serial) and the
	 * serial will always store a non unique value and will be auto generated.
	 */
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

	@Column(name = "name")
	private String name;

	@Column(name = "dob")
	private Date dateOfBirth;

	@Column(name = "noOfChildren")
	private int noOfChildren;

	/*
	 * Here we use one to one mapping with TutRoom type object....
	 * cascade=CascadeType.ALL here CascadeType means which type of operation u
	 * want to perform , I mean All,merge,persist,refersh,remove ... to get deep
	 * knowledge about these methods u will study from internet. or u want study
	 * from
	 * http://docs.jboss.org/ejb3/app-server/HibernateAnnotations/reference/
	 * en/html_single/index.html; this link
	 */
	/*
	 * fetch=FetchType.EAGER here FetchType means u want to load child object
	 * when the parent object is loaded or later. we use fetch=FetchType.EAGER
	 * for the same time. and use fetch=FetchType.LAZY for later.
	 * 
	 * respectively
	 */
	//
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idRoom")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private TutRoom room;

	// This is ony to many realation ship with TutPhones object.....
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idResident")
	private List<TutPhones> phones;

	// This is many to one relationship with TutDoctor object.....
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idDoctors", insertable = true, updatable = true, nullable = false)
	@Cascade( { org.hibernate.annotations.CascadeType.SAVE_UPDATE })
	public TutDoctor doctor;

	/*
	 * this is default constructor..
	 */
	public TutResident() {
	}

	/*
	 * this is parameterized constructor.....
	 */
	public TutResident(String residentName, Date res_date_of_Birth,
			int res_no_Of_Children, TutRoom hosptal_Id, TutDoctor doctor,
			TutPhones... phones) {
		this.name = residentName;
		this.dateOfBirth = res_date_of_Birth;
		this.noOfChildren = res_no_Of_Children;
		this.room = hosptal_Id;
		this.doctor = doctor;
		this.phones = Arrays.asList(phones);

	}

	public TutRoom getRoom() {
		return room;
	}

	public void setRoom(TutRoom room) {
		this.room = room;
	}

	/*
	 * Getter and setter methods are used to get and set values.....
	 */
	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public TutDoctor getDoctor() {
		return doctor;
	}

	public void setDoctor(TutDoctor doctor) {
		this.doctor = doctor;
	}

	public List<TutPhones> getPhones() {
		return phones;
	}

	public void setPhones(List<TutPhones> phones) {
		this.phones = phones;
	}
}

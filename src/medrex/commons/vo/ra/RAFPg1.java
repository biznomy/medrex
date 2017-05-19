package medrex.commons.vo.ra;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RAFPg1")
public class RAFPg1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6506774326066356926L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "age")
	private int age;
	@Column(name = "sex")
	private String sex;
	@Column(name = "roomNumber")
	private String roomNumber;
	@Column(name = "commSkills")
	private int commSkills;
	@Column(name = "communicationNotes")
	private String communicationNotes;
	@Column(name = "usesToilet")
	private boolean usesToilet;
	@Column(name = "usesBedPan")
	private boolean usesBedPan;
	@Column(name = "urinal")
	private boolean urinal;
	@Column(name = "bedSideCommode")
	private boolean bedSideCommode;
	@Column(name = "languagesSpoken")
	private String languagesSpoken;
	@Column(name = "cityAndState")
	private String cityAndState;
	@Column(name = "languageNotes")
	private String languageNotes;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCommSkills() {
		return commSkills;
	}

	public void setCommSkills(int commSkills) {
		this.commSkills = commSkills;
	}

	public String getCommunicationNotes() {
		return communicationNotes;
	}

	public void setCommunicationNotes(String communicationNotes) {
		this.communicationNotes = communicationNotes;
	}

	public boolean isUsesToilet() {
		return usesToilet;
	}

	public void setUsesToilet(boolean usesToilet) {
		this.usesToilet = usesToilet;
	}

	public boolean isUsesBedPan() {
		return usesBedPan;
	}

	public void setUsesBedPan(boolean usesBedPan) {
		this.usesBedPan = usesBedPan;
	}

	public boolean isUrinal() {
		return urinal;
	}

	public void setUrinal(boolean urinal) {
		this.urinal = urinal;
	}

	public boolean isBedSideCommode() {
		return bedSideCommode;
	}

	public void setBedSideCommode(boolean bedSideCommode) {
		this.bedSideCommode = bedSideCommode;
	}

	public String getLanguageSpoken() {
		return languagesSpoken;
	}

	public void setLanguagesSpoken(String languagesSpoken) {
		this.languagesSpoken = languagesSpoken;
	}

	public String getCityAndState() {
		return cityAndState;
	}

	public void setCityAndState(String cityAndState) {
		this.cityAndState = cityAndState;
	}

	public String getLanguageNotes() {
		return languageNotes;
	}

	public void setLanguageNotes(String languageNotes) {
		this.languageNotes = languageNotes;
	}
}

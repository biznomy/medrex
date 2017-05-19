package medrex.commons.vo.admission;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentQuarterlyAssessmentFormPage7")
public class ResidentQuarterlyAssessmentFormPage7 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1304708567167695206L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "room")
	private String room;
	@Column(name = "rb1")
	private int rb1;
	@Column(name = "rb2")
	private int rb2;
	@Column(name = "rb3")
	private int rb3;
	@Column(name = "rb4")
	private int rb4;
	@Column(name = "rb5")
	private int rb5;
	@Column(name = "rb6")
	private int rb6;
	@Column(name = "rb7")
	private int rb7;
	@Column(name = "rb8")
	private int rb8;
	@Column(name = "rb9")
	private int rb9;
	@Column(name = "rb10")
	private int rb10;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getRb1() {
		return rb1;
	}

	public void setRb1(int rb1) {
		this.rb1 = rb1;
	}

	public int getRb2() {
		return rb2;
	}

	public void setRb2(int rb2) {
		this.rb2 = rb2;
	}

	public int getRb3() {
		return rb3;
	}

	public void setRb3(int rb3) {
		this.rb3 = rb3;
	}

	public int getRb4() {
		return rb4;
	}

	public void setRb4(int rb4) {
		this.rb4 = rb4;
	}

	public int getRb5() {
		return rb5;
	}

	public void setRb5(int rb5) {
		this.rb5 = rb5;
	}

	public int getRb6() {
		return rb6;
	}

	public void setRb6(int rb6) {
		this.rb6 = rb6;
	}

	public int getRb7() {
		return rb7;
	}

	public void setRb7(int rb7) {
		this.rb7 = rb7;
	}

	public int getRb8() {
		return rb8;
	}

	public void setRb8(int rb8) {
		this.rb8 = rb8;
	}

	public int getRb9() {
		return rb9;
	}

	public void setRb9(int rb9) {
		this.rb9 = rb9;
	}

	public int getRb10() {
		return rb10;
	}

	public void setRb10(int rb10) {
		this.rb10 = rb10;
	}
}

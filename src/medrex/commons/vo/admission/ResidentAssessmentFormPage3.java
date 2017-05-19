package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage3")
public class ResidentAssessmentFormPage3 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1438454811837418385L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "skinColor")
	private int skinColor;
	@Column(name = "skinTurgor")
	private int skinTurgor;
	@Column(name = "skinTemprature")
	private int skinTemprature;
	@Column(name = "skinAppearance")
	private int skinAppearance;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "location")
	private String location;

	@Column(name = "abnormality")
	private String abnormality;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Date getNurseVisit() {
		return nurseVisit;
	}

	public void setNurseVisit(Date nurseVisit) {
		this.nurseVisit = nurseVisit;
	}

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

	public int getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(int skinColor) {
		this.skinColor = skinColor;
	}

	public int getSkinTurgor() {
		return skinTurgor;
	}

	public void setSkinTurgor(int skinTurgor) {
		this.skinTurgor = skinTurgor;
	}

	public int getSkinTemprature() {
		return skinTemprature;
	}

	public void setSkinTemprature(int skinTemprature) {
		this.skinTemprature = skinTemprature;
	}

	public int getSkinAppearance() {
		return skinAppearance;
	}

	public void setSkinAppearance(int skinAppearance) {
		this.skinAppearance = skinAppearance;
	}

	public String getAbnormality() {
		return abnormality;
	}

	public void setAbnormality(String abnormality) {
		this.abnormality = abnormality;
	}

}

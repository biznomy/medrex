package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage6")
public class ResidentAssessmentFormPage6 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4526172000285416049L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "sideQ1")
	private int sideQ1;
	@Column(name = "sideQ2")
	private int sideQ2;
	@Column(name = "sideQ3")
	private int sideQ3;
	@Column(name = "sideQ4")
	private int sideQ4;
	@Column(name = "sideQ5")
	private int sideQ5;
	@Column(name = "sideQ6")
	private int sideQ6;
	@Column(name = "sideQ7")
	private int sideQ7;
	@Column(name = "sideQ8")
	private int sideQ8;
	@Column(name = "sideQ9")
	private int sideQ9;
	@Column(name = "sideQ10")
	private int sideQ10;
	@Column(name = "sideQ11")
	private int sideQ11;
	@Column(name = "sideQ12")
	private int sideQ12;
	@Column(name = "recommendations")
	private int recommendations;
	@Column(name = "orderPhysicians")
	private int orderPhysicians;
	@Column(name = "mentalQ1")
	private String mentalQ1;
	@Column(name = "mentalQ2")
	private String mentalQ2;
	@Column(name = "mentalQ3")
	private String mentalQ3;
	@Column(name = "mentalQ4")
	private String mentalQ4;
	@Column(name = "mentalQ5")
	private String mentalQ5;
	@Column(name = "mentalQ6")
	private String mentalQ6;
	@Column(name = "mentalQ7")
	private String mentalQ7;
	@Column(name = "mentalQ8")
	private String mentalQ8;
	@Column(name = "mentalQ9")
	private String mentalQ9;
	@Column(name = "mentalQ10")
	private String mentalQ10;
	@Column(name = "mentalQ11")
	private String mentalQ11;

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

	public int getSideQ1() {
		return sideQ1;
	}

	public void setSideQ1(int sideQ1) {
		this.sideQ1 = sideQ1;
	}

	public int getSideQ2() {
		return sideQ2;
	}

	public void setSideQ2(int sideQ2) {
		this.sideQ2 = sideQ2;
	}

	public int getSideQ3() {
		return sideQ3;
	}

	public void setSideQ3(int sideQ3) {
		this.sideQ3 = sideQ3;
	}

	public int getSideQ4() {
		return sideQ4;
	}

	public void setSideQ4(int sideQ4) {
		this.sideQ4 = sideQ4;
	}

	public int getSideQ5() {
		return sideQ5;
	}

	public void setSideQ5(int sideQ5) {
		this.sideQ5 = sideQ5;
	}

	public int getSideQ6() {
		return sideQ6;
	}

	public void setSideQ6(int sideQ6) {
		this.sideQ6 = sideQ6;
	}

	public int getSideQ7() {
		return sideQ7;
	}

	public void setSideQ7(int sideQ7) {
		this.sideQ7 = sideQ7;
	}

	public int getSideQ8() {
		return sideQ8;
	}

	public void setSideQ8(int sideQ8) {
		this.sideQ8 = sideQ8;
	}

	public int getSideQ9() {
		return sideQ9;
	}

	public void setSideQ9(int sideQ9) {
		this.sideQ9 = sideQ9;
	}

	public int getSideQ10() {
		return sideQ10;
	}

	public void setSideQ10(int sideQ10) {
		this.sideQ10 = sideQ10;
	}

	public int getSideQ11() {
		return sideQ11;
	}

	public void setSideQ11(int sideQ11) {
		this.sideQ11 = sideQ11;
	}

	public int getSideQ12() {
		return sideQ12;
	}

	public void setSideQ12(int sideQ12) {
		this.sideQ12 = sideQ12;
	}

	public int getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(int recommendations) {
		this.recommendations = recommendations;
	}

	public int getOrderPhysicians() {
		return orderPhysicians;
	}

	public void setOrderPhysicians(int orderPhyscians) {
		this.orderPhysicians = orderPhyscians;
	}

	public String getMentalQ1() {
		return mentalQ1;
	}

	public void setMentalQ1(String mentalQ1) {
		this.mentalQ1 = mentalQ1;
	}

	public String getMentalQ2() {
		return mentalQ2;
	}

	public void setMentalQ2(String mentalQ2) {
		this.mentalQ2 = mentalQ2;
	}

	public String getMentalQ3() {
		return mentalQ3;
	}

	public void setMentalQ3(String mentalQ3) {
		this.mentalQ3 = mentalQ3;
	}

	public String getMentalQ4() {
		return mentalQ4;
	}

	public void setMentalQ4(String mentalQ4) {
		this.mentalQ4 = mentalQ4;
	}

	public String getMentalQ5() {
		return mentalQ5;
	}

	public void setMentalQ5(String mentalQ5) {
		this.mentalQ5 = mentalQ5;
	}

	public String getMentalQ6() {
		return mentalQ6;
	}

	public void setMentalQ6(String mentalQ6) {
		this.mentalQ6 = mentalQ6;
	}

	public String getMentalQ7() {
		return mentalQ7;
	}

	public void setMentalQ7(String mentalQ7) {
		this.mentalQ7 = mentalQ7;
	}

	public String getMentalQ8() {
		return mentalQ8;
	}

	public void setMentalQ8(String mentalQ8) {
		this.mentalQ8 = mentalQ8;
	}

	public String getMentalQ9() {
		return mentalQ9;
	}

	public void setMentalQ9(String mentalQ9) {
		this.mentalQ9 = mentalQ9;
	}

	public String getMentalQ10() {
		return mentalQ10;
	}

	public void setMentalQ10(String mentalQ10) {
		this.mentalQ10 = mentalQ10;
	}

	public String getMentalQ11() {
		return mentalQ11;
	}

	public void setMentalQ11(String mentalQ11) {
		this.mentalQ11 = mentalQ11;
	}

}

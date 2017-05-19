package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage15")
public class ResidentAssessmentFormPage15 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4683030628741037224L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentName")
	private String residentName;
	@Column(name = "room")
	private String room;
	@Column(name = "floor")
	private String floor;
	@Column(name = "locationOfTheWound")
	private String locationOfTheWound;
	@Column(name = "identifiedDate")
	private Date identifiedDate;
	@Column(name = "hospitalAcquired")
	private String hospitalAcquired;
	@Column(name = "facilityAcquired")
	private String facilityAcquired;
	@Column(name = "pressure")
	private String pressure;
	@Column(name = "venous")
	private String venous;
	@Column(name = "sx")
	private String sx;
	@Column(name = "skinTear")
	private String skinTear;
	@Column(name = "idcpTeamSignature1")
	private String idcpTeamSignature1;
	@Column(name = "idcpTeamSignature2")
	private String idcpTeamSignature2;
	@Column(name = "idcpTeamSignature3")
	private String idcpTeamSignature3;
	@Column(name = "idcpTeamSignature4")
	private String idcpTeamSignature4;
	@Column(name = "idcpTeamSignature5")
	private String idcpTeamSignature5;
	@Column(name = "idcpTeamSignature6")
	private String idcpTeamSignature6;
	@Column(name = "idcpTeamSignature7")
	private String idcpTeamSignature7;
	@Column(name = "idcpTeamSignature8")
	private String idcpTeamSignature8;
	@Column(name = "idcpTeamSignature9")
	private String idcpTeamSignature9;
	@Column(name = "idcpTeamSignature10")
	private String idcpTeamSignature10;
	@Column(name = "week1Date1")
	private String week1Date1;
	@Column(name = "week1Date2")
	private String week1Date2;
	@Column(name = "week1Date3")
	private String week1Date3;
	@Column(name = "week1Date4")
	private String week1Date4;
	@Column(name = "week1Date5")
	private String week1Date5;
	@Column(name = "week1Date6")
	private String week1Date6;
	@Column(name = "week1Date7")
	private String week1Date7;
	@Column(name = "week1Date8")
	private String week1Date8;
	@Column(name = "week1Date9")
	private String week1Date9;
	@Column(name = "week1Date10")
	private String week1Date10;
	@Column(name = "week2Date1")
	private String week2Date1;
	@Column(name = "week2Date2")
	private String week2Date2;
	@Column(name = "week2Date3")
	private String week2Date3;
	@Column(name = "week2Date4")
	private String week2Date4;
	@Column(name = "week2Date5")
	private String week2Date5;
	@Column(name = "week2Date6")
	private String week2Date6;
	@Column(name = "week2Date7")
	private String week2Date7;
	@Column(name = "week2Date8")
	private String week2Date8;
	@Column(name = "week2Date9")
	private String week2Date9;
	@Column(name = "week2Date10")
	private String week2Date10;
	@Column(name = "week3Date1")
	private String week3Date1;
	@Column(name = "week3Date2")
	private String week3Date2;
	@Column(name = "week3Date3")
	private String week3Date3;
	@Column(name = "week3Date4")
	private String week3Date4;
	@Column(name = "week3Date5")
	private String week3Date5;
	@Column(name = "week3Date6")
	private String week3Date6;
	@Column(name = "week3Date7")
	private String week3Date7;
	@Column(name = "week3Date8")
	private String week3Date8;
	@Column(name = "week3Date9")
	private String week3Date9;
	@Column(name = "week3Date10")
	private String week3Date10;
	@Column(name = "week4Date1")
	private String week4Date1;
	@Column(name = "week4Date2")
	private String week4Date2;
	@Column(name = "week4Date3")
	private String week4Date3;
	@Column(name = "week4Date4")
	private String week4Date4;
	@Column(name = "week4Date5")
	private String week4Date5;
	@Column(name = "week4Date6")
	private String week4Date6;
	@Column(name = "week4Date7")
	private String week4Date7;
	@Column(name = "week4Date8")
	private String week4Date8;
	@Column(name = "week4Date9")
	private String week4Date9;
	@Column(name = "week4Date10")
	private String week4Date10;
	@Column(name = "formId")
	private int formId;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
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

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getLocationOfTheWound() {
		return locationOfTheWound;
	}

	public void setLocationOfTheWound(String locationOfTheWound) {
		this.locationOfTheWound = locationOfTheWound;
	}

	public Date getIdentifiedDate() {
		return identifiedDate;
	}

	public void setIdentifiedDate(Date identifiedDate) {
		this.identifiedDate = identifiedDate;
	}

	public String getHospitalAcquired() {
		return hospitalAcquired;
	}

	public void setHospitalAcquired(String hospitalAcquired) {
		this.hospitalAcquired = hospitalAcquired;
	}

	public String getFacilityAcquired() {
		return facilityAcquired;
	}

	public void setFacilityAcquired(String facilityAcquired) {
		this.facilityAcquired = facilityAcquired;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getVenous() {
		return venous;
	}

	public void setVenous(String venous) {
		this.venous = venous;
	}

	public String getSx() {
		return sx;
	}

	public void setSx(String sx) {
		this.sx = sx;
	}

	public String getSkinTear() {
		return skinTear;
	}

	public void setSkinTear(String skinTear) {
		this.skinTear = skinTear;
	}

	public String getIdcpTeamSignature1() {
		return idcpTeamSignature1;
	}

	public void setIdcpTeamSignature1(String idcpTeamSignature1) {
		this.idcpTeamSignature1 = idcpTeamSignature1;
	}

	public String getIdcpTeamSignature2() {
		return idcpTeamSignature2;
	}

	public void setIdcpTeamSignature2(String idcpTeamSignature2) {
		this.idcpTeamSignature2 = idcpTeamSignature2;
	}

	public String getIdcpTeamSignature3() {
		return idcpTeamSignature3;
	}

	public void setIdcpTeamSignature3(String idcpTeamSignature3) {
		this.idcpTeamSignature3 = idcpTeamSignature3;
	}

	public String getIdcpTeamSignature4() {
		return idcpTeamSignature4;
	}

	public void setIdcpTeamSignature4(String idcpTeamSignature4) {
		this.idcpTeamSignature4 = idcpTeamSignature4;
	}

	public String getIdcpTeamSignature5() {
		return idcpTeamSignature5;
	}

	public void setIdcpTeamSignature5(String idcpTeamSignature5) {
		this.idcpTeamSignature5 = idcpTeamSignature5;
	}

	public String getIdcpTeamSignature6() {
		return idcpTeamSignature6;
	}

	public void setIdcpTeamSignature6(String idcpTeamSignature6) {
		this.idcpTeamSignature6 = idcpTeamSignature6;
	}

	public String getIdcpTeamSignature7() {
		return idcpTeamSignature7;
	}

	public void setIdcpTeamSignature7(String idcpTeamSignature7) {
		this.idcpTeamSignature7 = idcpTeamSignature7;
	}

	public String getIdcpTeamSignature8() {
		return idcpTeamSignature8;
	}

	public void setIdcpTeamSignature8(String idcpTeamSignature8) {
		this.idcpTeamSignature8 = idcpTeamSignature8;
	}

	public String getIdcpTeamSignature9() {
		return idcpTeamSignature9;
	}

	public void setIdcpTeamSignature9(String idcpTeamSignature9) {
		this.idcpTeamSignature9 = idcpTeamSignature9;
	}

	public String getIdcpTeamSignature10() {
		return idcpTeamSignature10;
	}

	public void setIdcpTeamSignature10(String idcpTeamSignature10) {
		this.idcpTeamSignature10 = idcpTeamSignature10;
	}

	public String getWeek1Date1() {
		return week1Date1;
	}

	public void setWeek1Date1(String week1Date1) {
		this.week1Date1 = week1Date1;
	}

	public String getWeek1Date2() {
		return week1Date2;
	}

	public void setWeek1Date2(String week1Date2) {
		this.week1Date2 = week1Date2;
	}

	public String getWeek1Date3() {
		return week1Date3;
	}

	public void setWeek1Date3(String week1Date3) {
		this.week1Date3 = week1Date3;
	}

	public String getWeek1Date4() {
		return week1Date4;
	}

	public void setWeek1Date4(String week1Date4) {
		this.week1Date4 = week1Date4;
	}

	public String getWeek1Date5() {
		return week1Date5;
	}

	public void setWeek1Date5(String week1Date5) {
		this.week1Date5 = week1Date5;
	}

	public String getWeek1Date6() {
		return week1Date6;
	}

	public void setWeek1Date6(String week1Date6) {
		this.week1Date6 = week1Date6;
	}

	public String getWeek1Date7() {
		return week1Date7;
	}

	public void setWeek1Date7(String week1Date7) {
		this.week1Date7 = week1Date7;
	}

	public String getWeek1Date8() {
		return week1Date8;
	}

	public void setWeek1Date8(String week1Date8) {
		this.week1Date8 = week1Date8;
	}

	public String getWeek1Date9() {
		return week1Date9;
	}

	public void setWeek1Date9(String week1Date9) {
		this.week1Date9 = week1Date9;
	}

	public String getWeek1Date10() {
		return week1Date10;
	}

	public void setWeek1Date10(String week1Date10) {
		this.week1Date10 = week1Date10;
	}

	public String getWeek2Date1() {
		return week2Date1;
	}

	public void setWeek2Date1(String week2Date1) {
		this.week2Date1 = week2Date1;
	}

	public String getWeek2Date2() {
		return week2Date2;
	}

	public void setWeek2Date2(String week2Date2) {
		this.week2Date2 = week2Date2;
	}

	public String getWeek2Date3() {
		return week2Date3;
	}

	public void setWeek2Date3(String week2Date3) {
		this.week2Date3 = week2Date3;
	}

	public String getWeek2Date4() {
		return week2Date4;
	}

	public void setWeek2Date4(String week2Date4) {
		this.week2Date4 = week2Date4;
	}

	public String getWeek2Date5() {
		return week2Date5;
	}

	public void setWeek2Date5(String week2Date5) {
		this.week2Date5 = week2Date5;
	}

	public String getWeek2Date6() {
		return week2Date6;
	}

	public void setWeek2Date6(String week2Date6) {
		this.week2Date6 = week2Date6;
	}

	public String getWeek2Date7() {
		return week2Date7;
	}

	public void setWeek2Date7(String week2Date7) {
		this.week2Date7 = week2Date7;
	}

	public String getWeek2Date8() {
		return week2Date8;
	}

	public void setWeek2Date8(String week2Date8) {
		this.week2Date8 = week2Date8;
	}

	public String getWeek2Date9() {
		return week2Date9;
	}

	public void setWeek2Date9(String week2Date9) {
		this.week2Date9 = week2Date9;
	}

	public String getWeek2Date10() {
		return week2Date10;
	}

	public void setWeek2Date10(String week2Date10) {
		this.week2Date10 = week2Date10;
	}

	public String getWeek3Date1() {
		return week3Date1;
	}

	public void setWeek3Date1(String week3Date1) {
		this.week3Date1 = week3Date1;
	}

	public String getWeek3Date2() {
		return week3Date2;
	}

	public void setWeek3Date2(String week3Date2) {
		this.week3Date2 = week3Date2;
	}

	public String getWeek3Date3() {
		return week3Date3;
	}

	public void setWeek3Date3(String week3Date3) {
		this.week3Date3 = week3Date3;
	}

	public String getWeek3Date4() {
		return week3Date4;
	}

	public void setWeek3Date4(String week3Date4) {
		this.week3Date4 = week3Date4;
	}

	public String getWeek3Date5() {
		return week3Date5;
	}

	public void setWeek3Date5(String week3Date5) {
		this.week3Date5 = week3Date5;
	}

	public String getWeek3Date6() {
		return week3Date6;
	}

	public void setWeek3Date6(String week3Date6) {
		this.week3Date6 = week3Date6;
	}

	public String getWeek3Date7() {
		return week3Date7;
	}

	public void setWeek3Date7(String week3Date7) {
		this.week3Date7 = week3Date7;
	}

	public String getWeek3Date8() {
		return week3Date8;
	}

	public void setWeek3Date8(String week3Date8) {
		this.week3Date8 = week3Date8;
	}

	public String getWeek3Date9() {
		return week3Date9;
	}

	public void setWeek3Date9(String week3Date9) {
		this.week3Date9 = week3Date9;
	}

	public String getWeek3Date10() {
		return week3Date10;
	}

	public void setWeek3Date10(String week3Date10) {
		this.week3Date10 = week3Date10;
	}

	public String getWeek4Date1() {
		return week4Date1;
	}

	public void setWeek4Date1(String week4Date1) {
		this.week4Date1 = week4Date1;
	}

	public String getWeek4Date2() {
		return week4Date2;
	}

	public void setWeek4Date2(String week4Date2) {
		this.week4Date2 = week4Date2;
	}

	public String getWeek4Date3() {
		return week4Date3;
	}

	public void setWeek4Date3(String week4Date3) {
		this.week4Date3 = week4Date3;
	}

	public String getWeek4Date4() {
		return week4Date4;
	}

	public void setWeek4Date4(String week4Date4) {
		this.week4Date4 = week4Date4;
	}

	public String getWeek4Date5() {
		return week4Date5;
	}

	public void setWeek4Date5(String week4Date5) {
		this.week4Date5 = week4Date5;
	}

	public String getWeek4Date6() {
		return week4Date6;
	}

	public void setWeek4Date6(String week4Date6) {
		this.week4Date6 = week4Date6;
	}

	public String getWeek4Date7() {
		return week4Date7;
	}

	public void setWeek4Date7(String week4Date7) {
		this.week4Date7 = week4Date7;
	}

	public String getWeek4Date8() {
		return week4Date8;
	}

	public void setWeek4Date8(String week4Date8) {
		this.week4Date8 = week4Date8;
	}

	public String getWeek4Date9() {
		return week4Date9;
	}

	public void setWeek4Date9(String week4Date9) {
		this.week4Date9 = week4Date9;
	}

	public String getWeek4Date10() {
		return week4Date10;
	}

	public void setWeek4Date10(String week4Date10) {
		this.week4Date10 = week4Date10;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}

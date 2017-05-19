package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MonthlyVitalSheetFormRow")
public class MonthlyVitalSheetFormRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7315245924321710497L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formSerial")
	private int formSerial;
	@Column(name = "rowSerial")
	private int rowSerial;
	@Column(name = "month")
	private String month;
	@Column(name = "bp")
	private String bp;
	@Column(name = "p")
	private String p;
	@Column(name = "r")
	private String r;
	@Column(name = "temp")
	private String temp;
	@Column(name = "weight")
	private String weight;
	@Column(name = "w1")
	private String w1;
	@Column(name = "w2")
	private String w2;
	@Column(name = "w3")
	private String w3;
	@Column(name = "w4")
	private String w4;
	@Column(name = "date1")
	private Date date1;
	@Column(name = "date2")
	private Date date2;
	@Column(name = "date3")
	private Date date3;
	@Column(name = "date4")
	private Date date4;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormSerial() {
		return formSerial;
	}

	public void setFormSerial(int formSerial) {
		this.formSerial = formSerial;
	}

	public int getRowSerial() {
		return rowSerial;
	}

	public void setRowSerial(int rowSerial) {
		this.rowSerial = rowSerial;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getW1() {
		return w1;
	}

	public void setW1(String w1) {
		this.w1 = w1;
	}

	public String getW2() {
		return w2;
	}

	public void setW2(String w2) {
		this.w2 = w2;
	}

	public String getW3() {
		return w3;
	}

	public void setW3(String w3) {
		this.w3 = w3;
	}

	public String getW4() {
		return w4;
	}

	public void setW4(String w4) {
		this.w4 = w4;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public Date getDate3() {
		return date3;
	}

	public void setDate3(Date date3) {
		this.date3 = date3;
	}

	public Date getDate4() {
		return date4;
	}

	public void setDate4(Date date4) {
		this.date4 = date4;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}

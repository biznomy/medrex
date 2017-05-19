package medrex.commons.vo.dietary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DietPlanByDate")
public class DietPlanByDate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6989372520006107191L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "dietDate")
	private Date dietDate;
	@Column(name = "breakfast")
	private String breakfast;
	@Column(name = "lunch")
	private String lunch;
	@Column(name = "dinner")
	private String dinner;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getDietDate() {
		return dietDate;
	}

	public void setDietDate(Date dietDate) {
		this.dietDate = dietDate;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

}

package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DietPlan")
public class DietPlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3238276667845697137L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "dietName")
	private String dietName;
	@Column(name = "dietType")
	private String dietType;
	@Column(name = "liquidsQuery")
	private String liquidsQuery;
	@Column(name = "cerealsQuery")
	private String cerealsQuery;
	@Column(name = "vegetablesQuery")
	private String vegetablesQuery;
	@Column(name = "mainQuery")
	private String mainQuery;
	@Column(name = "desertQuery")
	private String desertQuery;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDietName() {
		return dietName;
	}

	public void setDietName(String dietName) {
		this.dietName = dietName;
	}

	public String getDietType() {
		return dietType;
	}

	public void setDietType(String dietType) {
		this.dietType = dietType;
	}

	public String getLiquidsQuery() {
		return liquidsQuery;
	}

	public void setLiquidsQuery(String liquidsQuery) {
		this.liquidsQuery = liquidsQuery;
	}

	public String getCerealsQuery() {
		return cerealsQuery;
	}

	public void setCerealsQuery(String cerealsQuery) {
		this.cerealsQuery = cerealsQuery;
	}

	public String getVegetablesQuery() {
		return vegetablesQuery;
	}

	public void setVegetablesQuery(String vegetablesQuery) {
		this.vegetablesQuery = vegetablesQuery;
	}

	public String getMainQuery() {
		return mainQuery;
	}

	public void setMainQuery(String mainQuery) {
		this.mainQuery = mainQuery;
	}

	public String getDesertQuery() {
		return desertQuery;
	}

	public void setDesertQuery(String desertQuery) {
		this.desertQuery = desertQuery;
	}
}

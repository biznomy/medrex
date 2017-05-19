package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MasterSchedule")
public class MasterSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3217333795481409147L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "userID")
	private int userID;

	@Column(name = "week1Sunday")
	private String week1Sunday;
	@Column(name = "week1Monday")
	private String week1Monday;
	@Column(name = "week1Tuesday")
	private String week1Tuesday;
	@Column(name = "week1wednesday")
	private String week1wednesday;
	@Column(name = "week1Thrusday")
	private String week1Thrusday;
	@Column(name = "week1Friday")
	private String week1Friday;
	@Column(name = "week1Saturday")
	private String week1Saturday;

	@Column(name = "week2Sunday")
	private String week2Sunday;
	@Column(name = "week2Monday")
	private String week2Monday;
	@Column(name = "week2Tuesday")
	private String week2Tuesday;
	@Column(name = "week2wednesday")
	private String week2wednesday;
	@Column(name = "week2Thrusday")
	private String week2Thrusday;
	@Column(name = "week2Friday")
	private String week2Friday;
	@Column(name = "week2Saturday")
	private String week2Saturday;

	@Column(name = "week3Sunday")
	private String week3Sunday;
	@Column(name = "week3Monday")
	private String week3Monday;
	@Column(name = "week3Tuesday")
	private String week3Tuesday;
	@Column(name = "week3wednesday")
	private String week3wednesday;
	@Column(name = "week3Thrusday")
	private String week3Thrusday;
	@Column(name = "week3Friday")
	private String week3Friday;
	@Column(name = "week3Saturday")
	private String week3Saturday;

	@Column(name = "week4Sunday")
	private String week4Sunday;
	@Column(name = "week4Monday")
	private String week4Monday;
	@Column(name = "week4Tuesday")
	private String week4Tuesday;
	@Column(name = "week4wednesday")
	private String week4wednesday;
	@Column(name = "week4Thrusday")
	private String week4Thrusday;
	@Column(name = "week4Friday")
	private String week4Friday;
	@Column(name = "week4Saturday")
	private String week4Saturday;

	@Column(name = "week5Sunday")
	private String week5Sunday;
	@Column(name = "week5Monday")
	private String week5Monday;
	@Column(name = "week5Tuesday")
	private String week5Tuesday;
	@Column(name = "week5wednesday")
	private String week5wednesday;
	@Column(name = "week5Thrusday")
	private String week5Thrusday;
	@Column(name = "week5Friday")
	private String week5Friday;
	@Column(name = "week5Saturday")
	private String week5Saturday;

	public int getSerial() {
		return serial;
	}

	public int getUserID() {
		return userID;
	}

	public String getWeek1Sunday() {
		return week1Sunday;
	}

	public String getWeek1Monday() {
		return week1Monday;
	}

	public String getWeek1Tuesday() {
		return week1Tuesday;
	}

	public String getWeek1wednesday() {
		return week1wednesday;
	}

	public String getWeek1Thrusday() {
		return week1Thrusday;
	}

	public String getWeek1Friday() {
		return week1Friday;
	}

	public String getWeek1Saturday() {
		return week1Saturday;
	}

	public String getWeek2Sunday() {
		return week2Sunday;
	}

	public String getWeek2Monday() {
		return week2Monday;
	}

	public String getWeek2Tuesday() {
		return week2Tuesday;
	}

	public String getWeek2wednesday() {
		return week2wednesday;
	}

	public String getWeek2Thrusday() {
		return week2Thrusday;
	}

	public String getWeek2Friday() {
		return week2Friday;
	}

	public String getWeek2Saturday() {
		return week2Saturday;
	}

	public String getWeek3Sunday() {
		return week3Sunday;
	}

	public String getWeek3Monday() {
		return week3Monday;
	}

	public String getWeek3Tuesday() {
		return week3Tuesday;
	}

	public String getWeek3wednesday() {
		return week3wednesday;
	}

	public String getWeek3Thrusday() {
		return week3Thrusday;
	}

	public String getWeek3Friday() {
		return week3Friday;
	}

	public String getWeek3Saturday() {
		return week3Saturday;
	}

	public String getWeek4Sunday() {
		return week4Sunday;
	}

	public String getWeek4Monday() {
		return week4Monday;
	}

	public String getWeek4Tuesday() {
		return week4Tuesday;
	}

	public String getWeek4wednesday() {
		return week4wednesday;
	}

	public String getWeek4Thrusday() {
		return week4Thrusday;
	}

	public String getWeek4Friday() {
		return week4Friday;
	}

	public String getWeek4Saturday() {
		return week4Saturday;
	}

	public String getWeek5Sunday() {
		return week5Sunday;
	}

	public String getWeek5Monday() {
		return week5Monday;
	}

	public String getWeek5Tuesday() {
		return week5Tuesday;
	}

	public String getWeek5wednesday() {
		return week5wednesday;
	}

	public String getWeek5Thrusday() {
		return week5Thrusday;
	}

	public String getWeek5Friday() {
		return week5Friday;
	}

	public String getWeek5Saturday() {
		return week5Saturday;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setWeek1Sunday(String week1Sunday) {
		this.week1Sunday = week1Sunday;
	}

	public void setWeek1Monday(String week1Monday) {
		this.week1Monday = week1Monday;
	}

	public void setWeek1Tuesday(String week1Tuesday) {
		this.week1Tuesday = week1Tuesday;
	}

	public void setWeek1wednesday(String week1wednesday) {
		this.week1wednesday = week1wednesday;
	}

	public void setWeek1Thrusday(String week1Thrusday) {
		this.week1Thrusday = week1Thrusday;
	}

	public void setWeek1Friday(String week1Friday) {
		this.week1Friday = week1Friday;
	}

	public void setWeek1Saturday(String week1Saturday) {
		this.week1Saturday = week1Saturday;
	}

	public void setWeek2Sunday(String week2Sunday) {
		this.week2Sunday = week2Sunday;
	}

	public void setWeek2Monday(String week2Monday) {
		this.week2Monday = week2Monday;
	}

	public void setWeek2Tuesday(String week2Tuesday) {
		this.week2Tuesday = week2Tuesday;
	}

	public void setWeek2wednesday(String week2wednesday) {
		this.week2wednesday = week2wednesday;
	}

	public void setWeek2Thrusday(String week2Thrusday) {
		this.week2Thrusday = week2Thrusday;
	}

	public void setWeek2Friday(String week2Friday) {
		this.week2Friday = week2Friday;
	}

	public void setWeek2Saturday(String week2Saturday) {
		this.week2Saturday = week2Saturday;
	}

	public void setWeek3Sunday(String week3Sunday) {
		this.week3Sunday = week3Sunday;
	}

	public void setWeek3Monday(String week3Monday) {
		this.week3Monday = week3Monday;
	}

	public void setWeek3Tuesday(String week3Tuesday) {
		this.week3Tuesday = week3Tuesday;
	}

	public void setWeek3wednesday(String week3wednesday) {
		this.week3wednesday = week3wednesday;
	}

	public void setWeek3Thrusday(String week3Thrusday) {
		this.week3Thrusday = week3Thrusday;
	}

	public void setWeek3Friday(String week3Friday) {
		this.week3Friday = week3Friday;
	}

	public void setWeek3Saturday(String week3Saturday) {
		this.week3Saturday = week3Saturday;
	}

	public void setWeek4Sunday(String week4Sunday) {
		this.week4Sunday = week4Sunday;
	}

	public void setWeek4Monday(String week4Monday) {
		this.week4Monday = week4Monday;
	}

	public void setWeek4Tuesday(String week4Tuesday) {
		this.week4Tuesday = week4Tuesday;
	}

	public void setWeek4wednesday(String week4wednesday) {
		this.week4wednesday = week4wednesday;
	}

	public void setWeek4Thrusday(String week4Thrusday) {
		this.week4Thrusday = week4Thrusday;
	}

	public void setWeek4Friday(String week4Friday) {
		this.week4Friday = week4Friday;
	}

	public void setWeek4Saturday(String week4Saturday) {
		this.week4Saturday = week4Saturday;
	}

	public void setWeek5Sunday(String week5Sunday) {
		this.week5Sunday = week5Sunday;
	}

	public void setWeek5Monday(String week5Monday) {
		this.week5Monday = week5Monday;
	}

	public void setWeek5Tuesday(String week5Tuesday) {
		this.week5Tuesday = week5Tuesday;
	}

	public void setWeek5wednesday(String week5wednesday) {
		this.week5wednesday = week5wednesday;
	}

	public void setWeek5Thrusday(String week5Thrusday) {
		this.week5Thrusday = week5Thrusday;
	}

	public void setWeek5Friday(String week5Friday) {
		this.week5Friday = week5Friday;
	}

	public void setWeek5Saturday(String week5Saturday) {
		this.week5Saturday = week5Saturday;
	}

	public String getShiftByDate(int date) {
		switch (date) {
		/*
		 * case 1: return week1Sunday; case 2: return week1Monday; case 3:
		 * return week1Tuesday; case 4: return week1wednesday; case 5: return
		 * week1Thrusday; case 6: return week1Friday; case 7: return
		 * week1Saturday;
		 * 
		 * case 8: return week2Sunday; case 9: return week2Monday; case 10:
		 * return week2Tuesday; case 11: return week2wednesday; case 12: return
		 * week2Thrusday; case 13: return week2Friday; case 14: return
		 * week2Saturday;
		 * 
		 * case 15: return week3Sunday; case 16: return week3Monday; case 17:
		 * return week3Tuesday; case 18: return week3wednesday; case 19: return
		 * week3Thrusday; case 20: return week3Friday; case 21: return
		 * week3Saturday;
		 * 
		 * case 22: return week4Sunday; case 23: return week4Monday; case 24:
		 * return week4Tuesday; case 25: return week4wednesday; case 26: return
		 * week4Thrusday; case 27: return week4Friday; case 28: return
		 * week4Saturday;
		 */

		case 0:
			return week1Sunday;
		case 1:
			return week1Monday;
		case 2:
			return week1Tuesday;
		case 3:
			return week1wednesday;
		case 4:
			return week1Thrusday;
		case 5:
			return week1Friday;
		case 6:
			return week1Saturday;

		case 7:
			return week2Sunday;
		case 8:
			return week2Monday;
		case 9:
			return week2Tuesday;
		case 10:
			return week2wednesday;
		case 11:
			return week2Thrusday;
		case 12:
			return week2Friday;
		case 13:
			return week2Saturday;

		case 14:
			return week3Sunday;
		case 15:
			return week3Monday;
		case 16:
			return week3Tuesday;
		case 17:
			return week3wednesday;
		case 18:
			return week3Thrusday;
		case 19:
			return week3Friday;
		case 20:
			return week3Saturday;

		case 21:
			return week4Sunday;
		case 22:
			return week4Monday;
		case 23:
			return week4Tuesday;
		case 24:
			return week4wednesday;
		case 25:
			return week4Thrusday;
		case 26:
			return week4Friday;
		case 27:
			return week4Saturday;

		}
		return null;
	}

	public String getShift(int weekDay, int dayOfWeek) {
		if (weekDay == 1 && dayOfWeek == 1) {
			return week1Sunday;
		} else if (weekDay == 1 && dayOfWeek == 2) {
			return week1Monday;

		} else if (weekDay == 1 && dayOfWeek == 3) {
			return week1Tuesday;

		} else if (weekDay == 1 && dayOfWeek == 4) {
			return week1wednesday;

		} else if (weekDay == 1 && dayOfWeek == 5) {
			return week1Thrusday;

		} else if (weekDay == 1 && dayOfWeek == 6) {
			return week1Friday;

		} else if (weekDay == 1 && dayOfWeek == 7) {
			return week1Saturday;

		} else if (weekDay == 2 && dayOfWeek == 1) {
			return week2Sunday;
		} else if (weekDay == 2 && dayOfWeek == 2) {
			return week2Monday;

		} else if (weekDay == 2 && dayOfWeek == 3) {
			return week2Tuesday;

		} else if (weekDay == 2 && dayOfWeek == 4) {
			return week2wednesday;

		} else if (weekDay == 2 && dayOfWeek == 5) {
			return week2Thrusday;

		} else if (weekDay == 2 && dayOfWeek == 6) {
			return week2Friday;

		} else if (weekDay == 2 && dayOfWeek == 7) {
			return week2Saturday;

		} else if (weekDay == 3 && dayOfWeek == 1) {
			return week3Sunday;
		} else if (weekDay == 3 && dayOfWeek == 2) {
			return week3Monday;

		} else if (weekDay == 3 && dayOfWeek == 3) {
			return week3Tuesday;

		} else if (weekDay == 3 && dayOfWeek == 4) {
			return week3wednesday;

		} else if (weekDay == 3 && dayOfWeek == 5) {
			return week3Thrusday;

		} else if (weekDay == 3 && dayOfWeek == 6) {
			return week3Friday;

		} else if (weekDay == 3 && dayOfWeek == 7) {
			return week3Saturday;

		} else if (weekDay == 4 && dayOfWeek == 1) {
			return week4Sunday;
		} else if (weekDay == 4 && dayOfWeek == 2) {
			return week4Monday;

		} else if (weekDay == 4 && dayOfWeek == 3) {
			return week4Tuesday;

		} else if (weekDay == 4 && dayOfWeek == 4) {
			return week4wednesday;

		} else if (weekDay == 4 && dayOfWeek == 5) {
			return week4Thrusday;

		} else if (weekDay == 4 && dayOfWeek == 6) {
			return week4Friday;

		} else if (weekDay == 4 && dayOfWeek == 7) {
			return week4Saturday;

		} else if (weekDay == 5 && dayOfWeek == 1) {
			return week5Sunday;
		} else if (weekDay == 5 && dayOfWeek == 2) {
			return week5Monday;

		} else if (weekDay == 5 && dayOfWeek == 3) {
			return week5Tuesday;

		} else if (weekDay == 5 && dayOfWeek == 4) {
			return week5wednesday;

		} else if (weekDay == 5 && dayOfWeek == 5) {
			return week5Thrusday;

		} else if (weekDay == 5 && dayOfWeek == 6) {
			return week5Friday;

		} else if (weekDay == 5 && dayOfWeek == 7) {
			return week5Saturday;

		}
		return null;
	}

}

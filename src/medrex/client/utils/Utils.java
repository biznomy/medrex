package medrex.client.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.ImageIcon;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.resident.ResidentMain;

public class Utils {
	private static final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;

	public static int DateDifference(Date after, Date before) {
		return (int) ((after.getTime() - before.getTime()) / MILLSECS_PER_DAY);
	}

	// hh:mm a
	public static Date getTimeStringToDate(String str) {
		if (str.length() == 8) {
			Date dateRef = MedrexClientManager.getServerTime();
			int hrs = Integer.parseInt(str.substring(0, 2));
			if (hrs == 12) {
				hrs = 0;
			}
			if (str.charAt(6) == 'P') {
				hrs += 12;
			}
			dateRef.setHours(hrs);
			dateRef.setMinutes((Integer.parseInt(str.substring(3, 5))));
			dateRef.setSeconds(0);
			return dateRef;
		}
		return null;
	}

	public static List<Date> datesBetween(Date from, Date to) {
		int diff = DateDifference(to, from);
		List<Date> dates = new ArrayList<Date>();
		for (int i = 0; i < diff; i++) {
			Date newDate = new Date(from.getTime() + (i * MILLSECS_PER_DAY));
			dates.add(newDate);
		}
		return dates;
	}

	public static String medrexDateFormat(Date date) {
		String strDate = null;
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				strDate = sdf.format(date);
			} catch (Exception ex) {

			}
		} else {
			throw new IllegalArgumentException("date can't be null");
		}
		return strDate;
	}

	public static Date addDays(Date date, int daysToBeAdded) {
		if (date != null) {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setGregorianChange(date);
			cal.add(Calendar.DATE, daysToBeAdded);
			return cal.getTime();
		} else {
			throw new IllegalArgumentException("date parameter can't be null");
		}
	}

	public static int getMaxDaysInMonth(Date date) {
		switch (date.getMonth() + 1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(date.getYear()) ? 29 : 28;
		default:
			return 0;
		}
	}

	public static int getIntVal(Object obj) {
		try {
			return (new Integer((String) obj).intValue());
		} catch (Exception e) {
			return 0;
		}
	}

	public static BufferedImage getBufferedImageFromImageicon(ImageIcon a) {
		Image img = a.getImage();
		BufferedImage bfimg = null;
		bfimg = new BufferedImage(img.getWidth(null), img.getHeight(null),
				BufferedImage.TYPE_INT_RGB);
		bfimg.getGraphics().drawImage(img, 0, 0, null);
		return bfimg;

	}

	public static boolean isLeapYear(int year) {
		return (new GregorianCalendar()).isLeapYear(year);

	}

	public static int getResidentAgeYear() {

		ResidentMain rm = new ResidentMain();
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int dateEntered = (rm.getDob().getYear());
		int todayDate = (MedrexClientManager.getServerTime().getYear());

		int noOfYears = todayDate - dateEntered;

		return (noOfYears);

		// txtAge.setText(noOfYears + "");

	}

	public static int getResidentAgeMonth() {

		ResidentMain rm = new ResidentMain();
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int dateEntered = (rm.getDob().getMonth());
		int todayDate = (MedrexClientManager.getServerTime().getMonth());

		int noOfmonths = todayDate - dateEntered;

		return (noOfmonths);

		// txtAge.setText(noOfYears + "");

	}

	public static int getResidentAgeDays() {

		ResidentMain rm = new ResidentMain();
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int dateEntered = (rm.getDob().getDay());
		int todayDate = (MedrexClientManager.getServerTime().getDay());

		int noOfdays = todayDate - dateEntered;

		return (noOfdays);

		// txtAge.setText(noOfYears + "");

	}

	public static int convertInt(String str) {
		if (str == null) {
			str = "0";
		}
		if (str.equalsIgnoreCase("")) {
			str = "0";
		}

		return (Integer.parseInt(str));
	}
}
